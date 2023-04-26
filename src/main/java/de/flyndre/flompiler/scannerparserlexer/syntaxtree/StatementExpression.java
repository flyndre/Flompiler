package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public abstract class StatementExpression {

    /**
     * Default constructor
     */
    public StatementExpression() {
    }

    public abstract String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception;
}