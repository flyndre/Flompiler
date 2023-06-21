package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;

/**
 * 
 */
public abstract class Statement {

    /**
     * Default constructor
     */
    public Statement() {
    }

    public String type;

    /**
     * Type check for statements.
     * @return the type of the statement
     * @throws Exception if the type check failed.
     */
    public abstract String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception;
}