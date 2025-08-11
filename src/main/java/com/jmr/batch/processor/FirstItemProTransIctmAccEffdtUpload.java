package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransIctmAccEffdtUpload;
import com.jmr.batch.model.TransIctmAccEffdtUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProTransIctmAccEffdtUpload
		implements ItemProcessor<TransIctmAccEffdtUploadModel, TransIctmAccEffdtUpload> {

	@Override

	public TransIctmAccEffdtUpload process(TransIctmAccEffdtUploadModel item) throws Exception {
		TransIctmAccEffdtUpload transIctmAccEffdtUpload = new TransIctmAccEffdtUpload();
		transIctmAccEffdtUpload.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmAccEffdtUpload.setSource_code(item.getSource_code());
		transIctmAccEffdtUpload.setBrn(item.getBrn());
		transIctmAccEffdtUpload.setAcc(item.getAcc());
		transIctmAccEffdtUpload.setProd(item.getProd());
		if (!JMRUtil.isNullOrEmpty(item.getUde_eff_dt())) {
			transIctmAccEffdtUpload.setUde_eff_dt(
					JMRDateUtil.getDateFromDateString(item.getUde_eff_dt(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		transIctmAccEffdtUpload.setRecord_stat(item.getRecord_stat());
		transIctmAccEffdtUpload.setOnce_auth(item.getOnce_auth());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transIctmAccEffdtUpload.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		
		transIctmAccEffdtUpload.setBranch_code(item.getBranch_code());
		return transIctmAccEffdtUpload;

	}

}
