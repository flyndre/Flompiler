package de.flyndre.flompiler.results.if_condition;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

import java.util.ArrayList;

public class DynamicIfResults {
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
            clazz.name = "DynamicIf";
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
                    parameter.type = "boolean";
                    parameter.name = "returnOne";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.statements = new ArrayList<>();
                    {
                        var statement = new If();
                        {
                            var ifCondition = new LocalOrFieldVar();
                            ifCondition.name = "returnOne";
                            // TODO: @Lukas folgende Zeile existiert im ungetypten AST eigentlich nicht.
                            // TODO: Das muss eigentlich der Typ-Check rausfinden.
                            ifCondition.type = "int";
                            statement.condition = ifCondition;
                        }
                        {
                            var ifBlock = new Return();
                            {
                                var returnValue = new IntConst();
                                returnValue.value = 1;
                                returnValue.type = "int";
                                ifBlock.expression = returnValue;
                            }
                            statement.ifStatement = ifBlock;
                        }
                        block.statements.add(statement);
                    }
                    {
                        var returnStatement = new Return();
                        {
                            var returnValue = new IntConst();
                            returnValue.value = 2;
                            returnValue.type = "int";
                            returnStatement.expression = returnValue;
                        }
                        block.statements.add(returnStatement);
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
            clazz.name = "DynamicIf";
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
                    parameter.type = "boolean";
                    parameter.name = "returnOne";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.type = "int";
                    block.statements = new ArrayList<>();
                    {
                        var statement = new If();
                        statement.type = "int";
                        {
                            var ifCondition = new LocalOrFieldVar();
                            ifCondition.name = "returnOne";
                            ifCondition.type = "int";
                            statement.condition = ifCondition;
                        }
                        {
                            var ifBlock = new Return();
                            ifBlock.type = "int";
                            {
                                var returnValue = new IntConst();
                                returnValue.value = 1;
                                returnValue.type = "int";
                                ifBlock.expression = returnValue;
                            }
                            statement.ifStatement = ifBlock;
                        }
                        block.statements.add(statement);
                    }
                    {
                        var returnStatement = new Return();
                        returnStatement.type = "int";
                        {
                            var returnValue = new IntConst();
                            returnValue.value = 2;
                            returnValue.type = "int";
                            returnStatement.expression = returnValue;
                        }
                        block.statements.add(returnStatement);
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
}
