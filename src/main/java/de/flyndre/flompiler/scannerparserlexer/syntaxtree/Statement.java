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

    public abstract String typeCheck(List<Field> fields,List<Parameter> parameters) throws Exception;
}