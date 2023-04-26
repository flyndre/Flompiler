package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import de.flyndre.flompiler.typecheker.Type;

import java.util.*;

/**
 * 
 */
public class Program {

    /**
     * Default constructor
     */
    public Program() {
    }

    /**
     * 
     */
    public List<Class> classes;

    public Program typeCheck() throws Exception {
        for(Class cl:classes){
            if(!cl.typeCheck().equals(Type.classType)){
                throw new Exception("The typechek of a class failed.");
            }
        }
        return this;
    }

}