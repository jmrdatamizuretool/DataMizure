package com.jmr.batch.listener.billsandcollections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;

import com.jmr.batch.entity.ErrorLogVb;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocsClauses;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDocsClausesModel;
import com.jmr.repository.ErrorLogRepository;

public class SkipListenerBctbUploadDocsClauses {
	
	@Autowired
	private ErrorLogRepository repo;
	@OnSkipInRead
	public void skipInRead(Throwable th) {
		
		String path = getErrorLog();
		String read_err_path = path + System.getProperty("file.separator") + "SkipInRead.txt";
		File readErrFile = new File(read_err_path);
		if (!readErrFile.exists()) {
			try {
				readErrFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(th instanceof FlatFileParseException) {
		createFileRead(readErrFile.getAbsolutePath(), ((FlatFileParseException) th).getInput(),
				((FlatFileParseException) th).getLineNumber());
		}
	}
	
	
	 @OnSkipInProcess
	    public void skipInProcess(TransBctbUploadDocsClausesModel model, Throwable th) {
	        String path = getErrorLog();
	        String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";

	        String data = "SOURCE_CODE:\t" + model.getSource_code() + "\tSOURCE_CODE:" +
	                      "BRANCH_CODE:\t" + model.getBranch_code() + "\tBRANCH_CODE:" +
	                      "SOURCE_REF:\t" + model.getSource_ref() + "\tSOURCE_REF:" +
	                      "SOURCE_SEQ_NO:\t" + model.getSource_seq_no() + "\tSOURCE_SEQ_NO:" +
	                      "DOC_CODE:\t" + model.getDoc_code() + "\tDOC_CODE:" +
	                      "CLAUSE_CODE:\t" + model.getClause_code() + "\tCLAUSE_CODE:" +
	                      "\tException:" + th.getMessage();

	        createFileProcess(process_err_path, data);
	    }

	    @OnSkipInWrite
	    public void skipInWriter(TransBctbUploadDocsClauses entity, Throwable th) {
	        String path = getErrorLog();
	        String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";

	        String data = "SOURCE_CODE:\t" + entity.getTransBctbUploadDocsClausesPK().getSourceCode() + "\tSOURCE_CODE:" +
	                      "BRANCH_CODE:\t" + entity.getTransBctbUploadDocsClausesPK().getBranchCode() + "\tBRANCH_CODE:" +
	                      "SOURCE_REF:\t" + entity.getTransBctbUploadDocsClausesPK().getSourceRef() + "\tSOURCE_REF:" +
	                      "SOURCE_SEQ_NO:\t" + entity.getTransBctbUploadDocsClausesPK().getSourceSeqNo() + "\tSOURCE_SEQ_NO:" +
	                      "DOC_CODE:\t" + entity.getTransBctbUploadDocsClausesPK().getDocCode() + "\tDOC_CODE:" +
	                      "CLAUSE_CODE:\t" + entity.getTransBctbUploadDocsClausesPK().getClauseCode() + "\tCLAUSE_CODE:" +
	                      "\tException:" + th.getMessage();

	        createFile(write_err_path, data);
	    }
	
	public void createFileRead(String filePath, String data, int line) {
		try(FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write("Line number "+line+",\t"+data + ", Date:" + new Date() + "\n");
		}catch(Exception e) {
			
		}
	}
	public void createFile(String filePath, String data) {
		try(FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write(data + ",\tDate:" + new Date() + "\n");
		}catch(Exception e) {
			
		}
	}
	public void createFileProcess(String filePath, String data) {
		
		try(FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write(data + ",\tDate:" + new Date() + "\n");
		}catch(Exception e) {
			
		}
	}
	public String getErrorLog() {
		Optional<ErrorLogVb> errorLogVb = repo.findById("BCTB_UPLOAD_PARTIES_ADDRESSES");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}

}
