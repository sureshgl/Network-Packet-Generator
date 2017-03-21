package com.proteus.parser.p416.ext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.HeaderTypeDeclarationContext;
import com.proteus.parser.p416.structures.Field;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;

public class HeaderTypeDeclarationContextExt extends AbstractBaseExt{

	public HeaderTypeDeclarationContextExt(HeaderTypeDeclarationContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (HeaderTypeDeclarationContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).headerTypeDeclaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof HeaderTypeDeclarationContext){
				addToContexts((HeaderTypeDeclarationContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+HeaderTypeDeclarationContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	@Override
	public void populateSTG(List<ST> stmts,STGroupFile grp, StatesInfo spg, SymbolTable st) {
		HeaderTypeDeclarationContext ctx = (HeaderTypeDeclarationContext) getContext();
		ST stclass = grp.getInstanceOf("classDef");
		List<String> extendedClassList = new ArrayList<String>();
		extendedClassList.add("rand_obj_base");
		String name = ctx.name().extendedContext.getName();
		stclass.add("classname",name);
		stclass.add("extendedClassList",extendedClassList);
		List<Field> fields = new ArrayList<Field>();
		ctx.structFieldList().extendedContext.getFields(fields,st);
		Map<String,String> fieldsMap = new HashMap<String,String>();
		for(Field field:fields){
			String key = name+"."+field.getName();
			String value = field.getPrefixedTypeOrDef();
			st.put(key, value);
			if(field.isPrefixedType()){
				fieldsMap.put(field.getName(), field.getPrefixedTypeOrDef());
			}else{
				fieldsMap.put(field.getName(), "rand_var< sc_bv < "+field.getType()+" > > ");
			}
		}
		stclass.add("fieldsMap",fieldsMap);
		stmts.add(stclass);
	}
	
}
