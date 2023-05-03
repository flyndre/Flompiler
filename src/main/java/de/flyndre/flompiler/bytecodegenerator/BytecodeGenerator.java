package de.flyndre.flompiler.bytecodegenerator;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.List;

public class BytecodeGenerator {
    public void generateByteCode(Program program){
        ArrayList<Class> classes = (ArrayList<Class>) program.classes;

        for(int i=0; i< classes.size();i++){
            Class thisClass = classes.get(i);
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
        }
    }

    public ClassWriter generateByteCodeFields(ClassWriter cw, List<Field> fields){
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

            //get initial value
            //String initalValue = thisField.standardValue;
            //nur bei statischen Werten

            cw.visitField(visibility, thisField.name, type, null, null);
        }

        return cw;
    }

    public ClassWriter generateByteCodeForMethods(ClassWriter cw, List<Method> methods){
        //get all methods without constructors
        List<Method> methodsWithoutConstructors = new ArrayList<>();
        for(int i=0;i<methods.size();i++){
            if(!methods.get(i).name.equals("<init>")){
                methodsWithoutConstructors.add(methods.get(i));
            }
        }

        return cw;
    }

    public ClassWriter generateByteCodeForConstructors(ClassWriter cw, List<Method> methods, List<Field> fields){
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

            //Aufruf des normalen generateByteCodeForStatements
            consMeth = generateByteCodeForStatements(consMeth, thisConstructor.statement);

            consMeth.visitInsn(Opcodes.RETURN);
            consMeth.visitMaxs(0,0);
            consMeth.visitEnd();
        }
        return cw;
    }

    public MethodVisitor generateByteCodeForStatements(MethodVisitor mv, Statement statements){

        return mv;
    }
}
