package de.flyndre.flompiler.results.operators;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

import java.util.ArrayList;

public class SubtractResults {
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
            clazz.name = "Subtract";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "int";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.name = "number";
                    parameter.type = "int";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        {
                            var addition = new Binary();
                            addition.operator = "-";
                            {
                                var parameterVar = new LocalOrFieldVar();
                                parameterVar.name = "number";
                                addition.expressionLeft = parameterVar;
                            }
                            {
                                var intConst = new IntConst();
                                intConst.value = 2;
                                intConst.type = "int";
                                addition.expressionRight = intConst;
                            }
                            statement.expression = addition;
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

    private static Program buildTypedAst() {
        var program = new Program();
        program.classes = new ArrayList<>();
        {
            var clazz = new Class();
            clazz.access = "public";
            clazz.name = "Subtract";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "int";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.name = "number";
                    parameter.type = "int";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.type = "int";
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        statement.type = "int";
                        {
                            var addition = new Binary();
                            addition.operator = "-";
                            addition.type = "int";
                            {
                                var parameterVar = new LocalOrFieldVar();
                                parameterVar.name = "number";
                                parameterVar.type = "int";
                                addition.expressionLeft = parameterVar;
                            }
                            {
                                var intConst = new IntConst();
                                intConst.value = 2;
                                intConst.type = "int";
                                addition.expressionRight = intConst;
                            }
                            statement.expression = addition;
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
