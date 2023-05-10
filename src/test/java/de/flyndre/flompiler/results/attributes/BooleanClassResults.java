package de.flyndre.flompiler.results.attributes;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

/**
 * Results for parsing the boolean-class.
 */
public final class BooleanClassResults {

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
            var booleanClass = new Class();
            booleanClass.access = "public";
            booleanClass.name = "BooleanClass";
            booleanClass.fields = new ArrayList<>();
            {
                var isTrueField = new Field();
                isTrueField.access = "public";
                isTrueField.type = "boolean";
                isTrueField.name = "isTrue";
                isTrueField.standardValue = "false";
                booleanClass.fields.add(isTrueField);
            }
            booleanClass.methods = new ArrayList<>();
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
                booleanClass.methods.add(constructor);
            }
            program.classes.add(booleanClass);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var booleanClass = new Class();
            booleanClass.access = "public";
            booleanClass.name = "BooleanClass";
            booleanClass.fields = new ArrayList<>();
            {
                var isTrueField = new Field();
                isTrueField.access = "public";
                isTrueField.type = "boolean";
                isTrueField.name = "isTrue";
                isTrueField.standardValue = "false";
                booleanClass.fields.add(isTrueField);
            }
            booleanClass.methods = new ArrayList<>();
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
                booleanClass.methods.add(constructor);
            }
            program.classes.add(booleanClass);
        }

        return program;
    }
}