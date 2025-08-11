package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransIctmAccPrUpload;
import com.jmr.batch.model.TransIctmAccPrUploadModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIctmAccPrUpload implements ItemProcessor<TransIctmAccPrUploadModel, TransIctmAccPrUpload> {

	@Override
	public TransIctmAccPrUpload process(TransIctmAccPrUploadModel item) throws Exception {
		TransIctmAccPrUpload transIctmAccPrUpload = new TransIctmAccPrUpload();
		transIctmAccPrUpload.setProd(item.getProd());
		transIctmAccPrUpload.setBrn(item.getBrn());
		transIctmAccPrUpload.setBranch_code(item.getBranch_code());
		transIctmAccPrUpload.setSource_code(item.getSource_code());
		transIctmAccPrUpload.setAcc(item.getAcc());
		transIctmAccPrUpload.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmAccPrUpload.setProcess_status(item.getProcess_status());
		transIctmAccPrUpload.setWaive(item.getWaive());
		transIctmAccPrUpload.setGen_uca(item.getGen_uca());
		transIctmAccPrUpload.setRecord_stat(item.getRecord_stat());
		transIctmAccPrUpload.setOnce_auth(item.getOnce_auth());
		transIctmAccPrUpload.setUde_ccy(item.getUde_ccy());
		transIctmAccPrUpload.setCont_var_roll(item.getCont_var_roll());
		if (!JMRUtil.isNullOrEmpty(item.getFree_txn())) {
			transIctmAccPrUpload.setFree_txn(Double.valueOf(item.getFree_txn()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMin_amt())) {
			transIctmAccPrUpload.setMin_amt(Double.valueOf(item.getMin_amt()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMax_amt())) {
			transIctmAccPrUpload.setMax_amt(Double.valueOf(item.getMax_amt()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transIctmAccPrUpload.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		return transIctmAccPrUpload;
	}
}