// Generated from java-escape by ANTLR 4.11.1
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(MiniJavaParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(MiniJavaParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(MiniJavaParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(MiniJavaParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#accessMod}.
	 * @param ctx the parse tree
	 */
	void enterAccessMod(MiniJavaParser.AccessModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#accessMod}.
	 * @param ctx the parse tree
	 */
	void exitAccessMod(MiniJavaParser.AccessModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MiniJavaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(MiniJavaParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(MiniJavaParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void enterIfelsestatement(MiniJavaParser.IfelsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void exitIfelsestatement(MiniJavaParser.IfelsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiniJavaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(MiniJavaParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(MiniJavaParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(MiniJavaParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(MiniJavaParser.ClassbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFielddeclaration(MiniJavaParser.FielddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFielddeclaration(MiniJavaParser.FielddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#booldeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooldeclaration(MiniJavaParser.BooldeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#booldeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooldeclaration(MiniJavaParser.BooldeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringdeclaration(MiniJavaParser.StringdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stringdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringdeclaration(MiniJavaParser.StringdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChardeclaration(MiniJavaParser.ChardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChardeclaration(MiniJavaParser.ChardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntdeclaration(MiniJavaParser.IntdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntdeclaration(MiniJavaParser.IntdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(MiniJavaParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MiniJavaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MiniJavaParser.ParametersContext ctx);
}