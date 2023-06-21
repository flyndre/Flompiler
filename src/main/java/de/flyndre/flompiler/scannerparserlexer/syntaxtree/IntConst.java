package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class IntConst extends Expression {

    public int value;
    /**
     * Default constructor
     */
    public IntConst() {
    }

    public IntConst(int value){
        this.value = value;
    }

    /**
     * @return Type value int.
     */
    @Override
    public String typeCheck() {
        return type ="int";
    }

}