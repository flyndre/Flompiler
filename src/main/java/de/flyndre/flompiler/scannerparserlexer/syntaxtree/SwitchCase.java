package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class SwitchCase extends Statement {

    /**
     * Default constructor
     */
    public SwitchCase() {
    }

    /**
     *
     * @return void due to not implemented class SwitchCase
     */
    @Override
    public String typeCheck()  {
        return type = "void";
    }

}