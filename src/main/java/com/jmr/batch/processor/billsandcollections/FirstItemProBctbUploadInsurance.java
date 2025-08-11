package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadInsurance;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInsurancePK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInsuranceModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadInsurance 
        implements ItemProcessor<TransBctbUploadInsuranceModel, TransBctbUploadInsurance> {

    @Override
    public TransBctbUploadInsurance process(TransBctbUploadInsuranceModel item) throws Exception {

        TransBctbUploadInsurance entity = new TransBctbUploadInsurance();

        // Build primary key
        TransBctbUploadInsurancePK pk = new TransBctbUploadInsurancePK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadInsurancePK(pk);

        // Map other fields
        entity.setBcrefno(item.getBcrefno());
        entity.setInsuranceCompCode(item.getInsurance_comp_code());
        entity.setInsuranceCompName(item.getInsurance_comp_name());
        entity.setInsurancePolNo(item.getInsurance_pol_no());
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());

        return entity;
    }
}
