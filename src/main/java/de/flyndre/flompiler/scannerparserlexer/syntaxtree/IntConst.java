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

    public IntConst(int value, String type){
        this.value = value;
        this.type = type;
    }

    /**
     * @return Type value int.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) {
        return type ="int";
    }

}