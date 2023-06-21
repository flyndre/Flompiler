package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Null extends Expression {

    /**
     * Default constructor
     */
    public Null() {
    }

    /**
     * @return the type value void.
     */
    @Override
    public String typeCheck() {
        return type ="void";
    }

}