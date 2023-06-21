package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class InstVar extends Expression {

    /**
     * Default constructor
     */
    public InstVar() {
    }

    /**
     * Type check for InstVar. Checks the type of the expression and sets it as the type of the variable.
     * @return The type of the variable.
     * @throws Exception if the type check goes wrong.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = expression.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public Expression expression;

    /**
     * 
     */
    public String name;

}