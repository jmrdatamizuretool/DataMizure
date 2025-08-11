package com.jmr.batch.listener.loan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import javax.persistence.Column;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.ErrorLogVb;
import com.jmr.batch.entity.loan.TransCltbAcUdeUpload;
import com.jmr.batch.model.loan.TransCltbAcUdeUploadModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerCltbAcUdeUpload {
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
	public void skipInProcess(TransCltbAcUdeUploadModel transCltbAcUdeUploadModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "UDE_ID:\t" + transCltbAcUdeUploadModel.getUde_id() + "\tUDE_VALUE:"
				+ transCltbAcUdeUploadModel.getUde_value() + "\tSEQUENCE_NO:"
				+ transCltbAcUdeUploadModel.getSequence_no()+"\tException:"+th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransCltbAcUdeUpload transCltbAcUdeUpload, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		/*createFile(write_err_path,
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date() + ", "
						+ transCltbAcUdeUpload.getUde_id() + ", " + transCltbAcUdeUpload.getUde_value() + ", "
						+ transCltbAcUdeUpload.getExt_ref_no() + ", " + transCltbAcUdeUpload.getSequence_no());*/
		/*createFile(write_err_path, 
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date());*/
		String data = "UDE_ID:\t" + transCltbAcUdeUpload.getTransCltbAcUdeUploadPK().getUde_id() + "\tUDE_VALUE:"
				+ transCltbAcUdeUpload.getTransCltbAcUdeUploadPK().getUde_value() + "\tSEQUENCE_NO:"
				+ transCltbAcUdeUpload.getTransCltbAcUdeUploadPK().getSequence_no()+"\tException:"+th.getMessage();
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("CLTB_AC_UDE_UPLOAD");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}