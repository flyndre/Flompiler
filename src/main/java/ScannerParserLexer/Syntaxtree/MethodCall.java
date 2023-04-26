package ScannerParserLexer.Syntaxtree;

import java.util.*;

/**
 * 
 */
public class MethodCall extends StatementExpression {

    /**
     * Default constructor
     */
    public MethodCall() {
    }

    /**
     * 
     */
    public Expression expr;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public List expressions;

}