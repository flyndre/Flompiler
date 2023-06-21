// Generated from C:/code/Flompiler/src/main/java/de/flyndre/flompiler/scannerparserlexer\MiniJava.g4 by ANTLR 4.12.0
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(MiniJavaParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(MiniJavaParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#accessMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMod(MiniJavaParser.AccessModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(MiniJavaParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#ifelsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsestatement(MiniJavaParser.IfelsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentexpression(MiniJavaParser.AssignmentexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#fieldaccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldaccess(MiniJavaParser.FieldaccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(MiniJavaParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(MiniJavaParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(MiniJavaParser.ClassbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementexpression(MiniJavaParser.StatementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#fielddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddeclaration(MiniJavaParser.FielddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#booldeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooldeclaration(MiniJavaParser.BooldeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#stringdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdeclaration(MiniJavaParser.StringdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#chardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardeclaration(MiniJavaParser.ChardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#intdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntdeclaration(MiniJavaParser.IntdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(MiniJavaParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MiniJavaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(MiniJavaParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodinvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodinvocation(MiniJavaParser.MethodinvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassinstancecreationexpression(MiniJavaParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MiniJavaParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#primarynonewarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarynonewarray(MiniJavaParser.PrimarynonewarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#equalityexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityexpression(MiniJavaParser.EqualityexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#relationalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpression(MiniJavaParser.RelationalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftexpression(MiniJavaParser.ShiftexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#additiveexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveexpression(MiniJavaParser.AdditiveexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeexpression(MiniJavaParser.MultiplicativeexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpression(MiniJavaParser.UnaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#preincrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreincrementexpression(MiniJavaParser.PreincrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#predecrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredecrementexpression(MiniJavaParser.PredecrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpressionnotplusminus(MiniJavaParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#emptystatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptystatement(MiniJavaParser.EmptystatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasstype(MiniJavaParser.ClasstypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#simplename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplename(MiniJavaParser.SimplenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MiniJavaParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#qualifiedname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedname(MiniJavaParser.QualifiednameContext ctx);
}