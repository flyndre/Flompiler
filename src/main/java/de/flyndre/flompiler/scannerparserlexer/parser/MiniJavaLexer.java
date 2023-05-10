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
		RETURN=1, CLASS=2, BOOLEAN=3, INTTYPE=4, STRINGTYPE=5, BOOLEANTYPE=6, 
		CHARTYPE=7, VOIDTYPE=8, EQUALS=9, STRING=10, CHAR=11, COMMA=12, INTEGER=13, 
		PUBLIC=14, PRIVATE=15, PROTECTED=16, NAME=17, WAVEDBROPEN=18, WAVEDBRCLOSE=19, 
		SEMICOLON=20, BROPEN=21, BRCLOSE=22, SEQUENCE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", "BOOLEANTYPE", 
			"CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "COMMA", "INTEGER", 
			"PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
			"SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'return'", "'class'", null, "'int'", "'String'", "'boolean'", 
			"'char'", "'void'", "'='", null, null, "','", null, "'public'", "'private'", 
			"'protected'", null, "'{'", "'}'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", "BOOLEANTYPE", 
			"CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "COMMA", "INTEGER", 
			"PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
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
		"\u0004\u0000\u0017\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005"+
		"\ti\b\t\n\t\f\tl\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fx\b\f\n\f\f\f{\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0097"+
		"\b\u0010\u000b\u0010\f\u0010\u0098\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0004\u0003"+
		"\u000009AZaz\u0001\u000019\u0001\u000009\u0002\u0000AZaz\u00a9\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000"+
		"\u0000\u00036\u0001\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007"+
		"G\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bR\u0001\u0000"+
		"\u0000\u0000\rZ\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000"+
		"\u0011d\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015o"+
		"\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019u\u0001\u0000"+
		"\u0000\u0000\u001b|\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000\u0000"+
		"\u0000\u001f\u008b\u0001\u0000\u0000\u0000!\u0096\u0001\u0000\u0000\u0000"+
		"#\u009a\u0001\u0000\u0000\u0000%\u009c\u0001\u0000\u0000\u0000\'\u009e"+
		"\u0001\u0000\u0000\u0000)\u00a0\u0001\u0000\u0000\u0000+\u00a2\u0001\u0000"+
		"\u0000\u0000-\u00a4\u0001\u0000\u0000\u0000/0\u0005r\u0000\u000001\u0005"+
		"e\u0000\u000012\u0005t\u0000\u000023\u0005u\u0000\u000034\u0005r\u0000"+
		"\u000045\u0005n\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005c\u0000"+
		"\u000078\u0005l\u0000\u000089\u0005a\u0000\u00009:\u0005s\u0000\u0000"+
		":;\u0005s\u0000\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0005t\u0000\u0000"+
		"=>\u0005r\u0000\u0000>?\u0005u\u0000\u0000?F\u0005e\u0000\u0000@A\u0005"+
		"f\u0000\u0000AB\u0005a\u0000\u0000BC\u0005l\u0000\u0000CD\u0005s\u0000"+
		"\u0000DF\u0005e\u0000\u0000E<\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000"+
		"\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000"+
		"\u0000IJ\u0005t\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005S\u0000"+
		"\u0000LM\u0005t\u0000\u0000MN\u0005r\u0000\u0000NO\u0005i\u0000\u0000"+
		"OP\u0005n\u0000\u0000PQ\u0005g\u0000\u0000Q\n\u0001\u0000\u0000\u0000"+
		"RS\u0005b\u0000\u0000ST\u0005o\u0000\u0000TU\u0005o\u0000\u0000UV\u0005"+
		"l\u0000\u0000VW\u0005e\u0000\u0000WX\u0005a\u0000\u0000XY\u0005n\u0000"+
		"\u0000Y\f\u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005h\u0000"+
		"\u0000\\]\u0005a\u0000\u0000]^\u0005r\u0000\u0000^\u000e\u0001\u0000\u0000"+
		"\u0000_`\u0005v\u0000\u0000`a\u0005o\u0000\u0000ab\u0005i\u0000\u0000"+
		"bc\u0005d\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0005=\u0000\u0000"+
		"e\u0012\u0001\u0000\u0000\u0000fj\u0005\"\u0000\u0000gi\u0003-\u0016\u0000"+
		"hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005\"\u0000\u0000n\u0014\u0001\u0000\u0000\u0000op\u0005"+
		"\'\u0000\u0000pq\u0007\u0000\u0000\u0000qr\u0005\'\u0000\u0000r\u0016"+
		"\u0001\u0000\u0000\u0000st\u0005,\u0000\u0000t\u0018\u0001\u0000\u0000"+
		"\u0000uy\u0007\u0001\u0000\u0000vx\u0007\u0002\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u001a\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|}\u0005p\u0000\u0000}~\u0005u\u0000\u0000~\u007f\u0005b\u0000\u0000"+
		"\u007f\u0080\u0005l\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082"+
		"\u0005c\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"p\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0086\u0005i\u0000"+
		"\u0000\u0086\u0087\u0005v\u0000\u0000\u0087\u0088\u0005a\u0000\u0000\u0088"+
		"\u0089\u0005t\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u001e\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005p\u0000\u0000\u008c\u008d\u0005r\u0000"+
		"\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f"+
		"\u0090\u0005e\u0000\u0000\u0090\u0091\u0005c\u0000\u0000\u0091\u0092\u0005"+
		"t\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u0094\u0005d\u0000"+
		"\u0000\u0094 \u0001\u0000\u0000\u0000\u0095\u0097\u0007\u0003\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\"\u0001\u0000\u0000\u0000\u009a\u009b\u0005{\u0000\u0000\u009b"+
		"$\u0001\u0000\u0000\u0000\u009c\u009d\u0005}\u0000\u0000\u009d&\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005;\u0000\u0000\u009f(\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005(\u0000\u0000\u00a1*\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005)\u0000\u0000\u00a3,\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007"+
		"\u0000\u0000\u0000\u00a5.\u0001\u0000\u0000\u0000\u0005\u0000Ejy\u0098"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}