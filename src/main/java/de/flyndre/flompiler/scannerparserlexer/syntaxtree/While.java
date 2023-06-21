package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class While extends Statement {

    /**
     * Default constructor
     */
    public While() {
    }

    public While(Expression condition, Statement statement){
        this.condition = condition;
        this.statement = statement;
    }

    /**
     * Checks the type of the statement and sets is as the type for the while-loop.
     * @return the type of the while-loop.
     * @throws Exception if not type could be determined.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = statement.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public Expression condition;

    /**
     * 
     */
    public Statement statement;

}