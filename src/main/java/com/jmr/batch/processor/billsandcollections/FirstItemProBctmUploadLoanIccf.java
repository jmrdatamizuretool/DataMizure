package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanIccf;
import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanIccfPK;
import com.jmr.batch.model.billsandcollections.TransBctmUploadLoanIccfModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctmUploadLoanIccf
        implements ItemProcessor<TransBctmUploadLoanIccfModel, TransBctmUploadLoanIccf> {

    @Override
    public TransBctmUploadLoanIccf process(TransBctmUploadLoanIccfModel item) throws Exception {

        TransBctmUploadLoanIccf entity = new TransBctmUploadLoanIccf();

        // ===== Build composite primary key =====
        TransBctmUploadLoanIccfPK pk = new TransBctmUploadLoanIccfPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        pk.setComponent(item.getComponent());

        entity.setTransBctmUploadLoanIccf(pk);

        // ===== Map other fields =====
        entity.setRateCode(item.getRate_code());

        if (!JMRUtil.isNullOrEmpty(item.getInt_basis())) {
            entity.setIntBasis(Long.valueOf(item.getInt_basis()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getInt_rate())) {
            entity.setIntRate(Long.valueOf(item.getInt_rate()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getInt_spread())) {
            entity.setIntSpread(Long.valueOf(item.getInt_spread()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getSpecial_amount())) {
            entity.setSpecialAmount(Long.valueOf(item.getSpecial_amount()));
        }

        entity.setUsage(item.getUsage());

        return entity;
    }
}
