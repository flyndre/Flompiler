package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class StatemenExpressionExpression extends Expression {

    /**
     * Default constructor
     */
    public StatemenExpressionExpression() {
    }

    public StatemenExpressionExpression(StatementExpression statementExpression) {
        this.statementExpression = statementExpression;
    }

    /**
     * Checks and sets the type of the Expression.
     * @return the type of the Expression.
     * @throws Exception if the type couldn't be determined.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = statementExpression.typeCheck(fields, parameters);
    }

    /**
     * 
     */
    public StatementExpression statementExpression;


}