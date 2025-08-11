package com.jmr.batch.listener.tdRd;

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
import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayinDet;
import com.jmr.batch.model.tdRd.TransIctmUploadTdpayinDetModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerIctmUploadTdpayinDet {
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
		if (th instanceof FlatFileParseException) {
			createFileRead(readErrFile.getAbsolutePath(), ((FlatFileParseException) th).getInput(),
					((FlatFileParseException) th).getLineNumber());
		}
	}

	@OnSkipInProcess
	public void skipInProcess(TransIctmUploadTdpayinDetModel transIctmUploadTdpayinDetModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "MAINTENANCE_SEQ_NO:\t" + transIctmUploadTdpayinDetModel.getMaintenance_seq_no()
				+ "\tSOURCE_CODE:" + transIctmUploadTdpayinDetModel.getSource_code() + "\tSOURCE_SEQ_NO:"
				+ transIctmUploadTdpayinDetModel.getSource_seq_no() + "\tBRN:" + transIctmUploadTdpayinDetModel.getBrn()
				+ "\tACC:" + transIctmUploadTdpayinDetModel.getAcc() + "\tSEQNO:"
				+ transIctmUploadTdpayinDetModel.getSeqno();

		th.getMessage();
		createFileProcess(process_err_path, data);
	}

	@OnSkipInWrite
	public void skipInWriter(TransIctmUploadTdpayinDet transIctmUploadTdpayinDet, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";

		String data = "MAINTENANCE_SEQ_NO:\t" + transIctmUploadTdpayinDet.getId().getMaintenance_seq_no()
				+ "\tSOURCE_CODE:" + transIctmUploadTdpayinDet.getId().getSource_code() + "\tSOURCE_SEQ_NO:"
				+ transIctmUploadTdpayinDet.getId().getSource_seq_no() + "\tBRN:"
				+ transIctmUploadTdpayinDet.getId().getBrn() + "\tACC:" + transIctmUploadTdpayinDet.getId().getAcc()
				+ "\tSEQNO:" + transIctmUploadTdpayinDet.getId().getSeqno();
		createFile(write_err_path, data);
	}

	public void createFileRead(String filePath, String data, int line) {
		try (FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write("Line number " + line + ",\t" + data + ", Date:" + new Date() + "\n");
		} catch (Exception e) {

		}
	}

	public void createFile(String filePath, String data) {
		try (FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write(data + ",\tDate:" + new Date() + "\n");
		} catch (Exception e) {

		}
	}

	public void createFileProcess(String filePath, String data) {

		try (FileWriter fileWriter = new FileWriter(new File(filePath), true)) {
			fileWriter.write(data + ",\tDate:" + new Date() + "\n");
		} catch (Exception e) {

		}
	}

	public String getErrorLog() {
		Optional<ErrorLogVb> errorLogVb = repo.findById("TRANS_ICTM_UPLOAD_TDPAYIN_DET");
		String errLogPath = errorLogVb.get().getError_log_path();
		// String errLogPath = "E:\\JMR
		// Infotech\\MigrationTool\\Documents\\CSV\\TDRD\\ErrorLog";
		File errorLog = new File(errLogPath);
		if (!errorLog.exists()) {
			errorLog.mkdirs();
		}

		return errorLogVb.get().getError_log_path();
	}

}
