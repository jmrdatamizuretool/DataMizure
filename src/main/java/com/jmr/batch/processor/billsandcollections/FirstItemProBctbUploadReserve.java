package com.jmr.batch.processor.billsandcollections;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadReserve;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadReservePK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadReserveModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadReserve
        implements ItemProcessor<TransBctbUploadReserveModel, TransBctbUploadReserve> {

    @Override
    public TransBctbUploadReserve process(TransBctbUploadReserveModel item) throws Exception {

        TransBctbUploadReserve entity = new TransBctbUploadReserve();

        // Build primary key
        TransBctbUploadReservePK pk = new TransBctbUploadReservePK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadPayExcPK(pk);

        // Map simple fields
        entity.setUnderReserveFlag(item.getUnder_reserve_flag());
        entity.setTracerReqdFlag(item.getTracer_reqd_flag());

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_tobe_sent())) {
            entity.setNumTracersToBeSent(Long.valueOf(item.getNum_tracers_tobe_sent()));
        }

        entity.setTracerMedium(item.getTracer_medium());

        if (!JMRUtil.isNullOrEmpty(item.getTracer_frequency())) {
            entity.setTracerFrequency(Long.valueOf(item.getTracer_frequency()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getTracer_start_date())) {
            entity.setTracerStartDate((Date) JMRDateUtil.getDateFromString(
                    item.getTracer_start_date(),
                    JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getPrevious_tracer_date())) {
            entity.setPreviousTracerDate((Date) JMRDateUtil.getDateFromString(
                    item.getPrevious_tracer_date(),
                    JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNum_tracers_sent())) {
            entity.setNumTracersSent(Long.valueOf(item.getNum_tracers_sent()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNext_tracer_date())) {
            entity.setNextTracerDate((Date) JMRDateUtil.getDateFromString(
                    item.getNext_tracer_date(),
                    JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getReserve_release_date())) {
            entity.setReserveReleaseDate((Date) JMRDateUtil.getDateFromString(
                    item.getReserve_release_date(),
                    JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setCableIssuingBankFlag(item.getCable_issuing_bank_flag());

        if (!JMRUtil.isNullOrEmpty(item.getDisc_approved_date())) {
            entity.setDiscApprovedDate((Date) JMRDateUtil.getDateFromString(
                    item.getDisc_approved_date(),
                    JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setReserveExceptionFlag(item.getReserve_exception_flag());
        entity.setTracerReceiverPartyType(item.getTracer_receiver_partytype());

        return entity;
    }
}
