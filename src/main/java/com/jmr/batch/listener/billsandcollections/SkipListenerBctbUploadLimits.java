package com.jmr.batch.listener.billsandcollections;

import com.jmr.batch.entity.ErrorLogVb;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimits;
import com.jmr.batch.model.billsandcollections.TransBctbUploadLimitsModel;
import com.jmr.repository.ErrorLogRepository;
import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

@Component
public class SkipListenerBctbUploadLimits {

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
	public void skipInProcess(TransBctbUploadLimitsModel model, Throwable th) {
	    String path = getErrorLog();
	    String processErrPath = path + File.separator + "SkipInProcess.txt";

	    String data = "BRANCH_CODE:\t" + model.getBranch_code() +
	                  "\tSOURCE_REF:\t" + model.getSource_ref() +
	                  "\tPARTY_TYPE:\t" + model.getParty_type() +
	                  "\tOPERATION:\t" + model.getOperation() +
	                  "\tLINE:\t" + model.getLine() +
	                  "\tLIMIT_AMOUNT:\t" + model.getLimit_amount() +
	                  "\tException: " + th.getMessage();

	    createFile(processErrPath, data);
	}

	@OnSkipInWrite
	public void skipInWriter(TransBctbUploadLimits entity, Throwable th) {
	    String path = getErrorLog();
	    String writeErrPath = path + File.separator + "SkipInWrite.txt";

	    String data = "BRANCH_CODE:\t" + entity.getId().getBranchCode() +
	                  "\tSOURCE_CODE:\t" + entity.getId().getSourceCode() +
	                  "\tSOURCE_REF:\t" + entity.getId().getSourceRef() +
	                  "\tPARTY_TYPE:\t" + entity.getId().getPartyType() +
	                  "\tOPERATION:\t" + entity.getId().getOperation() +
	                  "\tLINE:\t" + entity.getLine() +
	                  "\tLIMIT_AMOUNT:\t" + entity.getLimitAmount() +
	                  "\tCONV_STATUS:\t" + entity.getConvStatus() +
	                  "\tException: " + th.getMessage();

	    createFile(writeErrPath, data);
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("BCTB_UPLOAD_LIMITS");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}
