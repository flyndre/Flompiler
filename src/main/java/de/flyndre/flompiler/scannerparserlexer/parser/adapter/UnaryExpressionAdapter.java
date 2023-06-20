package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class UnaryExpressionAdapter {

    public static Expression adapt(MiniJavaParser.UnaryexpressionContext ctx) throws Exception {
        if(ctx.unaryexpressionnotplusminus() != null){
            return UnaryExpressionNotPlusMinusAdapter.adapt(ctx.unaryexpressionnotplusminus());
        }
        else if(ctx.preincrementexpression() != null){
            PreincrementexpressionAdapter.adapt(ctx.preincrementexpression());
        }
        else if(ctx.predecrementexpression() != null){
            PredecrementexpressionAdapter.adapt(ctx.predecrementexpression());
        }
        throw new Exception();
    }
}
