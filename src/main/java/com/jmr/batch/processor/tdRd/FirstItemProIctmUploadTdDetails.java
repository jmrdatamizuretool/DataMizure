package com.jmr.batch.processor.tdRd;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.tdRd.TransIctmUploadTdDetails;
import com.jmr.batch.model.tdRd.TransIctmUploadTdDetailsModel;
import com.jmr.framework.util.JMRUtil;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdDetailsPK;

@Component
public class FirstItemProIctmUploadTdDetails
		implements ItemProcessor<TransIctmUploadTdDetailsModel, TransIctmUploadTdDetails> {

	@Override

	public TransIctmUploadTdDetails process(TransIctmUploadTdDetailsModel item) throws Exception {
		TransIctmUploadTdDetails transIctmUploadTdDetails = new TransIctmUploadTdDetails();

		transIctmUploadTdDetails.setPayin_option(item.getPayin_option());
		transIctmUploadTdDetails.setTd_amount(item.getTd_amount());
		transIctmUploadTdDetails.setOffset_brn(item.getOffset_brn());
		transIctmUploadTdDetails.setTd_offset_acc(item.getTd_offset_acc());
		transIctmUploadTdDetails.setReference_no(item.getReference_no());
		transIctmUploadTdDetails.setRedem_amt(item.getRedem_amt());
		transIctmUploadTdDetails.setLiq_amt(item.getLiq_amt());
		transIctmUploadTdDetails.setStock_catlog_cd(item.getStock_catlog_cd());
		transIctmUploadTdDetails.setCertificate_no(item.getCertificate_no());
		transIctmUploadTdDetails.setDuplicate_issue(item.getDuplicate_issue());
		transIctmUploadTdDetails.setTarget_amount(item.getTarget_amount());

		TransIctmUploadTdDetailsPK transIctmUploadTdDetailsPK = new TransIctmUploadTdDetailsPK();

		transIctmUploadTdDetails.setId(transIctmUploadTdDetailsPK);
		transIctmUploadTdDetailsPK.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmUploadTdDetailsPK.setSource_code(item.getSource_code());
		transIctmUploadTdDetailsPK.setBrn(item.getBrn());
		transIctmUploadTdDetailsPK.setAcc(item.getAcc());
		transIctmUploadTdDetailsPK.setCcy(item.getCcy());
		
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transIctmUploadTdDetailsPK.setSource_seq_no(Long.valueOf(item.getSource_seq_no()));
		}
		// transIctmUploadTdDetailsPK.setSource_seq_no(item.getSource_seq_no());
		transIctmUploadTdDetailsPK.setBranch_code(item.getBranch_code());

		return transIctmUploadTdDetails;

	}
}