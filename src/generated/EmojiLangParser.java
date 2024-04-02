// Generated from src/EmojiLang.g4 by ANTLR 4.13.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EmojiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IF=12, FOR=13, READ=14, PRINT=15, OPEN_BRACKET=16, 
		CLOSE_BRACKET=17, DEC_KW=18, END_STAT=19, ID=20, REAL=21, INT=22, ADD=23, 
		SUB=24, MULT=25, DIV=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_globalStat = 1, RULE_function = 2, RULE_retType = 3, 
		RULE_functionExec = 4, RULE_fargsExec = 5, RULE_funBlock = 6, RULE_stat = 7, 
		RULE_fname = 8, RULE_fargs = 9, RULE_fargsType = 10, RULE_ret = 11, RULE_if = 12, 
		RULE_blockif = 13, RULE_equal = 14, RULE_equalFactor = 15, RULE_loop = 16, 
		RULE_repetitions = 17, RULE_loopBlock = 18, RULE_globalDeclatarion = 19, 
		RULE_globalValue = 20, RULE_declaration = 21, RULE_assignment = 22, RULE_expression0 = 23, 
		RULE_expression1 = 24, RULE_expression2 = 25, RULE_read = 26, RULE_print = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "globalStat", "function", "retType", "functionExec", "fargsExec", 
			"funBlock", "stat", "fname", "fargs", "fargsType", "ret", "if", "blockif", 
			"equal", "equalFactor", "loop", "repetitions", "loopBlock", "globalDeclatarion", 
			"globalValue", "declaration", "assignment", "expression0", "expression1", 
			"expression2", "read", "print"
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

	@Override
	public String getGrammarFileName() { return "EmojiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmojiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<GlobalStatContext> globalStat() {
			return getRuleContexts(GlobalStatContext.class);
		}
		public GlobalStatContext globalStat(int i) {
			return getRuleContext(GlobalStatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090L) != 0)) {
				{
				{
				setState(56);
				globalStat();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class GlobalStatContext extends ParserRuleContext {
		public TerminalNode END_STAT() { return getToken(EmojiLangParser.END_STAT, 0); }
		public GlobalDeclatarionContext globalDeclatarion() {
			return getRuleContext(GlobalDeclatarionContext.class,0);
		}
		public FunctionExecContext functionExec() {
			return getRuleContext(FunctionExecContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public GlobalStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterGlobalStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitGlobalStat(this);
		}
	}

	public final GlobalStatContext globalStat() throws RecognitionException {
		GlobalStatContext _localctx = new GlobalStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globalStat);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(62);
					globalDeclatarion();
					}
					break;
				case T__5:
					{
					setState(63);
					functionExec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66);
				match(END_STAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				function();
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
	public static class FunctionContext extends ParserRuleContext {
		public RetTypeContext retType() {
			return getRuleContext(RetTypeContext.class,0);
		}
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FargsContext fargs() {
			return getRuleContext(FargsContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(EmojiLangParser.OPEN_BRACKET, 0); }
		public FunBlockContext funBlock() {
			return getRuleContext(FunBlockContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EmojiLangParser.CLOSE_BRACKET, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			retType();
			setState(73);
			fname();
			setState(74);
			match(T__1);
			setState(75);
			fargs();
			setState(76);
			match(T__2);
			setState(77);
			match(OPEN_BRACKET);
			setState(78);
			funBlock();
			setState(79);
			ret();
			setState(80);
			match(CLOSE_BRACKET);
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
	public static class RetTypeContext extends ParserRuleContext {
		public RetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterRetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitRetType(this);
		}
	}

	public final RetTypeContext retType() throws RecognitionException {
		RetTypeContext _localctx = new RetTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
	public static class FunctionExecContext extends ParserRuleContext {
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FargsExecContext fargsExec() {
			return getRuleContext(FargsExecContext.class,0);
		}
		public FunctionExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFunctionExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFunctionExec(this);
		}
	}

	public final FunctionExecContext functionExec() throws RecognitionException {
		FunctionExecContext _localctx = new FunctionExecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionExec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			fname();
			setState(86);
			match(T__1);
			setState(87);
			fargsExec();
			setState(88);
			match(T__2);
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
	public static class FargsExecContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EmojiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EmojiLangParser.ID, i);
		}
		public FargsExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fargsExec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFargsExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFargsExec(this);
		}
	}

	public final FargsExecContext fargsExec() throws RecognitionException {
		FargsExecContext _localctx = new FargsExecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fargsExec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(ID);
					setState(91);
					match(T__6);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(97);
				match(ID);
				}
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
	public static class FunBlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FunBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFunBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFunBlock(this);
		}
	}

	public final FunBlockContext funBlock() throws RecognitionException {
		FunBlockContext _localctx = new FunBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1372224L) != 0)) {
				{
				{
				setState(100);
				stat();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class StatContext extends ParserRuleContext {
		public TerminalNode END_STAT() { return getToken(EmojiLangParser.END_STAT, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionExecContext functionExec() {
			return getRuleContext(FunctionExecContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case READ:
			case PRINT:
			case DEC_KW:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEC_KW:
					{
					setState(106);
					declaration();
					}
					break;
				case ID:
					{
					setState(107);
					assignment();
					}
					break;
				case READ:
					{
					setState(108);
					read();
					}
					break;
				case PRINT:
					{
					setState(109);
					print();
					}
					break;
				case T__5:
					{
					setState(110);
					functionExec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113);
				match(END_STAT);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				loop();
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
	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFname(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
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
	public static class FargsContext extends ParserRuleContext {
		public List<FargsTypeContext> fargsType() {
			return getRuleContexts(FargsTypeContext.class);
		}
		public FargsTypeContext fargsType(int i) {
			return getRuleContext(FargsTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(EmojiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EmojiLangParser.ID, i);
		}
		public FargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFargs(this);
		}
	}

	public final FargsContext fargs() throws RecognitionException {
		FargsContext _localctx = new FargsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fargs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					fargsType();
					setState(122);
					match(ID);
					setState(123);
					match(T__6);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(130);
				fargsType();
				setState(131);
				match(ID);
				}
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
	public static class FargsTypeContext extends ParserRuleContext {
		public FargsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fargsType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterFargsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitFargsType(this);
		}
	}

	public final FargsTypeContext fargsType() throws RecognitionException {
		FargsTypeContext _localctx = new FargsTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fargsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
	public static class RetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public TerminalNode END_STAT() { return getToken(EmojiLangParser.END_STAT, 0); }
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitRet(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__7);
			setState(138);
			match(ID);
			setState(139);
			match(END_STAT);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EmojiLangParser.IF, 0); }
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(EmojiLangParser.OPEN_BRACKET, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EmojiLangParser.CLOSE_BRACKET, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IF);
			setState(142);
			match(T__1);
			setState(143);
			equal();
			setState(144);
			match(T__2);
			setState(145);
			match(OPEN_BRACKET);
			setState(146);
			blockif();
			setState(147);
			match(CLOSE_BRACKET);
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
	public static class BlockifContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitBlockif(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			stat();
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
	public static class EqualContext extends ParserRuleContext {
		public List<EqualFactorContext> equalFactor() {
			return getRuleContexts(EqualFactorContext.class);
		}
		public EqualFactorContext equalFactor(int i) {
			return getRuleContext(EqualFactorContext.class,i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			equalFactor();
			setState(152);
			match(T__8);
			setState(153);
			equalFactor();
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
	public static class EqualFactorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EmojiLangParser.REAL, 0); }
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public EqualFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterEqualFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitEqualFactor(this);
		}
	}

	public final EqualFactorContext equalFactor() throws RecognitionException {
		EqualFactorContext _localctx = new EqualFactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EmojiLangParser.FOR, 0); }
		public RepetitionsContext repetitions() {
			return getRuleContext(RepetitionsContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(EmojiLangParser.OPEN_BRACKET, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EmojiLangParser.CLOSE_BRACKET, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FOR);
			setState(158);
			match(T__1);
			setState(159);
			repetitions();
			setState(160);
			match(T__2);
			setState(161);
			match(OPEN_BRACKET);
			setState(162);
			loopBlock();
			setState(163);
			match(CLOSE_BRACKET);
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
	public static class RepetitionsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public RepetitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterRepetitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitRepetitions(this);
		}
	}

	public final RepetitionsContext repetitions() throws RecognitionException {
		RepetitionsContext _localctx = new RepetitionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repetitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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
	public static class LoopBlockContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitLoopBlock(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			stat();
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
	public static class GlobalDeclatarionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public GlobalValueContext globalValue() {
			return getRuleContext(GlobalValueContext.class,0);
		}
		public GlobalDeclatarionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclatarion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterGlobalDeclatarion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitGlobalDeclatarion(this);
		}
	}

	public final GlobalDeclatarionContext globalDeclatarion() throws RecognitionException {
		GlobalDeclatarionContext _localctx = new GlobalDeclatarionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_globalDeclatarion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__9);
			setState(170);
			match(ID);
			setState(171);
			match(T__10);
			setState(172);
			globalValue();
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
	public static class GlobalValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EmojiLangParser.REAL, 0); }
		public GlobalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterGlobalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitGlobalValue(this);
		}
	}

	public final GlobalValueContext globalValue() throws RecognitionException {
		GlobalValueContext _localctx = new GlobalValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_globalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INT) ) {
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DEC_KW() { return getToken(EmojiLangParser.DEC_KW, 0); }
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DEC_KW);
			setState(177);
			match(ID);
			setState(178);
			match(T__10);
			setState(179);
			expression0();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ID);
			setState(182);
			match(T__10);
			setState(183);
			expression0();
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
	public static class Expression0Context extends ParserRuleContext {
		public Expression0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression0; }
	 
		public Expression0Context() { }
		public void copyFrom(Expression0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single0Context extends Expression0Context {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Single0Context(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitSingle0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expression0Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(EmojiLangParser.ADD, 0); }
		public AddContext(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expression0Context {
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public TerminalNode SUB() { return getToken(EmojiLangParser.SUB, 0); }
		public SubContext(Expression0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitSub(this);
		}
	}

	public final Expression0Context expression0() throws RecognitionException {
		Expression0Context _localctx = new Expression0Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression0);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expression1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				expression1();
				setState(187);
				match(ADD);
				setState(188);
				expression1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				expression1();
				setState(191);
				match(SUB);
				setState(192);
				expression1();
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
	public static class Expression1Context extends ParserRuleContext {
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
	 
		public Expression1Context() { }
		public void copyFrom(Expression1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends Expression1Context {
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public TerminalNode DIV() { return getToken(EmojiLangParser.DIV, 0); }
		public DivContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expression1Context {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Single1Context(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expression1Context {
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(EmojiLangParser.MULT, 0); }
		public MultContext(Expression1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitMult(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression1);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expression2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				expression2();
				setState(198);
				match(MULT);
				setState(199);
				expression2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				expression2();
				setState(202);
				match(DIV);
				setState(203);
				expression2();
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
	public static class Expression2Context extends ParserRuleContext {
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	 
		public Expression2Context() { }
		public void copyFrom(Expression2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expression2Context {
		public Expression0Context expression0() {
			return getRuleContext(Expression0Context.class,0);
		}
		public ParContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends Expression2Context {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public VarContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends Expression2Context {
		public TerminalNode REAL() { return getToken(EmojiLangParser.REAL, 0); }
		public RealContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expression2Context {
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public IntContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitInt(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression2);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(REAL);
				}
				break;
			case ID:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(ID);
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(T__1);
				setState(211);
				expression0();
				setState(212);
				match(T__2);
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
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(EmojiLangParser.READ, 0); }
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(READ);
			setState(217);
			match(T__1);
			setState(218);
			match(ID);
			setState(219);
			match(T__2);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EmojiLangParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EmojiLangParser.REAL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PRINT);
			setState(222);
			match(T__1);
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			match(T__2);
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
		"\u0004\u0001\u001b\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005]\b\u0005\n\u0005\f\u0005`\t\u0005\u0001\u0005\u0003\u0005c\b\u0005"+
		"\u0001\u0006\u0005\u0006f\b\u0006\n\u0006\f\u0006i\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007p\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007v\b\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t~\b\t\n\t\f\t"+
		"\u0081\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u0086\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00c3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00ce\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u00d7\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"\u0000\u0004\u0001\u0000\u0004\u0005\u0001\u0000\u0014\u0016\u0002\u0000"+
		"\u0014\u0014\u0016\u0016\u0001\u0000\u0015\u0016\u00db\u0000;\u0001\u0000"+
		"\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000"+
		"\u0006R\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\n^\u0001\u0000"+
		"\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000"+
		"\u0010w\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014"+
		"\u0087\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018"+
		"\u008d\u0001\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c"+
		"\u0097\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000\u0000 \u009d"+
		"\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000\u0000$\u00a7\u0001"+
		"\u0000\u0000\u0000&\u00a9\u0001\u0000\u0000\u0000(\u00ae\u0001\u0000\u0000"+
		"\u0000*\u00b0\u0001\u0000\u0000\u0000,\u00b5\u0001\u0000\u0000\u0000."+
		"\u00c2\u0001\u0000\u0000\u00000\u00cd\u0001\u0000\u0000\u00002\u00d6\u0001"+
		"\u0000\u0000\u00004\u00d8\u0001\u0000\u0000\u00006\u00dd\u0001\u0000\u0000"+
		"\u00008:\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0001"+
		"\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0003&\u0013\u0000"+
		"?A\u0003\b\u0004\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0005\u0013\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DF\u0003\u0004\u0002\u0000E@\u0001\u0000\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000"+
		"HI\u0003\u0006\u0003\u0000IJ\u0003\u0010\b\u0000JK\u0005\u0002\u0000\u0000"+
		"KL\u0003\u0012\t\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0010\u0000\u0000"+
		"NO\u0003\f\u0006\u0000OP\u0003\u0016\u000b\u0000PQ\u0005\u0011\u0000\u0000"+
		"Q\u0005\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\u0007\u0001"+
		"\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0003\u0010\b\u0000VW\u0005"+
		"\u0002\u0000\u0000WX\u0003\n\u0005\u0000XY\u0005\u0003\u0000\u0000Y\t"+
		"\u0001\u0000\u0000\u0000Z[\u0005\u0014\u0000\u0000[]\u0005\u0007\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ac\u0005\u0014\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000df\u0003\u000e"+
		"\u0007\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jp\u0003*\u0015\u0000kp\u0003,\u0016\u0000l"+
		"p\u00034\u001a\u0000mp\u00036\u001b\u0000np\u0003\b\u0004\u0000oj\u0001"+
		"\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0013\u0000\u0000rv\u0001\u0000\u0000\u0000sv\u0003\u0018"+
		"\f\u0000tv\u0003 \u0010\u0000uo\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000ut\u0001\u0000\u0000\u0000v\u000f\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0014\u0000\u0000x\u0011\u0001\u0000\u0000\u0000yz\u0003\u0014"+
		"\n\u0000z{\u0005\u0014\u0000\u0000{|\u0005\u0007\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}y\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0085\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005\u0014\u0000\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0007\u0000\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\b\u0000\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008c\u0005"+
		"\u0013\u0000\u0000\u008c\u0017\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\f\u0000\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0090\u0003\u001c"+
		"\u000e\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0092\u0005\u0010"+
		"\u0000\u0000\u0092\u0093\u0003\u001a\r\u0000\u0093\u0094\u0005\u0011\u0000"+
		"\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u000e\u0007"+
		"\u0000\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u001e\u000f"+
		"\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009a\u0003\u001e\u000f\u0000"+
		"\u009a\u001d\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0001\u0000\u0000"+
		"\u009c\u001f\u0001\u0000\u0000\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e"+
		"\u009f\u0005\u0002\u0000\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u00a1"+
		"\u0005\u0003\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2\u00a3"+
		"\u0003$\u0012\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4!\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000\u0000\u00a6#\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8%\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000\u0000\u00ab"+
		"\u00ac\u0005\u000b\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\'"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0007\u0003\u0000\u0000\u00af)\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u0012\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0014\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3\u00b4\u0003"+
		".\u0017\u0000\u00b4+\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0014\u0000"+
		"\u0000\u00b6\u00b7\u0005\u000b\u0000\u0000\u00b7\u00b8\u0003.\u0017\u0000"+
		"\u00b8-\u0001\u0000\u0000\u0000\u00b9\u00c3\u00030\u0018\u0000\u00ba\u00bb"+
		"\u00030\u0018\u0000\u00bb\u00bc\u0005\u0017\u0000\u0000\u00bc\u00bd\u0003"+
		"0\u0018\u0000\u00bd\u00c3\u0001\u0000\u0000\u0000\u00be\u00bf\u00030\u0018"+
		"\u0000\u00bf\u00c0\u0005\u0018\u0000\u0000\u00c0\u00c1\u00030\u0018\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000\u0000\u0000"+
		"\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c3/\u0001\u0000\u0000\u0000\u00c4\u00ce\u00032\u0019\u0000\u00c5\u00c6"+
		"\u00032\u0019\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7\u00c8\u0003"+
		"2\u0019\u0000\u00c8\u00ce\u0001\u0000\u0000\u0000\u00c9\u00ca\u00032\u0019"+
		"\u0000\u00ca\u00cb\u0005\u001a\u0000\u0000\u00cb\u00cc\u00032\u0019\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000"+
		"\u00cd\u00c5\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000"+
		"\u00ce1\u0001\u0000\u0000\u0000\u00cf\u00d7\u0005\u0016\u0000\u0000\u00d0"+
		"\u00d7\u0005\u0015\u0000\u0000\u00d1\u00d7\u0005\u0014\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0002\u0000\u0000\u00d3\u00d4\u0003.\u0017\u0000\u00d4\u00d5"+
		"\u0005\u0003\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d73\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9\u00da\u0005"+
		"\u0002\u0000\u0000\u00da\u00db\u0005\u0014\u0000\u0000\u00db\u00dc\u0005"+
		"\u0003\u0000\u0000\u00dc5\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u000f"+
		"\u0000\u0000\u00de\u00df\u0005\u0002\u0000\u0000\u00df\u00e0\u0007\u0001"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e17\u0001\u0000\u0000"+
		"\u0000\r;@E^bgou\u007f\u0085\u00c2\u00cd\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}