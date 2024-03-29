// Generated from Chat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Chat extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SAYS=1, SHOUTS=2, WORD=3, WHITESPACE=4, NEWLINE=5, TEXT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "S", "Y", "H", "O", "U", "T", "LOWERCASE", "UPPERCASE", "SAYS", 
			"SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SAYS", "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "TEXT"
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


	public Chat(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bV\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\rC\n\r\r\r\16\rD\3"+
		"\16\3\16\3\17\5\17J\n\17\3\17\3\17\6\17N\n\17\r\17\16\17O\3\20\6\20S\n"+
		"\20\r\20\16\20T\2\2\21\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\3\27"+
		"\4\31\5\33\6\35\7\37\b\3\2\r\4\2CCcc\4\2UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4"+
		"\2WWww\4\2VVvv\3\2c|\3\2C\\\4\2\13\13\"\"\4\2++__\2S\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2"+
		"\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2"+
		"\2\21/\3\2\2\2\23\61\3\2\2\2\25\63\3\2\2\2\278\3\2\2\2\31B\3\2\2\2\33"+
		"F\3\2\2\2\35M\3\2\2\2\37R\3\2\2\2!\"\t\2\2\2\"\4\3\2\2\2#$\t\3\2\2$\6"+
		"\3\2\2\2%&\t\4\2\2&\b\3\2\2\2\'(\t\5\2\2(\n\3\2\2\2)*\t\6\2\2*\f\3\2\2"+
		"\2+,\t\7\2\2,\16\3\2\2\2-.\t\b\2\2.\20\3\2\2\2/\60\t\t\2\2\60\22\3\2\2"+
		"\2\61\62\t\n\2\2\62\24\3\2\2\2\63\64\5\5\3\2\64\65\5\3\2\2\65\66\5\7\4"+
		"\2\66\67\5\5\3\2\67\26\3\2\2\289\5\5\3\29:\5\t\5\2:;\5\13\6\2;<\5\r\7"+
		"\2<=\5\17\b\2=>\5\5\3\2>\30\3\2\2\2?C\5\21\t\2@C\5\23\n\2AC\7a\2\2B?\3"+
		"\2\2\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\32\3\2\2\2F"+
		"G\t\13\2\2G\34\3\2\2\2HJ\7\17\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KN\7\f"+
		"\2\2LN\7\17\2\2MI\3\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\36"+
		"\3\2\2\2QS\n\f\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U \3\2\2\2\t"+
		"\2BDIMOT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}