package de.flyndre.flompiler.scannerparserlexer.parser.adapter;
import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
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
            elements.add(new Class(ctx.class_().NAME().getText(), ctx.class_().accessMod().getText(), new ArrayList<>(), new ArrayList<>()));

        }
        return elements;
    }
}
