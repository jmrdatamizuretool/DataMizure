package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadCustomer;
import com.jmr.batch.model.TransSttmUploadCustomerModel;
import com.jmr.framework.util.JMRDateUtil;



@Component
public class FirstItemProSttmUploadCustomer implements ItemProcessor<TransSttmUploadCustomerModel, TransSttmUploadCustomer> {

	@Override
	public TransSttmUploadCustomer process(TransSttmUploadCustomerModel item) throws Exception {

		
		TransSttmUploadCustomer transSttmUploadCustomer = new TransSttmUploadCustomer();
		
		transSttmUploadCustomer.setSource_code(item.getSource_code());
		transSttmUploadCustomer.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadCustomer.setCustomer_no(item.getCustomer_no());
		transSttmUploadCustomer.setCustomer_type(item.getCustomer_type());
		transSttmUploadCustomer.setCustomer_name1(item.getCustomer_name1());
		transSttmUploadCustomer.setAddress_line1(item.getAddress_line1());
		transSttmUploadCustomer.setAddress_line3(item.getAddress_line3());
		transSttmUploadCustomer.setAddress_line2(item.getAddress_line2());
		transSttmUploadCustomer.setAddress_line4(item.getAddress_line4());
		transSttmUploadCustomer.setCountry(item.getCountry());
		transSttmUploadCustomer.setShort_name(item.getShort_name());
		transSttmUploadCustomer.setNationality(item.getNationality());
		transSttmUploadCustomer.setLanguage(item.getLanguage());
		transSttmUploadCustomer.setExposure_country(item.getExposure_country());
		transSttmUploadCustomer.setLocal_branch(item.getLoc_code());
		transSttmUploadCustomer.setLiability_no(item.getLiability_no());
		transSttmUploadCustomer.setUnique_id_name(item.getUnique_id_name());
		transSttmUploadCustomer.setUnique_id_value(item.getUnique_id_value());
		transSttmUploadCustomer.setFrozen(item.getFrozen());
		transSttmUploadCustomer.setDeceased(item.getDeceased());
		transSttmUploadCustomer.setWhereabouts_unknown(item.getWhereabouts_unknown());
		transSttmUploadCustomer.setCustomer_category(item.getCustomer_category());
		transSttmUploadCustomer.setHo_ac_no(item.getHo_ac_no());
		transSttmUploadCustomer.setFx_cust_clean_risk_limit(Double.valueOf(item.getFx_cust_clean_risk_limit()));
		transSttmUploadCustomer.setOverall_limit(Double.valueOf(item.getOverall_limit()));
		transSttmUploadCustomer.setFx_clean_risk_limit(Double.valueOf(item.getFx_clean_risk_limit()));
		transSttmUploadCustomer.setCredit_rating(item.getCredit_rating());
		transSttmUploadCustomer.setRevision_date(JMRDateUtil.getDateFromString(item.getRevision_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadCustomer.setLimit_ccy(item.getLimit_ccy());
		transSttmUploadCustomer.setCas_cust(item.getCas_cust());
		transSttmUploadCustomer.setConversion_status_flag(item.getConversion_status_flag());
		transSttmUploadCustomer.setErr_msg(item.getErr_msg());
		transSttmUploadCustomer.setSec_cust_clean_risk_limit(Double.valueOf(item.getSec_cust_clean_risk_limit()));
		transSttmUploadCustomer.setSec_clean_risk_limit(Double.valueOf(item.getSec_clean_risk_limit()));
		transSttmUploadCustomer.setSec_cust_pstl_risk_limit(Double.valueOf(item.getSec_cust_pstl_risk_limit()));
		transSttmUploadCustomer.setSec_pstl_risk_limit(Double.valueOf(item.getSec_pstl_risk_limit()));
		transSttmUploadCustomer.setSwift_code(item.getSwift_code());
		transSttmUploadCustomer.setLiab_br(item.getLiab_br());
		transSttmUploadCustomer.setLiab_node(item.getLiab_node());
		transSttmUploadCustomer.setPast_due_flag(item.getPast_due_flag());
		transSttmUploadCustomer.setDefault_media(item.getDefault_media());
		transSttmUploadCustomer.setLoc_code(item.getLoc_code());
		transSttmUploadCustomer.setShort_name2(item.getShort_name2());
		transSttmUploadCustomer.setSsn(item.getSsn());
		transSttmUploadCustomer.setAction_code(item.getAction_code());
		transSttmUploadCustomer.setUtility_provider(item.getUtility_provider());
		transSttmUploadCustomer.setUtility_provider_id(item.getUtility_provider_id());
		transSttmUploadCustomer.setRisk_profile(item.getRisk_profile());
		transSttmUploadCustomer.setDebtor_category(item.getDebtor_category());
		transSttmUploadCustomer.setUdf_1(item.getUdf_1());
		transSttmUploadCustomer.setUdf_2(item.getUdf_2());
		transSttmUploadCustomer.setUdf_3(item.getUdf_3());
		transSttmUploadCustomer.setUdf_4(item.getUdf_4());
		transSttmUploadCustomer.setUdf_5(item.getUdf_5());
		transSttmUploadCustomer.setMailers_required(item.getMailers_required());
		transSttmUploadCustomer.setAml_customer_grp(item.getAml_customer_grp());
		transSttmUploadCustomer.setAml_required(item.getAml_required());
		transSttmUploadCustomer.setGroup_code(item.getGroup_code());
		transSttmUploadCustomer.setExposure_category(item.getExposure_category());
		transSttmUploadCustomer.setCust_classification(item.getCust_classification());
		transSttmUploadCustomer.setCif_status(item.getCif_status());
		transSttmUploadCustomer.setCif_status_since(JMRDateUtil.getDateFromString(item.getCif_status_since(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadCustomer.setIntroducer(item.getIntroducer());
		transSttmUploadCustomer.setFt_accting_as_of(item.getFt_accting_as_of());
		transSttmUploadCustomer.setCust_unadvised(item.getCust_unadvised());
		transSttmUploadCustomer.setLiab_unadvised(item.getLiab_unadvised());
		transSttmUploadCustomer.setTax_group(item.getTax_group());
		transSttmUploadCustomer.setConsol_tax_cert_reqd(item.getConsol_tax_cert_reqd());
		transSttmUploadCustomer.setIndividual_tax_cert_reqd(item.getIndividual_tax_cert_reqd());
		transSttmUploadCustomer.setFx_netting_customer(item.getFx_netting_customer());
		transSttmUploadCustomer.setCls_participant(item.getCls_participant());
		transSttmUploadCustomer.setCls_ccy_allowed(item.getCls_ccy_allowed());
		transSttmUploadCustomer.setRisk_category(item.getRisk_category());
		transSttmUploadCustomer.setFax_number(item.getFax_number());
		transSttmUploadCustomer.setExt_ref_no(item.getExt_ref_no());
		transSttmUploadCustomer.setCrm_customer(item.getCrm_customer());
		transSttmUploadCustomer.setIssuer_customer(item.getIssuer_customer());
		transSttmUploadCustomer.setTreasury_customer(item.getTreasury_customer());
		transSttmUploadCustomer.setCharge_group(item.getCharge_group());
		transSttmUploadCustomer.setFull_name(item.getFull_name());
		transSttmUploadCustomer.setMaker_id(item.getMaker_id());
		transSttmUploadCustomer.setMaker_dt_stamp(JMRDateUtil.getDateFromString(item.getMaker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadCustomer.setChecker_id(item.getChecker_id());
		transSttmUploadCustomer.setChecker_dt_stamp(JMRDateUtil.getDateFromString(item.getChecker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadCustomer.setCust_clg_group(item.getCust_clg_group());
		transSttmUploadCustomer.setChk_digit_valid_reqd(item.getChk_digit_valid_reqd());
		transSttmUploadCustomer.setAlg_id(item.getAlg_id());
		transSttmUploadCustomer.setWht_pct(Double.valueOf(item.getWht_pct()));
		transSttmUploadCustomer.setRp_customer(item.getRp_customer());
		transSttmUploadCustomer.setSource_seq_no(item.getSource_seq_no());
		transSttmUploadCustomer.setBranch_code(item.getBranch_code());
		transSttmUploadCustomer.setGenerate_mt920(item.getGenerate_mt920());
		transSttmUploadCustomer.setPrivate_customer(item.getPrivate_customer());
		transSttmUploadCustomer.setKyc_details(item.getKyc_details());
		transSttmUploadCustomer.setStaff(item.getStaff());
		transSttmUploadCustomer.setKyc_ref_no(item.getKyc_ref_no());
		transSttmUploadCustomer.setLc_collateral_pct(Double.valueOf(item.getLc_collateral_pct()));
		transSttmUploadCustomer.setAuto_create_account(item.getAuto_create_account());
		transSttmUploadCustomer.setAuto_cust_ac_no(item.getAuto_cust_ac_no());
		transSttmUploadCustomer.setTrack_limits(item.getTrack_limits());
		transSttmUploadCustomer.setAr_ap_tracking(item.getAr_ap_tracking());
		transSttmUploadCustomer.setRm_id(item.getRm_id());
		transSttmUploadCustomer.setPincode(item.getPincode());
		transSttmUploadCustomer.setAutogen_stmtplan(item.getAutogen_stmtplan());
		transSttmUploadCustomer.setFrequency(item.getFrequency());
		transSttmUploadCustomer.setStmt_day(item.getStmt_day());
		transSttmUploadCustomer.setInvest_cust(item.getInvest_cust());
		transSttmUploadCustomer.setAllow_vrtl_accnts(item.getAllow_vrtl_accnts());
		transSttmUploadCustomer.setVrtl_customer_id(item.getVrtl_customer_id());
		transSttmUploadCustomer.setElcm_customer(item.getElcm_customer());
		transSttmUploadCustomer.setWithholding_tax(item.getWithholding_tax());
		transSttmUploadCustomer.setTaxid_no(item.getTaxid_no());
		transSttmUploadCustomer.setSpecial_cust(item.getSpecial_cust());
		transSttmUploadCustomer.setCif_creation_date(JMRDateUtil.getDateFromString(item.getCif_creation_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadCustomer.setMfi_customer(item.getMfi_customer());
		transSttmUploadCustomer.setJoint_venture(item.getJoint_venture());
		return transSttmUploadCustomer;

	}

}
