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

    public Block(List<Statement> statements){
        this.statements = statements;
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        type = "void";
        for(Statement stm:statements){
            String nextType;
            if((nextType=stm.typeCheck(fields,parameters)).equals("void")){
                continue;
            }
            if(!type.equals("void")&&!(nextType=stm.typeCheck(fields,parameters)).equals(type)){
                throw new Exception(String.format("There are two different return types. First: %s Second: %s",type,nextType));
            }
            type = nextType;
        }
        return type;
    }

    /**
     * 
     */
    public List<Statement> statements;



}