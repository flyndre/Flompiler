package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import de.flyndre.flompiler.typecheker.Type;

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
    public Type type;

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

    public Type typeCheck(List<Field> fields) throws Exception {
        Type ty;
        if(!(ty = statement.typeCheck(fields,parameter)).equals(type)){
            throw new Exception(String.format("Method %s has not the expected type. Expected %s, but should be %s",name,type.name(),ty.name()));
        }
        return type;
    }
}