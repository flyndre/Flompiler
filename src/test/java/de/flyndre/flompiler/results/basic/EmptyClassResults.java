package de.flyndre.flompiler.results.basic;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import java.util.ArrayList;
import java.util.List;

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
        {
            var emptyClass = new Class();
            {
                emptyClass.access = "public";
                emptyClass.name = "EmptyClass";
                emptyClass.fields = new ArrayList<>();
                emptyClass.methods = new ArrayList<>();
            }
            program.classes = List.of(emptyClass);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        return program;
    }
}