package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class RelationalExpressionAdapter {
    public static Expression adapt(MiniJavaParser.RelationalexpressionContext relationalexpression) throws Exception {
        if(relationalexpression.shiftexpression() != null){
           return  ShiftExpressionAdapter.adapt(relationalexpression.shiftexpression());
        }
        throw new Exception();
    }
}
