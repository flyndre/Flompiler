package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class LocalOrFieldVar extends Expression {

    /**
     * Default constructor
     */
    public LocalOrFieldVar() {
    }

    public LocalOrFieldVar(String name) {
        this.name = name;
    }

    /**
     * @return The type of the Var.
     */
    @Override
    public String typeCheck()  {
        return type;
    }

    /**
     * 
     */
    public String name;

}