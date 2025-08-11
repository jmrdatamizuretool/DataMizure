package com.jmr.batch.listener.instrument;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentDetail;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentMaster;
import com.jmr.batch.model.instruments.TransIstmUploadInstrumentDetailModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerIstmInstrumentUploadDetail {
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
	//SOURCE_CODE, INSTRUMENT_TYPE, BRANCH, CHEQUE_BOOK_NO, CHEQUE_NO, ISSUER_CODE
	@OnSkipInProcess
	public void skipInProcess(TransIstmUploadInstrumentDetailModel transIstmUploadInstrumentDetailModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "SOURCE_CODE:\\t" + transIstmUploadInstrumentDetailModel.getSource_code()+ "\t:INSTRUMENT_TYPE"
				+transIstmUploadInstrumentDetailModel.getInstrument_type() + "\tBRANCH:"
						+ transIstmUploadInstrumentDetailModel.getBranch()+ "\tCHEQUE_BOOK_NO:"
								+ transIstmUploadInstrumentDetailModel.getCheque_book_no()+ "\tXREF:"
										+ transIstmUploadInstrumentDetailModel.getCheque_no()+ "\tISSUER_CODE:"
										+ transIstmUploadInstrumentDetailModel.getIssuercode()
						+ "\tException:"+th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	@OnSkipInWrite
	public void skipInWriter(TransIstmUploadInstrumentDetail transIstmUploadInstrumentDetail, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		
		String data = "SOURCE_CODE:\\t" + transIstmUploadInstrumentDetail.getId().getSourceCode()+ "\t:INSTRUMENT_TYPE"
				+ transIstmUploadInstrumentDetail.getId().getInstrumentType() + "\tBRANCH:"
						+ transIstmUploadInstrumentDetail.getId().getBranch()+ "\tCHEQUE_BOOK_NO:"
								+ transIstmUploadInstrumentDetail.getId().getChequeBookNo()+ "\tCHEQUE_NO:"
										+ transIstmUploadInstrumentDetail.getId().getCheque_no()+ "\tISSUER_CODE:"
										+ transIstmUploadInstrumentDetail.getId().getIssuercode()
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
		//Optional<ErrorLogVb> errorLogVb = repo.findById("ISTM_UPLOAD_INSTRUMENT_DETAIL");
		//String errLogPath = errorLogVb.get().getError_log_path();
		String	errLogPath = "E:\\JMR Infotech\\MigrationTool\\Documents\\CSV\\INSTRUMENT\\ErrorLog";
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
			
		return errLogPath;
	}
}
