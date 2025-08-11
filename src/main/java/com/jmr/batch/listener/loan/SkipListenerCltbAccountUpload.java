package com.jmr.batch.listener.loan;

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
import com.jmr.batch.entity.loan.TransCltbAccountUpload;
import com.jmr.batch.model.loan.TransCltbAccountUploadModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerCltbAccountUpload {
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
	public void skipInProcess(TransCltbAccountUploadModel transCltbAccountUploadModel, Throwable th) {
		String path = getErrorLog();
		System.out.println(th.getMessage());
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		createFile(process_err_path, 
				transCltbAccountUploadModel.getAccount_number());
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransCltbAccountUpload transCltbAccountUpload, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		/*createFile(write_err_path,
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date() + ", "
						+ transCltbAcUdeUpload.getUde_id() + ", " + transCltbAcUdeUpload.getUde_value() + ", "
						+ transCltbAcUdeUpload.getExt_ref_no() + ", " + transCltbAcUdeUpload.getSequence_no());*/
		createFile(write_err_path,
				transCltbAccountUpload.getAccountNumber());
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
	public String getErrorLog() {
		Optional<ErrorLogVb> errorLogVb = repo.findById("CLTB_ACCOUNT_UPLOAD");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}