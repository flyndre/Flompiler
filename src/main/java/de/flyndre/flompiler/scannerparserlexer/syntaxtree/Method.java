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

    public Method(String type, String name, List<Parameter> parameter, Statement statement, String access){
        this.type = type;
        this.access = access;
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
        String foundType = statement.typeCheck(fields,parameter);
        if(!foundType.equals(type)){
            throw new Exception(String.format("The given type does not equal the expected. Expected: %s found: %s",type,foundType));
        }
        return type;
    }
}