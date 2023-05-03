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