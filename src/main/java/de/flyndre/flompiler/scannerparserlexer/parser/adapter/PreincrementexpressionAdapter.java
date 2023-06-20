package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Unary;

public class PreincrementexpressionAdapter {
    public static StatementExpression adapt(MiniJavaParser.PreincrementexpressionContext preincrementexpression) throws Exception {
        return new Unary("++", UnaryExpressionAdapter.adapt(preincrementexpression.unaryexpression()));
    }
}
