package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class LocalOrFieldVar extends Expression {

    /**
     * Default constructor
     */
    public LocalOrFieldVar() {
    }

    public LocalOrFieldVar(String name) {
        this.name = name;
    }

    /**
     * @return The type of the Var.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception  {

        fields.forEach(field -> {
            if(field.name.equals(this.name)){
                this.type = field.type;
            }
        });

        parameters.forEach(param -> {
            if (param.name.equals(this.name)){
                this.type =  param.type;
            }
        });
        if(this.type !=null){
            return type;
        }
        throw new Exception(String.format("For the field or parameter {0} was no type found.",this.name));
    }

    /**
     * 
     */
    public String name;

}