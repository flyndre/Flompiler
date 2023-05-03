package de.flyndre.flompiler.scannerparserlexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaLexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.parser.adapter.ClassAdapter;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Field;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by janulrich on 28.11.14.
 */
public class ScannerParserLexer {
    public static void main(String[] args) throws IOException {
        String as = "public class asd{ String abc = \"hallo\"; private Boolean gams(){}}";
        Program program = compile(as);

        for (Class aClass : program.classes) {
            System.out.println("Classname: " + aClass.name + ", Classaccess: " + aClass.access );
            System.out.println("Folgende Methoden sind Teil der Klasse:");

            for(Method method : aClass.methods){
                System.out.println(" " + method.name + " Accesstyp: " + method.access + " Type: " + method.type);
            }
            System.out.println("Folgende Felder sind Teil der Klasse:");

            for(Field field : aClass.fields){
                System.out.println(" " + field.name + " Accesstyp: " + field.access + " Type: " + field.type + " Wert: " + field.standardValue);
            }


        }

    }
    public static Program compile(String input) {
        return parse(input);
    }

    private static Program parse(String input) {
        MiniJavaLexer lexer = new MiniJavaLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        MiniJavaParser.ProgramContext tree = parser.program(); //Parsen
        Program doc = new Program(ClassAdapter.adapt(tree.classes()));
        return doc;
    }

}