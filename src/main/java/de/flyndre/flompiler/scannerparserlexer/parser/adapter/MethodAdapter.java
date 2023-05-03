package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;

import java.util.List;

public class MethodAdapter {

    public static Method adapt(MiniJavaParser.MethoddeclarationContext ctx) {
        return new Method();
    }
}
