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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, WS=7, INT=8, BOOLEAN=9, 
		WORD=10, DATE=11, NEWLINE=12;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'['", "'='", "'#'", "'\"'", "WS", "INT", "BOOLEAN", 
		"WORD", "DATE", "NEWLINE"
	};
	public static final int
		RULE_toml = 0, RULE_toml_stat = 1, RULE_section = 2, RULE_comment = 3, 
		RULE_toml_assignment = 4, RULE_value_expr = 5, RULE_literal_expr = 6, 
		RULE_array = 7;
	public static final String[] ruleNames = {
		"toml", "toml_stat", "section", "comment", "toml_assignment", "value_expr", 
		"literal_expr", "array"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16); toml_stat();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << WORD) | (1L << NEWLINE))) != 0) );
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
			setState(34);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); section();
				setState(22); match(NEWLINE);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); toml_assignment();
				setState(26);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(25); comment();
					}
				}

				setState(28); match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 3);
				{
				setState(30); comment();
				setState(31); match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(33); match(NEWLINE);
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
			setState(36); match(3);
			setState(37); match(WORD);
			setState(38); match(1);
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
			setState(40); match(5);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << WS) | (1L << INT) | (1L << BOOLEAN) | (1L << WORD) | (1L << DATE))) != 0)) {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(46);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(WORD);
			setState(48); match(4);
			setState(49); value_expr();
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); array();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); literal_expr();
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
		public List<TerminalNode> WORD() { return getTokens(TomlParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TomlParser.WORD, i);
		}
		public TerminalNode BOOLEAN() { return getToken(TomlParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(TomlParser.INT, 0); }
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
		int _la;
		try {
			setState(65);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); match(DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); match(6);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59); match(WORD);
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WORD );
				setState(64); match(6);
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
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			int _alt;
			setState(82);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); match(3);
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68); value_expr();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << INT) | (1L << BOOLEAN) | (1L << DATE))) != 0) );
				setState(73); match(1);
				}
				break;
			case 6:
			case INT:
			case BOOLEAN:
			case DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); literal_expr();
				setState(78); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(76); match(2);
						setState(77); literal_expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(80); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=1 && _alt!=-1 );
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

	public static final String _serializedATN =
		"\2\3\16W\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\3\2\6\2\24\n\2\r\2\16\2\25\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3%\n\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5-\n\5\f\5\16\5\60\13"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\5\78\n\7\3\b\3\b\3\b\3\b\3\b\6\b?\n\b\r\b\16"+
		"\b@\3\b\5\bD\n\b\3\t\3\t\6\tH\n\t\r\t\16\tI\3\t\3\t\3\t\3\t\3\t\6\tQ\n"+
		"\t\r\t\16\tR\5\tU\n\t\3\t\3R\n\2\4\6\b\n\f\16\20\2\3\3\16\16\\\2\23\3"+
		"\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b*\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2\2\16C"+
		"\3\2\2\2\20T\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3"+
		"\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30\5\6\4\2\30\31\7\16\2\2\31%\3\2"+
		"\2\2\32\34\5\n\6\2\33\35\5\b\5\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2"+
		"\2\2\36\37\7\16\2\2\37%\3\2\2\2 !\5\b\5\2!\"\7\16\2\2\"%\3\2\2\2#%\7\16"+
		"\2\2$\27\3\2\2\2$\32\3\2\2\2$ \3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\5\2\2"+
		"\'(\7\f\2\2()\7\3\2\2)\7\3\2\2\2*.\7\7\2\2+-\n\2\2\2,+\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2\2\2\60.\3\2\2\2\61\62\7\f\2\2\62\63\7"+
		"\6\2\2\63\64\5\f\7\2\64\13\3\2\2\2\658\5\20\t\2\668\5\16\b\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\28\r\3\2\2\29D\7\n\2\2:D\7\13\2\2;D\7\r\2\2<>\7\b\2\2"+
		"=?\7\f\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\7\b\2\2"+
		"C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2D\17\3\2\2\2EG\7\5\2\2FH\5\f\7"+
		"\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\3\2\2LU\3\2\2"+
		"\2MP\5\16\b\2NO\7\4\2\2OQ\5\16\b\2PN\3\2\2\2QR\3\2\2\2RS\3\2\2\2RP\3\2"+
		"\2\2SU\3\2\2\2TE\3\2\2\2TM\3\2\2\2U\21\3\2\2\2\f\25\34$.\67@CIRT";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}