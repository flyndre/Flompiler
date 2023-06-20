package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Unary extends StatementExpression {

    /**
     * Default constructor
     */
    public Unary() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = expression.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

    public Unary(String operator, Expression expression){
        this.operator = operator;
        this.expression = expression;
    }

}