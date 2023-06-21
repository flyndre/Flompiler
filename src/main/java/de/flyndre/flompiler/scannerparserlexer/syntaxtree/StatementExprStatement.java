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

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type;
    }

    /**
     * 
     */
    public String name;

    public StatementExpression statementExpression;
}