package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class LocalVarDecl extends Statement {

    /**
     * Default constructor
     */
    public LocalVarDecl() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws ExecutionControl.NotImplementedException {
        return null;
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