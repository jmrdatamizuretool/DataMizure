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
import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpd;
import com.jmr.batch.model.loan.TransCltbAccColllnkdtlUpdModel;
import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpdPK;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerCltbAccColllnkdtlUpd {
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
	public void skipInProcess(TransCltbAccColllnkdtlUpdModel transCltbAccColllnkdtlUpdModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "BRANCH_CODE:\t" + transCltbAccColllnkdtlUpdModel.getBranch_code() + "\tBRANCH_CODE:" +
		"LINKAGE_TYPE:\t" + transCltbAccColllnkdtlUpdModel.getLinkage_type() + "\tLINKAGE_TYPE:" +
		"LINKED_REFERENCE_NO:\t" + transCltbAccColllnkdtlUpdModel.getLinked_reference_no() + "\tLINKED_REFERENCE_NO:" +
		"PROCESS_CODE:\t" + transCltbAccColllnkdtlUpdModel.getProcess_code() + "\tPROCESS_CODE:" +
		"EXT_REF_NO:\t" + transCltbAccColllnkdtlUpdModel.getExt_ref_no() + "\tEXT_REF_NO:" +
		"SEQUENCE_NO:\t" + transCltbAccColllnkdtlUpdModel.getSequence_no() + "\tSEQUENCE_NO:" +
	th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransCltbAccColllnkdtlUpd transCltbAccColllnkdtlUpd, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		/*createFile(write_err_path,
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date() + ", "
						+ transCltbAcUdeUpload.getUde_id() + ", " + transCltbAcUdeUpload.getUde_value() + ", "
						+ transCltbAcUdeUpload.getExt_ref_no() + ", " + transCltbAcUdeUpload.getSequence_no());*/
		/*createFile(write_err_path, 
				transCltbAcUdeUpload.getBranch_code() + ", " + transCltbAcUdeUpload.getEffective_date());*/
		String data = "BRANCH_CODE:\\t" + transCltbAccColllnkdtlUpd.getId().getBranchCode() + "\t:BRANCH_CODE"
				+ transCltbAccColllnkdtlUpd.getId().getLinkedReferenceNo() + "\tLINKED_REFERENCE_NO:"
						+ transCltbAccColllnkdtlUpd.getId().getProcessCode() + "\t:PROCESS_CODE"
								+ transCltbAccColllnkdtlUpd.getId().getLinkedReferenceNo() + "\tEXT_REF_NO:"
										+ transCltbAccColllnkdtlUpd.getId().getSequenceNo() + "\tSEQUENCE_NO:"
				+ transCltbAccColllnkdtlUpd.getId().getLinkageType()+ "\tLINKAGE_TYPE:\":"+"\tException:"+th.getMessage();
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("CLTB_ACC_COLLLNKDTL_UPD");
		String errLogPath = errorLogVb.get().getError_log_path();
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errorLogVb.get().getError_log_path();
	}
}