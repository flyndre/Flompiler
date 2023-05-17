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

    public abstract String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception;
}