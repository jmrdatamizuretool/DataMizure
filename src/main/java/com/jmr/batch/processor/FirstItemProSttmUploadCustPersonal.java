package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadCustPersonal;
import com.jmr.batch.model.TransSttmUploadCustPersonalModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttmUploadCustPersonal
		implements ItemProcessor<TransSttmUploadCustPersonalModel, TransSttmUploadCustPersonal> {

	@Override
	public TransSttmUploadCustPersonal process(TransSttmUploadCustPersonalModel item) throws Exception {

		TransSttmUploadCustPersonal transSttmUploadCustPersonal = new TransSttmUploadCustPersonal();

		transSttmUploadCustPersonal.setCustomer_prefix(item.getCustomer_prefix());
		transSttmUploadCustPersonal.setFirst_name(item.getFirst_name());
		transSttmUploadCustPersonal.setMiddle_name(item.getMiddle_name());
		transSttmUploadCustPersonal.setLast_name(item.getLast_name());
		if (!JMRUtil.isNullOrEmpty(item.getDate_of_birth())) {
		transSttmUploadCustPersonal.setDate_of_birth(
				JMRDateUtil.getDateFromString(item.getDate_of_birth(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		
		transSttmUploadCustPersonal.setLegal_guardian(item.getLegal_guardian());
		transSttmUploadCustPersonal.setMinor(item.getMinor());
		transSttmUploadCustPersonal.setSex(item.getSex());
		transSttmUploadCustPersonal.setP_national_id(item.getP_national_id());
		transSttmUploadCustPersonal.setPassport_no(item.getPassport_no());
		if (!JMRUtil.isNullOrEmpty(item.getPpt_iss_date())) {
		transSttmUploadCustPersonal.setPpt_iss_date(
				JMRDateUtil.getDateFromString(item.getPpt_iss_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getPpt_exp_date())) {
		transSttmUploadCustPersonal.setPpt_exp_date(
				JMRDateUtil.getDateFromString(item.getPpt_exp_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		transSttmUploadCustPersonal.setD_address1(item.getD_address1());
		transSttmUploadCustPersonal.setD_address2(item.getD_address2());
		transSttmUploadCustPersonal.setD_address3(item.getD_address3());
		transSttmUploadCustPersonal.setTelephone(item.getTelephone());
		transSttmUploadCustPersonal.setFax(item.getFax());
		transSttmUploadCustPersonal.setE_mail(item.getE_mail());
		transSttmUploadCustPersonal.setP_address1(item.getP_address1());
		transSttmUploadCustPersonal.setP_address3(item.getP_address3());
		transSttmUploadCustPersonal.setP_address2(item.getP_address2());
		transSttmUploadCustPersonal.setCustomer_no(item.getCustomer_no());
		transSttmUploadCustPersonal.setD_country(item.getD_country());
		transSttmUploadCustPersonal.setP_country(item.getP_country());
		transSttmUploadCustPersonal.setResident_status(item.getResident_status());
		transSttmUploadCustPersonal.setConversion_status_flag(item.getConversion_status_flag());
		transSttmUploadCustPersonal.setErr_msg(item.getErr_msg());
		transSttmUploadCustPersonal.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadCustPersonal.setCustomer_prefix1(item.getCustomer_prefix1());
		transSttmUploadCustPersonal.setCustomer_prefix2(item.getCustomer_prefix2());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
		transSttmUploadCustPersonal.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		transSttmUploadCustPersonal.setBranch_code(item.getBranch_code());
		transSttmUploadCustPersonal.setSource_code(item.getSource_code());
		transSttmUploadCustPersonal.setAge_proof_submitted(item.getAge_proof_submitted());
		transSttmUploadCustPersonal.setP_address4(item.getP_address4());
		transSttmUploadCustPersonal.setD_address4(item.getD_address4());
		transSttmUploadCustPersonal.setPlace_of_birth(item.getPlace_of_birth());
		transSttmUploadCustPersonal.setBirth_country(item.getBirth_country());
		if (!JMRUtil.isNullOrEmpty(item.getTel_isd_no())) {
		transSttmUploadCustPersonal.setTel_isd_no(Double.valueOf(item.getTel_isd_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getMob_isd_no())) {
		transSttmUploadCustPersonal.setMob_isd_no(Double.valueOf(item.getMob_isd_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getFax_isd_no())) {
		transSttmUploadCustPersonal.setFax_isd_no(Double.valueOf(item.getFax_isd_no()));
		}
		transSttmUploadCustPersonal.setUs_res_status(item.getUs_res_status());
		transSttmUploadCustPersonal.setPa_issued(item.getPa_issued());
		transSttmUploadCustPersonal.setPa_holder_name(item.getPa_holder_name());
		transSttmUploadCustPersonal.setPa_holder_nationalty(item.getPa_holder_nationalty());
		transSttmUploadCustPersonal.setPa_holder_addr(item.getPa_holder_addr());
		transSttmUploadCustPersonal.setPa_holder_addr_country(item.getPa_holder_addr_country());
		if (!JMRUtil.isNullOrEmpty(item.getPa_holder_tel_isd())) {
		transSttmUploadCustPersonal.setPa_holder_tel_isd(Double.valueOf(item.getPa_holder_tel_isd()));
		}
		transSttmUploadCustPersonal.setPa_holder_tel_no(item.getPa_holder_tel_no());
		transSttmUploadCustPersonal.setVst_us_prev(item.getVst_us_prev());
		transSttmUploadCustPersonal.setMobile_number(item.getMobile_number());
		transSttmUploadCustPersonal.setCust_comm_mode(item.getCust_comm_mode());
		transSttmUploadCustPersonal.setHome_tel_no(item.getHome_tel_no());
		if (!JMRUtil.isNullOrEmpty(item.getHome_tel_isd())) {
		transSttmUploadCustPersonal.setHome_tel_isd(Double.valueOf(item.getHome_tel_isd()));
		}
		transSttmUploadCustPersonal.setP_pincode(item.getP_pincode());
		if (!JMRUtil.isNullOrEmpty(item.getPref_contact_dt())) {
		transSttmUploadCustPersonal.setPref_contact_dt(
				JMRDateUtil.getDateFromString(item.getPref_contact_dt(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getPref_contact_time())) {
		transSttmUploadCustPersonal.setPref_contact_time(Double.valueOf(item.getPref_contact_time()));
		}
		transSttmUploadCustPersonal.setD_pincode(item.getD_pincode());
		transSttmUploadCustPersonal.setMother_maiden_name(item.getMother_maiden_name());

		return transSttmUploadCustPersonal;
	}

}
