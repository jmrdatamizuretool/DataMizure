package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmAutoLiabUpload;
import com.jmr.batch.model.TransSttmAutoLiabUploadModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttmAutoLiabUpload
		implements ItemProcessor<TransSttmAutoLiabUploadModel, TransSttmAutoLiabUpload> {

	@Override
	public TransSttmAutoLiabUpload process(TransSttmAutoLiabUploadModel item) throws Exception {

		TransSttmAutoLiabUpload transSttmAutoLiabUpload = new TransSttmAutoLiabUpload();

		transSttmAutoLiabUpload.setSource_code(item.getSource_code());
		transSttmAutoLiabUpload.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmAutoLiabUpload.setCust_no(item.getCust_no());
		transSttmAutoLiabUpload.setLiab_no(item.getLiab_no());
		transSttmAutoLiabUpload.setLiab_name(item.getLiab_name());
		transSttmAutoLiabUpload.setLiab_branch(item.getLiab_branch());
		transSttmAutoLiabUpload.setLiab_ccy(item.getLiab_ccy());
		if (!JMRUtil.isNullOrEmpty(item.getOverall_limit())) {
			transSttmAutoLiabUpload.setOverall_limit(Double.valueOf(item.getOverall_limit()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getRevision_date())) {
		transSttmAutoLiabUpload.setRevision_date(
				JMRDateUtil.getDateFromString(item.getRevision_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		transSttmAutoLiabUpload.setCategory(item.getCategory());
		transSttmAutoLiabUpload.setUser_define_status(item.getUser_define_status());
		transSttmAutoLiabUpload.setUnadvised(item.getUnadvised());
		transSttmAutoLiabUpload.setNetting_required(item.getNetting_required());
		if (!JMRUtil.isNullOrEmpty(item.getOverall_score())) {
			transSttmAutoLiabUpload.setOverall_score(Double.valueOf(item.getOverall_score()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getFx_clean_risk_limit())) {
			transSttmAutoLiabUpload.setFx_clean_risk_limit(Double.valueOf(item.getFx_clean_risk_limit()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSec_clean_risk_limit())) {
			transSttmAutoLiabUpload.setSec_clean_risk_limit(Double.valueOf(item.getSec_clean_risk_limit()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSec_pstl_risk_limit())) {
			transSttmAutoLiabUpload.setSec_pstl_risk_limit(Double.valueOf(item.getSec_pstl_risk_limit()));
		}
		transSttmAutoLiabUpload.setUser_ref_no(item.getUser_ref_no());

		return transSttmAutoLiabUpload;
	}

}
