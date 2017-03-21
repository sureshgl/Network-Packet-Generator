package com.proteus.parser.p416.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.common.util.Utils.Pair;
import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.SelectCaseContext;
import com.proteus.parser.p416.utils.StatesInfo;

public class SelectCaseContextExt extends AbstractBaseExt{

	public SelectCaseContextExt(SelectCaseContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (SelectCaseContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).selectCase());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof SelectCaseContext){
				addToContexts((SelectCaseContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+SelectCaseContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}

	@Override
	protected void getCases(List<Pair<String, String>> cases,StatesInfo statesPathGenerator) {
		SelectCaseContext ctx = (SelectCaseContext) getContext();
		if(ctx.keysetExpression().extendedContext.hasMany()){
			L.warn("multiple values in keys while transitioning");
		} else {
			String name = ctx.name().extendedContext.getName();
			if(!name.equals("accept")){
				if(!statesPathGenerator.contains(name)){
					L.warn("trying to transition to "+name+"; Not a valid State");
				}
				cases.add(Pair.of(ctx.keysetExpression().getText(),name));
			}
		}
	}
}
