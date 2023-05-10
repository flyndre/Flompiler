package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

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
}