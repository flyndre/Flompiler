package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

/**
 * 
 */
public class Assign extends StatementExpression {

    /**
     * Default constructor
     */
    public Assign() {
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

    /**
     * 
     */
    public LocalOrFieldVar var;

}