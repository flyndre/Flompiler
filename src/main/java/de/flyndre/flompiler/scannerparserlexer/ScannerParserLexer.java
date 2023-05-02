package de.flyndre.flompiler.scannerparserlexer;
import org.antlr.v4.runtime.*;
import de.flyndre.flompiler.scannerparserlexer.gen.*;
import org.w3c.dom.Document;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by janulrich on 28.11.14.
 */
public class ScannerParserLexer {
    public static void main(String[] args) throws IOException {
        String as = "public class A { }";
        CommonTokenStream tokens = compile(as);
        System.out.println(tokens.getText());
        ArrayList<Token> tokenArr = (ArrayList<Token>) tokens.getTokens();
            System.out.println(tokenArr.size());
        for(Token t : tokenArr){
            System.out.print(t.getText());
        }
    }
    public static CommonTokenStream compile(String input) throws IOException {
        return parse(input);
    }

    private static CommonTokenStream parse(String input) throws IOException {
        MiniJavaLexer lexer = new MiniJavaLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //MiniJavaParser parser = new MiniJavaParser(tokens);
        return tokens;
        //MiniJavaParser.ProgramContext tree = parser.program(); //Parsen
        //Document doc = new Document(DocumentElementAdapter.adapt(tree.classes()));
        //return doc;
    }

}