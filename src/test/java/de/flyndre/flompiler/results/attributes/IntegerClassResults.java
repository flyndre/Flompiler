package de.flyndre.flompiler.results.attributes;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;

/**
 * Results for parsing the boolean-class.
 */
public final class IntegerClassResults {

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
            var integerClass = new Class();
            integerClass.access = "public";
            integerClass.name = "IntegerClass";
            integerClass.fields = new ArrayList<>();
            {
                var integerField = new Field();
                integerField.access = "public";
                integerField.type = "int";
                integerField.name = "number";
                integerField.standardValue = "0";
                integerClass.fields.add(integerField);
            }
            integerClass.methods = new ArrayList<>();
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
                integerClass.methods.add(constructor);
            }
            program.classes.add(integerClass);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var integerClass = new Class();
            integerClass.access = "public";
            integerClass.name = "IntegerClass";
            integerClass.fields = new ArrayList<>();
            {
                var integerField = new Field();
                integerField.access = "public";
                integerField.type = "int";
                integerField.name = "number";
                integerField.standardValue = "0";
                integerClass.fields.add(integerField);
            }
            integerClass.methods = new ArrayList<>();
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
                integerClass.methods.add(constructor);
            }
            program.classes.add(integerClass);
        }

        return program;
    }
}