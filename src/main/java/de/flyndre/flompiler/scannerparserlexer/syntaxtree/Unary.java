package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Unary extends Expression {

    /**
     * Default constructor
     */
    public Unary() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return null;
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

}