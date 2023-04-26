package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import de.flyndre.flompiler.typecheker.Type;
import jdk.jshell.spi.ExecutionControl;

import java.util.*;

/**
 * 
 */
public class Statement {

    /**
     * Default constructor
     */
    public Statement() {
    }

    public Type typeCheck(List<Field> fields,List<Parameter> parameters) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Hi");
    }
}