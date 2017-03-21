package com.proteus.parser.p416.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.common.util.Utils.Pair;
import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.ParserStateContext;
import com.proteus.parser.p416.gen.p416Parser.SelectExpressionContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class SelectExpressionContextExt extends AbstractBaseExt{

	public SelectExpressionContextExt(SelectExpressionContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (SelectExpressionContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).selectExpression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof SelectExpressionContext){
				addToContexts((SelectExpressionContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+SelectExpressionContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}

	@Override
	public void populateParseSTG(List<ST> stmts,Map<String, String> fields, STGroupFile grp, StatesInfo spg, SymbolTable st) {
		SelectExpressionContext ctx = (SelectExpressionContext) getContext();
		String[] expressions = ctx.expressionList().getText().split(",");
		if(expressions.length>1){
			L.error("More than 1 expression in select"); 
		}
		String rhs = expressions[0];
		String type = st.getType(rhs);
		List<Pair<String,String>> cases = new ArrayList<Pair<String,String>>();
		ctx.selectCaseList().extendedContext.getCases(cases,spg);
		ST ifObj = getIfObj(cases.get(0),type,grp);
		processState(cases.get(0).second(),spg,ifObj,grp,st,fields);
		stmts.add(ifObj);
		for(int i=1;i<cases.size();i++){
			ST stToAdd = getElseST(cases.get(i),type,spg,grp,st,fields);
			stmts.add(stToAdd);
		}
	}

	private ST getCond(Pair<String,String> case_,String type,STGroupFile grp){
		ST ifCond = grp.getInstanceOf("ifCond");
		ifCond.add("select", case_.first());
		ifCond.add("objecttype", type);
		return ifCond;
	}
	
	private ST getIfObj(Pair<String,String> case_,String type,STGroupFile grp){
		ST ifObj = grp.getInstanceOf("ifObj");
		ifObj.add("conditions",getCond(case_, type, grp));
		return ifObj;
	}

	private ST getElseST(Pair<String,String> case_,String type,StatesInfo spg,STGroupFile grp,SymbolTable st,Map<String, String> fields){
		ST elseObj = grp.getInstanceOf("elseObj");
		if(case_.first().equals("default")){
			elseObj.add("hasif", false);
			processState(case_.second(),spg,elseObj,grp,st,fields);
		} else {
			ST ifObj = getIfObj(case_, type, grp);
			processState(case_.second(),spg,ifObj,grp,st,fields);
			elseObj.add("hasif", true);
			elseObj.add("ifObj", ifObj);
		}
		return elseObj;
	}

	private void processState(String name,StatesInfo spg,ST stobj,STGroupFile grp,SymbolTable st,Map<String, String> fields){
		if(!spg.contains(name)){
			L.error("state not found : "+name);
		}
		ParserStateContext parserStateContext = spg.getState(name);
		List<ST> stmts = new ArrayList<ST>();
		parserStateContext.extendedContext.populateParseSTG(stmts,fields,grp,spg, st);
		stobj.add("stmts", stmts);
	}
}
