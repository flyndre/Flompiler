package de.flyndre.flompiler.scannerparserlexer.parser.adapter;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClassAdapter {
    public static List<Class> adapt(MiniJavaParser.ClassesContext ctx) {
        List<Class> elements = new ArrayList<>();
        if(ctx.classes() != null){
             List<Class> subs = ClassAdapter.adapt(ctx.classes());
             elements.addAll(subs);
        }
        if(ctx.class_() != null && ctx.class_().accessMod() != null && ctx.class_().NAME() != null){

            List<Method> methods = new ArrayList<>();

            if(ctx.class_().block() != null){
                   methods.addAll(StatementAdapter.adaptMethods(ctx.class_().block().statements()));
            }

            elements.add(new Class(ctx.class_().NAME().getText(), ctx.class_().accessMod().getText(), new ArrayList<>(), methods));
        }
        return elements;
    }
}
