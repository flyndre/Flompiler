package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {
    public static List<Method> adaptMethods(MiniJavaParser.StatementsContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.statement() != null){
            if(ctx.statement().methoddeclaration() != null){
                methods.add(MethodAdapter.adapt(ctx.statement().methoddeclaration()));
            }
            if(ctx.statements() != null){
                methods.addAll(adaptMethods(ctx.statements()));
            }
        }
        return methods;
    }

    public static List<Field> adaptFields(MiniJavaParser.StatementsContext ctx) {
        List<Field> fields = new ArrayList<>();
        if(ctx != null && ctx.statement() != null && ctx.statement().fielddeclaration() != null){
            fields.add(FieldAdapter.adapt(ctx.statement().fielddeclaration()));
        }
        if(ctx.statements() != null){
            fields.addAll(adaptFields(ctx.statements()));
        }
        return fields;
        }

    }
