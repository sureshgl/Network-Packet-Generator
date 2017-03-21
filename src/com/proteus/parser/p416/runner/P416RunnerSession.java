package com.proteus.parser.p416.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.proteus.common.util.FileUtils;
import com.proteus.parser.p416.gen.p416Parser.InputContext;
import com.proteus.parser.p416.structures.SymbolTable;
import com.proteus.parser.p416.utils.StatesInfo;
import com.proteus.parser.p416.utils.UtilsP416;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

@Data
public class P416RunnerSession {
	private static final Logger L = LoggerFactory.getLogger(P416RunnerSession.class);

	private final CommandLineParser clp;
	private P416Parser mp;
	private List<File> allFiles;

	private void index(){
		File dir = clp.getOutputDir();
		allFiles = FileUtils.allFilesInDir(dir.toString(), ".p4");
	}

	public void run(){
		index();
		if((clp.getOutputDir().exists() || clp.getOutputDir().mkdirs())){
			mp = new P416Parser();
			for(File file:allFiles){
				String text = FileUtils.readFileIntoString(file,"\n");
				InputContext ctx = mp.getModule(text, file.getName());
				StatesInfo spg = new StatesInfo();
				SymbolTable st = new SymbolTable();
				STGroupFile grp = new STGroupFile("src/com.proteus.parser/p416/runner/templateGroupFile.stg");
				ST stTop = grp.getInstanceOf("Top");
				List<ST> stmts = new ArrayList<ST>();
				initCpp(stmts,spg,grp,ctx,st);
				getTopApi(stmts,spg,grp,ctx,st);
				stTop.add("stmts", stmts);
				writeToFile(stTop.render());
			}
		}
	}

	private void initCpp(List<ST> stmts,StatesInfo spg, STGroupFile grp,InputContext ctx,SymbolTable st) {
		populateHeaders(stmts,grp);
		addError(stmts,grp,ctx);
		ctx.extendedContext.populateSTG(stmts,grp,spg, st);
	}
	
	private void addError(List<ST> stmts,STGroupFile grp,InputContext ctx){
		List<String> errors = new ArrayList<String>();
		ctx.extendedContext.populateErrors(errors);
		ST stError = grp.getInstanceOf("error");
		stError.add("errorlist",errors);
		stmts.add(stError);
	}

	private void getTopApi(List<ST> stmts,StatesInfo spg, STGroupFile grp,InputContext ctx,SymbolTable st) {
		ctx.extendedContext.populateParseSTG(stmts, null, grp, spg, st);
	}

	private void populateHeaders(List<ST> stmts, STGroupFile grp) {
		ST stheaders = grp.getInstanceOf("headers");
		List<String> headerslist = UtilsP416.getHeaders();
		stheaders.add("headerlist", headerslist);
		stmts.add(stheaders);
	}


	private void writeToFile(String processedText){
		File f = new File(clp.getOutputDir()+"/out.cpp");
		if(f.exists()){
			FileUtils.Delete(f, true);
		}
		FileUtils.CreateNewFile(f);
		FileUtils.AppendToFile(f, processedText);
	}


	public static void main(String[] args)
	{
		CommandLineParser clp = new CommandLineParser(new File("./").getAbsolutePath());
		P416RunnerSession proteusRunnerSession = new P416RunnerSession(clp);
		JCommander jCommander = new JCommander(clp);
		jCommander.parse(args);
		proteusRunnerSession.run();
	}
}

