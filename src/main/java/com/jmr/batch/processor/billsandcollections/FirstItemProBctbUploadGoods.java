package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadGoods;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadGoodsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadGoodsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadGoods
        implements ItemProcessor<TransBctbUploadGoodsModel, TransBctbUploadGoods> {

    @Override
    public TransBctbUploadGoods process(TransBctbUploadGoodsModel item) throws Exception {

        TransBctbUploadGoods entity = new TransBctbUploadGoods();

        // Build primary key
        TransBctbUploadGoodsPK pk = new TransBctbUploadGoodsPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadGoodsPK(pk);

        // Map other fields
        entity.setGoodsCode(item.getGoods_code());
        entity.setGoodsDesc(item.getGoods_desc());
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());
        entity.setIncoTerm(item.getInco_term());

        return entity;
    }
}
