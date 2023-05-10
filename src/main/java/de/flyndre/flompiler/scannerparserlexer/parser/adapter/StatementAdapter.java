package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {

    public static Return adaptReturn(MiniJavaParser.ReturnstatementContext ctx){
        if(ctx.BOOLEAN() != null){
            return new Return(new BooleanConst(Boolean.valueOf(ctx.BOOLEAN().getText())));
        }
        else if(ctx.CHAR() != null){
            return new Return(new CharConst(ctx.CHAR().getText().charAt(0)));
        }
        else if(ctx.INTEGER() != null){
            return new Return(new IntConst(Integer.valueOf(ctx.INTEGER().getText())));
        }
        else if(ctx.STRING() != null){
            return new Return(new StringConst(ctx.STRING().getText()));
        }

        return new Return(new Null());
    }

    public static List<Statement> adapt(MiniJavaParser.StatementsContext ctx){
        List<Statement> statements = new ArrayList<>();
        if(ctx.statement() != null){
            if(ctx.statement().returnstatement() != null){
                statements.add(adaptReturn(ctx.statement().returnstatement()));
            }
        }
        if(ctx.statements() != null){
            statements.addAll(StatementAdapter.adapt(ctx.statements()));
        }

        return statements;
    }


    public static List<Method> adaptMethods(MiniJavaParser.ClassbodyContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.methoddeclaration() != null) {
            methods.add(MethodAdapter.adapt(ctx.methoddeclaration()));
        }

        if(ctx.classbody() != null){
            methods.addAll(adaptMethods(ctx.classbody()));
        }
        return methods;
    }

    public static List<Field> adaptFields(MiniJavaParser.ClassbodyContext ctx) {
        List<Field> fields = new ArrayList<>();
        if(ctx != null && ctx.fielddeclaration() != null){
            fields.add(FieldAdapter.adapt(ctx.fielddeclaration()));
        }
        if(ctx.classbody() != null){
            fields.addAll(adaptFields(ctx.classbody()));
        }
        return fields;
        }

    }
