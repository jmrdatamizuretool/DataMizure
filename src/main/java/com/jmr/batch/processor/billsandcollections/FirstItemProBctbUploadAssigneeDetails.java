package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadAssigneeDetails;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAssigneeDetailsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAssigneeDetailsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadAssigneeDetails
        implements ItemProcessor<TransBctbUploadAssigneeDetailsModel, TransBctbUploadAssigneeDetails> {

    @Override
    public TransBctbUploadAssigneeDetails process(TransBctbUploadAssigneeDetailsModel item) throws Exception {

        TransBctbUploadAssigneeDetails entity = new TransBctbUploadAssigneeDetails();

        // Build composite primary key
        TransBctbUploadAssigneeDetailsPK pk = new TransBctbUploadAssigneeDetailsPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getSequence())) {
            pk.setSequence(Long.valueOf(item.getSequence()));
        }

        entity.setTransBctbUploadAssigneeDetails(pk);

        // Map other fields
        entity.setAssigneeId(item.getAssignee_id());
        entity.setAssigneeName(item.getAssignee_name());

        if (!JMRUtil.isNullOrEmpty(item.getAmt_bill_ccy())) {
            entity.setAmtBillCcy(Long.valueOf(item.getAmt_bill_ccy()));
        }

        entity.setAcCcy(item.getAc_ccy());
        entity.setAccount(item.getAccount());

        return entity;
    }
}
