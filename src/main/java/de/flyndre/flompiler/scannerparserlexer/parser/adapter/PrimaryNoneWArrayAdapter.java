package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatemenExpressionExpression;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.This;

public class PrimaryNoneWArrayAdapter {
    public static Expression adapt(MiniJavaParser.PrimarynonewarrayContext primarynonewarray) throws Exception {
        if(primarynonewarray.expression() != null){
            return ExpressionAdapter.adapt(primarynonewarray.expression());
        }
        else if(primarynonewarray.classinstancecreationexpression() != null){
            return ClassInstanceCreationExpressionAdapter.adapt(primarynonewarray.classinstancecreationexpression());
        }
        else if(primarynonewarray.fieldaccess() != null){
            return FieldAccessAdapter.adapt(primarynonewarray.fieldaccess());
        }
        else if(primarynonewarray.methodinvocation() != null){
            return new StatemenExpressionExpression(MethodInvocationAdapter.adapt(primarynonewarray.methodinvocation()));
        }
        else if(primarynonewarray.THIS() != null){
            return new This();
        }
        else if(primarynonewarray.literal() != null){
            return LiteralAdapter.adapt(primarynonewarray.literal());
        }
        throw new Exception();

    }
}
