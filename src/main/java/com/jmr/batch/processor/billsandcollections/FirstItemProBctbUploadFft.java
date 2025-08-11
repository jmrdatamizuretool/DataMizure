package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadFft;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadFftPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadFftModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadFft
        implements ItemProcessor<TransBctbUploadFftModel, TransBctbUploadFft> {

    @Override
    public TransBctbUploadFft process(TransBctbUploadFftModel item) throws Exception {

        TransBctbUploadFft entity = new TransBctbUploadFft();

        // Build composite primary key
        TransBctbUploadFftPK pk = new TransBctbUploadFftPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());
        pk.setFftCode(item.getFft_code());
        pk.setAdvCode(item.getAdv_code());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getRecord_seq_no())) {
            pk.setRecordSeqNo(Long.valueOf(item.getRecord_seq_no()));
        }

        entity.setTransBctbUploadFftPK(pk);

        // Map simple fields
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());
        entity.setFreeFormatText(item.getFree_format_text());

        return entity;
    }
}
