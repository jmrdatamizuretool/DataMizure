package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocs;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDocsModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadDocs
        implements ItemProcessor<TransBctbUploadDocsModel, TransBctbUploadDocs> {

    @Override
    public TransBctbUploadDocs process(TransBctbUploadDocsModel item) throws Exception {

        TransBctbUploadDocs entity = new TransBctbUploadDocs();

        // Create PK
        TransBctbUploadDocsPK pk = new TransBctbUploadDocsPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());
        pk.setDocCode(item.getDoc_code());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadDocsPK(pk);

        // Map normal fields
        entity.setDocDescription(item.getDoc_description());

        if (!JMRUtil.isNullOrEmpty(item.getDoc_sl_no())) {
            entity.setDocSlNo(Long.valueOf(item.getDoc_sl_no()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getFirstmail_copies())) {
            entity.setFirstmailCopies(Long.valueOf(item.getFirstmail_copies()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getSecondmail_copies())) {
            entity.setSecondmailCopies(Long.valueOf(item.getSecondmail_copies()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getReim_bank_copies())) {
            entity.setReimBankCopies(Long.valueOf(item.getReim_bank_copies()));
        }

        entity.setDocRef(item.getDoc_ref());

        if (!JMRUtil.isNullOrEmpty(item.getDoc_date())) {
            entity.setDocDate(JMRDateUtil.getDateFromString(item.getDoc_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // assuming date parsing utility
        }

        entity.setCoveringLetterRef(item.getCovering_letter_ref());

        if (!JMRUtil.isNullOrEmpty(item.getCovering_letter_date())) {
            entity.setCoveringLetterDate(JMRDateUtil.getDateFromString(item.getCovering_letter_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());
        entity.setFirstmailOriginals(item.getFirstmail_originals());
        entity.setSecondmailOriginals(item.getSecondmail_originals());

        return entity;
    }
}
