// Generated from src/EmojiLang.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EmojiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, READ=4, PRINT=5, OPEN_BRACKET=6, CLOSE_BRACKET=7, 
		DEC_KW=8, END_STAT=9, ID=10, REAL=11, INT=12, ADD=13, SUB=14, MULT=15, 
		DIV=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEC_KW", "END_STAT", "ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'\\uD83D\uDCD6'", "'\\uD83D\uDDA8\\uFE0F'", 
			"'\\uD83D\uDC49'", "'\\uD83D\uDC48'", "'\\uD83D\uDE00'", "';'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEC_KW", "END_STAT", "ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", 
			"WS"
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


	public EmojiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EmojiLang.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011Z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t8\b\t\u000b"+
		"\t\f\t9\u0001\n\u0004\n=\b\n\u000b\n\f\n>\u0001\n\u0001\n\u0004\nC\b\n"+
		"\u000b\n\f\nD\u0001\u000b\u0004\u000bH\b\u000b\u000b\u000b\f\u000bI\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010U\b\u0010\u000b\u0010\f\u0010V\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0002"+
		"\u0002\u0000AZaz\u0003\u0000\t\n\r\r  ^\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001"+
		"\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000"+
		"\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000"+
		"\u000b.\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f2\u0001"+
		"\u0000\u0000\u0000\u00114\u0001\u0000\u0000\u0000\u00137\u0001\u0000\u0000"+
		"\u0000\u0015<\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019"+
		"K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001dO\u0001"+
		"\u0000\u0000\u0000\u001fQ\u0001\u0000\u0000\u0000!T\u0001\u0000\u0000"+
		"\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005(\u0000"+
		"\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0006\u0001"+
		"\u0000\u0000\u0000)*\u0005\u8001\uf4d6\u0000\u0000*\b\u0001\u0000\u0000"+
		"\u0000+,\u0005\u8001\uf5a8\u0000\u0000,-\u0005\u8000\ufe0f\u0000\u0000"+
		"-\n\u0001\u0000\u0000\u0000./\u0005\u8001\uf449\u0000\u0000/\f\u0001\u0000"+
		"\u0000\u000001\u0005\u8001\uf448\u0000\u00001\u000e\u0001\u0000\u0000"+
		"\u000023\u0005\u8001\uf600\u0000\u00003\u0010\u0001\u0000\u0000\u0000"+
		"45\u0005;\u0000\u00005\u0012\u0001\u0000\u0000\u000068\u0007\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\u0014\u0001\u0000\u0000\u0000"+
		";=\u000209\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>"+
		"<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@B\u0005.\u0000\u0000AC\u000209\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0016\u0001\u0000\u0000\u0000FH\u000209\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0005+\u0000\u0000L\u001a"+
		"\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000N\u001c\u0001\u0000\u0000"+
		"\u0000OP\u0005*\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QR\u0005/\u0000"+
		"\u0000R \u0001\u0000\u0000\u0000SU\u0007\u0001\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\u0010\u0000\u0000"+
		"Y\"\u0001\u0000\u0000\u0000\u0006\u00009>DIV\u0001\u0001\u0010\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}