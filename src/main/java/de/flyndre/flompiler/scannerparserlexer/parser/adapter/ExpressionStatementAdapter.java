package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Statement;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;

public class ExpressionStatementAdapter {
    public static StatementExpression adaptExpressionStatement(MiniJavaParser.StatementexpressionContext ctx) throws Exception {

        if(ctx.assignment() != null){
            return AssignmentAdapter.adapt(ctx.assignment());
        }
        else if(ctx.predecrementexpression() != null){
            return PredecrementexpressionAdapter.adapt(ctx.predecrementexpression());
        }
        else if(ctx.preincrementexpression() != null){
            return PreincrementexpressionAdapter.adapt(ctx.preincrementexpression());
        }
        else if(ctx.methodinvocation() != null){
            return MethodInvocationAdapter.adapt(ctx.methodinvocation());
        }
        throw new Exception();
    }
}
