package ScannerParserLexer.Syntaxtree;

import ScannerParserLexer.Syntaxtree.StatementExpression;

import java.util.*;

/**
 * 
 */
public class Assign extends StatementExpression {

    /**
     * Default constructor
     */
    public Assign() {
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

    /**
     * 
     */
    public LocalOrFieldVar var;

}