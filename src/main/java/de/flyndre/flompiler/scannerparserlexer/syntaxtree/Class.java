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

    public Class(String name, String access, List<Field> fields, List<Method> methods){
        this.name = name;
        this.access = access;
        this.fields = fields;
        this.methods = methods;
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


    /**
     * Checks the type of all methods in the class.
     * @throws Exception if the type of a method could not be determined.
     */
    public void typeCheck() throws Exception {
        for(Method method:methods){
            method.typeCheck();
        }
    }
}