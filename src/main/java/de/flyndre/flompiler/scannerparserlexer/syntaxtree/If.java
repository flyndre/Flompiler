package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class If extends Statement {

    /**
     * Default constructor
     */
    public If() {
    }

    public If(Expression condition, Statement ifStatement, Statement elseStatement){
        this.condition = condition;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        String ifType = ifStatement.typeCheck(fields,parameters);
        String elseType = elseStatement.typeCheck(fields,parameters);
        if(!ifType.equals(elseType)){
            throw new Exception(String.format("The two statement have different return types. If has %s, Else has %s",ifType,elseType));
        }
        return type = ifType;
    }

    /**
     * 
     */
    public Expression condition;

    /**
     * 
     */
    public Statement ifStatement;

    /**
     * 
     */
    public Statement elseStatement;


}