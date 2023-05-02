package de.flyndre.flompiler.scannerparserlexer;
import de.flyndre.flompiler.scannerparserlexer.parser.adapter.ClassAdapter;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by janulrich on 28.11.14.
 */
public class ScannerParserLexer {
    public static void main(String[] args) throws IOException {
        String as = "public class asd {}";
        Program program = compile(as);

        for (Class aClass : program.classes) {
            System.out.println("Classname: " + aClass.name + ", Classaccess: " + aClass.access );
        }

    }
    public static Program compile(String input) throws IOException {
        return parse(input);
    }

    private static Program parse(String input) throws IOException {
        parser.MiniJavaLexer lexer = new parser.MiniJavaLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser.MiniJavaParser parser = new parser.MiniJavaParser(tokens);
        parser.MiniJavaParser.ProgramContext tree = parser.program(); //Parsen
        Program doc = new Program(ClassAdapter.adapt(tree.class_()));
        return doc;
    }

}