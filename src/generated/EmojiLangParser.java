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
		T__9=10, T__10=11, T__11=12, T__12=13, IF=14, FOR=15, READ=16, PRINT=17, 
		OPEN_BRACKET=18, CLOSE_BRACKET=19, DEC_KW=20, END_STAT=21, ID=22, REAL=23, 
		INT=24, ADD=25, SUB=26, MULT=27, DIV=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_globalStat = 1, RULE_function = 2, RULE_retType = 3, 
		RULE_functionExec = 4, RULE_fargsExec = 5, RULE_funBlock = 6, RULE_structDef = 7, 
		RULE_structBlock = 8, RULE_structValueTypes = 9, RULE_stat = 10, RULE_structDeclaration = 11, 
		RULE_assignValueToStructure = 12, RULE_structProp = 13, RULE_structPropValue = 14, 
		RULE_structName = 15, RULE_fname = 16, RULE_fargs = 17, RULE_fargsType = 18, 
		RULE_ret = 19, RULE_if = 20, RULE_blockif = 21, RULE_equal = 22, RULE_equalFactor = 23, 
		RULE_loop = 24, RULE_repetitions = 25, RULE_loopBlock = 26, RULE_globalDeclatarion = 27, 
		RULE_globalValue = 28, RULE_declaration = 29, RULE_assignment = 30, RULE_expression0 = 31, 
		RULE_expression1 = 32, RULE_expression2 = 33, RULE_valueFromStructProp = 34, 
		RULE_structProperty = 35, RULE_read = 36, RULE_print = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "globalStat", "function", "retType", "functionExec", "fargsExec", 
			"funBlock", "structDef", "structBlock", "structValueTypes", "stat", "structDeclaration", 
			"assignValueToStructure", "structProp", "structPropValue", "structName", 
			"fname", "fargs", "fargsType", "ret", "if", "blockif", "equal", "equalFactor", 
			"loop", "repetitions", "loopBlock", "globalDeclatarion", "globalValue", 
			"declaration", "assignment", "expression0", "expression1", "expression2", 
			"valueFromStructProp", "structProperty", "read", "print"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8514L) != 0)) {
				{
				{
				setState(76);
				globalStat();
				}
				}
				setState(81);
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
		public StructDefContext structDef() {
			return getRuleContext(StructDefContext.class,0);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(82);
					globalDeclatarion();
					}
					break;
				case T__5:
					{
					setState(83);
					functionExec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86);
				match(END_STAT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				function();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				structDef();
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
			setState(92);
			match(T__0);
			setState(93);
			retType();
			setState(94);
			fname();
			setState(95);
			match(T__1);
			setState(96);
			fargs();
			setState(97);
			match(T__2);
			setState(98);
			match(OPEN_BRACKET);
			setState(99);
			funBlock();
			setState(100);
			ret();
			setState(101);
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
			setState(103);
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
			setState(105);
			match(T__5);
			setState(106);
			fname();
			setState(107);
			match(T__1);
			setState(108);
			fargsExec();
			setState(109);
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
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(ID);
					setState(112);
					match(T__6);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5488960L) != 0)) {
				{
				{
				setState(121);
				stat();
				}
				}
				setState(126);
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
	public static class StructDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(EmojiLangParser.OPEN_BRACKET, 0); }
		public StructBlockContext structBlock() {
			return getRuleContext(StructBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EmojiLangParser.CLOSE_BRACKET, 0); }
		public StructDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructDef(this);
		}
	}

	public final StructDefContext structDef() throws RecognitionException {
		StructDefContext _localctx = new StructDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__7);
			setState(128);
			match(ID);
			setState(129);
			match(OPEN_BRACKET);
			setState(130);
			structBlock();
			setState(131);
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
	public static class StructBlockContext extends ParserRuleContext {
		public List<StructValueTypesContext> structValueTypes() {
			return getRuleContexts(StructValueTypesContext.class);
		}
		public StructValueTypesContext structValueTypes(int i) {
			return getRuleContext(StructValueTypesContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(EmojiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EmojiLangParser.ID, i);
		}
		public List<TerminalNode> END_STAT() { return getTokens(EmojiLangParser.END_STAT); }
		public TerminalNode END_STAT(int i) {
			return getToken(EmojiLangParser.END_STAT, i);
		}
		public StructBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructBlock(this);
		}
	}

	public final StructBlockContext structBlock() throws RecognitionException {
		StructBlockContext _localctx = new StructBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(133);
				structValueTypes();
				setState(134);
				match(ID);
				setState(135);
				match(END_STAT);
				}
				}
				setState(141);
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
	public static class StructValueTypesContext extends ParserRuleContext {
		public StructValueTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structValueTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructValueTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructValueTypes(this);
		}
	}

	public final StructValueTypesContext structValueTypes() throws RecognitionException {
		StructValueTypesContext _localctx = new StructValueTypesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_structValueTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public AssignValueToStructureContext assignValueToStructure() {
			return getRuleContext(AssignValueToStructureContext.class,0);
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
		enterRule(_localctx, 20, RULE_stat);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
			case READ:
			case PRINT:
			case DEC_KW:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(144);
					declaration();
					}
					break;
				case 2:
					{
					setState(145);
					assignment();
					}
					break;
				case 3:
					{
					setState(146);
					read();
					}
					break;
				case 4:
					{
					setState(147);
					print();
					}
					break;
				case 5:
					{
					setState(148);
					functionExec();
					}
					break;
				case 6:
					{
					setState(149);
					structDeclaration();
					}
					break;
				case 7:
					{
					setState(150);
					assignValueToStructure();
					}
					break;
				}
				setState(153);
				match(END_STAT);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			structName();
			setState(161);
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
	public static class AssignValueToStructureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructPropContext structProp() {
			return getRuleContext(StructPropContext.class,0);
		}
		public StructPropValueContext structPropValue() {
			return getRuleContext(StructPropValueContext.class,0);
		}
		public AssignValueToStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignValueToStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterAssignValueToStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitAssignValueToStructure(this);
		}
	}

	public final AssignValueToStructureContext assignValueToStructure() throws RecognitionException {
		AssignValueToStructureContext _localctx = new AssignValueToStructureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignValueToStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ID);
			setState(164);
			match(T__8);
			setState(165);
			structProp();
			setState(166);
			match(T__9);
			setState(167);
			structPropValue();
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
	public static class StructPropContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructProp(this);
		}
	}

	public final StructPropContext structProp() throws RecognitionException {
		StructPropContext _localctx = new StructPropContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
	public static class StructPropValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EmojiLangParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EmojiLangParser.REAL, 0); }
		public StructPropValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPropValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructPropValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructPropValue(this);
		}
	}

	public final StructPropValueContext structPropValue() throws RecognitionException {
		StructPropValueContext _localctx = new StructPropValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structPropValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
	public static class StructNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 32, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 34, RULE_fargs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					fargsType();
					setState(178);
					match(ID);
					setState(179);
					match(T__6);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(186);
				fargsType();
				setState(187);
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
		enterRule(_localctx, 36, RULE_fargsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 38, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__10);
			setState(194);
			match(ID);
			setState(195);
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
		enterRule(_localctx, 40, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			match(T__1);
			setState(199);
			equal();
			setState(200);
			match(T__2);
			setState(201);
			match(OPEN_BRACKET);
			setState(202);
			blockif();
			setState(203);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
		enterRule(_localctx, 42, RULE_blockif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5488960L) != 0)) {
				{
				{
				setState(205);
				stat();
				}
				}
				setState(210);
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
		enterRule(_localctx, 44, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			equalFactor();
			setState(212);
			match(T__11);
			setState(213);
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
		enterRule(_localctx, 46, RULE_equalFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(FOR);
			setState(218);
			match(T__1);
			setState(219);
			repetitions();
			setState(220);
			match(T__2);
			setState(221);
			match(OPEN_BRACKET);
			setState(222);
			loopBlock();
			setState(223);
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
		enterRule(_localctx, 50, RULE_repetitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
		enterRule(_localctx, 52, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5488960L) != 0)) {
				{
				{
				setState(227);
				stat();
				}
				}
				setState(232);
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
		enterRule(_localctx, 54, RULE_globalDeclatarion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__12);
			setState(234);
			match(ID);
			setState(235);
			match(T__9);
			setState(236);
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
		enterRule(_localctx, 56, RULE_globalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 58, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(DEC_KW);
			setState(241);
			match(ID);
			setState(242);
			match(T__9);
			setState(243);
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
		enterRule(_localctx, 60, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(T__9);
			setState(247);
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
		enterRule(_localctx, 62, RULE_expression0);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				expression1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				expression1();
				setState(251);
				match(ADD);
				setState(252);
				expression1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				expression1();
				setState(255);
				match(SUB);
				setState(256);
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
		enterRule(_localctx, 64, RULE_expression1);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				expression2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				expression2();
				setState(262);
				match(MULT);
				setState(263);
				expression2();
				}
				break;
			case 3:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				expression2();
				setState(266);
				match(DIV);
				setState(267);
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
	public static class ValueFromStructPropertyContext extends Expression2Context {
		public ValueFromStructPropContext valueFromStructProp() {
			return getRuleContext(ValueFromStructPropContext.class,0);
		}
		public ValueFromStructPropertyContext(Expression2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterValueFromStructProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitValueFromStructProperty(this);
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
		enterRule(_localctx, 66, RULE_expression2);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(INT);
				}
				break;
			case 2:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(REAL);
				}
				break;
			case 3:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ValueFromStructPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				valueFromStructProp();
				}
				break;
			case 5:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				match(T__1);
				setState(276);
				expression0();
				setState(277);
				match(T__2);
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
	public static class ValueFromStructPropContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructPropertyContext structProperty() {
			return getRuleContext(StructPropertyContext.class,0);
		}
		public ValueFromStructPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueFromStructProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterValueFromStructProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitValueFromStructProp(this);
		}
	}

	public final ValueFromStructPropContext valueFromStructProp() throws RecognitionException {
		ValueFromStructPropContext _localctx = new ValueFromStructPropContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valueFromStructProp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ID);
			setState(282);
			match(T__8);
			setState(283);
			structProperty();
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
	public static class StructPropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EmojiLangParser.ID, 0); }
		public StructPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).enterStructProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmojiLangListener ) ((EmojiLangListener)listener).exitStructProperty(this);
		}
	}

	public final StructPropertyContext structProperty() throws RecognitionException {
		StructPropertyContext _localctx = new StructPropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 72, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(READ);
			setState(288);
			match(T__1);
			setState(289);
			match(ID);
			setState(290);
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
		enterRule(_localctx, 74, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(PRINT);
			setState(293);
			match(T__1);
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
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
		"\u0004\u0001\u001d\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N"+
		"\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"U\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"[\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005r\b\u0005"+
		"\n\u0005\f\u0005u\t\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0006"+
		"\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009e\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00b6\b\u0011\n\u0011\f\u0011\u00b9\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00be\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005"+
		"\u0015\u00cf\b\u0015\n\u0015\f\u0015\u00d2\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a\u00e5\b\u001a\n\u001a"+
		"\f\u001a\u00e8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0103\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u010e"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0118"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0000\u0000"+
		"&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0004\u0001\u0000\u0004\u0005"+
		"\u0001\u0000\u0017\u0018\u0001\u0000\u0016\u0018\u0002\u0000\u0016\u0016"+
		"\u0018\u0018\u011f\u0000O\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000"+
		"\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000"+
		"\bi\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\f|\u0001\u0000"+
		"\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000"+
		"\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000"+
		"\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000"+
		"\u0000\u0000\u001a\u00a9\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000"+
		"\u0000\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000"+
		"\u0000\"\u00b7\u0001\u0000\u0000\u0000$\u00bf\u0001\u0000\u0000\u0000"+
		"&\u00c1\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000\u0000*\u00d0"+
		"\u0001\u0000\u0000\u0000,\u00d3\u0001\u0000\u0000\u0000.\u00d7\u0001\u0000"+
		"\u0000\u00000\u00d9\u0001\u0000\u0000\u00002\u00e1\u0001\u0000\u0000\u0000"+
		"4\u00e6\u0001\u0000\u0000\u00006\u00e9\u0001\u0000\u0000\u00008\u00ee"+
		"\u0001\u0000\u0000\u0000:\u00f0\u0001\u0000\u0000\u0000<\u00f5\u0001\u0000"+
		"\u0000\u0000>\u0102\u0001\u0000\u0000\u0000@\u010d\u0001\u0000\u0000\u0000"+
		"B\u0117\u0001\u0000\u0000\u0000D\u0119\u0001\u0000\u0000\u0000F\u011d"+
		"\u0001\u0000\u0000\u0000H\u011f\u0001\u0000\u0000\u0000J\u0124\u0001\u0000"+
		"\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\u0001\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RU\u00036\u001b"+
		"\u0000SU\u0003\b\u0004\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0015\u0000\u0000W[\u0001\u0000"+
		"\u0000\u0000X[\u0003\u0004\u0002\u0000Y[\u0003\u000e\u0007\u0000ZT\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\u0003\u0001\u0000\u0000\u0000\\]\u0005\u0001\u0000\u0000]^\u0003\u0006"+
		"\u0003\u0000^_\u0003 \u0010\u0000_`\u0005\u0002\u0000\u0000`a\u0003\""+
		"\u0011\u0000ab\u0005\u0003\u0000\u0000bc\u0005\u0012\u0000\u0000cd\u0003"+
		"\f\u0006\u0000de\u0003&\u0013\u0000ef\u0005\u0013\u0000\u0000f\u0005\u0001"+
		"\u0000\u0000\u0000gh\u0007\u0000\u0000\u0000h\u0007\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0006\u0000\u0000jk\u0003 \u0010\u0000kl\u0005\u0002\u0000"+
		"\u0000lm\u0003\n\u0005\u0000mn\u0005\u0003\u0000\u0000n\t\u0001\u0000"+
		"\u0000\u0000op\u0005\u0016\u0000\u0000pr\u0005\u0007\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vx\u0005\u0016\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u000b\u0001\u0000\u0000\u0000y{\u0003\u0014\n\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\b\u0000\u0000\u0080\u0081\u0005\u0016\u0000\u0000"+
		"\u0081\u0082\u0005\u0012\u0000\u0000\u0082\u0083\u0003\u0010\b\u0000\u0083"+
		"\u0084\u0005\u0013\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0003\u0012\t\u0000\u0086\u0087\u0005\u0016\u0000\u0000\u0087\u0088"+
		"\u0005\u0015\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0011"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0007\u0000\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0098"+
		"\u0003:\u001d\u0000\u0091\u0098\u0003<\u001e\u0000\u0092\u0098\u0003H"+
		"$\u0000\u0093\u0098\u0003J%\u0000\u0094\u0098\u0003\b\u0004\u0000\u0095"+
		"\u0098\u0003\u0016\u000b\u0000\u0096\u0098\u0003\u0018\f\u0000\u0097\u0090"+
		"\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0092"+
		"\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u0015\u0000\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0003(\u0014\u0000\u009c\u009e\u00030\u0018\u0000\u009d\u0097\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000"+
		"\u0000\u00a0\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a2\u0005\u0016\u0000"+
		"\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000"+
		"\u0000\u00a4\u00a5\u0005\t\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000"+
		"\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000\u00a8"+
		"\u0019\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0016\u0000\u0000\u00aa"+
		"\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0007\u0001\u0000\u0000\u00ac"+
		"\u001d\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae"+
		"\u001f\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0016\u0000\u0000\u00b0"+
		"!\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003$\u0012\u0000\u00b2\u00b3\u0005"+
		"\u0016\u0000\u0000\u00b3\u00b4\u0005\u0007\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bd\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0003$\u0012\u0000\u00bb\u00bc\u0005\u0016"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be#\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0007\u0000\u0000\u0000\u00c0%\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0015\u0000\u0000\u00c4\'\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005\u000e\u0000\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000\u00c7"+
		"\u00c8\u0003,\u0016\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0012\u0000\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb\u00cc\u0005"+
		"\u0013\u0000\u0000\u00cc)\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003\u0014"+
		"\n\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1+\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0003.\u0017\u0000\u00d4\u00d5\u0005\f\u0000\u0000\u00d5"+
		"\u00d6\u0003.\u0017\u0000\u00d6-\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007"+
		"\u0002\u0000\u0000\u00d8/\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000f"+
		"\u0000\u0000\u00da\u00db\u0005\u0002\u0000\u0000\u00db\u00dc\u00032\u0019"+
		"\u0000\u00dc\u00dd\u0005\u0003\u0000\u0000\u00dd\u00de\u0005\u0012\u0000"+
		"\u0000\u00de\u00df\u00034\u001a\u0000\u00df\u00e0\u0005\u0013\u0000\u0000"+
		"\u00e01\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0003\u0000\u0000\u00e2"+
		"3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003\u0014\n\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e75\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"\r\u0000\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000\u00eb\u00ec\u0005\n"+
		"\u0000\u0000\u00ec\u00ed\u00038\u001c\u0000\u00ed7\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0007\u0001\u0000\u0000\u00ef9\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0014\u0000\u0000\u00f1\u00f2\u0005\u0016\u0000\u0000\u00f2"+
		"\u00f3\u0005\n\u0000\u0000\u00f3\u00f4\u0003>\u001f\u0000\u00f4;\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0016\u0000\u0000\u00f6\u00f7\u0005"+
		"\n\u0000\u0000\u00f7\u00f8\u0003>\u001f\u0000\u00f8=\u0001\u0000\u0000"+
		"\u0000\u00f9\u0103\u0003@ \u0000\u00fa\u00fb\u0003@ \u0000\u00fb\u00fc"+
		"\u0005\u0019\u0000\u0000\u00fc\u00fd\u0003@ \u0000\u00fd\u0103\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0003@ \u0000\u00ff\u0100\u0005\u001a\u0000\u0000"+
		"\u0100\u0101\u0003@ \u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00f9"+
		"\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000\u0000\u0102\u00fe"+
		"\u0001\u0000\u0000\u0000\u0103?\u0001\u0000\u0000\u0000\u0104\u010e\u0003"+
		"B!\u0000\u0105\u0106\u0003B!\u0000\u0106\u0107\u0005\u001b\u0000\u0000"+
		"\u0107\u0108\u0003B!\u0000\u0108\u010e\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0003B!\u0000\u010a\u010b\u0005\u001c\u0000\u0000\u010b\u010c\u0003B"+
		"!\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0104\u0001\u0000\u0000"+
		"\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000"+
		"\u0000\u010eA\u0001\u0000\u0000\u0000\u010f\u0118\u0005\u0018\u0000\u0000"+
		"\u0110\u0118\u0005\u0017\u0000\u0000\u0111\u0118\u0005\u0016\u0000\u0000"+
		"\u0112\u0118\u0003D\"\u0000\u0113\u0114\u0005\u0002\u0000\u0000\u0114"+
		"\u0115\u0003>\u001f\u0000\u0115\u0116\u0005\u0003\u0000\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u010f\u0001\u0000\u0000\u0000\u0117\u0110"+
		"\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0117\u0112"+
		"\u0001\u0000\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0118C\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\u0016\u0000\u0000\u011a\u011b\u0005"+
		"\t\u0000\u0000\u011b\u011c\u0003F#\u0000\u011cE\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u0016\u0000\u0000\u011eG\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u0010\u0000\u0000\u0120\u0121\u0005\u0002\u0000\u0000\u0121"+
		"\u0122\u0005\u0016\u0000\u0000\u0122\u0123\u0005\u0003\u0000\u0000\u0123"+
		"I\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0011\u0000\u0000\u0125\u0126"+
		"\u0005\u0002\u0000\u0000\u0126\u0127\u0007\u0002\u0000\u0000\u0127\u0128"+
		"\u0005\u0003\u0000\u0000\u0128K\u0001\u0000\u0000\u0000\u0010OTZsw|\u008b"+
		"\u0097\u009d\u00b7\u00bd\u00d0\u00e6\u0102\u010d\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}