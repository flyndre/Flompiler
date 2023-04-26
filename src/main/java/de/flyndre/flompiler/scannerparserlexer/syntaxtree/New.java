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
     * 
     */
    public String type;

    /**
     * 
     */
    public List<Expression> constructorParams;

}