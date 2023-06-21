package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public abstract class StatementExpression {
    /**
     *
     */
    public String type;

    /**
     * Default constructor
     */
    public StatementExpression() {
    }

    /**
     * Type check for all StatementExpressions.
     * @return the type of the StatementExpression.
     * @throws Exception if the type check failed.
     */
    public abstract String typeCheck() throws Exception;
}