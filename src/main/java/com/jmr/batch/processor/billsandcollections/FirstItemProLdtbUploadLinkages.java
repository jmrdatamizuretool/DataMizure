package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransLdtbUploadLinkages;
import com.jmr.batch.entity.billsandcollections.TransLdtbUploadLinkagesPK;
import com.jmr.batch.model.billsandcollections.TransLdtbUploadLinkagesModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProLdtbUploadLinkages
        implements ItemProcessor<TransLdtbUploadLinkagesModel, TransLdtbUploadLinkages> {

    @Override
    public TransLdtbUploadLinkages process(TransLdtbUploadLinkagesModel item) throws Exception {

        TransLdtbUploadLinkages entity = new TransLdtbUploadLinkages();

        // Build composite primary key
        TransLdtbUploadLinkagesPK pk = new TransLdtbUploadLinkagesPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setExtContractRefNo(item.getExt_contract_ref_no());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransLdtbUploadLinkagesPK(pk);

        // Map other fields
        entity.setLinkedToRef(item.getLinked_to_ref());
        entity.setLinkedToBranch(item.getLinked_to_branch());
        entity.setLinkageType(item.getLinkage_type());
        entity.setLinkedToCurrency(item.getLinked_to_currency());
        entity.setLinkageValid(item.getLinkage_valid());

        if (!JMRUtil.isNullOrEmpty(item.getLinked_amount())) {
            entity.setLinkedAmount(Long.valueOf(item.getLinked_amount()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getConverted_linked_amount())) {
            entity.setConvertedLinkedAmount(Long.valueOf(item.getConverted_linked_amount()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getExchange_rate())) {
            entity.setExchangeRate(Long.valueOf(item.getExchange_rate()));
        }

        entity.setLoanCurrency(item.getLoan_currency());
        entity.setSourceRef(item.getSource_ref());
        entity.setFunctionId(item.getFunction_id());
        entity.setActionCode(item.getAction_code());
        entity.setUploadId(item.getUpload_id());

        return entity;
    }
}
