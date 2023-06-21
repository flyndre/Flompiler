package de.flyndre.flompiler.bytecodegenerator;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.typecheker.utils.Expr;
import de.flyndre.flompiler.typecheker.utils.ExprType;
import de.flyndre.flompiler.typecheker.utils.LocalVar;
import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BytecodeGenerator {
    private static HashMap<String, String> classFields = new HashMap<>();//key string is the field name, second string is the field type
    private static String type;//name of the class => type of the this-object

    /**
     * generates the Bytecode for the given AST and writes it to a file
     * @param program the AST to be converted
     * @param outputFile the file where to write the bytecode to
     */
    public static void generateByteCode(Program program, File outputFile){
        ArrayList<Class> classes = (ArrayList<Class>) program.classes;

        for(int i=0; i< classes.size();i++){
            Class thisClass = classes.get(i);
            classFields = new HashMap<>();
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);

            //get class visibility
            int visibility = Opcodes.ACC_PUBLIC;
            switch(thisClass.access.toLowerCase()){
                case "public":
                    visibility = Opcodes.ACC_PUBLIC;
                    break;
                case "private":
                    visibility = Opcodes.ACC_PRIVATE;
                    break;
                default:
                    break;
            }

            cw.visit(Opcodes.V1_8,visibility, thisClass.name, null, "java/lang/Object", null);
            type = thisClass.name;

            //generate fields
            cw = generateByteCodeFields(cw, thisClass.fields);

            //generate constructors
            cw = generateByteCodeForConstructors(cw, thisClass.methods, thisClass.fields);

            //generate methods
            cw = generateByteCodeForMethods(cw, thisClass.methods);
            cw.visitEnd();


            //print code
            byte[] b = cw.toByteArray();

            try {
                FileOutputStream f = new FileOutputStream(outputFile);
                f.write(b);
                f.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    /**
     * generates the bytecode for a list of fields
     * @param cw the classwriter to generate the fields with
     * @param fields the fields to be converted
     * @return the classwriter object
     */
    private static ClassWriter generateByteCodeFields(ClassWriter cw, List<Field> fields){
        for(int i = 0;i<fields.size();i++){
            Field thisField = fields.get(i);

            //get field visibility
            int visibility = Opcodes.ACC_PUBLIC;
            switch(thisField.access.toLowerCase()){
                case "public":
                    visibility = Opcodes.ACC_PUBLIC;
                    break;
                case "private":
                    visibility = Opcodes.ACC_PRIVATE;
                    break;
                default:
                    break;
            }

            //get field type
            String type = "";
            switch(thisField.type.toLowerCase()){
                case "int":
                    type = "I";
                    break;
                case "boolean":
                    type = "Z";
                    break;
                case "char":
                    type = "C";
                    break;
                default:
                    type = "L" + thisField.type + ";";
                    break;
            }

            //save field in classFields
            classFields.put(thisField.name, thisField.type);

            FieldVisitor fv = cw.visitField(visibility, thisField.name, type, null, null);
            fv.visitEnd();
        }

        return cw;
    }

    /**
     * generates the bytecode for a list of methods
     * @param cw the classwriter to generate the methods with
     * @param methods list of methods to be converted, constructors will be ignored
     * @return the classwriter object
     */
    private static ClassWriter generateByteCodeForMethods(ClassWriter cw, List<Method> methods){
        //get all methods without constructors
        List<Method> methodsWithoutConstructors = new ArrayList<>();
        //hashmap of local variables
        HashMap<String, LocalVar> localVarScope = new HashMap<>();//key is the name of the variable, LocalVar contains type and save location

        for(int i=0;i<methods.size();i++){
            if(!methods.get(i).name.equals("<init>")){
                methodsWithoutConstructors.add(methods.get(i));
            }
        }

        //generate the bytecode for the methods
        for(int i=0;i<methodsWithoutConstructors.size();i++){
            Method thisMethod = methodsWithoutConstructors.get(i);
            localVarScope = new HashMap<>();
            localVarScope.put("this", new LocalVar(type, 0));//this-object

            //generate method descriptor
            ////generate the parameters
            List<Parameter> params = thisMethod.parameter;
            String parametersDescriptor = "";//if list is empty, empty method descriptor
            for(int a=0; a<params.size();a++){
                switch(params.get(a).type){
                    case "int":
                        parametersDescriptor = parametersDescriptor + "I";
                        break;
                    case "boolean":
                        parametersDescriptor = parametersDescriptor + "Z";
                        break;
                    case "char":
                        parametersDescriptor = parametersDescriptor + "C";
                        break;
                    default:
                        parametersDescriptor = parametersDescriptor + "L" + params.get(a).type + ";";
                        break;
                }
            }

            ////generate the return value descriptor
            String returnDescriptor = "";
            switch(thisMethod.type){
                case "int":
                    returnDescriptor = "I";
                    break;
                case "boolean":
                    returnDescriptor = "Z";
                    break;
                case "char":
                    returnDescriptor = "C";
                    break;
                case "void":
                    returnDescriptor = "V";
                    break;
                default:
                    returnDescriptor = "L" + thisMethod.type + ";";
                    break;
            }
            ////get the visibility of the method
            int visibility = Opcodes.ACC_PUBLIC;
            switch(thisMethod.access.toLowerCase()){
                case "public":
                    visibility = Opcodes.ACC_PUBLIC;
                    break;
                case "private":
                    visibility = Opcodes.ACC_PRIVATE;
                    break;
                default:
                    break;
            }

            ////generate the actual descriptor
            String descriptor = "(" + parametersDescriptor + ")" + returnDescriptor;
            MethodVisitor mv = cw.visitMethod(visibility, thisMethod.name, descriptor, null, null);
            mv.visitCode();

            //save all params to local variables
            for(int a = 0; a<thisMethod.parameter.size();a++){
                Parameter parameter = thisMethod.parameter.get(a);
                localVarScope.put(parameter.name, new LocalVar(parameter.type, localVarScope.size()));
            }

            //Aufruf des normalen generateByteCodeForStatements
            mv = generateByteCodeForStatements(mv, thisMethod.statement, localVarScope);

            if(thisMethod.type.equals("void")){//hier nur return, wenn method rückgabewert void hat, ansonsten wird der return in der expression behandelt
                mv.visitInsn(Opcodes.RETURN);
            }

            mv.visitMaxs(0,0);
            mv.visitEnd();
        }

        return cw;
    }

    /**
     * generates the bytecode for a list of constructors
     * @param cw the classwriter to generate the constructors for
     * @param methods list of methods, only constructors will be converted
     * @param fields list of fields to get the standard values from, will be initialised in constructors
     * @return the classweiter object
     */
    private static ClassWriter generateByteCodeForConstructors(ClassWriter cw, List<Method> methods, List<Field> fields){
        //hashmap of local variables
        HashMap<String, LocalVar> localVarScope = new HashMap<>();//key is the name of the variable, LocalVar contains type and save location

        //get all fields with default values
        List<Field> defaultFields = new ArrayList<>();
        for(int i=0;i<fields.size();i++){
            if(!fields.get(i).standardValue.equals(null)){
                defaultFields.add(fields.get(i));
            }
        }

        //get all constructors out of the methods
        List<Method> constructors = new ArrayList<>();
        for(int i=0;i<methods.size();i++){
            if(methods.get(i).name.equals("<init>")){
                constructors.add(methods.get(i));
            }
        }

        //generate the bytecode for the constructors
        for(int i=0;i<constructors.size();i++){
            Method thisConstructor = constructors.get(i);
            localVarScope = new HashMap<>();
            localVarScope.put("this", new LocalVar(type, 0));//this-object

            //generate constructor method descriptor
            ////generate the parameters
            List<Parameter> params = thisConstructor.parameter;
            String parametersDescriptor = "";//if list is empty, empty method descriptor
            for(int a=0; a<params.size();a++){
                switch(params.get(a).type){
                    case "int":
                        parametersDescriptor = parametersDescriptor + "I";
                        break;
                    case "boolean":
                        parametersDescriptor = parametersDescriptor + "Z";
                        break;
                    case "char":
                        parametersDescriptor = parametersDescriptor + "C";
                        break;
                    default:
                        parametersDescriptor = parametersDescriptor + "L" + params.get(a).type + ";";
                        break;
                }
            }

            ////generate the return value descriptor
            String returnDescriptor = "";
            switch(thisConstructor.type){
                case "int":
                    returnDescriptor = "I";
                    break;
                case "boolean":
                    returnDescriptor = "Z";
                    break;
                case "char":
                    returnDescriptor = "C";
                    break;
                case "void":
                    returnDescriptor = "V";
                    break;
                default:
                    returnDescriptor = "L" + thisConstructor.type + ";";
                    break;
            }
            ////generate the actual descriptor
            String descriptor = "(" + parametersDescriptor + ")" + returnDescriptor;
            MethodVisitor consMeth = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", descriptor, null, null);
            consMeth.visitCode();
            //hier kommt der code für initialisierung im Kontruktor
            consMeth.visitVarInsn(Opcodes.ALOAD, 0);
            consMeth.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

            for(int a=0; a<defaultFields.size();a++){
                consMeth.visitVarInsn(Opcodes.ALOAD,0);

                switch (defaultFields.get(a).type){
                    case "int":
                        consMeth.visitLdcInsn(Integer.valueOf(defaultFields.get(a).standardValue));
                        consMeth.visitFieldInsn(Opcodes.PUTFIELD, type, defaultFields.get(a).name, "I");
                        break;
                    case "boolean":
                        if(defaultFields.get(a).standardValue == "true"){
                            consMeth.visitInsn(Opcodes.ICONST_1);
                        }else{
                            consMeth.visitInsn(Opcodes.ICONST_0);
                        }
                        consMeth.visitFieldInsn(Opcodes.PUTFIELD, type, defaultFields.get(a).name, "Z");
                        break;
                    case "char":
                        int charToInt = Character.getNumericValue(defaultFields.get(a).standardValue.charAt(0));
                        consMeth.visitLdcInsn(Integer.valueOf(charToInt));
                        consMeth.visitFieldInsn(Opcodes.PUTFIELD, type, defaultFields.get(a).name, "C");
                        break;
                    default:
                        /*HashMap<String, LocalVar> scope = new HashMap<>();
                        New n = new New();
                        n.type = defaultFields.get(a).type;
                        n.constructorParams = defaultFields.get(a).
                        Expr e = generateByteCodeForNewExpr(consMeth, n, scope);
                        consMeth.visitFieldInsn(Opcodes.PUTFIELD, type, defaultFields.get(a).name, defaultFields.get(a).type);*/
                }
            }

            //save all params to local variables
            for(int a = 0; a<thisConstructor.parameter.size();a++){
                Parameter parameter = thisConstructor.parameter.get(a);
                localVarScope.put(parameter.name, new LocalVar(parameter.type, localVarScope.size()));
            }

            //Aufruf des normalen generateByteCodeForStatements
            consMeth = generateByteCodeForStatements(consMeth, thisConstructor.statement, localVarScope);

            consMeth.visitInsn(Opcodes.RETURN);
            consMeth.visitMaxs(0,0);
            consMeth.visitEnd();
        }
        return cw;
    }

    /**
     * generates recursively the bytecode for the given statement
     * @param mv the methodvisitor to generate the bytecode with
     * @param statement the statement to be converted
     * @param localVarScope the scope of local variables of the method
     * @return the methodvisitor object
     */
    private static MethodVisitor generateByteCodeForStatements(MethodVisitor mv, Statement statement, HashMap<String, LocalVar> localVarScope) {
        if(statement instanceof Return r){
            generateByteCodeForReturnStatement(mv, r, localVarScope);
        }else if(statement instanceof Block b){
            generateByteCodeForBlockStatement(mv, b, localVarScope);
        }else if(statement instanceof While w){
            generateByteCodeForWhileStatement(mv, w, localVarScope);
        }else if(statement instanceof If i){
            generateByteCodeForIfStatement(mv, i, localVarScope);
        }else if(statement instanceof LocalVarDecl){
            localVarScope.put(((LocalVarDecl) statement).name, new LocalVar(statement.type, -1));
        }else if(statement instanceof StatementExprStatement ses){
            StatementExpression se = ses.statementExpression;

            if(se instanceof MethodCall mc){
                List<Expr> methodExpressions = new ArrayList<>();
                String methodDescriptor = "";

                //calculate all expressions which are needed for the parameters of the method
                for(int i = 0; i<mc.expressions.size();i++){
                    Expr expression = generateByteCodeForExpressions(mv, mc.expressions.get(i), localVarScope);
                    methodExpressions.add(expression);
                }
                //load the this object
                mv.visitVarInsn(Opcodes.ALOAD, 0);
                //load all values needed for the parameters of the method
                for(int i = 0;i<methodExpressions.size(); i++){
                    Expr exprParam = methodExpressions.get(i);

                    if(exprParam.type == ExprType.LocalVar){
                        switch(localVarScope.get(exprParam.name).type){
                            case "int":
                                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                                methodDescriptor += "I";
                                break;
                            case "boolean":
                                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                                methodDescriptor += "Z";
                                break;
                            case "char":
                                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                                methodDescriptor += "C";
                                break;
                            default:
                                mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(exprParam.name).location);
                                methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                        }

                    }else{
                        mv.visitVarInsn(Opcodes.ALOAD, 0);

                        switch (classFields.get(exprParam.name)){
                            case "int":
                                mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "I");
                                methodDescriptor += "I";
                                break;
                            case "boolean":
                                mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "Z");
                                methodDescriptor += "Z";
                                break;
                            case "char":
                                mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "C");
                                methodDescriptor += "C";
                                break;
                            default:
                                mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, classFields.get(exprParam.name));
                                methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                        }
                    }
                }
                //calculate method descriptor
                methodDescriptor = "(" + methodDescriptor + ")";
                switch(mc.type){
                    case "int":
                        methodDescriptor = methodDescriptor + "I";
                        break;
                    case "boolean":
                        methodDescriptor = methodDescriptor + "Z";
                        break;
                    case "char":
                        methodDescriptor = methodDescriptor + "C";
                        break;
                    case "void":
                        methodDescriptor = methodDescriptor + "V";
                        break;
                    default:
                        methodDescriptor = methodDescriptor + "L" + mc.type + ";";
                }
                //call method
                mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, type, mc.name, methodDescriptor, false);
                //discard return value if return type not "void"
                if(!mc.type.equals("void")){
                    mv.visitInsn(Opcodes.POP);
                }
            }else if(se instanceof Assign assign){
                //generate code for expression calculation
                Expr expression = generateByteCodeForExpressions(mv, assign.expression, localVarScope);

                //load the value of the generated expression
                if(expression.type == ExprType.LocalVar){
                    switch(localVarScope.get(expression.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(expression.name).location);
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(expression.name).location);
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(expression.name).location);
                            break;
                        default:
                            mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(expression.name).location);
                    }
                }else{
                    switch(classFields.get(expression.name)){
                        case "int":
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, expression.name, "I");
                            break;
                        case "boolean":
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, expression.name, "Z");
                            break;
                        case "char":
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, expression.name, "C");
                            break;
                        default:
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, expression.name, classFields.get(expression.name));
                    }
                }

                //save the loaded value in the specified var or field
                boolean isLocalVar = localVarScope.containsKey(assign.var.name);

                if(isLocalVar){
                    if(localVarScope.get(assign.var.name).location == -1){
                        localVarScope.get(assign.var.name).location = localVarScope.size();
                    }

                    switch(localVarScope.get(assign.var.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(assign.var.name).location);
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(assign.var.name).location);
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(assign.var.name).location);
                            break;
                        default:
                            mv.visitVarInsn(Opcodes.ASTORE, localVarScope.get(assign.var.name).location);
                    }
                }else{
                    switch(classFields.get(assign.var.name)){
                        case "int":
                            mv.visitFieldInsn(Opcodes.PUTFIELD, type, assign.var.name, "I");
                            break;
                        case "boolean":
                            mv.visitFieldInsn(Opcodes.PUTFIELD, type, assign.var.name, "Z");
                            break;
                        case "char":
                            mv.visitFieldInsn(Opcodes.PUTFIELD, type, assign.var.name, "C");
                            break;
                        default:
                            mv.visitFieldInsn(Opcodes.PUTFIELD, type, assign.var.name, classFields.get(expression.name));
                    }
                }
            }else if(se instanceof Unary u){
                //generate code for unary expression
                Expr expression = generateByteCodeForExpressions(mv, u.expression, localVarScope);

                //load the expression value (only int possible in unary)
                if(expression.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(expression.name).location);
                }else{
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, expression.name, "I");
                }

                //execute the operator
                mv.visitInsn(Opcodes.ICONST_1);
                if(u.operator == "++"){
                    //inkrement the value
                    mv.visitInsn(Opcodes.IADD);
                }else{
                    //dekrement the value
                    mv.visitInsn(Opcodes.ISUB);
                }


                //save the value
                if(expression.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(expression.name).location);
                }else{
                    mv.visitFieldInsn(Opcodes.PUTFIELD, type, expression.name, "I");
                }
            }
        }

        return mv;
    }

    /**
     * generates the bytecode for return statements
     * @param mv the methodvisitor to generate the return statements with
     * @param statement the return statement to be converted
     * @param localVarScope the scope of local variables of the method
     */
    private static void generateByteCodeForReturnStatement(MethodVisitor mv, Return statement, HashMap<String, LocalVar> localVarScope){
        Expr ergebnisExpression = generateByteCodeForExpressions(mv, ((Return) statement).expression, localVarScope);

        if(ergebnisExpression.type == ExprType.LocalVar){
            switch(localVarScope.get(ergebnisExpression.name).type){
                case "int":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression.name).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "boolean":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression.name).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "char":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression.name).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                default:
                    mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(ergebnisExpression.name).location);
                    mv.visitInsn(Opcodes.ARETURN);
                    break;
            }
        }else{
            switch(classFields.get(ergebnisExpression.name)){
                case "int":
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, "I");
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "boolean":
                    mv.visitVarInsn(Opcodes.ALOAD,0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, "Z");
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "char":
                    mv.visitVarInsn(Opcodes.ALOAD,0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, "C");
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                default:
                    mv.visitVarInsn(Opcodes.ALOAD,0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, classFields.get(ergebnisExpression.name));// "L" and ";" already part of the name
                    mv.visitInsn(Opcodes.ARETURN);
                    break;
            }
        }
    }

    /**
     *
     * @param mv the methodvisitor to generate the block statements with
     * @param statement the block statement to be converted
     * @param localVarScope the scope of local variables of the method
     */
    private static void generateByteCodeForBlockStatement(MethodVisitor mv, Block statement, HashMap<String, LocalVar> localVarScope) {
        List<Statement> statementList = ((Block) statement).statements;

        for(int i=0;i<statementList.size();i++){
            generateByteCodeForStatements(mv, statementList.get(i), localVarScope);
        }
    }

    /**
     * @param mv the methodvisitor to generate the block statements with
     * @param statement
     * @param localVarScope
     */
    private static void generateByteCodeForWhileStatement(MethodVisitor mv, While statement, HashMap<String, LocalVar> localVarScope) {
        Label loop = new Label();
        Label end = new Label();

        mv.visitLabel(loop);
        Expr ergebnisExpression = generateByteCodeForExpressions(mv, ((While) statement).condition, localVarScope);

        if(ergebnisExpression.type == ExprType.LocalVar){
            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, end);

            mv = generateByteCodeForStatements(mv, ((While) statement).statement, localVarScope);

            mv.visitJumpInsn(Opcodes.GOTO, loop);

            mv.visitLabel(end);
        }else{
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, classFields.get(ergebnisExpression.name));
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, end);

            mv = generateByteCodeForStatements(mv, ((While) statement).statement, localVarScope);

            mv.visitJumpInsn(Opcodes.GOTO, loop);
            mv.visitLabel(end);
        }
    }

    private static void generateByteCodeForIfStatement(MethodVisitor mv, If statement, HashMap<String, LocalVar> localVarScope) {
        Label elseKeyWord = new Label();
        Label end = new Label();

        Expr ergebnisExpression = generateByteCodeForExpressions(mv, ((If) statement).condition, localVarScope);

        if(ergebnisExpression.type == ExprType.LocalVar) {
            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression.name).location);
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, elseKeyWord);

            mv = generateByteCodeForStatements(mv, ((If) statement).ifStatement, localVarScope);
            mv.visitJumpInsn(Opcodes.GOTO, end);

            mv.visitLabel(elseKeyWord);

            if(!(((If) statement).elseStatement == null)){
                mv = generateByteCodeForStatements(mv, ((If) statement).elseStatement, localVarScope);
            }

            mv.visitLabel(end);
        }else{
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitFieldInsn(Opcodes.GETFIELD, type, ergebnisExpression.name, classFields.get(ergebnisExpression.name));
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, elseKeyWord);

            mv = generateByteCodeForStatements(mv, ((If) statement).ifStatement, localVarScope);
            mv.visitJumpInsn(Opcodes.GOTO, end);

            mv.visitLabel(elseKeyWord);

            if(!(((If) statement).elseStatement == null)){
                mv = generateByteCodeForStatements(mv, ((If) statement).elseStatement, localVarScope);
            }

            mv.visitLabel(end);
        }
    }

    private static Expr generateByteCodeForExpressions(MethodVisitor mv, Expression expression, HashMap<String, LocalVar> localVarScope) {
        Expr variable = new Expr("", ExprType.LocalVar);//name of the variable in localVarScope which has been added in the expression

        if(expression instanceof IntConst i){
            variable = generateByteCodeForIntConst(mv, i, localVarScope);
        }else if(expression instanceof BooleanConst b){
            variable = generateByteCodeForBooleanConst(mv, b, localVarScope);
        }else if(expression instanceof CharConst c){
            variable = generateByteCodeForCharConst(mv, c, localVarScope);
        }else if(expression instanceof StringConst s){
            variable = generateByteCodeForStringConst(mv, s, localVarScope);
        }else if(expression instanceof LocalOrFieldVar l){
            variable = generateByteCodeForLocalOrFieldVar(mv, l, localVarScope);
        }else if(expression instanceof Binary b){
            variable = generateByteCodeForBinary(mv, b, localVarScope);
        }else if(expression instanceof StatemenExpressionExpression see)
            if(see.statementExpression instanceof MethodCall mc){
                variable = generateByteCodeForMethodCallExpr(mv, mc, localVarScope);
            }else if(see.statementExpression instanceof New n){
                variable = generateByteCodeForNewExpr(mv, n, localVarScope);
            }else if(see.statementExpression instanceof Unary u){
                variable = generateByteCodeForUnary(mv, u, localVarScope);
            }
        return variable;
    }

    private static Expr generateByteCodeForIntConst(MethodVisitor mv, IntConst expression, HashMap<String, LocalVar> localVarScope){
        mv.visitLdcInsn(Integer.valueOf(expression.value));//create new Integer Value
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());//save new Integer Value at the end of the list of local vars
        //add the int var to the localVarScope with a generated Name, because a constant has no name
        localVarScope.put("IntConst" + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));

        return new Expr("IntConst" + (localVarScope.size()-1), ExprType.LocalVar);
    }

    private static Expr generateByteCodeForBooleanConst(MethodVisitor mv, BooleanConst expression, HashMap<String, LocalVar> localVarScope){
        if(expression.value){
            mv.visitInsn(Opcodes.ICONST_1);
        }else{
            mv.visitInsn(Opcodes.ICONST_0);
        }
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());

        localVarScope.put("BooleanConst" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));

        return new Expr("BooleanConst" + (localVarScope.size()-1), ExprType.LocalVar);
    }

    private static Expr generateByteCodeForCharConst(MethodVisitor mv, CharConst expression, HashMap<String, LocalVar> localVarScope){
        int charToInt = Character.getNumericValue(expression.value);
        mv.visitLdcInsn(Integer.valueOf(charToInt));
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
        localVarScope.put("CharConst" + (localVarScope.size()), new LocalVar("char",(localVarScope.size())));

        return new Expr("CharConst" + (localVarScope.size()-1), ExprType.LocalVar);
    }

    private static Expr generateByteCodeForStringConst(MethodVisitor mv, StringConst expression, HashMap<String, LocalVar> localVarScope){
        mv.visitLdcInsn(expression.value);
        mv.visitVarInsn(Opcodes.ASTORE, localVarScope.size());
        localVarScope.put("StringConst" + (localVarScope.size()), new LocalVar("String", (localVarScope.size())));

        return new Expr("StringConst" + (localVarScope.size()-1), ExprType.LocalVar);
    }

    private static Expr generateByteCodeForLocalOrFieldVar(MethodVisitor mv, LocalOrFieldVar expression, HashMap<String, LocalVar> localVarScope) {
        if(classFields.containsKey(expression.name)){
            return new Expr(expression.name, ExprType.FieldVar);
        }else{
            if(localVarScope.get(expression.name).location != -1){
                return new Expr(expression.name, ExprType.LocalVar);
            }else{
                System.out.println("Local variable " + expression.name + " not initialised!");
            }
        }
        return new Expr("Error", ExprType.LocalVar);
    }

    private static Expr generateByteCodeForBinary(MethodVisitor mv, Binary expression, HashMap<String, LocalVar> localVarScope) {
        Expr right = generateByteCodeForExpressions(mv, expression.expressionRight, localVarScope);
        Expr left = generateByteCodeForExpressions(mv, expression.expressionLeft, localVarScope);

        switch(expression.operator){
            case "+":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }

                mv.visitInsn(Opcodes.IADD);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("IntAddition" + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));
                return new Expr("IntAddition" + (localVarScope.size()-1), ExprType.LocalVar);

            case "-":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }

                mv.visitInsn(Opcodes.ISUB);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("IntSubtraction" + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));
                return new Expr("IntSubtraction" + (localVarScope.size()-1), ExprType.LocalVar);

            case "*":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }

                mv.visitInsn(Opcodes.IMUL);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("IntMultiplication" + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));
                return new Expr("IntMultiplication" + (localVarScope.size()-1), ExprType.LocalVar);

            case "/":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }

                mv.visitInsn(Opcodes.IDIV);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("IntDivision" + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));
                return new Expr("IntDivision" + (localVarScope.size()-1), ExprType.LocalVar);

            case "==":
                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    switch(localVarScope.get(right.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "C");
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "Z");
                            break;
                    }
                }

                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    switch(localVarScope.get(left.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "C");
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "Z");
                            break;
                    }
                }
                Label secondEqual = new Label();
                Label endEqual = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPEQ, secondEqual);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endEqual);

                mv.visitLabel(secondEqual);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endEqual);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("EqualLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("EqualLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case "!=":
                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    switch(localVarScope.get(right.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "C");
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "Z");
                            break;
                    }
                }

                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    switch(localVarScope.get(left.name).type){
                        case "int":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                            break;
                        case "char":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "C");
                            break;
                        case "boolean":
                            mv.visitVarInsn(Opcodes.ALOAD, 0);
                            mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "Z");
                            break;
                    }
                }
                Label secondNotEqual = new Label();
                Label endNotEqual = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPNE, secondNotEqual);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endNotEqual);

                mv.visitLabel(secondNotEqual);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endNotEqual);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("EqualLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("EqualLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case "<":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }
                Label secondSmaller = new Label();
                Label endSmaller = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPLT, secondSmaller);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endSmaller);

                mv.visitLabel(secondSmaller);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endSmaller);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("SmallerLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("SmallerLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case "<=":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }
                Label secondSmallerEqual = new Label();
                Label endSmallerEqual = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPLE, secondSmallerEqual);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endSmallerEqual);

                mv.visitLabel(secondSmallerEqual);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endSmallerEqual);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("SmallerEqualLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("SmallerEqualLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case ">":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }
                Label secondGreater = new Label();
                Label endGreater = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPGT, secondGreater);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endGreater);

                mv.visitLabel(secondGreater);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endGreater);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("GreaterLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("GreaterLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case ">=":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "I");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "I");
                }
                Label secondGreaterEqual = new Label();
                Label endGreaterEqual = new Label();

                mv.visitJumpInsn(Opcodes.IF_ICMPGE, secondGreaterEqual);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, endGreaterEqual);

                mv.visitLabel(secondGreaterEqual);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(endGreaterEqual);

                mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size());
                localVarScope.put("GreaterEqualLeftRight" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("GreaterEqualLeftRight" + (localVarScope.size()-1), ExprType.LocalVar);
            case "&&":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "Z");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "Z");
                }
                mv.visitInsn(Opcodes.IAND);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("AndOperator" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("AndOperator" + (localVarScope.size()-1), ExprType.LocalVar);
            case "||":
                if(left.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(left.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, left.name, "Z");
                }

                if(right.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(right.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, right.name, "Z");
                }
                mv.visitInsn(Opcodes.IOR);
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("OrOperator" + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("OrOperator" + (localVarScope.size()-1), ExprType.LocalVar);
            default:
                return new Expr("AllesGingSchief" + "Hilfe", ExprType.LocalVar);
        }
    }

    private static Expr generateByteCodeForUnary(MethodVisitor mv, Unary expression, HashMap<String, LocalVar> localVarScope) {
        Expr only = generateByteCodeForExpressions(mv, expression.expression, localVarScope);

        switch(expression.operator){
            case "++":
                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(only.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, only.name, "I");
                }

                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitInsn(Opcodes.IADD);

                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(only.name).location);
                    only.name = "IncrementOperator" + localVarScope.get(only.name).location;
                    return only;
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.PUTFIELD, type, only.name, "I");
                    only.name = "IncrementOperatorField" + only.name;
                    return only;
                }
            case "--":
                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(only.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, only.name, "I");
                }

                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitInsn(Opcodes.ISUB);

                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(only.name).location);
                    only.name = "DecrementOperator" + localVarScope.get(only.name).location;
                    return only;
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.PUTFIELD, type, only.name, "I");
                    only.name = "DecrementOperatorField" + only.name;
                    return only;
                }
            case "!":
                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(only.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, only.name, "Z");
                }

                Label isZero = new Label();
                Label isOne = new Label();

                mv.visitJumpInsn(Opcodes.IFEQ, isZero);

                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitJumpInsn(Opcodes.GOTO, isOne);

                mv.visitLabel(isZero);
                mv.visitInsn(Opcodes.ICONST_1);
                mv.visitLabel(isOne);

                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(only.name).location);
                    only.name = "NegateBooleanOperator" + localVarScope.get(only.name).location;
                    return only;
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.PUTFIELD, type, only.name, "Z");
                    only.name = "NegateBooleanOperatorField" + only.name;
                    return only;
                }
            case "-":
                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(only.name).location);
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.GETFIELD, type, only.name, "I");
                }

                mv.visitInsn(Opcodes.INEG);

                if(only.type == ExprType.LocalVar){
                    mv.visitVarInsn(Opcodes.ISTORE, localVarScope.get(only.name).location);
                    only.name = "NegateIntOperator" + localVarScope.get(only.name).location;
                    return only;
                }else{
                    mv.visitVarInsn(Opcodes.ALOAD, 0);
                    mv.visitFieldInsn(Opcodes.PUTFIELD, type, only.name, "I");
                    only.name = "NegateIntOperatorField" + only.name;
                    return only;
                }
            default:
                return new Expr("AllesGingSchief" + "Hilfe", ExprType.LocalVar);
        }
    }

    public static Expr generateByteCodeForMethodCallExpr(MethodVisitor mv, MethodCall mc, HashMap<String, LocalVar> localVarScope) {
        List<Expr> methodExpressions = new ArrayList<>();
        String methodDescriptor = "";

        //calculate all expressions which are needed for the parameters of the method
        for(int i = 0; i<mc.expressions.size();i++){
            Expr expression = generateByteCodeForExpressions(mv, mc.expressions.get(i), localVarScope);
            methodExpressions.add(expression);
        }
        //load the this object
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        //load all values needed for the parameters of the method
        for(int i = 0;i<methodExpressions.size(); i++){
            Expr exprParam = methodExpressions.get(i);

            if(exprParam.type == ExprType.LocalVar){
                switch(localVarScope.get(exprParam.name).type){
                    case "int":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "I";
                        break;
                    case "boolean":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "Z";
                        break;
                    case "char":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "C";
                        break;
                    default:
                        mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                }

            }else{
                mv.visitVarInsn(Opcodes.ALOAD, 0);

                switch (classFields.get(exprParam.name)){
                    case "int":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "I");
                        methodDescriptor += "I";
                        break;
                    case "boolean":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "Z");
                        methodDescriptor += "Z";
                        break;
                    case "char":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "C");
                        methodDescriptor += "C";
                        break;
                    default:
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, classFields.get(exprParam.name));
                        methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                }
            }
        }
        //calculate method descriptor
        methodDescriptor = "(" + methodDescriptor + ")";
        switch(mc.type){
            case "int":
                methodDescriptor = methodDescriptor + "I";
                break;
            case "boolean":
                methodDescriptor = methodDescriptor + "Z";
                break;
            case "char":
                methodDescriptor = methodDescriptor + "C";
                break;
            default:
                methodDescriptor = methodDescriptor + "L" + mc.type + ";";
        }
        //call method
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, type, mc.name, methodDescriptor, false);
        //create new expression with return value
        switch (mc.type){
            case "int":
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("MethodCall" + mc.name + (localVarScope.size()), new LocalVar("int", (localVarScope.size())));
                return new Expr("MethodCall" + mc.name + (localVarScope.size()-1), ExprType.LocalVar);
            case "boolean":
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("MethodCall" + mc.name + (localVarScope.size()), new LocalVar("boolean", (localVarScope.size())));
                return new Expr("MethodCall" + mc.name + (localVarScope.size()-1), ExprType.LocalVar);
            case "char":
                mv.visitVarInsn(Opcodes.ILOAD, localVarScope.size());
                localVarScope.put("MethodCall" + mc.name + (localVarScope.size()), new LocalVar("char", (localVarScope.size())));
                return new Expr("MethodCall" + mc.name + (localVarScope.size()-1), ExprType.LocalVar);
            default:
                mv.visitVarInsn(Opcodes.ALOAD, localVarScope.size());
                localVarScope.put("MethodCall" + mc.name + (localVarScope.size()), new LocalVar(mc.type, (localVarScope.size())));
                return new Expr("MethodCall" + mc.name + (localVarScope.size()-1), ExprType.LocalVar);
        }
    }

    public static Expr generateByteCodeForNewExpr(MethodVisitor mv, New newExpr, HashMap<String, LocalVar> localVarScope) {
        List<Expr> methodExpressions = new ArrayList<>();
        String methodDescriptor = "";

        //calculate all expressions which are needed for the parameters of the constructor
        for(int i = 0; i<newExpr.constructorParams.size();i++){
            Expr expression = generateByteCodeForExpressions(mv, newExpr.constructorParams.get(i), localVarScope);
            methodExpressions.add(expression);
        }

        //generate new object
        mv.visitTypeInsn(Opcodes.NEW, newExpr.type);

        for(int i = 0;i<methodExpressions.size(); i++){
            Expr exprParam = methodExpressions.get(i);

            if(exprParam.type == ExprType.LocalVar){
                switch(localVarScope.get(exprParam.name).type){
                    case "int":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "I";
                        break;
                    case "boolean":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "Z";
                        break;
                    case "char":
                        mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "C";
                        break;
                    default:
                        mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(exprParam.name).location);
                        methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                }

            }else{
                mv.visitVarInsn(Opcodes.ALOAD, 0);

                switch (classFields.get(exprParam.name)){
                    case "int":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "I");
                        methodDescriptor += "I";
                        break;
                    case "boolean":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "Z");
                        methodDescriptor += "Z";
                        break;
                    case "char":
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, "C");
                        methodDescriptor += "C";
                        break;
                    default:
                        mv.visitFieldInsn(Opcodes.GETFIELD, type, exprParam.name, classFields.get(exprParam.name));
                        methodDescriptor += "L" + localVarScope.get(exprParam.name).type + ";";
                }
            }
        }

        //calculate method descriptor
        methodDescriptor = "(" + methodDescriptor + ")" + "V";//constructor always "void"

        //call the constructor
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, newExpr.type, "<init>", methodDescriptor, false);

        //create new expression with return value
        mv.visitVarInsn(Opcodes.ALOAD, localVarScope.size());
        localVarScope.put("NewConstructorCall" + newExpr.type + (localVarScope.size()), new LocalVar(newExpr.type, (localVarScope.size())));
        return new Expr("NewConstructorCall" + newExpr.type + (localVarScope.size()-1), ExprType.LocalVar);
    }
}
