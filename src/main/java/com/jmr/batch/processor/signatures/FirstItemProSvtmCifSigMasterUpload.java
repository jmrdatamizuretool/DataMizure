package com.jmr.batch.processor.signatures;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.signatures.TransSvtmCifSigMasterUpload;
import com.jmr.batch.model.signatures.TransSvtmCifSigMasterUploadModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSvtmCifSigMasterUpload
		implements ItemProcessor<TransSvtmCifSigMasterUploadModel, TransSvtmCifSigMasterUpload> {

	@Override
	public TransSvtmCifSigMasterUpload process(TransSvtmCifSigMasterUploadModel item) throws Exception {
		TransSvtmCifSigMasterUpload transSvtmCifSigMasterUpload = new TransSvtmCifSigMasterUpload();
		if (!JMRUtil.isNullOrEmpty(item.getSig_text())) {
			transSvtmCifSigMasterUpload.setSig_text(Byte.valueOf(item.getSignature()));
		}
		/*
		 * if (!JMRUtil.isNullOrEmpty(item.getSign_img())) {
		 * transSvtmCifSigMasterUpload.setSign_img(item.getSign_img()); }
		 */

		transSvtmCifSigMasterUpload.setCif_id(item.getCif_id());
		transSvtmCifSigMasterUpload.setCif_sig_id(item.getCif_sig_id());
		transSvtmCifSigMasterUpload.setBranch(item.getBranch());
		transSvtmCifSigMasterUpload.setCif_sig_name(item.getCif_sig_name());
		transSvtmCifSigMasterUpload.setCif_sig_title(item.getCif_sig_title());
		transSvtmCifSigMasterUpload.setSpecimen_no(item.getSpecimen_no());
		transSvtmCifSigMasterUpload.setSpecimen_seq_no(item.getSpecimen_seq_no());

		transSvtmCifSigMasterUpload.setSignature(item.getSignature());
		transSvtmCifSigMasterUpload.setExt_fname(item.getExt_fname());

		return transSvtmCifSigMasterUpload;
	}
}