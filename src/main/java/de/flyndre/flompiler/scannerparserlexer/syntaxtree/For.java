package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class For extends Statement {

    /**
     * Default constructor
     */
    public For() {
    }

    /**
     * Type check for for-loop
     * @return The type value void due the for-loop statement not implemented yet.
     */
    @Override
    public String typeCheck()  {
        return type = "void";
    }

}