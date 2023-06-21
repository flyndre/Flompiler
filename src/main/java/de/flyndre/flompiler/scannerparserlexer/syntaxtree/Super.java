package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Super extends Expression {

    /**
     * Default constructor
     */
    public Super() {
    }

    /**
     * @return The set type.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters)  {
        return type;
    }

}