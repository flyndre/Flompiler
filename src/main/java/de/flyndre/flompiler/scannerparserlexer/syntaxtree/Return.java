package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class Return extends Statement {

    /**
     * Default constructor
     */
    public Return() {
    }

    public Return(Expression expression){
        this.expression = expression;
    }

    /**
     * Checks and sets the type of the return statement.
     * @return the type of the statement.
     * @throws Exception if the type couldn't be determined.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type= expression.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public Expression expression;

}