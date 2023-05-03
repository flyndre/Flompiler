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

    public Method(String type, String name, List<Parameter> parameter, Statement statement){
        this.type = type;
        this.name = name;
        this.parameter = parameter;
        this.statement = statement;
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