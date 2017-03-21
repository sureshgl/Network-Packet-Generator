// Generated from p416.g4 by ANTLR 4.4
package com.proteus.parser.p416.gen;

	import com.proteus.parser.p416.ext.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class p416Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, Hex_number=26, Decimal_number=27, Octal_number=28, Binary_number=29, 
		Real_number=30, COMMENT=31, WS=32, STRING=33, ABSTRACT=34, ACTION=35, 
		ACTIONS=36, APPLY=37, BOOL=38, BIT=39, CONST=40, CONTROL=41, DEFAULT=42, 
		ELSE=43, ENUM=44, T_ERROR=45, EXIT=46, EXTERN=47, FALSE=48, HEADER=49, 
		HEADER_UNION=50, IF=51, IN=52, INOUT=53, INT=54, KEY=55, MATCH_KIND=56, 
		OUT=57, PARSER=58, PACKAGE=59, RETURN=60, SELECT=61, STATE=62, STRUCT=63, 
		SWITCH=64, TABLE=65, THIS=66, TRANSITION=67, TRUE=68, TUPLE=69, TYPEDEF=70, 
		VARBIT=71, VOID=72, DONTCARE=73, IDENTIFIER=74, MASK=75, RANGE=76, SHL=77, 
		AND=78, OR=79, EQ=80, NE=81, GE=82, LE=83, PP=84;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'%'", "'&'", "'^'", "'.'", "')'", "','", "'+'", "'['", 
		"'-'", "'*'", "':'", "'('", "'@'", "'<'", "'='", "';'", "'?'", "'>'", 
		"'{'", "'/'", "'~'", "'}'", "'|'", "'!'", "Hex_number", "Decimal_number", 
		"Octal_number", "Binary_number", "Real_number", "COMMENT", "WS", "STRING", 
		"'abstract'", "'action'", "'actions'", "'apply'", "'bool'", "'bit'", "'const'", 
		"'control'", "'default'", "'else'", "'enum'", "'error'", "'exit'", "'extern'", 
		"'false'", "'header'", "'header_union'", "'if'", "'in'", "'inout'", "'int'", 
		"'key'", "'match_kind'", "'out'", "'parser'", "'package'", "'return'", 
		"'select'", "'state'", "'struct'", "'switch'", "'table'", "'this'", "'transition'", 
		"'true'", "'tuple'", "'typedef'", "'varbit'", "'void'", "'_'", "IDENTIFIER", 
		"'&&&'", "'..'", "'<<'", "'&&'", "'||'", "'=='", "'!='", "'>='", "'<='", 
		"'++'"
	};
	public static final int
		RULE_input = 0, RULE_declaration = 1, RULE_nonTypeName = 2, RULE_name = 3, 
		RULE_optAnnotations = 4, RULE_annotations = 5, RULE_annotation = 6, RULE_parameterList = 7, 
		RULE_nonEmptyParameterList = 8, RULE_parameter = 9, RULE_direction = 10, 
		RULE_packageTypeDeclaration = 11, RULE_instantiation = 12, RULE_objInitializer = 13, 
		RULE_objDeclarations = 14, RULE_objDeclaration = 15, RULE_optConstructorParameters = 16, 
		RULE_dotPrefix = 17, RULE_parserDeclaration = 18, RULE_parserLocalElements = 19, 
		RULE_parserLocalElement = 20, RULE_parserTypeDeclaration = 21, RULE_parserStates = 22, 
		RULE_parserState = 23, RULE_parserStatements = 24, RULE_parserStatement = 25, 
		RULE_parserBlockStatement = 26, RULE_transitionStatement = 27, RULE_stateExpression = 28, 
		RULE_selectExpression = 29, RULE_selectCaseList = 30, RULE_selectCase = 31, 
		RULE_keysetExpression = 32, RULE_tupleKeysetExpression = 33, RULE_simpleExpressionList = 34, 
		RULE_simpleKeysetExpression = 35, RULE_controlDeclaration = 36, RULE_controlTypeDeclaration = 37, 
		RULE_controlLocalDeclarations = 38, RULE_controlLocalDeclaration = 39, 
		RULE_controlBody = 40, RULE_externDeclaration = 41, RULE_methodPrototypes = 42, 
		RULE_functionPrototype = 43, RULE_methodPrototype = 44, RULE_typeRef = 45, 
		RULE_prefixedType = 46, RULE_typeName = 47, RULE_tupleType = 48, RULE_headerStackType = 49, 
		RULE_specializedType = 50, RULE_baseType = 51, RULE_typeOrVoid = 52, RULE_optTypeParameters = 53, 
		RULE_typeParameterList = 54, RULE_typeArg = 55, RULE_typeArgumentList = 56, 
		RULE_typeDeclaration = 57, RULE_derivedTypeDeclaration = 58, RULE_headerTypeDeclaration = 59, 
		RULE_structTypeDeclaration = 60, RULE_headerUnionDeclaration = 61, RULE_structFieldList = 62, 
		RULE_structField = 63, RULE_enumDeclaration = 64, RULE_errorDeclaration = 65, 
		RULE_matchKindDeclaration = 66, RULE_identifierList = 67, RULE_typedefDeclaration = 68, 
		RULE_assignmentOrMethodCallStatement = 69, RULE_emptyStatement = 70, RULE_exitStatement = 71, 
		RULE_returnStatement = 72, RULE_conditionalStatement = 73, RULE_statement = 74, 
		RULE_blockStatement = 75, RULE_statOrDeclList = 76, RULE_switchStatement = 77, 
		RULE_switchCases = 78, RULE_switchCase = 79, RULE_switchLabel = 80, RULE_statementOrDeclaration = 81, 
		RULE_tableDeclaration = 82, RULE_tablePropertyList = 83, RULE_tableProperty = 84, 
		RULE_keyElementList = 85, RULE_keyElement = 86, RULE_actionList = 87, 
		RULE_actionRef = 88, RULE_actionDeclaration = 89, RULE_variableDeclaration = 90, 
		RULE_constantDeclaration = 91, RULE_optInitializer = 92, RULE_initializer = 93, 
		RULE_functionDeclaration = 94, RULE_argumentList = 95, RULE_nonEmptyArgList = 96, 
		RULE_argument = 97, RULE_expressionList = 98, RULE_prefixedNonTypeName = 99, 
		RULE_lvalue = 100, RULE_expression = 101, RULE_number = 102;
	public static final String[] ruleNames = {
		"input", "declaration", "nonTypeName", "name", "optAnnotations", "annotations", 
		"annotation", "parameterList", "nonEmptyParameterList", "parameter", "direction", 
		"packageTypeDeclaration", "instantiation", "objInitializer", "objDeclarations", 
		"objDeclaration", "optConstructorParameters", "dotPrefix", "parserDeclaration", 
		"parserLocalElements", "parserLocalElement", "parserTypeDeclaration", 
		"parserStates", "parserState", "parserStatements", "parserStatement", 
		"parserBlockStatement", "transitionStatement", "stateExpression", "selectExpression", 
		"selectCaseList", "selectCase", "keysetExpression", "tupleKeysetExpression", 
		"simpleExpressionList", "simpleKeysetExpression", "controlDeclaration", 
		"controlTypeDeclaration", "controlLocalDeclarations", "controlLocalDeclaration", 
		"controlBody", "externDeclaration", "methodPrototypes", "functionPrototype", 
		"methodPrototype", "typeRef", "prefixedType", "typeName", "tupleType", 
		"headerStackType", "specializedType", "baseType", "typeOrVoid", "optTypeParameters", 
		"typeParameterList", "typeArg", "typeArgumentList", "typeDeclaration", 
		"derivedTypeDeclaration", "headerTypeDeclaration", "structTypeDeclaration", 
		"headerUnionDeclaration", "structFieldList", "structField", "enumDeclaration", 
		"errorDeclaration", "matchKindDeclaration", "identifierList", "typedefDeclaration", 
		"assignmentOrMethodCallStatement", "emptyStatement", "exitStatement", 
		"returnStatement", "conditionalStatement", "statement", "blockStatement", 
		"statOrDeclList", "switchStatement", "switchCases", "switchCase", "switchLabel", 
		"statementOrDeclaration", "tableDeclaration", "tablePropertyList", "tableProperty", 
		"keyElementList", "keyElement", "actionList", "actionRef", "actionDeclaration", 
		"variableDeclaration", "constantDeclaration", "optInitializer", "initializer", 
		"functionDeclaration", "argumentList", "nonEmptyArgList", "argument", 
		"expressionList", "prefixedNonTypeName", "lvalue", "expression", "number"
	};

	@Override
	public String getGrammarFileName() { return "p416.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public p416Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContextExt extendedContext;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); declaration();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << ACTION) | (1L << BOOL) | (1L << BIT) | (1L << CONST) | (1L << CONTROL) | (1L << ENUM) | (1L << T_ERROR) | (1L << EXTERN) | (1L << HEADER) | (1L << HEADER_UNION) | (1L << INT) | (1L << MATCH_KIND) | (1L << PARSER) | (1L << PACKAGE) | (1L << STRUCT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TUPLE - 69)) | (1L << (TYPEDEF - 69)) | (1L << (VARBIT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(207); declaration();
				}
				}
				setState(212);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContextExt extendedContext;
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ExternDeclarationContext externDeclaration() {
			return getRuleContext(ExternDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public MatchKindDeclarationContext matchKindDeclaration() {
			return getRuleContext(MatchKindDeclarationContext.class,0);
		}
		public ParserDeclarationContext parserDeclaration() {
			return getRuleContext(ParserDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public ErrorDeclarationContext errorDeclaration() {
			return getRuleContext(ErrorDeclarationContext.class,0);
		}
		public ControlDeclarationContext controlDeclaration() {
			return getRuleContext(ControlDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); externDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); actionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); parserDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217); typeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218); controlDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219); instantiation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(220); errorDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(221); matchKindDeclaration();
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

	public static class NonTypeNameContext extends ParserRuleContext {
		public NonTypeNameContextExt extendedContext;
		public TerminalNode APPLY() { return getToken(p416Parser.APPLY, 0); }
		public TerminalNode STATE() { return getToken(p416Parser.STATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(p416Parser.IDENTIFIER, 0); }
		public TerminalNode KEY() { return getToken(p416Parser.KEY, 0); }
		public TerminalNode ACTIONS() { return getToken(p416Parser.ACTIONS, 0); }
		public NonTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterNonTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitNonTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitNonTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTypeNameContext nonTypeName() throws RecognitionException {
		NonTypeNameContext _localctx = new NonTypeNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ACTIONS - 36)) | (1L << (APPLY - 36)) | (1L << (KEY - 36)) | (1L << (STATE - 36)) | (1L << (IDENTIFIER - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NameContext extends ParserRuleContext {
		public NameContextExt extendedContext;
		public TerminalNode IDENTIFIER() { return getToken(p416Parser.IDENTIFIER, 0); }
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); nonTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227); match(IDENTIFIER);
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

	public static class OptAnnotationsContext extends ParserRuleContext {
		public OptAnnotationsContextExt extendedContext;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public OptAnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optAnnotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterOptAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitOptAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitOptAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptAnnotationsContext optAnnotations() throws RecognitionException {
		OptAnnotationsContext _localctx = new OptAnnotationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optAnnotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(230); annotations(0);
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

	public static class AnnotationsContext extends ParserRuleContext {
		public AnnotationsContextExt extendedContext;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		return annotations(0);
	}

	private AnnotationsContext annotations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, _parentState);
		AnnotationsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_annotations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234); annotation();
			}
			_ctx.stop = _input.LT(-1);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AnnotationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_annotations);
					setState(236);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(237); annotation();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContextExt extendedContext;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotation);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); match(T__11);
				setState(244); name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(T__11);
				setState(246); name();
				setState(247); match(T__12);
				setState(248); expressionList(0);
				setState(249); match(T__19);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContextExt extendedContext;
		public NonEmptyParameterListContext nonEmptyParameterList() {
			return getRuleContext(NonEmptyParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << OUT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TUPLE - 69)) | (1L << (VARBIT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(253); nonEmptyParameterList(0);
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

	public static class NonEmptyParameterListContext extends ParserRuleContext {
		public NonEmptyParameterListContextExt extendedContext;
		public NonEmptyParameterListContext nonEmptyParameterList() {
			return getRuleContext(NonEmptyParameterListContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public NonEmptyParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterNonEmptyParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitNonEmptyParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitNonEmptyParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonEmptyParameterListContext nonEmptyParameterList() throws RecognitionException {
		return nonEmptyParameterList(0);
	}

	private NonEmptyParameterListContext nonEmptyParameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonEmptyParameterListContext _localctx = new NonEmptyParameterListContext(_ctx, _parentState);
		NonEmptyParameterListContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_nonEmptyParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257); parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonEmptyParameterList);
					setState(259);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(260); match(T__18);
					setState(261); parameter();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); optAnnotations();
			setState(268); direction();
			setState(269); typeRef();
			setState(270); name();
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

	public static class DirectionContext extends ParserRuleContext {
		public DirectionContextExt extendedContext;
		public TerminalNode IN() { return getToken(p416Parser.IN, 0); }
		public TerminalNode OUT() { return getToken(p416Parser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(p416Parser.INOUT, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << INOUT) | (1L << OUT))) != 0)) {
				{
				setState(272);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << INOUT) | (1L << OUT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class PackageTypeDeclarationContext extends ParserRuleContext {
		public PackageTypeDeclarationContextExt extendedContext;
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode PACKAGE() { return getToken(p416Parser.PACKAGE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public PackageTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterPackageTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitPackageTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitPackageTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageTypeDeclarationContext packageTypeDeclaration() throws RecognitionException {
		PackageTypeDeclarationContext _localctx = new PackageTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_packageTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); optAnnotations();
			setState(276); match(PACKAGE);
			setState(277); name();
			setState(278); optTypeParameters();
			setState(279); match(T__12);
			setState(280); parameterList();
			setState(281); match(T__19);
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

	public static class InstantiationContext extends ParserRuleContext {
		public InstantiationContextExt extendedContext;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ObjInitializerContext objInitializer() {
			return getRuleContext(ObjInitializerContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instantiation);
		try {
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); annotations(0);
				setState(284); typeRef();
				setState(285); match(T__12);
				setState(286); argumentList();
				setState(287); match(T__19);
				setState(288); name();
				setState(289); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); typeRef();
				setState(292); match(T__12);
				setState(293); argumentList();
				setState(294); match(T__19);
				setState(295); name();
				setState(296); match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298); annotations(0);
				setState(299); typeRef();
				setState(300); match(T__12);
				setState(301); argumentList();
				setState(302); match(T__19);
				setState(303); name();
				setState(304); match(T__9);
				setState(305); objInitializer();
				setState(306); match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(308); typeRef();
				setState(309); match(T__12);
				setState(310); argumentList();
				setState(311); match(T__19);
				setState(312); name();
				setState(313); match(T__9);
				setState(314); objInitializer();
				setState(315); match(T__8);
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

	public static class ObjInitializerContext extends ParserRuleContext {
		public ObjInitializerContextExt extendedContext;
		public ObjDeclarationsContext objDeclarations() {
			return getRuleContext(ObjDeclarationsContext.class,0);
		}
		public ObjInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterObjInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitObjInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitObjInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjInitializerContext objInitializer() throws RecognitionException {
		ObjInitializerContext _localctx = new ObjInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(T__5);
			setState(320); objDeclarations();
			setState(321); match(T__2);
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

	public static class ObjDeclarationsContext extends ParserRuleContext {
		public ObjDeclarationsContextExt extendedContext;
		public List<ObjDeclarationContext> objDeclaration() {
			return getRuleContexts(ObjDeclarationContext.class);
		}
		public ObjDeclarationContext objDeclaration(int i) {
			return getRuleContext(ObjDeclarationContext.class,i);
		}
		public ObjDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterObjDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitObjDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitObjDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDeclarationsContext objDeclarations() throws RecognitionException {
		ObjDeclarationsContext _localctx = new ObjDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TUPLE - 69)) | (1L << (VARBIT - 69)) | (1L << (VOID - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(323); objDeclaration();
				}
				}
				setState(328);
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

	public static class ObjDeclarationContext extends ParserRuleContext {
		public ObjDeclarationContextExt extendedContext;
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterObjDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitObjDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitObjDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjDeclarationContext objDeclaration() throws RecognitionException {
		ObjDeclarationContext _localctx = new ObjDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_objDeclaration);
		try {
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329); functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330); instantiation();
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

	public static class OptConstructorParametersContext extends ParserRuleContext {
		public OptConstructorParametersContextExt extendedContext;
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public OptConstructorParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optConstructorParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterOptConstructorParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitOptConstructorParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitOptConstructorParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptConstructorParametersContext optConstructorParameters() throws RecognitionException {
		OptConstructorParametersContext _localctx = new OptConstructorParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optConstructorParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(333); match(T__12);
				setState(334); parameterList();
				setState(335); match(T__19);
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

	public static class DotPrefixContext extends ParserRuleContext {
		public DotPrefixContextExt extendedContext;
		public DotPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterDotPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitDotPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitDotPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotPrefixContext dotPrefix() throws RecognitionException {
		DotPrefixContext _localctx = new DotPrefixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dotPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(T__20);
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

	public static class ParserDeclarationContext extends ParserRuleContext {
		public ParserDeclarationContextExt extendedContext;
		public ParserTypeDeclarationContext parserTypeDeclaration() {
			return getRuleContext(ParserTypeDeclarationContext.class,0);
		}
		public ParserStatesContext parserStates() {
			return getRuleContext(ParserStatesContext.class,0);
		}
		public OptConstructorParametersContext optConstructorParameters() {
			return getRuleContext(OptConstructorParametersContext.class,0);
		}
		public ParserLocalElementsContext parserLocalElements() {
			return getRuleContext(ParserLocalElementsContext.class,0);
		}
		public ParserDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserDeclarationContext parserDeclaration() throws RecognitionException {
		ParserDeclarationContext _localctx = new ParserDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parserDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); parserTypeDeclaration();
			setState(342); optConstructorParameters();
			setState(343); match(T__5);
			setState(344); parserLocalElements();
			setState(345); parserStates(0);
			setState(346); match(T__2);
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

	public static class ParserLocalElementsContext extends ParserRuleContext {
		public ParserLocalElementsContextExt extendedContext;
		public ParserLocalElementContext parserLocalElement(int i) {
			return getRuleContext(ParserLocalElementContext.class,i);
		}
		public List<ParserLocalElementContext> parserLocalElement() {
			return getRuleContexts(ParserLocalElementContext.class);
		}
		public ParserLocalElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserLocalElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserLocalElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserLocalElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserLocalElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserLocalElementsContext parserLocalElements() throws RecognitionException {
		ParserLocalElementsContext _localctx = new ParserLocalElementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parserLocalElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348); parserLocalElement();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ParserLocalElementContext extends ParserRuleContext {
		public ParserLocalElementContextExt extendedContext;
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ParserLocalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserLocalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserLocalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserLocalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserLocalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserLocalElementContext parserLocalElement() throws RecognitionException {
		ParserLocalElementContext _localctx = new ParserLocalElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parserLocalElement);
		try {
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355); instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356); variableDeclaration();
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

	public static class ParserTypeDeclarationContext extends ParserRuleContext {
		public ParserTypeDeclarationContextExt extendedContext;
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode PARSER() { return getToken(p416Parser.PARSER, 0); }
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParserTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserTypeDeclarationContext parserTypeDeclaration() throws RecognitionException {
		ParserTypeDeclarationContext _localctx = new ParserTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parserTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); optAnnotations();
			setState(360); match(PARSER);
			setState(361); name();
			setState(362); optTypeParameters();
			setState(363); match(T__12);
			setState(364); parameterList();
			setState(365); match(T__19);
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

	public static class ParserStatesContext extends ParserRuleContext {
		public ParserStatesContextExt extendedContext;
		public ParserStatesContext parserStates() {
			return getRuleContext(ParserStatesContext.class,0);
		}
		public ParserStateContext parserState() {
			return getRuleContext(ParserStateContext.class,0);
		}
		public ParserStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserStatesContext parserStates() throws RecognitionException {
		return parserStates(0);
	}

	private ParserStatesContext parserStates(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParserStatesContext _localctx = new ParserStatesContext(_ctx, _parentState);
		ParserStatesContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_parserStates, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368); parserState();
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParserStatesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parserStates);
					setState(370);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(371); parserState();
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ParserStateContext extends ParserRuleContext {
		public ParserStateContextExt extendedContext;
		public TerminalNode STATE() { return getToken(p416Parser.STATE, 0); }
		public ParserStatementsContext parserStatements() {
			return getRuleContext(ParserStatementsContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TransitionStatementContext transitionStatement() {
			return getRuleContext(TransitionStatementContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParserStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserStateContext parserState() throws RecognitionException {
		ParserStateContext _localctx = new ParserStateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parserState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); optAnnotations();
			setState(378); match(STATE);
			setState(379); name();
			setState(380); match(T__5);
			setState(381); parserStatements();
			setState(382); transitionStatement();
			setState(383); match(T__2);
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

	public static class ParserStatementsContext extends ParserRuleContext {
		public ParserStatementsContextExt extendedContext;
		public ParserStatementContext parserStatement(int i) {
			return getRuleContext(ParserStatementContext.class,i);
		}
		public List<ParserStatementContext> parserStatement() {
			return getRuleContexts(ParserStatementContext.class);
		}
		public ParserStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserStatementsContext parserStatements() throws RecognitionException {
		ParserStatementsContext _localctx = new ParserStatementsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parserStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << T__5) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (THIS - 66)) | (1L << (TUPLE - 66)) | (1L << (VARBIT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(385); parserStatement();
				}
				}
				setState(390);
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

	public static class ParserStatementContext extends ParserRuleContext {
		public ParserStatementContextExt extendedContext;
		public ParserBlockStatementContext parserBlockStatement() {
			return getRuleContext(ParserBlockStatementContext.class,0);
		}
		public AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() {
			return getRuleContext(AssignmentOrMethodCallStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ParserStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserStatementContext parserStatement() throws RecognitionException {
		ParserStatementContext _localctx = new ParserStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parserStatement);
		try {
			setState(394);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391); assignmentOrMethodCallStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392); variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393); parserBlockStatement();
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

	public static class ParserBlockStatementContext extends ParserRuleContext {
		public ParserBlockStatementContextExt extendedContext;
		public ParserStatementsContext parserStatements() {
			return getRuleContext(ParserStatementsContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public ParserBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterParserBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitParserBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitParserBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserBlockStatementContext parserBlockStatement() throws RecognitionException {
		ParserBlockStatementContext _localctx = new ParserBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parserBlockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); optAnnotations();
			setState(397); match(T__5);
			setState(398); parserStatements();
			setState(399); match(T__2);
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

	public static class TransitionStatementContext extends ParserRuleContext {
		public TransitionStatementContextExt extendedContext;
		public StateExpressionContext stateExpression() {
			return getRuleContext(StateExpressionContext.class,0);
		}
		public TerminalNode TRANSITION() { return getToken(p416Parser.TRANSITION, 0); }
		public TransitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTransitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTransitionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTransitionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionStatementContext transitionStatement() throws RecognitionException {
		TransitionStatementContext _localctx = new TransitionStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_transitionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if (_la==TRANSITION) {
				{
				setState(401); match(TRANSITION);
				setState(402); stateExpression();
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

	public static class StateExpressionContext extends ParserRuleContext {
		public StateExpressionContextExt extendedContext;
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateExpressionContext stateExpression() throws RecognitionException {
		StateExpressionContext _localctx = new StateExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stateExpression);
		try {
			setState(409);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case KEY:
			case STATE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); name();
				setState(406); match(T__8);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(408); selectExpression();
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

	public static class SelectExpressionContext extends ParserRuleContext {
		public SelectExpressionContextExt extendedContext;
		public SelectCaseListContext selectCaseList() {
			return getRuleContext(SelectCaseListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(p416Parser.SELECT, 0); }
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(SELECT);
			setState(412); match(T__12);
			setState(413); expressionList(0);
			setState(414); match(T__19);
			setState(415); match(T__5);
			setState(416); selectCaseList();
			setState(417); match(T__2);
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

	public static class SelectCaseListContext extends ParserRuleContext {
		public SelectCaseListContextExt extendedContext;
		public SelectCaseContext selectCase(int i) {
			return getRuleContext(SelectCaseContext.class,i);
		}
		public List<SelectCaseContext> selectCase() {
			return getRuleContexts(SelectCaseContext.class);
		}
		public SelectCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSelectCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSelectCaseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSelectCaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCaseListContext selectCaseList() throws RecognitionException {
		SelectCaseListContext _localctx = new SelectCaseListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selectCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__17) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << Hex_number) | (1L << Decimal_number) | (1L << Octal_number) | (1L << Binary_number) | (1L << Real_number) | (1L << STRING) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << DEFAULT) | (1L << T_ERROR) | (1L << FALSE) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (THIS - 66)) | (1L << (TRUE - 66)) | (1L << (TUPLE - 66)) | (1L << (VARBIT - 66)) | (1L << (DONTCARE - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(419); selectCase();
				}
				}
				setState(424);
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

	public static class SelectCaseContext extends ParserRuleContext {
		public SelectCaseContextExt extendedContext;
		public KeysetExpressionContext keysetExpression() {
			return getRuleContext(KeysetExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SelectCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSelectCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSelectCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSelectCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectCaseContext selectCase() throws RecognitionException {
		SelectCaseContext _localctx = new SelectCaseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selectCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); keysetExpression();
			setState(426); match(T__13);
			setState(427); name();
			setState(428); match(T__8);
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

	public static class KeysetExpressionContext extends ParserRuleContext {
		public KeysetExpressionContextExt extendedContext;
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public TupleKeysetExpressionContext tupleKeysetExpression() {
			return getRuleContext(TupleKeysetExpressionContext.class,0);
		}
		public KeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keysetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterKeysetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitKeysetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitKeysetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysetExpressionContext keysetExpression() throws RecognitionException {
		KeysetExpressionContext _localctx = new KeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keysetExpression);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430); tupleKeysetExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431); simpleKeysetExpression();
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

	public static class TupleKeysetExpressionContext extends ParserRuleContext {
		public TupleKeysetExpressionContextExt extendedContext;
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public SimpleExpressionListContext simpleExpressionList() {
			return getRuleContext(SimpleExpressionListContext.class,0);
		}
		public TupleKeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleKeysetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTupleKeysetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTupleKeysetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTupleKeysetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleKeysetExpressionContext tupleKeysetExpression() throws RecognitionException {
		TupleKeysetExpressionContext _localctx = new TupleKeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tupleKeysetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(T__12);
			setState(435); simpleKeysetExpression();
			setState(436); match(T__18);
			setState(437); simpleExpressionList(0);
			setState(438); match(T__19);
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

	public static class SimpleExpressionListContext extends ParserRuleContext {
		public SimpleExpressionListContextExt extendedContext;
		public SimpleKeysetExpressionContext simpleKeysetExpression() {
			return getRuleContext(SimpleKeysetExpressionContext.class,0);
		}
		public SimpleExpressionListContext simpleExpressionList() {
			return getRuleContext(SimpleExpressionListContext.class,0);
		}
		public SimpleExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSimpleExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSimpleExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSimpleExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionListContext simpleExpressionList() throws RecognitionException {
		return simpleExpressionList(0);
	}

	private SimpleExpressionListContext simpleExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpressionListContext _localctx = new SimpleExpressionListContext(_ctx, _parentState);
		SimpleExpressionListContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_simpleExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(441); simpleKeysetExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpressionList);
					setState(443);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(444); match(T__18);
					setState(445); simpleKeysetExpression();
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class SimpleKeysetExpressionContext extends ParserRuleContext {
		public SimpleKeysetExpressionContextExt extendedContext;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(p416Parser.DEFAULT, 0); }
		public TerminalNode RANGE() { return getToken(p416Parser.RANGE, 0); }
		public TerminalNode DONTCARE() { return getToken(p416Parser.DONTCARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MASK() { return getToken(p416Parser.MASK, 0); }
		public SimpleKeysetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleKeysetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSimpleKeysetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSimpleKeysetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSimpleKeysetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleKeysetExpressionContext simpleKeysetExpression() throws RecognitionException {
		SimpleKeysetExpressionContext _localctx = new SimpleKeysetExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simpleKeysetExpression);
		try {
			setState(462);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452); expression(0);
				setState(453); match(MASK);
				setState(454); expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456); expression(0);
				setState(457); match(RANGE);
				setState(458); expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460); match(DEFAULT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461); match(DONTCARE);
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

	public static class ControlDeclarationContext extends ParserRuleContext {
		public ControlDeclarationContextExt extendedContext;
		public TerminalNode APPLY() { return getToken(p416Parser.APPLY, 0); }
		public ControlLocalDeclarationsContext controlLocalDeclarations() {
			return getRuleContext(ControlLocalDeclarationsContext.class,0);
		}
		public OptConstructorParametersContext optConstructorParameters() {
			return getRuleContext(OptConstructorParametersContext.class,0);
		}
		public ControlBodyContext controlBody() {
			return getRuleContext(ControlBodyContext.class,0);
		}
		public ControlTypeDeclarationContext controlTypeDeclaration() {
			return getRuleContext(ControlTypeDeclarationContext.class,0);
		}
		public ControlDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterControlDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitControlDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitControlDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlDeclarationContext controlDeclaration() throws RecognitionException {
		ControlDeclarationContext _localctx = new ControlDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_controlDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); controlTypeDeclaration();
			setState(465); optConstructorParameters();
			setState(466); match(T__5);
			setState(467); controlLocalDeclarations();
			setState(468); match(APPLY);
			setState(469); controlBody();
			setState(470); match(T__2);
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

	public static class ControlTypeDeclarationContext extends ParserRuleContext {
		public ControlTypeDeclarationContextExt extendedContext;
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode CONTROL() { return getToken(p416Parser.CONTROL, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ControlTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterControlTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitControlTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitControlTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlTypeDeclarationContext controlTypeDeclaration() throws RecognitionException {
		ControlTypeDeclarationContext _localctx = new ControlTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_controlTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); optAnnotations();
			setState(473); match(CONTROL);
			setState(474); name();
			setState(475); optTypeParameters();
			setState(476); match(T__12);
			setState(477); parameterList();
			setState(478); match(T__19);
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

	public static class ControlLocalDeclarationsContext extends ParserRuleContext {
		public ControlLocalDeclarationsContextExt extendedContext;
		public ControlLocalDeclarationContext controlLocalDeclaration(int i) {
			return getRuleContext(ControlLocalDeclarationContext.class,i);
		}
		public List<ControlLocalDeclarationContext> controlLocalDeclaration() {
			return getRuleContexts(ControlLocalDeclarationContext.class);
		}
		public ControlLocalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlLocalDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterControlLocalDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitControlLocalDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitControlLocalDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlLocalDeclarationsContext controlLocalDeclarations() throws RecognitionException {
		ControlLocalDeclarationsContext _localctx = new ControlLocalDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_controlLocalDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << ACTION) | (1L << BOOL) | (1L << BIT) | (1L << CONST) | (1L << T_ERROR) | (1L << INT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TABLE - 65)) | (1L << (TUPLE - 65)) | (1L << (VARBIT - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(480); controlLocalDeclaration();
				}
				}
				setState(485);
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

	public static class ControlLocalDeclarationContext extends ParserRuleContext {
		public ControlLocalDeclarationContextExt extendedContext;
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public TableDeclarationContext tableDeclaration() {
			return getRuleContext(TableDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ControlLocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlLocalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterControlLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitControlLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitControlLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlLocalDeclarationContext controlLocalDeclaration() throws RecognitionException {
		ControlLocalDeclarationContext _localctx = new ControlLocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_controlLocalDeclaration);
		try {
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487); actionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488); tableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489); instantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(490); variableDeclaration();
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

	public static class ControlBodyContext extends ParserRuleContext {
		public ControlBodyContextExt extendedContext;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ControlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterControlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitControlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitControlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlBodyContext controlBody() throws RecognitionException {
		ControlBodyContext _localctx = new ControlBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_controlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); blockStatement();
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

	public static class ExternDeclarationContext extends ParserRuleContext {
		public ExternDeclarationContextExt extendedContext;
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(p416Parser.EXTERN, 0); }
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public MethodPrototypesContext methodPrototypes() {
			return getRuleContext(MethodPrototypesContext.class,0);
		}
		public ExternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterExternDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitExternDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitExternDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternDeclarationContext externDeclaration() throws RecognitionException {
		ExternDeclarationContext _localctx = new ExternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_externDeclaration);
		try {
			setState(508);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495); optAnnotations();
				setState(496); match(EXTERN);
				setState(497); nonTypeName();
				setState(498); optTypeParameters();
				setState(499); match(T__5);
				setState(500); methodPrototypes();
				setState(501); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503); optAnnotations();
				setState(504); match(EXTERN);
				setState(505); functionPrototype();
				setState(506); match(T__8);
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

	public static class MethodPrototypesContext extends ParserRuleContext {
		public MethodPrototypesContextExt extendedContext;
		public MethodPrototypeContext methodPrototype(int i) {
			return getRuleContext(MethodPrototypeContext.class,i);
		}
		public List<MethodPrototypeContext> methodPrototype() {
			return getRuleContexts(MethodPrototypeContext.class);
		}
		public MethodPrototypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPrototypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterMethodPrototypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitMethodPrototypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitMethodPrototypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPrototypesContext methodPrototypes() throws RecognitionException {
		MethodPrototypesContext _localctx = new MethodPrototypesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_methodPrototypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << ABSTRACT) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TUPLE - 69)) | (1L << (VARBIT - 69)) | (1L << (VOID - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(510); methodPrototype();
				}
				}
				setState(515);
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

	public static class FunctionPrototypeContext extends ParserRuleContext {
		public FunctionPrototypeContextExt extendedContext;
		public OptTypeParametersContext optTypeParameters() {
			return getRuleContext(OptTypeParametersContext.class,0);
		}
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterFunctionPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitFunctionPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitFunctionPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionPrototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); typeOrVoid();
			setState(517); name();
			setState(518); optTypeParameters();
			setState(519); match(T__12);
			setState(520); parameterList();
			setState(521); match(T__19);
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

	public static class MethodPrototypeContext extends ParserRuleContext {
		public MethodPrototypeContextExt extendedContext;
		public TerminalNode IDENTIFIER() { return getToken(p416Parser.IDENTIFIER, 0); }
		public TerminalNode ABSTRACT() { return getToken(p416Parser.ABSTRACT, 0); }
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterMethodPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitMethodPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitMethodPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPrototypeContext methodPrototype() throws RecognitionException {
		MethodPrototypeContext _localctx = new MethodPrototypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_methodPrototype);
		try {
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523); functionPrototype();
				setState(524); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526); match(ABSTRACT);
				setState(527); functionPrototype();
				setState(528); match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530); match(IDENTIFIER);
				setState(531); match(T__12);
				setState(532); parameterList();
				setState(533); match(T__19);
				setState(534); match(T__8);
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

	public static class TypeRefContext extends ParserRuleContext {
		public TypeRefContextExt extendedContext;
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SpecializedTypeContext specializedType() {
			return getRuleContext(SpecializedTypeContext.class,0);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public HeaderStackTypeContext headerStackType() {
			return getRuleContext(HeaderStackTypeContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeRef);
		try {
			setState(543);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538); baseType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539); typeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540); specializedType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541); headerStackType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542); tupleType();
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

	public static class PrefixedTypeContext extends ParserRuleContext {
		public PrefixedTypeContextExt extendedContext;
		public DotPrefixContext dotPrefix() {
			return getRuleContext(DotPrefixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(p416Parser.IDENTIFIER, 0); }
		public TerminalNode T_ERROR() { return getToken(p416Parser.T_ERROR, 0); }
		public PrefixedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterPrefixedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitPrefixedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitPrefixedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedTypeContext prefixedType() throws RecognitionException {
		PrefixedTypeContext _localctx = new PrefixedTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_prefixedType);
		try {
			setState(550);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(545); match(IDENTIFIER);
				}
				break;
			case T_ERROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(546); match(T_ERROR);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(547); dotPrefix();
				setState(548); match(IDENTIFIER);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContextExt extendedContext;
		public PrefixedTypeContext prefixedType() {
			return getRuleContext(PrefixedTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); prefixedType();
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

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleTypeContextExt extendedContext;
		public TerminalNode TUPLE() { return getToken(p416Parser.TUPLE, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tupleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); match(TUPLE);
			setState(555); match(T__10);
			setState(556); typeArgumentList(0);
			setState(557); match(T__6);
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

	public static class HeaderStackTypeContext extends ParserRuleContext {
		public HeaderStackTypeContextExt extendedContext;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeaderStackTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerStackType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterHeaderStackType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitHeaderStackType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitHeaderStackType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderStackTypeContext headerStackType() throws RecognitionException {
		HeaderStackTypeContext _localctx = new HeaderStackTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_headerStackType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); typeName();
			setState(560); match(T__16);
			setState(561); expression(0);
			setState(562); match(T__24);
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

	public static class SpecializedTypeContext extends ParserRuleContext {
		public SpecializedTypeContextExt extendedContext;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public SpecializedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specializedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSpecializedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSpecializedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSpecializedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecializedTypeContext specializedType() throws RecognitionException {
		SpecializedTypeContext _localctx = new SpecializedTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_specializedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); typeName();
			setState(565); match(T__10);
			setState(566); typeArgumentList(0);
			setState(567); match(T__6);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public BaseTypeContextExt extendedContext;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BIT() { return getToken(p416Parser.BIT, 0); }
		public TerminalNode BOOL() { return getToken(p416Parser.BOOL, 0); }
		public TerminalNode INT() { return getToken(p416Parser.INT, 0); }
		public TerminalNode VARBIT() { return getToken(p416Parser.VARBIT, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_baseType);
		try {
			setState(586);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569); match(BOOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570); match(BIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571); match(BIT);
				setState(572); match(T__10);
				setState(573); number();
				setState(574); match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576); match(INT);
				setState(577); match(T__10);
				setState(578); number();
				setState(579); match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581); match(VARBIT);
				setState(582); match(T__10);
				setState(583); number();
				setState(584); match(T__6);
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

	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeOrVoidContextExt extendedContext;
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode VOID() { return getToken(p416Parser.VOID, 0); }
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeOrVoid);
		try {
			setState(591);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588); typeRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589); match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(590); nonTypeName();
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

	public static class OptTypeParametersContext extends ParserRuleContext {
		public OptTypeParametersContextExt extendedContext;
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public OptTypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optTypeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterOptTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitOptTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitOptTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptTypeParametersContext optTypeParameters() throws RecognitionException {
		OptTypeParametersContext _localctx = new OptTypeParametersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_optTypeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(593); match(T__10);
				setState(594); typeParameterList(0);
				setState(595); match(T__6);
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

	public static class TypeParameterListContext extends ParserRuleContext {
		public TypeParameterListContextExt extendedContext;
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		return typeParameterList(0);
	}

	private TypeParameterListContext typeParameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, _parentState);
		TypeParameterListContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_typeParameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(600); name();
			}
			_ctx.stop = _input.LT(-1);
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeParameterList);
					setState(602);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(603); match(T__18);
					setState(604); name();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class TypeArgContext extends ParserRuleContext {
		public TypeArgContextExt extendedContext;
		public TerminalNode DONTCARE() { return getToken(p416Parser.DONTCARE, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TypeArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgContext typeArg() throws RecognitionException {
		TypeArgContext _localctx = new TypeArgContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeArg);
		try {
			setState(612);
			switch (_input.LA(1)) {
			case T__20:
			case BOOL:
			case BIT:
			case T_ERROR:
			case INT:
			case TUPLE:
			case VARBIT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); typeRef();
				}
				break;
			case DONTCARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); match(DONTCARE);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TypeArgumentListContextExt extendedContext;
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgContext typeArg() {
			return getRuleContext(TypeArgContext.class,0);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		return typeArgumentList(0);
	}

	private TypeArgumentListContext typeArgumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, _parentState);
		TypeArgumentListContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_typeArgumentList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(615); typeArg();
			}
			_ctx.stop = _input.LT(-1);
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeArgumentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeArgumentList);
					setState(617);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(618); match(T__18);
					setState(619); typeArg();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContextExt extendedContext;
		public ParserTypeDeclarationContext parserTypeDeclaration() {
			return getRuleContext(ParserTypeDeclarationContext.class,0);
		}
		public DerivedTypeDeclarationContext derivedTypeDeclaration() {
			return getRuleContext(DerivedTypeDeclarationContext.class,0);
		}
		public PackageTypeDeclarationContext packageTypeDeclaration() {
			return getRuleContext(PackageTypeDeclarationContext.class,0);
		}
		public TypedefDeclarationContext typedefDeclaration() {
			return getRuleContext(TypedefDeclarationContext.class,0);
		}
		public ControlTypeDeclarationContext controlTypeDeclaration() {
			return getRuleContext(ControlTypeDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeDeclaration);
		try {
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625); derivedTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626); typedefDeclaration();
				setState(627); match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629); parserTypeDeclaration();
				setState(630); match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632); controlTypeDeclaration();
				setState(633); match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(635); packageTypeDeclaration();
				setState(636); match(T__8);
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

	public static class DerivedTypeDeclarationContext extends ParserRuleContext {
		public DerivedTypeDeclarationContextExt extendedContext;
		public HeaderUnionDeclarationContext headerUnionDeclaration() {
			return getRuleContext(HeaderUnionDeclarationContext.class,0);
		}
		public StructTypeDeclarationContext structTypeDeclaration() {
			return getRuleContext(StructTypeDeclarationContext.class,0);
		}
		public HeaderTypeDeclarationContext headerTypeDeclaration() {
			return getRuleContext(HeaderTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public DerivedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterDerivedTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitDerivedTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitDerivedTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivedTypeDeclarationContext derivedTypeDeclaration() throws RecognitionException {
		DerivedTypeDeclarationContext _localctx = new DerivedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_derivedTypeDeclaration);
		try {
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640); headerTypeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); headerUnionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(642); structTypeDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(643); enumDeclaration();
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

	public static class HeaderTypeDeclarationContext extends ParserRuleContext {
		public HeaderTypeDeclarationContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode HEADER() { return getToken(p416Parser.HEADER, 0); }
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public HeaderTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterHeaderTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitHeaderTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitHeaderTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderTypeDeclarationContext headerTypeDeclaration() throws RecognitionException {
		HeaderTypeDeclarationContext _localctx = new HeaderTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_headerTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); optAnnotations();
			setState(647); match(HEADER);
			setState(648); name();
			setState(649); match(T__5);
			setState(650); structFieldList();
			setState(651); match(T__2);
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

	public static class StructTypeDeclarationContext extends ParserRuleContext {
		public StructTypeDeclarationContextExt extendedContext;
		public TerminalNode STRUCT() { return getToken(p416Parser.STRUCT, 0); }
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StructTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStructTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStructTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStructTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeDeclarationContext structTypeDeclaration() throws RecognitionException {
		StructTypeDeclarationContext _localctx = new StructTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_structTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); optAnnotations();
			setState(654); match(STRUCT);
			setState(655); name();
			setState(656); match(T__5);
			setState(657); structFieldList();
			setState(658); match(T__2);
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

	public static class HeaderUnionDeclarationContext extends ParserRuleContext {
		public HeaderUnionDeclarationContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode HEADER_UNION() { return getToken(p416Parser.HEADER_UNION, 0); }
		public StructFieldListContext structFieldList() {
			return getRuleContext(StructFieldListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public HeaderUnionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerUnionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterHeaderUnionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitHeaderUnionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitHeaderUnionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderUnionDeclarationContext headerUnionDeclaration() throws RecognitionException {
		HeaderUnionDeclarationContext _localctx = new HeaderUnionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_headerUnionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); optAnnotations();
			setState(661); match(HEADER_UNION);
			setState(662); name();
			setState(663); match(T__5);
			setState(664); structFieldList();
			setState(665); match(T__2);
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

	public static class StructFieldListContext extends ParserRuleContext {
		public StructFieldListContextExt extendedContext;
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStructFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStructFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStructFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldListContext structFieldList() throws RecognitionException {
		StructFieldListContext _localctx = new StructFieldListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_structFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << INT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (TUPLE - 69)) | (1L << (VARBIT - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				{
				setState(667); structField();
				}
				}
				setState(672);
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

	public static class StructFieldContext extends ParserRuleContext {
		public StructFieldContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); optAnnotations();
			setState(674); typeRef();
			setState(675); name();
			setState(676); match(T__8);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContextExt extendedContext;
		public TerminalNode ENUM() { return getToken(p416Parser.ENUM, 0); }
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_enumDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); optAnnotations();
			setState(679); match(ENUM);
			setState(680); name();
			setState(681); match(T__5);
			setState(682); identifierList(0);
			setState(683); match(T__2);
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

	public static class ErrorDeclarationContext extends ParserRuleContext {
		public ErrorDeclarationContextExt extendedContext;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode T_ERROR() { return getToken(p416Parser.T_ERROR, 0); }
		public ErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterErrorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitErrorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitErrorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorDeclarationContext errorDeclaration() throws RecognitionException {
		ErrorDeclarationContext _localctx = new ErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_errorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685); match(T_ERROR);
			setState(686); match(T__5);
			setState(687); identifierList(0);
			setState(688); match(T__2);
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

	public static class MatchKindDeclarationContext extends ParserRuleContext {
		public MatchKindDeclarationContextExt extendedContext;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode MATCH_KIND() { return getToken(p416Parser.MATCH_KIND, 0); }
		public MatchKindDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchKindDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterMatchKindDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitMatchKindDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitMatchKindDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchKindDeclarationContext matchKindDeclaration() throws RecognitionException {
		MatchKindDeclarationContext _localctx = new MatchKindDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_matchKindDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); match(MATCH_KIND);
			setState(691); match(T__5);
			setState(692); identifierList(0);
			setState(693); match(T__2);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierListContextExt extendedContext;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(696); name();
			}
			_ctx.stop = _input.LT(-1);
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(698);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(699); match(T__18);
					setState(700); name();
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class TypedefDeclarationContext extends ParserRuleContext {
		public TypedefDeclarationContextExt extendedContext;
		public TerminalNode TYPEDEF() { return getToken(p416Parser.TYPEDEF, 0); }
		public DerivedTypeDeclarationContext derivedTypeDeclaration() {
			return getRuleContext(DerivedTypeDeclarationContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypedefDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTypedefDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTypedefDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTypedefDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefDeclarationContext typedefDeclaration() throws RecognitionException {
		TypedefDeclarationContext _localctx = new TypedefDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typedefDeclaration);
		try {
			setState(724);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706); annotations(0);
				setState(707); match(TYPEDEF);
				setState(708); typeRef();
				setState(709); name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711); match(TYPEDEF);
				setState(712); typeRef();
				setState(713); name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715); annotations(0);
				setState(716); match(TYPEDEF);
				setState(717); derivedTypeDeclaration();
				setState(718); name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(720); match(TYPEDEF);
				setState(721); derivedTypeDeclaration();
				setState(722); name();
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

	public static class AssignmentOrMethodCallStatementContext extends ParserRuleContext {
		public AssignmentOrMethodCallStatementContextExt extendedContext;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOrMethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOrMethodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterAssignmentOrMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitAssignmentOrMethodCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitAssignmentOrMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() throws RecognitionException {
		AssignmentOrMethodCallStatementContext _localctx = new AssignmentOrMethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assignmentOrMethodCallStatement);
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726); lvalue(0);
				setState(727); match(T__12);
				setState(728); argumentList();
				setState(729); match(T__19);
				setState(730); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732); lvalue(0);
				setState(733); match(T__10);
				setState(734); typeArgumentList(0);
				setState(735); match(T__6);
				setState(736); match(T__12);
				setState(737); argumentList();
				setState(738); match(T__19);
				setState(739); match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741); lvalue(0);
				setState(742); match(T__9);
				setState(743); expression(0);
				setState(744); match(T__8);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContextExt extendedContext;
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); match(T__8);
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

	public static class ExitStatementContext extends ParserRuleContext {
		public ExitStatementContextExt extendedContext;
		public TerminalNode EXIT() { return getToken(p416Parser.EXIT, 0); }
		public ExitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterExitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitExitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitExitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStatementContext exitStatement() throws RecognitionException {
		ExitStatementContext _localctx = new ExitStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); match(EXIT);
			setState(751); match(T__8);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContextExt extendedContext;
		public TerminalNode RETURN() { return getToken(p416Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_returnStatement);
		try {
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753); match(RETURN);
				setState(754); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755); match(RETURN);
				setState(756); expression(0);
				setState(757); match(T__8);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public ConditionalStatementContextExt extendedContext;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(p416Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(p416Parser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_conditionalStatement);
		try {
			setState(775);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761); match(IF);
				setState(762); match(T__12);
				setState(763); expression(0);
				setState(764); match(T__19);
				setState(765); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); match(IF);
				setState(768); match(T__12);
				setState(769); expression(0);
				setState(770); match(T__19);
				setState(771); statement();
				setState(772); match(ELSE);
				setState(773); statement();
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContextExt extendedContext;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentOrMethodCallStatementContext assignmentOrMethodCallStatement() {
			return getRuleContext(AssignmentOrMethodCallStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statement);
		try {
			setState(784);
			switch (_input.LA(1)) {
			case T__20:
			case ACTIONS:
			case APPLY:
			case KEY:
			case STATE:
			case THIS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(777); assignmentOrMethodCallStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(778); conditionalStatement();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(779); emptyStatement();
				}
				break;
			case T__11:
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(780); blockStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(781); returnStatement();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(782); exitStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 7);
				{
				setState(783); switchStatement();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContextExt extendedContext;
		public StatOrDeclListContext statOrDeclList() {
			return getRuleContext(StatOrDeclListContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786); optAnnotations();
			setState(787); match(T__5);
			setState(788); statOrDeclList();
			setState(789); match(T__2);
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

	public static class StatOrDeclListContext extends ParserRuleContext {
		public StatOrDeclListContextExt extendedContext;
		public StatementOrDeclarationContext statementOrDeclaration(int i) {
			return getRuleContext(StatementOrDeclarationContext.class,i);
		}
		public List<StatementOrDeclarationContext> statementOrDeclaration() {
			return getRuleContexts(StatementOrDeclarationContext.class);
		}
		public StatOrDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statOrDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStatOrDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStatOrDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStatOrDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatOrDeclListContext statOrDeclList() throws RecognitionException {
		StatOrDeclListContext _localctx = new StatOrDeclListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_statOrDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__11) | (1L << T__8) | (1L << T__5) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << CONST) | (1L << T_ERROR) | (1L << EXIT) | (1L << IF) | (1L << INT) | (1L << KEY) | (1L << RETURN) | (1L << STATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (TUPLE - 64)) | (1L << (VARBIT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(791); statementOrDeclaration();
				}
				}
				setState(796);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatementContextExt extendedContext;
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(p416Parser.SWITCH, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(SWITCH);
			setState(798); match(T__12);
			setState(799); expression(0);
			setState(800); match(T__19);
			setState(801); match(T__5);
			setState(802); switchCases();
			setState(803); match(T__2);
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

	public static class SwitchCasesContext extends ParserRuleContext {
		public SwitchCasesContextExt extendedContext;
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSwitchCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSwitchCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ACTIONS - 36)) | (1L << (APPLY - 36)) | (1L << (DEFAULT - 36)) | (1L << (KEY - 36)) | (1L << (STATE - 36)) | (1L << (IDENTIFIER - 36)))) != 0)) {
				{
				{
				setState(805); switchCase();
				}
				}
				setState(810);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchCaseContextExt extendedContext;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SwitchLabelContext switchLabel() {
			return getRuleContext(SwitchLabelContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchCase);
		try {
			setState(818);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811); switchLabel();
				setState(812); match(T__13);
				setState(813); blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815); switchLabel();
				setState(816); match(T__13);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public SwitchLabelContextExt extendedContext;
		public TerminalNode DEFAULT() { return getToken(p416Parser.DEFAULT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_switchLabel);
		try {
			setState(822);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case KEY:
			case STATE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(820); name();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(821); match(DEFAULT);
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

	public static class StatementOrDeclarationContext extends ParserRuleContext {
		public StatementOrDeclarationContextExt extendedContext;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementOrDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterStatementOrDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitStatementOrDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitStatementOrDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOrDeclarationContext statementOrDeclaration() throws RecognitionException {
		StatementOrDeclarationContext _localctx = new StatementOrDeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_statementOrDeclaration);
		try {
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824); variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825); constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(827); instantiation();
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

	public static class TableDeclarationContext extends ParserRuleContext {
		public TableDeclarationContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(p416Parser.TABLE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDeclarationContext tableDeclaration() throws RecognitionException {
		TableDeclarationContext _localctx = new TableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tableDeclaration);
		try {
			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830); optAnnotations();
				setState(831); match(TABLE);
				setState(832); name();
				setState(833); match(T__12);
				setState(834); parameterList();
				setState(835); match(T__19);
				setState(836); match(T__5);
				setState(837); tablePropertyList(0);
				setState(838); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840); optAnnotations();
				setState(841); match(TABLE);
				setState(842); name();
				setState(843); match(T__5);
				setState(844); tablePropertyList(0);
				setState(845); match(T__2);
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public TablePropertyListContextExt extendedContext;
		public TablePropertyContext tableProperty() {
			return getRuleContext(TablePropertyContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		return tablePropertyList(0);
	}

	private TablePropertyListContext tablePropertyList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, _parentState);
		TablePropertyListContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_tablePropertyList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(850); tableProperty();
			}
			_ctx.stop = _input.LT(-1);
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TablePropertyListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tablePropertyList);
					setState(852);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(853); tableProperty();
					}
					} 
				}
				setState(858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyContextExt extendedContext;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ActionListContext actionList() {
			return getRuleContext(ActionListContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(p416Parser.IDENTIFIER, 0); }
		public TerminalNode KEY() { return getToken(p416Parser.KEY, 0); }
		public TerminalNode CONST() { return getToken(p416Parser.CONST, 0); }
		public TerminalNode ACTIONS() { return getToken(p416Parser.ACTIONS, 0); }
		public KeyElementListContext keyElementList() {
			return getRuleContext(KeyElementListContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tableProperty);
		try {
			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859); match(KEY);
				setState(860); match(T__9);
				setState(861); match(T__5);
				setState(862); keyElementList();
				setState(863); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865); match(ACTIONS);
				setState(866); match(T__9);
				setState(867); match(T__5);
				setState(868); actionList(0);
				setState(869); match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(871); optAnnotations();
				setState(872); match(CONST);
				setState(873); match(IDENTIFIER);
				setState(874); match(T__9);
				setState(875); initializer();
				setState(876); match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878); optAnnotations();
				setState(879); match(IDENTIFIER);
				setState(880); match(T__9);
				setState(881); initializer();
				setState(882); match(T__8);
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

	public static class KeyElementListContext extends ParserRuleContext {
		public KeyElementListContextExt extendedContext;
		public List<KeyElementContext> keyElement() {
			return getRuleContexts(KeyElementContext.class);
		}
		public KeyElementContext keyElement(int i) {
			return getRuleContext(KeyElementContext.class,i);
		}
		public KeyElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterKeyElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitKeyElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitKeyElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyElementListContext keyElementList() throws RecognitionException {
		KeyElementListContext _localctx = new KeyElementListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_keyElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__17) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << Hex_number) | (1L << Decimal_number) | (1L << Octal_number) | (1L << Binary_number) | (1L << Real_number) | (1L << STRING) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << FALSE) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (THIS - 66)) | (1L << (TRUE - 66)) | (1L << (TUPLE - 66)) | (1L << (VARBIT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(886); keyElement();
				}
				}
				setState(891);
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

	public static class KeyElementContext extends ParserRuleContext {
		public KeyElementContextExt extendedContext;
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public KeyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterKeyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitKeyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitKeyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyElementContext keyElement() throws RecognitionException {
		KeyElementContext _localctx = new KeyElementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_keyElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892); expression(0);
			setState(893); match(T__13);
			setState(894); name();
			setState(895); optAnnotations();
			setState(896); match(T__8);
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

	public static class ActionListContext extends ParserRuleContext {
		public ActionListContextExt extendedContext;
		public ActionRefContext actionRef() {
			return getRuleContext(ActionRefContext.class,0);
		}
		public ActionListContext actionList() {
			return getRuleContext(ActionListContext.class,0);
		}
		public ActionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterActionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitActionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitActionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionListContext actionList() throws RecognitionException {
		return actionList(0);
	}

	private ActionListContext actionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionListContext _localctx = new ActionListContext(_ctx, _parentState);
		ActionListContext _prevctx = _localctx;
		int _startState = 174;
		enterRecursionRule(_localctx, 174, RULE_actionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(899); actionRef();
			setState(900); match(T__8);
			}
			_ctx.stop = _input.LT(-1);
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_actionList);
					setState(902);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(903); actionRef();
					setState(904); match(T__8);
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class ActionRefContext extends ParserRuleContext {
		public ActionRefContextExt extendedContext;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ActionRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterActionRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitActionRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitActionRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionRefContext actionRef() throws RecognitionException {
		ActionRefContext _localctx = new ActionRefContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_actionRef);
		try {
			setState(920);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(911); optAnnotations();
				setState(912); name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914); optAnnotations();
				setState(915); name();
				setState(916); match(T__12);
				setState(917); argumentList();
				setState(918); match(T__19);
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

	public static class ActionDeclarationContext extends ParserRuleContext {
		public ActionDeclarationContextExt extendedContext;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(p416Parser.ACTION, 0); }
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterActionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitActionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitActionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_actionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); optAnnotations();
			setState(923); match(ACTION);
			setState(924); name();
			setState(925); match(T__12);
			setState(926); parameterList();
			setState(927); match(T__19);
			setState(928); blockStatement();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContextExt extendedContext;
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public OptInitializerContext optInitializer() {
			return getRuleContext(OptInitializerContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_variableDeclaration);
		try {
			setState(941);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(930); annotations(0);
				setState(931); typeRef();
				setState(932); name();
				setState(933); optInitializer();
				setState(934); match(T__8);
				}
				break;
			case T__20:
			case BOOL:
			case BIT:
			case T_ERROR:
			case INT:
			case TUPLE:
			case VARBIT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(936); typeRef();
				setState(937); name();
				setState(938); optInitializer();
				setState(939); match(T__8);
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

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContextExt extendedContext;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptAnnotationsContext optAnnotations() {
			return getRuleContext(OptAnnotationsContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode CONST() { return getToken(p416Parser.CONST, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constantDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); optAnnotations();
			setState(944); match(CONST);
			setState(945); typeRef();
			setState(946); name();
			setState(947); match(T__9);
			setState(948); initializer();
			setState(949); match(T__8);
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

	public static class OptInitializerContext extends ParserRuleContext {
		public OptInitializerContextExt extendedContext;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterOptInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitOptInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitOptInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptInitializerContext optInitializer() throws RecognitionException {
		OptInitializerContext _localctx = new OptInitializerContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_optInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(951); match(T__9);
				setState(952); initializer();
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

	public static class InitializerContext extends ParserRuleContext {
		public InitializerContextExt extendedContext;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); expression(0);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContextExt extendedContext;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957); functionPrototype();
			setState(958); blockStatement();
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContextExt extendedContext;
		public NonEmptyArgListContext nonEmptyArgList() {
			return getRuleContext(NonEmptyArgListContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__17) | (1L << T__15) | (1L << T__12) | (1L << T__5) | (1L << T__3) | (1L << T__0) | (1L << Hex_number) | (1L << Decimal_number) | (1L << Octal_number) | (1L << Binary_number) | (1L << Real_number) | (1L << STRING) | (1L << ACTIONS) | (1L << APPLY) | (1L << BOOL) | (1L << BIT) | (1L << T_ERROR) | (1L << FALSE) | (1L << INT) | (1L << KEY) | (1L << STATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (THIS - 66)) | (1L << (TRUE - 66)) | (1L << (TUPLE - 66)) | (1L << (VARBIT - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(960); nonEmptyArgList(0);
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

	public static class NonEmptyArgListContext extends ParserRuleContext {
		public NonEmptyArgListContextExt extendedContext;
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public NonEmptyArgListContext nonEmptyArgList() {
			return getRuleContext(NonEmptyArgListContext.class,0);
		}
		public NonEmptyArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterNonEmptyArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitNonEmptyArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitNonEmptyArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonEmptyArgListContext nonEmptyArgList() throws RecognitionException {
		return nonEmptyArgList(0);
	}

	private NonEmptyArgListContext nonEmptyArgList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NonEmptyArgListContext _localctx = new NonEmptyArgListContext(_ctx, _parentState);
		NonEmptyArgListContext _prevctx = _localctx;
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_nonEmptyArgList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(964); argument();
			}
			_ctx.stop = _input.LT(-1);
			setState(971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NonEmptyArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nonEmptyArgList);
					setState(966);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(967); match(T__18);
					setState(968); argument();
					}
					} 
				}
				setState(973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContextExt extendedContext;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); expression(0);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContextExt extendedContext;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		return expressionList(0);
	}

	private ExpressionListContext expressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, _parentState);
		ExpressionListContext _prevctx = _localctx;
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_expressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(977); expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionList);
					setState(979);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(980); match(T__18);
					setState(981); expression(0);
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class PrefixedNonTypeNameContext extends ParserRuleContext {
		public PrefixedNonTypeNameContextExt extendedContext;
		public DotPrefixContext dotPrefix() {
			return getRuleContext(DotPrefixContext.class,0);
		}
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public PrefixedNonTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixedNonTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterPrefixedNonTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitPrefixedNonTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitPrefixedNonTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixedNonTypeNameContext prefixedNonTypeName() throws RecognitionException {
		PrefixedNonTypeNameContext _localctx = new PrefixedNonTypeNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_prefixedNonTypeName);
		try {
			setState(991);
			switch (_input.LA(1)) {
			case ACTIONS:
			case APPLY:
			case KEY:
			case STATE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(987); nonTypeName();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); dotPrefix();
				setState(989); nonTypeName();
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

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContextExt extendedContext;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PrefixedNonTypeNameContext prefixedNonTypeName() {
			return getRuleContext(PrefixedNonTypeNameContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode THIS() { return getToken(p416Parser.THIS, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 200;
		enterRecursionRule(_localctx, 200, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			switch (_input.LA(1)) {
			case T__20:
			case ACTIONS:
			case APPLY:
			case KEY:
			case STATE:
			case IDENTIFIER:
				{
				setState(994); prefixedNonTypeName();
				}
				break;
			case THIS:
				{
				setState(995); match(THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1013);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(998);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(999); match(T__20);
						setState(1000); name();
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1001);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1002); match(T__16);
						setState(1003); expression(0);
						setState(1004); match(T__24);
						}
						break;
					case 3:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(1006);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1007); match(T__16);
						setState(1008); expression(0);
						setState(1009); match(T__13);
						setState(1010); expression(0);
						setState(1011); match(T__24);
						}
						break;
					}
					} 
				}
				setState(1017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContextExt extendedContext;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SHL() { return getToken(p416Parser.SHL, 0); }
		public TerminalNode TRUE() { return getToken(p416Parser.TRUE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode AND() { return getToken(p416Parser.AND, 0); }
		public TerminalNode OR() { return getToken(p416Parser.OR, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode LE() { return getToken(p416Parser.LE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PP() { return getToken(p416Parser.PP, 0); }
		public TerminalNode EQ() { return getToken(p416Parser.EQ, 0); }
		public TerminalNode GE() { return getToken(p416Parser.GE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NonTypeNameContext nonTypeName() {
			return getRuleContext(NonTypeNameContext.class,0);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode NE() { return getToken(p416Parser.NE, 0); }
		public TerminalNode T_ERROR() { return getToken(p416Parser.T_ERROR, 0); }
		public TerminalNode STRING() { return getToken(p416Parser.STRING, 0); }
		public TerminalNode FALSE() { return getToken(p416Parser.FALSE, 0); }
		public TerminalNode THIS() { return getToken(p416Parser.THIS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1019); match(T__0);
				setState(1020); expression(31);
				}
				break;
			case 2:
				{
				setState(1021); match(T__3);
				setState(1022); expression(30);
				}
				break;
			case 3:
				{
				setState(1023); match(T__15);
				setState(1024); expression(29);
				}
				break;
			case 4:
				{
				setState(1025); match(T__17);
				setState(1026); expression(28);
				}
				break;
			case 5:
				{
				setState(1027); match(T__12);
				setState(1028); typeRef();
				setState(1029); match(T__19);
				setState(1030); expression(1);
				}
				break;
			case 6:
				{
				setState(1032); number();
				}
				break;
			case 7:
				{
				setState(1033); match(STRING);
				}
				break;
			case 8:
				{
				setState(1034); match(TRUE);
				}
				break;
			case 9:
				{
				setState(1035); match(FALSE);
				}
				break;
			case 10:
				{
				setState(1036); match(THIS);
				}
				break;
			case 11:
				{
				setState(1037); nonTypeName();
				}
				break;
			case 12:
				{
				setState(1038); match(T__20);
				setState(1039); nonTypeName();
				}
				break;
			case 13:
				{
				setState(1040); match(T__5);
				setState(1041); expressionList(0);
				setState(1042); match(T__2);
				}
				break;
			case 14:
				{
				setState(1044); match(T__12);
				setState(1045); expression(0);
				setState(1046); match(T__19);
				}
				break;
			case 15:
				{
				setState(1048); typeName();
				setState(1049); match(T__20);
				setState(1050); name();
				}
				break;
			case 16:
				{
				setState(1052); match(T_ERROR);
				setState(1053); match(T__20);
				setState(1054); name();
				}
				break;
			case 17:
				{
				setState(1055); typeRef();
				setState(1056); match(T__12);
				setState(1057); argumentList();
				setState(1058); match(T__19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1154);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1062);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1063); match(T__14);
						setState(1064); expression(25);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1065);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1066); match(T__4);
						setState(1067); expression(24);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1068);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1069); match(T__23);
						setState(1070); expression(23);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1071);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1072); match(T__17);
						setState(1073); expression(22);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1074);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1075); match(T__15);
						setState(1076); expression(21);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1077);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1078); match(SHL);
						setState(1079); expression(20);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1080);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1081); match(T__6);
						setState(1082); match(T__6);
						setState(1083); expression(19);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1084);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1085); match(LE);
						setState(1086); expression(18);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1087);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1088); match(GE);
						setState(1089); expression(17);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1090);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1091); match(T__10);
						setState(1092); expression(16);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1093);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1094); match(T__6);
						setState(1095); expression(15);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1096);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1097); match(NE);
						setState(1098); expression(14);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1099);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1100); match(EQ);
						setState(1101); expression(13);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1102);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1103); match(T__22);
						setState(1104); expression(12);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1105);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1106); match(T__21);
						setState(1107); expression(11);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1109); match(T__1);
						setState(1110); expression(10);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1112); match(PP);
						setState(1113); expression(9);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1115); match(AND);
						setState(1116); expression(8);
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1118); match(OR);
						setState(1119); expression(7);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1121); match(T__7);
						setState(1122); expression(0);
						setState(1123); match(T__13);
						setState(1124); expression(6);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1127); match(T__16);
						setState(1128); expression(0);
						setState(1129); match(T__24);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1132); match(T__16);
						setState(1133); expression(0);
						setState(1134); match(T__13);
						setState(1135); expression(0);
						setState(1136); match(T__24);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1139); match(T__20);
						setState(1140); name();
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1142); match(T__10);
						setState(1143); typeArgumentList(0);
						setState(1144); match(T__6);
						setState(1145); match(T__12);
						setState(1146); argumentList();
						setState(1147); match(T__19);
						}
						break;
					case 25:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1150); match(T__12);
						setState(1151); argumentList();
						setState(1152); match(T__19);
						}
						break;
					}
					} 
				}
				setState(1158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContextExt extendedContext;
		public TerminalNode Real_number() { return getToken(p416Parser.Real_number, 0); }
		public TerminalNode Octal_number() { return getToken(p416Parser.Octal_number, 0); }
		public TerminalNode Decimal_number() { return getToken(p416Parser.Decimal_number, 0); }
		public TerminalNode Binary_number() { return getToken(p416Parser.Binary_number, 0); }
		public TerminalNode Hex_number() { return getToken(p416Parser.Hex_number, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof p416Listener ) ((p416Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof p416Visitor ) return ((p416Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hex_number) | (1L << Decimal_number) | (1L << Octal_number) | (1L << Binary_number) | (1L << Real_number))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 5: return annotations_sempred((AnnotationsContext)_localctx, predIndex);
		case 8: return nonEmptyParameterList_sempred((NonEmptyParameterListContext)_localctx, predIndex);
		case 22: return parserStates_sempred((ParserStatesContext)_localctx, predIndex);
		case 34: return simpleExpressionList_sempred((SimpleExpressionListContext)_localctx, predIndex);
		case 54: return typeParameterList_sempred((TypeParameterListContext)_localctx, predIndex);
		case 56: return typeArgumentList_sempred((TypeArgumentListContext)_localctx, predIndex);
		case 67: return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 83: return tablePropertyList_sempred((TablePropertyListContext)_localctx, predIndex);
		case 87: return actionList_sempred((ActionListContext)_localctx, predIndex);
		case 96: return nonEmptyArgList_sempred((NonEmptyArgListContext)_localctx, predIndex);
		case 98: return expressionList_sempred((ExpressionListContext)_localctx, predIndex);
		case 100: return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 101: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: return precpred(_ctx, 35);
		case 35: return precpred(_ctx, 34);
		case 32: return precpred(_ctx, 6);
		case 33: return precpred(_ctx, 5);
		case 38: return precpred(_ctx, 3);
		case 36: return precpred(_ctx, 25);
		case 37: return precpred(_ctx, 4);
		case 14: return precpred(_ctx, 24);
		case 15: return precpred(_ctx, 23);
		case 17: return precpred(_ctx, 21);
		case 16: return precpred(_ctx, 22);
		case 19: return precpred(_ctx, 19);
		case 18: return precpred(_ctx, 20);
		case 21: return precpred(_ctx, 17);
		case 20: return precpred(_ctx, 18);
		case 23: return precpred(_ctx, 15);
		case 22: return precpred(_ctx, 16);
		case 25: return precpred(_ctx, 13);
		case 24: return precpred(_ctx, 14);
		case 27: return precpred(_ctx, 11);
		case 26: return precpred(_ctx, 12);
		case 29: return precpred(_ctx, 9);
		case 28: return precpred(_ctx, 10);
		case 31: return precpred(_ctx, 7);
		case 30: return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean tablePropertyList_sempred(TablePropertyListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return precpred(_ctx, 3);
		case 12: return precpred(_ctx, 2);
		case 13: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nonEmptyParameterList_sempred(NonEmptyParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionList_sempred(ExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeParameterList_sempred(TypeParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpressionList_sempred(SimpleExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean annotations_sempred(AnnotationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean actionList_sempred(ActionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nonEmptyArgList_sempred(NonEmptyArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parserStates_sempred(ParserStatesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeArgumentList_sempred(TypeArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u048c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\7\2\u00d3"+
		"\n\2\f\2\16\2\u00d6\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e1"+
		"\n\3\3\4\3\4\3\5\3\5\5\5\u00e7\n\5\3\6\5\6\u00ea\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00f1\n\7\f\7\16\7\u00f4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00fe\n\b\3\t\5\t\u0101\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0109\n\n\f"+
		"\n\16\n\u010c\13\n\3\13\3\13\3\13\3\13\3\13\3\f\5\f\u0114\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0140\n\16"+
		"\3\17\3\17\3\17\3\17\3\20\7\20\u0147\n\20\f\20\16\20\u014a\13\20\3\21"+
		"\3\21\5\21\u014e\n\21\3\22\3\22\3\22\3\22\5\22\u0154\n\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\7\25\u0160\n\25\f\25\16\25\u0163"+
		"\13\25\3\26\3\26\3\26\5\26\u0168\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0177\n\30\f\30\16\30\u017a\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\7\32\u0185\n\32\f\32"+
		"\16\32\u0188\13\32\3\33\3\33\3\33\5\33\u018d\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\5\35\u0196\n\35\3\36\3\36\3\36\3\36\5\36\u019c\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \7 \u01a7\n \f \16 \u01aa\13"+
		" \3!\3!\3!\3!\3!\3\"\3\"\5\"\u01b3\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\7$\u01c1\n$\f$\16$\u01c4\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%"+
		"\u01d1\n%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\7"+
		"(\u01e4\n(\f(\16(\u01e7\13(\3)\3)\3)\3)\3)\5)\u01ee\n)\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01ff\n+\3,\7,\u0202\n,\f,\16,\u0205"+
		"\13,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u021b"+
		"\n.\3/\3/\3/\3/\3/\5/\u0222\n/\3\60\3\60\3\60\3\60\3\60\5\60\u0229\n\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u024d\n\65\3\66\3\66\3\66\5\66\u0252"+
		"\n\66\3\67\3\67\3\67\3\67\5\67\u0258\n\67\38\38\38\38\38\38\78\u0260\n"+
		"8\f8\168\u0263\138\39\39\59\u0267\n9\3:\3:\3:\3:\3:\3:\7:\u026f\n:\f:"+
		"\16:\u0272\13:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0281\n;\3<\3"+
		"<\3<\3<\5<\u0287\n<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3?\3?\3@\7@\u029f\n@\f@\16@\u02a2\13@\3A\3A\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\7E\u02c0"+
		"\nE\fE\16E\u02c3\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\5F\u02d7\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\5G\u02ed\nG\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\5J\u02fa\nJ\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u030a\nK\3L\3L\3L\3L\3L\3L\3"+
		"L\5L\u0313\nL\3M\3M\3M\3M\3M\3N\7N\u031b\nN\fN\16N\u031e\13N\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3P\7P\u0329\nP\fP\16P\u032c\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5"+
		"Q\u0335\nQ\3R\3R\5R\u0339\nR\3S\3S\3S\3S\5S\u033f\nS\3T\3T\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0352\nT\3U\3U\3U\3U\3U\7U\u0359"+
		"\nU\fU\16U\u035c\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0377\nV\3W\7W\u037a\nW\fW\16W\u037d\13W"+
		"\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u038d\nY\fY\16Y\u0390\13"+
		"Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u039b\nZ\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u03b0\n\\\3]\3]\3]\3]\3]\3"+
		"]\3]\3]\3^\3^\5^\u03bc\n^\3_\3_\3`\3`\3`\3a\5a\u03c4\na\3b\3b\3b\3b\3"+
		"b\3b\7b\u03cc\nb\fb\16b\u03cf\13b\3c\3c\3d\3d\3d\3d\3d\3d\7d\u03d9\nd"+
		"\fd\16d\u03dc\13d\3e\3e\3e\3e\5e\u03e2\ne\3f\3f\3f\5f\u03e7\nf\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\7f\u03f8\nf\ff\16f\u03fb\13f\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0427\ng\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\7g"+
		"\u0485\ng\fg\16g\u0488\13g\3h\3h\3h\2\17\f\22.Fnr\u0088\u00a8\u00b0\u00c2"+
		"\u00c6\u00ca\u00cci\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\2\5\6\2&\'99@@LL\4\2\66\67;;\3\2\34 \u04bb\2\u00d0\3\2\2\2\4\u00e0\3"+
		"\2\2\2\6\u00e2\3\2\2\2\b\u00e6\3\2\2\2\n\u00e9\3\2\2\2\f\u00eb\3\2\2\2"+
		"\16\u00fd\3\2\2\2\20\u0100\3\2\2\2\22\u0102\3\2\2\2\24\u010d\3\2\2\2\26"+
		"\u0113\3\2\2\2\30\u0115\3\2\2\2\32\u013f\3\2\2\2\34\u0141\3\2\2\2\36\u0148"+
		"\3\2\2\2 \u014d\3\2\2\2\"\u0153\3\2\2\2$\u0155\3\2\2\2&\u0157\3\2\2\2"+
		"(\u0161\3\2\2\2*\u0167\3\2\2\2,\u0169\3\2\2\2.\u0171\3\2\2\2\60\u017b"+
		"\3\2\2\2\62\u0186\3\2\2\2\64\u018c\3\2\2\2\66\u018e\3\2\2\28\u0195\3\2"+
		"\2\2:\u019b\3\2\2\2<\u019d\3\2\2\2>\u01a8\3\2\2\2@\u01ab\3\2\2\2B\u01b2"+
		"\3\2\2\2D\u01b4\3\2\2\2F\u01ba\3\2\2\2H\u01d0\3\2\2\2J\u01d2\3\2\2\2L"+
		"\u01da\3\2\2\2N\u01e5\3\2\2\2P\u01ed\3\2\2\2R\u01ef\3\2\2\2T\u01fe\3\2"+
		"\2\2V\u0203\3\2\2\2X\u0206\3\2\2\2Z\u021a\3\2\2\2\\\u0221\3\2\2\2^\u0228"+
		"\3\2\2\2`\u022a\3\2\2\2b\u022c\3\2\2\2d\u0231\3\2\2\2f\u0236\3\2\2\2h"+
		"\u024c\3\2\2\2j\u0251\3\2\2\2l\u0257\3\2\2\2n\u0259\3\2\2\2p\u0266\3\2"+
		"\2\2r\u0268\3\2\2\2t\u0280\3\2\2\2v\u0286\3\2\2\2x\u0288\3\2\2\2z\u028f"+
		"\3\2\2\2|\u0296\3\2\2\2~\u02a0\3\2\2\2\u0080\u02a3\3\2\2\2\u0082\u02a8"+
		"\3\2\2\2\u0084\u02af\3\2\2\2\u0086\u02b4\3\2\2\2\u0088\u02b9\3\2\2\2\u008a"+
		"\u02d6\3\2\2\2\u008c\u02ec\3\2\2\2\u008e\u02ee\3\2\2\2\u0090\u02f0\3\2"+
		"\2\2\u0092\u02f9\3\2\2\2\u0094\u0309\3\2\2\2\u0096\u0312\3\2\2\2\u0098"+
		"\u0314\3\2\2\2\u009a\u031c\3\2\2\2\u009c\u031f\3\2\2\2\u009e\u032a\3\2"+
		"\2\2\u00a0\u0334\3\2\2\2\u00a2\u0338\3\2\2\2\u00a4\u033e\3\2\2\2\u00a6"+
		"\u0351\3\2\2\2\u00a8\u0353\3\2\2\2\u00aa\u0376\3\2\2\2\u00ac\u037b\3\2"+
		"\2\2\u00ae\u037e\3\2\2\2\u00b0\u0384\3\2\2\2\u00b2\u039a\3\2\2\2\u00b4"+
		"\u039c\3\2\2\2\u00b6\u03af\3\2\2\2\u00b8\u03b1\3\2\2\2\u00ba\u03bb\3\2"+
		"\2\2\u00bc\u03bd\3\2\2\2\u00be\u03bf\3\2\2\2\u00c0\u03c3\3\2\2\2\u00c2"+
		"\u03c5\3\2\2\2\u00c4\u03d0\3\2\2\2\u00c6\u03d2\3\2\2\2\u00c8\u03e1\3\2"+
		"\2\2\u00ca\u03e6\3\2\2\2\u00cc\u0426\3\2\2\2\u00ce\u0489\3\2\2\2\u00d0"+
		"\u00d4\5\4\3\2\u00d1\u00d3\5\4\3\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\3\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00e1\5\u00b8]\2\u00d8\u00e1\5T+\2\u00d9\u00e1\5\u00b4"+
		"[\2\u00da\u00e1\5&\24\2\u00db\u00e1\5t;\2\u00dc\u00e1\5J&\2\u00dd\u00e1"+
		"\5\32\16\2\u00de\u00e1\5\u0084C\2\u00df\u00e1\5\u0086D\2\u00e0\u00d7\3"+
		"\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\5\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3\7\3"+
		"\2\2\2\u00e4\u00e7\5\6\4\2\u00e5\u00e7\7L\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\t\3\2\2\2\u00e8\u00ea\5\f\7\2\u00e9\u00e8\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\13\3\2\2\2\u00eb\u00ec\b\7\1\2\u00ec\u00ed"+
		"\5\16\b\2\u00ed\u00f2\3\2\2\2\u00ee\u00ef\f\3\2\2\u00ef\u00f1\5\16\b\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\r\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\20\2\2\u00f6"+
		"\u00fe\5\b\5\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7"+
		"\17\2\2\u00fa\u00fb\5\u00c6d\2\u00fb\u00fc\7\b\2\2\u00fc\u00fe\3\2\2\2"+
		"\u00fd\u00f5\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fe\17\3\2\2\2\u00ff\u0101"+
		"\5\22\n\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\21\3\2\2\2\u0102"+
		"\u0103\b\n\1\2\u0103\u0104\5\24\13\2\u0104\u010a\3\2\2\2\u0105\u0106\f"+
		"\3\2\2\u0106\u0107\7\t\2\2\u0107\u0109\5\24\13\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\23\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u010e\5\n\6\2\u010e\u010f\5\26\f\2\u010f"+
		"\u0110\5\\/\2\u0110\u0111\5\b\5\2\u0111\25\3\2\2\2\u0112\u0114\t\3\2\2"+
		"\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\27\3\2\2\2\u0115\u0116"+
		"\5\n\6\2\u0116\u0117\7=\2\2\u0117\u0118\5\b\5\2\u0118\u0119\5l\67\2\u0119"+
		"\u011a\7\17\2\2\u011a\u011b\5\20\t\2\u011b\u011c\7\b\2\2\u011c\31\3\2"+
		"\2\2\u011d\u011e\5\f\7\2\u011e\u011f\5\\/\2\u011f\u0120\7\17\2\2\u0120"+
		"\u0121\5\u00c0a\2\u0121\u0122\7\b\2\2\u0122\u0123\5\b\5\2\u0123\u0124"+
		"\7\23\2\2\u0124\u0140\3\2\2\2\u0125\u0126\5\\/\2\u0126\u0127\7\17\2\2"+
		"\u0127\u0128\5\u00c0a\2\u0128\u0129\7\b\2\2\u0129\u012a\5\b\5\2\u012a"+
		"\u012b\7\23\2\2\u012b\u0140\3\2\2\2\u012c\u012d\5\f\7\2\u012d\u012e\5"+
		"\\/\2\u012e\u012f\7\17\2\2\u012f\u0130\5\u00c0a\2\u0130\u0131\7\b\2\2"+
		"\u0131\u0132\5\b\5\2\u0132\u0133\7\22\2\2\u0133\u0134\5\34\17\2\u0134"+
		"\u0135\7\23\2\2\u0135\u0140\3\2\2\2\u0136\u0137\5\\/\2\u0137\u0138\7\17"+
		"\2\2\u0138\u0139\5\u00c0a\2\u0139\u013a\7\b\2\2\u013a\u013b\5\b\5\2\u013b"+
		"\u013c\7\22\2\2\u013c\u013d\5\34\17\2\u013d\u013e\7\23\2\2\u013e\u0140"+
		"\3\2\2\2\u013f\u011d\3\2\2\2\u013f\u0125\3\2\2\2\u013f\u012c\3\2\2\2\u013f"+
		"\u0136\3\2\2\2\u0140\33\3\2\2\2\u0141\u0142\7\26\2\2\u0142\u0143\5\36"+
		"\20\2\u0143\u0144\7\31\2\2\u0144\35\3\2\2\2\u0145\u0147\5 \21\2\u0146"+
		"\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\37\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014e\5\u00be`\2\u014c"+
		"\u014e\5\32\16\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e!\3\2\2"+
		"\2\u014f\u0150\7\17\2\2\u0150\u0151\5\20\t\2\u0151\u0152\7\b\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154#\3\2\2\2"+
		"\u0155\u0156\7\7\2\2\u0156%\3\2\2\2\u0157\u0158\5,\27\2\u0158\u0159\5"+
		"\"\22\2\u0159\u015a\7\26\2\2\u015a\u015b\5(\25\2\u015b\u015c\5.\30\2\u015c"+
		"\u015d\7\31\2\2\u015d\'\3\2\2\2\u015e\u0160\5*\26\2\u015f\u015e\3\2\2"+
		"\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162)"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0168\5\u00b8]\2\u0165\u0168\5\32\16"+
		"\2\u0166\u0168\5\u00b6\\\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168+\3\2\2\2\u0169\u016a\5\n\6\2\u016a\u016b\7<\2\2\u016b"+
		"\u016c\5\b\5\2\u016c\u016d\5l\67\2\u016d\u016e\7\17\2\2\u016e\u016f\5"+
		"\20\t\2\u016f\u0170\7\b\2\2\u0170-\3\2\2\2\u0171\u0172\b\30\1\2\u0172"+
		"\u0173\5\60\31\2\u0173\u0178\3\2\2\2\u0174\u0175\f\3\2\2\u0175\u0177\5"+
		"\60\31\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179/\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\n\6\2"+
		"\u017c\u017d\7@\2\2\u017d\u017e\5\b\5\2\u017e\u017f\7\26\2\2\u017f\u0180"+
		"\5\62\32\2\u0180\u0181\58\35\2\u0181\u0182\7\31\2\2\u0182\61\3\2\2\2\u0183"+
		"\u0185\5\64\33\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\63\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018d\5\u008cG\2\u018a\u018d\5\u00b6\\\2\u018b\u018d\5\66\34\2\u018c"+
		"\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\65\3\2\2"+
		"\2\u018e\u018f\5\n\6\2\u018f\u0190\7\26\2\2\u0190\u0191\5\62\32\2\u0191"+
		"\u0192\7\31\2\2\u0192\67\3\2\2\2\u0193\u0194\7E\2\2\u0194\u0196\5:\36"+
		"\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u01969\3\2\2\2\u0197\u0198"+
		"\5\b\5\2\u0198\u0199\7\23\2\2\u0199\u019c\3\2\2\2\u019a\u019c\5<\37\2"+
		"\u019b\u0197\3\2\2\2\u019b\u019a\3\2\2\2\u019c;\3\2\2\2\u019d\u019e\7"+
		"?\2\2\u019e\u019f\7\17\2\2\u019f\u01a0\5\u00c6d\2\u01a0\u01a1\7\b\2\2"+
		"\u01a1\u01a2\7\26\2\2\u01a2\u01a3\5> \2\u01a3\u01a4\7\31\2\2\u01a4=\3"+
		"\2\2\2\u01a5\u01a7\5@!\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9?\3\2\2\2\u01aa\u01a8\3\2\2\2"+
		"\u01ab\u01ac\5B\"\2\u01ac\u01ad\7\16\2\2\u01ad\u01ae\5\b\5\2\u01ae\u01af"+
		"\7\23\2\2\u01afA\3\2\2\2\u01b0\u01b3\5D#\2\u01b1\u01b3\5H%\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3C\3\2\2\2\u01b4\u01b5\7\17\2\2\u01b5"+
		"\u01b6\5H%\2\u01b6\u01b7\7\t\2\2\u01b7\u01b8\5F$\2\u01b8\u01b9\7\b\2\2"+
		"\u01b9E\3\2\2\2\u01ba\u01bb\b$\1\2\u01bb\u01bc\5H%\2\u01bc\u01c2\3\2\2"+
		"\2\u01bd\u01be\f\3\2\2\u01be\u01bf\7\t\2\2\u01bf\u01c1\5H%\2\u01c0\u01bd"+
		"\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"G\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01d1\5\u00ccg\2\u01c6\u01c7\5\u00cc"+
		"g\2\u01c7\u01c8\7M\2\2\u01c8\u01c9\5\u00ccg\2\u01c9\u01d1\3\2\2\2\u01ca"+
		"\u01cb\5\u00ccg\2\u01cb\u01cc\7N\2\2\u01cc\u01cd\5\u00ccg\2\u01cd\u01d1"+
		"\3\2\2\2\u01ce\u01d1\7,\2\2\u01cf\u01d1\7K\2\2\u01d0\u01c5\3\2\2\2\u01d0"+
		"\u01c6\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1I\3\2\2\2\u01d2\u01d3\5L\'\2\u01d3\u01d4\5\"\22\2\u01d4\u01d5"+
		"\7\26\2\2\u01d5\u01d6\5N(\2\u01d6\u01d7\7\'\2\2\u01d7\u01d8\5R*\2\u01d8"+
		"\u01d9\7\31\2\2\u01d9K\3\2\2\2\u01da\u01db\5\n\6\2\u01db\u01dc\7+\2\2"+
		"\u01dc\u01dd\5\b\5\2\u01dd\u01de\5l\67\2\u01de\u01df\7\17\2\2\u01df\u01e0"+
		"\5\20\t\2\u01e0\u01e1\7\b\2\2\u01e1M\3\2\2\2\u01e2\u01e4\5P)\2\u01e3\u01e2"+
		"\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"O\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ee\5\u00b8]\2\u01e9\u01ee\5\u00b4"+
		"[\2\u01ea\u01ee\5\u00a6T\2\u01eb\u01ee\5\32\16\2\u01ec\u01ee\5\u00b6\\"+
		"\2\u01ed\u01e8\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeQ\3\2\2\2\u01ef\u01f0\5\u0098M\2\u01f0"+
		"S\3\2\2\2\u01f1\u01f2\5\n\6\2\u01f2\u01f3\7\61\2\2\u01f3\u01f4\5\6\4\2"+
		"\u01f4\u01f5\5l\67\2\u01f5\u01f6\7\26\2\2\u01f6\u01f7\5V,\2\u01f7\u01f8"+
		"\7\31\2\2\u01f8\u01ff\3\2\2\2\u01f9\u01fa\5\n\6\2\u01fa\u01fb\7\61\2\2"+
		"\u01fb\u01fc\5X-\2\u01fc\u01fd\7\23\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01f1"+
		"\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ffU\3\2\2\2\u0200\u0202\5Z.\2\u0201\u0200"+
		"\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"W\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\5j\66\2\u0207\u0208\5\b\5\2"+
		"\u0208\u0209\5l\67\2\u0209\u020a\7\17\2\2\u020a\u020b\5\20\t\2\u020b\u020c"+
		"\7\b\2\2\u020cY\3\2\2\2\u020d\u020e\5X-\2\u020e\u020f\7\23\2\2\u020f\u021b"+
		"\3\2\2\2\u0210\u0211\7$\2\2\u0211\u0212\5X-\2\u0212\u0213\7\23\2\2\u0213"+
		"\u021b\3\2\2\2\u0214\u0215\7L\2\2\u0215\u0216\7\17\2\2\u0216\u0217\5\20"+
		"\t\2\u0217\u0218\7\b\2\2\u0218\u0219\7\23\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u020d\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0214\3\2\2\2\u021b[\3\2\2\2"+
		"\u021c\u0222\5h\65\2\u021d\u0222\5`\61\2\u021e\u0222\5f\64\2\u021f\u0222"+
		"\5d\63\2\u0220\u0222\5b\62\2\u0221\u021c\3\2\2\2\u0221\u021d\3\2\2\2\u0221"+
		"\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222]\3\2\2\2"+
		"\u0223\u0229\7L\2\2\u0224\u0229\7/\2\2\u0225\u0226\5$\23\2\u0226\u0227"+
		"\7L\2\2\u0227\u0229\3\2\2\2\u0228\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228"+
		"\u0225\3\2\2\2\u0229_\3\2\2\2\u022a\u022b\5^\60\2\u022ba\3\2\2\2\u022c"+
		"\u022d\7G\2\2\u022d\u022e\7\21\2\2\u022e\u022f\5r:\2\u022f\u0230\7\25"+
		"\2\2\u0230c\3\2\2\2\u0231\u0232\5`\61\2\u0232\u0233\7\13\2\2\u0233\u0234"+
		"\5\u00ccg\2\u0234\u0235\7\3\2\2\u0235e\3\2\2\2\u0236\u0237\5`\61\2\u0237"+
		"\u0238\7\21\2\2\u0238\u0239\5r:\2\u0239\u023a\7\25\2\2\u023ag\3\2\2\2"+
		"\u023b\u024d\7(\2\2\u023c\u024d\7)\2\2\u023d\u023e\7)\2\2\u023e\u023f"+
		"\7\21\2\2\u023f\u0240\5\u00ceh\2\u0240\u0241\7\25\2\2\u0241\u024d\3\2"+
		"\2\2\u0242\u0243\78\2\2\u0243\u0244\7\21\2\2\u0244\u0245\5\u00ceh\2\u0245"+
		"\u0246\7\25\2\2\u0246\u024d\3\2\2\2\u0247\u0248\7I\2\2\u0248\u0249\7\21"+
		"\2\2\u0249\u024a\5\u00ceh\2\u024a\u024b\7\25\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u023b\3\2\2\2\u024c\u023c\3\2\2\2\u024c\u023d\3\2\2\2\u024c\u0242\3\2"+
		"\2\2\u024c\u0247\3\2\2\2\u024di\3\2\2\2\u024e\u0252\5\\/\2\u024f\u0252"+
		"\7J\2\2\u0250\u0252\5\6\4\2\u0251\u024e\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252k\3\2\2\2\u0253\u0254\7\21\2\2\u0254\u0255\5n8\2\u0255"+
		"\u0256\7\25\2\2\u0256\u0258\3\2\2\2\u0257\u0253\3\2\2\2\u0257\u0258\3"+
		"\2\2\2\u0258m\3\2\2\2\u0259\u025a\b8\1\2\u025a\u025b\5\b\5\2\u025b\u0261"+
		"\3\2\2\2\u025c\u025d\f\3\2\2\u025d\u025e\7\t\2\2\u025e\u0260\5\b\5\2\u025f"+
		"\u025c\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262o\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0267\5\\/\2\u0265\u0267"+
		"\7K\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267q\3\2\2\2\u0268\u0269"+
		"\b:\1\2\u0269\u026a\5p9\2\u026a\u0270\3\2\2\2\u026b\u026c\f\3\2\2\u026c"+
		"\u026d\7\t\2\2\u026d\u026f\5p9\2\u026e\u026b\3\2\2\2\u026f\u0272\3\2\2"+
		"\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271s\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0273\u0281\5v<\2\u0274\u0275\5\u008aF\2\u0275\u0276\7\23\2\2"+
		"\u0276\u0281\3\2\2\2\u0277\u0278\5,\27\2\u0278\u0279\7\23\2\2\u0279\u0281"+
		"\3\2\2\2\u027a\u027b\5L\'\2\u027b\u027c\7\23\2\2\u027c\u0281\3\2\2\2\u027d"+
		"\u027e\5\30\r\2\u027e\u027f\7\23\2\2\u027f\u0281\3\2\2\2\u0280\u0273\3"+
		"\2\2\2\u0280\u0274\3\2\2\2\u0280\u0277\3\2\2\2\u0280\u027a\3\2\2\2\u0280"+
		"\u027d\3\2\2\2\u0281u\3\2\2\2\u0282\u0287\5x=\2\u0283\u0287\5|?\2\u0284"+
		"\u0287\5z>\2\u0285\u0287\5\u0082B\2\u0286\u0282\3\2\2\2\u0286\u0283\3"+
		"\2\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287w\3\2\2\2\u0288\u0289"+
		"\5\n\6\2\u0289\u028a\7\63\2\2\u028a\u028b\5\b\5\2\u028b\u028c\7\26\2\2"+
		"\u028c\u028d\5~@\2\u028d\u028e\7\31\2\2\u028ey\3\2\2\2\u028f\u0290\5\n"+
		"\6\2\u0290\u0291\7A\2\2\u0291\u0292\5\b\5\2\u0292\u0293\7\26\2\2\u0293"+
		"\u0294\5~@\2\u0294\u0295\7\31\2\2\u0295{\3\2\2\2\u0296\u0297\5\n\6\2\u0297"+
		"\u0298\7\64\2\2\u0298\u0299\5\b\5\2\u0299\u029a\7\26\2\2\u029a\u029b\5"+
		"~@\2\u029b\u029c\7\31\2\2\u029c}\3\2\2\2\u029d\u029f\5\u0080A\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\177\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\5\n\6\2\u02a4\u02a5"+
		"\5\\/\2\u02a5\u02a6\5\b\5\2\u02a6\u02a7\7\23\2\2\u02a7\u0081\3\2\2\2\u02a8"+
		"\u02a9\5\n\6\2\u02a9\u02aa\7.\2\2\u02aa\u02ab\5\b\5\2\u02ab\u02ac\7\26"+
		"\2\2\u02ac\u02ad\5\u0088E\2\u02ad\u02ae\7\31\2\2\u02ae\u0083\3\2\2\2\u02af"+
		"\u02b0\7/\2\2\u02b0\u02b1\7\26\2\2\u02b1\u02b2\5\u0088E\2\u02b2\u02b3"+
		"\7\31\2\2\u02b3\u0085\3\2\2\2\u02b4\u02b5\7:\2\2\u02b5\u02b6\7\26\2\2"+
		"\u02b6\u02b7\5\u0088E\2\u02b7\u02b8\7\31\2\2\u02b8\u0087\3\2\2\2\u02b9"+
		"\u02ba\bE\1\2\u02ba\u02bb\5\b\5\2\u02bb\u02c1\3\2\2\2\u02bc\u02bd\f\3"+
		"\2\2\u02bd\u02be\7\t\2\2\u02be\u02c0\5\b\5\2\u02bf\u02bc\3\2\2\2\u02c0"+
		"\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u0089\3\2"+
		"\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c5\5\f\7\2\u02c5\u02c6\7H\2\2\u02c6"+
		"\u02c7\5\\/\2\u02c7\u02c8\5\b\5\2\u02c8\u02d7\3\2\2\2\u02c9\u02ca\7H\2"+
		"\2\u02ca\u02cb\5\\/\2\u02cb\u02cc\5\b\5\2\u02cc\u02d7\3\2\2\2\u02cd\u02ce"+
		"\5\f\7\2\u02ce\u02cf\7H\2\2\u02cf\u02d0\5v<\2\u02d0\u02d1\5\b\5\2\u02d1"+
		"\u02d7\3\2\2\2\u02d2\u02d3\7H\2\2\u02d3\u02d4\5v<\2\u02d4\u02d5\5\b\5"+
		"\2\u02d5\u02d7\3\2\2\2\u02d6\u02c4\3\2\2\2\u02d6\u02c9\3\2\2\2\u02d6\u02cd"+
		"\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d7\u008b\3\2\2\2\u02d8\u02d9\5\u00caf"+
		"\2\u02d9\u02da\7\17\2\2\u02da\u02db\5\u00c0a\2\u02db\u02dc\7\b\2\2\u02dc"+
		"\u02dd\7\23\2\2\u02dd\u02ed\3\2\2\2\u02de\u02df\5\u00caf\2\u02df\u02e0"+
		"\7\21\2\2\u02e0\u02e1\5r:\2\u02e1\u02e2\7\25\2\2\u02e2\u02e3\7\17\2\2"+
		"\u02e3\u02e4\5\u00c0a\2\u02e4\u02e5\7\b\2\2\u02e5\u02e6\7\23\2\2\u02e6"+
		"\u02ed\3\2\2\2\u02e7\u02e8\5\u00caf\2\u02e8\u02e9\7\22\2\2\u02e9\u02ea"+
		"\5\u00ccg\2\u02ea\u02eb\7\23\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02d8\3\2\2"+
		"\2\u02ec\u02de\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ed\u008d\3\2\2\2\u02ee\u02ef"+
		"\7\23\2\2\u02ef\u008f\3\2\2\2\u02f0\u02f1\7\60\2\2\u02f1\u02f2\7\23\2"+
		"\2\u02f2\u0091\3\2\2\2\u02f3\u02f4\7>\2\2\u02f4\u02fa\7\23\2\2\u02f5\u02f6"+
		"\7>\2\2\u02f6\u02f7\5\u00ccg\2\u02f7\u02f8\7\23\2\2\u02f8\u02fa\3\2\2"+
		"\2\u02f9\u02f3\3\2\2\2\u02f9\u02f5\3\2\2\2\u02fa\u0093\3\2\2\2\u02fb\u02fc"+
		"\7\65\2\2\u02fc\u02fd\7\17\2\2\u02fd\u02fe\5\u00ccg\2\u02fe\u02ff\7\b"+
		"\2\2\u02ff\u0300\5\u0096L\2\u0300\u030a\3\2\2\2\u0301\u0302\7\65\2\2\u0302"+
		"\u0303\7\17\2\2\u0303\u0304\5\u00ccg\2\u0304\u0305\7\b\2\2\u0305\u0306"+
		"\5\u0096L\2\u0306\u0307\7-\2\2\u0307\u0308\5\u0096L\2\u0308\u030a\3\2"+
		"\2\2\u0309\u02fb\3\2\2\2\u0309\u0301\3\2\2\2\u030a\u0095\3\2\2\2\u030b"+
		"\u0313\5\u008cG\2\u030c\u0313\5\u0094K\2\u030d\u0313\5\u008eH\2\u030e"+
		"\u0313\5\u0098M\2\u030f\u0313\5\u0092J\2\u0310\u0313\5\u0090I\2\u0311"+
		"\u0313\5\u009cO\2\u0312\u030b\3\2\2\2\u0312\u030c\3\2\2\2\u0312\u030d"+
		"\3\2\2\2\u0312\u030e\3\2\2\2\u0312\u030f\3\2\2\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0311\3\2\2\2\u0313\u0097\3\2\2\2\u0314\u0315\5\n\6\2\u0315\u0316\7\26"+
		"\2\2\u0316\u0317\5\u009aN\2\u0317\u0318\7\31\2\2\u0318\u0099\3\2\2\2\u0319"+
		"\u031b\5\u00a4S\2\u031a\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u009b\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\7B\2\2\u0320\u0321\7\17\2\2\u0321\u0322\5\u00ccg\2\u0322\u0323"+
		"\7\b\2\2\u0323\u0324\7\26\2\2\u0324\u0325\5\u009eP\2\u0325\u0326\7\31"+
		"\2\2\u0326\u009d\3\2\2\2\u0327\u0329\5\u00a0Q\2\u0328\u0327\3\2\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u009f\3\2"+
		"\2\2\u032c\u032a\3\2\2\2\u032d\u032e\5\u00a2R\2\u032e\u032f\7\16\2\2\u032f"+
		"\u0330\5\u0098M\2\u0330\u0335\3\2\2\2\u0331\u0332\5\u00a2R\2\u0332\u0333"+
		"\7\16\2\2\u0333\u0335\3\2\2\2\u0334\u032d\3\2\2\2\u0334\u0331\3\2\2\2"+
		"\u0335\u00a1\3\2\2\2\u0336\u0339\5\b\5\2\u0337\u0339\7,\2\2\u0338\u0336"+
		"\3\2\2\2\u0338\u0337\3\2\2\2\u0339\u00a3\3\2\2\2\u033a\u033f\5\u00b6\\"+
		"\2\u033b\u033f\5\u00b8]\2\u033c\u033f\5\u0096L\2\u033d\u033f\5\32\16\2"+
		"\u033e\u033a\3\2\2\2\u033e\u033b\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033d"+
		"\3\2\2\2\u033f\u00a5\3\2\2\2\u0340\u0341\5\n\6\2\u0341\u0342\7C\2\2\u0342"+
		"\u0343\5\b\5\2\u0343\u0344\7\17\2\2\u0344\u0345\5\20\t\2\u0345\u0346\7"+
		"\b\2\2\u0346\u0347\7\26\2\2\u0347\u0348\5\u00a8U\2\u0348\u0349\7\31\2"+
		"\2\u0349\u0352\3\2\2\2\u034a\u034b\5\n\6\2\u034b\u034c\7C\2\2\u034c\u034d"+
		"\5\b\5\2\u034d\u034e\7\26\2\2\u034e\u034f\5\u00a8U\2\u034f\u0350\7\31"+
		"\2\2\u0350\u0352\3\2\2\2\u0351\u0340\3\2\2\2\u0351\u034a\3\2\2\2\u0352"+
		"\u00a7\3\2\2\2\u0353\u0354\bU\1\2\u0354\u0355\5\u00aaV\2\u0355\u035a\3"+
		"\2\2\2\u0356\u0357\f\3\2\2\u0357\u0359\5\u00aaV\2\u0358\u0356\3\2\2\2"+
		"\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u00a9"+
		"\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035e\79\2\2\u035e\u035f\7\22\2\2\u035f"+
		"\u0360\7\26\2\2\u0360\u0361\5\u00acW\2\u0361\u0362\7\31\2\2\u0362\u0377"+
		"\3\2\2\2\u0363\u0364\7&\2\2\u0364\u0365\7\22\2\2\u0365\u0366\7\26\2\2"+
		"\u0366\u0367\5\u00b0Y\2\u0367\u0368\7\31\2\2\u0368\u0377\3\2\2\2\u0369"+
		"\u036a\5\n\6\2\u036a\u036b\7*\2\2\u036b\u036c\7L\2\2\u036c\u036d\7\22"+
		"\2\2\u036d\u036e\5\u00bc_\2\u036e\u036f\7\23\2\2\u036f\u0377\3\2\2\2\u0370"+
		"\u0371\5\n\6\2\u0371\u0372\7L\2\2\u0372\u0373\7\22\2\2\u0373\u0374\5\u00bc"+
		"_\2\u0374\u0375\7\23\2\2\u0375\u0377\3\2\2\2\u0376\u035d\3\2\2\2\u0376"+
		"\u0363\3\2\2\2\u0376\u0369\3\2\2\2\u0376\u0370\3\2\2\2\u0377\u00ab\3\2"+
		"\2\2\u0378\u037a\5\u00aeX\2\u0379\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u00ad\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037e\u037f\5\u00ccg\2\u037f\u0380\7\16\2\2\u0380\u0381\5\b\5\2\u0381"+
		"\u0382\5\n\6\2\u0382\u0383\7\23\2\2\u0383\u00af\3\2\2\2\u0384\u0385\b"+
		"Y\1\2\u0385\u0386\5\u00b2Z\2\u0386\u0387\7\23\2\2\u0387\u038e\3\2\2\2"+
		"\u0388\u0389\f\3\2\2\u0389\u038a\5\u00b2Z\2\u038a\u038b\7\23\2\2\u038b"+
		"\u038d\3\2\2\2\u038c\u0388\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u00b1\3\2\2\2\u0390\u038e\3\2\2\2\u0391"+
		"\u0392\5\n\6\2\u0392\u0393\5\b\5\2\u0393\u039b\3\2\2\2\u0394\u0395\5\n"+
		"\6\2\u0395\u0396\5\b\5\2\u0396\u0397\7\17\2\2\u0397\u0398\5\u00c0a\2\u0398"+
		"\u0399\7\b\2\2\u0399\u039b\3\2\2\2\u039a\u0391\3\2\2\2\u039a\u0394\3\2"+
		"\2\2\u039b\u00b3\3\2\2\2\u039c\u039d\5\n\6\2\u039d\u039e\7%\2\2\u039e"+
		"\u039f\5\b\5\2\u039f\u03a0\7\17\2\2\u03a0\u03a1\5\20\t\2\u03a1\u03a2\7"+
		"\b\2\2\u03a2\u03a3\5\u0098M\2\u03a3\u00b5\3\2\2\2\u03a4\u03a5\5\f\7\2"+
		"\u03a5\u03a6\5\\/\2\u03a6\u03a7\5\b\5\2\u03a7\u03a8\5\u00ba^\2\u03a8\u03a9"+
		"\7\23\2\2\u03a9\u03b0\3\2\2\2\u03aa\u03ab\5\\/\2\u03ab\u03ac\5\b\5\2\u03ac"+
		"\u03ad\5\u00ba^\2\u03ad\u03ae\7\23\2\2\u03ae\u03b0\3\2\2\2\u03af\u03a4"+
		"\3\2\2\2\u03af\u03aa\3\2\2\2\u03b0\u00b7\3\2\2\2\u03b1\u03b2\5\n\6\2\u03b2"+
		"\u03b3\7*\2\2\u03b3\u03b4\5\\/\2\u03b4\u03b5\5\b\5\2\u03b5\u03b6\7\22"+
		"\2\2\u03b6\u03b7\5\u00bc_\2\u03b7\u03b8\7\23\2\2\u03b8\u00b9\3\2\2\2\u03b9"+
		"\u03ba\7\22\2\2\u03ba\u03bc\5\u00bc_\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc"+
		"\3\2\2\2\u03bc\u00bb\3\2\2\2\u03bd\u03be\5\u00ccg\2\u03be\u00bd\3\2\2"+
		"\2\u03bf\u03c0\5X-\2\u03c0\u03c1\5\u0098M\2\u03c1\u00bf\3\2\2\2\u03c2"+
		"\u03c4\5\u00c2b\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u00c1"+
		"\3\2\2\2\u03c5\u03c6\bb\1\2\u03c6\u03c7\5\u00c4c\2\u03c7\u03cd\3\2\2\2"+
		"\u03c8\u03c9\f\3\2\2\u03c9\u03ca\7\t\2\2\u03ca\u03cc\5\u00c4c\2\u03cb"+
		"\u03c8\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u00c3\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1\5\u00ccg\2\u03d1"+
		"\u00c5\3\2\2\2\u03d2\u03d3\bd\1\2\u03d3\u03d4\5\u00ccg\2\u03d4\u03da\3"+
		"\2\2\2\u03d5\u03d6\f\3\2\2\u03d6\u03d7\7\t\2\2\u03d7\u03d9\5\u00ccg\2"+
		"\u03d8\u03d5\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u00c7\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03e2\5\6\4\2\u03de"+
		"\u03df\5$\23\2\u03df\u03e0\5\6\4\2\u03e0\u03e2\3\2\2\2\u03e1\u03dd\3\2"+
		"\2\2\u03e1\u03de\3\2\2\2\u03e2\u00c9\3\2\2\2\u03e3\u03e4\bf\1\2\u03e4"+
		"\u03e7\5\u00c8e\2\u03e5\u03e7\7D\2\2\u03e6\u03e3\3\2\2\2\u03e6\u03e5\3"+
		"\2\2\2\u03e7\u03f9\3\2\2\2\u03e8\u03e9\f\5\2\2\u03e9\u03ea\7\7\2\2\u03ea"+
		"\u03f8\5\b\5\2\u03eb\u03ec\f\4\2\2\u03ec\u03ed\7\13\2\2\u03ed\u03ee\5"+
		"\u00ccg\2\u03ee\u03ef\7\3\2\2\u03ef\u03f8\3\2\2\2\u03f0\u03f1\f\3\2\2"+
		"\u03f1\u03f2\7\13\2\2\u03f2\u03f3\5\u00ccg\2\u03f3\u03f4\7\16\2\2\u03f4"+
		"\u03f5\5\u00ccg\2\u03f5\u03f6\7\3\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03e8"+
		"\3\2\2\2\u03f7\u03eb\3\2\2\2\u03f7\u03f0\3\2\2\2\u03f8\u03fb\3\2\2\2\u03f9"+
		"\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u00cb\3\2\2\2\u03fb\u03f9\3\2"+
		"\2\2\u03fc\u03fd\bg\1\2\u03fd\u03fe\7\33\2\2\u03fe\u0427\5\u00ccg!\u03ff"+
		"\u0400\7\30\2\2\u0400\u0427\5\u00ccg \u0401\u0402\7\f\2\2\u0402\u0427"+
		"\5\u00ccg\37\u0403\u0404\7\n\2\2\u0404\u0427\5\u00ccg\36\u0405\u0406\7"+
		"\17\2\2\u0406\u0407\5\\/\2\u0407\u0408\7\b\2\2\u0408\u0409\5\u00ccg\3"+
		"\u0409\u0427\3\2\2\2\u040a\u0427\5\u00ceh\2\u040b\u0427\7#\2\2\u040c\u0427"+
		"\7F\2\2\u040d\u0427\7\62\2\2\u040e\u0427\7D\2\2\u040f\u0427\5\6\4\2\u0410"+
		"\u0411\7\7\2\2\u0411\u0427\5\6\4\2\u0412\u0413\7\26\2\2\u0413\u0414\5"+
		"\u00c6d\2\u0414\u0415\7\31\2\2\u0415\u0427\3\2\2\2\u0416\u0417\7\17\2"+
		"\2\u0417\u0418\5\u00ccg\2\u0418\u0419\7\b\2\2\u0419\u0427\3\2\2\2\u041a"+
		"\u041b\5`\61\2\u041b\u041c\7\7\2\2\u041c\u041d\5\b\5\2\u041d\u0427\3\2"+
		"\2\2\u041e\u041f\7/\2\2\u041f\u0420\7\7\2\2\u0420\u0427\5\b\5\2\u0421"+
		"\u0422\5\\/\2\u0422\u0423\7\17\2\2\u0423\u0424\5\u00c0a\2\u0424\u0425"+
		"\7\b\2\2\u0425\u0427\3\2\2\2\u0426\u03fc\3\2\2\2\u0426\u03ff\3\2\2\2\u0426"+
		"\u0401\3\2\2\2\u0426\u0403\3\2\2\2\u0426\u0405\3\2\2\2\u0426\u040a\3\2"+
		"\2\2\u0426\u040b\3\2\2\2\u0426\u040c\3\2\2\2\u0426\u040d\3\2\2\2\u0426"+
		"\u040e\3\2\2\2\u0426\u040f\3\2\2\2\u0426\u0410\3\2\2\2\u0426\u0412\3\2"+
		"\2\2\u0426\u0416\3\2\2\2\u0426\u041a\3\2\2\2\u0426\u041e\3\2\2\2\u0426"+
		"\u0421\3\2\2\2\u0427\u0486\3\2\2\2\u0428\u0429\f\32\2\2\u0429\u042a\7"+
		"\r\2\2\u042a\u0485\5\u00ccg\33\u042b\u042c\f\31\2\2\u042c\u042d\7\27\2"+
		"\2\u042d\u0485\5\u00ccg\32\u042e\u042f\f\30\2\2\u042f\u0430\7\4\2\2\u0430"+
		"\u0485\5\u00ccg\31\u0431\u0432\f\27\2\2\u0432\u0433\7\n\2\2\u0433\u0485"+
		"\5\u00ccg\30\u0434\u0435\f\26\2\2\u0435\u0436\7\f\2\2\u0436\u0485\5\u00cc"+
		"g\27\u0437\u0438\f\25\2\2\u0438\u0439\7O\2\2\u0439\u0485\5\u00ccg\26\u043a"+
		"\u043b\f\24\2\2\u043b\u043c\7\25\2\2\u043c\u043d\7\25\2\2\u043d\u0485"+
		"\5\u00ccg\25\u043e\u043f\f\23\2\2\u043f\u0440\7U\2\2\u0440\u0485\5\u00cc"+
		"g\24\u0441\u0442\f\22\2\2\u0442\u0443\7T\2\2\u0443\u0485\5\u00ccg\23\u0444"+
		"\u0445\f\21\2\2\u0445\u0446\7\21\2\2\u0446\u0485\5\u00ccg\22\u0447\u0448"+
		"\f\20\2\2\u0448\u0449\7\25\2\2\u0449\u0485\5\u00ccg\21\u044a\u044b\f\17"+
		"\2\2\u044b\u044c\7S\2\2\u044c\u0485\5\u00ccg\20\u044d\u044e\f\16\2\2\u044e"+
		"\u044f\7R\2\2\u044f\u0485\5\u00ccg\17\u0450\u0451\f\r\2\2\u0451\u0452"+
		"\7\5\2\2\u0452\u0485\5\u00ccg\16\u0453\u0454\f\f\2\2\u0454\u0455\7\6\2"+
		"\2\u0455\u0485\5\u00ccg\r\u0456\u0457\f\13\2\2\u0457\u0458\7\32\2\2\u0458"+
		"\u0485\5\u00ccg\f\u0459\u045a\f\n\2\2\u045a\u045b\7V\2\2\u045b\u0485\5"+
		"\u00ccg\13\u045c\u045d\f\t\2\2\u045d\u045e\7P\2\2\u045e\u0485\5\u00cc"+
		"g\n\u045f\u0460\f\b\2\2\u0460\u0461\7Q\2\2\u0461\u0485\5\u00ccg\t\u0462"+
		"\u0463\f\7\2\2\u0463\u0464\7\24\2\2\u0464\u0465\5\u00ccg\2\u0465\u0466"+
		"\7\16\2\2\u0466\u0467\5\u00ccg\b\u0467\u0485\3\2\2\2\u0468\u0469\f%\2"+
		"\2\u0469\u046a\7\13\2\2\u046a\u046b\5\u00ccg\2\u046b\u046c\7\3\2\2\u046c"+
		"\u0485\3\2\2\2\u046d\u046e\f$\2\2\u046e\u046f\7\13\2\2\u046f\u0470\5\u00cc"+
		"g\2\u0470\u0471\7\16\2\2\u0471\u0472\5\u00ccg\2\u0472\u0473\7\3\2\2\u0473"+
		"\u0485\3\2\2\2\u0474\u0475\f\33\2\2\u0475\u0476\7\7\2\2\u0476\u0485\5"+
		"\b\5\2\u0477\u0478\f\6\2\2\u0478\u0479\7\21\2\2\u0479\u047a\5r:\2\u047a"+
		"\u047b\7\25\2\2\u047b\u047c\7\17\2\2\u047c\u047d\5\u00c0a\2\u047d\u047e"+
		"\7\b\2\2\u047e\u0485\3\2\2\2\u047f\u0480\f\5\2\2\u0480\u0481\7\17\2\2"+
		"\u0481\u0482\5\u00c0a\2\u0482\u0483\7\b\2\2\u0483\u0485\3\2\2\2\u0484"+
		"\u0428\3\2\2\2\u0484\u042b\3\2\2\2\u0484\u042e\3\2\2\2\u0484\u0431\3\2"+
		"\2\2\u0484\u0434\3\2\2\2\u0484\u0437\3\2\2\2\u0484\u043a\3\2\2\2\u0484"+
		"\u043e\3\2\2\2\u0484\u0441\3\2\2\2\u0484\u0444\3\2\2\2\u0484\u0447\3\2"+
		"\2\2\u0484\u044a\3\2\2\2\u0484\u044d\3\2\2\2\u0484\u0450\3\2\2\2\u0484"+
		"\u0453\3\2\2\2\u0484\u0456\3\2\2\2\u0484\u0459\3\2\2\2\u0484\u045c\3\2"+
		"\2\2\u0484\u045f\3\2\2\2\u0484\u0462\3\2\2\2\u0484\u0468\3\2\2\2\u0484"+
		"\u046d\3\2\2\2\u0484\u0474\3\2\2\2\u0484\u0477\3\2\2\2\u0484\u047f\3\2"+
		"\2\2\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u00cd\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048a\t\4\2\2\u048a\u00cf\3\2"+
		"\2\2G\u00d4\u00e0\u00e6\u00e9\u00f2\u00fd\u0100\u010a\u0113\u013f\u0148"+
		"\u014d\u0153\u0161\u0167\u0178\u0186\u018c\u0195\u019b\u01a8\u01b2\u01c2"+
		"\u01d0\u01e5\u01ed\u01fe\u0203\u021a\u0221\u0228\u024c\u0251\u0257\u0261"+
		"\u0266\u0270\u0280\u0286\u02a0\u02c1\u02d6\u02ec\u02f9\u0309\u0312\u031c"+
		"\u032a\u0334\u0338\u033e\u0351\u035a\u0376\u037b\u038e\u039a\u03af\u03bb"+
		"\u03c3\u03cd\u03da\u03e1\u03e6\u03f7\u03f9\u0426\u0484\u0486";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}