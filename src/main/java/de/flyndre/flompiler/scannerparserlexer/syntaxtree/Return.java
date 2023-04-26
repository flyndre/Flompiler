package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class Return extends Statement {

    /**
     * Default constructor
     */
    public Return() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return expression.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public Expression expression;

}