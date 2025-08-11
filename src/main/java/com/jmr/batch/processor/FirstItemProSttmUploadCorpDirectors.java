package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadCorpDirectors;
import com.jmr.batch.model.TransSttmUploadCorpDirectorsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttmUploadCorpDirectors
		implements ItemProcessor<TransSttmUploadCorpDirectorsModel, TransSttmUploadCorpDirectors> {
	@Override
	public TransSttmUploadCorpDirectors process(TransSttmUploadCorpDirectorsModel item) throws Exception {

		TransSttmUploadCorpDirectors transSttmUploadCorpDirectors = new TransSttmUploadCorpDirectors();
		transSttmUploadCorpDirectors.setCustomer_no(item.getCustomer_no());
		transSttmUploadCorpDirectors.setDirector_name(item.getDirector_name());
		transSttmUploadCorpDirectors.setConversion_status_flag(item.getConversion_status_flag());
		transSttmUploadCorpDirectors.setErr_msg(item.getErr_msg());
		transSttmUploadCorpDirectors.setMaintenance_seq_no(item.getMaintenance_seq_no());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSttmUploadCorpDirectors.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		transSttmUploadCorpDirectors.setBranch_code(item.getBranch_code());
		transSttmUploadCorpDirectors.setSource_code(item.getSource_code());
		if (!JMRUtil.isNullOrEmpty(item.getSlno())) {
			transSttmUploadCorpDirectors.setSlno(Double.valueOf(item.getSlno()));
		}
		transSttmUploadCorpDirectors.setAddress_line1(item.getAddress_line1());
		transSttmUploadCorpDirectors.setAddress_line2(item.getAddress_line2());
		transSttmUploadCorpDirectors.setAddress_line3(item.getAddress_line3());
		transSttmUploadCorpDirectors.setAddress_line4(item.getAddress_line4());
		transSttmUploadCorpDirectors.setP_address1(item.getP_address1());
		transSttmUploadCorpDirectors.setP_address2(item.getP_address2());
		transSttmUploadCorpDirectors.setP_address3(item.getP_address3());
		transSttmUploadCorpDirectors.setP_country(item.getP_country());
		transSttmUploadCorpDirectors.setTelephone(item.getTelephone());
		transSttmUploadCorpDirectors.setTax_id(item.getTax_id());
		transSttmUploadCorpDirectors.setMobile_number(item.getMobile_number());
		transSttmUploadCorpDirectors.setE_mail(item.getE_mail());
		if (!JMRUtil.isNullOrEmpty(item.getTel_isd_no())) {
			transSttmUploadCorpDirectors.setTel_isd_no(Double.valueOf(item.getTel_isd_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMob_isd_no())) {
			transSttmUploadCorpDirectors.setMob_isd_no(Double.valueOf(item.getMob_isd_no()));
		}
		transSttmUploadCorpDirectors.setAddr_country(item.getAddr_country());
		transSttmUploadCorpDirectors.setNationality(item.getNationality());
		transSttmUploadCorpDirectors.setUs_res_status(item.getUs_res_status());
		if (!JMRUtil.isNullOrEmpty(item.getPct_holding())) {
			transSttmUploadCorpDirectors.setPct_holding(Double.valueOf(item.getPct_holding()));
		}
		transSttmUploadCorpDirectors.setHome_tel_no(item.getHome_tel_no());
		if (!JMRUtil.isNullOrEmpty(item.getHome_tel_isd())) {
			transSttmUploadCorpDirectors.setHome_tel_isd(Double.valueOf(item.getHome_tel_isd()));
		}
		transSttmUploadCorpDirectors.setP_pincode(item.getP_pincode());
		transSttmUploadCorpDirectors.setPincode(item.getPincode());
		transSttmUploadCorpDirectors.setP_address4(item.getP_address4());
		return transSttmUploadCorpDirectors;
	}
}
