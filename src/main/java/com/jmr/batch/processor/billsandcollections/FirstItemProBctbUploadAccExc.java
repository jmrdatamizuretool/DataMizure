package com.jmr.batch.processor.billsandcollections;

import java.sql.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccExc;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccExcPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAccExcModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadAccExc
        implements ItemProcessor<TransBctbUploadAccExcModel, TransBctbUploadAccExc> {

    @Override
    public TransBctbUploadAccExc process(TransBctbUploadAccExcModel item) throws Exception {

        TransBctbUploadAccExc entity = new TransBctbUploadAccExc();

        // Build primary key
        TransBctbUploadAccExcPK pk = new TransBctbUploadAccExcPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadAccExcPK(pk);

        // Map fields
        entity.setTracerReqdFlag(item.getTracer_reqd_flag());

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_tobe_sent())) {
            entity.setNumTracersTobeSent(Long.valueOf(item.getNum_tracers_tobe_sent()));
        }

        entity.setTracerMedium(item.getTracer_medium());
       
        if (!JMRUtil.isNullOrEmpty(item.getTracer_start_date())) {
            entity.setTracerStartDate((Date) JMRDateUtil.getDateFromString(item.getTracer_start_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getTracer_frequency())) {
            entity.setTracerFrequency(Long.valueOf(item.getTracer_frequency()));
        }

    
        if (!JMRUtil.isNullOrEmpty(item.getPrevious_tracer_date())) {
            entity.setPreviousTracerDate((Date) JMRDateUtil.getDateFromString(item.getPrevious_tracer_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        
        if (!JMRUtil.isNullOrEmpty(item.getNext_tracer_date())) {
            entity.setNextTracerDate((Date) JMRDateUtil.getDateFromString(item.getNext_tracer_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_sent())) {
            entity.setNumTracersSent(Long.valueOf(item.getNum_tracers_sent()));
        }

     
        if (!JMRUtil.isNullOrEmpty(item.getNon_acceptance_msg_date())) {
            entity.setNonAcceptanceMsgDate((Date) JMRDateUtil.getDateFromString(item.getNon_acceptance_msg_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        entity.setProtestFlag(item.getProtest_flag());
        entity.setAcceptanceExceptionFlag(item.getAcceptance_exception_flag());
        entity.setTracerReceiverPartyType(item.getTracer_receiver_partytype());

        if (!JMRUtil.isNullOrEmpty(item.getDate_of_protest())) {
            entity.setDateOfProtest((Date) JMRDateUtil.getDateFromString(item.getDate_of_protest(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
 
        if (!JMRUtil.isNullOrEmpty(item.getAcceptance_msg_date())) {
            entity.setAcceptanceMsgDate((Date) JMRDateUtil.getDateFromString(item.getAcceptance_msg_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());
        entity.setManuallyGenerateFlag(item.getManually_generate_flag());

        return entity;
    }

}
