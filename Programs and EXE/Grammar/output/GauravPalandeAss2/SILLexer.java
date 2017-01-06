// $ANTLR 3.5.1 C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g 2016-02-23 13:08:39
package GauravPalandeAss2;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class SILLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int HEX_DIGIT=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int NEWLINE=10;
	public static final int OCTAL_ESC=11;
	public static final int STRING=12;
	public static final int UNICODE_ESC=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public SILLexer() {} 
	public SILLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public SILLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:2:7: ( '(' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:3:7: ( ')' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:4:7: ( '*' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:5:7: ( '+' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:6:7: ( ',' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:7:7: ( '-' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:8:7: ( '/' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:9:7: ( '//' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:9:9: '//'
			{
			match("//"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:10:7: ( '=' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:11:7: ( 'END' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:11:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:12:7: ( 'INPUT ' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:12:9: 'INPUT '
			{
			match("INPUT "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:13:7: ( 'INTEGER ' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:13:9: 'INTEGER '
			{
			match("INTEGER "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:14:7: ( 'LET' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:14:9: 'LET'
			{
			match("LET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:15:7: ( 'PRINT' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:15:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:16:7: ( 'PRINTLN' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:16:9: 'PRINTLN'
			{
			match("PRINTLN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:90:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:90:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:90:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:93:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:93:7: ( '0' .. '9' )+
			{
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:93:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:97:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:97:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:97:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:97:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:97:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:98:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:98:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:98:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:101:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:101:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:109:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:109:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:109:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\\') ) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:109:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:109:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:112:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:112:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:112:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\\') ) {
				alt8=1;
			}
			else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:112:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:112:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:117:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:121:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt9=1;
					}
					break;
				case 'u':
					{
					alt9=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt9=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:121:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:122:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:123:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:128:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				int LA10_1 = input.LA(2);
				if ( ((LA10_1 >= '0' && LA10_1 <= '3')) ) {
					int LA10_2 = input.LA(3);
					if ( ((LA10_2 >= '0' && LA10_2 <= '7')) ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=1;
						}

						else {
							alt10=2;
						}

					}

					else {
						alt10=3;
					}

				}
				else if ( ((LA10_1 >= '4' && LA10_1 <= '7')) ) {
					int LA10_3 = input.LA(3);
					if ( ((LA10_3 >= '0' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						alt10=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:128:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:129:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:130:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:135:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:135:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:136:8: ( ( '\\r' )? '\\n' )
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:136:9: ( '\\r' )? '\\n'
			{
			// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:136:9: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:136:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | ID | INT | COMMENT | WS | STRING | CHAR | NEWLINE )
		int alt12=22;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt12=1;
			}
			break;
		case ')':
			{
			alt12=2;
			}
			break;
		case '*':
			{
			alt12=3;
			}
			break;
		case '+':
			{
			alt12=4;
			}
			break;
		case ',':
			{
			alt12=5;
			}
			break;
		case '-':
			{
			alt12=6;
			}
			break;
		case '/':
			{
			switch ( input.LA(2) ) {
			case '/':
				{
				int LA12_20 = input.LA(3);
				if ( ((LA12_20 >= '\u0000' && LA12_20 <= '\uFFFF')) ) {
					alt12=18;
				}

				else {
					alt12=8;
				}

				}
				break;
			case '*':
				{
				alt12=18;
				}
				break;
			default:
				alt12=7;
			}
			}
			break;
		case '=':
			{
			alt12=9;
			}
			break;
		case 'E':
			{
			int LA12_9 = input.LA(2);
			if ( (LA12_9=='N') ) {
				int LA12_23 = input.LA(3);
				if ( (LA12_23=='D') ) {
					int LA12_29 = input.LA(4);
					if ( ((LA12_29 >= '0' && LA12_29 <= '9')||(LA12_29 >= 'A' && LA12_29 <= 'Z')||LA12_29=='_'||(LA12_29 >= 'a' && LA12_29 <= 'z')) ) {
						alt12=16;
					}

					else {
						alt12=10;
					}

				}

				else {
					alt12=16;
				}

			}

			else {
				alt12=16;
			}

			}
			break;
		case 'I':
			{
			int LA12_10 = input.LA(2);
			if ( (LA12_10=='N') ) {
				switch ( input.LA(3) ) {
				case 'P':
					{
					int LA12_30 = input.LA(4);
					if ( (LA12_30=='U') ) {
						int LA12_35 = input.LA(5);
						if ( (LA12_35=='T') ) {
							int LA12_39 = input.LA(6);
							if ( (LA12_39==' ') ) {
								alt12=11;
							}

							else {
								alt12=16;
							}

						}

						else {
							alt12=16;
						}

					}

					else {
						alt12=16;
					}

					}
					break;
				case 'T':
					{
					int LA12_31 = input.LA(4);
					if ( (LA12_31=='E') ) {
						int LA12_36 = input.LA(5);
						if ( (LA12_36=='G') ) {
							int LA12_40 = input.LA(6);
							if ( (LA12_40=='E') ) {
								int LA12_43 = input.LA(7);
								if ( (LA12_43=='R') ) {
									int LA12_46 = input.LA(8);
									if ( (LA12_46==' ') ) {
										alt12=12;
									}

									else {
										alt12=16;
									}

								}

								else {
									alt12=16;
								}

							}

							else {
								alt12=16;
							}

						}

						else {
							alt12=16;
						}

					}

					else {
						alt12=16;
					}

					}
					break;
				default:
					alt12=16;
				}
			}

			else {
				alt12=16;
			}

			}
			break;
		case 'L':
			{
			int LA12_11 = input.LA(2);
			if ( (LA12_11=='E') ) {
				int LA12_25 = input.LA(3);
				if ( (LA12_25=='T') ) {
					int LA12_32 = input.LA(4);
					if ( ((LA12_32 >= '0' && LA12_32 <= '9')||(LA12_32 >= 'A' && LA12_32 <= 'Z')||LA12_32=='_'||(LA12_32 >= 'a' && LA12_32 <= 'z')) ) {
						alt12=16;
					}

					else {
						alt12=13;
					}

				}

				else {
					alt12=16;
				}

			}

			else {
				alt12=16;
			}

			}
			break;
		case 'P':
			{
			int LA12_12 = input.LA(2);
			if ( (LA12_12=='R') ) {
				int LA12_26 = input.LA(3);
				if ( (LA12_26=='I') ) {
					int LA12_33 = input.LA(4);
					if ( (LA12_33=='N') ) {
						int LA12_38 = input.LA(5);
						if ( (LA12_38=='T') ) {
							switch ( input.LA(6) ) {
							case 'L':
								{
								int LA12_44 = input.LA(7);
								if ( (LA12_44=='N') ) {
									int LA12_47 = input.LA(8);
									if ( ((LA12_47 >= '0' && LA12_47 <= '9')||(LA12_47 >= 'A' && LA12_47 <= 'Z')||LA12_47=='_'||(LA12_47 >= 'a' && LA12_47 <= 'z')) ) {
										alt12=16;
									}

									else {
										alt12=15;
									}

								}

								else {
									alt12=16;
								}

								}
								break;
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt12=16;
								}
								break;
							default:
								alt12=14;
							}
						}

						else {
							alt12=16;
						}

					}

					else {
						alt12=16;
					}

				}

				else {
					alt12=16;
				}

			}

			else {
				alt12=16;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt12=16;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt12=17;
			}
			break;
		case '\r':
			{
			int LA12_15 = input.LA(2);
			if ( (LA12_15=='\n') ) {
				alt12=22;
			}

			else {
				alt12=19;
			}

			}
			break;
		case '\"':
			{
			alt12=20;
			}
			break;
		case '\'':
			{
			alt12=21;
			}
			break;
		case '\n':
			{
			alt12=19;
			}
			break;
		case '\t':
		case ' ':
			{
			alt12=19;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 12, 0, input);
			throw nvae;
		}
		switch (alt12) {
			case 1 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:70: T__25
				{
				mT__25(); 

				}
				break;
			case 12 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:76: T__26
				{
				mT__26(); 

				}
				break;
			case 13 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:82: T__27
				{
				mT__27(); 

				}
				break;
			case 14 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:88: T__28
				{
				mT__28(); 

				}
				break;
			case 15 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:94: T__29
				{
				mT__29(); 

				}
				break;
			case 16 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:100: ID
				{
				mID(); 

				}
				break;
			case 17 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:103: INT
				{
				mINT(); 

				}
				break;
			case 18 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:107: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 19 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:115: WS
				{
				mWS(); 

				}
				break;
			case 20 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:118: STRING
				{
				mSTRING(); 

				}
				break;
			case 21 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:125: CHAR
				{
				mCHAR(); 

				}
				break;
			case 22 :
				// C:\\Users\\gaura\\Desktop\\Grammar\\SIL.g:1:130: NEWLINE
				{
				mNEWLINE(); 

				}
				break;

		}
	}



}
