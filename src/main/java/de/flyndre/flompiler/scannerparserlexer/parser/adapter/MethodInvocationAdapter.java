package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.MethodCall;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatemenExpressionExpression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExpression;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class MethodInvocationAdapter {
    public static StatementExpression adapt(MiniJavaParser.MethodinvocationContext methodinvocation) throws Exception {
        ArrayList<Expression> expressions = new ArrayList<>();
        StatemenExpressionExpression dotMethod = null;
        if(methodinvocation.methodinvocation() != null){
            dotMethod = new StatemenExpressionExpression(adapt(methodinvocation.methodinvocation()));
        }
        if(methodinvocation.argumentlist() != null){
            expressions = (ArrayList<Expression>) ArgumentListAdapter.adapt(methodinvocation.argumentlist());
        }

        return new MethodCall(dotMethod, methodinvocation.NAME().getText(), expressions);
    }
}
