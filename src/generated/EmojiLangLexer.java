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
		T__9=10, IF=11, FOR=12, READ=13, PRINT=14, OPEN_BRACKET=15, CLOSE_BRACKET=16, 
		DEC_KW=17, END_STAT=18, ID=19, REAL=20, INT=21, ADD=22, SUB=23, MULT=24, 
		DIV=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEC_KW", "END_STAT", "ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\uD83E\uDD19'", "'('", "')'", "'int'", "'real'", "'\\uD83E\uDDE8'", 
			"','", "'ret:'", "'=='", "'='", "'\\uD83E\uDD14'", "'\\uD83D\uDD01'", 
			"'\\uD83D\uDCD6'", "'\\uD83D\uDDA8\\uFE0F'", "'\\uD83D\uDC49'", "'\\uD83D\uDC48'", 
			"'\\uD83D\uDE00'", "';'", null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "IF", 
			"FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", "DEC_KW", "END_STAT", 
			"ID", "REAL", "INT", "ADD", "SUB", "MULT", "DIV", "WS"
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
		case 25:
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
		"\u0004\u0000\u001a\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"e\b\u0012\u000b\u0012\f\u0012f\u0001\u0013\u0004\u0013j\b\u0013\u000b"+
		"\u0013\f\u0013k\u0001\u0013\u0001\u0013\u0004\u0013p\b\u0013\u000b\u0013"+
		"\f\u0013q\u0001\u0014\u0004\u0014u\b\u0014\u000b\u0014\f\u0014v\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0004\u0019\u0082\b\u0019\u000b\u0019\f"+
		"\u0019\u0083\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t\n\r\r  \u008b\u0000\u0001"+
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
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0001"+
		"5\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u00059\u0001"+
		"\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000f"+
		"H\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013P\u0001"+
		"\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000"+
		"\u0000\u0019V\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001d"+
		"[\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!_\u0001\u0000"+
		"\u0000\u0000#a\u0001\u0000\u0000\u0000%d\u0001\u0000\u0000\u0000\'i\u0001"+
		"\u0000\u0000\u0000)t\u0001\u0000\u0000\u0000+x\u0001\u0000\u0000\u0000"+
		"-z\u0001\u0000\u0000\u0000/|\u0001\u0000\u0000\u00001~\u0001\u0000\u0000"+
		"\u00003\u0081\u0001\u0000\u0000\u000056\u0005\u8001\uf919\u0000\u0000"+
		"6\u0002\u0001\u0000\u0000\u000078\u0005(\u0000\u00008\u0004\u0001\u0000"+
		"\u0000\u00009:\u0005)\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005"+
		"i\u0000\u0000<=\u0005n\u0000\u0000=>\u0005t\u0000\u0000>\b\u0001\u0000"+
		"\u0000\u0000?@\u0005r\u0000\u0000@A\u0005e\u0000\u0000AB\u0005a\u0000"+
		"\u0000BC\u0005l\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005\u8001\uf9e8"+
		"\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005,\u0000\u0000G\u000e\u0001"+
		"\u0000\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005t"+
		"\u0000\u0000KL\u0005:\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0005"+
		"=\u0000\u0000NO\u0005=\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005"+
		"=\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005\u8001\uf914\u0000"+
		"\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005\u8001\uf501\u0000\u0000"+
		"U\u0018\u0001\u0000\u0000\u0000VW\u0005\u8001\uf4d6\u0000\u0000W\u001a"+
		"\u0001\u0000\u0000\u0000XY\u0005\u8001\uf5a8\u0000\u0000YZ\u0005\u8000"+
		"\ufe0f\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005\u8001\uf449"+
		"\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000]^\u0005\u8001\uf448\u0000"+
		"\u0000^ \u0001\u0000\u0000\u0000_`\u0005\u8001\uf600\u0000\u0000`\"\u0001"+
		"\u0000\u0000\u0000ab\u0005;\u0000\u0000b$\u0001\u0000\u0000\u0000ce\u0007"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g&\u0001\u0000\u0000"+
		"\u0000hj\u000209\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mo\u0005.\u0000\u0000np\u000209\u0000on\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r(\u0001\u0000\u0000\u0000su\u000209\u0000ts\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w*\u0001\u0000\u0000\u0000xy\u0005+\u0000\u0000y,\u0001\u0000\u0000"+
		"\u0000z{\u0005-\u0000\u0000{.\u0001\u0000\u0000\u0000|}\u0005*\u0000\u0000"+
		"}0\u0001\u0000\u0000\u0000~\u007f\u0005/\u0000\u0000\u007f2\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0007\u0001\u0000\u0000\u0081\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0006\u0019\u0000\u0000\u00864\u0001\u0000\u0000"+
		"\u0000\u0006\u0000fkqv\u0083\u0001\u0001\u0019\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}