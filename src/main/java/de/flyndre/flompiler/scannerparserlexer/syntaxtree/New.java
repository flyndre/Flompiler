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

    /**
     * @return the type of this StatementExpression.
     */
    @Override
    public String typeCheck() {
        return type;
    }



    /**
     * 
     */
    public List<Expression> constructorParams;

}