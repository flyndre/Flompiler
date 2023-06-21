package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

public class StringConst extends Expression{
    public String value;

    public StringConst(){

    }

    public StringConst(String value, String type){
        this.value = value;
        this.type = type;
    }

    /**
     * @return The type value string.
     */
    @Override
    public String typeCheck()  {
        return type = "String";
    }
}
