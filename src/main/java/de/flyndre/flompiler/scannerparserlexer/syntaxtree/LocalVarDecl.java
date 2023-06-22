package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class LocalVarDecl extends Statement {

    /**
     * Default constructor
     */
    public LocalVarDecl() {
    }

    /**
     * @return The type of the local var.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters)  {
        parameters.add(new Parameter(this.name,this.type));
        return type;
    }

    /**
     * 
     */
    public String name;

    public LocalVarDecl( String name, String type){
        this.name = name;
        this.type = type;
    }

}