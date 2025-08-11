package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSvtmUploadAccSigMaster;
import com.jmr.batch.model.TransSvtmUploadAccSigMasterModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSvtmUploadAccSigMaster
		implements ItemProcessor<TransSvtmUploadAccSigMasterModel, TransSvtmUploadAccSigMaster> {

	@Override
	public TransSvtmUploadAccSigMaster process(TransSvtmUploadAccSigMasterModel item) throws Exception {

		TransSvtmUploadAccSigMaster transSvtmUploadAccSigMaster = new TransSvtmUploadAccSigMaster();
		transSvtmUploadAccSigMaster.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSvtmUploadAccSigMaster.setSource_code(item.getSource_code());
		transSvtmUploadAccSigMaster.setBranch(item.getBranch());
		transSvtmUploadAccSigMaster.setAcc_no(item.getAcc_no());
		transSvtmUploadAccSigMaster.setAcc_msg(item.getAcc_msg());
		if (!JMRUtil.isNullOrEmpty(item.getMin_no_of_sig())) {
			transSvtmUploadAccSigMaster.setMin_no_of_sig(Double.valueOf(item.getMin_no_of_sig()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSvtmUploadAccSigMaster.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}

		return transSvtmUploadAccSigMaster;
	}

}
