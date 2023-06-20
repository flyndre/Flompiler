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

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = "char";
    }

}