package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class While extends Statement {

    /**
     * Default constructor
     */
    public While() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = statement.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public Expression condition;

    /**
     * 
     */
    public Statement statement;

}