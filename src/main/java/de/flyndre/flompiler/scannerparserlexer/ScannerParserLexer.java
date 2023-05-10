package de.flyndre.flompiler.scannerparserlexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaLexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.parser.adapter.ClassAdapter;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class ScannerParserLexer {
    public static void main(String[] args) {
        String as = "public class abc{\n" +
                "    public String abc(int i){return 1;}\n" +
                "}";
        Program program = compile(as);

        for (Class aClass : program.classes) {
            System.out.println("Classname: " + aClass.name + ", Classaccess: " + aClass.access );
            System.out.println("Folgende Methoden sind Teil der Klasse:");

            for(Method method : aClass.methods){
                System.out.println("   " + method.name + " Accesstyp: " + method.access + " Type: " + method.type);

                for(Parameter params : method.parameter){
                    System.out.println("      " + params.name + " Type: " + params.type);
                }
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