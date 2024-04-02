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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IF=12, FOR=13, READ=14, PRINT=15, OPEN_BRACKET=16, 
		CLOSE_BRACKET=17, DEC_KW=18, END_STAT=19, ID=20, REAL=21, INT=22, ADD=23, 
		SUB=24, MULT=25, DIV=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEC_KW", "END_STAT", "ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\uD83E\uDD19'", "'('", "')'", "'int'", "'real'", "'\\uD83E\uDDE8'", 
			"','", "'ret:'", "'=='", "'\\uD83C\uDF0D'", "'='", "'\\uD83E\uDD14'", 
			"'\\uD83D\uDD01'", "'\\uD83D\uDCD6'", "'\\uD83D\uDDA8\\uFE0F'", "'\\uD83D\uDC49'", 
			"'\\uD83D\uDC48'", "'\\uD83D\uDE00'", "';'", null, null, null, "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", "DEC_KW", 
			"END_STAT", "ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", "WS"
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
		case 26:
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
		"\u0004\u0000\u001b\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013i\b\u0013\u000b\u0013"+
		"\f\u0013j\u0001\u0014\u0004\u0014n\b\u0014\u000b\u0014\f\u0014o\u0001"+
		"\u0014\u0001\u0014\u0004\u0014t\b\u0014\u000b\u0014\f\u0014u\u0001\u0015"+
		"\u0004\u0015y\b\u0015\u000b\u0015\f\u0015z\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0004\u001a\u0086\b\u001a\u000b\u001a\f\u001a\u0087\u0001\u001a"+
		"\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000"+
		"\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u008f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000"+
		"\u0000\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t"+
		"A\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001\u0000"+
		"\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000\u0000"+
		"\u0013R\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017V"+
		"\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000"+
		"\u0000\u0000\u001d\\\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000"+
		"\u0000!a\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%e\u0001\u0000"+
		"\u0000\u0000\'h\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000\u0000+x\u0001"+
		"\u0000\u0000\u0000-|\u0001\u0000\u0000\u0000/~\u0001\u0000\u0000\u0000"+
		"1\u0080\u0001\u0000\u0000\u00003\u0082\u0001\u0000\u0000\u00005\u0085"+
		"\u0001\u0000\u0000\u000078\u0005\u8001\uf919\u0000\u00008\u0002\u0001"+
		"\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0004\u0001\u0000\u0000\u0000"+
		";<\u0005)\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000"+
		">?\u0005n\u0000\u0000?@\u0005t\u0000\u0000@\b\u0001\u0000\u0000\u0000"+
		"AB\u0005r\u0000\u0000BC\u0005e\u0000\u0000CD\u0005a\u0000\u0000DE\u0005"+
		"l\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005\u8001\uf9e8\u0000\u0000"+
		"G\f\u0001\u0000\u0000\u0000HI\u0005,\u0000\u0000I\u000e\u0001\u0000\u0000"+
		"\u0000JK\u0005r\u0000\u0000KL\u0005e\u0000\u0000LM\u0005t\u0000\u0000"+
		"MN\u0005:\u0000\u0000N\u0010\u0001\u0000\u0000\u0000OP\u0005=\u0000\u0000"+
		"PQ\u0005=\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005\u8001\uf30d"+
		"\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005=\u0000\u0000U\u0016"+
		"\u0001\u0000\u0000\u0000VW\u0005\u8001\uf914\u0000\u0000W\u0018\u0001"+
		"\u0000\u0000\u0000XY\u0005\u8001\uf501\u0000\u0000Y\u001a\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u8001\uf4d6\u0000\u0000[\u001c\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u8001\uf5a8\u0000\u0000]^\u0005\u8000\ufe0f\u0000\u0000"+
		"^\u001e\u0001\u0000\u0000\u0000_`\u0005\u8001\uf449\u0000\u0000` \u0001"+
		"\u0000\u0000\u0000ab\u0005\u8001\uf448\u0000\u0000b\"\u0001\u0000\u0000"+
		"\u0000cd\u0005\u8001\uf600\u0000\u0000d$\u0001\u0000\u0000\u0000ef\u0005"+
		";\u0000\u0000f&\u0001\u0000\u0000\u0000gi\u0007\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k(\u0001\u0000\u0000\u0000ln\u000209\u0000m"+
		"l\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005.\u0000"+
		"\u0000rt\u000209\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v*\u0001\u0000\u0000"+
		"\u0000wy\u000209\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{,\u0001\u0000\u0000"+
		"\u0000|}\u0005+\u0000\u0000}.\u0001\u0000\u0000\u0000~\u007f\u0005-\u0000"+
		"\u0000\u007f0\u0001\u0000\u0000\u0000\u0080\u0081\u0005*\u0000\u0000\u0081"+
		"2\u0001\u0000\u0000\u0000\u0082\u0083\u0005/\u0000\u0000\u00834\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0007\u0001\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0006\u001a\u0000\u0000\u008a6\u0001\u0000"+
		"\u0000\u0000\u0006\u0000jouz\u0087\u0001\u0001\u001a\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}