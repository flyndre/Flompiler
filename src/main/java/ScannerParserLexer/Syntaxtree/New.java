package ScannerParserLexer.Syntaxtree;

import java.util.*;

/**
 * 
 */
public class New extends StatementExpression {

    /**
     * Default constructor
     */
    public New() {
    }

    /**
     * 
     */
    public String type;

    /**
     * 
     */
    public List<Expression> constructorParams;

}