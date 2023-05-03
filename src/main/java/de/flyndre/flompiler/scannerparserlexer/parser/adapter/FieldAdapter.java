package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Field;

import java.util.ArrayList;
import java.util.List;

public class FieldAdapter {

    public static Field adapt(MiniJavaParser.FielddeclarationContext ctx){

        Field newField = new Field();
        if(ctx != null){
            if(ctx.booldeclaration() != null){
                newField = new Field(ctx.booldeclaration().NAME().getText(),
                        ctx.booldeclaration().accessMod().getText(),
                        "boolean",
                        "false"
                );

                if(ctx.booldeclaration().BOOLEAN() != null){
                    newField.standardValue = ctx.booldeclaration().BOOLEAN().getText();
                }

            }else if(ctx.chardeclaration() != null){
                newField = new Field(ctx.chardeclaration().NAME().getText(),
                        ctx.chardeclaration().accessMod().getText(),
                        "char",
                        ""
                );

                if(ctx.chardeclaration().CHAR() != null){
                    newField.standardValue = ctx.chardeclaration().CHAR().getText();
                }

            }else if(ctx.intdeclaration() != null){
                newField = new Field(ctx.intdeclaration().NAME().getText(),
                        ctx.intdeclaration().accessMod().getText(),
                        "int",
                        "0"
                );

                if(ctx.intdeclaration().INTEGER() != null){
                    newField.standardValue = ctx.intdeclaration().INTEGER().getText();
                }

            }else if(ctx.stringdeclaration() != null){
                newField = new Field(ctx.stringdeclaration().NAME().getText(),
                        ctx.stringdeclaration().accessMod().getText(),
                        "String",
                        ""
                );

                if(ctx.stringdeclaration().STRING() != null) {
                    newField.standardValue = ctx.stringdeclaration().STRING().getText();
                }
            }
        }
        return newField;
    }
}
