package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class While extends Statement {

    /**
     * Default constructor
     */
    public While() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        String ty;
        if((ty=condition.typeCheck(fields,parameters)).equals("bool")){
            return statement.typeCheck(fields,parameters);
        }
        throw new Exception("Expected boolean in condition but was"+ty);
    }

    /**
     * 
     */
    public Expression condition;

    /**
     * 
     */
    public Statement statement;

}