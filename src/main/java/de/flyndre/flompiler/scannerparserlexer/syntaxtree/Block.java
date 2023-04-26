package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.*;

/**
 * 
 */
public class Block extends Statement {

    /**
     * Default constructor
     */
    public Block() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        for(Statement statement: statements){
            if(statement.getClass().equals(Return.class)){
                return statement.typeCheck(fields,parameters);
            }
        }
        return "void";
    }

    /**
     * 
     */
    public List<Statement> statements;



}