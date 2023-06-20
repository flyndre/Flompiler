package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.*;

/**
 * 
 */
public class MethodCall extends StatementExpression {

    /**
     * Default constructor
     */
    public MethodCall() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return expr.typeCheck(fields,parameters);
    }

    public MethodCall(Expression expr, String name, List<Expression> expressions) {
        this.expr = expr;
        this.name = name;
        this.expressions = expressions;
    }

    /**
     * 
     */
    public Expression expr;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public List<Expression> expressions;

}