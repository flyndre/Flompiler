package de.flyndre.flompiler.results.methods;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;

public class StringMethodClassResults {
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
            emptyClass.name = "StringMethod";
            emptyClass.fields = new ArrayList<>();
            emptyClass.methods = new ArrayList<>();
            {
                var booleanMethod = new Method();
                booleanMethod.access = "public";
                booleanMethod.type = "String";
                booleanMethod.name = "method";
                booleanMethod.parameter = new ArrayList<>();
                {
                    var block = new Block();
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        {
                            var expression = new StringConst();
                            expression.value = "Hello World!";
                            statement.expression = expression;
                        }
                        block.statements.add(statement);
                    }
                    booleanMethod.statement = block;
                }
                emptyClass.methods.add(booleanMethod);
            }
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
            emptyClass.name = "StringMethod";
            emptyClass.fields = new ArrayList<>();
            emptyClass.methods = new ArrayList<>();
            {
                var booleanMethod = new Method();
                booleanMethod.access = "public";
                booleanMethod.type = "String";
                booleanMethod.name = "method";
                booleanMethod.parameter = new ArrayList<>();
                {
                    var block = new Block();
                    block.type = "String";
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        statement.type = "String";
                        {
                            var expression = new StringConst();
                            expression.value = "Hello World!";
                            expression.type = "String";
                            statement.expression = expression;
                        }
                        block.statements.add(statement);
                    }
                    booleanMethod.statement = block;
                }
                emptyClass.methods.add(booleanMethod);
            }
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
                emptyClass.methods.add(constructor);
            }
            program.classes.add(emptyClass);
        }

        return program;
    }
}
