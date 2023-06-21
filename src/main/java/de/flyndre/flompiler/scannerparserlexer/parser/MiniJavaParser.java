// Generated from C:/code/Flompiler/src/main/java/de/flyndre/flompiler/scannerparserlexer\MiniJava.g4 by ANTLR 4.12.0
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, THIS=2, WHILE=3, IF=4, ELSE=5, DOT=6, RETURN=7, CLASS=8, BOOLEAN=9, 
		INTTYPE=10, STRINGTYPE=11, BOOLEANTYPE=12, CHARTYPE=13, VOIDTYPE=14, EQUALS=15, 
		STRING=16, CHAR=17, JNULL=18, EQUALSSTAT=19, INTEGER=20, COMMA=21, DECREMENT=22, 
		INCREMENT=23, PLUS=24, MINUS=25, MUL=26, DIV=27, MOD=28, PUBLIC=29, PRIVATE=30, 
		PROTECTED=31, NAME=32, WAVEDBROPEN=33, WAVEDBRCLOSE=34, SEMICOLON=35, 
		BROPEN=36, BRCLOSE=37, SEQUENCE=38, TIMESEQUAL=39, DIVIDEEQUAL=40, PLUSEQUAL=41, 
		MINUSEQUAL=42, WS=43;
	public static final int
		RULE_program = 0, RULE_classes = 1, RULE_class = 2, RULE_accessMod = 3, 
		RULE_block = 4, RULE_type = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_ifstatement = 8, RULE_ifelsestatement = 9, RULE_while = 10, RULE_assignment = 11, 
		RULE_assignmentexpression = 12, RULE_expression = 13, RULE_fieldaccess = 14, 
		RULE_argumentlist = 15, RULE_returnstatement = 16, RULE_classbody = 17, 
		RULE_statementexpression = 18, RULE_fielddeclaration = 19, RULE_parameter = 20, 
		RULE_booldeclaration = 21, RULE_stringdeclaration = 22, RULE_chardeclaration = 23, 
		RULE_intdeclaration = 24, RULE_classdeclaration = 25, RULE_methoddeclaration = 26, 
		RULE_expressionstatement = 27, RULE_parameters = 28, RULE_literal = 29, 
		RULE_assignmentoperator = 30, RULE_methodinvocation = 31, RULE_classinstancecreationexpression = 32, 
		RULE_primary = 33, RULE_primarynonewarray = 34, RULE_equalityexpression = 35, 
		RULE_relationalexpression = 36, RULE_shiftexpression = 37, RULE_additiveexpression = 38, 
		RULE_multiplicativeexpression = 39, RULE_unaryexpression = 40, RULE_preincrementexpression = 41, 
		RULE_predecrementexpression = 42, RULE_unaryexpressionnotplusminus = 43, 
		RULE_emptystatement = 44, RULE_classtype = 45, RULE_simplename = 46, RULE_name = 47, 
		RULE_qualifiedname = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classes", "class", "accessMod", "block", "type", "statements", 
			"statement", "ifstatement", "ifelsestatement", "while", "assignment", 
			"assignmentexpression", "expression", "fieldaccess", "argumentlist", 
			"returnstatement", "classbody", "statementexpression", "fielddeclaration", 
			"parameter", "booldeclaration", "stringdeclaration", "chardeclaration", 
			"intdeclaration", "classdeclaration", "methoddeclaration", "expressionstatement", 
			"parameters", "literal", "assignmentoperator", "methodinvocation", "classinstancecreationexpression", 
			"primary", "primarynonewarray", "equalityexpression", "relationalexpression", 
			"shiftexpression", "additiveexpression", "multiplicativeexpression", 
			"unaryexpression", "preincrementexpression", "predecrementexpression", 
			"unaryexpressionnotplusminus", "emptystatement", "classtype", "simplename", 
			"name", "qualifiedname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'this'", "'while'", "'if'", "'else'", "'.'", "'return'", 
			"'class'", null, "'int'", "'String'", "'boolean'", "'char'", "'void'", 
			"'='", null, null, "'null'", "'=='", null, "','", "'--'", "'++'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'public'", "'private'", "'protected'", null, 
			"'{'", "'}'", "';'", "'('", "')'", null, "'*='", "'/='", "'+='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW", "THIS", "WHILE", "IF", "ELSE", "DOT", "RETURN", "CLASS", 
			"BOOLEAN", "INTTYPE", "STRINGTYPE", "BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", 
			"EQUALS", "STRING", "CHAR", "JNULL", "EQUALSSTAT", "INTEGER", "COMMA", 
			"DECREMENT", "INCREMENT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "PUBLIC", 
			"PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", "SEMICOLON", 
			"BROPEN", "BRCLOSE", "SEQUENCE", "TIMESEQUAL", "DIVIDEEQUAL", "PLUSEQUAL", 
			"MINUSEQUAL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			classes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassesContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classes);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				class_();
				setState(101);
				classes();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(MiniJavaParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode WAVEDBROPEN() { return getToken(MiniJavaParser.WAVEDBROPEN, 0); }
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public TerminalNode WAVEDBRCLOSE() { return getToken(MiniJavaParser.WAVEDBRCLOSE, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			accessMod();
			setState(107);
			match(CLASS);
			setState(108);
			match(NAME);
			setState(109);
			match(WAVEDBROPEN);
			setState(110);
			classbody();
			setState(111);
			match(WAVEDBRCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiniJavaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(MiniJavaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(MiniJavaParser.PROTECTED, 0); }
		public AccessModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAccessMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAccessMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAccessMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModContext accessMod() throws RecognitionException {
		AccessModContext _localctx = new AccessModContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accessMod);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(PROTECTED);
				}
				break;
			case CLASS:
			case INTTYPE:
			case STRINGTYPE:
			case BOOLEANTYPE:
			case CHARTYPE:
			case VOIDTYPE:
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode WAVEDBROPEN() { return getToken(MiniJavaParser.WAVEDBROPEN, 0); }
		public TerminalNode WAVEDBRCLOSE() { return getToken(MiniJavaParser.WAVEDBRCLOSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(WAVEDBROPEN);
				setState(120);
				match(WAVEDBRCLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(WAVEDBROPEN);
				setState(123);
				statements();
				setState(124);
				match(WAVEDBRCLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEANTYPE() { return getToken(MiniJavaParser.BOOLEANTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(MiniJavaParser.STRINGTYPE, 0); }
		public TerminalNode CHARTYPE() { return getToken(MiniJavaParser.CHARTYPE, 0); }
		public TerminalNode VOIDTYPE() { return getToken(MiniJavaParser.VOIDTYPE, 0); }
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
			case THIS:
			case WHILE:
			case IF:
			case RETURN:
			case BOOLEAN:
			case INTTYPE:
			case STRINGTYPE:
			case BOOLEANTYPE:
			case CHARTYPE:
			case STRING:
			case CHAR:
			case JNULL:
			case INTEGER:
			case DECREMENT:
			case INCREMENT:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
			case NAME:
			case SEMICOLON:
			case BROPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				statement();
				setState(131);
				statements();
				}
				break;
			case WAVEDBRCLOSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfelsestatementContext ifelsestatement() {
			return getRuleContext(IfelsestatementContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public StringdeclarationContext stringdeclaration() {
			return getRuleContext(StringdeclarationContext.class,0);
		}
		public ChardeclarationContext chardeclaration() {
			return getRuleContext(ChardeclarationContext.class,0);
		}
		public BooldeclarationContext booldeclaration() {
			return getRuleContext(BooldeclarationContext.class,0);
		}
		public ClassdeclarationContext classdeclaration() {
			return getRuleContext(ClassdeclarationContext.class,0);
		}
		public EmptystatementContext emptystatement() {
			return getRuleContext(EmptystatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				returnstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				ifelsestatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				intdeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				stringdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				chardeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				booldeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				classdeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				emptystatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				expressionstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstatement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(IF);
				setState(150);
				match(BROPEN);
				setState(151);
				expression();
				setState(152);
				match(BRCLOSE);
				setState(153);
				statement();
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(IF);
				setState(157);
				match(BROPEN);
				setState(158);
				expression();
				setState(159);
				match(BRCLOSE);
				setState(160);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(IF);
				setState(163);
				match(BROPEN);
				setState(164);
				expression();
				setState(165);
				match(BRCLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(IF);
				setState(168);
				match(BROPEN);
				setState(169);
				statementexpression();
				setState(170);
				match(BRCLOSE);
				setState(171);
				statement();
				setState(172);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(IF);
				setState(175);
				match(BROPEN);
				setState(176);
				statementexpression();
				setState(177);
				match(BRCLOSE);
				setState(178);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(IF);
				setState(181);
				match(BROPEN);
				setState(182);
				statementexpression();
				setState(183);
				match(BRCLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfelsestatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniJavaParser.IF, 0); }
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniJavaParser.ELSE, 0); }
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfelsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIfelsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIfelsestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIfelsestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelsestatementContext ifelsestatement() throws RecognitionException {
		IfelsestatementContext _localctx = new IfelsestatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifelsestatement);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(IF);
				setState(188);
				match(BROPEN);
				setState(189);
				expression();
				setState(190);
				match(BRCLOSE);
				setState(191);
				statement();
				setState(192);
				match(ELSE);
				setState(193);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(IF);
				setState(196);
				match(BROPEN);
				setState(197);
				statementexpression();
				setState(198);
				match(BRCLOSE);
				setState(199);
				statement();
				setState(200);
				match(ELSE);
				setState(201);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(IF);
				setState(204);
				match(BROPEN);
				setState(205);
				expression();
				setState(206);
				match(BRCLOSE);
				setState(207);
				block();
				setState(208);
				match(ELSE);
				setState(209);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(IF);
				setState(212);
				match(BROPEN);
				setState(213);
				statementexpression();
				setState(214);
				match(BRCLOSE);
				setState(215);
				block();
				setState(216);
				match(ELSE);
				setState(217);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniJavaParser.WHILE, 0); }
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(WHILE);
				setState(222);
				match(BROPEN);
				setState(223);
				expression();
				setState(224);
				match(BRCLOSE);
				setState(225);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(WHILE);
				setState(228);
				match(BROPEN);
				setState(229);
				expression();
				setState(230);
				match(BRCLOSE);
				setState(231);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(WHILE);
				setState(234);
				match(BROPEN);
				setState(235);
				statementexpression();
				setState(236);
				match(BRCLOSE);
				setState(237);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(WHILE);
				setState(240);
				match(BROPEN);
				setState(241);
				statementexpression();
				setState(242);
				match(BRCLOSE);
				setState(243);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NAME);
			setState(248);
			assignmentoperator();
			setState(249);
			assignmentexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentexpressionContext extends ParserRuleContext {
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignmentexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignmentexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentexpression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				statementexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(BOOLEAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(CHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				statementexpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				equalityexpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldaccessContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldaccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFieldaccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFieldaccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFieldaccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldaccessContext fieldaccess() throws RecognitionException {
		FieldaccessContext _localctx = new FieldaccessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldaccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(NAME);
			setState(265);
			match(DOT);
			setState(266);
			primary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentlistContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MiniJavaParser.COMMA, 0); }
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitArgumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		return argumentlist(0);
	}

	private ArgumentlistContext argumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, _parentState);
		ArgumentlistContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_argumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(269);
				expression();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentlist);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					match(COMMA);
					setState(275);
					expression();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnstatement);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(RETURN);
				setState(282);
				match(INTEGER);
				setState(283);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(RETURN);
				setState(285);
				match(STRING);
				setState(286);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(RETURN);
				setState(288);
				match(CHAR);
				setState(289);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(RETURN);
				setState(291);
				match(BOOLEAN);
				setState(292);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(RETURN);
				setState(294);
				expression();
				setState(295);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassbodyContext extends ParserRuleContext {
		public FielddeclarationContext fielddeclaration() {
			return getRuleContext(FielddeclarationContext.class,0);
		}
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public MethoddeclarationContext methoddeclaration() {
			return getRuleContext(MethoddeclarationContext.class,0);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classbody);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				fielddeclaration();
				setState(300);
				classbody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				methoddeclaration();
				setState(303);
				classbody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementexpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreincrementexpressionContext preincrementexpression() {
			return getRuleContext(PreincrementexpressionContext.class,0);
		}
		public PredecrementexpressionContext predecrementexpression() {
			return getRuleContext(PredecrementexpressionContext.class,0);
		}
		public MethodinvocationContext methodinvocation() {
			return getRuleContext(MethodinvocationContext.class,0);
		}
		public StatementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStatementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementexpressionContext statementexpression() throws RecognitionException {
		StatementexpressionContext _localctx = new StatementexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementexpression);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				preincrementexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				predecrementexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				methodinvocation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FielddeclarationContext extends ParserRuleContext {
		public BooldeclarationContext booldeclaration() {
			return getRuleContext(BooldeclarationContext.class,0);
		}
		public StringdeclarationContext stringdeclaration() {
			return getRuleContext(StringdeclarationContext.class,0);
		}
		public ChardeclarationContext chardeclaration() {
			return getRuleContext(ChardeclarationContext.class,0);
		}
		public IntdeclarationContext intdeclaration() {
			return getRuleContext(IntdeclarationContext.class,0);
		}
		public ClassdeclarationContext classdeclaration() {
			return getRuleContext(ClassdeclarationContext.class,0);
		}
		public FielddeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterFielddeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitFielddeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitFielddeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclarationContext fielddeclaration() throws RecognitionException {
		FielddeclarationContext _localctx = new FielddeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fielddeclaration);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				booldeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				stringdeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				chardeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				intdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				classdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode BOOLEANTYPE() { return getToken(MiniJavaParser.BOOLEANTYPE, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode STRINGTYPE() { return getToken(MiniJavaParser.STRINGTYPE, 0); }
		public TerminalNode CHARTYPE() { return getToken(MiniJavaParser.CHARTYPE, 0); }
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				accessMod();
				setState(322);
				match(BOOLEANTYPE);
				setState(323);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				accessMod();
				setState(326);
				match(STRINGTYPE);
				setState(327);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				accessMod();
				setState(330);
				match(CHARTYPE);
				setState(331);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				accessMod();
				setState(334);
				match(INTTYPE);
				setState(335);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooldeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode BOOLEANTYPE() { return getToken(MiniJavaParser.BOOLEANTYPE, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BooldeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterBooldeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitBooldeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitBooldeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooldeclarationContext booldeclaration() throws RecognitionException {
		BooldeclarationContext _localctx = new BooldeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booldeclaration);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				accessMod();
				setState(340);
				match(BOOLEANTYPE);
				setState(341);
				match(NAME);
				setState(342);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				accessMod();
				setState(345);
				match(BOOLEANTYPE);
				setState(346);
				match(NAME);
				setState(347);
				match(EQUALS);
				setState(348);
				match(BOOLEAN);
				setState(349);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				accessMod();
				setState(352);
				match(INTTYPE);
				setState(353);
				match(NAME);
				setState(354);
				match(EQUALS);
				setState(355);
				assignmentexpression();
				setState(356);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringdeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode STRINGTYPE() { return getToken(MiniJavaParser.STRINGTYPE, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public StringdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStringdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStringdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitStringdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringdeclarationContext stringdeclaration() throws RecognitionException {
		StringdeclarationContext _localctx = new StringdeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringdeclaration);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				accessMod();
				setState(361);
				match(STRINGTYPE);
				setState(362);
				match(NAME);
				setState(363);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				accessMod();
				setState(366);
				match(STRINGTYPE);
				setState(367);
				match(NAME);
				setState(368);
				match(EQUALS);
				setState(369);
				match(STRING);
				setState(370);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				accessMod();
				setState(373);
				match(INTTYPE);
				setState(374);
				match(NAME);
				setState(375);
				match(EQUALS);
				setState(376);
				assignmentexpression();
				setState(377);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChardeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode CHARTYPE() { return getToken(MiniJavaParser.CHARTYPE, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ChardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterChardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitChardeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitChardeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardeclarationContext chardeclaration() throws RecognitionException {
		ChardeclarationContext _localctx = new ChardeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chardeclaration);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				accessMod();
				setState(382);
				match(CHARTYPE);
				setState(383);
				match(NAME);
				setState(384);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				accessMod();
				setState(387);
				match(CHARTYPE);
				setState(388);
				match(NAME);
				setState(389);
				match(EQUALS);
				setState(390);
				match(CHAR);
				setState(391);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				accessMod();
				setState(394);
				match(INTTYPE);
				setState(395);
				match(NAME);
				setState(396);
				match(EQUALS);
				setState(397);
				assignmentexpression();
				setState(398);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntdeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TerminalNode INTTYPE() { return getToken(MiniJavaParser.INTTYPE, 0); }
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public IntdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterIntdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitIntdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitIntdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntdeclarationContext intdeclaration() throws RecognitionException {
		IntdeclarationContext _localctx = new IntdeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intdeclaration);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				accessMod();
				setState(403);
				match(INTTYPE);
				setState(404);
				match(NAME);
				setState(405);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				accessMod();
				setState(408);
				match(INTTYPE);
				setState(409);
				match(NAME);
				setState(410);
				match(EQUALS);
				setState(411);
				match(INTEGER);
				setState(412);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				accessMod();
				setState(415);
				match(INTTYPE);
				setState(416);
				match(NAME);
				setState(417);
				match(EQUALS);
				setState(418);
				assignmentexpression();
				setState(419);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassdeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(MiniJavaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(MiniJavaParser.NAME, i);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public ClassinstancecreationexpressionContext classinstancecreationexpression() {
			return getRuleContext(ClassinstancecreationexpressionContext.class,0);
		}
		public ClassdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclarationContext classdeclaration() throws RecognitionException {
		ClassdeclarationContext _localctx = new ClassdeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classdeclaration);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				accessMod();
				setState(424);
				match(NAME);
				setState(425);
				match(NAME);
				setState(426);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				accessMod();
				setState(429);
				match(NAME);
				setState(430);
				match(NAME);
				setState(431);
				match(EQUALS);
				setState(432);
				classinstancecreationexpression();
				setState(433);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethoddeclarationContext extends ParserRuleContext {
		public AccessModContext accessMod() {
			return getRuleContext(AccessModContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethoddeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethoddeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethoddeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethoddeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclarationContext methoddeclaration() throws RecognitionException {
		MethoddeclarationContext _localctx = new MethoddeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methoddeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			accessMod();
			setState(438);
			type();
			setState(439);
			match(NAME);
			setState(440);
			match(BROPEN);
			setState(441);
			parameters();
			setState(442);
			match(BRCLOSE);
			setState(443);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionstatementContext extends ParserRuleContext {
		public StatementexpressionContext statementexpression() {
			return getRuleContext(StatementexpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpressionstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitExpressionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			statementexpression();
			setState(446);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MiniJavaParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameters);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				parameter();
				setState(449);
				match(COMMA);
				setState(450);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode JNULL() { return getToken(MiniJavaParser.JNULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1507840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MiniJavaParser.EQUALS, 0); }
		public TerminalNode TIMESEQUAL() { return getToken(MiniJavaParser.TIMESEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(MiniJavaParser.DIVIDEEQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(MiniJavaParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(MiniJavaParser.MINUSEQUAL, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAssignmentoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAssignmentoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337241088L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodinvocationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public List<TerminalNode> BROPEN() { return getTokens(MiniJavaParser.BROPEN); }
		public TerminalNode BROPEN(int i) {
			return getToken(MiniJavaParser.BROPEN, i);
		}
		public List<TerminalNode> BRCLOSE() { return getTokens(MiniJavaParser.BRCLOSE); }
		public TerminalNode BRCLOSE(int i) {
			return getToken(MiniJavaParser.BRCLOSE, i);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public TerminalNode SEQUENCE() { return getToken(MiniJavaParser.SEQUENCE, 0); }
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassinstancecreationexpressionContext classinstancecreationexpression() {
			return getRuleContext(ClassinstancecreationexpressionContext.class,0);
		}
		public FieldaccessContext fieldaccess() {
			return getRuleContext(FieldaccessContext.class,0);
		}
		public MethodinvocationContext methodinvocation() {
			return getRuleContext(MethodinvocationContext.class,0);
		}
		public MethodinvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodinvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodinvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodinvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMethodinvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodinvocationContext methodinvocation() throws RecognitionException {
		return methodinvocation(0);
	}

	private MethodinvocationContext methodinvocation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MethodinvocationContext _localctx = new MethodinvocationContext(_ctx, _parentState);
		MethodinvocationContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_methodinvocation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(461);
				match(NAME);
				setState(462);
				match(BROPEN);
				setState(463);
				match(BRCLOSE);
				}
				break;
			case 2:
				{
				setState(464);
				match(NAME);
				setState(465);
				match(BROPEN);
				setState(466);
				argumentlist(0);
				setState(467);
				match(BRCLOSE);
				}
				break;
			case 3:
				{
				setState(469);
				literal();
				setState(470);
				match(DOT);
				setState(471);
				match(SEQUENCE);
				setState(472);
				match(BROPEN);
				setState(473);
				match(BRCLOSE);
				}
				break;
			case 4:
				{
				setState(475);
				match(THIS);
				setState(476);
				match(DOT);
				setState(477);
				match(NAME);
				setState(478);
				match(BROPEN);
				setState(479);
				argumentlist(0);
				setState(480);
				match(BRCLOSE);
				}
				break;
			case 5:
				{
				setState(482);
				match(BROPEN);
				setState(483);
				expression();
				setState(484);
				match(BRCLOSE);
				setState(485);
				match(DOT);
				setState(486);
				match(SEQUENCE);
				setState(487);
				match(BROPEN);
				setState(488);
				argumentlist(0);
				setState(489);
				match(BRCLOSE);
				}
				break;
			case 6:
				{
				setState(491);
				classinstancecreationexpression();
				setState(492);
				match(DOT);
				setState(493);
				match(SEQUENCE);
				setState(494);
				match(BROPEN);
				setState(495);
				argumentlist(0);
				setState(496);
				match(BRCLOSE);
				}
				break;
			case 7:
				{
				setState(498);
				fieldaccess();
				setState(499);
				match(DOT);
				setState(500);
				match(SEQUENCE);
				setState(501);
				match(BROPEN);
				setState(502);
				argumentlist(0);
				setState(503);
				match(BRCLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MethodinvocationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_methodinvocation);
					setState(507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(508);
					match(DOT);
					setState(509);
					match(SEQUENCE);
					setState(510);
					match(BROPEN);
					setState(511);
					argumentlist(0);
					setState(512);
					match(BRCLOSE);
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassinstancecreationexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(MiniJavaParser.NEW, 0); }
		public ClasstypeContext classtype() {
			return getRuleContext(ClasstypeContext.class,0);
		}
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ClassinstancecreationexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classinstancecreationexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassinstancecreationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassinstancecreationexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClassinstancecreationexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassinstancecreationexpressionContext classinstancecreationexpression() throws RecognitionException {
		ClassinstancecreationexpressionContext _localctx = new ClassinstancecreationexpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classinstancecreationexpression);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(NEW);
				setState(520);
				classtype();
				setState(521);
				match(BROPEN);
				setState(522);
				match(BRCLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(NEW);
				setState(525);
				classtype();
				setState(526);
				match(BROPEN);
				setState(527);
				argumentlist(0);
				setState(528);
				match(BRCLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimarynonewarrayContext primarynonewarray() {
			return getRuleContext(PrimarynonewarrayContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			primarynonewarray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarynonewarrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(MiniJavaParser.THIS, 0); }
		public TerminalNode BROPEN() { return getToken(MiniJavaParser.BROPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRCLOSE() { return getToken(MiniJavaParser.BRCLOSE, 0); }
		public ClassinstancecreationexpressionContext classinstancecreationexpression() {
			return getRuleContext(ClassinstancecreationexpressionContext.class,0);
		}
		public FieldaccessContext fieldaccess() {
			return getRuleContext(FieldaccessContext.class,0);
		}
		public MethodinvocationContext methodinvocation() {
			return getRuleContext(MethodinvocationContext.class,0);
		}
		public PrimarynonewarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primarynonewarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPrimarynonewarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPrimarynonewarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPrimarynonewarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarynonewarrayContext primarynonewarray() throws RecognitionException {
		PrimarynonewarrayContext _localctx = new PrimarynonewarrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primarynonewarray);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(BROPEN);
				setState(537);
				expression();
				setState(538);
				match(BRCLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				classinstancecreationexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				fieldaccess();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				methodinvocation(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode EQUALSSTAT() { return getToken(MiniJavaParser.EQUALSSTAT, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEqualityexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEqualityexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(546);
			relationalexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
					setState(548);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(549);
					match(EQUALSSTAT);
					setState(550);
					relationalexpression();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitRelationalexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitRelationalexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_relationalexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			shiftexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitShiftexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitShiftexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_shiftexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			additiveexpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitAdditiveexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitAdditiveexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(561);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(569);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(563);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(564);
						match(PLUS);
						setState(565);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(566);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(567);
						match(MINUS);
						setState(568);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MiniJavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiniJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniJavaParser.MOD, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMultiplicativeexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitMultiplicativeexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(575);
			unaryexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(577);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(578);
						match(MUL);
						setState(579);
						unaryexpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(580);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(581);
						match(DIV);
						setState(582);
						unaryexpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(583);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(584);
						match(MOD);
						setState(585);
						unaryexpression();
						}
						break;
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryexpressionContext extends ParserRuleContext {
		public PreincrementexpressionContext preincrementexpression() {
			return getRuleContext(PreincrementexpressionContext.class,0);
		}
		public PredecrementexpressionContext predecrementexpression() {
			return getRuleContext(PredecrementexpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiniJavaParser.PLUS, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MiniJavaParser.MINUS, 0); }
		public UnaryexpressionnotplusminusContext unaryexpressionnotplusminus() {
			return getRuleContext(UnaryexpressionnotplusminusContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitUnaryexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitUnaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unaryexpression);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				preincrementexpression();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				predecrementexpression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(PLUS);
				setState(594);
				unaryexpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				match(MINUS);
				setState(596);
				unaryexpression();
				}
				break;
			case NEW:
			case THIS:
			case BOOLEAN:
			case STRING:
			case CHAR:
			case JNULL:
			case INTEGER:
			case NAME:
			case BROPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				unaryexpressionnotplusminus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreincrementexpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(MiniJavaParser.INCREMENT, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public PreincrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preincrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPreincrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPreincrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPreincrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreincrementexpressionContext preincrementexpression() throws RecognitionException {
		PreincrementexpressionContext _localctx = new PreincrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_preincrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(INCREMENT);
			setState(601);
			unaryexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredecrementexpressionContext extends ParserRuleContext {
		public TerminalNode DECREMENT() { return getToken(MiniJavaParser.DECREMENT, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public PredecrementexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predecrementexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterPredecrementexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitPredecrementexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitPredecrementexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredecrementexpressionContext predecrementexpression() throws RecognitionException {
		PredecrementexpressionContext _localctx = new PredecrementexpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_predecrementexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(DECREMENT);
			setState(604);
			unaryexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryexpressionnotplusminusContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UnaryexpressionnotplusminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpressionnotplusminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterUnaryexpressionnotplusminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitUnaryexpressionnotplusminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitUnaryexpressionnotplusminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryexpressionnotplusminusContext unaryexpressionnotplusminus() throws RecognitionException {
		UnaryexpressionnotplusminusContext _localctx = new UnaryexpressionnotplusminusContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unaryexpressionnotplusminus);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptystatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public EmptystatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptystatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterEmptystatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitEmptystatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitEmptystatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptystatementContext emptystatement() throws RecognitionException {
		EmptystatementContext _localctx = new EmptystatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_emptystatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClasstypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ClasstypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClasstype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClasstype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitClasstype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasstypeContext classtype() throws RecognitionException {
		ClasstypeContext _localctx = new ClasstypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplenameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public SimplenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterSimplename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitSimplename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitSimplename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplenameContext simplename() throws RecognitionException {
		SimplenameContext _localctx = new SimplenameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_simplename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public QualifiednameContext qualifiedname() {
			return getRuleContext(QualifiednameContext.class,0);
		}
		public SimplenameContext simplename() {
			return getRuleContext(SimplenameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_name);
		try {
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				qualifiedname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				simplename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiednameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(MiniJavaParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public QualifiednameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterQualifiedname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitQualifiedname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaVisitor ) return ((MiniJavaVisitor<? extends T>)visitor).visitQualifiedname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednameContext qualifiedname() throws RecognitionException {
		QualifiednameContext _localctx = new QualifiednameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualifiedname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(NAME);
			setState(621);
			match(DOT);
			setState(622);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return argumentlist_sempred((ArgumentlistContext)_localctx, predIndex);
		case 31:
			return methodinvocation_sempred((MethodinvocationContext)_localctx, predIndex);
		case 35:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 38:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 39:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean argumentlist_sempred(ArgumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean methodinvocation_sempred(MethodinvocationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0271\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001i\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"v\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0094\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00ba\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00dc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00f6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00fe\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0107\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0110\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0115\b\u000f\n\u000f\f\u000f\u0118\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012a\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0133\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0139\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0140\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0152\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0167\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u017c\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0191\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01a6\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01b4\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01c7\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01fa\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0203\b\u001f\n\u001f\f\u001f\u0206\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0213\b \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0220\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u0228\b#\n#\f#\u022b\t#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u023a\b&\n&"+
		"\f&\u023d\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u024b\b\'\n\'\f\'\u024e\t\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0257\b(\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u0261\b+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0003/\u026b\b/\u0001"+
		"0\u00010\u00010\u00010\u00010\u0000\u0005\u001e>FLN1\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0003\u0001\u0000\n\u000e\u0003"+
		"\u0000\t\t\u0010\u0012\u0014\u0014\u0002\u0000\u000f\u000f\'*\u0298\u0000"+
		"b\u0001\u0000\u0000\u0000\u0002h\u0001\u0000\u0000\u0000\u0004j\u0001"+
		"\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000"+
		"\u0000\n\u0080\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000\u0000"+
		"\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u00b9\u0001\u0000\u0000\u0000"+
		"\u0012\u00db\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000"+
		"\u0016\u00f7\u0001\u0000\u0000\u0000\u0018\u00fd\u0001\u0000\u0000\u0000"+
		"\u001a\u0106\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000"+
		"\u001e\u010f\u0001\u0000\u0000\u0000 \u0129\u0001\u0000\u0000\u0000\""+
		"\u0132\u0001\u0000\u0000\u0000$\u0138\u0001\u0000\u0000\u0000&\u013f\u0001"+
		"\u0000\u0000\u0000(\u0151\u0001\u0000\u0000\u0000*\u0166\u0001\u0000\u0000"+
		"\u0000,\u017b\u0001\u0000\u0000\u0000.\u0190\u0001\u0000\u0000\u00000"+
		"\u01a5\u0001\u0000\u0000\u00002\u01b3\u0001\u0000\u0000\u00004\u01b5\u0001"+
		"\u0000\u0000\u00006\u01bd\u0001\u0000\u0000\u00008\u01c6\u0001\u0000\u0000"+
		"\u0000:\u01c8\u0001\u0000\u0000\u0000<\u01ca\u0001\u0000\u0000\u0000>"+
		"\u01f9\u0001\u0000\u0000\u0000@\u0212\u0001\u0000\u0000\u0000B\u0214\u0001"+
		"\u0000\u0000\u0000D\u021f\u0001\u0000\u0000\u0000F\u0221\u0001\u0000\u0000"+
		"\u0000H\u022c\u0001\u0000\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L"+
		"\u0230\u0001\u0000\u0000\u0000N\u023e\u0001\u0000\u0000\u0000P\u0256\u0001"+
		"\u0000\u0000\u0000R\u0258\u0001\u0000\u0000\u0000T\u025b\u0001\u0000\u0000"+
		"\u0000V\u0260\u0001\u0000\u0000\u0000X\u0262\u0001\u0000\u0000\u0000Z"+
		"\u0264\u0001\u0000\u0000\u0000\\\u0266\u0001\u0000\u0000\u0000^\u026a"+
		"\u0001\u0000\u0000\u0000`\u026c\u0001\u0000\u0000\u0000bc\u0003\u0002"+
		"\u0001\u0000c\u0001\u0001\u0000\u0000\u0000de\u0003\u0004\u0002\u0000"+
		"ef\u0003\u0002\u0001\u0000fi\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hd\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0003\u0001"+
		"\u0000\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0005\b\u0000\u0000lm\u0005"+
		" \u0000\u0000mn\u0005!\u0000\u0000no\u0003\"\u0011\u0000op\u0005\"\u0000"+
		"\u0000p\u0005\u0001\u0000\u0000\u0000qv\u0005\u001d\u0000\u0000rv\u0005"+
		"\u001e\u0000\u0000sv\u0005\u001f\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000v\u0007\u0001\u0000\u0000\u0000wx\u0005"+
		"!\u0000\u0000x\u007f\u0005\"\u0000\u0000y\u007f\u0001\u0000\u0000\u0000"+
		"z{\u0005!\u0000\u0000{|\u0003\f\u0006\u0000|}\u0005\"\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000"+
		"\u0000~z\u0001\u0000\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0000\u0000\u0000\u0081\u000b\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003\u000e\u0007\u0000\u0083\u0084\u0003\f\u0006\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\r\u0001"+
		"\u0000\u0000\u0000\u0088\u0094\u0003 \u0010\u0000\u0089\u0094\u0003\u0010"+
		"\b\u0000\u008a\u0094\u0003\u0012\t\u0000\u008b\u0094\u0003\u0014\n\u0000"+
		"\u008c\u0094\u00030\u0018\u0000\u008d\u0094\u0003,\u0016\u0000\u008e\u0094"+
		"\u0003.\u0017\u0000\u008f\u0094\u0003*\u0015\u0000\u0090\u0094\u00032"+
		"\u0019\u0000\u0091\u0094\u0003X,\u0000\u0092\u0094\u00036\u001b\u0000"+
		"\u0093\u0088\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000\u0000\u0000"+
		"\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000"+
		"\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000"+
		"\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000"+
		"\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0097\u0005$\u0000\u0000\u0097"+
		"\u0098\u0003\u001a\r\u0000\u0098\u0099\u0005%\u0000\u0000\u0099\u009a"+
		"\u0003\u000e\u0007\u0000\u009a\u009b\u0005#\u0000\u0000\u009b\u00ba\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005"+
		"$\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f\u00a0\u0005%\u0000"+
		"\u0000\u00a0\u00a1\u0003\b\u0004\u0000\u00a1\u00ba\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a4\u0005$\u0000\u0000\u00a4"+
		"\u00a5\u0003\u001a\r\u0000\u00a5\u00a6\u0005%\u0000\u0000\u00a6\u00ba"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9"+
		"\u0005$\u0000\u0000\u00a9\u00aa\u0003$\u0012\u0000\u00aa\u00ab\u0005%"+
		"\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007\u0000\u00ac\u00ad\u0005#\u0000"+
		"\u0000\u00ad\u00ba\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0004\u0000"+
		"\u0000\u00af\u00b0\u0005$\u0000\u0000\u00b0\u00b1\u0003$\u0012\u0000\u00b1"+
		"\u00b2\u0005%\u0000\u0000\u00b2\u00b3\u0003\b\u0004\u0000\u00b3\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0004\u0000\u0000\u00b5\u00b6"+
		"\u0005$\u0000\u0000\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8\u0005%"+
		"\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u0095\u0001\u0000"+
		"\u0000\u0000\u00b9\u009c\u0001\u0000\u0000\u0000\u00b9\u00a2\u0001\u0000"+
		"\u0000\u0000\u00b9\u00a7\u0001\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00ba\u0011\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0004\u0000\u0000\u00bc\u00bd\u0005$\u0000"+
		"\u0000\u00bd\u00be\u0003\u001a\r\u0000\u00be\u00bf\u0005%\u0000\u0000"+
		"\u00bf\u00c0\u0003\u000e\u0007\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000"+
		"\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00dc\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0004\u0000\u0000\u00c4\u00c5\u0005$\u0000\u0000\u00c5"+
		"\u00c6\u0003$\u0012\u0000\u00c6\u00c7\u0005%\u0000\u0000\u00c7\u00c8\u0003"+
		"\u000e\u0007\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00ca\u0003"+
		"\u000e\u0007\u0000\u00ca\u00dc\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0004\u0000\u0000\u00cc\u00cd\u0005$\u0000\u0000\u00cd\u00ce\u0003\u001a"+
		"\r\u0000\u00ce\u00cf\u0005%\u0000\u0000\u00cf\u00d0\u0003\b\u0004\u0000"+
		"\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u00d2\u0003\b\u0004\u0000\u00d2"+
		"\u00dc\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4"+
		"\u00d5\u0005$\u0000\u0000\u00d5\u00d6\u0003$\u0012\u0000\u00d6\u00d7\u0005"+
		"%\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000\u00d8\u00d9\u0005\u0005"+
		"\u0000\u0000\u00d9\u00da\u0003\b\u0004\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00bb\u0001\u0000\u0000\u0000\u00db\u00c3\u0001\u0000\u0000"+
		"\u0000\u00db\u00cb\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000"+
		"\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0003\u0000"+
		"\u0000\u00de\u00df\u0005$\u0000\u0000\u00df\u00e0\u0003\u001a\r\u0000"+
		"\u00e0\u00e1\u0005%\u0000\u0000\u00e1\u00e2\u0003\u000e\u0007\u0000\u00e2"+
		"\u00f6\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4"+
		"\u00e5\u0005$\u0000\u0000\u00e5\u00e6\u0003\u001a\r\u0000\u00e6\u00e7"+
		"\u0005%\u0000\u0000\u00e7\u00e8\u0003\b\u0004\u0000\u00e8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\u0003\u0000\u0000\u00ea\u00eb\u0005"+
		"$\u0000\u0000\u00eb\u00ec\u0003$\u0012\u0000\u00ec\u00ed\u0005%\u0000"+
		"\u0000\u00ed\u00ee\u0003\u000e\u0007\u0000\u00ee\u00f6\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0\u00f1\u0005$\u0000\u0000"+
		"\u00f1\u00f2\u0003$\u0012\u0000\u00f2\u00f3\u0005%\u0000\u0000\u00f3\u00f4"+
		"\u0003\b\u0004\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00dd\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e3\u0001\u0000\u0000\u0000\u00f5\u00e9\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f6\u0015\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005 \u0000\u0000\u00f8\u00f9\u0003<\u001e"+
		"\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa\u0017\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fe\u0003$\u0012\u0000\u00fc\u00fe\u0003\u001a\r\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u0019\u0001\u0000\u0000\u0000\u00ff\u0107\u0005\t\u0000\u0000\u0100\u0107"+
		"\u0005\u0014\u0000\u0000\u0101\u0107\u0005\u0010\u0000\u0000\u0102\u0107"+
		"\u0005\u0011\u0000\u0000\u0103\u0107\u0005 \u0000\u0000\u0104\u0107\u0003"+
		"$\u0012\u0000\u0105\u0107\u0003F#\u0000\u0106\u00ff\u0001\u0000\u0000"+
		"\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0101\u0001\u0000\u0000"+
		"\u0000\u0106\u0102\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u0109\u0005 \u0000\u0000"+
		"\u0109\u010a\u0005\u0006\u0000\u0000\u010a\u010b\u0003B!\u0000\u010b\u001d"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0006\u000f\uffff\uffff\u0000\u010d"+
		"\u0110\u0003\u001a\r\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0116"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\n\u0002\u0000\u0000\u0112\u0113\u0005"+
		"\u0015\u0000\u0000\u0113\u0115\u0003\u001a\r\u0000\u0114\u0111\u0001\u0000"+
		"\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u001f\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0007"+
		"\u0000\u0000\u011a\u011b\u0005\u0014\u0000\u0000\u011b\u012a\u0005#\u0000"+
		"\u0000\u011c\u011d\u0005\u0007\u0000\u0000\u011d\u011e\u0005\u0010\u0000"+
		"\u0000\u011e\u012a\u0005#\u0000\u0000\u011f\u0120\u0005\u0007\u0000\u0000"+
		"\u0120\u0121\u0005\u0011\u0000\u0000\u0121\u012a\u0005#\u0000\u0000\u0122"+
		"\u0123\u0005\u0007\u0000\u0000\u0123\u0124\u0005\t\u0000\u0000\u0124\u012a"+
		"\u0005#\u0000\u0000\u0125\u0126\u0005\u0007\u0000\u0000\u0126\u0127\u0003"+
		"\u001a\r\u0000\u0127\u0128\u0005#\u0000\u0000\u0128\u012a\u0001\u0000"+
		"\u0000\u0000\u0129\u0119\u0001\u0000\u0000\u0000\u0129\u011c\u0001\u0000"+
		"\u0000\u0000\u0129\u011f\u0001\u0000\u0000\u0000\u0129\u0122\u0001\u0000"+
		"\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u012a!\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0003&\u0013\u0000\u012c\u012d\u0003\"\u0011\u0000"+
		"\u012d\u0133\u0001\u0000\u0000\u0000\u012e\u012f\u00034\u001a\u0000\u012f"+
		"\u0130\u0003\"\u0011\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u0133"+
		"\u0001\u0000\u0000\u0000\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133#\u0001"+
		"\u0000\u0000\u0000\u0134\u0139\u0003\u0016\u000b\u0000\u0135\u0139\u0003"+
		"R)\u0000\u0136\u0139\u0003T*\u0000\u0137\u0139\u0003>\u001f\u0000\u0138"+
		"\u0134\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139"+
		"%\u0001\u0000\u0000\u0000\u013a\u0140\u0003*\u0015\u0000\u013b\u0140\u0003"+
		",\u0016\u0000\u013c\u0140\u0003.\u0017\u0000\u013d\u0140\u00030\u0018"+
		"\u0000\u013e\u0140\u00032\u0019\u0000\u013f\u013a\u0001\u0000\u0000\u0000"+
		"\u013f\u013b\u0001\u0000\u0000\u0000\u013f\u013c\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\'\u0001\u0000\u0000\u0000\u0141\u0142\u0003\u0006\u0003\u0000\u0142"+
		"\u0143\u0005\f\u0000\u0000\u0143\u0144\u0005 \u0000\u0000\u0144\u0152"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0003\u0006\u0003\u0000\u0146\u0147"+
		"\u0005\u000b\u0000\u0000\u0147\u0148\u0005 \u0000\u0000\u0148\u0152\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0003\u0006\u0003\u0000\u014a\u014b\u0005"+
		"\r\u0000\u0000\u014b\u014c\u0005 \u0000\u0000\u014c\u0152\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0003\u0006\u0003\u0000\u014e\u014f\u0005\n\u0000"+
		"\u0000\u014f\u0150\u0005 \u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000"+
		"\u0151\u0141\u0001\u0000\u0000\u0000\u0151\u0145\u0001\u0000\u0000\u0000"+
		"\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000"+
		"\u0152)\u0001\u0000\u0000\u0000\u0153\u0154\u0003\u0006\u0003\u0000\u0154"+
		"\u0155\u0005\f\u0000\u0000\u0155\u0156\u0005 \u0000\u0000\u0156\u0157"+
		"\u0005#\u0000\u0000\u0157\u0167\u0001\u0000\u0000\u0000\u0158\u0159\u0003"+
		"\u0006\u0003\u0000\u0159\u015a\u0005\f\u0000\u0000\u015a\u015b\u0005 "+
		"\u0000\u0000\u015b\u015c\u0005\u000f\u0000\u0000\u015c\u015d\u0005\t\u0000"+
		"\u0000\u015d\u015e\u0005#\u0000\u0000\u015e\u0167\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0003\u0006\u0003\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161"+
		"\u0162\u0005 \u0000\u0000\u0162\u0163\u0005\u000f\u0000\u0000\u0163\u0164"+
		"\u0003\u0018\f\u0000\u0164\u0165\u0005#\u0000\u0000\u0165\u0167\u0001"+
		"\u0000\u0000\u0000\u0166\u0153\u0001\u0000\u0000\u0000\u0166\u0158\u0001"+
		"\u0000\u0000\u0000\u0166\u015f\u0001\u0000\u0000\u0000\u0167+\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0003\u0006\u0003\u0000\u0169\u016a\u0005\u000b"+
		"\u0000\u0000\u016a\u016b\u0005 \u0000\u0000\u016b\u016c\u0005#\u0000\u0000"+
		"\u016c\u017c\u0001\u0000\u0000\u0000\u016d\u016e\u0003\u0006\u0003\u0000"+
		"\u016e\u016f\u0005\u000b\u0000\u0000\u016f\u0170\u0005 \u0000\u0000\u0170"+
		"\u0171\u0005\u000f\u0000\u0000\u0171\u0172\u0005\u0010\u0000\u0000\u0172"+
		"\u0173\u0005#\u0000\u0000\u0173\u017c\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0003\u0006\u0003\u0000\u0175\u0176\u0005\n\u0000\u0000\u0176\u0177\u0005"+
		" \u0000\u0000\u0177\u0178\u0005\u000f\u0000\u0000\u0178\u0179\u0003\u0018"+
		"\f\u0000\u0179\u017a\u0005#\u0000\u0000\u017a\u017c\u0001\u0000\u0000"+
		"\u0000\u017b\u0168\u0001\u0000\u0000\u0000\u017b\u016d\u0001\u0000\u0000"+
		"\u0000\u017b\u0174\u0001\u0000\u0000\u0000\u017c-\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0003\u0006\u0003\u0000\u017e\u017f\u0005\r\u0000\u0000\u017f"+
		"\u0180\u0005 \u0000\u0000\u0180\u0181\u0005#\u0000\u0000\u0181\u0191\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0003\u0006\u0003\u0000\u0183\u0184\u0005"+
		"\r\u0000\u0000\u0184\u0185\u0005 \u0000\u0000\u0185\u0186\u0005\u000f"+
		"\u0000\u0000\u0186\u0187\u0005\u0011\u0000\u0000\u0187\u0188\u0005#\u0000"+
		"\u0000\u0188\u0191\u0001\u0000\u0000\u0000\u0189\u018a\u0003\u0006\u0003"+
		"\u0000\u018a\u018b\u0005\n\u0000\u0000\u018b\u018c\u0005 \u0000\u0000"+
		"\u018c\u018d\u0005\u000f\u0000\u0000\u018d\u018e\u0003\u0018\f\u0000\u018e"+
		"\u018f\u0005#\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000\u0190\u017d"+
		"\u0001\u0000\u0000\u0000\u0190\u0182\u0001\u0000\u0000\u0000\u0190\u0189"+
		"\u0001\u0000\u0000\u0000\u0191/\u0001\u0000\u0000\u0000\u0192\u0193\u0003"+
		"\u0006\u0003\u0000\u0193\u0194\u0005\n\u0000\u0000\u0194\u0195\u0005 "+
		"\u0000\u0000\u0195\u0196\u0005#\u0000\u0000\u0196\u01a6\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0003\u0006\u0003\u0000\u0198\u0199\u0005\n\u0000\u0000"+
		"\u0199\u019a\u0005 \u0000\u0000\u019a\u019b\u0005\u000f\u0000\u0000\u019b"+
		"\u019c\u0005\u0014\u0000\u0000\u019c\u019d\u0005#\u0000\u0000\u019d\u01a6"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0003\u0006\u0003\u0000\u019f\u01a0"+
		"\u0005\n\u0000\u0000\u01a0\u01a1\u0005 \u0000\u0000\u01a1\u01a2\u0005"+
		"\u000f\u0000\u0000\u01a2\u01a3\u0003\u0018\f\u0000\u01a3\u01a4\u0005#"+
		"\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u0192\u0001\u0000"+
		"\u0000\u0000\u01a5\u0197\u0001\u0000\u0000\u0000\u01a5\u019e\u0001\u0000"+
		"\u0000\u0000\u01a61\u0001\u0000\u0000\u0000\u01a7\u01a8\u0003\u0006\u0003"+
		"\u0000\u01a8\u01a9\u0005 \u0000\u0000\u01a9\u01aa\u0005 \u0000\u0000\u01aa"+
		"\u01ab\u0005#\u0000\u0000\u01ab\u01b4\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0003\u0006\u0003\u0000\u01ad\u01ae\u0005 \u0000\u0000\u01ae\u01af\u0005"+
		" \u0000\u0000\u01af\u01b0\u0005\u000f\u0000\u0000\u01b0\u01b1\u0003@ "+
		"\u0000\u01b1\u01b2\u0005#\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01a7\u0001\u0000\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000"+
		"\u01b43\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003\u0006\u0003\u0000\u01b6"+
		"\u01b7\u0003\n\u0005\u0000\u01b7\u01b8\u0005 \u0000\u0000\u01b8\u01b9"+
		"\u0005$\u0000\u0000\u01b9\u01ba\u00038\u001c\u0000\u01ba\u01bb\u0005%"+
		"\u0000\u0000\u01bb\u01bc\u0003\b\u0004\u0000\u01bc5\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0003$\u0012\u0000\u01be\u01bf\u0005#\u0000\u0000\u01bf"+
		"7\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003(\u0014\u0000\u01c1\u01c2\u0005"+
		"\u0015\u0000\u0000\u01c2\u01c3\u00038\u001c\u0000\u01c3\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0003(\u0014\u0000\u01c5\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c0\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c79\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0007\u0001\u0000\u0000\u01c9;\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0007\u0002\u0000\u0000\u01cb=\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0006\u001f\uffff\uffff\u0000\u01cd\u01ce\u0005 \u0000\u0000\u01ce\u01cf"+
		"\u0005$\u0000\u0000\u01cf\u01fa\u0005%\u0000\u0000\u01d0\u01d1\u0005 "+
		"\u0000\u0000\u01d1\u01d2\u0005$\u0000\u0000\u01d2\u01d3\u0003\u001e\u000f"+
		"\u0000\u01d3\u01d4\u0005%\u0000\u0000\u01d4\u01fa\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0003:\u001d\u0000\u01d6\u01d7\u0005\u0006\u0000\u0000\u01d7"+
		"\u01d8\u0005&\u0000\u0000\u01d8\u01d9\u0005$\u0000\u0000\u01d9\u01da\u0005"+
		"%\u0000\u0000\u01da\u01fa\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0002"+
		"\u0000\u0000\u01dc\u01dd\u0005\u0006\u0000\u0000\u01dd\u01de\u0005 \u0000"+
		"\u0000\u01de\u01df\u0005$\u0000\u0000\u01df\u01e0\u0003\u001e\u000f\u0000"+
		"\u01e0\u01e1\u0005%\u0000\u0000\u01e1\u01fa\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005$\u0000\u0000\u01e3\u01e4\u0003\u001a\r\u0000\u01e4\u01e5"+
		"\u0005%\u0000\u0000\u01e5\u01e6\u0005\u0006\u0000\u0000\u01e6\u01e7\u0005"+
		"&\u0000\u0000\u01e7\u01e8\u0005$\u0000\u0000\u01e8\u01e9\u0003\u001e\u000f"+
		"\u0000\u01e9\u01ea\u0005%\u0000\u0000\u01ea\u01fa\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0003@ \u0000\u01ec\u01ed\u0005\u0006\u0000\u0000\u01ed\u01ee"+
		"\u0005&\u0000\u0000\u01ee\u01ef\u0005$\u0000\u0000\u01ef\u01f0\u0003\u001e"+
		"\u000f\u0000\u01f0\u01f1\u0005%\u0000\u0000\u01f1\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0003\u001c\u000e\u0000\u01f3\u01f4\u0005\u0006\u0000"+
		"\u0000\u01f4\u01f5\u0005&\u0000\u0000\u01f5\u01f6\u0005$\u0000\u0000\u01f6"+
		"\u01f7\u0003\u001e\u000f\u0000\u01f7\u01f8\u0005%\u0000\u0000\u01f8\u01fa"+
		"\u0001\u0000\u0000\u0000\u01f9\u01cc\u0001\u0000\u0000\u0000\u01f9\u01d0"+
		"\u0001\u0000\u0000\u0000\u01f9\u01d5\u0001\u0000\u0000\u0000\u01f9\u01db"+
		"\u0001\u0000\u0000\u0000\u01f9\u01e2\u0001\u0000\u0000\u0000\u01f9\u01eb"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f2\u0001\u0000\u0000\u0000\u01fa\u0204"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\n\u0001\u0000\u0000\u01fc\u01fd\u0005"+
		"\u0006\u0000\u0000\u01fd\u01fe\u0005&\u0000\u0000\u01fe\u01ff\u0005$\u0000"+
		"\u0000\u01ff\u0200\u0003\u001e\u000f\u0000\u0200\u0201\u0005%\u0000\u0000"+
		"\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01fb\u0001\u0000\u0000\u0000"+
		"\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205?\u0001\u0000\u0000\u0000\u0206"+
		"\u0204\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u0001\u0000\u0000\u0208"+
		"\u0209\u0003Z-\u0000\u0209\u020a\u0005$\u0000\u0000\u020a\u020b\u0005"+
		"%\u0000\u0000\u020b\u0213\u0001\u0000\u0000\u0000\u020c\u020d\u0005\u0001"+
		"\u0000\u0000\u020d\u020e\u0003Z-\u0000\u020e\u020f\u0005$\u0000\u0000"+
		"\u020f\u0210\u0003\u001e\u000f\u0000\u0210\u0211\u0005%\u0000\u0000\u0211"+
		"\u0213\u0001\u0000\u0000\u0000\u0212\u0207\u0001\u0000\u0000\u0000\u0212"+
		"\u020c\u0001\u0000\u0000\u0000\u0213A\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0003D\"\u0000\u0215C\u0001\u0000\u0000\u0000\u0216\u0220\u0003:\u001d"+
		"\u0000\u0217\u0220\u0005\u0002\u0000\u0000\u0218\u0219\u0005$\u0000\u0000"+
		"\u0219\u021a\u0003\u001a\r\u0000\u021a\u021b\u0005%\u0000\u0000\u021b"+
		"\u0220\u0001\u0000\u0000\u0000\u021c\u0220\u0003@ \u0000\u021d\u0220\u0003"+
		"\u001c\u000e\u0000\u021e\u0220\u0003>\u001f\u0000\u021f\u0216\u0001\u0000"+
		"\u0000\u0000\u021f\u0217\u0001\u0000\u0000\u0000\u021f\u0218\u0001\u0000"+
		"\u0000\u0000\u021f\u021c\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220E\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0006#\uffff\uffff\u0000\u0222\u0223\u0003H$\u0000"+
		"\u0223\u0229\u0001\u0000\u0000\u0000\u0224\u0225\n\u0001\u0000\u0000\u0225"+
		"\u0226\u0005\u0013\u0000\u0000\u0226\u0228\u0003H$\u0000\u0227\u0224\u0001"+
		"\u0000\u0000\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001"+
		"\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022aG\u0001\u0000"+
		"\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022c\u022d\u0003J%\u0000"+
		"\u022dI\u0001\u0000\u0000\u0000\u022e\u022f\u0003L&\u0000\u022fK\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0006&\uffff\uffff\u0000\u0231\u0232\u0003"+
		"N\'\u0000\u0232\u023b\u0001\u0000\u0000\u0000\u0233\u0234\n\u0002\u0000"+
		"\u0000\u0234\u0235\u0005\u0018\u0000\u0000\u0235\u023a\u0003N\'\u0000"+
		"\u0236\u0237\n\u0001\u0000\u0000\u0237\u0238\u0005\u0019\u0000\u0000\u0238"+
		"\u023a\u0003N\'\u0000\u0239\u0233\u0001\u0000\u0000\u0000\u0239\u0236"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023cM\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0006"+
		"\'\uffff\uffff\u0000\u023f\u0240\u0003P(\u0000\u0240\u024c\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\n\u0003\u0000\u0000\u0242\u0243\u0005\u001a\u0000"+
		"\u0000\u0243\u024b\u0003P(\u0000\u0244\u0245\n\u0002\u0000\u0000\u0245"+
		"\u0246\u0005\u001b\u0000\u0000\u0246\u024b\u0003P(\u0000\u0247\u0248\n"+
		"\u0001\u0000\u0000\u0248\u0249\u0005\u001c\u0000\u0000\u0249\u024b\u0003"+
		"P(\u0000\u024a\u0241\u0001\u0000\u0000\u0000\u024a\u0244\u0001\u0000\u0000"+
		"\u0000\u024a\u0247\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024dO\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000"+
		"\u024f\u0257\u0003R)\u0000\u0250\u0257\u0003T*\u0000\u0251\u0252\u0005"+
		"\u0018\u0000\u0000\u0252\u0257\u0003P(\u0000\u0253\u0254\u0005\u0019\u0000"+
		"\u0000\u0254\u0257\u0003P(\u0000\u0255\u0257\u0003V+\u0000\u0256\u024f"+
		"\u0001\u0000\u0000\u0000\u0256\u0250\u0001\u0000\u0000\u0000\u0256\u0251"+
		"\u0001\u0000\u0000\u0000\u0256\u0253\u0001\u0000\u0000\u0000\u0256\u0255"+
		"\u0001\u0000\u0000\u0000\u0257Q\u0001\u0000\u0000\u0000\u0258\u0259\u0005"+
		"\u0017\u0000\u0000\u0259\u025a\u0003P(\u0000\u025aS\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0005\u0016\u0000\u0000\u025c\u025d\u0003P(\u0000\u025d"+
		"U\u0001\u0000\u0000\u0000\u025e\u0261\u0003B!\u0000\u025f\u0261\u0003"+
		"^/\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000\u0000"+
		"\u0000\u0261W\u0001\u0000\u0000\u0000\u0262\u0263\u0005#\u0000\u0000\u0263"+
		"Y\u0001\u0000\u0000\u0000\u0264\u0265\u0003^/\u0000\u0265[\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0005 \u0000\u0000\u0267]\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0003`0\u0000\u0269\u026b\u0003\\.\u0000\u026a\u0268\u0001"+
		"\u0000\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b_\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0005 \u0000\u0000\u026d\u026e\u0005\u0006\u0000"+
		"\u0000\u026e\u026f\u0003^/\u0000\u026fa\u0001\u0000\u0000\u0000#hu~\u0086"+
		"\u0093\u00b9\u00db\u00f5\u00fd\u0106\u010f\u0116\u0129\u0132\u0138\u013f"+
		"\u0151\u0166\u017b\u0190\u01a5\u01b3\u01c6\u01f9\u0204\u0212\u021f\u0229"+
		"\u0239\u023b\u024a\u024c\u0256\u0260\u026a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}