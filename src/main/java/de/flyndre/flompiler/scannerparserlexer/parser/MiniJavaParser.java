// Generated from java-escape by ANTLR 4.11.1
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, RETURN=3, CLASS=4, BOOLEAN=5, INTTYPE=6, STRINGTYPE=7, BOOLEANTYPE=8, 
		CHARTYPE=9, VOIDTYPE=10, EQUALS=11, STRING=12, CHAR=13, INTEGER=14, COMMA=15, 
		PUBLIC=16, PRIVATE=17, PROTECTED=18, NAME=19, WAVEDBROPEN=20, WAVEDBRCLOSE=21, 
		SEMICOLON=22, BROPEN=23, BRCLOSE=24, SEQUENCE=25;
	public static final int
		RULE_program = 0, RULE_classes = 1, RULE_class = 2, RULE_block = 3, RULE_accessMod = 4, 
		RULE_type = 5, RULE_statements = 6, RULE_statement = 7, RULE_ifstatement = 8, 
		RULE_ifelsestatement = 9, RULE_expression = 10, RULE_returnstatement = 11, 
		RULE_classbody = 12, RULE_fielddeclaration = 13, RULE_parameter = 14, 
		RULE_booldeclaration = 15, RULE_stringdeclaration = 16, RULE_chardeclaration = 17, 
		RULE_intdeclaration = 18, RULE_methoddeclaration = 19, RULE_parameters = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classes", "class", "block", "accessMod", "type", "statements", 
			"statement", "ifstatement", "ifelsestatement", "expression", "returnstatement", 
			"classbody", "fielddeclaration", "parameter", "booldeclaration", "stringdeclaration", 
			"chardeclaration", "intdeclaration", "methoddeclaration", "parameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'class'", null, "'int'", "'String'", 
			"'boolean'", "'char'", "'void'", "'='", null, null, null, "','", "'public'", 
			"'private'", "'protected'", null, "'{'", "'}'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", 
			"BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "INTEGER", 
			"COMMA", "PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
			"SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
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
	public String getGrammarFileName() { return "java-escape"; }

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
			setState(42);
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				class_();
				setState(45);
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
			setState(50);
			accessMod();
			setState(51);
			match(CLASS);
			setState(52);
			match(NAME);
			setState(53);
			match(WAVEDBROPEN);
			setState(54);
			classbody();
			setState(55);
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
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(WAVEDBROPEN);
				setState(58);
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
				setState(60);
				match(WAVEDBROPEN);
				setState(61);
				statements();
				setState(62);
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
		enterRule(_localctx, 8, RULE_accessMod);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(PROTECTED);
				}
				break;
			case CLASS:
			case INTTYPE:
			case STRINGTYPE:
			case BOOLEANTYPE:
			case CHARTYPE:
			case VOIDTYPE:
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
			setState(72);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0) ) {
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				statement();
				setState(75);
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				returnstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				ifelsestatement();
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(IF);
				setState(86);
				match(BROPEN);
				setState(87);
				expression();
				setState(88);
				match(BRCLOSE);
				setState(89);
				statement();
				setState(90);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(IF);
				setState(93);
				match(BROPEN);
				setState(94);
				expression();
				setState(95);
				match(BRCLOSE);
				setState(96);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(IF);
				setState(99);
				match(BROPEN);
				setState(100);
				expression();
				setState(101);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(IF);
				setState(106);
				match(BROPEN);
				setState(107);
				expression();
				setState(108);
				match(BRCLOSE);
				setState(109);
				statement();
				setState(110);
				match(ELSE);
				setState(111);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(IF);
				setState(114);
				match(BROPEN);
				setState(115);
				expression();
				setState(116);
				match(BRCLOSE);
				setState(117);
				block();
				setState(118);
				match(ELSE);
				setState(119);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(BOOLEAN);
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
	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniJavaParser.RETURN, 0); }
		public TerminalNode INTEGER() { return getToken(MiniJavaParser.INTEGER, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(MiniJavaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 22, RULE_returnstatement);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(RETURN);
				setState(126);
				match(INTEGER);
				setState(127);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(RETURN);
				setState(129);
				match(STRING);
				setState(130);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(RETURN);
				setState(132);
				match(CHAR);
				setState(133);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(RETURN);
				setState(135);
				match(BOOLEAN);
				setState(136);
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
		enterRule(_localctx, 24, RULE_classbody);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				fielddeclaration();
				setState(140);
				classbody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				methoddeclaration();
				setState(143);
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
		enterRule(_localctx, 26, RULE_fielddeclaration);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				booldeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				stringdeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				chardeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				intdeclaration();
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
		enterRule(_localctx, 28, RULE_parameter);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				accessMod();
				setState(155);
				match(BOOLEANTYPE);
				setState(156);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				accessMod();
				setState(159);
				match(STRINGTYPE);
				setState(160);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				accessMod();
				setState(163);
				match(CHARTYPE);
				setState(164);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				accessMod();
				setState(167);
				match(INTTYPE);
				setState(168);
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
		enterRule(_localctx, 30, RULE_booldeclaration);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				accessMod();
				setState(173);
				match(BOOLEANTYPE);
				setState(174);
				match(NAME);
				setState(175);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				accessMod();
				setState(178);
				match(BOOLEANTYPE);
				setState(179);
				match(NAME);
				setState(180);
				match(EQUALS);
				setState(181);
				match(BOOLEAN);
				setState(182);
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
		enterRule(_localctx, 32, RULE_stringdeclaration);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				accessMod();
				setState(187);
				match(STRINGTYPE);
				setState(188);
				match(NAME);
				setState(189);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				accessMod();
				setState(192);
				match(STRINGTYPE);
				setState(193);
				match(NAME);
				setState(194);
				match(EQUALS);
				setState(195);
				match(STRING);
				setState(196);
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
		enterRule(_localctx, 34, RULE_chardeclaration);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				accessMod();
				setState(201);
				match(CHARTYPE);
				setState(202);
				match(NAME);
				setState(203);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				accessMod();
				setState(206);
				match(CHARTYPE);
				setState(207);
				match(NAME);
				setState(208);
				match(EQUALS);
				setState(209);
				match(CHAR);
				setState(210);
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
		enterRule(_localctx, 36, RULE_intdeclaration);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				accessMod();
				setState(215);
				match(INTTYPE);
				setState(216);
				match(NAME);
				setState(217);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				accessMod();
				setState(220);
				match(INTTYPE);
				setState(221);
				match(NAME);
				setState(222);
				match(EQUALS);
				setState(223);
				match(INTEGER);
				setState(224);
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
		enterRule(_localctx, 38, RULE_methoddeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			accessMod();
			setState(229);
			type();
			setState(230);
			match(NAME);
			setState(231);
			match(BROPEN);
			setState(232);
			parameters();
			setState(233);
			match(BRCLOSE);
			setState(234);
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
		enterRule(_localctx, 40, RULE_parameters);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				parameter();
				setState(237);
				match(COMMA);
				setState(238);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006O\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007T\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bh\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tz\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u008a\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0099\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ab\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b9\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c7"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e3\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00f3\b\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0001\u0001\u0000\u0006\n\u00fc\u0000*\u0001\u0000\u0000"+
		"\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006"+
		"@\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fN\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010"+
		"g\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014{\u0001"+
		"\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u0092\u0001"+
		"\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000\u0000\u001c\u00aa\u0001"+
		"\u0000\u0000\u0000\u001e\u00b8\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000"+
		"\u0000\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00e2\u0001\u0000\u0000"+
		"\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000\u0000\u0000*"+
		"+\u0003\u0002\u0001\u0000+\u0001\u0001\u0000\u0000\u0000,-\u0003\u0004"+
		"\u0002\u0000-.\u0003\u0002\u0001\u0000.1\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"1\u0003\u0001\u0000\u0000\u000023\u0003\b\u0004\u000034\u0005\u0004\u0000"+
		"\u000045\u0005\u0013\u0000\u000056\u0005\u0014\u0000\u000067\u0003\u0018"+
		"\f\u000078\u0005\u0015\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005"+
		"\u0014\u0000\u0000:A\u0005\u0015\u0000\u0000;A\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0014\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005\u0015\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@9\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000"+
		"\u0000@<\u0001\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BG\u0005"+
		"\u0010\u0000\u0000CG\u0005\u0011\u0000\u0000DG\u0005\u0012\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000"+
		"\u0000\u0000HI\u0007\u0000\u0000\u0000I\u000b\u0001\u0000\u0000\u0000"+
		"JK\u0003\u000e\u0007\u0000KL\u0003\f\u0006\u0000LO\u0001\u0000\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\r\u0001\u0000\u0000\u0000PT\u0003\u0016\u000b\u0000QT\u0003\u0010"+
		"\b\u0000RT\u0003\u0012\t\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0001\u0000\u0000VW\u0005\u0017\u0000\u0000WX\u0003\u0014\n\u0000"+
		"XY\u0005\u0018\u0000\u0000YZ\u0003\u000e\u0007\u0000Z[\u0005\u0016\u0000"+
		"\u0000[h\u0001\u0000\u0000\u0000\\]\u0005\u0001\u0000\u0000]^\u0005\u0017"+
		"\u0000\u0000^_\u0003\u0014\n\u0000_`\u0005\u0018\u0000\u0000`a\u0003\u0006"+
		"\u0003\u0000ah\u0001\u0000\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0005"+
		"\u0017\u0000\u0000de\u0003\u0014\n\u0000ef\u0005\u0018\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000gU\u0001\u0000\u0000\u0000g\\\u0001\u0000\u0000\u0000"+
		"gb\u0001\u0000\u0000\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\u0001"+
		"\u0000\u0000jk\u0005\u0017\u0000\u0000kl\u0003\u0014\n\u0000lm\u0005\u0018"+
		"\u0000\u0000mn\u0003\u000e\u0007\u0000no\u0005\u0002\u0000\u0000op\u0003"+
		"\u000e\u0007\u0000pz\u0001\u0000\u0000\u0000qr\u0005\u0001\u0000\u0000"+
		"rs\u0005\u0017\u0000\u0000st\u0003\u0014\n\u0000tu\u0005\u0018\u0000\u0000"+
		"uv\u0003\u0006\u0003\u0000vw\u0005\u0002\u0000\u0000wx\u0003\u0006\u0003"+
		"\u0000xz\u0001\u0000\u0000\u0000yi\u0001\u0000\u0000\u0000yq\u0001\u0000"+
		"\u0000\u0000z\u0013\u0001\u0000\u0000\u0000{|\u0005\u0005\u0000\u0000"+
		"|\u0015\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0005"+
		"\u000e\u0000\u0000\u007f\u008a\u0005\u0016\u0000\u0000\u0080\u0081\u0005"+
		"\u0003\u0000\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082\u008a\u0005\u0016"+
		"\u0000\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0005\r\u0000"+
		"\u0000\u0085\u008a\u0005\u0016\u0000\u0000\u0086\u0087\u0005\u0003\u0000"+
		"\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u008a\u0005\u0016\u0000"+
		"\u0000\u0089}\u0001\u0000\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000"+
		"\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000"+
		"\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u001a\r\u0000\u008c"+
		"\u008d\u0003\u0018\f\u0000\u008d\u0093\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003&\u0013\u0000\u008f\u0090\u0003\u0018\f\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008b\u0001"+
		"\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u0094\u0099\u0003"+
		"\u001e\u000f\u0000\u0095\u0099\u0003 \u0010\u0000\u0096\u0099\u0003\""+
		"\u0011\u0000\u0097\u0099\u0003$\u0012\u0000\u0098\u0094\u0001\u0000\u0000"+
		"\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u001b\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009c\u0005\b\u0000\u0000"+
		"\u009c\u009d\u0005\u0013\u0000\u0000\u009d\u00ab\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0003\b\u0004\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0013\u0000\u0000\u00a1\u00ab\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0003\b\u0004\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0013\u0000\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003\b\u0004\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0013\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u009a\u0001"+
		"\u0000\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00ab\u001d\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0003\b\u0004\u0000\u00ad\u00ae\u0005\b"+
		"\u0000\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af\u00b0\u0005\u0016"+
		"\u0000\u0000\u00b0\u00b9\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\b\u0004"+
		"\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0005\u0013\u0000\u0000"+
		"\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0016\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ac\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\b\u0004\u0000\u00bb"+
		"\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd\u0005\u0013\u0000\u0000\u00bd"+
		"\u00be\u0005\u0016\u0000\u0000\u00be\u00c7\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0003\b\u0004\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0013\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000\u0000\u00c3\u00c4"+
		"\u0005\f\u0000\u0000\u00c4\u00c5\u0005\u0016\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\b"+
		"\u0004\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb\u0005\u0013\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0016\u0000\u0000\u00cc\u00d5\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0003\b\u0004\u0000\u00ce\u00cf\u0005\t\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0013\u0000\u0000\u00d0\u00d1\u0005\u000b\u0000\u0000"+
		"\u00d1\u00d2\u0005\r\u0000\u0000\u00d2\u00d3\u0005\u0016\u0000\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0003\b\u0004\u0000\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0013\u0000\u0000\u00d9\u00da\u0005\u0016\u0000\u0000\u00da\u00e3\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003\b\u0004\u0000\u00dc\u00dd\u0005\u0006"+
		"\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00df\u0005\u000b"+
		"\u0000\u0000\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e1\u0005\u0016"+
		"\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d6\u0001\u0000"+
		"\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000\u00e3%\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0003\b\u0004\u0000\u00e5\u00e6\u0003\n\u0005\u0000"+
		"\u00e6\u00e7\u0005\u0013\u0000\u0000\u00e7\u00e8\u0005\u0017\u0000\u0000"+
		"\u00e8\u00e9\u0003(\u0014\u0000\u00e9\u00ea\u0005\u0018\u0000\u0000\u00ea"+
		"\u00eb\u0003\u0006\u0003\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0003\u001c\u000e\u0000\u00ed\u00ee\u0005\u000f\u0000\u0000\u00ee\u00ef"+
		"\u0003(\u0014\u0000\u00ef\u00f3\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003"+
		"\u001c\u000e\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000\u00100@FNSgy\u0089\u0092"+
		"\u0098\u00aa\u00b8\u00c6\u00d4\u00e2\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}