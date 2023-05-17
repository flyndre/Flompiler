package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public abstract class StatementExpression {
    /**
     *
     */
    public String type;

    /**
     * Default constructor
     */
    public StatementExpression() {
    }

    public abstract String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception;
}