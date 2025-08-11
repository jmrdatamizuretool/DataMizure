package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransIctmAccUdevalsUpload;
import com.jmr.batch.model.TransIctmAccUdevalsUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIctmAccUdevalsUpload
		implements ItemProcessor<TransIctmAccUdevalsUploadModel, TransIctmAccUdevalsUpload> {

	@Override
	public TransIctmAccUdevalsUpload process(TransIctmAccUdevalsUploadModel item) throws Exception {
		TransIctmAccUdevalsUpload transIctmAccUdevalsUpload = new TransIctmAccUdevalsUpload();
		transIctmAccUdevalsUpload.setUde_id(item.getUde_id());
		transIctmAccUdevalsUpload.setTd_rate_code(item.getTd_rate_code());
		transIctmAccUdevalsUpload.setSource_code(item.getSource_code());
		transIctmAccUdevalsUpload.setRecord_stat(item.getRecord_stat());
		transIctmAccUdevalsUpload.setRate_code(item.getRate_code());
		transIctmAccUdevalsUpload.setProd(item.getProd());
		transIctmAccUdevalsUpload.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmAccUdevalsUpload.setBrn(item.getBrn());
		transIctmAccUdevalsUpload.setBranch_code(item.getBranch_code());
		transIctmAccUdevalsUpload.setAuth_stat(item.getAuth_stat());
		transIctmAccUdevalsUpload.setAcc(item.getAcc());
		if (!JMRUtil.isNullOrEmpty(item.getUde_value())) {
			transIctmAccUdevalsUpload.setUde_value(Double.valueOf(item.getUde_value()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transIctmAccUdevalsUpload.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getBase_spread())) {
			transIctmAccUdevalsUpload.setBase_spread(Double.valueOf(item.getBase_spread()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getBase_rate())) {
			transIctmAccUdevalsUpload.setBase_rate(Double.valueOf(item.getBase_rate()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUde_eff_dt())) {
			transIctmAccUdevalsUpload.setUde_eff_dt(
					JMRDateUtil.getDateFromDateString(item.getUde_eff_dt(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		return transIctmAccUdevalsUpload;

	}

}
