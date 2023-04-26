package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import de.flyndre.flompiler.typecheker.Type;

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

    public Type typeCheck() throws Exception {
        for(Method method:methods){
            method.typeCheck(fields);
        }
        return Type.classType;
    }
}