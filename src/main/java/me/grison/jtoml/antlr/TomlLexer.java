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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INT=7, BOOLEAN=8, WORD=9, 
		STRING=10, DATE=11, NEWLINE=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "' '", "','", "'['", "'='", "'#'", "INT", "BOOLEAN", "WORD", "STRING", 
		"DATE", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", "BOOLEAN", "WORD", 
		"STRING", "DATE", "NEWLINE"
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
		"\2\4\16a\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\6\b)\n\b\r\b\16\b*\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\66\n\t\3\n\6\n9\n\n\r\n\16\n:\3\13\3\13\3\13\3\13\7\13A\n"+
		"\13\f\13\16\13D\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\5\r^\n\r\3\r\3\r\2"+
		"\16\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\3\2\22\3\62;\13%%()/\60\62;AAC\\^^aac|\3\62;\3\62;\3\62"+
		";\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;\3\62;e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2"+
		"\2\2\r%\3\2\2\2\17(\3\2\2\2\21\65\3\2\2\2\238\3\2\2\2\25<\3\2\2\2\27G"+
		"\3\2\2\2\31]\3\2\2\2\33\34\7_\2\2\34\4\3\2\2\2\35\36\7\"\2\2\36\6\3\2"+
		"\2\2\37 \7.\2\2 \b\3\2\2\2!\"\7]\2\2\"\n\3\2\2\2#$\7?\2\2$\f\3\2\2\2%"+
		"&\7%\2\2&\16\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+\20\3\2\2\2,-\7v\2\2-.\7t\2\2./\7w\2\2/\66\7g\2\2\60\61\7h\2\2\61\62"+
		"\7c\2\2\62\63\7n\2\2\63\64\7u\2\2\64\66\7g\2\2\65,\3\2\2\2\65\60\3\2\2"+
		"\2\66\22\3\2\2\2\679\t\3\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";\24\3\2\2\2<=\7$\2\2=B\5\23\n\2>?\7\"\2\2?A\5\23\n\2@>\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7$\2\2F\26\3\2\2\2GH\t"+
		"\4\2\2HI\t\5\2\2IJ\t\6\2\2JK\t\7\2\2KL\7/\2\2LM\t\b\2\2MN\t\t\2\2NO\7"+
		"/\2\2OP\t\n\2\2PQ\t\13\2\2QR\7V\2\2RS\t\f\2\2ST\t\r\2\2TU\7<\2\2UV\t\16"+
		"\2\2VW\t\17\2\2WX\7<\2\2XY\t\20\2\2YZ\t\21\2\2Z[\7\\\2\2[\30\3\2\2\2\\"+
		"^\7\17\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\f\2\2`\32\3\2\2\2\b\2*\65"+
		":B]";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}