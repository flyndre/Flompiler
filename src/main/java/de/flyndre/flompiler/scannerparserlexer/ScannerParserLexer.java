package de.flyndre.flompiler.scannerparserlexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaLexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.parser.adapter.ClassAdapter;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.IOException;
import java.util.BitSet;

public class ScannerParserLexer {
    public static void main(String[] args) throws Exception {
        String as = "public class abc{\n" +
                "\n" +
                "public String abasc(int a, int b){\n" +
                         "++a;"+
                "ABC abc = new ABC();"+
                "        int badi = b+1*2;" +
                "        int i = abc(1+1);"          +
                "          if(a == 1){\n" +
                "            return 1;\n" +
                "        }else{\n" +
                "            return 1; \n" +
                "        }\n" +
                "        while(true){\n" +
                "            return 5; \n" +
                "        }\n" +
                "}\n" +
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
    public static Program compile(String input) throws Exception {
        return parse(input);
    }

    private static Program parse(String input) throws Exception {
        MiniJavaLexer lexer = new MiniJavaLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        MiniJavaParser.ProgramContext tree = parser.program(); //Parsen
        Program doc = new Program(ClassAdapter.adapt(tree.classes()));
        return doc;
    }

}