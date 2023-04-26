package ScannerParserLexer.Syntaxtree;

import java.util.*;

/**
 * 
 */
public class If extends Statement {

    /**
     * Default constructor
     */
    public If() {
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