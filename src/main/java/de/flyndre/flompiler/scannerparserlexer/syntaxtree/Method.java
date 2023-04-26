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
        String ty;
        if(!(ty = statement.typeCheck(fields,parameter)).equals(type)){
            throw new Exception(String.format("Method %s has not the expected type. Expected %s, but should be %s",name,type,ty));
        }
        return type;
    }
}