package de.flyndre.flompiler.bytecodegenerator;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.typecheker.utils.LocalVar;
import org.objectweb.asm.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BytecodeGenerator {
    private static HashMap<String, String> classFields = new HashMap<>();//key string is the field name, second string is the field type
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

            //generate fields
            cw = generateByteCodeFields(cw, thisClass.fields);

            //generate constructors
            cw = generateByteCodeForConstructors(cw, thisClass.methods, thisClass.fields);

            //generate methods
            cw = generateByteCodeForMethods(cw, thisClass.methods);

            cw.visitEnd();

            //print code
            byte[] b = cw.toByteArray();

            try{
                FileOutputStream f = new FileOutputStream(outputFile);
                f.write(b);
                f.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

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
                int saveplace = localVarScope.size() + 1;
                localVarScope.put(parameter.name, new LocalVar(parameter.type, saveplace));
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

    private static ClassWriter generateByteCodeForConstructors(ClassWriter cw, List<Method> methods, List<Field> fields){
        //hashmap of local variables
        HashMap<String, LocalVar> localVarScope = new HashMap<>();//key is the name of the variable, LocalVar contains type and save location

        //get all fields with default values
        /*List<Field> defaultFields = new ArrayList<>();
        for(int i=0;i<fields.size();i++){
            if(!fields.get(i).standardValue.equals(null)){
                defaultFields.add(fields.get(i));
            }
        }*/

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

            //save all params to local variables
            for(int a = 0; a<thisConstructor.parameter.size();a++){
                Parameter parameter = thisConstructor.parameter.get(a);
                int saveplace = localVarScope.size() + 1;
                localVarScope.put(parameter.name, new LocalVar(parameter.type, saveplace));
            }

            //Aufruf des normalen generateByteCodeForStatements
            consMeth = generateByteCodeForStatements(consMeth, thisConstructor.statement, localVarScope);

            consMeth.visitInsn(Opcodes.RETURN);
            consMeth.visitMaxs(0,0);
            consMeth.visitEnd();
        }
        return cw;
    }

    private static MethodVisitor generateByteCodeForStatements(MethodVisitor mv, Statement statement, HashMap<String, LocalVar> localVarScope){
        if(statement instanceof Return){
            String ergebnisExpression = generateByteCodeForExpressions(mv, ((Return) statement).expression, localVarScope);

            switch(localVarScope.get(ergebnisExpression).type){
                case "int":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "boolean":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                case "char":
                    mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
                    mv.visitInsn(Opcodes.IRETURN);
                    break;
                default:
                    mv.visitVarInsn(Opcodes.ALOAD, localVarScope.get(ergebnisExpression).location);
                    mv.visitInsn(Opcodes.ARETURN);
                    break;
            }
        }else if(statement instanceof Block){
            List<Statement> statementList = ((Block) statement).statements;

            for(int i=0;i<statementList.size();i++){
                generateByteCodeForStatements(mv, statementList.get(i), localVarScope);
            }
        }else if(statement instanceof While){
            Label loop = new Label();
            Label end = new Label();

            mv.visitLabel(loop);
            String ergebnisExpression = generateByteCodeForExpressions(mv, ((While) statement).condition, localVarScope);

            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, end);

            mv = generateByteCodeForStatements(mv, ((While) statement).statement, localVarScope);

            mv.visitJumpInsn(Opcodes.GOTO, loop);

            mv.visitLabel(end);

        }else if(statement instanceof If){
            Label elseKeyWord = new Label();
            Label end = new Label();

            String ergebnisExpression = generateByteCodeForExpressions(mv, ((If) statement).condition, localVarScope);

            mv.visitVarInsn(Opcodes.ILOAD, localVarScope.get(ergebnisExpression).location);
            mv.visitInsn(Opcodes.ICONST_0);
            mv.visitJumpInsn(Opcodes.IF_ICMPEQ, elseKeyWord);

            mv = generateByteCodeForStatements(mv, ((If) statement).ifStatement, localVarScope);
            mv.visitJumpInsn(Opcodes.GOTO, end);

            mv.visitLabel(elseKeyWord);

            if(!(((If) statement).elseStatement == null)){
                mv = generateByteCodeForStatements(mv, ((If) statement).elseStatement, localVarScope);
            }

            mv.visitLabel(end);

        }else if(statement instanceof LocalVarDecl){
            localVarScope.put(((LocalVarDecl) statement).name, new LocalVar(statement.type, -1));
        }

        return mv;
    }

    private static String generateByteCodeForExpressions(MethodVisitor mv, Expression expression, HashMap<String, LocalVar> localVarScope){
        String variable = "";//name of the variable in localVarScope which has been added in the expression
        if(expression instanceof IntConst){
            variable = generateByteCodeForIntConst(mv, (IntConst) expression, localVarScope);
        }else if(expression instanceof BooleanConst){
            variable = generateByteCodeForBooleanConst(mv, (BooleanConst) expression, localVarScope);
        }else if(expression instanceof CharConst){
            variable = generateByteCodeForCharConst(mv, (CharConst) expression, localVarScope);
        }

        return variable;
    }

    private static String generateByteCodeForIntConst(MethodVisitor mv, IntConst expression, HashMap<String, LocalVar> localVarScope){
        mv.visitLdcInsn(Integer.valueOf(expression.value));//create new Integer Value
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size()+1);//save new Integer Value at the end of the list of local vars
        //add the int var to the localVarScope with a generated Name, because a constant has no name
        localVarScope.put("IntConst" + (localVarScope.size()+1), new LocalVar("int", (localVarScope.size()+1)));

        return "IntConst" + localVarScope.size();
    }

    private static String generateByteCodeForBooleanConst(MethodVisitor mv, BooleanConst expression, HashMap<String, LocalVar> localVarScope){
        if(expression.value){
            mv.visitInsn(Opcodes.ICONST_1);
        }else{
            mv.visitInsn(Opcodes.ICONST_0);
        }
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size()+1);

        localVarScope.put("BooleanConst" + (localVarScope.size()+1), new LocalVar("boolean", (localVarScope.size()+1)));

        return "BooleanConst" + localVarScope.size();
    }

    private static String generateByteCodeForCharConst(MethodVisitor mv, CharConst expression, HashMap<String, LocalVar> localVarScope){
        int charToInt = Character.getNumericValue(expression.value);
        mv.visitLdcInsn(Integer.valueOf(charToInt));
        mv.visitVarInsn(Opcodes.ISTORE, localVarScope.size()+1);
        localVarScope.put("CharConst" + (localVarScope.size()+1), new LocalVar("char",(localVarScope.size()+1)));

        return "CharConst" + localVarScope.size();
    }

    private static String generateByteCodeForStringConst(MethodVisitor mv, StringConst expression, HashMap<String, LocalVar> localVarScope){
        mv.visitLdcInsn(expression.value);
        mv.visitVarInsn(Opcodes.ASTORE, localVarScope.size()+1);
        localVarScope.put("StringConst" + (localVarScope.size()+1), new LocalVar("String", (localVarScope.size()+1)));

        return "StringConst" + localVarScope.size();
    }
}
