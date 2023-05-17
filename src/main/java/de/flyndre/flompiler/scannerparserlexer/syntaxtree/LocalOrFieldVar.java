package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class LocalOrFieldVar extends Expression {

    /**
     * Default constructor
     */
    public LocalOrFieldVar() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type;
    }

    /**
     * 
     */
    public String name;

}