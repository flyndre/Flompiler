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


    public Assign( LocalOrFieldVar var, String operator, Expression expression) {
        this.var = var;
        this.operator = operator;
        this.expression = expression;
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