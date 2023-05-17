// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#accessMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMod(MiniJavaParser.AccessModContext ctx);
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
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaParser.ExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MiniJavaParser.ParametersContext ctx);
}