package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSvtmUploadAccSigDet;
import com.jmr.batch.model.TransSvtmUploadAccSigDetModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSvtmUploadAccSigDet
		implements ItemProcessor<TransSvtmUploadAccSigDetModel, TransSvtmUploadAccSigDet> {

	@Override
	public TransSvtmUploadAccSigDet process(TransSvtmUploadAccSigDetModel item) throws Exception {

		TransSvtmUploadAccSigDet transSttmUploadSweepDtls = new TransSvtmUploadAccSigDet();
		transSttmUploadSweepDtls.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadSweepDtls.setCif_sig_id(item.getCif_sig_id());
		transSttmUploadSweepDtls.setCifid(item.getCifid());
		transSttmUploadSweepDtls.setSig_msg(item.getSig_msg());
		transSttmUploadSweepDtls.setSig_type(item.getSig_type());
		transSttmUploadSweepDtls.setBranch(item.getBranch());
		transSttmUploadSweepDtls.setAcc_no(item.getAcc_no());
		transSttmUploadSweepDtls.setSource_code(item.getSource_code());
		transSttmUploadSweepDtls.setCif_sig_name(item.getCif_sig_name());
		transSttmUploadSweepDtls.setRecord_stat(item.getRecord_stat());
		if (!JMRUtil.isNullOrEmpty(item.getSolo_sufficient())) {
			transSttmUploadSweepDtls.setSolo_sufficient(Double.valueOf(item.getSolo_sufficient()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getApproval_limit())) {
			transSttmUploadSweepDtls.setApproval_limit(Double.valueOf(item.getApproval_limit()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSttmUploadSweepDtls.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}

		return transSttmUploadSweepDtls;
	}
}