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

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        String tyl;
        String tyr;
        if((tyl=expressionLeft.typeCheck(fields,parameters)).equals(tyr=expressionRight.typeCheck(fields,parameters))){
            return tyl;
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