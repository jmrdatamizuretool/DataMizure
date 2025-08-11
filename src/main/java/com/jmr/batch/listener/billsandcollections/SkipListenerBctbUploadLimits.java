package com.jmr.batch.listener.billsandcollections;

import com.jmr.batch.entity.ErrorLogVb;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimits;
import com.jmr.batch.model.billsandcollections.TransBctbUploadLimitsModel;
import com.jmr.repository.ErrorLogRepository;
import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

@Component
public class SkipListenerBctbUploadLimits {

    @Autowired
    private ErrorLogRepository errorLogRepository;

    @OnSkipInRead
    public void onSkipInRead(Throwable t) {
        if (t instanceof FlatFileParseException) {
            FlatFileParseException ex = (FlatFileParseException) t;
            String data = "READ SKIPPED: Line=" + ex.getLineNumber() +
                          ", Input=[" + ex.getInput() + "], Reason=" + ex.getMessage();
            writeToFile("SkipInRead.txt", data);
        }
    }

    @OnSkipInProcess
    public void onSkipInProcess(TransBctbUploadLimitsModel model, Throwable t) {
        String data = "PROCESS SKIPPED: BRANCH_CODE=" + model.getBranch_code() +
                      ", SOURCE_REF=" + model.getSource_ref() +
                      ", PARTY_TYPE=" + model.getParty_type() +
                      ", OPERATION=" + model.getOperation() +
                      ", LINE=" + model.getLine() +
                      ", LIMIT_AMOUNT=" + model.getLimit_amount() +
                      ", ERROR=" + t.getMessage();
        writeToFile("SkipInProcess.txt", data);
    }

    @OnSkipInWrite
    public void onSkipInWrite(TransBctbUploadLimits entity, Throwable t) {
        String data = "WRITE SKIPPED: BRANCH_CODE=" + entity.getId().getBranchCode() +
                      ", SOURCE_CODE=" + entity.getId().getSourceCode() +
                      ", SOURCE_REF=" + entity.getId().getSourceRef() +
                      ", PARTY_TYPE=" + entity.getId().getPartyType() +
                      ", OPERATION=" + entity.getId().getOperation() +
                      ", LINE=" + entity.getLine() +
                      ", LIMIT_AMOUNT=" + entity.getLimitAmount() +
                      ", CONV_STATUS=" + entity.getConvStatus() +
                      ", ERROR=" + t.getMessage();
        writeToFile("SkipInWrite.txt", data);
    }

    private void writeToFile(String fileName, String content) {
        String logDir = getLogPath();
        if (logDir == null || logDir.isEmpty()) {
            logDir = "logs"; // fallback directory
        }

        File dir = new File(logDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(dir, fileName);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(new Date() + " --> " + content + "\n");
        } catch (IOException e) {
            e.printStackTrace(); // optionally use logger
        }
    }

    private String getLogPath() {
        Optional<ErrorLogVb> errorLogVb = errorLogRepository.findById("BCTB_UPLOAD_LIMITS");
        return errorLogVb.map(ErrorLogVb::getError_log_path).orElse("");
    }
}
