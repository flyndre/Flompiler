package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Binary;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

public class MultiplicativeExpressionAdapter {
    public static Expression adapt(MiniJavaParser.MultiplicativeexpressionContext multiplicativeexpression) throws Exception {
        if(multiplicativeexpression.DIV() != null){
            return new Binary(MultiplicativeExpressionAdapter.adapt(multiplicativeexpression.multiplicativeexpression()), "/", UnaryExpressionAdapter.adapt(multiplicativeexpression.unaryexpression()));
        }
        if(multiplicativeexpression.MUL() != null){
            return new Binary(MultiplicativeExpressionAdapter.adapt(multiplicativeexpression.multiplicativeexpression()), "*", UnaryExpressionAdapter.adapt(multiplicativeexpression.unaryexpression()));
        }
        if(multiplicativeexpression.MOD() != null){
            return new Binary(MultiplicativeExpressionAdapter.adapt(multiplicativeexpression.multiplicativeexpression()), "%", UnaryExpressionAdapter.adapt(multiplicativeexpression.unaryexpression()));
        }
        else{
            return UnaryExpressionAdapter.adapt(multiplicativeexpression.unaryexpression());
        }

    }
}
