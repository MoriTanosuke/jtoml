// Generated from src/main/resources/Toml.g4 by ANTLR 4.0
package me.grison.jtoml.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INT=7, BOOLEAN=8, WORD=9, 
		STRING=10, DATE=11, NEWLINE=12;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "' '", "','", "'['", "'='", "'#'", "INT", "BOOLEAN", 
		"WORD", "STRING", "DATE", "NEWLINE"
	};
	public static final int
		RULE_toml = 0, RULE_toml_stat = 1, RULE_section = 2, RULE_comment = 3, 
		RULE_toml_assignment = 4, RULE_literal_expr = 5, RULE_array = 6;
	public static final String[] ruleNames = {
		"toml", "toml_stat", "section", "comment", "toml_assignment", "literal_expr", 
		"array"
	};

	@Override
	public String getGrammarFileName() { return "Toml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TomlContext extends ParserRuleContext {
		public List<Toml_statContext> toml_stat() {
			return getRuleContexts(Toml_statContext.class);
		}
		public Toml_statContext toml_stat(int i) {
			return getRuleContext(Toml_statContext.class,i);
		}
		public TomlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterToml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitToml(this);
		}
	}

	public final TomlContext toml() throws RecognitionException {
		TomlContext _localctx = new TomlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_toml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(14); match(2);
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(20); toml_stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 6) | (1L << WORD) | (1L << NEWLINE))) != 0) );
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

	public static class Toml_statContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(TomlParser.NEWLINE, 0); }
		public Toml_assignmentContext toml_assignment() {
			return getRuleContext(Toml_assignmentContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public Toml_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterToml_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitToml_stat(this);
		}
	}

	public final Toml_statContext toml_stat() throws RecognitionException {
		Toml_statContext _localctx = new Toml_statContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_toml_stat);
		int _la;
		try {
			setState(44);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); section();
				setState(26); match(NEWLINE);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); toml_assignment();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(29); match(2);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(35); comment();
					}
				}

				setState(38); match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); comment();
				setState(41); match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); match(NEWLINE);
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(4);
			setState(47); match(WORD);
			setState(48); match(1);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(TomlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TomlParser.NEWLINE, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(6);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << INT) | (1L << BOOLEAN) | (1L << WORD) | (1L << STRING) | (1L << DATE))) != 0)) {
				{
				{
				setState(51);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(56);
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

	public static class Toml_assignmentContext extends ParserRuleContext {
		public Toml_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml_assignment; }
	 
		public Toml_assignmentContext() { }
		public void copyFrom(Toml_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateContext extends Toml_assignmentContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public TerminalNode DATE() { return getToken(TomlParser.DATE, 0); }
		public DateContext(Toml_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDate(this);
		}
	}
	public static class StringContext extends Toml_assignmentContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public TerminalNode STRING() { return getToken(TomlParser.STRING, 0); }
		public StringContext(Toml_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitString(this);
		}
	}
	public static class IntegerContext extends Toml_assignmentContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public TerminalNode INT() { return getToken(TomlParser.INT, 0); }
		public IntegerContext(Toml_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInteger(this);
		}
	}
	public static class BooleanContext extends Toml_assignmentContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public TerminalNode BOOLEAN() { return getToken(TomlParser.BOOLEAN, 0); }
		public BooleanContext(Toml_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBoolean(this);
		}
	}
	public static class ListContext extends Toml_assignmentContext {
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ListContext(Toml_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitList(this);
		}
	}

	public final Toml_assignmentContext toml_assignment() throws RecognitionException {
		Toml_assignmentContext _localctx = new Toml_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toml_assignment);
		int _la;
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(WORD);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(58); match(2);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64); match(5);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(65); match(2);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71); match(INT);
				}
				break;

			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(WORD);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(73); match(2);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79); match(5);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(80); match(2);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86); match(BOOLEAN);
				}
				break;

			case 3:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87); match(WORD);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(88); match(2);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94); match(5);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(95); match(2);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101); match(DATE);
				}
				break;

			case 4:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102); match(WORD);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(103); match(2);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109); match(5);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(110); match(2);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116); match(STRING);
				}
				break;

			case 5:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117); match(WORD);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(118); match(2);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124); match(5);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(125); match(2);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131); array();
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

	public static class Literal_exprContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(TomlParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(TomlParser.INT, 0); }
		public TerminalNode DATE() { return getToken(TomlParser.DATE, 0); }
		public TerminalNode STRING() { return getToken(TomlParser.STRING, 0); }
		public Literal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterLiteral_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitLiteral_expr(this);
		}
	}

	public final Literal_exprContext literal_expr() throws RecognitionException {
		Literal_exprContext _localctx = new Literal_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << STRING) | (1L << DATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<Literal_exprContext> literal_expr() {
			return getRuleContexts(Literal_exprContext.class);
		}
		public Literal_exprContext literal_expr(int i) {
			return getRuleContext(Literal_exprContext.class,i);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(4);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(137); match(2);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			switch (_input.LA(1)) {
			case 4:
				{
				setState(143); array();
				}
				break;
			case INT:
			case BOOLEAN:
			case STRING:
			case DATE:
				{
				setState(144); literal_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); match(2);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(153); match(3);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(154); match(2);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(160); array();
					}
					break;
				case INT:
				case BOOLEAN:
				case STRING:
				case DATE:
					{
					setState(161); literal_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(169); match(2);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(1);
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
		"\2\3\16\u00b4\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\3\2\7\2\22\n\2\f\2\16\2\25\13\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3"+
		"\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\3\5\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6"+
		"\7\6>\n\6\f\6\16\6A\13\6\3\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\7"+
		"\6M\n\6\f\6\16\6P\13\6\3\6\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\6\7\6"+
		"\\\n\6\f\6\16\6_\13\6\3\6\3\6\7\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\6\7\6"+
		"k\n\6\f\6\16\6n\13\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\6\3\6\3\6\7\6z"+
		"\n\6\f\6\16\6}\13\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3\6\5\6"+
		"\u0087\n\6\3\7\3\7\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b\3\b\3\b\5"+
		"\b\u0094\n\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b\7\b\u009e\n"+
		"\b\f\b\16\b\u00a1\13\b\3\b\3\b\5\b\u00a5\n\b\7\b\u00a7\n\b\f\b\16\b\u00aa"+
		"\13\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\b\2\t\2\4\6\b\n"+
		"\f\16\2\4\3\16\16\4\t\n\f\r\u00c9\2\27\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2"+
		"\b\64\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3\2\2\2\16\u008a\3\2\2\2\20\22\7"+
		"\4\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3"+
		"\2\2\2\25\23\3\2\2\2\26\30\5\4\3\2\27\23\3\2\2\2\30\31\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7\16\2\2\35/\3\2"+
		"\2\2\36\"\5\n\6\2\37!\7\4\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2"+
		"\2\2#&\3\2\2\2$\"\3\2\2\2%\'\5\b\5\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2("+
		")\7\16\2\2)/\3\2\2\2*+\5\b\5\2+,\7\16\2\2,/\3\2\2\2-/\7\16\2\2.\33\3\2"+
		"\2\2.\36\3\2\2\2.*\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\7\6\2\2\61\62\7"+
		"\13\2\2\62\63\7\3\2\2\63\7\3\2\2\2\648\7\b\2\2\65\67\n\2\2\2\66\65\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;?\7\13\2\2"+
		"<>\7\4\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2"+
		"BF\7\7\2\2CE\7\4\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2"+
		"HF\3\2\2\2I\u0087\7\t\2\2JN\7\13\2\2KM\7\4\2\2LK\3\2\2\2MP\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QU\7\7\2\2RT\7\4\2\2SR\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\u0087\7\n\2\2Y]\7\13\2"+
		"\2Z\\\7\4\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2"+
		"\2\2`d\7\7\2\2ac\7\4\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2"+
		"\2\2fd\3\2\2\2g\u0087\7\r\2\2hl\7\13\2\2ik\7\4\2\2ji\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2os\7\7\2\2pr\7\4\2\2qp\3\2\2\2"+
		"ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v\u0087\7\f\2\2w{\7"+
		"\13\2\2xz\7\4\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{"+
		"\3\2\2\2~\u0082\7\7\2\2\177\u0081\7\4\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5\16\b\2\u0086;\3\2\2\2\u0086J\3\2\2\2\u0086"+
		"Y\3\2\2\2\u0086h\3\2\2\2\u0086w\3\2\2\2\u0087\13\3\2\2\2\u0088\u0089\t"+
		"\3\2\2\u0089\r\3\2\2\2\u008a\u008e\7\6\2\2\u008b\u008d\7\4\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0093\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\5\16\b\2\u0092\u0094\5"+
		"\f\7\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0098\3\2\2\2\u0095"+
		"\u0097\7\4\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u00a8\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009f\7\5\2\2\u009c\u009e\7\4\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\5\16\b\2\u00a3\u00a5\5\f\7\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7\4\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\17\3\2\2\2\32\23\31"+
		"\"&.8?FNU]dls{\u0082\u0086\u008e\u0093\u0098\u009f\u00a4\u00a8\u00ae";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}