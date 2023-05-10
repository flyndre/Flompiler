package de.flyndre.flompiler.results.if_condition;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Block;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Method;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;

import java.util.ArrayList;

public class StaticIfResults {
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
            var staticIfClass = new Class();
            staticIfClass.access = "public";
            staticIfClass.name = "StaticIf";
            staticIfClass.fields = new ArrayList<>();
            staticIfClass.methods = new ArrayList<>();
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
                staticIfClass.methods.add(constructor);
            }
            {
                var stringMethod = new Method();
                stringMethod.access = "public";
                stringMethod.type = "String";
                stringMethod.name = "method";
                stringMethod.parameter = new ArrayList<>();
                var block = new Block();
                {

                }
                stringMethod.statement = block;
                staticIfClass.methods.add(stringMethod);
            }
            program.classes.add(staticIfClass);
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
