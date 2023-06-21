package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class StatementExprStatement extends Statement {

    /**
     * Default constructor
     */
    public StatementExprStatement(StatementExpression statementExpression) {
        this.statementExpression = statementExpression;
    }
    public StatementExprStatement() {
    }

    /**
     * Checks the type of the internal StatementExpression and sets it as the type of the statement.
     * @return the type of the statement.
     * @throws Exception if the type couldn't be determined.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return  type = statementExpression.typeCheck(fields, parameters);
    }

    /**
     * 
     */
    public String name;

    public StatementExpression statementExpression;
}