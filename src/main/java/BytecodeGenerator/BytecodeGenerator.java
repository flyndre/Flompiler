package BytecodeGenerator;

import ScannerParserLexer.Syntaxtree.Class;
import ScannerParserLexer.Syntaxtree.Program;
import jdk.internal.org.objectweb.asm.ClassWriter;

import java.util.ArrayList;

public class BytecodeGenerator {
    public void generateByteCode(Program program){
        ArrayList<Class> classes = (ArrayList<Class>) program.classes;

        for(int i=0; i< classes.size();i++){
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            
        }
    }
}
