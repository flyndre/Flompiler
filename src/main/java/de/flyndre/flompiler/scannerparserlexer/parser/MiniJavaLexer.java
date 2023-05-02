// Generated from C:/code/Flompiler/src/main/java/de/flyndre/flompiler/scannerparserlexer\MiniJava.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, BOOLEAN=2, CHAR=3, STRING=4, INTEGER=5, PUBLIC=6, PRIVATE=7, 
		NAME=8, WAVEDBROPEN=9, WAVEDBRCLOSE=10, IntType=11, StringType=12, BooleanType=13, 
		CharType=14, VoidType=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "BOOLEAN", "CHAR", "STRING", "INTEGER", "PUBLIC", "PRIVATE", 
			"NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", "IntType", "StringType", "BooleanType", 
			"CharType", "VoidType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", null, null, null, null, "'public'", "'private'", null, 
			"'{'", "'}'", "'int'", "'String'", "'Boolean'", "'Char'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "BOOLEAN", "CHAR", "STRING", "INTEGER", "PUBLIC", "PRIVATE", 
			"NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", "IntType", "StringType", "BooleanType", 
			"CharType", "VoidType"
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
		"\u0004\u0000\u000fy\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u00037\b"+
		"\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007U\b\u0007\u000b\u0007\f\u0007"+
		"V\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004"+
		"\u0003\u000009AZaz\u0001\u000019\u0001\u000009\u0002\u0000AZaz|\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003.\u0001"+
		"\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t=\u0001\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rK\u0001"+
		"\u0000\u0000\u0000\u000fT\u0001\u0000\u0000\u0000\u0011X\u0001\u0000\u0000"+
		"\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015\\\u0001\u0000\u0000\u0000"+
		"\u0017`\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bo"+
		"\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f \u0005c"+
		"\u0000\u0000 !\u0005l\u0000\u0000!\"\u0005a\u0000\u0000\"#\u0005s\u0000"+
		"\u0000#$\u0005s\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005T\u0000"+
		"\u0000&\'\u0005r\u0000\u0000\'(\u0005u\u0000\u0000(/\u0005e\u0000\u0000"+
		")*\u0005F\u0000\u0000*+\u0005a\u0000\u0000+,\u0005l\u0000\u0000,-\u0005"+
		"s\u0000\u0000-/\u0005e\u0000\u0000.%\u0001\u0000\u0000\u0000.)\u0001\u0000"+
		"\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005\'\u0000\u000012\u0007"+
		"\u0000\u0000\u000023\u0005\'\u0000\u00003\u0006\u0001\u0000\u0000\u0000"+
		"48\u0005\"\u0000\u000057\u0003\u0005\u0002\u000065\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005\"\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=A\u0007\u0001\u0000\u0000>@\u0007\u0002"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\n\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0005p\u0000\u0000EF\u0005u\u0000\u0000F"+
		"G\u0005b\u0000\u0000GH\u0005l\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005"+
		"c\u0000\u0000J\f\u0001\u0000\u0000\u0000KL\u0005p\u0000\u0000LM\u0005"+
		"r\u0000\u0000MN\u0005i\u0000\u0000NO\u0005v\u0000\u0000OP\u0005a\u0000"+
		"\u0000PQ\u0005t\u0000\u0000QR\u0005e\u0000\u0000R\u000e\u0001\u0000\u0000"+
		"\u0000SU\u0007\u0003\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0010"+
		"\u0001\u0000\u0000\u0000XY\u0005{\u0000\u0000Y\u0012\u0001\u0000\u0000"+
		"\u0000Z[\u0005}\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\]\u0005i\u0000"+
		"\u0000]^\u0005n\u0000\u0000^_\u0005t\u0000\u0000_\u0016\u0001\u0000\u0000"+
		"\u0000`a\u0005S\u0000\u0000ab\u0005t\u0000\u0000bc\u0005r\u0000\u0000"+
		"cd\u0005i\u0000\u0000de\u0005n\u0000\u0000ef\u0005g\u0000\u0000f\u0018"+
		"\u0001\u0000\u0000\u0000gh\u0005B\u0000\u0000hi\u0005o\u0000\u0000ij\u0005"+
		"o\u0000\u0000jk\u0005l\u0000\u0000kl\u0005e\u0000\u0000lm\u0005a\u0000"+
		"\u0000mn\u0005n\u0000\u0000n\u001a\u0001\u0000\u0000\u0000op\u0005C\u0000"+
		"\u0000pq\u0005h\u0000\u0000qr\u0005a\u0000\u0000rs\u0005r\u0000\u0000"+
		"s\u001c\u0001\u0000\u0000\u0000tu\u0005v\u0000\u0000uv\u0005o\u0000\u0000"+
		"vw\u0005i\u0000\u0000wx\u0005d\u0000\u0000x\u001e\u0001\u0000\u0000\u0000"+
		"\u0005\u0000.8AV\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}