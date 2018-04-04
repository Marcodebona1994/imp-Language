// Generated from /home/marco/IdeaProjects/imp/src/imp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class impParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		BOOL=32, ID=33, INT=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_st = 1, RULE_lvar = 2, RULE_exp = 3, RULE_aexp = 4, 
		RULE_aop = 5, RULE_bexp = 6, RULE_bop = 7, RULE_lexp = 8, RULE_mexp = 9;
	public static final String[] ruleNames = {
		"prog", "st", "lvar", "exp", "aexp", "aop", "bexp", "bop", "lexp", "mexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'skip'", "'input'", "'('", "')'", "'output'", "'while'", 
		"'do'", "'endw'", "'if'", "'then'", "'else'", "'fi'", "':='", "'.'", "'*'", 
		"'/'", "'+'", "'-'", "'!='", "'&&'", "'=='", "'||'", "'_'", "'push'", 
		"','", "'top'", "'pop'", "'cons'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "BOOL", "ID", "INT", "WS"
	};
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
	public String getGrammarFileName() { return "imp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public impParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				st();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				st();
				setState(22);
				match(T__0);
				setState(23);
				prog();
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

	public static class StContext extends ParserRuleContext {
		public LvarContext lvar() {
			return getRuleContext(LvarContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_st);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T__2);
				setState(29);
				match(T__3);
				setState(30);
				lvar();
				setState(31);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__5);
				setState(34);
				match(T__3);
				setState(35);
				lvar();
				setState(36);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__6);
				setState(39);
				bexp();
				setState(40);
				match(T__7);
				setState(41);
				prog();
				setState(42);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				match(T__9);
				setState(45);
				bexp();
				setState(46);
				match(T__10);
				setState(47);
				prog();
				setState(48);
				match(T__11);
				setState(49);
				prog();
				setState(50);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__13);
				setState(54);
				exp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				exp();
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

	public static class LvarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public LvarContext lvar() {
			return getRuleContext(LvarContext.class,0);
		}
		public LvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterLvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitLvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitLvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvarContext lvar() throws RecognitionException {
		LvarContext _localctx = new LvarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lvar);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(ID);
				setState(60);
				match(T__14);
				setState(61);
				lvar();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				aexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				bexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				lexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				mexp(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				mexp(0);
				setState(70);
				match(T__3);
				setState(71);
				match(ID);
				setState(72);
				match(T__4);
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

	public static class AexpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(impParser.INT, 0); }
		public AopContext aop() {
			return getRuleContext(AopContext.class,0);
		}
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterAexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitAexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitAexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aexp);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(INT);
				setState(78);
				aop();
				setState(79);
				aexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__3);
				setState(82);
				aexp();
				setState(83);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__3);
				setState(86);
				aexp();
				setState(87);
				match(T__4);
				setState(88);
				aop();
				setState(89);
				aexp();
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

	public static class AopContext extends ParserRuleContext {
		public AopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterAop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitAop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitAop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AopContext aop() throws RecognitionException {
		AopContext _localctx = new AopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
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

	public static class BexpContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(impParser.BOOL, 0); }
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterBexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitBexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		BexpContext _localctx = new BexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bexp);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(BOOL);
				setState(97);
				bop();
				setState(98);
				bexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__3);
				setState(101);
				bexp();
				setState(102);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__3);
				setState(105);
				bexp();
				setState(106);
				match(T__4);
				setState(107);
				bop();
				setState(108);
				bexp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(T__19);
				setState(111);
				bexp();
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

	public static class BopContext extends ParserRuleContext {
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitBop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitBop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class LexpContext extends ParserRuleContext {
		public LvarContext lvar() {
			return getRuleContext(LvarContext.class,0);
		}
		public List<LexpContext> lexp() {
			return getRuleContexts(LexpContext.class);
		}
		public LexpContext lexp(int i) {
			return getRuleContext(LexpContext.class,i);
		}
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitLexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitLexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		LexpContext _localctx = new LexpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lexp);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__23);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				lvar();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__24);
				setState(119);
				match(T__3);
				setState(120);
				lexp();
				setState(121);
				match(T__25);
				setState(122);
				lexp();
				setState(123);
				match(T__4);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(T__26);
				setState(126);
				match(T__3);
				setState(127);
				lexp();
				setState(128);
				match(T__4);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(T__27);
				setState(131);
				match(T__3);
				setState(132);
				lexp();
				setState(133);
				match(T__4);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(T__28);
				setState(136);
				match(T__3);
				setState(137);
				lexp();
				setState(138);
				match(T__25);
				setState(139);
				lexp();
				setState(140);
				match(T__4);
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

	public static class MexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(impParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).enterMexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof impListener ) ((impListener)listener).exitMexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof impVisitor ) return ((impVisitor<? extends T>)visitor).visitMexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			match(ID);
			setState(146);
			match(T__25);
			setState(147);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MexpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mexp);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(T__29);
					setState(151);
					match(ID);
					setState(152);
					match(T__25);
					setState(153);
					exp();
					setState(154);
					match(T__30);
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13\2\3\24\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\4\3\2\22\25\3\2\27\31\2\u00b3\2\33\3\2\2\2\4"+
		":\3\2\2\2\6@\3\2\2\2\bL\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16r\3\2\2\2\20t"+
		"\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26\34\5\4\3\2\27\30\5\4\3\2"+
		"\30\31\7\3\2\2\31\32\5\2\2\2\32\34\3\2\2\2\33\26\3\2\2\2\33\27\3\2\2\2"+
		"\34\3\3\2\2\2\35;\7\4\2\2\36\37\7\5\2\2\37 \7\6\2\2 !\5\6\4\2!\"\7\7\2"+
		"\2\";\3\2\2\2#$\7\b\2\2$%\7\6\2\2%&\5\6\4\2&\'\7\7\2\2\';\3\2\2\2()\7"+
		"\t\2\2)*\5\16\b\2*+\7\n\2\2+,\5\2\2\2,-\7\13\2\2-;\3\2\2\2./\7\f\2\2/"+
		"\60\5\16\b\2\60\61\7\r\2\2\61\62\5\2\2\2\62\63\7\16\2\2\63\64\5\2\2\2"+
		"\64\65\7\17\2\2\65;\3\2\2\2\66\67\7#\2\2\678\7\20\2\28;\5\b\5\29;\5\b"+
		"\5\2:\35\3\2\2\2:\36\3\2\2\2:#\3\2\2\2:(\3\2\2\2:.\3\2\2\2:\66\3\2\2\2"+
		":9\3\2\2\2;\5\3\2\2\2<A\7#\2\2=>\7#\2\2>?\7\21\2\2?A\5\6\4\2@<\3\2\2\2"+
		"@=\3\2\2\2A\7\3\2\2\2BM\7#\2\2CM\5\n\6\2DM\5\16\b\2EM\5\22\n\2FM\5\24"+
		"\13\2GH\5\24\13\2HI\7\6\2\2IJ\7#\2\2JK\7\7\2\2KM\3\2\2\2LB\3\2\2\2LC\3"+
		"\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2M\t\3\2\2\2N^\7$\2\2OP\7"+
		"$\2\2PQ\5\f\7\2QR\5\n\6\2R^\3\2\2\2ST\7\6\2\2TU\5\n\6\2UV\7\7\2\2V^\3"+
		"\2\2\2WX\7\6\2\2XY\5\n\6\2YZ\7\7\2\2Z[\5\f\7\2[\\\5\n\6\2\\^\3\2\2\2]"+
		"N\3\2\2\2]O\3\2\2\2]S\3\2\2\2]W\3\2\2\2^\13\3\2\2\2_`\t\2\2\2`\r\3\2\2"+
		"\2as\7\"\2\2bc\7\"\2\2cd\5\20\t\2de\5\16\b\2es\3\2\2\2fg\7\6\2\2gh\5\16"+
		"\b\2hi\7\7\2\2is\3\2\2\2jk\7\6\2\2kl\5\16\b\2lm\7\7\2\2mn\5\20\t\2no\5"+
		"\16\b\2os\3\2\2\2pq\7\26\2\2qs\5\16\b\2ra\3\2\2\2rb\3\2\2\2rf\3\2\2\2"+
		"rj\3\2\2\2rp\3\2\2\2s\17\3\2\2\2tu\t\3\2\2u\21\3\2\2\2v\u0091\7\32\2\2"+
		"w\u0091\5\6\4\2xy\7\33\2\2yz\7\6\2\2z{\5\22\n\2{|\7\34\2\2|}\5\22\n\2"+
		"}~\7\7\2\2~\u0091\3\2\2\2\177\u0080\7\35\2\2\u0080\u0081\7\6\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\u0083\7\7\2\2\u0083\u0091\3\2\2\2\u0084\u0085\7"+
		"\36\2\2\u0085\u0086\7\6\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\7\2\2\u0088"+
		"\u0091\3\2\2\2\u0089\u008a\7\37\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5"+
		"\22\n\2\u008c\u008d\7\34\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\7\2\2"+
		"\u008f\u0091\3\2\2\2\u0090v\3\2\2\2\u0090w\3\2\2\2\u0090x\3\2\2\2\u0090"+
		"\177\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0089\3\2\2\2\u0091\23\3\2\2\2"+
		"\u0092\u0093\b\13\1\2\u0093\u0094\7#\2\2\u0094\u0095\7\34\2\2\u0095\u0096"+
		"\5\b\5\2\u0096\u00a0\3\2\2\2\u0097\u0098\f\3\2\2\u0098\u0099\7 \2\2\u0099"+
		"\u009a\7#\2\2\u009a\u009b\7\34\2\2\u009b\u009c\5\b\5\2\u009c\u009d\7!"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\n\33:@L]r\u0090\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}