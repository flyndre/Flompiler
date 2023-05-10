package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;

import java.util.ArrayList;
import java.util.List;

public class MethodAdapter {

    public static Method adapt(MiniJavaParser.MethoddeclarationContext ctx) {
        if(ctx.type() != null && ctx.NAME() != null && ctx.accessMod() != null){
            Block block = new Block();
            block.statements = new ArrayList<>();

            return new Method(ctx.type().getText(),
                    ctx.NAME().getText(),
                    new ArrayList<>(),
                    block,
                    ctx.accessMod().getText());
        }else{
            throw new RuntimeException();
        }
    }


}
