package com.jmr.batch.processor.checkbook;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.chequebook.TransCatmUploadCheckDetails;
import com.jmr.batch.entity.chequebook.TransCatmUploadCheckDetailsPK;
import com.jmr.batch.model.checkbook.TransCatmUploadCheckDetailsModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCatmUploadCheckDetails
		implements ItemProcessor<TransCatmUploadCheckDetailsModel, TransCatmUploadCheckDetails> {

	@Override

	public TransCatmUploadCheckDetails process(TransCatmUploadCheckDetailsModel item) throws Exception {
		TransCatmUploadCheckDetails transCatmUploadCheckDetails = new TransCatmUploadCheckDetails();
		transCatmUploadCheckDetails.setSource_code(item.getSource_code());
		transCatmUploadCheckDetails.setCheck_book_no(item.getCheck_book_no());

		transCatmUploadCheckDetails.setStatus(item.getStatus());

		if (!JMRUtil.isNullOrEmpty(item.getAmount())) {
			transCatmUploadCheckDetails.setAmount(Double.valueOf(item.getAmount()));
		}
		transCatmUploadCheckDetails.setBeneficiary(item.getBeneficiary());

		if (!JMRUtil.isNullOrEmpty(item.getPresentation_date())) {
			transCatmUploadCheckDetails.setPresentation_date(
					JMRDateUtil.getDateFromString(item.getPresentation_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}

		if (!JMRUtil.isNullOrEmpty(item.getValue_date())) {
			transCatmUploadCheckDetails.setValue_date(
					JMRDateUtil.getDateFromString(item.getValue_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		transCatmUploadCheckDetails.setRemarks(item.getRemarks());
		transCatmUploadCheckDetails.setUpload_status_flag(item.getUpload_status_flag());
		transCatmUploadCheckDetails.setErrmsg(item.getErrmsg());

		TransCatmUploadCheckDetailsPK transCatmUploadCheckDetailsPK = new TransCatmUploadCheckDetailsPK();

		transCatmUploadCheckDetailsPK.setAccount(item.getAccount());
		transCatmUploadCheckDetailsPK.setBranch(item.getBranch());
		transCatmUploadCheckDetailsPK.setCheck_no(item.getCheck_no());
		if (!JMRUtil.isNullOrEmpty(item.getMod_no())) {
			transCatmUploadCheckDetailsPK.setMod_no(Double.valueOf(item.getMod_no()));
		}

		transCatmUploadCheckDetails.setId(transCatmUploadCheckDetailsPK);

		return transCatmUploadCheckDetails;

	}
}
