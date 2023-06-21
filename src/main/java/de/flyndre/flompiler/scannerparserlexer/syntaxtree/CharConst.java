package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class CharConst extends Expression {

    public char value;
    /**
     * Default constructor
     */
    public CharConst() {
    }

    public CharConst(char value) {
        this.value = value;
    }

    /**
     * @return The type value char.
     */
    @Override
    public String typeCheck() {
        return type = "char";
    }

}