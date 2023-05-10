package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.CharConst;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Parameter;

import java.util.ArrayList;
import java.util.List;

public class ParameterAdapter {


    public static List<Parameter> adapt(MiniJavaParser.ParametersContext ctx) {

        List<Parameter> params = new ArrayList<>();

        if(ctx.parameter() != null && ctx.parameter().NAME() != null){

            if(ctx.parameter().CHARTYPE() != null){
                params.add(new Parameter(ctx.parameter().NAME().getText(), "char"));

            } else if (ctx.parameter().BOOLEANTYPE() != null) {
                params.add(new Parameter(ctx.parameter().NAME().getText(), "boolean"));

            } else if(ctx.parameter().STRINGTYPE() != null){
                params.add(new Parameter(ctx.parameter().NAME().getText(), "String"));

            }else if(ctx.parameter().INTTYPE() != null){
                params.add(new Parameter(ctx.parameter().NAME().getText(), "int"));

            }
        }

        if(ctx.parameters() != null){
            params.addAll(ParameterAdapter.adapt(ctx.parameters()));
        }

        return params;
    }
}

