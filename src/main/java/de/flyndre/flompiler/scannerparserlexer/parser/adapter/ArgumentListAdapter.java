package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Expression;

import java.util.ArrayList;
import java.util.List;

public class ArgumentListAdapter {
    public static List<Expression> adapt(MiniJavaParser.ArgumentlistContext argumentlist) throws Exception {
        List<Expression> exprs = new ArrayList<>();
        if(argumentlist != null && argumentlist.expression() != null){
            exprs.add(ExpressionAdapter.adapt(argumentlist.expression()));
        }
        if(argumentlist != null && argumentlist.argumentlist() != null){
            exprs.addAll(adapt(argumentlist.argumentlist()));
        }
        return exprs;
    }
}
