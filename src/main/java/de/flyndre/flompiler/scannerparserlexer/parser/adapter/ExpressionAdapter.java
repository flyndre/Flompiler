package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

public class ExpressionAdapter {
    public static Expression adapt(MiniJavaParser.ExpressionContext ctx) throws Exception {
        if(ctx.BOOLEAN() != null){
            return new BooleanConst(Boolean.valueOf(ctx.BOOLEAN().getText()), "boolean");
        }
        else if(ctx.NAME() != null){
            return new LocalOrFieldVar(ctx.NAME().getText());
        }
        else if(ctx.CHAR() != null){
            return new CharConst(ctx.CHAR().getText().charAt(0), "char");
        }
        else if(ctx.STRING() != null){
            return new StringConst(ctx.STRING().getText(), "String");
        }
        else if(ctx.INTEGER() != null){
            return new IntConst(Integer.parseInt(ctx.INTEGER().getText()), "int");
        }
        else if(ctx.statementexpression() != null){
            return new StatemenExpressionExpression(StatementExpressionAdapter.adapt(ctx.statementexpression()));
        }
        else if(ctx.equalityexpression() != null){
            return EqualityExpressionAdapter.adapt(ctx.equalityexpression());
        }
        throw new RuntimeException();
    }
}
