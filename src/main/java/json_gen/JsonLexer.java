// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Json.g4 by ANTLR 4.8
package json_gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, STRING=11, NUMBER=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WS", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WS", "STRING", 
			"NUMBER"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13C\n\13\r\13"+
		"\16\13D\3\13\3\13\3\f\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\5\rV\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\5\20a\n\20"+
		"\3\20\3\20\3\20\3\20\5\20g\n\20\3\20\5\20j\n\20\3\20\3\20\3\20\3\20\5"+
		"\20p\n\20\3\20\5\20s\n\20\3\21\3\21\3\21\7\21x\n\21\f\21\16\21{\13\21"+
		"\5\21}\n\21\3\22\3\22\5\22\u0081\n\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37\16!\2#\2\3\2\n\5"+
		"\2\13\f\17\17\"\"\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\63;"+
		"\3\2\62;\4\2GGgg\4\2--//\2\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\37\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)"+
		"\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\66\3\2\2\2"+
		"\23<\3\2\2\2\25B\3\2\2\2\27H\3\2\2\2\31R\3\2\2\2\33W\3\2\2\2\35]\3\2\2"+
		"\2\37r\3\2\2\2!|\3\2\2\2#~\3\2\2\2%&\7}\2\2&\4\3\2\2\2\'(\7.\2\2(\6\3"+
		"\2\2\2)*\7\177\2\2*\b\3\2\2\2+,\7<\2\2,\n\3\2\2\2-.\7]\2\2.\f\3\2\2\2"+
		"/\60\7_\2\2\60\16\3\2\2\2\61\62\7v\2\2\62\63\7t\2\2\63\64\7w\2\2\64\65"+
		"\7g\2\2\65\20\3\2\2\2\66\67\7h\2\2\678\7c\2\289\7n\2\29:\7u\2\2:;\7g\2"+
		"\2;\22\3\2\2\2<=\7p\2\2=>\7w\2\2>?\7n\2\2?@\7n\2\2@\24\3\2\2\2AC\t\2\2"+
		"\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\b\13\2\2G\26\3"+
		"\2\2\2HM\7$\2\2IL\5\31\r\2JL\n\3\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7$\2\2Q\30\3\2\2\2RU\7^\2\2SV\t"+
		"\4\2\2TV\5\33\16\2US\3\2\2\2UT\3\2\2\2V\32\3\2\2\2WX\7w\2\2XY\5\35\17"+
		"\2YZ\5\35\17\2Z[\5\35\17\2[\\\5\35\17\2\\\34\3\2\2\2]^\t\5\2\2^\36\3\2"+
		"\2\2_a\7/\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5!\21\2cd\7\60\2\2df\5!"+
		"\21\2eg\5#\22\2fe\3\2\2\2fg\3\2\2\2gs\3\2\2\2hj\7/\2\2ih\3\2\2\2ij\3\2"+
		"\2\2jk\3\2\2\2kl\5!\21\2lm\5#\22\2ms\3\2\2\2np\7/\2\2on\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qs\5!\21\2r`\3\2\2\2ri\3\2\2\2ro\3\2\2\2s \3\2\2\2t}\7\62"+
		"\2\2uy\t\6\2\2vx\t\7\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2|t\3\2\2\2|u\3\2\2\2}\"\3\2\2\2~\u0080\t\b\2\2\177\u0081"+
		"\t\t\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\5!\21\2\u0083$\3\2\2\2\17\2DKMU`fiory|\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}