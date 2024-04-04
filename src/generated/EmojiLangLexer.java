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
		T__9=10, T__10=11, T__11=12, T__12=13, IF=14, FOR=15, READ=16, PRINT=17, 
		OPEN_BRACKET=18, CLOSE_BRACKET=19, DEC_KW=20, END_STAT=21, ID=22, REAL=23, 
		INT=24, ADD=25, SUB=26, MULT=27, DIV=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "DEC_KW", "END_STAT", "ID", "REAL", "INT", "ADD", "SUB", 
			"MULT", "DIV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\uD83E\uDD19'", "'('", "')'", "'int'", "'real'", "'\\uD83E\uDDE8'", 
			"','", "'\\uD83C\uDFD7\\uFE0F'", "'\\uD83E\uDEF1'", "'='", "'ret:'", 
			"'=='", "'\\uD83C\uDF0D'", "'\\uD83E\uDD14'", "'\\uD83D\uDD01'", "'\\uD83D\uDCD6'", 
			"'\\uD83D\uDDA8\\uFE0F'", "'\\uD83D\uDC49'", "'\\uD83D\uDC48'", "'\\uD83D\uDE00'", 
			"';'", null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
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
		case 28:
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
		"\u0004\u0000\u001d\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015r\b\u0015\u000b\u0015\f\u0015s\u0001\u0016\u0004\u0016w\b"+
		"\u0016\u000b\u0016\f\u0016x\u0001\u0016\u0001\u0016\u0004\u0016}\b\u0016"+
		"\u000b\u0016\f\u0016~\u0001\u0017\u0004\u0017\u0082\b\u0017\u000b\u0017"+
		"\f\u0017\u0083\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u008f\b\u001c"+
		"\u000b\u001c\f\u001c\u0090\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0002\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  \u0098\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0001;"+
		"\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000"+
		"\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tE\u0001\u0000\u0000\u0000"+
		"\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001"+
		"\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000"+
		"\u0000\u0015U\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019"+
		"]\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000\u001da\u0001"+
		"\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!e\u0001\u0000\u0000"+
		"\u0000#h\u0001\u0000\u0000\u0000%j\u0001\u0000\u0000\u0000\'l\u0001\u0000"+
		"\u0000\u0000)n\u0001\u0000\u0000\u0000+q\u0001\u0000\u0000\u0000-v\u0001"+
		"\u0000\u0000\u0000/\u0081\u0001\u0000\u0000\u00001\u0085\u0001\u0000\u0000"+
		"\u00003\u0087\u0001\u0000\u0000\u00005\u0089\u0001\u0000\u0000\u00007"+
		"\u008b\u0001\u0000\u0000\u00009\u008e\u0001\u0000\u0000\u0000;<\u0005"+
		"\u8001\uf919\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005(\u0000"+
		"\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000@\u0006\u0001"+
		"\u0000\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005t"+
		"\u0000\u0000D\b\u0001\u0000\u0000\u0000EF\u0005r\u0000\u0000FG\u0005e"+
		"\u0000\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000\u0000I\n\u0001\u0000"+
		"\u0000\u0000JK\u0005\u8001\uf9e8\u0000\u0000K\f\u0001\u0000\u0000\u0000"+
		"LM\u0005,\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005\u8001\uf3d7"+
		"\u0000\u0000OP\u0005\u8000\ufe0f\u0000\u0000P\u0010\u0001\u0000\u0000"+
		"\u0000QR\u0005\u8001\ufaf1\u0000\u0000R\u0012\u0001\u0000\u0000\u0000"+
		"ST\u0005=\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005r\u0000\u0000"+
		"VW\u0005e\u0000\u0000WX\u0005t\u0000\u0000XY\u0005:\u0000\u0000Y\u0016"+
		"\u0001\u0000\u0000\u0000Z[\u0005=\u0000\u0000[\\\u0005=\u0000\u0000\\"+
		"\u0018\u0001\u0000\u0000\u0000]^\u0005\u8001\uf30d\u0000\u0000^\u001a"+
		"\u0001\u0000\u0000\u0000_`\u0005\u8001\uf914\u0000\u0000`\u001c\u0001"+
		"\u0000\u0000\u0000ab\u0005\u8001\uf501\u0000\u0000b\u001e\u0001\u0000"+
		"\u0000\u0000cd\u0005\u8001\uf4d6\u0000\u0000d \u0001\u0000\u0000\u0000"+
		"ef\u0005\u8001\uf5a8\u0000\u0000fg\u0005\u8000\ufe0f\u0000\u0000g\"\u0001"+
		"\u0000\u0000\u0000hi\u0005\u8001\uf449\u0000\u0000i$\u0001\u0000\u0000"+
		"\u0000jk\u0005\u8001\uf448\u0000\u0000k&\u0001\u0000\u0000\u0000lm\u0005"+
		"\u8001\uf600\u0000\u0000m(\u0001\u0000\u0000\u0000no\u0005;\u0000\u0000"+
		"o*\u0001\u0000\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t,\u0001\u0000\u0000\u0000uw\u000209\u0000vu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0005.\u0000\u0000{}\u000209"+
		"\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f.\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u000209\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u00840\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"+\u0000\u0000\u00862\u0001\u0000\u0000\u0000\u0087\u0088\u0005-\u0000"+
		"\u0000\u00884\u0001\u0000\u0000\u0000\u0089\u008a\u0005*\u0000\u0000\u008a"+
		"6\u0001\u0000\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c8\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0007\u0001\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0006\u001c\u0000\u0000\u0093:\u0001\u0000"+
		"\u0000\u0000\u0006\u0000sx~\u0083\u0090\u0001\u0001\u001c\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}