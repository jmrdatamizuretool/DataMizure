package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokDetail;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokDetailPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadBrokDetailModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadBrokDetail
        implements ItemProcessor<TransBctbUploadBrokDetailModel, TransBctbUploadBrokDetail> {

    @Override
    public TransBctbUploadBrokDetail process(TransBctbUploadBrokDetailModel item) throws Exception {

        TransBctbUploadBrokDetail entity = new TransBctbUploadBrokDetail();

        // Build primary key
        TransBctbUploadBrokDetailPK pk = new TransBctbUploadBrokDetailPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBrok_seq_no())) {
            pk.setBrokSeqNo(Long.valueOf(item.getBrok_seq_no()));
        }

        pk.setBroker(item.getBroker());

        entity.setTransBctbUploadBrokDetailPK(pk);

        // Map other fields
        entity.setBrokerAcc(item.getBroker_acc());
        entity.setBrokerAccCcy(item.getBroker_acc_ccy());

        if (!JMRUtil.isNullOrEmpty(item.getBroker_percent())) {
            entity.setBrokerPercent(Long.valueOf(item.getBroker_percent()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBrokamt_con_ccy())) {
            entity.setBrokamtConCcy(Long.valueOf(item.getBrokamt_con_ccy()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getExchange_rate())) {
            entity.setExchangeRate(Long.valueOf(item.getExchange_rate()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getOriginal_ex_rate())) {
            entity.setOriginalExRate(Long.valueOf(item.getOriginal_ex_rate()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getBrokamt_acc_ccy())) {
            entity.setBrokamtAccCcy(Long.valueOf(item.getBrokamt_acc_ccy()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getNegotiated_rate())) {
            entity.setNegotiatedRate(Long.valueOf(item.getNegotiated_rate()));
        }

        entity.setNegotiationRefNo(item.getNegotiation_ref_no());
        entity.setRemarks(item.getRemarks());

        if (!JMRUtil.isNullOrEmpty(item.getLiq_status())) {
            entity.setLiqStatus(Long.valueOf(item.getLiq_status()));
        }

        return entity;
    }
}
