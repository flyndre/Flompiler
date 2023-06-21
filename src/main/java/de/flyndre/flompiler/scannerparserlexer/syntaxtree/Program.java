package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

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
    public Program(List<Class> classes) {
        this.classes = classes;
    }
    /**
     * 
     */
    public List<Class> classes;

    /**
     * Type check for the complete Programm. Checks and sets the types of all classes contained in this programm.
     * @return the typed programm.
     * @throws Exception if the type check of a class failed.
     */
    public Program typeCheck() throws Exception {
        classes.forEach(aClass -> {
            try {
                aClass.typeCheck();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        return this;
    }

}