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
import com.jmr.batch.entity.tdRd.TransIctmUploadTdDetails;
import com.jmr.batch.model.tdRd.TransIctmUploadTdDetailsModel;
import com.jmr.repository.ErrorLogRepository;

@Component
public class SkipListenerIctmUploadTdDetails {

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
	public void skipInProcess(TransIctmUploadTdDetailsModel transIctmUploadTdDetailsModel, Throwable th) {
		String path = getErrorLog();
		String process_err_path = path + System.getProperty("file.separator") + "SkipInProcess.txt";
		String data = "MAINTENANCE_SEQ_NO:\t" + transIctmUploadTdDetailsModel.getMaintenance_seq_no() + "\tBRANCH_CODE:"
				+ transIctmUploadTdDetailsModel.getBranch_code() + "\tSOURCE_CODE:"
				+ transIctmUploadTdDetailsModel.getSource_code() + "\tSOURCE_SEQ_NO:"
				+ transIctmUploadTdDetailsModel.getSource_seq_no() + "\tCCY:" + transIctmUploadTdDetailsModel.getCcy()
				+ "\tBRN:" + transIctmUploadTdDetailsModel.getBrn() + "\tACC:" + transIctmUploadTdDetailsModel.getAcc();

		th.getMessage();
		createFileProcess(process_err_path, data);
	}

	@OnSkipInWrite
	public void skipInWriter(TransIctmUploadTdDetails transIctmUploadTdDetails, Throwable th) {
		String path = getErrorLog();
		String write_err_path = path + System.getProperty("file.separator") + "SkipInWrite.txt";

		String data = "MAINTENANCE_SEQ_NO:\t" + transIctmUploadTdDetails.getId().getMaintenance_seq_no()
				+ "\tBRANCH_CODE:" + transIctmUploadTdDetails.getId().getBranch_code() + "\tSOURCE_CODE:"
				+ transIctmUploadTdDetails.getId().getSource_code() + "\tSOURCE_SEQ_NO:"
				+ transIctmUploadTdDetails.getId().getSource_seq_no() + "\tCCY:"
				+ transIctmUploadTdDetails.getId().getCcy() + "\tBRN:" + transIctmUploadTdDetails.getId().getBrn()
				+ "\tACC:" + transIctmUploadTdDetails.getId().getAcc() + "\tException:" + th.getMessage();
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
		Optional<ErrorLogVb> errorLogVb = repo.findById("TRANS_ICTM_UPLOAD_TD_DETAILS");
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
