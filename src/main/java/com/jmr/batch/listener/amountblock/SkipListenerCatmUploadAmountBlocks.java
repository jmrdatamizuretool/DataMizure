package com.jmr.batch.listener.amountblock;

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
import com.jmr.batch.entity.amount.TransCatmUploadAmountBlocks;
import com.jmr.batch.model.amount.TransCatmUploadAmountBlocksModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerCatmUploadAmountBlocks {
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
	public void skipInProcess(TransCatmUploadAmountBlocksModel transCatmUploadAmountBlocksModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		/*File processErrFile = new File(process_err_path);
		if (!processErrFile.exists()) {
			try {
				processErrFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		String data = "AMOUNTBLOCKNO:\\t" + transCatmUploadAmountBlocksModel.getAmount_block_no()+ "\t:MAINTENANCESEQNO"
				+ transCatmUploadAmountBlocksModel.getMaintenance_seq_no(); 
	th.getMessage();
		createFileProcess(process_err_path, data);
	}
	
	
	@OnSkipInWrite
	public void skipInWriter(TransCatmUploadAmountBlocks transCatmUploadAmountBlocks, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";
		/*File writeErrFile = new File(write_err_path);
		if (!writeErrFile.exists()) {
			try {
				writeErrFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		String data = "AMOUNTBLOCKNO:\t" + transCatmUploadAmountBlocks.getId().getAmountBlockNo()+ ",\tMAINTENANCESEQNO:"
				+ transCatmUploadAmountBlocks.getId().getMaintenanceSeqNo() 
						+ ",\tException:"+th.getMessage();
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
		//String	errLogPath = "E:\\JMR Infotech\\MigrationTool\\Documents\\CSV\\AMOUNTBLOCK\\ErrorLog";
		File errorLog = new File(errLogPath); 
		if(!errorLog.exists()) {	
			errorLog.mkdirs();	
		}
		return errLogPath;
	}
}
