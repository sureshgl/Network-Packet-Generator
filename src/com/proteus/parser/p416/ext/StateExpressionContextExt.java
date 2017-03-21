package com.proteus.parser.p416.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.ParserStateContext;
import com.proteus.parser.p416.gen.p416Parser.StateExpressionContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class StateExpressionContextExt extends AbstractBaseExt{

	public StateExpressionContextExt(StateExpressionContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (StateExpressionContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).stateExpression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StateExpressionContext){
				addToContexts((StateExpressionContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StateExpressionContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	
	@Override
	public void populateParseSTG(List<ST> stmts,Map<String, String> fields, STGroupFile grp, StatesInfo spg, SymbolTable st) {
		StateExpressionContext ctx = (StateExpressionContext) getContext();
		if(ctx.name() != null && !ctx.name().getText().equals("")){
			if(!ctx.name().getText().equals("accept")){
				String name = ctx.name().getText();
				ParserStateContext parserStateContext = spg.getState(name);
				parserStateContext.extendedContext.populateParseSTG(stmts, fields, grp, spg, st);
			}
		} else {
			super.populateParseSTG(stmts, fields, grp, spg, st);
		}
	}
}
