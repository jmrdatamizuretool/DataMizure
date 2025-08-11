package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayExc;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayExcPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPayExcModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadPayExc implements ItemProcessor<TransBctbUploadPayExcModel, TransBctbUploadPayExc> {

    @Override
    public TransBctbUploadPayExc process(TransBctbUploadPayExcModel item) throws Exception {

        TransBctbUploadPayExc entity = new TransBctbUploadPayExc();

        // Build primary key
        TransBctbUploadPayExcPK pk = new TransBctbUploadPayExcPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadPayExcPK(pk);

        // Map other fields
        entity.setTracerReqdFlag(item.getTracer_reqd_flag());

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_tobe_sent())) {
            entity.setNumTracersTobeSent(Long.valueOf(item.getNum_tracers_tobe_sent()));
        }

        entity.setTracerMedium(item.getTracer_medium());
        if (!JMRUtil.isNullOrEmpty(item.getTracer_start_date())) {
            entity.setTracerStartDate(JMRDateUtil.getDateFromString(item.getTracer_start_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getTracer_frequency())) {
            entity.setTracerFrequency(Long.valueOf(item.getTracer_frequency()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getPrevious_tracer_date())) {
            entity.setPreviousTracerDate(JMRDateUtil.getDateFromString(item.getPrevious_tracer_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_sent())) {
            entity.setNumTracersSent(Long.valueOf(item.getNum_tracers_sent()));
        }

        
        if (!JMRUtil.isNullOrEmpty(item.getNext_tracer_date())) {
            entity.setNextTracerDate(JMRDateUtil.getDateFromString(item.getNext_tracer_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        
        entity.setPaymentExceptionFlag(item.getPayment_exception_flag());
        entity.setTracerReceiverPartyType(item.getTracer_receiver_partytype());

        if (!JMRUtil.isNullOrEmpty(item.getPayment_msg_date())) {
            entity.setPaymentMsgDate(JMRDateUtil.getDateFromString(item.getPayment_msg_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        
        if (!JMRUtil.isNullOrEmpty(item.getNon_payment_msg_date())) {
            entity.setNonPaymentMsgDate(JMRDateUtil.getDateFromString(item.getNon_payment_msg_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        
        entity.setProtestFlag(item.getProtest_flag());
 
        if (!JMRUtil.isNullOrEmpty(item.getDate_of_protest())) {
            entity.setDateOfProtest(JMRDateUtil.getDateFromString(item.getDate_of_protest(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        // Default convStatus to "U" if not provided
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());
        entity.setManuallyGenerateFlag(item.getManually_generate_flag());

        return entity;
    }
}
