package com.jmr.batch.listener.casabalance;

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
import com.jmr.batch.entity.casabalance.TransDetbUploadMasterCasabal;
import com.jmr.batch.model.casabalance.TransDetbUploadMasterCasabalModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class skipListenerDetbUploadMasterCasabal {
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
	public void skipInProcess(TransDetbUploadMasterCasabalModel transDetbUploadMasterCasabalModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "BRANCH_CODE:\t" + transDetbUploadMasterCasabalModel.getBranch_code() + "\tBRANCH_CODE:" +
		"BATCH_NO:\t" + transDetbUploadMasterCasabalModel.getBatch_no() + "\tBATCH_NO:" +

	th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransDetbUploadMasterCasabal transDetbUploadMasterCasabal, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		/*createFile(write_err_path,
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date() + ", "
						+ transCltbAcUdeUpload.getUde_id() + ", " + transCltbAcUdeUpload.getUde_value() + ", "
						+ transCltbAcUdeUpload.getExt_ref_no() + ", " + transCltbAcUdeUpload.getSequence_no());*/
		/*createFile(write_err_path, 
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date());*/
		String data = "BRANCH_CODE:\\t" + transDetbUploadMasterCasabal.getId().getBranchCode() + "\t:BRANCH_CODE"
				+ transDetbUploadMasterCasabal.getId().getBatchNo() + "\tBATCH_NO:"
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("DETB_UPLOAD_DETAIL");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}