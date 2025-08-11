package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransLctbUploadLicUtlDtl;
import com.jmr.batch.entity.billsandcollections.TransLctbUploadLicUtlDtlPK;
import com.jmr.batch.model.billsandcollections.TransLctbUploadLicUtlDtlModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProLctbUploadLicUtlDtl
        implements ItemProcessor<TransLctbUploadLicUtlDtlModel, TransLctbUploadLicUtlDtl> {

    @Override
    public TransLctbUploadLicUtlDtl process(TransLctbUploadLicUtlDtlModel item) throws Exception {

        TransLctbUploadLicUtlDtl entity = new TransLctbUploadLicUtlDtl();

        // Build composite primary key
        TransLctbUploadLicUtlDtlPK pk = new TransLctbUploadLicUtlDtlPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        pk.setImportLicenseNo(item.getImport_license_no());
        pk.setGoodsCode(item.getGoods_code());

        entity.setTransLctbUploadLicUtlDtlPK(pk);

        // Map other fields
        if (!JMRUtil.isNullOrEmpty(item.getAmount_reinstated())) {
            entity.setAmountReinstated(Double.valueOf(item.getAmount_reinstated()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getQuantity_reinstated())) {
            entity.setQuantityReinstated(Double.valueOf(item.getQuantity_reinstated()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getAmount_utilized())) {
            entity.setAmountUtilized(Double.valueOf(item.getAmount_utilized()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getQuantity_utilized())) {
            entity.setQuantityUtilized(Double.valueOf(item.getQuantity_utilized()));
        }

        entity.setRemarks(item.getRemarks());

        return entity;
    }
}
