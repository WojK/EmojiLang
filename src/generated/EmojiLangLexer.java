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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, IF=20, FOR=21, READ=22, PRINT=23, OPEN_BRACKET=24, 
		CLOSE_BRACKET=25, DEC_KW=26, END_STAT=27, ID=28, REAL=29, INT=30, STRING=31, 
		ADD=32, SUB=33, MULT=34, DIV=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "IF", "FOR", "READ", "PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"DEC_KW", "END_STAT", "ID", "REAL", "INT", "STRING", "ADD", "SUB", "MULT", 
			"DIV", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\uD83E\uDD19'", "'('", "')'", "'int'", "'real'", "'\\uD83E\uDDE8'", 
			"','", "'\\uD83C\uDFD7\\uFE0F'", "'\\uD83E\uDD20'", "'='", "'{'", "'}'", 
			"'\\uD83D\uDD78\\uFE0F'", "'\\uD83E\uDEF1'", "'ret'", "'=='", "'\\uD83C\uDF0D'", 
			"'['", "']'", "'\\uD83E\uDD14'", "'\\uD83D\uDD01'", "'\\uD83D\uDCD6'", 
			"'\\uD83D\uDDA8\\uFE0F'", "'\\uD83D\uDC49'", "'\\uD83D\uDC48'", "'\\uD83D\uDE00'", 
			"';'", null, null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IF", "FOR", "READ", 
			"PRINT", "OPEN_BRACKET", "CLOSE_BRACKET", "DEC_KW", "END_STAT", "ID", 
			"REAL", "INT", "STRING", "ADD", "SUB", "MULT", "DIV", "WS"
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
		case 35:
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
		"\u0004\u0000$\u00b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b"+
		"\u008c\b\u001b\u000b\u001b\f\u001b\u008d\u0001\u001c\u0004\u001c\u0091"+
		"\b\u001c\u000b\u001c\f\u001c\u0092\u0001\u001c\u0001\u001c\u0004\u001c"+
		"\u0097\b\u001c\u000b\u001c\f\u001c\u0098\u0001\u001d\u0004\u001d\u009c"+
		"\b\u001d\u000b\u001d\f\u001d\u009d\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u00a2\b\u001e\n\u001e\f\u001e\u00a5\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#"+
		"\u0004#\u00b2\b#\u000b#\f#\u00b3\u0001#\u0001#\u0000\u0000$\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0002\u0000\"\"\\\\\u0003\u0000\t\n\r\r  \u00bc"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K"+
		"\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007O\u0001\u0000"+
		"\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000\u0000"+
		"\rZ\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011_\u0001"+
		"\u0000\u0000\u0000\u0013a\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000"+
		"\u0000\u0017e\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001b"+
		"j\u0001\u0000\u0000\u0000\u001dl\u0001\u0000\u0000\u0000\u001fp\u0001"+
		"\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000"+
		"%w\u0001\u0000\u0000\u0000\'y\u0001\u0000\u0000\u0000){\u0001\u0000\u0000"+
		"\u0000+}\u0001\u0000\u0000\u0000-\u007f\u0001\u0000\u0000\u0000/\u0082"+
		"\u0001\u0000\u0000\u00001\u0084\u0001\u0000\u0000\u00003\u0086\u0001\u0000"+
		"\u0000\u00005\u0088\u0001\u0000\u0000\u00007\u008b\u0001\u0000\u0000\u0000"+
		"9\u0090\u0001\u0000\u0000\u0000;\u009b\u0001\u0000\u0000\u0000=\u009f"+
		"\u0001\u0000\u0000\u0000?\u00a8\u0001\u0000\u0000\u0000A\u00aa\u0001\u0000"+
		"\u0000\u0000C\u00ac\u0001\u0000\u0000\u0000E\u00ae\u0001\u0000\u0000\u0000"+
		"G\u00b1\u0001\u0000\u0000\u0000IJ\u0005\u8001\uf919\u0000\u0000J\u0002"+
		"\u0001\u0000\u0000\u0000KL\u0005(\u0000\u0000L\u0004\u0001\u0000\u0000"+
		"\u0000MN\u0005)\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005i\u0000"+
		"\u0000PQ\u0005n\u0000\u0000QR\u0005t\u0000\u0000R\b\u0001\u0000\u0000"+
		"\u0000ST\u0005r\u0000\u0000TU\u0005e\u0000\u0000UV\u0005a\u0000\u0000"+
		"VW\u0005l\u0000\u0000W\n\u0001\u0000\u0000\u0000XY\u0005\u8001\uf9e8\u0000"+
		"\u0000Y\f\u0001\u0000\u0000\u0000Z[\u0005,\u0000\u0000[\u000e\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u8001\uf3d7\u0000\u0000]^\u0005\u8000\ufe0f\u0000"+
		"\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005\u8001\uf920\u0000\u0000"+
		"`\u0012\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000b\u0014\u0001\u0000"+
		"\u0000\u0000cd\u0005{\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005"+
		"}\u0000\u0000f\u0018\u0001\u0000\u0000\u0000gh\u0005\u8001\uf578\u0000"+
		"\u0000hi\u0005\u8000\ufe0f\u0000\u0000i\u001a\u0001\u0000\u0000\u0000"+
		"jk\u0005\u8001\ufaf1\u0000\u0000k\u001c\u0001\u0000\u0000\u0000lm\u0005"+
		"r\u0000\u0000mn\u0005e\u0000\u0000no\u0005t\u0000\u0000o\u001e\u0001\u0000"+
		"\u0000\u0000pq\u0005=\u0000\u0000qr\u0005=\u0000\u0000r \u0001\u0000\u0000"+
		"\u0000st\u0005\u8001\uf30d\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005"+
		"[\u0000\u0000v$\u0001\u0000\u0000\u0000wx\u0005]\u0000\u0000x&\u0001\u0000"+
		"\u0000\u0000yz\u0005\u8001\uf914\u0000\u0000z(\u0001\u0000\u0000\u0000"+
		"{|\u0005\u8001\uf501\u0000\u0000|*\u0001\u0000\u0000\u0000}~\u0005\u8001"+
		"\uf4d6\u0000\u0000~,\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u8001\uf5a8"+
		"\u0000\u0000\u0080\u0081\u0005\u8000\ufe0f\u0000\u0000\u0081.\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u8001\uf449\u0000\u0000\u00830\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u8001\uf448\u0000\u0000\u00852\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u8001\uf600\u0000\u0000\u00874\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005;\u0000\u0000\u00896\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0007\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e8\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u000209\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005"+
		".\u0000\u0000\u0095\u0097\u000209\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099:\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u000209\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e<\u0001\u0000\u0000\u0000\u009f\u00a3\u0005"+
		"\"\u0000\u0000\u00a0\u00a2\b\u0001\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\"\u0000"+
		"\u0000\u00a7>\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005+\u0000\u0000\u00a9"+
		"@\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00abB\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005*\u0000\u0000\u00adD\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005/\u0000\u0000\u00afF\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0007\u0002\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0006#\u0000\u0000\u00b6H\u0001\u0000\u0000\u0000\u0007\u0000\u008d"+
		"\u0092\u0098\u009d\u00a3\u00b3\u0001\u0001#\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}