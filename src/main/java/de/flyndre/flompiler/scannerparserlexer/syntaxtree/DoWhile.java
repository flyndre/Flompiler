package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class DoWhile extends Statement {

    /**
     * Default constructor
     */
    public DoWhile() {
    }

    /**
     * Type check for DoWhile
     * @return The type value void due the do while statement not implemented yet.
     */
    @Override
    public String typeCheck() {
        return type = "void";
    }

}