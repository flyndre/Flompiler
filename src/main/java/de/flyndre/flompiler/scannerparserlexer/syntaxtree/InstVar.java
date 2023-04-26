package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class InstVar extends Expression {

    /**
     * Default constructor
     */
    public InstVar() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return null;
    }

    /**
     * 
     */
    public Expression expression;

    /**
     * 
     */
    public String name;

}