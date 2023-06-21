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

    public CharConst(char value, String type) {
        this.value = value;
        this.type = type;
    }

    /**
     * @return The type value char.
     */
    @Override
    public String typeCheck() {
        return type = "char";
    }

}