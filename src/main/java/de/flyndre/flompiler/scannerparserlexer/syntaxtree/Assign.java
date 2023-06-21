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

    /**
     * Checks the type of the Assign statement expression.
     * @return The type if the internal expression has the same as the variable.
     * @throws Exception when the types are different.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        String vartype, expType;
        if((vartype = var.typeCheck(fields, parameters)).equals(expType = expression.typeCheck(fields,parameters))){
            return type = vartype;
        }
        throw new Exception(String.format("Expected two equal types but was %s and %s",vartype,expType));
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