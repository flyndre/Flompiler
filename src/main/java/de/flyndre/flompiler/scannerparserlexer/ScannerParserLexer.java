package de.flyndre.flompiler.scannerparserlexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaLexer;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
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
        String as = "public class asd{} public class dfs{}";
        Program program = compile(as);

        for (Class aClass : program.classes) {
            System.out.println("Classname: " + aClass.name + ", Classaccess: " + aClass.access );
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