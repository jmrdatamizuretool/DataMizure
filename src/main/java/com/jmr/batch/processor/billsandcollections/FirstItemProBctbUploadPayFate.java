package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayFate;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayFatePK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPayFateModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadPayFate implements ItemProcessor<TransBctbUploadPayFateModel, TransBctbUploadPayFate> {

    @Override
    public TransBctbUploadPayFate process(TransBctbUploadPayFateModel item) throws Exception {

        TransBctbUploadPayFate entity = new TransBctbUploadPayFate();

        // Build primary key
        TransBctbUploadPayFatePK pk = new TransBctbUploadPayFatePK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadPayFatePK(pk);

        // Map other fields
        entity.setAdvfateReqdFlag(item.getAdvfate_reqd_flag());
        entity.setAdvfateMedium(item.getAdvfate_medium());

        if (!JMRUtil.isNullOrEmpty(item.getPrevious_advfate_date())) {
            entity.setPreviousAdvfateDate(JMRDateUtil.getDateFromString(item.getPrevious_advfate_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNum_advfates_sent())) {
            entity.setNumAdvfatesSent(Long.valueOf(item.getNum_advfates_sent()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNext_advfate_date())) {
            entity.setNextAdvfateDate(JMRDateUtil.getDateFromString(item.getNext_advfate_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setAdvfateReceiverPartytype(item.getAdvfate_receiver_partytype());
        entity.setManuallyGenerateFlag(item.getManually_generate_flag());
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());

        return entity;
    }
}
