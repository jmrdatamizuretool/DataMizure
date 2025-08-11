package com.jmr.batch.processor.loan;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAcUdeUpload;
import com.jmr.batch.entity.loan.TransCltbAcUdeUploadPK;
import com.jmr.batch.model.loan.TransCltbAcUdeUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAcUdeUpload implements ItemProcessor<TransCltbAcUdeUploadModel, TransCltbAcUdeUpload> {

	@Override
	public TransCltbAcUdeUpload process(TransCltbAcUdeUploadModel item) throws Exception {
		TransCltbAcUdeUpload transCltbAcUdeUpload = new TransCltbAcUdeUpload();
		transCltbAcUdeUpload.setBranch_code(item.getBranch_code());
		transCltbAcUdeUpload.setProcess_code(item.getProcess_code());
		transCltbAcUdeUpload.setExt_ref_no(item.getExt_ref_no());
		//transCltbAcUdeUpload.setUde_id(item.getUde_id());
		transCltbAcUdeUpload.setRate_code(item.getRate_code());
		transCltbAcUdeUpload.setSource_code(item.getSource_code());
		transCltbAcUdeUpload.setCode_usage(item.getCode_usage());
		transCltbAcUdeUpload.setMaint_rslv_flag(item.getMaint_rslv_flag());
		/*
		 * if (!JMRUtil.isNullOrEmpty(item.getUde_value())) {
		 * transCltbAcUdeUpload.setUde_value(Double.valueOf(item.getUde_value())); }
		 */
		if (!JMRUtil.isNullOrEmpty(item.getResolved_value())) {
			transCltbAcUdeUpload.setResolved_value(Double.valueOf(item.getResolved_value()));
		}
		/*
		 * if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
		 * transCltbAcUdeUpload.setSequence_no(Double.valueOf(item.getSequence_no())); }
		 */
		if (!JMRUtil.isNullOrEmpty(item.getEffective_date())) {
			transCltbAcUdeUpload.setEffective_date(
					JMRDateUtil.getDateFromString(item.getEffective_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		transCltbAcUdeUpload.setRate_basis(item.getRate_basis());
		TransCltbAcUdeUploadPK transCltbAcUdeUploadPK = new TransCltbAcUdeUploadPK();

		if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
			transCltbAcUdeUploadPK.setSequence_no(Double.valueOf(item.getSequence_no()));
		}
		transCltbAcUdeUploadPK.setUde_id(item.getUde_id());

		if (!JMRUtil.isNullOrEmpty(item.getUde_value())) {
			transCltbAcUdeUploadPK.setUde_value(Double.valueOf(item.getUde_value()));
		}

		transCltbAcUdeUpload.setTransCltbAcUdeUploadPK(transCltbAcUdeUploadPK);
		return transCltbAcUdeUpload;
	}
}
