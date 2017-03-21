// Generated from p416.g4 by ANTLR 4.4
package com.proteus.parser.p416.gen;

	import com.proteus.parser.p416.ext.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link p416Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface p416Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link p416Parser#methodPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPrototype(@NotNull p416Parser.MethodPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull p416Parser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#simpleExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpressionList(@NotNull p416Parser.SimpleExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull p416Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#selectCaseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseList(@NotNull p416Parser.SelectCaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull p416Parser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull p416Parser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#statOrDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOrDeclList(@NotNull p416Parser.StatOrDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#dotPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotPrefix(@NotNull p416Parser.DotPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(@NotNull p416Parser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#controlDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlDeclaration(@NotNull p416Parser.ControlDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#optConstructorParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptConstructorParameters(@NotNull p416Parser.OptConstructorParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(@NotNull p416Parser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#stateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateExpression(@NotNull p416Parser.StateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull p416Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull p416Parser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserLocalElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserLocalElements(@NotNull p416Parser.ParserLocalElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#structField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructField(@NotNull p416Parser.StructFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#keysetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeysetExpression(@NotNull p416Parser.KeysetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull p416Parser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#controlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlBody(@NotNull p416Parser.ControlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#nonEmptyParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyParameterList(@NotNull p416Parser.NonEmptyParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#structFieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldList(@NotNull p416Parser.StructFieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#methodPrototypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPrototypes(@NotNull p416Parser.MethodPrototypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#packageTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageTypeDeclaration(@NotNull p416Parser.PackageTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#transitionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitionStatement(@NotNull p416Parser.TransitionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(@NotNull p416Parser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#selectCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCase(@NotNull p416Parser.SelectCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#nonTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTypeName(@NotNull p416Parser.NonTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#exitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStatement(@NotNull p416Parser.ExitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserTypeDeclaration(@NotNull p416Parser.ParserTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOrVoid(@NotNull p416Parser.TypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(@NotNull p416Parser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#headerStackType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderStackType(@NotNull p416Parser.HeaderStackTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#specializedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecializedType(@NotNull p416Parser.SpecializedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#actionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionList(@NotNull p416Parser.ActionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(@NotNull p416Parser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#matchKindDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchKindDeclaration(@NotNull p416Parser.MatchKindDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull p416Parser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#prefixedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedType(@NotNull p416Parser.PrefixedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(@NotNull p416Parser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserDeclaration(@NotNull p416Parser.ParserDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull p416Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#functionPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrototype(@NotNull p416Parser.FunctionPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#optAnnotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptAnnotations(@NotNull p416Parser.OptAnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(@NotNull p416Parser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull p416Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull p416Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#actionRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRef(@NotNull p416Parser.ActionRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#optTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTypeParameters(@NotNull p416Parser.OptTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull p416Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(@NotNull p416Parser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#objDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDeclaration(@NotNull p416Parser.ObjDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#assignmentOrMethodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOrMethodCallStatement(@NotNull p416Parser.AssignmentOrMethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull p416Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#keyElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyElementList(@NotNull p416Parser.KeyElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#optInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptInitializer(@NotNull p416Parser.OptInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserStates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserStates(@NotNull p416Parser.ParserStatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull p416Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull p416Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRef(@NotNull p416Parser.TypeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#externDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternDeclaration(@NotNull p416Parser.ExternDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserBlockStatement(@NotNull p416Parser.ParserBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull p416Parser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull p416Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(@NotNull p416Parser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull p416Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArg(@NotNull p416Parser.TypeArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(@NotNull p416Parser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#tupleKeysetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleKeysetExpression(@NotNull p416Parser.TupleKeysetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#prefixedNonTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedNonTypeName(@NotNull p416Parser.PrefixedNonTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserLocalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserLocalElement(@NotNull p416Parser.ParserLocalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#objDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjDeclarations(@NotNull p416Parser.ObjDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#tableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDeclaration(@NotNull p416Parser.TableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(@NotNull p416Parser.SwitchCasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#controlTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlTypeDeclaration(@NotNull p416Parser.ControlTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#headerUnionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderUnionDeclaration(@NotNull p416Parser.HeaderUnionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(@NotNull p416Parser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#simpleKeysetExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleKeysetExpression(@NotNull p416Parser.SimpleKeysetExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(@NotNull p416Parser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#typedefDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefDeclaration(@NotNull p416Parser.TypedefDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull p416Parser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull p416Parser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#nonEmptyArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArgList(@NotNull p416Parser.NonEmptyArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#statementOrDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementOrDeclaration(@NotNull p416Parser.StatementOrDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserStatement(@NotNull p416Parser.ParserStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiation(@NotNull p416Parser.InstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull p416Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserStatements(@NotNull p416Parser.ParserStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull p416Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#controlLocalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlLocalDeclaration(@NotNull p416Parser.ControlLocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#derivedTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedTypeDeclaration(@NotNull p416Parser.DerivedTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#errorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorDeclaration(@NotNull p416Parser.ErrorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#tupleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleType(@NotNull p416Parser.TupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#actionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDeclaration(@NotNull p416Parser.ActionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#structTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructTypeDeclaration(@NotNull p416Parser.StructTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull p416Parser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#keyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyElement(@NotNull p416Parser.KeyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#objInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjInitializer(@NotNull p416Parser.ObjInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#headerTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderTypeDeclaration(@NotNull p416Parser.HeaderTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#controlLocalDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlLocalDeclarations(@NotNull p416Parser.ControlLocalDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#parserState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserState(@NotNull p416Parser.ParserStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link p416Parser#selectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpression(@NotNull p416Parser.SelectExpressionContext ctx);
}