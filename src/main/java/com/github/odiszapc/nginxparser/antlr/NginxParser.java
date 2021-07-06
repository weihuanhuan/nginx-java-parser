// Generated from Nginx.g4 by ANTLR 4.5.3

/**
 * Here you can add header information to the generated source file.
 */

package com.github.odiszapc.nginxparser.antlr;
import com.github.odiszapc.nginxparser.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxParser extends NginxBaseParser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, LuaBlockID_Regex=15, 
		Comment=16, Value=17, STR_EXT=18, REGEXP_PREFIXED=19, QUOTED_STRING=20, 
		SINGLE_QUOTED=21, WS=22;
	public static final int
		RULE_config = 0, RULE_statement = 1, RULE_genericStatement = 2, RULE_regexHeaderStatement = 3, 
		RULE_block = 4, RULE_genericBlockHeader = 5, RULE_if_statement = 6, RULE_if_body = 7, 
		RULE_lua_block = 8, RULE_lua_res = 9, RULE_lua_code = 10, RULE_lua_content = 11, 
		RULE_regexp = 12, RULE_locationBlockHeader = 13, RULE_rewriteStatement = 14;
	public static final String[] ruleNames = {
		"config", "statement", "genericStatement", "regexHeaderStatement", "block", 
		"genericBlockHeader", "if_statement", "if_body", "lua_block", "lua_res", 
		"lua_code", "lua_content", "regexp", "locationBlockHeader", "rewriteStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'\\.'", "'^'", "'location'", 
		"'rewrite'", "'last'", "'break'", "'redirect'", "'permanent'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LuaBlockID_Regex", "Comment", "Value", "STR_EXT", "REGEXP_PREFIXED", 
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

	@Override
	public String getGrammarFileName() { return "Nginx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NginxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigContext extends ParserRuleContext {
		public NgxConfig ret;
		public StatementContext statement;
		public BlockContext block;
		public Token Comment;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		 ((ConfigContext)_localctx).ret =  new NgxConfig(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					((ConfigContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).statement.ret); 
					}
					break;
				case 2:
					{
					setState(33);
					((ConfigContext)_localctx).block = block();
					 _localctx.ret.addEntry(((ConfigContext)_localctx).block.ret); 
					}
					break;
				case 3:
					{
					setState(36);
					((ConfigContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((ConfigContext)_localctx).Comment!=null?((ConfigContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << Comment) | (1L << Value) | (1L << REGEXP_PREFIXED))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public NgxParam ret;
		public RewriteStatementContext rewriteStatement;
		public GenericStatementContext genericStatement;
		public RegexHeaderStatementContext regexHeaderStatement;
		public RewriteStatementContext rewriteStatement() {
			return getRuleContext(RewriteStatementContext.class,0);
		}
		public GenericStatementContext genericStatement() {
			return getRuleContext(GenericStatementContext.class,0);
		}
		public RegexHeaderStatementContext regexHeaderStatement() {
			return getRuleContext(RegexHeaderStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(42);
				((StatementContext)_localctx).rewriteStatement = rewriteStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).rewriteStatement.ret; 
				}
				break;
			case Value:
				{
				setState(45);
				((StatementContext)_localctx).genericStatement = genericStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).genericStatement.ret; 
				}
				break;
			case REGEXP_PREFIXED:
				{
				setState(48);
				((StatementContext)_localctx).regexHeaderStatement = regexHeaderStatement();
				 ((StatementContext)_localctx).ret =  ((StatementContext)_localctx).regexHeaderStatement.ret; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			match(T__0);
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

	public static class GenericStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token Value;
		public RegexpContext r;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public GenericStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterGenericStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitGenericStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitGenericStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericStatementContext genericStatement() throws RecognitionException {
		GenericStatementContext _localctx = new GenericStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericStatement);
		 ((GenericStatementContext)_localctx).ret =  new NgxParam(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((GenericStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(57);
					((GenericStatementContext)_localctx).Value = match(Value);
					 _localctx.ret.addValue((((GenericStatementContext)_localctx).Value!=null?((GenericStatementContext)_localctx).Value.getText():null)); 
					}
					break;
				case 2:
					{
					setState(59);
					((GenericStatementContext)_localctx).r = regexp();
					 _localctx.ret.addValue(((GenericStatementContext)_localctx).r.ret); 
					}
					break;
				}
				}
				setState(66);
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

	public static class RegexHeaderStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token REGEXP_PREFIXED;
		public Token Value;
		public TerminalNode REGEXP_PREFIXED() { return getToken(NginxParser.REGEXP_PREFIXED, 0); }
		public TerminalNode Value() { return getToken(NginxParser.Value, 0); }
		public RegexHeaderStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexHeaderStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRegexHeaderStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRegexHeaderStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRegexHeaderStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexHeaderStatementContext regexHeaderStatement() throws RecognitionException {
		RegexHeaderStatementContext _localctx = new RegexHeaderStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regexHeaderStatement);
		 ((RegexHeaderStatementContext)_localctx).ret =  new NgxParam(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED = match(REGEXP_PREFIXED);
			 _localctx.ret.addValue((((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED!=null?((RegexHeaderStatementContext)_localctx).REGEXP_PREFIXED.getText():null)); 
			setState(69);
			((RegexHeaderStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((RegexHeaderStatementContext)_localctx).Value!=null?((RegexHeaderStatementContext)_localctx).Value.getText():null)); 
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

	public static class BlockContext extends ParserRuleContext {
		public NgxBlock ret;
		public LocationBlockHeaderContext locationBlockHeader;
		public GenericBlockHeaderContext genericBlockHeader;
		public Token Comment;
		public StatementContext statement;
		public BlockContext b;
		public If_statementContext if_statement;
		public Lua_blockContext lua_block;
		public LocationBlockHeaderContext locationBlockHeader() {
			return getRuleContext(LocationBlockHeaderContext.class,0);
		}
		public GenericBlockHeaderContext genericBlockHeader() {
			return getRuleContext(GenericBlockHeaderContext.class,0);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<Lua_blockContext> lua_block() {
			return getRuleContexts(Lua_blockContext.class);
		}
		public Lua_blockContext lua_block(int i) {
			return getRuleContext(Lua_blockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		 ((BlockContext)_localctx).ret =  new NgxBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(72);
				((BlockContext)_localctx).locationBlockHeader = locationBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).locationBlockHeader.ret); 
				}
				break;
			case Value:
				{
				setState(75);
				((BlockContext)_localctx).genericBlockHeader = genericBlockHeader();
				 _localctx.ret.getTokens().addAll(((BlockContext)_localctx).genericBlockHeader.ret); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comment) {
				{
				{
				setState(80);
				((BlockContext)_localctx).Comment = match(Comment);
				 _localctx.ret.addEntry(new NgxComment((((BlockContext)_localctx).Comment!=null?((BlockContext)_localctx).Comment.getText():null))); 
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__1);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << LuaBlockID_Regex) | (1L << Comment) | (1L << Value) | (1L << REGEXP_PREFIXED))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(88);
					((BlockContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).statement.ret); 
					}
					break;
				case 2:
					{
					setState(91);
					((BlockContext)_localctx).b = block();
					 _localctx.ret.addEntry(((BlockContext)_localctx).b.ret); 
					}
					break;
				case 3:
					{
					setState(94);
					((BlockContext)_localctx).if_statement = if_statement();
					 _localctx.ret.addEntry(((BlockContext)_localctx).if_statement.ret); 
					}
					break;
				case 4:
					{
					setState(97);
					((BlockContext)_localctx).lua_block = lua_block();
					 _localctx.ret.addEntry(((BlockContext)_localctx).lua_block.ret); 
					}
					break;
				case 5:
					{
					setState(100);
					((BlockContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((BlockContext)_localctx).Comment!=null?((BlockContext)_localctx).Comment.getText():null))); 
					}
					break;
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__2);
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

	public static class GenericBlockHeaderContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public GenericBlockHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericBlockHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterGenericBlockHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitGenericBlockHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitGenericBlockHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericBlockHeaderContext genericBlockHeader() throws RecognitionException {
		GenericBlockHeaderContext _localctx = new GenericBlockHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericBlockHeader);
		 ((GenericBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((GenericBlockHeaderContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(111);
					((GenericBlockHeaderContext)_localctx).Value = match(Value);
					 _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext)_localctx).Value!=null?((GenericBlockHeaderContext)_localctx).Value.getText():null))); 
					}
					break;
				case 2:
					{
					setState(113);
					((GenericBlockHeaderContext)_localctx).regexp = regexp();
					 _localctx.ret.add(new NgxToken(((GenericBlockHeaderContext)_localctx).regexp.ret)); 
					}
					break;
				}
				}
				setState(120);
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

	public static class If_statementContext extends ParserRuleContext {
		public NgxIfBlock ret;
		public Token id;
		public If_bodyContext if_body;
		public Token Comment;
		public StatementContext statement;
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		 ((If_statementContext)_localctx).ret =  new NgxIfBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((If_statementContext)_localctx).id = match(T__3);
			 _localctx.ret.addValue(new NgxToken((((If_statementContext)_localctx).id!=null?((If_statementContext)_localctx).id.getText():null))); 
			setState(123);
			((If_statementContext)_localctx).if_body = if_body();
			 _localctx.ret.getTokens().addAll(((If_statementContext)_localctx).if_body.ret); 
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comment) {
				{
				{
				setState(125);
				((If_statementContext)_localctx).Comment = match(Comment);
				 _localctx.ret.addEntry(new NgxComment((((If_statementContext)_localctx).Comment!=null?((If_statementContext)_localctx).Comment.getText():null))); 
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(T__1);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << Comment) | (1L << Value) | (1L << REGEXP_PREFIXED))) != 0)) {
				{
				setState(138);
				switch (_input.LA(1)) {
				case Comment:
					{
					setState(133);
					((If_statementContext)_localctx).Comment = match(Comment);
					 _localctx.ret.addEntry(new NgxComment((((If_statementContext)_localctx).Comment!=null?((If_statementContext)_localctx).Comment.getText():null))); 
					}
					break;
				case T__9:
				case Value:
				case REGEXP_PREFIXED:
					{
					setState(135);
					((If_statementContext)_localctx).statement = statement();
					 _localctx.ret.addEntry(((If_statementContext)_localctx).statement.ret); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__2);
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

	public static class If_bodyContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_body);
		 ((If_bodyContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__4);
			setState(146);
			((If_bodyContext)_localctx).Value = match(Value);
			 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(148);
				((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(152);
				((If_bodyContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((If_bodyContext)_localctx).Value!=null?((If_bodyContext)_localctx).Value.getText():null))); 
				}
				break;
			case 2:
				{
				setState(154);
				((If_bodyContext)_localctx).regexp = regexp();
				 _localctx.ret.add(new NgxToken(((If_bodyContext)_localctx).regexp.ret)); 
				}
				break;
			}
			setState(159);
			match(T__5);
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

	public static class Lua_blockContext extends ParserRuleContext {
		public NgxLuaBlock ret;
		public Token id;
		public Lua_resContext res;
		public Token Comment;
		public Lua_codeContext code;
		public TerminalNode LuaBlockID_Regex() { return getToken(NginxParser.LuaBlockID_Regex, 0); }
		public List<TerminalNode> Comment() { return getTokens(NginxParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(NginxParser.Comment, i);
		}
		public Lua_resContext lua_res() {
			return getRuleContext(Lua_resContext.class,0);
		}
		public Lua_codeContext lua_code() {
			return getRuleContext(Lua_codeContext.class,0);
		}
		public Lua_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lua_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLua_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLua_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLua_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lua_blockContext lua_block() throws RecognitionException {
		Lua_blockContext _localctx = new Lua_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lua_block);
		 ((Lua_blockContext)_localctx).ret =  new NgxLuaBlock(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((Lua_blockContext)_localctx).id = match(LuaBlockID_Regex);
			 _localctx.ret.addValue(new NgxToken((((Lua_blockContext)_localctx).id!=null?((Lua_blockContext)_localctx).id.getText():null))); 
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0)) {
				{
				setState(163);
				((Lua_blockContext)_localctx).res = lua_res();
				 _localctx.ret.addValue(new NgxToken((((Lua_blockContext)_localctx).res!=null?_input.getText(((Lua_blockContext)_localctx).res.start,((Lua_blockContext)_localctx).res.stop):null))); 
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comment) {
				{
				{
				setState(168);
				((Lua_blockContext)_localctx).Comment = match(Comment);
				 _localctx.ret.addEntry(new NgxComment((((Lua_blockContext)_localctx).Comment!=null?((Lua_blockContext)_localctx).Comment.getText():null))); 
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__1);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(176);
				((Lua_blockContext)_localctx).code = lua_code();
				 _localctx.ret.addEntry(((Lua_blockContext)_localctx).code.ret); 
				}
				break;
			}
			setState(181);
			match(T__2);
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

	public static class Lua_resContext extends ParserRuleContext {
		public String ret;
		public Token Value;
		public RegexpContext r;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public Lua_resContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lua_res; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLua_res(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLua_res(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLua_res(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lua_resContext lua_res() throws RecognitionException {
		Lua_resContext _localctx = new Lua_resContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lua_res);
		 ((Lua_resContext)_localctx).ret =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(183);
					((Lua_resContext)_localctx).Value = match(Value);
					 ((Lua_resContext)_localctx).ret =  (((Lua_resContext)_localctx).Value!=null?((Lua_resContext)_localctx).Value.getText():null); 
					}
					break;
				case 2:
					{
					setState(185);
					((Lua_resContext)_localctx).r = regexp();
					 ((Lua_resContext)_localctx).ret =  ((Lua_resContext)_localctx).r.ret; 
					}
					break;
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << Value))) != 0) );
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

	public static class Lua_codeContext extends ParserRuleContext {
		public NgxLuaCode ret;
		public Lua_contentContext content;
		public Lua_contentContext lua_content() {
			return getRuleContext(Lua_contentContext.class,0);
		}
		public Lua_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lua_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLua_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLua_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLua_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lua_codeContext lua_code() throws RecognitionException {
		Lua_codeContext _localctx = new Lua_codeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lua_code);
		 ((Lua_codeContext)_localctx).ret =  new NgxLuaCode(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((Lua_codeContext)_localctx).content = lua_content();
			}
			_ctx.stop = _input.LT(-1);
			 _localctx.ret.addValue(getFullContext((((Lua_codeContext)_localctx).content!=null?_input.getText(((Lua_codeContext)_localctx).content.start,((Lua_codeContext)_localctx).content.stop):null))); 
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

	public static class Lua_contentContext extends ParserRuleContext {
		public Lua_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lua_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLua_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLua_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLua_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lua_contentContext lua_content() throws RecognitionException {
		Lua_contentContext _localctx = new Lua_contentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lua_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(194);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RegexpContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public Token Value;
		public RegexpContext r;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public List<RegexpContext> regexp() {
			return getRuleContexts(RegexpContext.class);
		}
		public RegexpContext regexp(int i) {
			return getRuleContext(RegexpContext.class,i);
		}
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regexp);
		 ((RegexpContext)_localctx).ret =  ""; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(210);
					switch (_input.LA(1)) {
					case T__6:
						{
						setState(199);
						((RegexpContext)_localctx).id = match(T__6);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case T__7:
						{
						setState(201);
						((RegexpContext)_localctx).id = match(T__7);
						 _localctx.ret += (((RegexpContext)_localctx).id!=null?((RegexpContext)_localctx).id.getText():null); 
						}
						break;
					case Value:
						{
						setState(203);
						((RegexpContext)_localctx).Value = match(Value);
						 _localctx.ret += (((RegexpContext)_localctx).Value!=null?((RegexpContext)_localctx).Value.getText():null); 
						}
						break;
					case T__4:
						{
						setState(205);
						match(T__4);
						setState(206);
						((RegexpContext)_localctx).r = regexp();
						 _localctx.ret += "(".concat(((RegexpContext)_localctx).r.ret).concat(")"); 
						setState(208);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LocationBlockHeaderContext extends ParserRuleContext {
		public List<NgxToken> ret;
		public Token id;
		public Token Value;
		public RegexpContext regexp;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public LocationBlockHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationBlockHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterLocationBlockHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitLocationBlockHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitLocationBlockHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationBlockHeaderContext locationBlockHeader() throws RecognitionException {
		LocationBlockHeaderContext _localctx = new LocationBlockHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_locationBlockHeader);
		 ((LocationBlockHeaderContext)_localctx).ret =  new ArrayList<NgxToken>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((LocationBlockHeaderContext)_localctx).id = match(T__8);
			 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).id!=null?((LocationBlockHeaderContext)_localctx).id.getText():null))); 
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(216);
				((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(220);
				((LocationBlockHeaderContext)_localctx).Value = match(Value);
				 _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext)_localctx).Value!=null?((LocationBlockHeaderContext)_localctx).Value.getText():null))); 
				}
				break;
			case 2:
				{
				setState(222);
				((LocationBlockHeaderContext)_localctx).regexp = regexp();
				 _localctx.ret.add(new NgxToken(((LocationBlockHeaderContext)_localctx).regexp.ret)); 
				}
				break;
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

	public static class RewriteStatementContext extends ParserRuleContext {
		public NgxParam ret;
		public Token id;
		public Token Value;
		public RegexpContext regexp;
		public Token opt;
		public List<TerminalNode> Value() { return getTokens(NginxParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(NginxParser.Value, i);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public RewriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).enterRewriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NginxListener ) ((NginxListener)listener).exitRewriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NginxVisitor ) return ((NginxVisitor<? extends T>)visitor).visitRewriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RewriteStatementContext rewriteStatement() throws RecognitionException {
		RewriteStatementContext _localctx = new RewriteStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rewriteStatement);
		 ((RewriteStatementContext)_localctx).ret =  new NgxParam(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((RewriteStatementContext)_localctx).id = match(T__9);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).id!=null?((RewriteStatementContext)_localctx).id.getText():null)); 
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(229);
				((RewriteStatementContext)_localctx).Value = match(Value);
				 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
				}
				break;
			case 2:
				{
				setState(231);
				((RewriteStatementContext)_localctx).regexp = regexp();
				 _localctx.ret.addValue(((RewriteStatementContext)_localctx).regexp.ret); 
				}
				break;
			}
			setState(236);
			((RewriteStatementContext)_localctx).Value = match(Value);
			 _localctx.ret.addValue((((RewriteStatementContext)_localctx).Value!=null?((RewriteStatementContext)_localctx).Value.getText():null)); 
			setState(240);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(238);
				((RewriteStatementContext)_localctx).opt = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
					((RewriteStatementContext)_localctx).opt = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				 _localctx.ret.addValue((((RewriteStatementContext)_localctx).opt!=null?((RewriteStatementContext)_localctx).opt.getText():null)); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\66\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16\b"+
		"\u0085\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a9\n\n\3\n\3\n\7\n\u00ad\n\n\f"+
		"\n\16\n\u00b0\13\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\6\13\u00bf\n\13\r\13\16\13\u00c0\3\f\3\f\3\r\6\r\u00c6\n\r"+
		"\r\r\16\r\u00c7\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\6\16\u00d5\n\16\r\16\16\16\u00d6\3\17\3\17\3\17\3\17\5\17\u00dd\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e4\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ed\n\20\3\20\3\20\3\20\3\20\5\20\u00f3\n\20\3\20\3\u00c7"+
		"\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\r\20\u0109\2(\3\2"+
		"\2\2\4\65\3\2\2\2\69\3\2\2\2\bE\3\2\2\2\nP\3\2\2\2\fo\3\2\2\2\16{\3\2"+
		"\2\2\20\u0093\3\2\2\2\22\u00a3\3\2\2\2\24\u00be\3\2\2\2\26\u00c2\3\2\2"+
		"\2\30\u00c5\3\2\2\2\32\u00d4\3\2\2\2\34\u00d8\3\2\2\2\36\u00e5\3\2\2\2"+
		" !\5\4\3\2!\"\b\2\1\2\")\3\2\2\2#$\5\n\6\2$%\b\2\1\2%)\3\2\2\2&\'\7\22"+
		"\2\2\')\b\2\1\2( \3\2\2\2(#\3\2\2\2(&\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+\3\3\2\2\2,-\5\36\20\2-.\b\3\1\2.\66\3\2\2\2/\60\5\6\4\2\60\61"+
		"\b\3\1\2\61\66\3\2\2\2\62\63\5\b\5\2\63\64\b\3\1\2\64\66\3\2\2\2\65,\3"+
		"\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2\678\7\3\2\28\5\3\2\2\2"+
		"9:\7\23\2\2:B\b\4\1\2;<\7\23\2\2<A\b\4\1\2=>\5\32\16\2>?\b\4\1\2?A\3\2"+
		"\2\2@;\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3"+
		"\2\2\2EF\7\25\2\2FG\b\5\1\2GH\7\23\2\2HI\b\5\1\2I\t\3\2\2\2JK\5\34\17"+
		"\2KL\b\6\1\2LQ\3\2\2\2MN\5\f\7\2NO\b\6\1\2OQ\3\2\2\2PJ\3\2\2\2PM\3\2\2"+
		"\2QV\3\2\2\2RS\7\22\2\2SU\b\6\1\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2Yj\7\4\2\2Z[\5\4\3\2[\\\b\6\1\2\\i\3\2\2\2]^\5"+
		"\n\6\2^_\b\6\1\2_i\3\2\2\2`a\5\16\b\2ab\b\6\1\2bi\3\2\2\2cd\5\22\n\2d"+
		"e\b\6\1\2ei\3\2\2\2fg\7\22\2\2gi\b\6\1\2hZ\3\2\2\2h]\3\2\2\2h`\3\2\2\2"+
		"hc\3\2\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2"+
		"mn\7\5\2\2n\13\3\2\2\2op\7\23\2\2px\b\7\1\2qr\7\23\2\2rw\b\7\1\2st\5\32"+
		"\16\2tu\b\7\1\2uw\3\2\2\2vq\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y\r\3\2\2\2zx\3\2\2\2{|\7\6\2\2|}\b\b\1\2}~\5\20\t\2~\u0083\b\b"+
		"\1\2\177\u0080\7\22\2\2\u0080\u0082\b\b\1\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008e\7\4\2\2\u0087\u0088\7\22\2\2\u0088\u008d\b"+
		"\b\1\2\u0089\u008a\5\4\3\2\u008a\u008b\b\b\1\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0087\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\5\2\2\u0092\17\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0095\7\23\2"+
		"\2\u0095\u0098\b\t\1\2\u0096\u0097\7\23\2\2\u0097\u0099\b\t\1\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009f\3\2\2\2\u009a\u009b\7\23"+
		"\2\2\u009b\u00a0\b\t\1\2\u009c\u009d\5\32\16\2\u009d\u009e\b\t\1\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\b\2\2\u00a2\21\3\2\2\2\u00a3\u00a4"+
		"\7\21\2\2\u00a4\u00a8\b\n\1\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\b\n\1"+
		"\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae"+
		"\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ad\b\n\1\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b5\7\4\2\2\u00b2\u00b3\5\26\f\2"+
		"\u00b3\u00b4\b\n\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\5\2\2\u00b8\23\3\2\2\2\u00b9"+
		"\u00ba\7\23\2\2\u00ba\u00bf\b\13\1\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd"+
		"\b\13\1\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bb\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\25"+
		"\3\2\2\2\u00c2\u00c3\5\30\r\2\u00c3\27\3\2\2\2\u00c4\u00c6\13\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00d5\b\16\1\2\u00cb\u00cc"+
		"\7\n\2\2\u00cc\u00d5\b\16\1\2\u00cd\u00ce\7\23\2\2\u00ce\u00d5\b\16\1"+
		"\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2\b\16\1\2\u00d2"+
		"\u00d3\7\b\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00cb\3\2"+
		"\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\7\13\2"+
		"\2\u00d9\u00dc\b\17\1\2\u00da\u00db\7\23\2\2\u00db\u00dd\b\17\1\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\7\23"+
		"\2\2\u00df\u00e4\b\17\1\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\b\17\1\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\35\3\2\2"+
		"\2\u00e5\u00e6\7\f\2\2\u00e6\u00ec\b\20\1\2\u00e7\u00e8\7\23\2\2\u00e8"+
		"\u00ed\b\20\1\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\b\20\1\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7\23\2\2\u00ef\u00f2\b\20\1\2\u00f0\u00f1\t\2\2\2\u00f1\u00f3\b"+
		"\20\1\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2\2\36(*"+
		"\65@BPVhjvx\u0083\u008c\u008e\u0098\u009f\u00a8\u00ae\u00b5\u00be\u00c0"+
		"\u00c7\u00d4\u00d6\u00dc\u00e3\u00ec\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}