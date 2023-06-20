package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Unary;

public class PredecrementexpressionAdapter {

    public static Unary adapt(MiniJavaParser.PredecrementexpressionContext ctx) throws Exception {
        return new Unary("--", UnaryExpressionAdapter.adapt(ctx.unaryexpression()));
    }
}
