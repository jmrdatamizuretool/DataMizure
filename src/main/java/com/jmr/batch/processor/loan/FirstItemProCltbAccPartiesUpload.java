package com.jmr.batch.processor.loan;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAccPartiesUpload;
import com.jmr.batch.entity.loan.TransCltbAccPartiesUploadPK;
import com.jmr.batch.model.loan.TransCltbAccPartiesUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAccPartiesUpload
		implements ItemProcessor<TransCltbAccPartiesUploadModel, TransCltbAccPartiesUpload> {

	@Override
	public TransCltbAccPartiesUpload process(TransCltbAccPartiesUploadModel item) throws Exception {
		TransCltbAccPartiesUpload transCltbAccPartiesUpload = new TransCltbAccPartiesUpload();

		transCltbAccPartiesUpload.setSourceCode(item.getSource_code());

		transCltbAccPartiesUpload.setCustomerName(item.getCustomer_name());
		if (!JMRUtil.isNullOrEmpty(item.getLiability())) {
			transCltbAccPartiesUpload.setLiability(new BigDecimal(item.getLiability()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getLiability_amt())) {
			transCltbAccPartiesUpload.setLiabilityAmt(new BigDecimal(item.getLiability_amt()));
		}

		if (!JMRUtil.isNullOrEmpty(item.getEffective_date())) {
			transCltbAccPartiesUpload.setEffectiveDate(
					JMRDateUtil.getDateFromString(item.getEffective_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}

		TransCltbAccPartiesUploadPK transCltbAccPartiesUploadPK = new TransCltbAccPartiesUploadPK();
		transCltbAccPartiesUploadPK.setProcessCode(item.getProcess_code());
		transCltbAccPartiesUploadPK.setBranchCode(item.getBranch_code());
		transCltbAccPartiesUploadPK.setCustomerId(item.getCustomer_id());
		transCltbAccPartiesUploadPK.setExtRefNo(item.getExt_ref_no());
		transCltbAccPartiesUploadPK.setResponsibility(item.getResponsibility());

		if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
			transCltbAccPartiesUploadPK.setSequenceNo(new Long(item.getSequence_no()));
		}
		transCltbAccPartiesUpload.setId(transCltbAccPartiesUploadPK);

		return transCltbAccPartiesUpload;
	}
}