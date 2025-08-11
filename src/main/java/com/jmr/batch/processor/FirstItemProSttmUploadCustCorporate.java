package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadCustCorporate;
import com.jmr.batch.model.TransSttmUploadCustCorporateModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttmUploadCustCorporate
		implements ItemProcessor<TransSttmUploadCustCorporateModel, TransSttmUploadCustCorporate> {
	@Override
	public TransSttmUploadCustCorporate process(TransSttmUploadCustCorporateModel item) throws Exception {

		TransSttmUploadCustCorporate transSttmUploadCustCorporate = new TransSttmUploadCustCorporate();
	
		transSttmUploadCustCorporate.setCustomer_no(item.getCustomer_no());
		transSttmUploadCustCorporate.setCorporate_name(item.getCorporate_name());
		transSttmUploadCustCorporate.setC_national_id(item.getC_national_id());
		transSttmUploadCustCorporate.setR_address1(item.getR_address1());
		transSttmUploadCustCorporate.setR_address2(item.getR_address2());
		transSttmUploadCustCorporate.setR_address3(item.getR_address3());
		transSttmUploadCustCorporate
				.setIncorp_date(JMRDateUtil.getDateFromString(item.getIncorp_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		if (!JMRUtil.isNullOrEmpty(item.getCapital())) {
			transSttmUploadCustCorporate.setCapital(Double.valueOf(item.getCapital()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getNetworth())) {
		transSttmUploadCustCorporate.setNetworth(Double.valueOf(item.getNetworth()));
		}
		transSttmUploadCustCorporate.setBusiness_description(item.getBusiness_description());
		transSttmUploadCustCorporate.setIncorp_country(item.getIncorp_country());
		transSttmUploadCustCorporate.setR_country(item.getR_country());
		transSttmUploadCustCorporate.setAmounts_ccy(item.getAmounts_ccy());
		transSttmUploadCustCorporate.setConversion_status_flag(item.getConversion_status_flag());
		transSttmUploadCustCorporate.setErr_msg(item.getErr_msg());
		transSttmUploadCustCorporate.setMaintenance_seq_no(item.getMaintenance_seq_no());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
		transSttmUploadCustCorporate.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		transSttmUploadCustCorporate.setBranch_code(item.getBranch_code());
		transSttmUploadCustCorporate.setSource_code(item.getSource_code());
		transSttmUploadCustCorporate.setR_address4(item.getR_address4());
		transSttmUploadCustCorporate.setR_pincode(item.getR_pincode());
		transSttmUploadCustCorporate.setPref_contact_dt(
				JMRDateUtil.getDateFromString(item.getPref_contact_dt(), JMRDateUtil.DATE_FORMATMMddyyyy));
		if (!JMRUtil.isNullOrEmpty(item.getPref_contact_time())) {
		transSttmUploadCustCorporate.setPref_contact_time(Double.valueOf(item.getPref_contact_time()));
		}
		transSttmUploadCustCorporate.setOwnership_type(item.getOwnership_type());
		return transSttmUploadCustCorporate;
	}
}
