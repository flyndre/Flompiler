package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;

public class StatementExpressionAdapter {
    public static StatementExpression adapt(MiniJavaParser.StatementexpressionContext statementexpression) throws Exception {
        if(statementexpression.methodinvocation() != null){
            return MethodInvocationAdapter.adapt(statementexpression.methodinvocation());
        }
        else if(statementexpression.preincrementexpression() != null){
            return PreincrementexpressionAdapter.adapt(statementexpression.preincrementexpression());
        }
        else if(statementexpression.predecrementexpression() != null){
            return PredecrementexpressionAdapter.adapt(statementexpression.predecrementexpression());
        }
        else if(statementexpression.assignment() != null){
            return AssignmentContextAdapter.adapt(statementexpression.assignment());
        }
        throw new Exception();
    }
}
