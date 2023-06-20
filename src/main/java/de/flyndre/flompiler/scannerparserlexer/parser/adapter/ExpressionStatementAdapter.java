package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;

public class ExpressionStatementAdapter {
    public static StatementExpression adaptExpressionStatement(MiniJavaParser.ExpressionstatementContext ctx) throws Exception {
        MiniJavaParser.StatementexpressionContext statementexpressionContext = ctx.statementexpression();

        if(statementexpressionContext.assignment() != null){
            return AssignmentAdapter.adapt(statementexpressionContext.assignment());
        }
        else if(statementexpressionContext.predecrementexpression() != null){
            return PredecrementexpressionAdapter.adapt(statementexpressionContext.predecrementexpression());
        }
        else if(statementexpressionContext.preincrementexpression() != null){
            return PreincrementexpressionAdapter.adapt(statementexpressionContext.preincrementexpression());
        }
        else if(statementexpressionContext.methodinvocation() != null){
            return MethodInvocationAdapter.adapt(statementexpressionContext.methodinvocation());
        }
        throw new Exception();
    }
}
