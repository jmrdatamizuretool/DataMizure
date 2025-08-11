package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransLctbUploadCollateral;
import com.jmr.batch.entity.billsandcollections.TransLctbUploadCollateralPK;
import com.jmr.batch.model.billsandcollections.TransLctbUploadCollateralModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProLctbUploadCollateral
        implements ItemProcessor<TransLctbUploadCollateralModel, TransLctbUploadCollateral> {

    @Override
    public TransLctbUploadCollateral process(TransLctbUploadCollateralModel item) throws Exception {

        TransLctbUploadCollateral entity = new TransLctbUploadCollateral();

        // Build primary key
        TransLctbUploadCollateralPK pk = new TransLctbUploadCollateralPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransLctbUploadCollateralPK(pk);

        // Map other fields
        entity.setCollateralCcy(item.getCollateral_ccy());

        if (!JMRUtil.isNullOrEmpty(item.getCollateral_pct())) {
            entity.setCollateralPct(Long.valueOf(item.getCollateral_pct()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getCollateral_amt())) {
            entity.setCollateralAmt(Long.valueOf(item.getCollateral_amt()));
        }

        entity.setCollateralDescr(item.getCollateral_descr());

        if (!JMRUtil.isNullOrEmpty(item.getExch_rate())) {
            entity.setExchRate(Long.valueOf(item.getExch_rate()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getAdjustment_amt())) {
            entity.setAdjustmentAmt(Long.valueOf(item.getAdjustment_amt()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getAdjustment_sign())) {
            entity.setAdjustmentSign(Long.valueOf(item.getAdjustment_sign()));
        }

        return entity;
    }
}
