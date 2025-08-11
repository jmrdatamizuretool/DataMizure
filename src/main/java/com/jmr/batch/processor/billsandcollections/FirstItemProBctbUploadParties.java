package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadParties;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPartiesPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPartiesModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadParties implements ItemProcessor<TransBctbUploadPartiesModel, TransBctbUploadParties> {

    @Override
    public TransBctbUploadParties process(TransBctbUploadPartiesModel item) throws Exception {
        TransBctbUploadParties entity = new TransBctbUploadParties();

        // Set Composite Key
        TransBctbUploadPartiesPK pk = new TransBctbUploadPartiesPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());
        pk.setPartyType(item.getParty_type());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            try {
                pk.setSourceSeqNo(Double.parseDouble(item.getSource_seq_no()));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid source_seq_no: " + item.getSource_seq_no(), e);
            }
        }

        entity.setId(pk);

        // Set other fields
        entity.setPartyLanguage(item.getParty_language());
        entity.setPartyCountryCode(item.getParty_country_code());
        entity.setPartyRefno(item.getParty_refno());
        entity.setPartyName(item.getParty_name());
        entity.setPartyAddr1(item.getParty_addr1());
        entity.setPartyAddr2(item.getParty_addr2());
        entity.setPartyAddr3(item.getParty_addr3());
        entity.setPartyAddr4(item.getParty_addr4());
        entity.setWalkinCustomerFlag(item.getWalkin_customer_flag());
        entity.setPartyId(item.getParty_id());
        entity.setConvStatus(item.getConv_status());
        entity.setErrMsg(item.getErr_msg());

        return entity;
    }
}
