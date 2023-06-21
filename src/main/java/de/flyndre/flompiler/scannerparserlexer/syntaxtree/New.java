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

    public New(String type, List<Expression> exprArguments) {
        this.type = type;
        this.constructorParams = exprArguments;
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