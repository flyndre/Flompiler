package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.*;

/**
 * 
 */
public class New extends StatementExpression {

    /**
     * Default constructor
     */
    public New() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type;
    }



    /**
     * 
     */
    public List<Expression> constructorParams;

}