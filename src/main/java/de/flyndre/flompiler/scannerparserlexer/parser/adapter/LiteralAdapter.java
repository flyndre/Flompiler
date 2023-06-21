package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

public class LiteralAdapter {
    public static Expression adapt(MiniJavaParser.LiteralContext literal) throws Exception {
        if(literal.BOOLEAN() != null){
            return new BooleanConst(Boolean.getBoolean(literal.BOOLEAN().getText()), "boolean");
        }
        else if(literal.INTEGER() != null){
            return new IntConst(Integer.valueOf(literal.INTEGER().getText()), "int");
        }
        else if(literal.CHAR() != null){
            return new CharConst(literal.INTEGER().getText().charAt(0), "char");
        }
        else if(literal.STRING() != null){
            return new StringConst(literal.STRING().getText(), "String");
        }
        else if(literal.JNULL() != null){
            return new Null();
        }
        throw new Exception();
    }
}
