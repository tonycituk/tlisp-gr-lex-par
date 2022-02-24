// Generated from ./arithLisp.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arithLispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FLOAT=8, INT=9, 
		DIGIT=10, NEWLINE=11;
	public static final int
		RULE_prog = 0, RULE_tlisp = 1, RULE_exprS = 2, RULE_list_f = 3, RULE_f = 4, 
		RULE_num = 5, RULE_neg = 6, RULE_pos = 7, RULE_empty = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "tlisp", "exprS", "list_f", "f", "num", "neg", "pos", "empty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FLOAT", "INT", "DIGIT", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "arithLisp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public arithLispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TlispContext> tlisp() {
			return getRuleContexts(TlispContext.class);
		}
		public TlispContext tlisp(int i) {
			return getRuleContext(TlispContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				tlisp();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << FLOAT) | (1L << INT))) != 0) );
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

	public static class TlispContext extends ParserRuleContext {
		public ExprSContext exprS() {
			return getRuleContext(ExprSContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(arithLispParser.NEWLINE, 0); }
		public TlispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tlisp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterTlisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitTlisp(this);
		}
	}

	public final TlispContext tlisp() throws RecognitionException {
		TlispContext _localctx = new TlispContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tlisp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			exprS();
			setState(24);
			match(NEWLINE);
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

	public static class ExprSContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public List_fContext list_f() {
			return getRuleContext(List_fContext.class,0);
		}
		public ExprSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterExprS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitExprS(this);
		}
	}

	public final ExprSContext exprS() throws RecognitionException {
		ExprSContext _localctx = new ExprSContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprS);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				num();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				list_f();
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

	public static class List_fContext extends ParserRuleContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public List<EmptyContext> empty() {
			return getRuleContexts(EmptyContext.class);
		}
		public EmptyContext empty(int i) {
			return getRuleContext(EmptyContext.class,i);
		}
		public List<ExprSContext> exprS() {
			return getRuleContexts(ExprSContext.class);
		}
		public ExprSContext exprS(int i) {
			return getRuleContext(ExprSContext.class,i);
		}
		public List_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterList_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitList_f(this);
		}
	}

	public final List_fContext list_f() throws RecognitionException {
		List_fContext _localctx = new List_fContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			f();
			setState(32);
			empty();
			setState(33);
			exprS();
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				empty();
				setState(35);
				exprS();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(41);
			match(T__1);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_num);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				neg();
				}
				break;
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				pos();
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

	public static class NegContext extends ParserRuleContext {
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitNeg(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_neg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
			setState(50);
			pos();
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

	public static class PosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(arithLispParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(arithLispParser.FLOAT, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitPos(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithLispListener ) ((arithLispListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\6\3\6\3\7\3\7\5\7\62\n\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\5\b\3\2\n\13"+
		"\2\65\2\25\3\2\2\2\4\31\3\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n-\3\2\2\2\f\61"+
		"\3\2\2\2\16\63\3\2\2\2\20\66\3\2\2\2\228\3\2\2\2\24\26\5\4\3\2\25\24\3"+
		"\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\5"+
		"\6\4\2\32\33\7\r\2\2\33\5\3\2\2\2\34\37\5\f\7\2\35\37\5\b\5\2\36\34\3"+
		"\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\7\3\2\2!\"\5\n\6\2\"#\5\22\n\2#\'"+
		"\5\6\4\2$%\5\22\n\2%&\5\6\4\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*+\3\2\2\2+,\7\4\2\2,\t\3\2\2\2-.\t\2\2\2.\13\3\2\2\2/\62"+
		"\5\16\b\2\60\62\5\20\t\2\61/\3\2\2\2\61\60\3\2\2\2\62\r\3\2\2\2\63\64"+
		"\7\6\2\2\64\65\5\20\t\2\65\17\3\2\2\2\66\67\t\3\2\2\67\21\3\2\2\289\7"+
		"\t\2\29\23\3\2\2\2\6\27\36)\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}