// Generated from java-escape by ANTLR 4.11.1
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, BOOLEAN=2, INTTYPE=3, STRINGTYPE=4, BOOLEANTYPE=5, CHARTYPE=6, 
		VOIDTYPE=7, EQUALS=8, STRING=9, CHAR=10, COMMA=11, INTEGER=12, PUBLIC=13, 
		PRIVATE=14, PROTECTED=15, NAME=16, WAVEDBROPEN=17, WAVEDBRCLOSE=18, SEMICOLON=19, 
		BROPEN=20, BRCLOSE=21, SEQUENCE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", "BOOLEANTYPE", "CHARTYPE", 
			"VOIDTYPE", "EQUALS", "STRING", "CHAR", "COMMA", "INTEGER", "PUBLIC", 
			"PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", "SEMICOLON", 
			"BROPEN", "BRCLOSE", "SEQUENCE"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"=\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bo\b\u000b\n\u000b\f\u000br\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0004\u000f\u008e\b\u000f\u000b\u000f\f\u000f"+
		"\u008f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016\u0001\u0000\u0004\u0003\u000009AZaz\u0001\u00001"+
		"9\u0001\u000009\u0002\u0000AZaz\u00a0\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000\u0000\u0005>\u0001"+
		"\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000"+
		"\u0000\u000bQ\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000f"+
		"[\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013f\u0001"+
		"\u0000\u0000\u0000\u0015j\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000"+
		"\u0000\u0019s\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d"+
		"\u0082\u0001\u0000\u0000\u0000\u001f\u008d\u0001\u0000\u0000\u0000!\u0091"+
		"\u0001\u0000\u0000\u0000#\u0093\u0001\u0000\u0000\u0000%\u0095\u0001\u0000"+
		"\u0000\u0000\'\u0097\u0001\u0000\u0000\u0000)\u0099\u0001\u0000\u0000"+
		"\u0000+\u009b\u0001\u0000\u0000\u0000-.\u0005c\u0000\u0000./\u0005l\u0000"+
		"\u0000/0\u0005a\u0000\u000001\u0005s\u0000\u000012\u0005s\u0000\u0000"+
		"2\u0002\u0001\u0000\u0000\u000034\u0005t\u0000\u000045\u0005r\u0000\u0000"+
		"56\u0005u\u0000\u00006=\u0005e\u0000\u000078\u0005f\u0000\u000089\u0005"+
		"a\u0000\u00009:\u0005l\u0000\u0000:;\u0005s\u0000\u0000;=\u0005e\u0000"+
		"\u0000<3\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000=\u0004\u0001"+
		"\u0000\u0000\u0000>?\u0005i\u0000\u0000?@\u0005n\u0000\u0000@A\u0005t"+
		"\u0000\u0000A\u0006\u0001\u0000\u0000\u0000BC\u0005S\u0000\u0000CD\u0005"+
		"t\u0000\u0000DE\u0005r\u0000\u0000EF\u0005i\u0000\u0000FG\u0005n\u0000"+
		"\u0000GH\u0005g\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005b\u0000"+
		"\u0000JK\u0005o\u0000\u0000KL\u0005o\u0000\u0000LM\u0005l\u0000\u0000"+
		"MN\u0005e\u0000\u0000NO\u0005a\u0000\u0000OP\u0005n\u0000\u0000P\n\u0001"+
		"\u0000\u0000\u0000QR\u0005c\u0000\u0000RS\u0005h\u0000\u0000ST\u0005a"+
		"\u0000\u0000TU\u0005r\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005v"+
		"\u0000\u0000WX\u0005o\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005d\u0000"+
		"\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005=\u0000\u0000\\\u0010\u0001"+
		"\u0000\u0000\u0000]a\u0005\"\u0000\u0000^`\u0003+\u0015\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000de\u0005\"\u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005\'"+
		"\u0000\u0000gh\u0007\u0000\u0000\u0000hi\u0005\'\u0000\u0000i\u0014\u0001"+
		"\u0000\u0000\u0000jk\u0005,\u0000\u0000k\u0016\u0001\u0000\u0000\u0000"+
		"lp\u0007\u0001\u0000\u0000mo\u0007\u0002\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u0018\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"st\u0005p\u0000\u0000tu\u0005u\u0000\u0000uv\u0005b\u0000\u0000vw\u0005"+
		"l\u0000\u0000wx\u0005i\u0000\u0000xy\u0005c\u0000\u0000y\u001a\u0001\u0000"+
		"\u0000\u0000z{\u0005p\u0000\u0000{|\u0005r\u0000\u0000|}\u0005i\u0000"+
		"\u0000}~\u0005v\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f\u0080\u0005"+
		"t\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u001c\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005p\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084"+
		"\u0085\u0005o\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005"+
		"e\u0000\u0000\u0087\u0088\u0005c\u0000\u0000\u0088\u0089\u0005t\u0000"+
		"\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005d\u0000\u0000\u008b"+
		"\u001e\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0003\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		" \u0001\u0000\u0000\u0000\u0091\u0092\u0005{\u0000\u0000\u0092\"\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005}\u0000\u0000\u0094$\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005;\u0000\u0000\u0096&\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005(\u0000\u0000\u0098(\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		")\u0000\u0000\u009a*\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000\u0000"+
		"\u0000\u009c,\u0001\u0000\u0000\u0000\u0005\u0000<ap\u008f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}