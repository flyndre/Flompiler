package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

/**
 * 
 */
public class Field {

    public Field(String name, String access, String type, String standardValue){
        this.name = name;
        this.access = access;
        this.type = type;
        this.standardValue = standardValue;
    }
    /**
     * Default constructor
     */
    public Field() {
    }

    /**
     * 
     */
    public String name;

    public String access;

    /**
     * 
     */
    public  String type;

    public String standardValue;

    /**
     * Type check for the field.
     * @return the type of the field.
     */
    public String typeCheck(){
        return type;
    }

}