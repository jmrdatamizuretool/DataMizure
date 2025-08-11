package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokMasterPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadBrokMasterModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadBrokMaster
        implements ItemProcessor<TransBctbUploadBrokMasterModel, TransBctbUploadBrokMaster> {

    @Override
    public TransBctbUploadBrokMaster process(TransBctbUploadBrokMasterModel item) throws Exception {

        TransBctbUploadBrokMaster entity = new TransBctbUploadBrokMaster();

        // Build primary key
        TransBctbUploadBrokMasterPK pk = new TransBctbUploadBrokMasterPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadBrokMasterPK(pk);

        // Map other fields
        entity.setContractCcy(item.getContract_ccy());

        if (!JMRUtil.isNullOrEmpty(item.getContract_amt())) {
            entity.setContractAmt(Long.valueOf(item.getContract_amt()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBrokerage_percent())) {
            entity.setBrokeragePercent(Long.valueOf(item.getBrokerage_percent()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBrokerage_amt())) {
            entity.setBrokerageAmt(Long.valueOf(item.getBrokerage_amt()));
        }

        return entity;
    }
}
