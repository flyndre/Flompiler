package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import de.flyndre.flompiler.scannerparserlexer.parser.MiniJavaParser;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.*;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Class;

import java.util.ArrayList;
import java.util.List;

public class StatementAdapter {

    public static Return adaptReturn(MiniJavaParser.ReturnstatementContext ctx){
        if(ctx.BOOLEAN() != null){
            return new Return(new BooleanConst(Boolean.valueOf(ctx.BOOLEAN().getText())));
        }
        else if(ctx.CHAR() != null){
            return new Return(new CharConst(ctx.CHAR().getText().charAt(0)));
        }
        else if(ctx.INTEGER() != null){
            return new Return(new IntConst(Integer.valueOf(ctx.INTEGER().getText())));
        }
        else if(ctx.STRING() != null){
            return new Return(new StringConst(ctx.STRING().getText()));
        }
        return new Return(new Null());
    }

    public static List<Statement> adapt(MiniJavaParser.StatementsContext ctx){
        List<Statement> statements = new ArrayList<>();
        if(ctx.statement() != null){
            statements.add(adaptStatement(ctx.statement()));
        }
        if(ctx.statements() != null){
            statements.addAll(StatementAdapter.adapt(ctx.statements()));
        }

        return statements;
    }

    public static Statement adaptStatement(MiniJavaParser.StatementContext ctx){
        if(ctx.returnstatement() != null){
            return adaptReturn(ctx.returnstatement());
        }
        else if(ctx.ifstatement() != null){
            return adaptIf(ctx.ifstatement());
        }
        else if(ctx.ifelsestatement() != null){
            return adaptIfElse(ctx.ifelsestatement());
        }
        else if(ctx.while_() != null){
            return adaptWhile(ctx.while_());
        }
        throw new RuntimeException();
    }

    public static While adaptWhile(MiniJavaParser.WhileContext ctx){
        if(ctx.expression() != null && ctx.statement() != null){
            Expression exp = ExpressionAdapter.adapt(ctx.expression());
            Statement statement = adaptStatement(ctx.statement());
            return new While(exp, statement);
        }
        else if(ctx.expression() != null && ctx.block() != null){
            Expression exp = ExpressionAdapter.adapt(ctx.expression());
            Block block = BlockAdapter.adapt(ctx.block());
            return new While(exp, block);
        }
        throw new RuntimeException();
    }

    public static If adaptIf(MiniJavaParser.IfstatementContext ctx){
        if(ctx.statement() != null && ctx.expression() != null){
            Expression e = ExpressionAdapter.adapt(ctx.expression());
            Statement ifSatement =  adaptStatement(ctx.statement());
            return new If(e, ifSatement, null);
        }
        else if(ctx.expression() != null && ctx.block() != null){
            Expression e = ExpressionAdapter.adapt(ctx.expression());
            Block ifSatement =  BlockAdapter.adapt(ctx.block());
            return new If(e, ifSatement, null);
        }
        throw new RuntimeException();
    }

    public static If adaptIfElse(MiniJavaParser.IfelsestatementContext ctx){
        if(ctx.statement() != null && ctx.expression() != null){
            Expression e = ExpressionAdapter.adapt(ctx.expression());
            Statement ifSatement =  adaptStatement(ctx.statement().get(0));
            Statement elseSatement = adaptStatement(ctx.statement().get(1));
            return new If(e, ifSatement, elseSatement);
        }else if(ctx.expression() != null && ctx.block() != null){
            Expression e = ExpressionAdapter.adapt(ctx.expression());
            Block ifSatement =  BlockAdapter.adapt(ctx.block().get(0));
            Block elseSatement = BlockAdapter.adapt(ctx.block().get(1));
            return new If(e, ifSatement, elseSatement);
        }
        throw new RuntimeException();
    }

    public static List<Method> adaptMethods(MiniJavaParser.ClassbodyContext ctx) {
        List<Method> methods = new ArrayList<>();
        if(ctx != null && ctx.methoddeclaration() != null) {
            methods.add(MethodAdapter.adapt(ctx.methoddeclaration()));
        }

        if(ctx.classbody() != null){
            methods.addAll(adaptMethods(ctx.classbody()));
        }
        return methods;
    }

    public static List<Field> adaptFields(MiniJavaParser.ClassbodyContext ctx) {
        List<Field> fields = new ArrayList<>();
        if(ctx != null && ctx.fielddeclaration() != null){
            fields.add(FieldAdapter.adapt(ctx.fielddeclaration()));
        }
        if(ctx.classbody() != null){
            fields.addAll(adaptFields(ctx.classbody()));
        }
        return fields;
        }

    }
