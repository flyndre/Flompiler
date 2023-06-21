package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Binary;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class EqualityExpressionAdapter {
    public static Expression adapt(MiniJavaParser.EqualityexpressionContext equalityexpression) throws Exception {

        if(equalityexpression.equalityexpression() != null){
            return new Binary(EqualityExpressionAdapter.adapt(equalityexpression.equalityexpression()), "==", RelationalExpressionAdapter.adapt(equalityexpression.relationalexpression()));
        }
        //TODO: NEEDED?
        else if(equalityexpression.relationalexpression() != null && equalityexpression.equalityexpression() == null){
            return RelationalExpressionAdapter.adapt(equalityexpression.relationalexpression());
        }
        throw new Exception();
    }

}
