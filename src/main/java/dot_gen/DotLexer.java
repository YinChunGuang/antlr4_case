// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Dot.g4 by ANTLR 4.8
package dot_gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRICT=11, GRAPH=12, DIGRAPH=13, NODE=14, EDGE=15, SUBGRAPH=16, 
		ID=17, NUMBER=18, STRING=19, HTML_STRING=20, PREPROC=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "ID", 
			"LETTER", "NUMBER", "DIGIT", "STRING", "HTML_STRING", "TAG", "PREPROC", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'->'", "'--'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "STRICT", 
			"GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "ID", "NUMBER", "STRING", 
			"HTML_STRING", "PREPROC", "WS"
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


	public DotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00cb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22\3\23\3\23\3"+
		"\24\5\24\177\n\24\3\24\3\24\6\24\u0083\n\24\r\24\16\24\u0084\3\24\6\24"+
		"\u0088\n\24\r\24\16\24\u0089\3\24\3\24\7\24\u008e\n\24\f\24\16\24\u0091"+
		"\13\24\5\24\u0093\n\24\5\24\u0095\n\24\3\25\3\25\3\26\3\26\3\26\3\26\7"+
		"\26\u009d\n\26\f\26\16\26\u00a0\13\26\3\26\3\26\3\27\3\27\3\27\7\27\u00a7"+
		"\n\27\f\27\16\27\u00aa\13\27\3\27\3\27\3\30\3\30\7\30\u00b0\n\30\f\30"+
		"\16\30\u00b3\13\30\3\30\3\30\3\31\3\31\7\31\u00b9\n\31\f\31\16\31\u00bc"+
		"\13\31\3\31\5\31\u00bf\n\31\3\31\3\31\3\31\3\31\3\32\6\32\u00c6\n\32\r"+
		"\32\16\32\u00c7\3\32\3\32\5\u009e\u00b1\u00ba\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'"+
		"\24)\2+\25-\26/\2\61\27\63\30\3\2\25\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4"+
		"\2EEee\4\2IIii\4\2CCcc\4\2RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGg"+
		"g\4\2WWww\4\2DDdd\6\2C\\aac|\u0082\u0101\3\2\62;\4\2>>@@\5\2\13\f\17\17"+
		"\"\"\2\u00d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?"+
		"\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23F\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31"+
		"R\3\2\2\2\33X\3\2\2\2\35`\3\2\2\2\37e\3\2\2\2!j\3\2\2\2#s\3\2\2\2%{\3"+
		"\2\2\2\'~\3\2\2\2)\u0096\3\2\2\2+\u0098\3\2\2\2-\u00a3\3\2\2\2/\u00ad"+
		"\3\2\2\2\61\u00b6\3\2\2\2\63\u00c5\3\2\2\2\65\66\7}\2\2\66\4\3\2\2\2\67"+
		"8\7\177\2\28\6\3\2\2\29:\7=\2\2:\b\3\2\2\2;<\7?\2\2<\n\3\2\2\2=>\7]\2"+
		"\2>\f\3\2\2\2?@\7_\2\2@\16\3\2\2\2AB\7.\2\2B\20\3\2\2\2CD\7/\2\2DE\7@"+
		"\2\2E\22\3\2\2\2FG\7/\2\2GH\7/\2\2H\24\3\2\2\2IJ\7<\2\2J\26\3\2\2\2KL"+
		"\t\2\2\2LM\t\3\2\2MN\t\4\2\2NO\t\5\2\2OP\t\6\2\2PQ\t\3\2\2Q\30\3\2\2\2"+
		"RS\t\7\2\2ST\t\4\2\2TU\t\b\2\2UV\t\t\2\2VW\t\n\2\2W\32\3\2\2\2XY\t\13"+
		"\2\2YZ\t\5\2\2Z[\t\7\2\2[\\\t\4\2\2\\]\t\b\2\2]^\t\t\2\2^_\t\n\2\2_\34"+
		"\3\2\2\2`a\t\f\2\2ab\t\r\2\2bc\t\13\2\2cd\t\16\2\2d\36\3\2\2\2ef\t\16"+
		"\2\2fg\t\13\2\2gh\t\7\2\2hi\t\16\2\2i \3\2\2\2jk\t\2\2\2kl\t\17\2\2lm"+
		"\t\20\2\2mn\t\7\2\2no\t\4\2\2op\t\b\2\2pq\t\t\2\2qr\t\n\2\2r\"\3\2\2\2"+
		"sx\5%\23\2tw\5%\23\2uw\5)\25\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y$\3\2\2\2zx\3\2\2\2{|\t\21\2\2|&\3\2\2\2}\177\7/\2\2~}\3\2"+
		"\2\2~\177\3\2\2\2\177\u0094\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5"+
		")\25\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0095\3\2\2\2\u0086\u0088\5)\25\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0092\3\2\2\2\u008b\u008f\7\60\2\2\u008c\u008e\5)\25\2\u008d\u008c\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0080\3\2\2\2\u0094\u0087\3\2\2\2\u0095"+
		"(\3\2\2\2\u0096\u0097\t\22\2\2\u0097*\3\2\2\2\u0098\u009e\7$\2\2\u0099"+
		"\u009a\7^\2\2\u009a\u009d\7$\2\2\u009b\u009d\13\2\2\2\u009c\u0099\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7$"+
		"\2\2\u00a2,\3\2\2\2\u00a3\u00a8\7>\2\2\u00a4\u00a7\5/\30\2\u00a5\u00a7"+
		"\n\23\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac.\3\2\2\2\u00ad\u00b1\7>\2\2\u00ae\u00b0"+
		"\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\7@\2\2\u00b5\60\3\2\2\2\u00b6\u00ba\7%\2\2\u00b7\u00b9\13\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\17\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\f"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\31\2\2\u00c3\62\3\2\2\2\u00c4\u00c6"+
		"\t\24\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\32\2\2\u00ca\64"+
		"\3\2\2\2\23\2vx~\u0084\u0089\u008f\u0092\u0094\u009c\u009e\u00a6\u00a8"+
		"\u00b1\u00ba\u00be\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}