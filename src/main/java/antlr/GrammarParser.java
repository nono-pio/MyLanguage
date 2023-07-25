// Generated from C:/Users/nolan/IdeaProjects/untitled/src/main/java/org/example\GrammarParser.g4 by ANTLR 4.12.0
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, VAR=4, IF=5, ELSE=6, FOR=7, FOREACH=8, 
		WHILE=9, DO=10, BREAK=11, CONTINUE=12, SWITCH=13, CASE=14, DEFAULT=15, 
		THROW=16, CATCH=17, DEF=18, RETURN=19, ASSIGN=20, ADD_ASSIGN=21, SUB_ASSIGN=22, 
		MUL_ASSIGN=23, DIV_ASSIGN=24, AND_ASSIGN=25, OR_ASSIGN=26, XOR_ASSIGN=27, 
		MOD_ASSIGN=28, LSHIFT_ASSIGN=29, RSHIFT_ASSIGN=30, GT=31, LT=32, NOT=33, 
		EQUAL=34, LE=35, GE=36, NOTEQUAL=37, AND=38, OR=39, INC=40, DEC=41, ADD=42, 
		SUB=43, MUL=44, DIV=45, MOD=46, BIT_NOT=47, BIT_AND=48, BIT_OR=49, BIT_XOR=50, 
		BIT_SHIFTL=51, BIT_SHIFTR=52, OPEN=53, CLOSE=54, OPEN_BRACKET=55, CLOSE_BRACKET=56, 
		OPEN_SQUARE=57, CLOSE_SQUARE=58, COLON=59, SEMI=60, COMMA=61, DOT=62, 
		BOOLEAN=63, STRING=64, CHAR=65, FLOAT=66, INT=67, ID=68;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_line = 2, RULE_one_line = 3, RULE_primary = 4, 
		RULE_expr = 5, RULE_if = 6, RULE_switch = 7, RULE_case = 8, RULE_default = 9, 
		RULE_parameters = 10, RULE_definition = 11, RULE_call_parameters = 12, 
		RULE_call = 13, RULE_return = 14, RULE_var_ass = 15, RULE_assOp = 16, 
		RULE_var_assOp = 17, RULE_var_inc_dec = 18, RULE_while = 19, RULE_do = 20, 
		RULE_for = 21, RULE_foreach = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "line", "one_line", "primary", "expr", "if", "switch", 
			"case", "default", "parameters", "definition", "call_parameters", "call", 
			"return", "var_ass", "assOp", "var_assOp", "var_inc_dec", "while", "do", 
			"for", "foreach"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'var'", "'if'", "'else'", "'for'", "'foreach'", 
			"'while'", "'do'", "'break'", "'continue'", "'switch'", "'case'", "'default'", 
			"'throw'", "'catch'", "'def'", "'return'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>'", "'<'", 
			"'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'^'", "'<<'", 
			"'>>'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "VAR", "IF", "ELSE", "FOR", "FOREACH", 
			"WHILE", "DO", "BREAK", "CONTINUE", "SWITCH", "CASE", "DEFAULT", "THROW", 
			"CATCH", "DEF", "RETURN", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "GT", "LT", "NOT", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_SHIFTL", "BIT_SHIFTR", 
			"OPEN", "CLOSE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"COLON", "SEMI", "COMMA", "DOT", "BOOLEAN", "STRING", "CHAR", "FLOAT", 
			"INT", "ID"
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

	@Override
	public String getGrammarFileName() { return "GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223218096636155984L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				{
				setState(46);
				line();
				}
				}
				setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(OPEN_BRACKET);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223218096636155984L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				{
				setState(53);
				line();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public One_lineContext one_line() {
			return getRuleContext(One_lineContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GrammarParser.SEMI, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case RETURN:
			case NOT:
			case ADD:
			case SUB:
			case BIT_NOT:
			case BOOLEAN:
			case STRING:
			case CHAR:
			case FLOAT:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(61);
				one_line();
				setState(62);
				match(SEMI);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				if_();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				switch_();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				definition();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				while_();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				do_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				for_();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				foreach();
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

	@SuppressWarnings("CheckReturnValue")
	public static class One_lineContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Var_assContext var_ass() {
			return getRuleContext(Var_assContext.class,0);
		}
		public Var_inc_decContext var_inc_dec() {
			return getRuleContext(Var_inc_decContext.class,0);
		}
		public Var_assOpContext var_assOp() {
			return getRuleContext(Var_assOpContext.class,0);
		}
		public One_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOne_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOne_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOne_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_lineContext one_line() throws RecognitionException {
		One_lineContext _localctx = new One_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_one_line);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				return_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				var_ass();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				var_inc_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				var_assOp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIT_SHIFTL() { return getToken(GrammarParser.BIT_SHIFTL, 0); }
		public TerminalNode BIT_SHIFTR() { return getToken(GrammarParser.BIT_SHIFTR, 0); }
		public TerminalNode BIT_AND() { return getToken(GrammarParser.BIT_AND, 0); }
		public TerminalNode BIT_XOR() { return getToken(GrammarParser.BIT_XOR, 0); }
		public TerminalNode BIT_OR() { return getToken(GrammarParser.BIT_OR, 0); }
		public BitwiseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterBitwiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitBitwiseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitBitwiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode BIT_NOT() { return getToken(GrammarParser.BIT_NOT, 0); }
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public MultDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitMultDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitMultDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GrammarParser.NOTEQUAL, 0); }
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public CmpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCmpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCmpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCmpExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new CallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				call();
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 153940217823232L) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new BitwiseExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						((BitwiseExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8725724278030336L) != 0)) ) {
							((BitwiseExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(100);
						((AndExprContext)_localctx).op = match(AND);
						setState(101);
						expr(4);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(103);
						((OrExprContext)_localctx).op = match(OR);
						setState(104);
						expr(3);
						}
						break;
					case 6:
						{
						_localctx = new CmpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(106);
						((CmpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264140488704L) != 0)) ) {
							((CmpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IF);
			setState(114);
			match(OPEN);
			setState(115);
			expr(0);
			setState(116);
			match(CLOSE);
			setState(117);
			block();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(118);
				match(ELSE);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(119);
					if_();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(120);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(GrammarParser.SWITCH, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SWITCH);
			setState(126);
			match(OPEN);
			setState(127);
			expr(0);
			setState(128);
			match(CLOSE);
			setState(129);
			match(OPEN_BRACKET);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASE:
					{
					setState(130);
					case_();
					}
					break;
				case DEFAULT:
					{
					setState(131);
					default_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(CLOSE_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CASE);
			setState(140);
			match(OPEN);
			setState(141);
			expr(0);
			setState(142);
			match(CLOSE);
			setState(143);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(GrammarParser.DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DEFAULT);
			setState(146);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(OPEN);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(149);
				match(ID);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					match(ID);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(159);
			match(CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(GrammarParser.DEF, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(DEF);
			setState(162);
			match(ID);
			setState(163);
			parameters();
			setState(164);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_parametersContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Call_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCall_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCall_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCall_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parametersContext call_parameters() throws RecognitionException {
		Call_parametersContext _localctx = new Call_parametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_call_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OPEN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 67645752833L) != 0)) {
				{
				setState(167);
				expr(0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					match(COMMA);
					setState(169);
					expr(0);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177);
			match(CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Call_parametersContext call_parameters() {
			return getRuleContext(Call_parametersContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			call_parameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(RETURN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 67645752833L) != 0)) {
				{
				setState(183);
				expr(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVar_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVar_ass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVar_ass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assContext var_ass() throws RecognitionException {
		Var_assContext _localctx = new Var_assContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(VAR);
			setState(187);
			match(ID);
			setState(188);
			match(ASSIGN);
			setState(189);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssOpContext extends ParserRuleContext {
		public TerminalNode ADD_ASSIGN() { return getToken(GrammarParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GrammarParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GrammarParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GrammarParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GrammarParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GrammarParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GrammarParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(GrammarParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(GrammarParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GrammarParser.MOD_ASSIGN, 0); }
		public AssOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterAssOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitAssOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitAssOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssOpContext assOp() throws RecognitionException {
		AssOpContext _localctx = new AssOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2145386496L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_assOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public AssOpContext assOp() {
			return getRuleContext(AssOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVar_assOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVar_assOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVar_assOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assOpContext var_assOp() throws RecognitionException {
		Var_assOpContext _localctx = new Var_assOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_assOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			assOp();
			setState(195);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_inc_decContext extends ParserRuleContext {
		public Token inc_dec;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode INC() { return getToken(GrammarParser.INC, 0); }
		public TerminalNode DEC() { return getToken(GrammarParser.DEC, 0); }
		public Var_inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterVar_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitVar_inc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitVar_inc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_inc_decContext var_inc_dec() throws RecognitionException {
		Var_inc_decContext _localctx = new Var_inc_decContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			((Var_inc_decContext)_localctx).inc_dec = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
				((Var_inc_decContext)_localctx).inc_dec = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(WHILE);
			setState(201);
			match(OPEN);
			setState(202);
			expr(0);
			setState(203);
			match(CLOSE);
			setState(204);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(DO);
			setState(207);
			block();
			setState(208);
			match(WHILE);
			setState(209);
			match(OPEN);
			setState(210);
			expr(0);
			setState(211);
			match(CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public Var_assContext var_ass() {
			return getRuleContext(Var_assContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_assOpContext var_assOp() {
			return getRuleContext(Var_assOpContext.class,0);
		}
		public Var_inc_decContext var_inc_dec() {
			return getRuleContext(Var_inc_decContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FOR);
			setState(214);
			match(OPEN);
			setState(215);
			var_ass();
			setState(216);
			match(COMMA);
			setState(217);
			expr(0);
			setState(218);
			match(COMMA);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(219);
				var_assOp();
				}
				break;
			case 2:
				{
				setState(220);
				var_inc_dec();
				}
				break;
			}
			setState(223);
			match(CLOSE);
			setState(224);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(GrammarParser.FOREACH, 0); }
		public TerminalNode OPEN() { return getToken(GrammarParser.OPEN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(GrammarParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(FOREACH);
			setState(227);
			match(OPEN);
			setState(228);
			match(ID);
			setState(229);
			match(COLON);
			setState(230);
			expr(0);
			setState(231);
			match(CLOSE);
			setState(232);
			block();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006z\b\u0006\u0003\u0006|\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0085\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0099\b\n\n\n\f\n\u009c"+
		"\t\n\u0003\n\u009e\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ab"+
		"\b\f\n\f\f\f\u00ae\t\f\u0003\f\u00b0\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u00b9\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00de\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0000\u0001\n\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\b\u0001\u0000?C\u0003\u0000"+
		"!!*+//\u0001\u0000,.\u0001\u0000*+\u0001\u000004\u0002\u0000\u001f \""+
		"%\u0001\u0000\u0015\u001e\u0001\u0000()\u00f3\u00001\u0001\u0000\u0000"+
		"\u0000\u00024\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006"+
		"N\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000"+
		"\u0000\fq\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000\u0010"+
		"\u008b\u0001\u0000\u0000\u0000\u0012\u0091\u0001\u0000\u0000\u0000\u0014"+
		"\u0094\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018"+
		"\u00a6\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c"+
		"\u00b6\u0001\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00bf"+
		"\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000$\u00c5\u0001"+
		"\u0000\u0000\u0000&\u00c8\u0001\u0000\u0000\u0000(\u00ce\u0001\u0000\u0000"+
		"\u0000*\u00d5\u0001\u0000\u0000\u0000,\u00e2\u0001\u0000\u0000\u0000."+
		"0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0001\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000048\u00057\u0000\u000057\u0003"+
		"\u0004\u0002\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;<\u00058\u0000\u0000<\u0003\u0001\u0000"+
		"\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005<\u0000\u0000?H\u0001\u0000"+
		"\u0000\u0000@H\u0003\f\u0006\u0000AH\u0003\u000e\u0007\u0000BH\u0003\u0016"+
		"\u000b\u0000CH\u0003&\u0013\u0000DH\u0003(\u0014\u0000EH\u0003*\u0015"+
		"\u0000FH\u0003,\u0016\u0000G=\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000"+
		"\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001\u0000"+
		"\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IO\u0003\n\u0005\u0000"+
		"JO\u0003\u001c\u000e\u0000KO\u0003\u001e\u000f\u0000LO\u0003$\u0012\u0000"+
		"MO\u0003\"\u0011\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000"+
		"NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\t\u0001"+
		"\u0000\u0000\u0000RS\u0006\u0005\uffff\uffff\u0000SY\u0003\b\u0004\u0000"+
		"TY\u0005D\u0000\u0000UY\u0003\u001a\r\u0000VW\u0007\u0001\u0000\u0000"+
		"WY\u0003\n\u0005\u0007XR\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000"+
		"XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Yn\u0001\u0000\u0000"+
		"\u0000Z[\n\u0006\u0000\u0000[\\\u0007\u0002\u0000\u0000\\m\u0003\n\u0005"+
		"\u0007]^\n\u0005\u0000\u0000^_\u0007\u0003\u0000\u0000_m\u0003\n\u0005"+
		"\u0006`a\n\u0004\u0000\u0000ab\u0007\u0004\u0000\u0000bm\u0003\n\u0005"+
		"\u0005cd\n\u0003\u0000\u0000de\u0005&\u0000\u0000em\u0003\n\u0005\u0004"+
		"fg\n\u0002\u0000\u0000gh\u0005\'\u0000\u0000hm\u0003\n\u0005\u0003ij\n"+
		"\u0001\u0000\u0000jk\u0007\u0005\u0000\u0000km\u0003\n\u0005\u0002lZ\u0001"+
		"\u0000\u0000\u0000l]\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000"+
		"lc\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000li\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0005\u0000\u0000rs\u00055\u0000\u0000st\u0003\n\u0005\u0000"+
		"tu\u00056\u0000\u0000u{\u0003\u0002\u0001\u0000vy\u0005\u0006\u0000\u0000"+
		"wz\u0003\f\u0006\u0000xz\u0003\u0002\u0001\u0000yw\u0001\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0005\r"+
		"\u0000\u0000~\u007f\u00055\u0000\u0000\u007f\u0080\u0003\n\u0005\u0000"+
		"\u0080\u0081\u00056\u0000\u0000\u0081\u0086\u00057\u0000\u0000\u0082\u0085"+
		"\u0003\u0010\b\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u00058\u0000\u0000\u008a\u000f\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u008d\u00055\u0000"+
		"\u0000\u008d\u008e\u0003\n\u0005\u0000\u008e\u008f\u00056\u0000\u0000"+
		"\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0011\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0003\u0002\u0001\u0000"+
		"\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u009d\u00055\u0000\u0000\u0095"+
		"\u009a\u0005D\u0000\u0000\u0096\u0097\u0005=\u0000\u0000\u0097\u0099\u0005"+
		"D\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u0095\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u00056\u0000"+
		"\u0000\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0012\u0000"+
		"\u0000\u00a2\u00a3\u0005D\u0000\u0000\u00a3\u00a4\u0003\u0014\n\u0000"+
		"\u00a4\u00a5\u0003\u0002\u0001\u0000\u00a5\u0017\u0001\u0000\u0000\u0000"+
		"\u00a6\u00af\u00055\u0000\u0000\u00a7\u00ac\u0003\n\u0005\u0000\u00a8"+
		"\u00a9\u0005=\u0000\u0000\u00a9\u00ab\u0003\n\u0005\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00a7"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u00056\u0000\u0000\u00b2\u0019\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005D\u0000\u0000\u00b4\u00b5\u0003\u0018"+
		"\f\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005\u0013\u0000"+
		"\u0000\u00b7\u00b9\u0003\n\u0005\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bc\u0005D\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0014\u0000\u0000\u00bd\u00be\u0003\n\u0005\u0000\u00be\u001f"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u0006\u0000\u0000\u00c0!\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005D\u0000\u0000\u00c2\u00c3\u0003 \u0010"+
		"\u0000\u00c3\u00c4\u0003\n\u0005\u0000\u00c4#\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005D\u0000\u0000\u00c6\u00c7\u0007\u0007\u0000\u0000\u00c7"+
		"%\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\t\u0000\u0000\u00c9\u00ca"+
		"\u00055\u0000\u0000\u00ca\u00cb\u0003\n\u0005\u0000\u00cb\u00cc\u0005"+
		"6\u0000\u0000\u00cc\u00cd\u0003\u0002\u0001\u0000\u00cd\'\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\n\u0000\u0000\u00cf\u00d0\u0003\u0002\u0001"+
		"\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d2\u00055\u0000\u0000"+
		"\u00d2\u00d3\u0003\n\u0005\u0000\u00d3\u00d4\u00056\u0000\u0000\u00d4"+
		")\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000\u00d6\u00d7"+
		"\u00055\u0000\u0000\u00d7\u00d8\u0003\u001e\u000f\u0000\u00d8\u00d9\u0005"+
		"=\u0000\u0000\u00d9\u00da\u0003\n\u0005\u0000\u00da\u00dd\u0005=\u0000"+
		"\u0000\u00db\u00de\u0003\"\u0011\u0000\u00dc\u00de\u0003$\u0012\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u00056\u0000\u0000\u00e0"+
		"\u00e1\u0003\u0002\u0001\u0000\u00e1+\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\b\u0000\u0000\u00e3\u00e4\u00055\u0000\u0000\u00e4\u00e5\u0005"+
		"D\u0000\u0000\u00e5\u00e6\u0005;\u0000\u0000\u00e6\u00e7\u0003\n\u0005"+
		"\u0000\u00e7\u00e8\u00056\u0000\u0000\u00e8\u00e9\u0003\u0002\u0001\u0000"+
		"\u00e9-\u0001\u0000\u0000\u0000\u001118GNXlny{\u0084\u0086\u009a\u009d"+
		"\u00ac\u00af\u00b8\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}