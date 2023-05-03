package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class IntConst extends Expression {

    public int value;
    /**
     * Default constructor
     */
    public IntConst() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type ="int";
    }

}