package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Parameter;

import java.util.ArrayList;
import java.util.List;

public class MethodAdapter {

    public static Method adapt(MiniJavaParser.MethoddeclarationContext ctx) {
        if(ctx.type() != null && ctx.NAME() != null && ctx.accessMod() != null){
            Block block = new Block();

            List<Parameter> parameters = new ArrayList<>();


            if(ctx.parameters() != null){
                parameters.addAll(ParameterAdapter.adapt(ctx.parameters()));
            }

            if(ctx.block() != null){
              block = BlockAdapter.adapt(ctx.block());
            }


            return new Method(ctx.type().getText(),
                    ctx.NAME().getText(),
                    parameters,
                    block,
                    ctx.accessMod().getText());
        }else{
            throw new RuntimeException();
        }
    }


}
