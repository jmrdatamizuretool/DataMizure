package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadDraftsDetails;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDraftsDetailsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDraftsDetailsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadDraftsDetails
        implements ItemProcessor<TransBctbUploadDraftsDetailsModel, TransBctbUploadDraftsDetails> {

    @Override
    public TransBctbUploadDraftsDetails process(TransBctbUploadDraftsDetailsModel item) throws Exception {

        TransBctbUploadDraftsDetails entity = new TransBctbUploadDraftsDetails();

        // Create and populate primary key
        TransBctbUploadDraftsDetailsPK pk = new TransBctbUploadDraftsDetailsPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());
        pk.setAmountName(item.getAmount_name());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadDraftsDetailsPK(pk);

        // Set amount field
        if (!JMRUtil.isNullOrEmpty(item.getAmount())) {
            entity.setAmount(Double.valueOf(item.getAmount()));
        }

        return entity;
    }
}
