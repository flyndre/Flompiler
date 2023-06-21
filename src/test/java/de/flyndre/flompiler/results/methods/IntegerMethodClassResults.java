package de.flyndre.flompiler.results.methods;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

import java.util.ArrayList;

public class IntegerMethodClassResults {
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
            clazz.name = "IntegerMethod";
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
                        // int returnValue;

                        var statement = new LocalVarDecl();
                        statement.type = "int";
                        statement.name = "returnValue";
                        block.statements.add(statement);
                    }
                    {
                        // returnValue = number + 2;

                        var statement = new Assign();
                        statement.type = "void";
                        statement.operator = "=";
                        {
                            var variable = new LocalOrFieldVar();
                            variable.name = "returnValue";
                            statement.var = variable;
                        }
                        {
                            var addition = new Binary();
                            addition.operator = "+";
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
                        block.statements.add(new StatementExprStatement(statement));
                    }
                    {
                        // return returnValue;

                        var statement = new Return();
                        {
                            var returnVar = new LocalOrFieldVar();
                            returnVar.name = "returnValue";
                            returnVar.type = "int";
                            statement.expression = returnVar;
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
            clazz.name = "IntegerMethod";
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
                        // int returnValue;

                        var statement = new LocalVarDecl();
                        statement.type = "int";
                        statement.name = "returnValue";
                        block.statements.add(statement);
                    }
                    {
                        // returnValue = number + 2;

                        var statement = new Assign();
                        statement.type = "int";
                        statement.operator = "=";
                        {
                            var variable = new LocalOrFieldVar();
                            variable.type = "int";
                            variable.name = "returnValue";
                            statement.var = variable;
                        }
                        {
                            var addition = new Binary();
                            addition.operator = "+";
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
                        block.statements.add(new StatementExprStatement(statement));
                    }
                    {
                        // return returnValue;

                        var statement = new Return();
                        statement.type = "int";
                        {
                            var returnVar = new LocalOrFieldVar();
                            returnVar.name = "returnValue";
                            returnVar.type = "int";
                            statement.expression = returnVar;
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
