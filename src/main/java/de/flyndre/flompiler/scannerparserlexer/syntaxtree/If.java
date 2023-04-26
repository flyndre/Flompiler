package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class If extends Statement {

    /**
     * Default constructor
     */
    public If() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws ExecutionControl.NotImplementedException {
        return null;
    }

    /**
     * 
     */
    public Expression condition;

    /**
     * 
     */
    public Statement ifStatement;

    /**
     * 
     */
    public Statement elseStatement;

}