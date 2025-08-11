package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransTftbUploadFxLinkage;
import com.jmr.batch.entity.billsandcollections.TransTftbUploadFxLinkagePK;
import com.jmr.batch.model.billsandcollections.TransTftbUploadFxLinkageModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProTftbUploadFxLinkage
        implements ItemProcessor<TransTftbUploadFxLinkageModel, TransTftbUploadFxLinkage> {

    @Override
    public TransTftbUploadFxLinkage process(TransTftbUploadFxLinkageModel item) throws Exception {

        TransTftbUploadFxLinkage entity = new TransTftbUploadFxLinkage();

        // Build primary key
        TransTftbUploadFxLinkagePK pk = new TransTftbUploadFxLinkagePK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        pk.setExternalRefNo(item.getExternal_ref_no());
        pk.setTfRefNo(item.getTf_ref_no());

        if (!JMRUtil.isNullOrEmpty(item.getEvent_seq_no())) {
            pk.setEventSeqNo(Long.valueOf(item.getEvent_seq_no()));
        }

        pk.setFxRefNo(item.getFx_ref_no());

        entity.setTransTftbUploadFxLinkagePK(pk);

        // Map other fields
        if (!JMRUtil.isNullOrEmpty(item.getTf_amount())) {
            entity.setTfAmount(Long.valueOf(item.getTf_amount()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getTf_rate())) {
            entity.setTfRate(Long.valueOf(item.getTf_rate()));
        }

        entity.setCurrency(item.getCurrency());

        return entity;
    }
}
