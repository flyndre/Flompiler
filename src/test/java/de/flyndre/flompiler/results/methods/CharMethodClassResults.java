package de.flyndre.flompiler.results.methods;

import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;

import java.util.ArrayList;

public class CharMethodClassResults {
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
            clazz.name = "CharMethod";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "char";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.name = "symbol";
                    parameter.type = "char";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        {
                            var parameterVar = new LocalOrFieldVar();
                            parameterVar.name = "symbol";
                            // TODO: Remove because typecheck is responsible for this
                            parameterVar.type = "char";
                            statement.expression = parameterVar;
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
            clazz.name = "CharMethod";
            clazz.fields = new ArrayList<>();
            clazz.methods = new ArrayList<>();
            {
                var method = new Method();
                method.access = "public";
                method.type = "char";
                method.name = "method";
                method.parameter = new ArrayList<>();
                {
                    var parameter = new Parameter();
                    parameter.name = "symbol";
                    parameter.type = "char";
                    method.parameter.add(parameter);
                }
                {
                    var block = new Block();
                    block.type = "char";
                    block.statements = new ArrayList<>();
                    {
                        var statement = new Return();
                        statement.type = "char";
                        {
                            var parameterVar = new LocalOrFieldVar();
                            parameterVar.name = "symbol";
                            parameterVar.type = "char";
                            statement.expression = parameterVar;
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
