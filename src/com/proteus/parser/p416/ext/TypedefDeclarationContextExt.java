package com.proteus.parser.p416.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.TypedefDeclarationContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class TypedefDeclarationContextExt extends AbstractBaseExt{

	public TypedefDeclarationContextExt(TypedefDeclarationContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (TypedefDeclarationContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).typedefDeclaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof TypedefDeclarationContext){
				addToContexts((TypedefDeclarationContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+TypedefDeclarationContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
    }
	
	
	public void populateSTG(List<ST> stmts,STGroupFile grp, StatesInfo spg, SymbolTable st) {
		TypedefDeclarationContext ctx = (TypedefDeclarationContext) getContext();
		ST sttypedef = grp.getInstanceOf("typedef");
		if(ctx.typeRef().baseType().BIT()!=null){
			sttypedef.add("type","rand_var");
			sttypedef.add("bvtype", "sc_bv");
			sttypedef.add("length",ctx.typeRef().extendedContext.getSize());
			sttypedef.add("name", ctx.name().extendedContext.getName());
		}
		stmts.add(sttypedef);
	}
}
