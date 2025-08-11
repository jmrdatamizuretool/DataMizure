package com.jmr.batch.processor.instruments;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.instruments.TransActbReconMaster;
import com.jmr.batch.entity.instruments.TransActbReconMasterPK;
import com.jmr.batch.model.instruments.TransActbReconMasterModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProActbReconMaster implements ItemProcessor<TransActbReconMasterModel, TransActbReconMaster> {

	@Override

	public TransActbReconMaster process(TransActbReconMasterModel item) throws Exception {
		TransActbReconMaster transActbReconMaster = new TransActbReconMaster();
		transActbReconMaster.setCcy(item.getCcy());
		transActbReconMaster.setRefNo(item.getRef_no());
		transActbReconMaster.setStatus(item.getStatus());
		if (!JMRUtil.isNullOrEmpty(item.getEvent_seq_no())) {
			transActbReconMaster.setEventSeqNo(Double.valueOf(item.getEvent_seq_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getAmount())) {
			transActbReconMaster.setAmount(Double.valueOf(item.getAmount()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getAmount_to_recon())) {
			transActbReconMaster.setAmountToRecon(Double.valueOf(item.getAmount_to_recon()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getEntrydate())) {
			transActbReconMaster
					.setEntrydate(JMRDateUtil.getDateFromString(item.getEntrydate(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		TransActbReconMasterPK transActbReconMasterPK = new TransActbReconMasterPK();
		transActbReconMasterPK.setAccount(item.getAccount());
		transActbReconMasterPK.setBranch(item.getBranch());
		transActbReconMasterPK.setReconno(item.getReconno());

		transActbReconMaster.setId(transActbReconMasterPK);

		return transActbReconMaster;

	}
}