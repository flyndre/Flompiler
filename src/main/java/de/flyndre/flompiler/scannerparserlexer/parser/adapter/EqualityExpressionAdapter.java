package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Binary;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class EqualityExpressionAdapter {
    public static Expression adapt(MiniJavaParser.EqualityexpressionContext equalityexpression) throws Exception {

        if(equalityexpression.equalityexpression() != null){
            String operator = "";
            if(equalityexpression.equalityoperations().EQUALSSTAT() != null){
                operator = "==";
            }else if(equalityexpression.equalityoperations().GREATERTHAN() != null){
                operator = ">";
            }else if(equalityexpression.equalityoperations().LESSTHAN() != null){
                operator = "<";
            }
            else if(equalityexpression.equalityoperations().OR() != null){
                operator = "||";
            }


            return new Binary(EqualityExpressionAdapter.adapt(equalityexpression.equalityexpression()), operator, RelationalExpressionAdapter.adapt(equalityexpression.relationalexpression()));
        }
        else if(equalityexpression.relationalexpression() != null && equalityexpression.equalityexpression() == null){
            return RelationalExpressionAdapter.adapt(equalityexpression.relationalexpression());
        }
        throw new Exception();
    }

}
