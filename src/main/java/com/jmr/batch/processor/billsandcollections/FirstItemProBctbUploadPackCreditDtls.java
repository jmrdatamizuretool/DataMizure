package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadPackCreditDtls;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPackCreditDtlsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPackCreditDtlsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadPackCreditDtls
        implements ItemProcessor<TransBctbUploadPackCreditDtlsModel, TransBctbUploadPackCreditDtls> {

    @Override
    public TransBctbUploadPackCreditDtls process(TransBctbUploadPackCreditDtlsModel item) throws Exception {

        TransBctbUploadPackCreditDtls entity = new TransBctbUploadPackCreditDtls();

        // Build primary key
        TransBctbUploadPackCreditDtlsPK pk = new TransBctbUploadPackCreditDtlsPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        pk.setBcrefno(item.getBcrefno());
        pk.setClAccount(item.getCl_account());

        if (!JMRUtil.isNullOrEmpty(item.getSeq_no())) {
            pk.setSeqNo(Long.valueOf(item.getSeq_no()));
        }

        entity.setTransBctbUploadPackCreditDtlsPK(pk);

        // Map other fields
        entity.setLinkedCcy(item.getLinked_ccy());

        if (!JMRUtil.isNullOrEmpty(item.getOutstanding_amt())) {
            entity.setOutstandingAmt(Long.valueOf(item.getOutstanding_amt()));
        }

        entity.setEventCode(item.getEvent_code());

        if (!JMRUtil.isNullOrEmpty(item.getSettled_amt())) {
            entity.setSettledAmt(Long.valueOf(item.getSettled_amt()));
        }

        return entity;
    }
}
