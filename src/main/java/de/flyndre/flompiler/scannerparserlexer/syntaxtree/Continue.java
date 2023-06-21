package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class Continue extends Statement {

    /**
     * Default constructor
     */
    public Continue() {
    }

    /**
     * @return The type vale void.
     */
    @Override
    public String typeCheck() {
        return type = "void";
    }

}