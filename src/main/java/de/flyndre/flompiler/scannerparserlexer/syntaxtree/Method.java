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

    /**
     * Type check for the method. Checks if the type of the internal statement matches the type of the method.
     * @return the type of the method.
     * @throws Exception if the types doesn't match.
     */
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        parameters.addAll(parameter);
        String foundType = statement.typeCheck(fields,parameters);
        if(!foundType.equals(type)){
            throw new Exception(String.format("The given type does not equal the expected. Expected: %s found: %s",type,foundType));
        }
        return type;
    }
}