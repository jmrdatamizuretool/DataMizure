package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadMultitnr;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadMultitnrPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadMultitnrModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadMultitnr implements ItemProcessor<TransBctbUploadMultitnrModel, TransBctbUploadMultitnr> {

    @Override
    public TransBctbUploadMultitnr process(TransBctbUploadMultitnrModel item) throws Exception {

        TransBctbUploadMultitnr entity = new TransBctbUploadMultitnr();

        // Build composite primary key
        TransBctbUploadMultitnrPK pk = new TransBctbUploadMultitnrPK();
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());
        pk.setBranchCode(item.getBranch_code());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getSerial_number())) {
            pk.setSerialNumber(Long.valueOf(item.getSerial_number()));
        }

        entity.setTransBctbUploadMultitnrPK(pk);

        // Map other fields
        entity.setBcrefno(item.getBcrefno());

        if (!JMRUtil.isNullOrEmpty(item.getEvent_seq_no())) {
            entity.setEventSeqNo(Long.valueOf(item.getEvent_seq_no()));
        }

        
        if (!JMRUtil.isNullOrEmpty(item.getBase_date())) {
            entity.setBaseDate(JMRDateUtil.getDateFromString(item.getBase_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        entity.setBaseDateCode(item.getBase_date_code());
        
        if (!JMRUtil.isNullOrEmpty(item.getValue_date())) {
            entity.setValueDate(JMRDateUtil.getDateFromString(item.getValue_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getTenor())) {
            entity.setTenor(Long.valueOf(item.getTenor()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getTransit_days())) {
            entity.setTransitDays(Long.valueOf(item.getTransit_days()));
        }

        
        if (!JMRUtil.isNullOrEmpty(item.getMaturity_date())) {
            entity.setMaturityDate(JMRDateUtil.getDateFromString(item.getMaturity_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        if (!JMRUtil.isNullOrEmpty(item.getSplit_percent())) {
            entity.setSplitPercent(Long.valueOf(item.getSplit_percent()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getBill_amount())) {
            entity.setBillAmount(Long.valueOf(item.getBill_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getDiscount_amount())) {
            entity.setDiscountAmount(Long.valueOf(item.getDiscount_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getRebate_amount())) {
            entity.setRebateAmount(Long.valueOf(item.getRebate_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getExchange_rate())) {
            entity.setExchangeRate(Long.valueOf(item.getExchange_rate()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getDiscounted_amount())) {
            entity.setDiscountedAmount(Long.valueOf(item.getDiscounted_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getLiquidation_amount())) {
            entity.setLiquidationAmount(Long.valueOf(item.getLiquidation_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getLiquidated_amount())) {
            entity.setLiquidatedAmount(Long.valueOf(item.getLiquidated_amount()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getInterest_amount())) {
            entity.setInterestAmount(Long.valueOf(item.getInterest_amount()));
        }

        
        if (!JMRUtil.isNullOrEmpty(item.getFrom_calculation_date())) {
            entity.setFromCalculationDate(JMRDateUtil.getDateFromString(item.getFrom_calculation_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        
        if (!JMRUtil.isNullOrEmpty(item.getTo_calculation_date())) {
            entity.setToCalculationDate(JMRDateUtil.getDateFromString(item.getTo_calculation_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        entity.setUserDefinedStatus(item.getUser_defined_status());
        
        if (!JMRUtil.isNullOrEmpty(item.getStatus_as_of_date())) {
            entity.setStatusAsOfDate(JMRDateUtil.getDateFromString(item.getStatus_as_of_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }
        entity.setUnderProtest(item.getUnder_protest());
        
        if (!JMRUtil.isNullOrEmpty(item.getProtest_date())) {
            entity.setProtestDate(JMRDateUtil.getDateFromString(item.getProtest_date(),JMRDateUtil.DATE_FORMATMMddyyyy)); // date parsing from CSV
        }

        return entity;
    }
}
