package com.proteus.parser.p416.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.ParserStateContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class ParserStateContextExt extends AbstractBaseExt{

	public ParserStateContextExt(ParserStateContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (ParserStateContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parserState());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ParserStateContext){
				addToContexts((ParserStateContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ParserStateContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	@Override
	public void populateSTG(List<ST> stmts,STGroupFile grp, StatesInfo spg, SymbolTable st) {
		ParserStateContext ctx = (ParserStateContext) getContext();
		spg.add(ctx.name().extendedContext.getName(), ctx);
	}
}
