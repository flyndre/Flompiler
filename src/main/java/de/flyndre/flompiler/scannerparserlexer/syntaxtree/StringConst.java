package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

public class StringConst extends Expression{
    public String value;

    public StringConst(){

    }

    public StringConst(String value){
        this.value = value;
    }

    /**
     * @return The type value string.
     */
    @Override
    public String typeCheck()  {
        return type = "String";
    }
}
