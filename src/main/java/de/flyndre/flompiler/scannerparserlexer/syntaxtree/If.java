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

    /**
     * Type check for if-statement. Checks if both statements have compatible types.
     * @return the type of the if-statement.
     * @throws Exception when the types are not compatible
     */
    @Override
    public String typeCheck() throws Exception {
        String ifType = ifStatement.typeCheck();
        String elseType;
        try{
            elseType = elseStatement.typeCheck();
        }catch (NullPointerException e){
            elseType="void";
        }
        if(!ifType.equals(elseType)&&!elseType.equals("void")){
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