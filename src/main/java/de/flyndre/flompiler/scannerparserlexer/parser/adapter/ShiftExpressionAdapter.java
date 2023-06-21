package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class ShiftExpressionAdapter {
    public static Expression adapt(MiniJavaParser.ShiftexpressionContext shiftexpression) throws Exception {
        if(shiftexpression.additiveexpression() != null){
            return AdditiveexpressionAdapter.adapt(shiftexpression.additiveexpression());
        }
        throw new Exception();
    }
}
