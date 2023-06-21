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

    /**
     * @return the type of the parameter-
     */
    public String typeCheck() {
        return type;
    }
}