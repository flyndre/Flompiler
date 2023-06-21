package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Binary extends Expression {

    /**
     * Default constructor
     */
    public Binary() {
    }

    public Binary(Expression expressionLeft, String operator, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.operator = operator;
        this.expressionRight = expressionRight;
    }

    /**
     * Checks the type of this expression.
     * @return the type if the two types are the same.
     * @throws Exception if the types are different
     */
    @Override
    public String typeCheck() throws Exception {
        String tyl;
        String tyr;
        if((tyl=expressionLeft.typeCheck()).equals(tyr=expressionRight.typeCheck())){
            return type = tyl;
        }
        throw new Exception(String.format("Expected two equal types but was %s and %s",tyl,tyr));
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