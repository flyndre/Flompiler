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

    /**
     * Type check for MethodCall. Checks the type of the internal expression and sets it as the type of the MethodCall.
     * @return The type of the MethodCall.
     * @throws Exception if no typ could be determined.
     */
    @Override
    public String typeCheck() throws Exception {
        return type = expr.typeCheck();
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