package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.New;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatemenExpressionExpression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;

public class ClassInstanceCreationExpressionAdapter {
    public static Expression adapt(MiniJavaParser.ClassinstancecreationexpressionContext classinstancecreationexpression) {
        //TODO: CHANGE NEW TO ONLY EXPRESSION
        //TODO: ADD PARAMETER IN CONSTRUCTOR
        return new StatemenExpressionExpression(new New());
    }
}
