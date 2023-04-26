package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class StatementExprStatement extends Statement {

    /**
     * Default constructor
     */
    public StatementExprStatement() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws ExecutionControl.NotImplementedException {
        return type;
    }

    /**
     * 
     */
    public String type;

    /**
     * 
     */
    public String name;

}