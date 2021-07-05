// Generated from Nginx.g4 by ANTLR 4.5.3

    package com.github.odiszapc.nginxparser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LuaBlockID_Regex=15, 
		Value=16, STR_EXT=17, Comment=18, REGEXP_PREFIXED=19, QUOTED_STRING=20, 
		SINGLE_QUOTED=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "LuaBlockID_Regex", "Lua_Block_Regex", 
		"Lua_Block_Suffix", "Value", "STR_EXT", "Comment", "REGEXP_PREFIXED", 
		"QUOTED_STRING", "RegexpPrefix", "StringCharacters", "NON_ASCII", "EscapeSequence", 
		"SINGLE_QUOTED", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'\\.'", "'^'", "'location'", 
		"'rewrite'", "'last'", "'break'", "'redirect'", "'permanent'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LuaBlockID_Regex", "Value", "STR_EXT", "Comment", "REGEXP_PREFIXED", 
		"QUOTED_STRING", "SINGLE_QUOTED", "WS"
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


	public NginxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00d0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\6\21\u0081\n\21\r\21\16\21\u0082\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0096\n\23\3\24"+
		"\3\24\6\24\u009a\n\24\r\24\16\24\u009b\3\25\3\25\7\25\u00a0\n\25\f\25"+
		"\16\25\u00a3\13\25\3\26\3\26\6\26\u00a7\n\26\r\26\16\26\u00a8\3\27\3\27"+
		"\5\27\u00ad\n\27\3\27\3\27\3\30\3\30\5\30\u00b3\n\30\3\31\3\31\6\31\u00b7"+
		"\n\31\r\31\16\31\u00b8\3\32\3\32\3\33\3\33\5\33\u00bf\n\33\3\34\3\34\7"+
		"\34\u00c3\n\34\f\34\16\34\u00c6\13\34\3\34\3\34\3\35\6\35\u00cb\n\35\r"+
		"\35\16\35\u00cc\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\22\'\23)\24+\25-\26/\2\61"+
		"\2\63\2\65\2\67\279\30\3\2\f\6\2\62;C\\aac|\13\2##%&((,<??Aac|~~\u0080"+
		"\u0080\4\2\f\f\17\17\13\2##%&((*<??Aac|~~\u0080\u0080\3\2\u0080\u0080"+
		"\3\2,,\4\2$$^^\n\2$$))^^ddhhppttvv\4\2))^^\5\2\13\f\17\17\"\"\u00d7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2"+
		"\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2"+
		"\21K\3\2\2\2\23M\3\2\2\2\25V\3\2\2\2\27^\3\2\2\2\31c\3\2\2\2\33i\3\2\2"+
		"\2\35r\3\2\2\2\37|\3\2\2\2!\u0080\3\2\2\2#\u0084\3\2\2\2%\u0095\3\2\2"+
		"\2\'\u0099\3\2\2\2)\u009d\3\2\2\2+\u00a4\3\2\2\2-\u00aa\3\2\2\2/\u00b0"+
		"\3\2\2\2\61\u00b6\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67\u00c0\3"+
		"\2\2\29\u00ca\3\2\2\2;<\7=\2\2<\4\3\2\2\2=>\7}\2\2>\6\3\2\2\2?@\7\177"+
		"\2\2@\b\3\2\2\2AB\7k\2\2BC\7h\2\2C\n\3\2\2\2DE\7*\2\2E\f\3\2\2\2FG\7+"+
		"\2\2G\16\3\2\2\2HI\7^\2\2IJ\7\60\2\2J\20\3\2\2\2KL\7`\2\2L\22\3\2\2\2"+
		"MN\7n\2\2NO\7q\2\2OP\7e\2\2PQ\7c\2\2QR\7v\2\2RS\7k\2\2ST\7q\2\2TU\7p\2"+
		"\2U\24\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7y\2\2YZ\7t\2\2Z[\7k\2\2[\\\7v\2\2"+
		"\\]\7g\2\2]\26\3\2\2\2^_\7n\2\2_`\7c\2\2`a\7u\2\2ab\7v\2\2b\30\3\2\2\2"+
		"cd\7d\2\2de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7m\2\2h\32\3\2\2\2ij\7t\2\2jk\7"+
		"g\2\2kl\7f\2\2lm\7k\2\2mn\7t\2\2no\7g\2\2op\7e\2\2pq\7v\2\2q\34\3\2\2"+
		"\2rs\7r\2\2st\7g\2\2tu\7t\2\2uv\7o\2\2vw\7c\2\2wx\7p\2\2xy\7g\2\2yz\7"+
		"p\2\2z{\7v\2\2{\36\3\2\2\2|}\5!\21\2}~\5#\22\2~ \3\2\2\2\177\u0081\t\2"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\"\3\2\2\2\u0084\u0085\7a\2\2\u0085\u0086\7d\2\2\u0086\u0087"+
		"\7{\2\2\u0087\u0088\7a\2\2\u0088\u0089\7n\2\2\u0089\u008a\7w\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7a\2\2\u008c\u008d\7d\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u008f\7q\2\2\u008f\u0090\7e\2\2\u0090\u0091\7m\2\2\u0091$\3\2\2"+
		"\2\u0092\u0096\5\'\24\2\u0093\u0096\5-\27\2\u0094\u0096\5\67\34\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096&\3\2\2\2"+
		"\u0097\u009a\t\3\2\2\u0098\u009a\5\63\32\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"(\3\2\2\2\u009d\u00a1\7%\2\2\u009e\u00a0\n\4\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2*\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\u00a6\5/\30\2\u00a5\u00a7\t\5\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		",\3\2\2\2\u00aa\u00ac\7$\2\2\u00ab\u00ad\5\61\31\2\u00ac\u00ab\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7$\2\2\u00af.\3\2"+
		"\2\2\u00b0\u00b2\t\6\2\2\u00b1\u00b3\t\7\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\60\3\2\2\2\u00b4\u00b7\n\b\2\2\u00b5\u00b7\5\65\33"+
		"\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\4\u0082\1\2"+
		"\u00bb\64\3\2\2\2\u00bc\u00be\7^\2\2\u00bd\u00bf\t\t\2\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\66\3\2\2\2\u00c0\u00c4\7)\2\2\u00c1\u00c3"+
		"\n\n\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7)"+
		"\2\2\u00c88\3\2\2\2\u00c9\u00cb\t\13\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\b\35\2\2\u00cf:\3\2\2\2\20\2\u0082\u0095\u0099\u009b\u00a1\u00a8"+
		"\u00ac\u00b2\u00b6\u00b8\u00be\u00c4\u00cc\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}