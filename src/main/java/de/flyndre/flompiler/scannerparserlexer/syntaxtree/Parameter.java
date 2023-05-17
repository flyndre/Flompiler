package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Parameter {

    /**
     * Default constructor
     */
    public Parameter() {
    }

    /**
     * 
     */
    public String type;

    /**
     * 
     */
    public String name;

    public Parameter(String name, String type){
        this.type = type;
        this.name = name;
    }
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type;
    }
}