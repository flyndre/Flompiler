package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Binary;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class AdditiveexpressionAdapter {
    public static Expression adapt(MiniJavaParser.AdditiveexpressionContext additiveexpression) throws Exception {
        if(additiveexpression.PLUS() != null){
            return new Binary(AdditiveexpressionAdapter.adapt(additiveexpression.additiveexpression()), "+", MultiplicativeExpressionAdapter.adapt(additiveexpression.multiplicativeexpression()));
        }
        else if(additiveexpression.MINUS() != null){
            return new Binary(AdditiveexpressionAdapter.adapt(additiveexpression.additiveexpression()), "-", MultiplicativeExpressionAdapter.adapt(additiveexpression.multiplicativeexpression()));
        }
        else{
            return MultiplicativeExpressionAdapter.adapt(additiveexpression.multiplicativeexpression());
        }
    }
}
