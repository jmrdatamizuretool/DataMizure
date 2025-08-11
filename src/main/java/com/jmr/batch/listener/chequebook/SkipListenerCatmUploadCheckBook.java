package com.jmr.batch.listener.chequebook;

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
import com.jmr.batch.entity.chequebook.TransCatmUploadCheckBook;
import com.jmr.batch.model.checkbook.TransCatmUploadCheckBookModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerCatmUploadCheckBook {
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
	public void skipInProcess(TransCatmUploadCheckBookModel transCatmUploadCheckBookModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "BRANCH:\t" + transCatmUploadCheckBookModel.getBranch() + "\tACCOUNT:" +
				transCatmUploadCheckBookModel.getAccount() + "\tFIRST_CHECK_NO:" +transCatmUploadCheckBookModel.getFirst_check_no();

	th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransCatmUploadCheckBook transCatmUploadCheckBook, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		
		String data = "BRANCH:\\t" + transCatmUploadCheckBook.getId().getBranch()+ "\t:ACCOUNT"
				+ transCatmUploadCheckBook.getId().getAccount() + "\tFIRST_CHECK_NO:"
						+ transCatmUploadCheckBook.getId().getFirst_check_no()
						+ "\tException:"+th.getMessage();
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("CATM_UPLOAD_CHECK_BOOK");
		String errLogPath = errorLogVb.get().getError_log_path();
		//String	errLogPath = "E:\\JMR Infotech\\MigrationTool\\Documents\\CSV\\CHEQUEBOOK\\ErrorLog";
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}