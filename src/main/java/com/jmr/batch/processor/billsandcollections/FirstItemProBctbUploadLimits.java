package com.jmr.batch.processor.billsandcollections;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimits;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimitsPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadLimitsModel;
import com.jmr.framework.util.JMRUtil;


@Component
public class FirstItemProBctbUploadLimits
				implements ItemProcessor<TransBctbUploadLimitsModel ,TransBctbUploadLimits >{
	
	 @Override
	    public TransBctbUploadLimits process(TransBctbUploadLimitsModel item) throws Exception {
	        TransBctbUploadLimits entity = new TransBctbUploadLimits();

	        // Set composite key
	        TransBctbUploadLimitsPK pk = new TransBctbUploadLimitsPK();
	        pk.setBranchCode(item.getBranch_code());
	        pk.setSourceRef(item.getSource_ref());
	        pk.setPartyType(item.getParty_type());
	        pk.setOperation(item.getOperation());
	        pk.setCustomerNo(item.getCustomer_no());
	        pk.setLinkageType(item.getLinkage_type());
	        pk.setLinkedRefNo(item.getLinked_ref_no());
	        // Assuming SOURCE_CODE is fixed or from another context — update as needed
	        pk.setSourceCode(item.getSource_code()); // Or get from another field if needed

	        entity.setId(pk);

	     // Set entity fields
	        if (!JMRUtil.isNullOrEmpty(item.getLimit_amount())) {
	            entity.setLimitAmount(Double.valueOf(item.getLimit_amount()));
	        }

	        entity.setConvStatus(item.getConv_status());
	        entity.setErrMsg(item.getErr_msg());
	        entity.setEventCode(item.getEvent_code());

	        if (!JMRUtil.isNullOrEmpty(item.getLinkage_percentage())) {
	            entity.setLinkagePercentage(Double.valueOf(item.getLinkage_percentage()));
	        }

	        if (!JMRUtil.isNullOrEmpty(item.getLinkage_seq_no())) {
	            entity.setLinkageSeqNo(Double.valueOf(item.getLinkage_seq_no()));
	        }

	        entity.setLinkedCcy(item.getLinked_ccy());
	        entity.setJvParent(item.getJv_parent());
	        entity.setLiablityNo(item.getLiablity_no());
	        entity.setAmountTag(item.getAmount_tag());

	        return entity;
	    }

}
