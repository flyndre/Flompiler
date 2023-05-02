package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Field;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClassAdapter {
    public static List<Class> adapt(parser.MiniJavaParser.ClassContext ctx) {
        List<Class> elements = new ArrayList<>();
        if(ctx.accessMod() != null && ctx.NAME() != null){
            elements.add(new Class(ctx.NAME().getText(), ctx.accessMod().getText(), new ArrayList<>(), new ArrayList<>()));
        }
        return elements;
    }
}
