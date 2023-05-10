package de.flyndre.flompiler.results.basic;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import java.util.ArrayList;

/**
 * Results for parsing the empty class.
 */
public final class EmptyClassResults {

    /**
     * The manually parsed resulting untyped abstract syntax tree for the empty class.
     */
    public static final Program AST = buildAst();

    /**
     * The manually parsed resulting typed abstract syntax tree for the empty class.
     */
    public static final Program TYPED_AST = buildTypedAst();

    private static Program buildAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var emptyClass = new Class();
            emptyClass.access = "public";
            emptyClass.name = "EmptyClass";
            emptyClass.fields = new ArrayList<>();
            emptyClass.methods = new ArrayList<>();
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
                emptyClass.methods.add(constructor);
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