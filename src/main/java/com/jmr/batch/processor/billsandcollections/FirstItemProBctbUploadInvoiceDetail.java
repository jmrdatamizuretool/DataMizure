package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceDetail;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceDetailPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInvoiceDetailModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadInvoiceDetail
        implements ItemProcessor<TransBctbUploadInvoiceDetailModel, TransBctbUploadInvoiceDetail> {

    @Override
    public TransBctbUploadInvoiceDetail process(TransBctbUploadInvoiceDetailModel item) throws Exception {

        TransBctbUploadInvoiceDetail entity = new TransBctbUploadInvoiceDetail();

        // Create and set primary key
        TransBctbUploadInvoiceDetailPK pk = new TransBctbUploadInvoiceDetailPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadInvoiceDetailPK(pk);

        // Map other fields
        entity.setInvoiceNo(item.getInvoice_no());

        if (!JMRUtil.isNullOrEmpty(item.getInvoice_date())) {
            entity.setInvoiceDate(JMRDateUtil.getDateFromString(item.getInvoice_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getAmount())) {
            entity.setAmount(Long.valueOf(item.getAmount()));
        }

        return entity;
    }
}
