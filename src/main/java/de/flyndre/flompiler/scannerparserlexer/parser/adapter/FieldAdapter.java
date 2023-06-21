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

            }else if(ctx.charFieldDecl() != null){
                newField = new Field(ctx.charFieldDecl().NAME().getText(),
                        ctx.charFieldDecl().accessMod().getText(),
                        "char",
                        ""
                );

                if(ctx.charFieldDecl().CHAR() != null){
                    newField.standardValue = ctx.charFieldDecl().CHAR().getText();
                }

            }else if(ctx.intFieldDecl() != null){
                newField = new Field(ctx.intFieldDecl().NAME().getText(),
                        ctx.intFieldDecl().accessMod().getText(),
                        "int",
                        "0"
                );

                if(ctx.intFieldDecl().INTEGER() != null){
                    newField.standardValue = ctx.intFieldDecl().INTEGER().getText();
                }

            }else if(ctx.stringFieldDecl() != null){
                newField = new Field(ctx.stringFieldDecl().NAME().getText(),
                        ctx.stringFieldDecl().accessMod().getText(),
                        "String",
                        ""
                );

                if(ctx.stringFieldDecl().STRING() != null) {
                    newField.standardValue = ctx.stringFieldDecl().STRING().getText();
                }
            }
        }
        return newField;
    }
}
