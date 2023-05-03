package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.*;

/**
 * 
 */
public class Method {

    /**
     * Default constructor
     */
    public Method() {
    }

    /**
     * 
     */
    public String type;

    /**
     *
     */
    public String access;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public List<Parameter> parameter;

    /**
     * 
     */
    public Statement statement;

    public String typeCheck(List<Field> fields) throws Exception {
        type = statement.typeCheck(fields,parameter);
        return type;
    }
}