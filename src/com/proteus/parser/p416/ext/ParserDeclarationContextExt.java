package com.proteus.parser.p416.ext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.ParserDeclarationContext;
import com.proteus.parser.p416.gen.p416Parser.ParserStateContext;
import com.proteus.parser.p416.gen.p416Parser.ParserTypeDeclarationContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class ParserDeclarationContextExt extends AbstractBaseExt{

	public ParserDeclarationContextExt(ParserDeclarationContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (ParserDeclarationContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parserDeclaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ParserDeclarationContext){
				addToContexts((ParserDeclarationContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ParserDeclarationContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	
	@Override
	public void populateParseSTG(List<ST> stmts,Map<String, String> fields, STGroupFile grp, StatesInfo spg, SymbolTable st) {
		ParserDeclarationContext ctx = (ParserDeclarationContext) getContext();
		ST packetHeader = grp.getInstanceOf("PacketHeader");
		ST parserApi = grp.getInstanceOf("parserApi");
		Map<String,String> parameters = new HashMap<String,String>();
		ctx.parserTypeDeclaration().extendedContext.getInputParameters(parameters);
		for(String key : parameters.keySet()){
			st.put(key, parameters.get(key));
		}
		List<ST> stmts_1 = new ArrayList<ST>();
		fields = new HashMap<String,String>();
		ParserStateContext parserStateContext = spg.getState("start");
		parserStateContext.extendedContext.populateParseSTG(stmts_1,fields,grp,spg, st);
		parserApi.add("stmts", stmts_1);
		packetHeader.add("parserApi",parserApi);
		packetHeader.add("fieldsMap",fields);
		stmts.add(packetHeader);
		for(String key:parameters.keySet()){
			st.remove(key);
		}
	}
}
