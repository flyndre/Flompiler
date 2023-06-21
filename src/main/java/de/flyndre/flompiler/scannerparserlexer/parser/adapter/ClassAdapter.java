package de.flyndre.flompiler.scannerparserlexer.parser.adapter;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClassAdapter {
    public static List<Class> adapt(MiniJavaParser.ClassesContext ctx) throws Exception {
        List<Class> elements = new ArrayList<>();
        if(ctx.classes() != null){
             List<Class> subs = ClassAdapter.adapt(ctx.classes());
             elements.addAll(subs);
        }
        if(ctx.class_() != null && ctx.class_().accessMod() != null && ctx.class_().NAME() != null){

            List<Method> methods = new ArrayList<>();
            List<Field> fields = new ArrayList<>();

            if(ctx.class_().classbody() != null){
                   methods.addAll(StatementAdapter.adaptMethods(ctx.class_().classbody()));
                   fields.addAll(StatementAdapter.adaptFields(ctx.class_().classbody()));
            }

            boolean hasConstructor = false;

            for(Method method : methods){
                if(method.name.equals(ctx.class_().NAME().toString())){
                    hasConstructor = true;
                    method.name = "<init>";
                }
            }

            if(methods.size() == 0 || !hasConstructor){

                Block b = new Block();
                b.statements = new ArrayList<>();

                methods.add(new Method("void", "<init>", new ArrayList<>(), b, "public"));
            }

            elements.add(new Class(ctx.class_().NAME().getText(), ctx.class_().accessMod().getText(), fields, methods));
        }
        return elements;
    }
}
