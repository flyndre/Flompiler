package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.BooleanConst;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class ExpressionAdapter {
    public static Expression adapt(MiniJavaParser.ExpressionContext ctx){
        if(ctx.BOOLEAN() != null){
            return new BooleanConst(Boolean.valueOf(ctx.BOOLEAN().getText()));
        }
        throw new RuntimeException();
    }
}
