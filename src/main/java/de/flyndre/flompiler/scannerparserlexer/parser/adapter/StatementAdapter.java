package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.StatementExprStatement;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {
    public static List<Method> adaptMethods(MiniJavaParser.StatementsContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.statement() != null){
            if(ctx.statement().methoddeclaration() != null){
                methods.add(new Method(ctx.statement().methoddeclaration().type().getText(),
                                    ctx.statement().methoddeclaration().NAME().getText(),
                                    new ArrayList<>(),
                                    new StatementExprStatement()));
            }

            if(ctx.statements() != null){
                methods.addAll(adaptMethods(ctx.statements()));
            }
        }

        return methods;
    }

  //  public static List<Method> adaptFields(MiniJavaParser.StatementsContext ctx) {


    //}
}
