package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class BooleanConst extends Expression {

    public BooleanConst value;
    /**
     * Default constructor
     */
    public BooleanConst() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return "boolean";
    }

}