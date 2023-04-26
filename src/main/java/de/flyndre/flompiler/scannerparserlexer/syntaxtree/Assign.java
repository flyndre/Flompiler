package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Assign extends StatementExpression {

    /**
     * Default constructor
     */
    public Assign() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) {
        return null;
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

    /**
     * 
     */
    public LocalOrFieldVar var;

}