// Generated from java-escape by ANTLR 4.11.1
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, BOOLEAN=2, INTTYPE=3, STRINGTYPE=4, BOOLEANTYPE=5, CHARTYPE=6, 
		VOIDTYPE=7, EQUALS=8, STRING=9, CHAR=10, COMMA=11, INTEGER=12, PUBLIC=13, 
		PRIVATE=14, PROTECTED=15, NAME=16, WAVEDBROPEN=17, WAVEDBRCLOSE=18, SEMICOLON=19, 
		BROPEN=20, BRCLOSE=21, SEQUENCE=22;
	public static final int
		RULE_program = 0, RULE_classes = 1, RULE_class = 2, RULE_block = 3, RULE_accessMod = 4, 
		RULE_type = 5, RULE_statements = 6, RULE_statement = 7, RULE_classbody = 8, 
		RULE_fielddeclaration = 9, RULE_parameter = 10, RULE_booldeclaration = 11, 
		RULE_stringdeclaration = 12, RULE_chardeclaration = 13, RULE_intdeclaration = 14, 
		RULE_methoddeclaration = 15, RULE_parameters = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classes", "class", "block", "accessMod", "type", "statements", 
			"statement", "classbody", "fielddeclaration", "parameter", "booldeclaration", 
			"stringdeclaration", "chardeclaration", "intdeclaration", "methoddeclaration", 
			"parameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", null, "'int'", "'String'", "'boolean'", "'char'", "'void'", 
			"'='", null, null, "','", null, "'public'", "'private'", "'protected'", 
			null, "'{'", "'}'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", "BOOLEANTYPE", "CHARTYPE", 
			"VOIDTYPE", "EQUALS", "STRING", "CHAR", "COMMA", "INTEGER", "PUBLIC", 
			"PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", "SEMICOLON", 
			"BROPEN", "BRCLOSE", "SEQUENCE"
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
			setState(34);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				class_();
				setState(37);
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
			setState(42);
			accessMod();
			setState(43);
			match(CLASS);
			setState(44);
			match(NAME);
			setState(45);
			match(WAVEDBROPEN);
			setState(46);
			classbody();
			setState(47);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(WAVEDBROPEN);
				setState(50);
				match(WAVEDBRCLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(WAVEDBROPEN);
				setState(52);
				statements();
				setState(53);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(PUBLIC);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(PRIVATE);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
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
			setState(63);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 248L) != 0) ) {
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
			case STRINGTYPE:
			case BOOLEANTYPE:
			case CHARTYPE:
			case PUBLIC:
			case PRIVATE:
			case PROTECTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				statement();
				setState(66);
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
		public FielddeclarationContext fielddeclaration() {
			return getRuleContext(FielddeclarationContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			fielddeclaration();
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
		enterRule(_localctx, 16, RULE_classbody);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				fielddeclaration();
				setState(74);
				classbody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				methoddeclaration();
				setState(77);
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
		enterRule(_localctx, 18, RULE_fielddeclaration);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				booldeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				stringdeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				chardeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
		enterRule(_localctx, 20, RULE_parameter);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				accessMod();
				setState(89);
				match(BOOLEANTYPE);
				setState(90);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				accessMod();
				setState(93);
				match(STRINGTYPE);
				setState(94);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				accessMod();
				setState(97);
				match(CHARTYPE);
				setState(98);
				match(NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				accessMod();
				setState(101);
				match(INTTYPE);
				setState(102);
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
		enterRule(_localctx, 22, RULE_booldeclaration);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				accessMod();
				setState(107);
				match(BOOLEANTYPE);
				setState(108);
				match(NAME);
				setState(109);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				accessMod();
				setState(112);
				match(BOOLEANTYPE);
				setState(113);
				match(NAME);
				setState(114);
				match(EQUALS);
				setState(115);
				match(BOOLEAN);
				setState(116);
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
		enterRule(_localctx, 24, RULE_stringdeclaration);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				accessMod();
				setState(121);
				match(STRINGTYPE);
				setState(122);
				match(NAME);
				setState(123);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				accessMod();
				setState(126);
				match(STRINGTYPE);
				setState(127);
				match(NAME);
				setState(128);
				match(EQUALS);
				setState(129);
				match(STRING);
				setState(130);
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
		enterRule(_localctx, 26, RULE_chardeclaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				accessMod();
				setState(135);
				match(CHARTYPE);
				setState(136);
				match(NAME);
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				accessMod();
				setState(140);
				match(CHARTYPE);
				setState(141);
				match(NAME);
				setState(142);
				match(EQUALS);
				setState(143);
				match(CHAR);
				setState(144);
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
		enterRule(_localctx, 28, RULE_intdeclaration);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				accessMod();
				setState(149);
				match(INTTYPE);
				setState(150);
				match(NAME);
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				accessMod();
				setState(154);
				match(INTTYPE);
				setState(155);
				match(NAME);
				setState(156);
				match(EQUALS);
				setState(157);
				match(INTEGER);
				setState(158);
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
		enterRule(_localctx, 30, RULE_methoddeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			accessMod();
			setState(163);
			type();
			setState(164);
			match(NAME);
			setState(165);
			match(BROPEN);
			setState(166);
			parameters();
			setState(167);
			match(BRCLOSE);
			setState(168);
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
		enterRule(_localctx, 32, RULE_parameters);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				parameter();
				setState(171);
				match(COMMA);
				setState(172);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		"\u0004\u0001\u0016\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004>\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tW\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\ni\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bw\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0085\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0093"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b1"+
		"\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0001\u0001\u0000"+
		"\u0003\u0007\u00b5\u0000\"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000"+
		"\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000"+
		"\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fE\u0001\u0000"+
		"\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000\u0000"+
		"\u0012V\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016v"+
		"\u0001\u0000\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a\u0092"+
		"\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00a2"+
		"\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000\u0000\u0000\"#\u0003\u0002"+
		"\u0001\u0000#\u0001\u0001\u0000\u0000\u0000$%\u0003\u0004\u0002\u0000"+
		"%&\u0003\u0002\u0001\u0000&)\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000"+
		"\u0000($\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0003\b\u0004\u0000+,\u0005\u0001\u0000\u0000,-\u0005"+
		"\u0010\u0000\u0000-.\u0005\u0011\u0000\u0000./\u0003\u0010\b\u0000/0\u0005"+
		"\u0012\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0011\u0000"+
		"\u000028\u0005\u0012\u0000\u000034\u0005\u0011\u0000\u000045\u0003\f\u0006"+
		"\u000056\u0005\u0012\u0000\u000068\u0001\u0000\u0000\u000071\u0001\u0000"+
		"\u0000\u000073\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u0000"+
		"9>\u0005\r\u0000\u0000:>\u0005\u000e\u0000\u0000;>\u0005\u000f\u0000\u0000"+
		"<>\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\t\u0001\u0000"+
		"\u0000\u0000?@\u0007\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000"+
		"AB\u0003\u000e\u0007\u0000BC\u0003\f\u0006\u0000CF\u0001\u0000\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000F\r\u0001\u0000\u0000\u0000GH\u0003\u0012\t\u0000H\u000f\u0001\u0000"+
		"\u0000\u0000IJ\u0003\u0012\t\u0000JK\u0003\u0010\b\u0000KQ\u0001\u0000"+
		"\u0000\u0000LM\u0003\u001e\u000f\u0000MN\u0003\u0010\b\u0000NQ\u0001\u0000"+
		"\u0000\u0000OQ\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PL\u0001"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0011\u0001\u0000\u0000"+
		"\u0000RW\u0003\u0016\u000b\u0000SW\u0003\u0018\f\u0000TW\u0003\u001a\r"+
		"\u0000UW\u0003\u001c\u000e\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0013"+
		"\u0001\u0000\u0000\u0000XY\u0003\b\u0004\u0000YZ\u0005\u0005\u0000\u0000"+
		"Z[\u0005\u0010\u0000\u0000[i\u0001\u0000\u0000\u0000\\]\u0003\b\u0004"+
		"\u0000]^\u0005\u0004\u0000\u0000^_\u0005\u0010\u0000\u0000_i\u0001\u0000"+
		"\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005\u0006\u0000\u0000bc\u0005\u0010"+
		"\u0000\u0000ci\u0001\u0000\u0000\u0000de\u0003\b\u0004\u0000ef\u0005\u0003"+
		"\u0000\u0000fg\u0005\u0010\u0000\u0000gi\u0001\u0000\u0000\u0000hX\u0001"+
		"\u0000\u0000\u0000h\\\u0001\u0000\u0000\u0000h`\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000i\u0015\u0001\u0000\u0000\u0000jk\u0003\b\u0004"+
		"\u0000kl\u0005\u0005\u0000\u0000lm\u0005\u0010\u0000\u0000mn\u0005\u0013"+
		"\u0000\u0000nw\u0001\u0000\u0000\u0000op\u0003\b\u0004\u0000pq\u0005\u0005"+
		"\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0005\b\u0000\u0000st\u0005\u0002"+
		"\u0000\u0000tu\u0005\u0013\u0000\u0000uw\u0001\u0000\u0000\u0000vj\u0001"+
		"\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000w\u0017\u0001\u0000\u0000"+
		"\u0000xy\u0003\b\u0004\u0000yz\u0005\u0004\u0000\u0000z{\u0005\u0010\u0000"+
		"\u0000{|\u0005\u0013\u0000\u0000|\u0085\u0001\u0000\u0000\u0000}~\u0003"+
		"\b\u0004\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080\u0005\u0010"+
		"\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082\u0005\t\u0000"+
		"\u0000\u0082\u0083\u0005\u0013\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084x\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000\u0000\u0085"+
		"\u0019\u0001\u0000\u0000\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088"+
		"\u0005\u0006\u0000\u0000\u0088\u0089\u0005\u0010\u0000\u0000\u0089\u008a"+
		"\u0005\u0013\u0000\u0000\u008a\u0093\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003\b\u0004\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0005"+
		"\u0010\u0000\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0005\n"+
		"\u0000\u0000\u0090\u0091\u0005\u0013\u0000\u0000\u0091\u0093\u0001\u0000"+
		"\u0000\u0000\u0092\u0086\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000"+
		"\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000\u0094\u0095\u0003\b\u0004"+
		"\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005\u0010\u0000"+
		"\u0000\u0097\u0098\u0005\u0013\u0000\u0000\u0098\u00a1\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0003\b\u0004\u0000\u009a\u009b\u0005\u0003\u0000\u0000"+
		"\u009b\u009c\u0005\u0010\u0000\u0000\u009c\u009d\u0005\b\u0000\u0000\u009d"+
		"\u009e\u0005\f\u0000\u0000\u009e\u009f\u0005\u0013\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a0\u0099"+
		"\u0001\u0000\u0000\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0003\b\u0004\u0000\u00a3\u00a4\u0003\n\u0005\u0000\u00a4\u00a5\u0005"+
		"\u0010\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0003"+
		" \u0010\u0000\u00a7\u00a8\u0005\u0015\u0000\u0000\u00a8\u00a9\u0003\u0006"+
		"\u0003\u0000\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0014"+
		"\n\u0000\u00ab\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ad\u0003 \u0010"+
		"\u0000\u00ad\u00b1\u0001\u0000\u0000\u0000\u00ae\u00b1\u0003\u0014\n\u0000"+
		"\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1!\u0001\u0000\u0000\u0000\f(7=EPVhv\u0084\u0092\u00a0\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}