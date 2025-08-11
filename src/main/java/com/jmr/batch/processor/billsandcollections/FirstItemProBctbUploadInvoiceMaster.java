package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceMasterPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInvoiceMasterModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadInvoiceMaster
        implements ItemProcessor<TransBctbUploadInvoiceMasterModel, TransBctbUploadInvoiceMaster> {

    @Override
    public TransBctbUploadInvoiceMaster process(TransBctbUploadInvoiceMasterModel item) throws Exception {

        TransBctbUploadInvoiceMaster entity = new TransBctbUploadInvoiceMaster();

        // Build primary key
        TransBctbUploadInvoiceMasterPK pk = new TransBctbUploadInvoiceMasterPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.settransBctbUploadInvoiceMasterPK(pk);

        // Map other fields
        entity.setMarginInd(item.getMargin_ind());

        if (!JMRUtil.isNullOrEmpty(item.getMargin())) {
            entity.setMargin(Long.valueOf(item.getMargin()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getEligible_amount())) {
            entity.setEligibleAmount(Long.valueOf(item.getEligible_amount()));
        }

        entity.setInvoiceCcy(item.getInvoice_ccy());

        return entity;
    }
}
