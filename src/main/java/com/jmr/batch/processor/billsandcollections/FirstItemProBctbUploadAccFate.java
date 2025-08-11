package com.jmr.batch.processor.billsandcollections;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccFate;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccFatePK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAccFateModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadAccFate
        implements ItemProcessor<TransBctbUploadAccFateModel, TransBctbUploadAccFate> {

    @Override
    public TransBctbUploadAccFate process(TransBctbUploadAccFateModel item) throws Exception {

        TransBctbUploadAccFate entity = new TransBctbUploadAccFate();

        // Build composite primary key
        TransBctbUploadAccFatePK pk = new TransBctbUploadAccFatePK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadAccFatePK(pk);

        // Map fields
        entity.setAdvfateReqdFlag(item.getAdvfate_reqd_flag());
        entity.setAdvfateMedium(item.getAdvfate_medium());

        if (!JMRUtil.isNullOrEmpty(item.getPrevious_advfate_date())) {
            entity.setPreviousAdvfateDate( (java.sql.Date) JMRDateUtil.getDateFromString(
                    item.getPrevious_advfate_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNum_advfates_sent())) {
            entity.setNumAdvfatesSent(Long.valueOf(item.getNum_advfates_sent()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNext_advfate_date())) {
            entity.setNextAdvfateDate((java.sql.Date) JMRDateUtil.getDateFromString(
                    item.getNext_advfate_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setAdvfateReceiverPartyType(item.getAdvfate_receiver_partytype());
        entity.setManuallyGenerateFlag(item.getManually_generate_flag());
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());

        return entity;
    }
}
