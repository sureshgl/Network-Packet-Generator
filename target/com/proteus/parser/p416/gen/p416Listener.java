// Generated from p416.g4 by ANTLR 4.4
package com.proteus.parser.p416.gen;

	import com.proteus.parser.p416.ext.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link p416Parser}.
 */
public interface p416Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link p416Parser#methodPrototype}.
	 * @param ctx the parse tree
	 */
	void enterMethodPrototype(@NotNull p416Parser.MethodPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#methodPrototype}.
	 * @param ctx the parse tree
	 */
	void exitMethodPrototype(@NotNull p416Parser.MethodPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull p416Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull p416Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#simpleExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpressionList(@NotNull p416Parser.SimpleExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#simpleExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpressionList(@NotNull p416Parser.SimpleExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull p416Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull p416Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#selectCaseList}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseList(@NotNull p416Parser.SelectCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#selectCaseList}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseList(@NotNull p416Parser.SelectCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull p416Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull p416Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull p416Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull p416Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#statOrDeclList}.
	 * @param ctx the parse tree
	 */
	void enterStatOrDeclList(@NotNull p416Parser.StatOrDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#statOrDeclList}.
	 * @param ctx the parse tree
	 */
	void exitStatOrDeclList(@NotNull p416Parser.StatOrDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#dotPrefix}.
	 * @param ctx the parse tree
	 */
	void enterDotPrefix(@NotNull p416Parser.DotPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#dotPrefix}.
	 * @param ctx the parse tree
	 */
	void exitDotPrefix(@NotNull p416Parser.DotPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull p416Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull p416Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#controlDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterControlDeclaration(@NotNull p416Parser.ControlDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#controlDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitControlDeclaration(@NotNull p416Parser.ControlDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#optConstructorParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptConstructorParameters(@NotNull p416Parser.OptConstructorParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#optConstructorParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptConstructorParameters(@NotNull p416Parser.OptConstructorParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(@NotNull p416Parser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(@NotNull p416Parser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#stateExpression}.
	 * @param ctx the parse tree
	 */
	void enterStateExpression(@NotNull p416Parser.StateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#stateExpression}.
	 * @param ctx the parse tree
	 */
	void exitStateExpression(@NotNull p416Parser.StateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull p416Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull p416Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull p416Parser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull p416Parser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserLocalElements}.
	 * @param ctx the parse tree
	 */
	void enterParserLocalElements(@NotNull p416Parser.ParserLocalElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserLocalElements}.
	 * @param ctx the parse tree
	 */
	void exitParserLocalElements(@NotNull p416Parser.ParserLocalElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#structField}.
	 * @param ctx the parse tree
	 */
	void enterStructField(@NotNull p416Parser.StructFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#structField}.
	 * @param ctx the parse tree
	 */
	void exitStructField(@NotNull p416Parser.StructFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#keysetExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeysetExpression(@NotNull p416Parser.KeysetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#keysetExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeysetExpression(@NotNull p416Parser.KeysetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull p416Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull p416Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#controlBody}.
	 * @param ctx the parse tree
	 */
	void enterControlBody(@NotNull p416Parser.ControlBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#controlBody}.
	 * @param ctx the parse tree
	 */
	void exitControlBody(@NotNull p416Parser.ControlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#nonEmptyParameterList}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyParameterList(@NotNull p416Parser.NonEmptyParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#nonEmptyParameterList}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyParameterList(@NotNull p416Parser.NonEmptyParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#structFieldList}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldList(@NotNull p416Parser.StructFieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#structFieldList}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldList(@NotNull p416Parser.StructFieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#methodPrototypes}.
	 * @param ctx the parse tree
	 */
	void enterMethodPrototypes(@NotNull p416Parser.MethodPrototypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#methodPrototypes}.
	 * @param ctx the parse tree
	 */
	void exitMethodPrototypes(@NotNull p416Parser.MethodPrototypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#packageTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageTypeDeclaration(@NotNull p416Parser.PackageTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#packageTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageTypeDeclaration(@NotNull p416Parser.PackageTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#transitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransitionStatement(@NotNull p416Parser.TransitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#transitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransitionStatement(@NotNull p416Parser.TransitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(@NotNull p416Parser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(@NotNull p416Parser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#selectCase}.
	 * @param ctx the parse tree
	 */
	void enterSelectCase(@NotNull p416Parser.SelectCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#selectCase}.
	 * @param ctx the parse tree
	 */
	void exitSelectCase(@NotNull p416Parser.SelectCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#nonTypeName}.
	 * @param ctx the parse tree
	 */
	void enterNonTypeName(@NotNull p416Parser.NonTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#nonTypeName}.
	 * @param ctx the parse tree
	 */
	void exitNonTypeName(@NotNull p416Parser.NonTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void enterExitStatement(@NotNull p416Parser.ExitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#exitStatement}.
	 * @param ctx the parse tree
	 */
	void exitExitStatement(@NotNull p416Parser.ExitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParserTypeDeclaration(@NotNull p416Parser.ParserTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParserTypeDeclaration(@NotNull p416Parser.ParserTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeOrVoid(@NotNull p416Parser.TypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeOrVoid(@NotNull p416Parser.TypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull p416Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull p416Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#headerStackType}.
	 * @param ctx the parse tree
	 */
	void enterHeaderStackType(@NotNull p416Parser.HeaderStackTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#headerStackType}.
	 * @param ctx the parse tree
	 */
	void exitHeaderStackType(@NotNull p416Parser.HeaderStackTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#specializedType}.
	 * @param ctx the parse tree
	 */
	void enterSpecializedType(@NotNull p416Parser.SpecializedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#specializedType}.
	 * @param ctx the parse tree
	 */
	void exitSpecializedType(@NotNull p416Parser.SpecializedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#actionList}.
	 * @param ctx the parse tree
	 */
	void enterActionList(@NotNull p416Parser.ActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#actionList}.
	 * @param ctx the parse tree
	 */
	void exitActionList(@NotNull p416Parser.ActionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull p416Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull p416Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#matchKindDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMatchKindDeclaration(@NotNull p416Parser.MatchKindDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#matchKindDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMatchKindDeclaration(@NotNull p416Parser.MatchKindDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull p416Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull p416Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#prefixedType}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedType(@NotNull p416Parser.PrefixedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#prefixedType}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedType(@NotNull p416Parser.PrefixedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull p416Parser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull p416Parser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParserDeclaration(@NotNull p416Parser.ParserDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParserDeclaration(@NotNull p416Parser.ParserDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull p416Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull p416Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#functionPrototype}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrototype(@NotNull p416Parser.FunctionPrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#functionPrototype}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrototype(@NotNull p416Parser.FunctionPrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#optAnnotations}.
	 * @param ctx the parse tree
	 */
	void enterOptAnnotations(@NotNull p416Parser.OptAnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#optAnnotations}.
	 * @param ctx the parse tree
	 */
	void exitOptAnnotations(@NotNull p416Parser.OptAnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull p416Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull p416Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull p416Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull p416Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull p416Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull p416Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#actionRef}.
	 * @param ctx the parse tree
	 */
	void enterActionRef(@NotNull p416Parser.ActionRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#actionRef}.
	 * @param ctx the parse tree
	 */
	void exitActionRef(@NotNull p416Parser.ActionRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#optTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterOptTypeParameters(@NotNull p416Parser.OptTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#optTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitOptTypeParameters(@NotNull p416Parser.OptTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull p416Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull p416Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(@NotNull p416Parser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(@NotNull p416Parser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#objDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjDeclaration(@NotNull p416Parser.ObjDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#objDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjDeclaration(@NotNull p416Parser.ObjDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#assignmentOrMethodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOrMethodCallStatement(@NotNull p416Parser.AssignmentOrMethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#assignmentOrMethodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOrMethodCallStatement(@NotNull p416Parser.AssignmentOrMethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull p416Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull p416Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#keyElementList}.
	 * @param ctx the parse tree
	 */
	void enterKeyElementList(@NotNull p416Parser.KeyElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#keyElementList}.
	 * @param ctx the parse tree
	 */
	void exitKeyElementList(@NotNull p416Parser.KeyElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#optInitializer}.
	 * @param ctx the parse tree
	 */
	void enterOptInitializer(@NotNull p416Parser.OptInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#optInitializer}.
	 * @param ctx the parse tree
	 */
	void exitOptInitializer(@NotNull p416Parser.OptInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserStates}.
	 * @param ctx the parse tree
	 */
	void enterParserStates(@NotNull p416Parser.ParserStatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserStates}.
	 * @param ctx the parse tree
	 */
	void exitParserStates(@NotNull p416Parser.ParserStatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull p416Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull p416Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull p416Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull p416Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterTypeRef(@NotNull p416Parser.TypeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitTypeRef(@NotNull p416Parser.TypeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#externDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternDeclaration(@NotNull p416Parser.ExternDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#externDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternDeclaration(@NotNull p416Parser.ExternDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterParserBlockStatement(@NotNull p416Parser.ParserBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitParserBlockStatement(@NotNull p416Parser.ParserBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull p416Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull p416Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull p416Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull p416Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(@NotNull p416Parser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(@NotNull p416Parser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull p416Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull p416Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeArg}.
	 * @param ctx the parse tree
	 */
	void enterTypeArg(@NotNull p416Parser.TypeArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeArg}.
	 * @param ctx the parse tree
	 */
	void exitTypeArg(@NotNull p416Parser.TypeArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(@NotNull p416Parser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(@NotNull p416Parser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#tupleKeysetExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleKeysetExpression(@NotNull p416Parser.TupleKeysetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#tupleKeysetExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleKeysetExpression(@NotNull p416Parser.TupleKeysetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#prefixedNonTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedNonTypeName(@NotNull p416Parser.PrefixedNonTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#prefixedNonTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedNonTypeName(@NotNull p416Parser.PrefixedNonTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserLocalElement}.
	 * @param ctx the parse tree
	 */
	void enterParserLocalElement(@NotNull p416Parser.ParserLocalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserLocalElement}.
	 * @param ctx the parse tree
	 */
	void exitParserLocalElement(@NotNull p416Parser.ParserLocalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#objDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterObjDeclarations(@NotNull p416Parser.ObjDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#objDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitObjDeclarations(@NotNull p416Parser.ObjDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#tableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTableDeclaration(@NotNull p416Parser.TableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#tableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTableDeclaration(@NotNull p416Parser.TableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(@NotNull p416Parser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(@NotNull p416Parser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#controlTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterControlTypeDeclaration(@NotNull p416Parser.ControlTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#controlTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitControlTypeDeclaration(@NotNull p416Parser.ControlTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#headerUnionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHeaderUnionDeclaration(@NotNull p416Parser.HeaderUnionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#headerUnionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHeaderUnionDeclaration(@NotNull p416Parser.HeaderUnionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(@NotNull p416Parser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(@NotNull p416Parser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#simpleKeysetExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleKeysetExpression(@NotNull p416Parser.SimpleKeysetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#simpleKeysetExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleKeysetExpression(@NotNull p416Parser.SimpleKeysetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(@NotNull p416Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(@NotNull p416Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedefDeclaration(@NotNull p416Parser.TypedefDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#typedefDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedefDeclaration(@NotNull p416Parser.TypedefDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(@NotNull p416Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(@NotNull p416Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull p416Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull p416Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#nonEmptyArgList}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyArgList(@NotNull p416Parser.NonEmptyArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#nonEmptyArgList}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyArgList(@NotNull p416Parser.NonEmptyArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#statementOrDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrDeclaration(@NotNull p416Parser.StatementOrDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#statementOrDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrDeclaration(@NotNull p416Parser.StatementOrDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserStatement}.
	 * @param ctx the parse tree
	 */
	void enterParserStatement(@NotNull p416Parser.ParserStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserStatement}.
	 * @param ctx the parse tree
	 */
	void exitParserStatement(@NotNull p416Parser.ParserStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(@NotNull p416Parser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(@NotNull p416Parser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull p416Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull p416Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserStatements}.
	 * @param ctx the parse tree
	 */
	void enterParserStatements(@NotNull p416Parser.ParserStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserStatements}.
	 * @param ctx the parse tree
	 */
	void exitParserStatements(@NotNull p416Parser.ParserStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull p416Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull p416Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#controlLocalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterControlLocalDeclaration(@NotNull p416Parser.ControlLocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#controlLocalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitControlLocalDeclaration(@NotNull p416Parser.ControlLocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#derivedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDerivedTypeDeclaration(@NotNull p416Parser.DerivedTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#derivedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDerivedTypeDeclaration(@NotNull p416Parser.DerivedTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#errorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterErrorDeclaration(@NotNull p416Parser.ErrorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#errorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitErrorDeclaration(@NotNull p416Parser.ErrorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(@NotNull p416Parser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(@NotNull p416Parser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterActionDeclaration(@NotNull p416Parser.ActionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#actionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitActionDeclaration(@NotNull p416Parser.ActionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#structTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructTypeDeclaration(@NotNull p416Parser.StructTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#structTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructTypeDeclaration(@NotNull p416Parser.StructTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull p416Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull p416Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#keyElement}.
	 * @param ctx the parse tree
	 */
	void enterKeyElement(@NotNull p416Parser.KeyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#keyElement}.
	 * @param ctx the parse tree
	 */
	void exitKeyElement(@NotNull p416Parser.KeyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#objInitializer}.
	 * @param ctx the parse tree
	 */
	void enterObjInitializer(@NotNull p416Parser.ObjInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#objInitializer}.
	 * @param ctx the parse tree
	 */
	void exitObjInitializer(@NotNull p416Parser.ObjInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#headerTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHeaderTypeDeclaration(@NotNull p416Parser.HeaderTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#headerTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHeaderTypeDeclaration(@NotNull p416Parser.HeaderTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#controlLocalDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterControlLocalDeclarations(@NotNull p416Parser.ControlLocalDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#controlLocalDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitControlLocalDeclarations(@NotNull p416Parser.ControlLocalDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#parserState}.
	 * @param ctx the parse tree
	 */
	void enterParserState(@NotNull p416Parser.ParserStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#parserState}.
	 * @param ctx the parse tree
	 */
	void exitParserState(@NotNull p416Parser.ParserStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link p416Parser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpression(@NotNull p416Parser.SelectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link p416Parser#selectExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpression(@NotNull p416Parser.SelectExpressionContext ctx);
}