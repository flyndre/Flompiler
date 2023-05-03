package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {
    public static List<Method> adaptMethods(MiniJavaParser.StatementsContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.statement() != null){
            if(ctx.statement().methoddeclaration() != null){
                if(ctx.statement().methoddeclaration().type() != null && ctx.statement().methoddeclaration().NAME() != null){
                    methods.add(new Method(ctx.statement().methoddeclaration().type().getText(),
                                    ctx.statement().methoddeclaration().NAME().getText(),
                                    new ArrayList<>(),
                                    new Block(),
                                    ctx.statement().methoddeclaration().accessMod().getText()));
                }else{
                    throw new RuntimeException();
                }
            }

            if(ctx.statements() != null){
                methods.addAll(adaptMethods(ctx.statements()));
            }
        }

        return methods;
    }

    public static List<Field> adaptFields(MiniJavaParser.StatementsContext ctx) {
        List<Field> fields = new ArrayList<>();
        if(ctx != null && ctx.statement() != null){
            if(ctx.statement().fielddeclaration() != null){
                MiniJavaParser.FielddeclarationContext fielddeclarationContext = ctx.statement().fielddeclaration();
                if(fielddeclarationContext.booldeclaration() != null){
                    Field newField = new Field(fielddeclarationContext.booldeclaration().NAME().getText(),
                                         fielddeclarationContext.booldeclaration().accessMod().getText(),
                                         "boolean",
                                         "false"
                                         );

                    if(fielddeclarationContext.booldeclaration().BOOLEAN() != null){
                        newField.standardValue = fielddeclarationContext.booldeclaration().BOOLEAN().getText();
                    }

                }else if(fielddeclarationContext.chardeclaration() != null){
                    Field newField = new Field(fielddeclarationContext.chardeclaration().NAME().getText(),
                            fielddeclarationContext.chardeclaration().accessMod().getText(),
                            "char",
                            ""
                    );

                    if(fielddeclarationContext.chardeclaration().CHAR() != null){
                        newField.standardValue = fielddeclarationContext.chardeclaration().CHAR().getText();
                    }

                }else if(fielddeclarationContext.intdeclaration() != null){
                    Field newField = new Field(fielddeclarationContext.intdeclaration().NAME().getText(),
                            fielddeclarationContext.intdeclaration().accessMod().getText(),
                            "int",
                            "0"
                    );

                    if(fielddeclarationContext.intdeclaration().INTEGER() != null){
                        newField.standardValue = fielddeclarationContext.intdeclaration().INTEGER().getText();
                    }

                }else if(fielddeclarationContext.stringdeclaration() != null){
                    Field newField = new Field(fielddeclarationContext.stringdeclaration().NAME().getText(),
                            fielddeclarationContext.stringdeclaration().accessMod().getText(),
                            "String",
                            ""
                    );

                    if(fielddeclarationContext.stringdeclaration().STRING() != null){
                        newField.standardValue = fielddeclarationContext.stringdeclaration().STRING().getText();
                    }
                }
                fields.add(new Field());
            }

            if(ctx.statements() != null){
                fields.addAll(adaptFields(ctx.statements()));
            }
        }

        return fields;
    }
}
