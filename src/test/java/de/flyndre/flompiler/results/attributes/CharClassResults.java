package de.flyndre.flompiler.results.attributes;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;

/**
 * Results for parsing the boolean-class.
 */
public final class CharClassResults {

    /**
     * The manually parsed resulting untyped abstract syntax tree for the boolean-class.
     */
    public static final Program AST = buildAst();

    /**
     * The manually parsed resulting typed abstract syntax tree for the boolean-class.
     */
    public static final Program TYPED_AST = buildTypedAst();

    private static Program buildAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var charClass = new Class();
            charClass.access = "public";
            charClass.name = "CharClass";
            charClass.fields = new ArrayList<>();
            {
                var charField = new Field();
                charField.access = "public";
                charField.type = "char";
                charField.name = "symbol";
                charField.standardValue = "";
                charClass.fields.add(charField);
            }
            charClass.methods = new ArrayList<>();
            {
                var constructor = new Method();
                constructor.type = "void";
                constructor.access = "public";
                constructor.name = "<init>";
                constructor.parameter = new ArrayList<>();
                var block = new Block();
                {
                    block.statements = new ArrayList<>();
                }
                constructor.statement = block;
                charClass.methods.add(constructor);
            }
            program.classes.add(charClass);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var charClass = new Class();
            charClass.access = "public";
            charClass.name = "CharClass";
            charClass.fields = new ArrayList<>();
            {
                var charField = new Field();
                charField.access = "public";
                charField.type = "char";
                charField.name = "symbol";
                charField.standardValue = "";
                charClass.fields.add(charField);
            }
            charClass.methods = new ArrayList<>();
            {
                var constructor = new Method();
                constructor.type = "void";
                constructor.access = "public";
                constructor.name = "<init>";
                constructor.parameter = new ArrayList<>();
                var block = new Block();
                {
                    block.statements = new ArrayList<>();
                    block.type = "void";
                }
                constructor.statement = block;
                charClass.methods.add(constructor);
            }
            program.classes.add(charClass);
        }

        return program;
    }
}