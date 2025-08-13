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
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.ErrorLogVb;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAssigneeDetails;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAssigneeDetailsModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerBctbUploadAssigneeDetails {
	
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
    public void skipInProcess(TransBctbUploadAssigneeDetailsModel model, Throwable th) {
        String path = getErrorLog();
        String processErrPath = path + File.separator + "SkipInProcess.txt";

        String data = "BRANCH_CODE:\t" + model.getBranch_code() +
                      "\tSOURCE_CODE:\t" + model.getSource_code() +
                      "\tSOURCE_REF:\t" + model.getSource_ref() +
                      "\tSOURCE_SEQ_NO:\t" + model.getSource_seq_no() +
                      "\tSEQUENCE:\t" + model.getSequence() +
                      "\tException: " + th.getMessage();

        createFile(processErrPath, data);
    }

    @OnSkipInWrite
    public void skipInWriter(TransBctbUploadAssigneeDetails entity, Throwable th) {
        String path = getErrorLog();
        String writeErrPath = path + File.separator + "SkipInWrite.txt";

        String data = "BRANCH_CODE:\t" + entity.getTransBctbUploadAssigneeDetailsPK().getBranchCode() +
                      "\tSOURCE_CODE:\t" + entity.getTransBctbUploadAssigneeDetailsPK().getSourceCode() +
                      "\tSOURCE_REF:\t" + entity.getTransBctbUploadAssigneeDetailsPK().getSourceRef() +
                      "\tSOURCE_SEQ_NO:\t" + entity.getTransBctbUploadAssigneeDetailsPK().getSourceSeqNo() +
                      "\tSEQUENCE:\t" + entity.getTransBctbUploadAssigneeDetailsPK().getSequence() +
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("BCTB_UPLOAD_ASSIGNEE_DETAILS");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}

}
