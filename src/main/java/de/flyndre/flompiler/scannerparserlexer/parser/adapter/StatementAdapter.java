package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {
    public static List<Method> adaptMethods(MiniJavaParser.ClassbodyContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.methoddeclaration() != null){
            if(ctx.methoddeclaration() != null){
                methods.add(MethodAdapter.adapt(ctx.methoddeclaration()));
            }
            if(ctx.classbody() != null){
                methods.addAll(adaptMethods(ctx.classbody()));
            }
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
