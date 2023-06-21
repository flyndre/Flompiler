package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class Break extends Statement {

    /**
     * Default constructor
     */
    public Break() {
    }

    /**
     * @return The type value void.
     */
    @Override
    public String typeCheck(){
        return type = "void";
    }

    /**
     * 
     */


}