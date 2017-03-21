package com.proteus.parser.p416.ext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.StructTypeDeclarationContext;
import com.proteus.parser.p416.structures.Field;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class StructTypeDeclarationContextExt extends AbstractBaseExt{

	public StructTypeDeclarationContextExt(StructTypeDeclarationContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (StructTypeDeclarationContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).structTypeDeclaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StructTypeDeclarationContext){
				addToContexts((StructTypeDeclarationContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StructTypeDeclarationContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	@Override
	public void populateSTG(List<ST> stmts,STGroupFile grp, StatesInfo spg, SymbolTable st) {
		StructTypeDeclarationContext ctx = (StructTypeDeclarationContext) getContext();
		String name = ctx.name().extendedContext.getName();
		List<Field> fields = new ArrayList<Field>();
		ctx.structFieldList().extendedContext.getFields(fields,st);
		for(Field field:fields){
			String key = name+"."+field.getName();
			String value = field.getPrefixedTypeOrDef();
			st.put(key, value);
		}
	}
}
