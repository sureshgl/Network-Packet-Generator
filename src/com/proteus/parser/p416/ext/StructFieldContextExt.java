package com.proteus.parser.p416.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.parser.p416.PopulateExtendedContextVisitor;
import com.proteus.parser.p416.gen.p416Parser.StructFieldContext;
import com.proteus.parser.p416.structures.Field;
import com.proteus.parser.p416.structures.SymbolTable;

public class StructFieldContextExt extends AbstractBaseExt{

	public StructFieldContextExt(StructFieldContext ctx) {
		addToContexts(ctx);
	}

	@Override
	public ParserRuleContext getContext(){
		return (StructFieldContext)contexts.get(contexts.size()-1);
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).structField());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StructFieldContext){
				addToContexts((StructFieldContext) ctx);
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StructFieldContext.class.getName());
			}
		} else {
			addToContexts(null);
		}
	}
	
	@Override
	protected void getFields(List<Field> fields,SymbolTable st){
		StructFieldContext ctx = (StructFieldContext) getContext();
		String name = ctx.name().extendedContext.getName();
		String type = ctx.typeRef().extendedContext.getSize();
		Field f;
		if(type == null){
			type = ctx.typeRef().extendedContext.getPrefixedType();
			f = new Field(name,type);
			f.setPrefixedType(true);
			if(st.isBasic(type)){
				f.setBasicTypeDef(true);
			} else {
				f.setBasicTypeDef(false);
			}
		} else{
			f = new Field(name,type);
			f.setPrefixedType(false);
		}
		fields.add(f);
	}
}
