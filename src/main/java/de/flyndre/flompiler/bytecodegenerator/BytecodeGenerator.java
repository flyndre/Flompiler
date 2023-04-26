package de.flyndre.flompiler.bytecodegenerator;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Field;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.objectweb.asm.ClassWriter;
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
                case "bool":
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


            cw.visitField(visibility, thisField.name, type, null, null);
        }

        return cw;
    }
}
