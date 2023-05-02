// Generated from C:/code/Flompiler/src/main/java/de/flyndre/flompiler/scannerparserlexer\MiniJava.g4 by ANTLR 4.12.0
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
}