// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\SamplePy.g4 by ANTLR 4.8
package samplepy_gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SamplePyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, ID=5, WS=6, COMMENT=7, LINE_ESCAPE=8, IGNORE_NEWLINE=9, 
		NEWLINE=10, LPAREN=11, RPAREN=12, LBRACK=13, RBRACK=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DIGIT", "INT", "ID", "WS", "COMMENT", "LINE_ESCAPE", 
			"IGNORE_NEWLINE", "NEWLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "','", null, null, null, null, null, null, null, 
			"'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "ID", "WS", "COMMENT", "LINE_ESCAPE", 
			"IGNORE_NEWLINE", "NEWLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK"
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



	int nesting = 0 ;


	public SamplePyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SamplePy.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting++;
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IGNORE_NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return nesting > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20i\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\6\6,\n\6\r\6\16\6-\5\6\60\n\6\3\7\3\7\7\7\64\n\7"+
		"\f\7\16\7\67\13\7\3\b\6\b:\n\b\r\b\16\b;\3\b\3\b\3\t\3\t\7\tB\n\t\f\t"+
		"\16\tE\13\t\3\t\3\t\3\n\3\n\5\nK\n\n\3\n\3\n\3\n\3\n\3\13\5\13R\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\5\fZ\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21"+
		"\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\3\2\7\3\2\62;\5\2C\\aac|\6\2"+
		"\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13/\3\2\2\2\r"+
		"\61\3\2\2\2\179\3\2\2\2\21?\3\2\2\2\23H\3\2\2\2\25Q\3\2\2\2\27Y\3\2\2"+
		"\2\31]\3\2\2\2\33`\3\2\2\2\35c\3\2\2\2\37f\3\2\2\2!\"\7?\2\2\"\4\3\2\2"+
		"\2#$\7-\2\2$\6\3\2\2\2%&\7.\2\2&\b\3\2\2\2\'(\t\2\2\2(\n\3\2\2\2)\60\7"+
		"\62\2\2*,\5\t\5\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2"+
		"/)\3\2\2\2/+\3\2\2\2\60\f\3\2\2\2\61\65\t\3\2\2\62\64\t\4\2\2\63\62\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\16\3\2\2\2\67\65\3"+
		"\2\2\28:\t\5\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b"+
		"\b\2\2>\20\3\2\2\2?C\7%\2\2@B\n\6\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD"+
		"\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\b\t\2\2G\22\3\2\2\2HJ\7^\2\2IK\7\17\2\2"+
		"JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\f\2\2MN\3\2\2\2NO\b\n\2\2O\24\3\2\2"+
		"\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\f\2\2TU\6\13\2\2UV\3\2"+
		"\2\2VW\b\13\2\2W\26\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2["+
		"\\\7\f\2\2\\\30\3\2\2\2]^\7*\2\2^_\b\r\3\2_\32\3\2\2\2`a\7+\2\2ab\b\16"+
		"\4\2b\34\3\2\2\2cd\7]\2\2de\b\17\5\2e\36\3\2\2\2fg\7_\2\2gh\b\20\6\2h"+
		" \3\2\2\2\13\2-/\65;CJQY\7\b\2\2\3\r\2\3\16\3\3\17\4\3\20\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}