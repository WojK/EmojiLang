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
		T__9=10, IF=11, FOR=12, READ=13, PRINT=14, OPEN_BRACKET=15, CLOSE_BRACKET=16, 
		DEC_KW=17, END_STAT=18, ID=19, REAL=20, INT=21, ADD=22, SUB=23, MULT=24, 
		DIV=25, WS=26;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_function = 2, RULE_retType = 3, RULE_functionExec = 4, 
		RULE_funBlock = 5, RULE_fname = 6, RULE_fargs = 7, RULE_fargsType = 8, 
		RULE_ret = 9, RULE_if = 10, RULE_blockif = 11, RULE_equal = 12, RULE_equalFactor = 13, 
		RULE_loop = 14, RULE_repetitions = 15, RULE_loopBlock = 16, RULE_declaration = 17, 
		RULE_assignment = 18, RULE_expression0 = 19, RULE_expression1 = 20, RULE_expression2 = 21, 
		RULE_read = 22, RULE_print = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "function", "retType", "functionExec", "funBlock", "fname", 
			"fargs", "fargsType", "ret", "if", "blockif", "equal", "equalFactor", 
			"loop", "repetitions", "loopBlock", "declaration", "assignment", "expression0", 
			"expression1", "expression2", "read", "print"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 686146L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case IF:
				case FOR:
				case READ:
				case PRINT:
				case DEC_KW:
				case ID:
					{
					setState(48);
					stat();
					}
					break;
				case T__0:
					{
					setState(49);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
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
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case READ:
			case PRINT:
			case DEC_KW:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEC_KW:
					{
					setState(55);
					declaration();
					}
					break;
				case ID:
					{
					setState(56);
					assignment();
					}
					break;
				case READ:
					{
					setState(57);
					read();
					}
					break;
				case PRINT:
					{
					setState(58);
					print();
					}
					break;
				case T__5:
					{
					setState(59);
					functionExec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62);
				match(END_STAT);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
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
			setState(68);
			match(T__0);
			setState(69);
			retType();
			setState(70);
			fname();
			setState(71);
			match(T__1);
			setState(72);
			fargs();
			setState(73);
			match(T__2);
			setState(74);
			match(OPEN_BRACKET);
			setState(75);
			funBlock();
			setState(76);
			ret();
			setState(77);
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
			setState(79);
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
		public FargsContext fargs() {
			return getRuleContext(FargsContext.class,0);
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
			setState(81);
			match(T__5);
			setState(82);
			fname();
			setState(83);
			match(T__1);
			setState(84);
			fargs();
			setState(85);
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
		enterRule(_localctx, 10, RULE_funBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 686144L) != 0)) {
				{
				{
				setState(87);
				stat();
				}
				}
				setState(92);
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
		enterRule(_localctx, 12, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 14, RULE_fargs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					fargsType();
					setState(96);
					match(ID);
					setState(97);
					match(T__6);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(104);
				fargsType();
				setState(105);
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
		enterRule(_localctx, 16, RULE_fargsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 18, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__7);
			setState(112);
			match(ID);
			setState(113);
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
		enterRule(_localctx, 20, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			match(T__1);
			setState(117);
			equal();
			setState(118);
			match(T__2);
			setState(119);
			match(OPEN_BRACKET);
			setState(120);
			blockif();
			setState(121);
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
		enterRule(_localctx, 22, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 24, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			equalFactor();
			setState(126);
			match(T__8);
			setState(127);
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
		enterRule(_localctx, 26, RULE_equalFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(FOR);
			setState(132);
			match(T__1);
			setState(133);
			repetitions();
			setState(134);
			match(T__2);
			setState(135);
			match(OPEN_BRACKET);
			setState(136);
			loopBlock();
			setState(137);
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
		enterRule(_localctx, 30, RULE_repetitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		enterRule(_localctx, 32, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 34, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(DEC_KW);
			setState(144);
			match(ID);
			setState(145);
			match(T__9);
			setState(146);
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
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(T__9);
			setState(150);
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
		enterRule(_localctx, 38, RULE_expression0);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expression1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				expression1();
				setState(154);
				match(ADD);
				setState(155);
				expression1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				expression1();
				setState(158);
				match(SUB);
				setState(159);
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
		enterRule(_localctx, 40, RULE_expression1);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				expression2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				expression2();
				setState(165);
				match(MULT);
				setState(166);
				expression2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				expression2();
				setState(169);
				match(DIV);
				setState(170);
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
		enterRule(_localctx, 42, RULE_expression2);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(REAL);
				}
				break;
			case ID:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(ID);
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__1);
				setState(178);
				expression0();
				setState(179);
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
		enterRule(_localctx, 44, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(READ);
			setState(184);
			match(T__1);
			setState(185);
			match(ID);
			setState(186);
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
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(PRINT);
			setState(189);
			match(T__1);
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
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
		"\u0004\u0001\u001a\u00c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001"+
		"\u0000\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007d\b\u0007\n\u0007\f\u0007g\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00a2\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ad"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00b6\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0003\u0001\u0000\u0004\u0005\u0001\u0000\u0013\u0015\u0002\u0000"+
		"\u0013\u0013\u0015\u0015\u00bb\u00004\u0001\u0000\u0000\u0000\u0002B\u0001"+
		"\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000"+
		"\u0000\bQ\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\f]\u0001"+
		"\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000"+
		"\u0000\u0012o\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016"+
		"{\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0081\u0001"+
		"\u0000\u0000\u0000\u001c\u0083\u0001\u0000\u0000\u0000\u001e\u008b\u0001"+
		"\u0000\u0000\u0000 \u008d\u0001\u0000\u0000\u0000\"\u008f\u0001\u0000"+
		"\u0000\u0000$\u0094\u0001\u0000\u0000\u0000&\u00a1\u0001\u0000\u0000\u0000"+
		"(\u00ac\u0001\u0000\u0000\u0000*\u00b5\u0001\u0000\u0000\u0000,\u00b7"+
		"\u0001\u0000\u0000\u0000.\u00bc\u0001\u0000\u0000\u000003\u0003\u0002"+
		"\u0001\u000013\u0003\u0004\u0002\u000020\u0001\u0000\u0000\u000021\u0001"+
		"\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0001\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u00007=\u0003\"\u0011\u00008=\u0003$\u0012\u00009=\u0003,\u0016"+
		"\u0000:=\u0003.\u0017\u0000;=\u0003\b\u0004\u0000<7\u0001\u0000\u0000"+
		"\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0012\u0000\u0000?C\u0001\u0000\u0000\u0000@C\u0003\u0014\n\u0000AC\u0003"+
		"\u001c\u000e\u0000B<\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0003\f\u0006\u0000GH\u0005\u0002"+
		"\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0005\u0003\u0000\u0000JK\u0005"+
		"\u000f\u0000\u0000KL\u0003\n\u0005\u0000LM\u0003\u0012\t\u0000MN\u0005"+
		"\u0010\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000"+
		"\u0000P\u0007\u0001\u0000\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0003"+
		"\f\u0006\u0000ST\u0005\u0002\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0005"+
		"\u0003\u0000\u0000V\t\u0001\u0000\u0000\u0000WY\u0003\u0002\u0001\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0013\u0000\u0000^\r\u0001\u0000\u0000\u0000"+
		"_`\u0003\u0010\b\u0000`a\u0005\u0013\u0000\u0000ab\u0005\u0007\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fk\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u0013"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u000f\u0001\u0000\u0000\u0000mn\u0007\u0000\u0000"+
		"\u0000n\u0011\u0001\u0000\u0000\u0000op\u0005\b\u0000\u0000pq\u0005\u0013"+
		"\u0000\u0000qr\u0005\u0012\u0000\u0000r\u0013\u0001\u0000\u0000\u0000"+
		"st\u0005\u000b\u0000\u0000tu\u0005\u0002\u0000\u0000uv\u0003\u0018\f\u0000"+
		"vw\u0005\u0003\u0000\u0000wx\u0005\u000f\u0000\u0000xy\u0003\u0016\u000b"+
		"\u0000yz\u0005\u0010\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0003"+
		"\u0002\u0001\u0000|\u0017\u0001\u0000\u0000\u0000}~\u0003\u001a\r\u0000"+
		"~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0003\u001a\r\u0000\u0080\u0019"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u001b"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0085\u0005"+
		"\u0002\u0000\u0000\u0085\u0086\u0003\u001e\u000f\u0000\u0086\u0087\u0005"+
		"\u0003\u0000\u0000\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u0089\u0003"+
		" \u0010\u0000\u0089\u008a\u0005\u0010\u0000\u0000\u008a\u001d\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c\u001f\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0003\u0002\u0001\u0000\u008e!\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091\u0005\u0013\u0000"+
		"\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093\u0003&\u0013\u0000"+
		"\u0093#\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0013\u0000\u0000\u0095"+
		"\u0096\u0005\n\u0000\u0000\u0096\u0097\u0003&\u0013\u0000\u0097%\u0001"+
		"\u0000\u0000\u0000\u0098\u00a2\u0003(\u0014\u0000\u0099\u009a\u0003(\u0014"+
		"\u0000\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u009c\u0003(\u0014\u0000"+
		"\u009c\u00a2\u0001\u0000\u0000\u0000\u009d\u009e\u0003(\u0014\u0000\u009e"+
		"\u009f\u0005\u0017\u0000\u0000\u009f\u00a0\u0003(\u0014\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u0099"+
		"\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\'\u0001"+
		"\u0000\u0000\u0000\u00a3\u00ad\u0003*\u0015\u0000\u00a4\u00a5\u0003*\u0015"+
		"\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0003*\u0015\u0000"+
		"\u00a7\u00ad\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003*\u0015\u0000\u00a9"+
		"\u00aa\u0005\u0019\u0000\u0000\u00aa\u00ab\u0003*\u0015\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a3\u0001\u0000\u0000\u0000\u00ac\u00a4"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ad)\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b6\u0005\u0015\u0000\u0000\u00af\u00b6\u0005"+
		"\u0014\u0000\u0000\u00b0\u00b6\u0005\u0013\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0002\u0000\u0000\u00b2\u00b3\u0003&\u0013\u0000\u00b3\u00b4\u0005\u0003"+
		"\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6+\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0013\u0000\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000"+
		"\u00bb-\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd"+
		"\u00be\u0005\u0002\u0000\u0000\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0003\u0000\u0000\u00c0/\u0001\u0000\u0000\u0000\n24<BZe"+
		"k\u00a1\u00ac\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}