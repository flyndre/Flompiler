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
		WHILE=1, IF=2, ELSE=3, RETURN=4, CLASS=5, BOOLEAN=6, INTTYPE=7, STRINGTYPE=8, 
		BOOLEANTYPE=9, CHARTYPE=10, VOIDTYPE=11, EQUALS=12, STRING=13, CHAR=14, 
		INTEGER=15, COMMA=16, PUBLIC=17, PRIVATE=18, PROTECTED=19, NAME=20, WAVEDBROPEN=21, 
		WAVEDBRCLOSE=22, SEMICOLON=23, BROPEN=24, BRCLOSE=25, SEQUENCE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "IF", "ELSE", "RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", 
			"BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "INTEGER", 
			"COMMA", "PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
			"SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'else'", "'return'", "'class'", null, "'int'", 
			"'String'", "'boolean'", "'char'", "'void'", "'='", null, null, null, 
			"','", "'public'", "'private'", "'protected'", null, "'{'", "'}'", "';'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "IF", "ELSE", "RETURN", "CLASS", "BOOLEAN", "INTTYPE", 
			"STRINGTYPE", "BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", 
			"CHAR", "INTEGER", "COMMA", "PUBLIC", "PRIVATE", "PROTECTED", "NAME", 
			"WAVEDBROPEN", "WAVEDBRCLOSE", "SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
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
		"\u0004\u0000\u001a\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\f}\b\f\n\f\f\f\u0080\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u008a\b\u000e\n\u000e\f\u000e\u008d\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0004\u0013\u00ab\b\u0013\u000b\u0013\f\u0013\u00ac"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0004\u0003\u000009AZ"+
		"az\u0001\u000019\u0001\u000009\u0002\u0000AZaz\u00bd\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00015"+
		"\u0001\u0000\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005>\u0001\u0000"+
		"\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000"+
		"\u000bY\u0001\u0000\u0000\u0000\r[\u0001\u0000\u0000\u0000\u000f_\u0001"+
		"\u0000\u0000\u0000\u0011f\u0001\u0000\u0000\u0000\u0013n\u0001\u0000\u0000"+
		"\u0000\u0015s\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019"+
		"z\u0001\u0000\u0000\u0000\u001b\u0083\u0001\u0000\u0000\u0000\u001d\u0087"+
		"\u0001\u0000\u0000\u0000\u001f\u008e\u0001\u0000\u0000\u0000!\u0090\u0001"+
		"\u0000\u0000\u0000#\u0097\u0001\u0000\u0000\u0000%\u009f\u0001\u0000\u0000"+
		"\u0000\'\u00aa\u0001\u0000\u0000\u0000)\u00ae\u0001\u0000\u0000\u0000"+
		"+\u00b0\u0001\u0000\u0000\u0000-\u00b2\u0001\u0000\u0000\u0000/\u00b4"+
		"\u0001\u0000\u0000\u00001\u00b6\u0001\u0000\u0000\u00003\u00b8\u0001\u0000"+
		"\u0000\u000056\u0005w\u0000\u000067\u0005h\u0000\u000078\u0005i\u0000"+
		"\u000089\u0005l\u0000\u00009:\u0005e\u0000\u0000:\u0002\u0001\u0000\u0000"+
		"\u0000;<\u0005i\u0000\u0000<=\u0005f\u0000\u0000=\u0004\u0001\u0000\u0000"+
		"\u0000>?\u0005e\u0000\u0000?@\u0005l\u0000\u0000@A\u0005s\u0000\u0000"+
		"AB\u0005e\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005r\u0000\u0000"+
		"DE\u0005e\u0000\u0000EF\u0005t\u0000\u0000FG\u0005u\u0000\u0000GH\u0005"+
		"r\u0000\u0000HI\u0005n\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005"+
		"c\u0000\u0000KL\u0005l\u0000\u0000LM\u0005a\u0000\u0000MN\u0005s\u0000"+
		"\u0000NO\u0005s\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ\u0005t\u0000"+
		"\u0000QR\u0005r\u0000\u0000RS\u0005u\u0000\u0000SZ\u0005e\u0000\u0000"+
		"TU\u0005f\u0000\u0000UV\u0005a\u0000\u0000VW\u0005l\u0000\u0000WX\u0005"+
		"s\u0000\u0000XZ\u0005e\u0000\u0000YP\u0001\u0000\u0000\u0000YT\u0001\u0000"+
		"\u0000\u0000Z\f\u0001\u0000\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005"+
		"n\u0000\u0000]^\u0005t\u0000\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005"+
		"S\u0000\u0000`a\u0005t\u0000\u0000ab\u0005r\u0000\u0000bc\u0005i\u0000"+
		"\u0000cd\u0005n\u0000\u0000de\u0005g\u0000\u0000e\u0010\u0001\u0000\u0000"+
		"\u0000fg\u0005b\u0000\u0000gh\u0005o\u0000\u0000hi\u0005o\u0000\u0000"+
		"ij\u0005l\u0000\u0000jk\u0005e\u0000\u0000kl\u0005a\u0000\u0000lm\u0005"+
		"n\u0000\u0000m\u0012\u0001\u0000\u0000\u0000no\u0005c\u0000\u0000op\u0005"+
		"h\u0000\u0000pq\u0005a\u0000\u0000qr\u0005r\u0000\u0000r\u0014\u0001\u0000"+
		"\u0000\u0000st\u0005v\u0000\u0000tu\u0005o\u0000\u0000uv\u0005i\u0000"+
		"\u0000vw\u0005d\u0000\u0000w\u0016\u0001\u0000\u0000\u0000xy\u0005=\u0000"+
		"\u0000y\u0018\u0001\u0000\u0000\u0000z~\u0005\"\u0000\u0000{}\u00033\u0019"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\"\u0000"+
		"\u0000\u0082\u001a\u0001\u0000\u0000\u0000\u0083\u0084\u0005\'\u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086"+
		"\u001c\u0001\u0000\u0000\u0000\u0087\u008b\u0007\u0001\u0000\u0000\u0088"+
		"\u008a\u0007\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u001e\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005,\u0000\u0000\u008f \u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005p\u0000\u0000\u0091\u0092\u0005u\u0000"+
		"\u0000\u0092\u0093\u0005b\u0000\u0000\u0093\u0094\u0005l\u0000\u0000\u0094"+
		"\u0095\u0005i\u0000\u0000\u0095\u0096\u0005c\u0000\u0000\u0096\"\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005p\u0000\u0000\u0098\u0099\u0005r\u0000"+
		"\u0000\u0099\u009a\u0005i\u0000\u0000\u009a\u009b\u0005v\u0000\u0000\u009b"+
		"\u009c\u0005a\u0000\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u009e\u0005"+
		"e\u0000\u0000\u009e$\u0001\u0000\u0000\u0000\u009f\u00a0\u0005p\u0000"+
		"\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2"+
		"\u00a3\u0005t\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005"+
		"c\u0000\u0000\u00a5\u00a6\u0005t\u0000\u0000\u00a6\u00a7\u0005e\u0000"+
		"\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8&\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0007\u0003\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad(\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005{\u0000\u0000\u00af*\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005}"+
		"\u0000\u0000\u00b1,\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005;\u0000\u0000"+
		"\u00b3.\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005(\u0000\u0000\u00b50"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005)\u0000\u0000\u00b72\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0007\u0000\u0000\u0000\u00b94\u0001\u0000\u0000"+
		"\u0000\u0005\u0000Y~\u008b\u00ac\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}