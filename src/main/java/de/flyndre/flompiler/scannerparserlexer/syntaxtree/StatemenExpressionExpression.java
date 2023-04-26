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

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return statementExpression.typeCheck(fields,parameters);
    }

    /**
     * 
     */
    public StatementExpression statementExpression;


}