// Generated from src/main/resources/Toml.g4 by ANTLR 4.0
package me.grison.jtoml.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, INT=8, BOOLEAN=9, 
		WORD=10, DATE=11, NEWLINE=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "' '", "','", "'['", "'='", "'#'", "'\"'", "INT", "BOOLEAN", "WORD", 
		"DATE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "BOOLEAN", 
		"WORD", "DATE", "NEWLINE"
	};


	public TomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Toml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\16X\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t+\n\t\r\t\16\t,\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n8\n\n\3\13\6\13;\n\13\r\13\16\13<\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\5\rU\n\r\3\r\3\r\2\16\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\3\2\22\3\62;\13%%()/\60\62;AAC\\^^"+
		"aac|\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62"+
		";\3\62;\3\62;\3\62;[\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2"+
		"\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17\'\3\2\2\2\21*\3\2\2\2\23\67\3"+
		"\2\2\2\25:\3\2\2\2\27>\3\2\2\2\31T\3\2\2\2\33\34\7_\2\2\34\4\3\2\2\2\35"+
		"\36\7\"\2\2\36\6\3\2\2\2\37 \7.\2\2 \b\3\2\2\2!\"\7]\2\2\"\n\3\2\2\2#"+
		"$\7?\2\2$\f\3\2\2\2%&\7%\2\2&\16\3\2\2\2\'(\7$\2\2(\20\3\2\2\2)+\t\2\2"+
		"\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\22\3\2\2\2./\7v\2\2/\60\7"+
		"t\2\2\60\61\7w\2\2\618\7g\2\2\62\63\7h\2\2\63\64\7c\2\2\64\65\7n\2\2\65"+
		"\66\7u\2\2\668\7g\2\2\67.\3\2\2\2\67\62\3\2\2\28\24\3\2\2\29;\t\3\2\2"+
		":9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\26\3\2\2\2>?\t\4\2\2?@\t\5\2"+
		"\2@A\t\6\2\2AB\t\7\2\2BC\7/\2\2CD\t\b\2\2DE\t\t\2\2EF\7/\2\2FG\t\n\2\2"+
		"GH\t\13\2\2HI\7V\2\2IJ\t\f\2\2JK\t\r\2\2KL\7<\2\2LM\t\16\2\2MN\t\17\2"+
		"\2NO\7<\2\2OP\t\20\2\2PQ\t\21\2\2QR\7\\\2\2R\30\3\2\2\2SU\7\17\2\2TS\3"+
		"\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\f\2\2W\32\3\2\2\2\7\2,\67<T";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}