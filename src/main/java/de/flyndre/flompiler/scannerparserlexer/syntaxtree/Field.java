package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import de.flyndre.flompiler.typecheker.Type;

/**
 * 
 */
public class Field {

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
    public Type type;

    public String standardValue;

}