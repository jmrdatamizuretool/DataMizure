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
import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokMaster;
import com.jmr.batch.model.billsandcollections.TransBctbUploadBrokMasterModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerBctbUploadBrokMaster {
	
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
    public void skipInProcess(TransBctbUploadBrokMasterModel model, Throwable th) {
        String path = getErrorLog();
        String processErrPath = path + System.getProperty("file.separator") + "SkipInProcess.txt";

        String data = "BRANCH_CODE:\t" + model.getBranch_code() +
                      "\tSOURCE_CODE:\t" + model.getSource_code() +
                      "\tSOURCE_REF:\t" + model.getSource_ref() +
                      "\tSOURCE_SEQ_NO:\t" + model.getSource_seq_no() +
                      "\tException:" + th.getMessage();

        createFileProcess(processErrPath, data);
    }

    @OnSkipInWrite
    public void skipInWriter(TransBctbUploadBrokMaster entity, Throwable th) {
        String path = getErrorLog();
        String writeErrPath = path + System.getProperty("file.separator") + "SkipInWrite.txt";

        String data = "BRANCH_CODE:\t" + entity.getTransBctbUploadBrokMasterPK().getBranchCode() +
                      "\tSOURCE_CODE:\t" + entity.getTransBctbUploadBrokMasterPK().getSourceCode() +
                      "\tSOURCE_REF:\t" + entity.getTransBctbUploadBrokMasterPK().getSourceRef() +
                      "\tSOURCE_SEQ_NO:\t" + entity.getTransBctbUploadBrokMasterPK().getSourceSeqNo() +
                      "\tException:" + th.getMessage();

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
		Optional<ErrorLogVb> errorLogVb = repo.findById("BCTB_UPLOAD_BROK_MASTER");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}

}
