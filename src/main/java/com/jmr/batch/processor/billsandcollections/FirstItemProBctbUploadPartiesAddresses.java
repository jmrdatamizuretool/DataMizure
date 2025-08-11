package com.jmr.batch.processor.billsandcollections;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadPartiesAddresses;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPartiesAddressesPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPartiesAddressesModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadPartiesAddresses
		implements ItemProcessor<TransBctbUploadPartiesAddressesModel, TransBctbUploadPartiesAddresses> {

	@Override
	public TransBctbUploadPartiesAddresses process(TransBctbUploadPartiesAddressesModel item) throws Exception {
		TransBctbUploadPartiesAddresses transBctbUploadPartiesAddresses = new TransBctbUploadPartiesAddresses();

		transBctbUploadPartiesAddresses.setAddress(item.getAddress());


		TransBctbUploadPartiesAddressesPK transBctbUploadPartiesAddressesPK = new TransBctbUploadPartiesAddressesPK();
		transBctbUploadPartiesAddressesPK.setSourceCode(item.getSource_code());
		transBctbUploadPartiesAddressesPK.setBranchCode(item.getBranch_code());
		transBctbUploadPartiesAddressesPK.setSourceRef(item.getSource_ref());
		transBctbUploadPartiesAddressesPK.setPartyType(item.getParty_type());
		transBctbUploadPartiesAddressesPK.setMedia(item.getMedia());

		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transBctbUploadPartiesAddressesPK.setSourceSeqNo(new Long(item.getSource_seq_no()));
		}
		transBctbUploadPartiesAddresses.setTransBctbUploadPartiesAddressesPK(transBctbUploadPartiesAddressesPK);

		return transBctbUploadPartiesAddresses;
	}
}