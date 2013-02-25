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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, INT=8, BOOLEAN=9, 
		WORD=10, DATE=11, NEWLINE=12;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "' '", "','", "'['", "'='", "'#'", "'\"'", "INT", 
		"BOOLEAN", "WORD", "DATE", "NEWLINE"
	};
	public static final int
		RULE_toml = 0, RULE_toml_stat = 1, RULE_section = 2, RULE_comment = 3, 
		RULE_toml_assignment = 4, RULE_value_expr = 5, RULE_literal_expr = 6, 
		RULE_string = 7, RULE_array = 8;
	public static final String[] ruleNames = {
		"toml", "toml_stat", "section", "comment", "toml_assignment", "value_expr", 
		"literal_expr", "string", "array"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(18); match(2);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(24); toml_stat();
				}
				}
				setState(27); 
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
			setState(48);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); section();
				setState(30); match(NEWLINE);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); toml_assignment();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(33); match(2);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(39); comment();
					}
				}

				setState(42); match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); comment();
				setState(45); match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(47); match(NEWLINE);
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
			setState(50); match(4);
			setState(51); match(WORD);
			setState(52); match(1);
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
			setState(54); match(6);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << INT) | (1L << BOOLEAN) | (1L << WORD) | (1L << DATE))) != 0)) {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(60);
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
		public TerminalNode WORD() { return getToken(TomlParser.WORD, 0); }
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Toml_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterToml_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitToml_assignment(this);
		}
	}

	public final Toml_assignmentContext toml_assignment() throws RecognitionException {
		Toml_assignmentContext _localctx = new Toml_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toml_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(WORD);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(62); match(2);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); match(5);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(69); match(2);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75); value_expr();
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

	public static class Value_exprContext extends ParserRuleContext {
		public Literal_exprContext literal_expr() {
			return getRuleContext(Literal_exprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Value_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterValue_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitValue_expr(this);
		}
	}

	public final Value_exprContext value_expr() throws RecognitionException {
		Value_exprContext _localctx = new Value_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value_expr);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case 4:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); array();
				}
				break;
			case 7:
			case INT:
			case BOOLEAN:
			case DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); literal_expr();
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

	public static class Literal_exprContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(TomlParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(TomlParser.INT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DATE() { return getToken(TomlParser.DATE, 0); }
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
		enterRule(_localctx, 12, RULE_literal_expr);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(DATE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); string();
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(TomlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TomlParser.WORD, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(7);
			setState(88); match(WORD);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(89); match(2);
				setState(90); match(WORD);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(7);
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
		public List<Value_exprContext> value_expr() {
			return getRuleContexts(Value_exprContext.class);
		}
		public Value_exprContext value_expr(int i) {
			return getRuleContext(Value_exprContext.class,i);
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
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(4);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(99); match(2);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105); value_expr();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(106); match(3);
					setState(108);
					_la = _input.LA(1);
					if (_la==2) {
						{
						setState(107); match(2);
						}
					}

					setState(110); value_expr();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(116); match(2);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(4);
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
				setState(131); literal_expr();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(132); match(3);
					setState(134);
					_la = _input.LA(1);
					if (_la==2) {
						{
						setState(133); match(2);
						}
					}

					setState(136); literal_expr();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==2) {
					{
					{
					setState(142); match(2);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148); match(1);
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

	public static final String _serializedATN =
		"\2\3\16\u009b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\2\6\2\34\n\2\r\2\16"+
		"\2\35\3\3\3\3\3\3\3\3\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\5\3+\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5;\n\5\f\5\16\5"+
		">\13\5\3\6\3\6\7\6B\n\6\f\6\16\6E\13\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6"+
		"\3\6\3\6\3\7\3\7\5\7R\n\7\3\b\3\b\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\7\t"+
		"^\n\t\f\t\16\ta\13\t\3\t\3\t\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\3\n\3"+
		"\n\5\no\n\n\3\n\7\nr\n\n\f\n\16\nu\13\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084\13\n\3\n\3\n\3\n\5\n\u0089"+
		"\n\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\n\7\n\u0092\n\n\f\n\16\n"+
		"\u0095\13\n\3\n\3\n\5\n\u0099\n\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\3\3"+
		"\16\16\u00a9\2\33\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\n?\3\2"+
		"\2\2\fQ\3\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22\u0098\3\2\2\2\24\26\7\4\2\2"+
		"\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2"+
		"\31\27\3\2\2\2\32\34\5\4\3\2\33\27\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2"+
		"\35\36\3\2\2\2\36\3\3\2\2\2\37 \5\6\4\2 !\7\16\2\2!\63\3\2\2\2\"&\5\n"+
		"\6\2#%\7\4\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3"+
		"\2\2\2)+\5\b\5\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\16\2\2-\63\3\2\2\2"+
		"./\5\b\5\2/\60\7\16\2\2\60\63\3\2\2\2\61\63\7\16\2\2\62\37\3\2\2\2\62"+
		"\"\3\2\2\2\62.\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\6\2\2\65\66"+
		"\7\f\2\2\66\67\7\3\2\2\67\7\3\2\2\28<\7\b\2\29;\n\2\2\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?C\7\f\2\2@B\7\4\2\2A@"+
		"\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\7\7\2\2G"+
		"I\7\4\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2"+
		"MN\5\f\7\2N\13\3\2\2\2OR\5\22\n\2PR\5\16\b\2QO\3\2\2\2QP\3\2\2\2R\r\3"+
		"\2\2\2SX\7\n\2\2TX\7\13\2\2UX\7\r\2\2VX\5\20\t\2WS\3\2\2\2WT\3\2\2\2W"+
		"U\3\2\2\2WV\3\2\2\2X\17\3\2\2\2YZ\7\t\2\2Z_\7\f\2\2[\\\7\4\2\2\\^\7\f"+
		"\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\t"+
		"\2\2c\21\3\2\2\2dh\7\6\2\2eg\7\4\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2ks\5\f\7\2ln\7\5\2\2mo\7\4\2\2nm\3\2\2\2no\3"+
		"\2\2\2op\3\2\2\2pr\5\f\7\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3"+
		"\2\2\2us\3\2\2\2vx\7\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3"+
		"\2\2\2{y\3\2\2\2|}\7\3\2\2}\u0099\3\2\2\2~\u0082\7\6\2\2\177\u0081\7\4"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008d\5\16\b\2"+
		"\u0086\u0088\7\5\2\2\u0087\u0089\7\4\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\5\16\b\2\u008b\u0086\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\4\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\3\2\2\u0097\u0099\3\2\2\2\u0098"+
		"d\3\2\2\2\u0098~\3\2\2\2\u0099\23\3\2\2\2\26\27\35&*\62<CJQW_hnsy\u0082"+
		"\u0088\u008d\u0093\u0098";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}