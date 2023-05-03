package de.flyndre.flompiler.results.methods;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;

public class BooleanMethodClassResults {
    /**
     * The manually parsed resulting untyped abstract syntax tree for the class with a boolean method.
     */
    public static final Program AST = buildAst();

    /**
     * The manually parsed resulting typed abstract syntax tree for the class with a boolean method.
     */
    public static final Program TYPED_AST = buildTypedAst();

    private static Program buildAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var emptyClass = new Class();
            emptyClass.access = "public";
            emptyClass.name = "BooleanMethod";
            emptyClass.fields = new ArrayList<>();
            emptyClass.methods = new ArrayList<>();
            {
                var booleanMethod = new Method();
                booleanMethod.access = "public";
                booleanMethod.type = "boolean";
                booleanMethod.name = "method";
                booleanMethod.parameter = new ArrayList<>();
                booleanMethod.statement = new Block();
                emptyClass.methods.add(booleanMethod);
            }
            program.classes.add(emptyClass);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var emptyClass = new Class();
            emptyClass.access = "public";
            emptyClass.name = "EmptyClass";
            emptyClass.fields = new ArrayList<>();
            emptyClass.methods = new ArrayList<>();
            program.classes.add(emptyClass);
        }

        return program;
    }
}
