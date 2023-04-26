package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.*;

/**
 * 
 */
public class Class {

    /**
     * Default constructor
     */
    public Class() {
    }

    /**
     *
     */

    public String name;

    /**
     *
     */
    public String access;

    /**
     * 
     */
    public List<Field> fields;

    /**
     * 
     */
    public List<Method> methods;

}