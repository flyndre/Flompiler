package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatemenExpressionExpression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;

public class AssignmentExpressionAdapter {
    public static Expression adapt(MiniJavaParser.AssignmentexpressionContext assignmentexpression) throws Exception {
        if(assignmentexpression.expression() != null){
            return ExpressionAdapter.adapt(assignmentexpression.expression());
        }
        else if(assignmentexpression.statementexpression() != null){
            return new StatemenExpressionExpression(StatementExpressionAdapter.adapt(assignmentexpression.statementexpression()));
        }
        throw new Exception();
    }
}
