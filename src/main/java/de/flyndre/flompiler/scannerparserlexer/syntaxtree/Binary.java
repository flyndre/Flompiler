package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

/**
 * 
 */
public class Binary extends Expression {

    /**
     * Default constructor
     */
    public Binary() {
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expressionRight;

    /**
     * 
     */
    public Expression expressionLeft;

}