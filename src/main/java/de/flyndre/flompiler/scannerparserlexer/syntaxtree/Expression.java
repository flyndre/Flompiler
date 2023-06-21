package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public abstract class Expression {

    public String type;

    /**
     * Default constructor
     */
    public Expression() {
    }

    /**
     * Type check for all expressions.
     * @return The type of the expression.
     * @throws Exception if the type could not be determined.
     */
    public abstract String typeCheck() throws Exception;
}