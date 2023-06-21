package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class BooleanConst extends Expression {

    public boolean value;
    /**
     * Default constructor
     */
    public BooleanConst() {
    }

    public BooleanConst(boolean value) {
        this.value = value;
    }

    /**
     * @return the value boolean as type.
     */
    @Override
    public String typeCheck(){
        return type = "boolean";
    }

}