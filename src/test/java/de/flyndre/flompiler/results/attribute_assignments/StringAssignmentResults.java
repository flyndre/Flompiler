package de.flyndre.flompiler.results.attribute_assignments;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;

/**
 * Results for parsing the boolean-class.
 */
public final class StringAssignmentResults {

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
            var stringClass = new Class();
            stringClass.access = "public";
            stringClass.name = "StringAssignment";
            stringClass.fields = new ArrayList<>();
            {
                var stringField = new Field();
                stringField.access = "public";
                stringField.type = "String";
                stringField.name = "word";
                stringField.standardValue = "\"Hello World!\"";
                stringClass.fields.add(stringField);
            }
            stringClass.methods = new ArrayList<>();
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
                stringClass.methods.add(constructor);
            }
            program.classes.add(stringClass);
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
                booleanClass.fields.add(isTrueField);
            }
            booleanClass.methods = new ArrayList<>();
            program.classes.add(booleanClass);
        }

        return program;
    }
}