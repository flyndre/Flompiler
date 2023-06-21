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
	 * Enter a parse tree produced by {@link MiniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(MiniJavaParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(MiniJavaParser.AssignmentexpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#fieldaccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldaccess(MiniJavaParser.FieldaccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#fieldaccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldaccess(MiniJavaParser.FieldaccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(MiniJavaParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(MiniJavaParser.ArgumentlistContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementexpression(MiniJavaParser.StatementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementexpression(MiniJavaParser.StatementexpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#intFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntFieldDecl(MiniJavaParser.IntFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntFieldDecl(MiniJavaParser.IntFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stringFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterStringFieldDecl(MiniJavaParser.StringFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stringFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitStringFieldDecl(MiniJavaParser.StringFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#charFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterCharFieldDecl(MiniJavaParser.CharFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#charFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitCharFieldDecl(MiniJavaParser.CharFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(MiniJavaParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(MiniJavaParser.ClassdeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(MiniJavaParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(MiniJavaParser.ExpressionstatementContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiniJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(MiniJavaParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(MiniJavaParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodinvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodinvocation(MiniJavaParser.MethodinvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodinvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodinvocation(MiniJavaParser.MethodinvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 */
	void enterClassinstancecreationexpression(MiniJavaParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 */
	void exitClassinstancecreationexpression(MiniJavaParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MiniJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MiniJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primarynonewarray}.
	 * @param ctx the parse tree
	 */
	void enterPrimarynonewarray(MiniJavaParser.PrimarynonewarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primarynonewarray}.
	 * @param ctx the parse tree
	 */
	void exitPrimarynonewarray(MiniJavaParser.PrimarynonewarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#equalityoperations}.
	 * @param ctx the parse tree
	 */
	void enterEqualityoperations(MiniJavaParser.EqualityoperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#equalityoperations}.
	 * @param ctx the parse tree
	 */
	void exitEqualityoperations(MiniJavaParser.EqualityoperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(MiniJavaParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(MiniJavaParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(MiniJavaParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(MiniJavaParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(MiniJavaParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(MiniJavaParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(MiniJavaParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(MiniJavaParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(MiniJavaParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(MiniJavaParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(MiniJavaParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(MiniJavaParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#preincrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPreincrementexpression(MiniJavaParser.PreincrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#preincrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPreincrementexpression(MiniJavaParser.PreincrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#predecrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPredecrementexpression(MiniJavaParser.PredecrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#predecrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPredecrementexpression(MiniJavaParser.PredecrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpressionnotplusminus(MiniJavaParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpressionnotplusminus(MiniJavaParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#emptystatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptystatement(MiniJavaParser.EmptystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#emptystatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptystatement(MiniJavaParser.EmptystatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classtype}.
	 * @param ctx the parse tree
	 */
	void enterClasstype(MiniJavaParser.ClasstypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classtype}.
	 * @param ctx the parse tree
	 */
	void exitClasstype(MiniJavaParser.ClasstypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#simplename}.
	 * @param ctx the parse tree
	 */
	void enterSimplename(MiniJavaParser.SimplenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#simplename}.
	 * @param ctx the parse tree
	 */
	void exitSimplename(MiniJavaParser.SimplenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MiniJavaParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MiniJavaParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedname(MiniJavaParser.QualifiednameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedname(MiniJavaParser.QualifiednameContext ctx);
}