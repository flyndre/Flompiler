package ScannerParserLexer.Syntaxtree;

import java.util.*;

/**
 * 
 */
public class Binary extends Expression {

    /**
     * Default constructor
     */
    public Binary() {
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expressionRight;

    /**
     * 
     */
    public Expression expressionLeft;

}