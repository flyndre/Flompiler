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

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        String tyl;
        String tyr;
        if((tyl=expressionLeft.typeCheck(fields,parameters)).equals(tyr=expressionRight.typeCheck(fields,parameters))){
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