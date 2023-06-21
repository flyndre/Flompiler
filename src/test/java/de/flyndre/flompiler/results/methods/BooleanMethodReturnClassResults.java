package de.flyndre.flompiler.results.methods;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

import java.util.ArrayList;

public class BooleanMethodReturnClassResults {
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
            var clazz = new Class();
            clazz.access = "public";
            clazz.name = "BooleanMethodReturn";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "boolean";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.type = "boolean";
                    parameter.name = "isTrue";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        {
                            var expression = new LocalOrFieldVar();
                            expression.name = "isTrue";
                            statement.expression = expression;
                        }
                        block.statements.add(statement);
                    }
                    method.statement = block;
                }
                clazz.methods.add(method);
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
                clazz.methods.add(constructor);
            }
            program.classes.add(clazz);
        }

        return program;
    }

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var clazz = new Class();
            clazz.access = "public";
            clazz.name = "BooleanMethodReturn";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "boolean";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.type = "boolean";
                    parameter.name = "isTrue";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.type = "boolean";
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        statement.type = "boolean";
                        {
                            var expression = new LocalOrFieldVar();
                            expression.type = "boolean";
                            expression.name = "isTrue";
                            statement.expression = expression;
                        }
                        block.statements.add(statement);
                    }
                    method.statement = block;
                }
                clazz.methods.add(method);
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
                clazz.methods.add(constructor);
            }
            program.classes.add(clazz);
        }

        return program;
    }
}
