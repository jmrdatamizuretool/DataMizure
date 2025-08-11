package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttbUploadCustAccount;
import com.jmr.batch.model.TransSttbUploadCustAccountModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttbUploadCustAccount implements ItemProcessor<TransSttbUploadCustAccountModel, TransSttbUploadCustAccount>
{	
	
	
	@Override
	
	public  TransSttbUploadCustAccount process(TransSttbUploadCustAccountModel item) throws Exception {
		TransSttbUploadCustAccount transSttbUploadCustAccount = new TransSttbUploadCustAccount();
		transSttbUploadCustAccount.setLine_id(item.getLine_id());
		transSttbUploadCustAccount.setAc_stat_no_dr(item.getAc_stat_no_dr());
		transSttbUploadCustAccount.setAc_stat_no_cr(item.getAc_stat_no_cr());
		transSttbUploadCustAccount.setAc_stat_block(item.getAc_stat_block());
		transSttbUploadCustAccount.setAc_stat_stop_pay(item.getAc_stat_stop_pay());
		transSttbUploadCustAccount.setAc_stat_dormant(item.getAc_stat_dormant());
		transSttbUploadCustAccount.setJoint_ac_indicator(item.getJoint_ac_indicator());
		transSttbUploadCustAccount.setAc_stmt_cycle(item.getAc_stmt_cycle());
		transSttbUploadCustAccount.setCheque_book_facility(item.getCheque_book_facility());
		transSttbUploadCustAccount.setAtm_facility(item.getAtm_facility());
		transSttbUploadCustAccount.setPassbook_facility(item.getPassbook_facility());
		transSttbUploadCustAccount.setAc_stmt_type(item.getAc_stmt_type());
		transSttbUploadCustAccount.setAc_stat_frozen(item.getAc_stat_frozen());
		transSttbUploadCustAccount.setCas_account(item.getCas_account());
		transSttbUploadCustAccount.setAcc_stmt_type2(item.getAcc_stmt_type2());
		transSttbUploadCustAccount.setAc_stmt_cycle2(item.getAc_stmt_cycle2());
		transSttbUploadCustAccount.setGen_stmt_only_on_mvmt2(item.getGen_stmt_only_on_mvmt2());
		transSttbUploadCustAccount.setAcc_stmt_type3(item.getAcc_stmt_type3());
		transSttbUploadCustAccount.setAc_stmt_cycle3(item.getAc_stmt_cycle3());
		transSttbUploadCustAccount.setGen_stmt_only_on_mvmt3(item.getGen_stmt_only_on_mvmt3());
		transSttbUploadCustAccount.setGen_stmt_only_on_mvmt(item.getGen_stmt_only_on_mvmt());
		transSttbUploadCustAccount.setAc_stat_de_post(item.getAc_stat_de_post());
		transSttbUploadCustAccount.setDormant_param(item.getDormant_param());
		transSttbUploadCustAccount.setPositive_pay_ac(item.getPositive_pay_ac());
		transSttbUploadCustAccount.setReg_d_applicable(item.getReg_d_applicable());
		transSttbUploadCustAccount.setNetting_required(item.getNetting_required());
		transSttbUploadCustAccount.setReferral_required(item.getReferral_required());
		transSttbUploadCustAccount.setAuto_reorder_check_required(item.getAuto_reorder_check_required());
		transSttbUploadCustAccount.setRecord_stat(item.getRecord_stat());
		transSttbUploadCustAccount.setOnce_auth(item.getOnce_auth());
		transSttbUploadCustAccount.setAuth_stat(item.getAuth_stat());
		transSttbUploadCustAccount.setMode_of_operation(item.getMode_of_operation());
		transSttbUploadCustAccount.setAllow_back_period_entry(item.getAllow_back_period_entry());
		transSttbUploadCustAccount.setEscrow_transfer(item.getEscrow_transfer());
		transSttbUploadCustAccount.setAuto_dc_request(item.getAuto_dc_request());
		transSttbUploadCustAccount.setAuto_chqbk_request(item.getAuto_chqbk_request());
		transSttbUploadCustAccount.setSpl_ac_gen(item.getSpl_ac_gen());
		transSttbUploadCustAccount.setAc_stat_dr_ovd(item.getAc_stat_dr_ovd());
		transSttbUploadCustAccount.setAc_stat_cr_ovd(item.getAc_stat_cr_ovd());
		transSttbUploadCustAccount.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttbUploadCustAccount.setCust_no(item.getCust_no());
		transSttbUploadCustAccount.setDr_gl(item.getDr_gl());
		transSttbUploadCustAccount.setCr_gl(item.getCr_gl());
		transSttbUploadCustAccount.setAccount_class(item.getAccount_class());
		transSttbUploadCustAccount.setGoal_ref_no(item.getGoal_ref_no());
		transSttbUploadCustAccount.setAcc_status(item.getAcc_status());
		transSttbUploadCustAccount.setAlt_ac_no(item.getAlt_ac_no());
		transSttbUploadCustAccount.setIban_ac_no(item.getIban_ac_no());
		transSttbUploadCustAccount.setClearing_ac_no(item.getClearing_ac_no());
		transSttbUploadCustAccount.setCcy(item.getCcy());
		transSttbUploadCustAccount.setLimit_ccy(item.getLimit_ccy());
		transSttbUploadCustAccount.setFunding_branch(item.getFunding_branch());
		transSttbUploadCustAccount.setInterim_report_since(item.getInterim_report_since());
		transSttbUploadCustAccount.setBalance_report_since(item.getBalance_report_since());
		transSttbUploadCustAccount.setCountry_code(item.getCountry_code());
		transSttbUploadCustAccount.setLinked_dep_branch(item.getLinked_dep_branch());
		transSttbUploadCustAccount.setEscrow_branch_code(item.getEscrow_branch_code());
		transSttbUploadCustAccount.setInf_offset_branch(item.getInf_offset_branch());
		transSttbUploadCustAccount.setBranch_code(item.getBranch_code());
		transSttbUploadCustAccount.setCust_ac_no(item.getCust_ac_no());
		transSttbUploadCustAccount.setAtm_cust_ac_no(item.getAtm_cust_ac_no());
		transSttbUploadCustAccount.setClearing_bank_code(item.getClearing_bank_code());
		transSttbUploadCustAccount.setExposure_category(item.getExposure_category());
		transSttbUploadCustAccount.setFunding_account(item.getFunding_account());
		transSttbUploadCustAccount.setStatement_account(item.getStatement_account());
		transSttbUploadCustAccount.setIban_bank_code(item.getIban_bank_code());
		transSttbUploadCustAccount.setIban_acc(item.getIban_acc());
		transSttbUploadCustAccount.setMaster_account_no(item.getMaster_account_no());
		transSttbUploadCustAccount.setXref(item.getXref());
		transSttbUploadCustAccount.setOtherdet(item.getOtherdet());
		transSttbUploadCustAccount.setEscrow_ac_no(item.getEscrow_ac_no());
		transSttbUploadCustAccount.setInf_offset_account(item.getInf_offset_account());
		transSttbUploadCustAccount.setMulti_ccy_ac_no(item.getMulti_ccy_ac_no());
		transSttbUploadCustAccount.setDr_ho_line(item.getDr_ho_line());
		transSttbUploadCustAccount.setCr_ho_line(item.getCr_ho_line());
		transSttbUploadCustAccount.setCr_cb_line(item.getCr_cb_line());
		transSttbUploadCustAccount.setDr_cb_line(item.getDr_cb_line());
		transSttbUploadCustAccount.setFund_id(item.getFund_id());
		transSttbUploadCustAccount.setLinked_dep_acc(item.getLinked_dep_acc());
		transSttbUploadCustAccount.setAction_code(item.getAction_code());
		transSttbUploadCustAccount.setLocation(item.getLocation());
		transSttbUploadCustAccount.setMedia(item.getMedia());
		transSttbUploadCustAccount.setPincode(item.getPincode());
		transSttbUploadCustAccount.setSource_code(item.getSource_code());
		transSttbUploadCustAccount.setChecker_id(item.getChecker_id());
		transSttbUploadCustAccount.setMaker_id(item.getMaker_id());
		transSttbUploadCustAccount.setAc_desc(item.getAc_desc());
		transSttbUploadCustAccount.setNominee1(item.getNominee1());
		transSttbUploadCustAccount.setNominee2(item.getNominee2());
		transSttbUploadCustAccount.setAddress1(item.getAddress1());
		transSttbUploadCustAccount.setAddress2(item.getAddress2());
		transSttbUploadCustAccount.setAddress3(item.getAddress3());
		transSttbUploadCustAccount.setAddress4(item.getAddress4());
		transSttbUploadCustAccount.setCheckbook_name_1(item.getCheckbook_name_1());
		transSttbUploadCustAccount.setCheckbook_name_2(item.getCheckbook_name_2());
		transSttbUploadCustAccount.setType_of_chq(item.getType_of_chq());
		transSttbUploadCustAccount.setDisplay_iban_in_advices(item.getDisplay_iban_in_advices());
		transSttbUploadCustAccount.setReg_cc_availability(item.getReg_cc_availability());
		transSttbUploadCustAccount.setMt210_reqd(item.getMt210_reqd());
		transSttbUploadCustAccount.setTrack_receivable(item.getTrack_receivable());
		transSttbUploadCustAccount.setRegd_periodicity(item.getRegd_periodicity());
		transSttbUploadCustAccount.setLodgement_book_facility(item.getLodgement_book_facility());
		transSttbUploadCustAccount.setInherit_reporting(item.getInherit_reporting());
		transSttbUploadCustAccount.setStatus_change_automatic(item.getStatus_change_automatic());
		transSttbUploadCustAccount.setExcl_sameday_rvrtrns_fm_stmt(item.getExcl_sameday_rvrtrns_fm_stmt());
		transSttbUploadCustAccount.setAuto_prov_reqd(item.getAuto_prov_reqd());
		transSttbUploadCustAccount.setDefer_recon(item.getDefer_recon());
		transSttbUploadCustAccount.setConsolidation_reqd(item.getConsolidation_reqd());
		transSttbUploadCustAccount.setFunding(item.getFunding());
		transSttbUploadCustAccount.setMod9_validation_reqd(item.getMod9_validation_reqd());
		transSttbUploadCustAccount.setProduct_list(item.getProduct_list());
		transSttbUploadCustAccount.setTxn_code_list(item.getTxn_code_list());
		transSttbUploadCustAccount.setSpecial_condition_product(item.getSpecial_condition_product());
		transSttbUploadCustAccount.setSpecial_condition_txncode(item.getSpecial_condition_txncode());
		transSttbUploadCustAccount.setIban_reqd(item.getIban_reqd());
		transSttbUploadCustAccount.setGen_interim_stmt(item.getGen_interim_stmt());
		transSttbUploadCustAccount.setGen_interim_stmt_on_mvmt(item.getGen_interim_stmt_on_mvmt());
		transSttbUploadCustAccount.setGen_balance_report(item.getGen_balance_report());
		transSttbUploadCustAccount.setInterim_report_type(item.getInterim_report_type());
		transSttbUploadCustAccount.setBalance_report_type(item.getBalance_report_type());
		transSttbUploadCustAccount.setZakat_exemption(item.getZakat_exemption());
		transSttbUploadCustAccount.setMudarabah_accounts(item.getMudarabah_accounts());
		transSttbUploadCustAccount.setAuto_create_pool(item.getAuto_create_pool());
		transSttbUploadCustAccount.setInf_pay_in_option(item.getInf_pay_in_option());
		transSttbUploadCustAccount.setInf_waive_acc_open_charge(item.getInf_waive_acc_open_charge());
		transSttbUploadCustAccount.setAccount_type(item.getAccount_type());
		transSttbUploadCustAccount.setIntermediary_required(item.getIntermediary_required());
		transSttbUploadCustAccount.setAuto_deposit(item.getAuto_deposit());
		transSttbUploadCustAccount.setSweep_required(item.getSweep_required());
		transSttbUploadCustAccount.setSweep_out(item.getSweep_out());
		transSttbUploadCustAccount.setIban_required(item.getIban_required());
		transSttbUploadCustAccount.setDirect_banking(item.getDirect_banking());
		transSttbUploadCustAccount.setContribute_to_pdm(item.getContribute_to_pdm());
		transSttbUploadCustAccount.setProv_ccy_type(item.getProv_ccy_type());
		transSttbUploadCustAccount.setAccount_auto_closed(item.getAccount_auto_closed());
		transSttbUploadCustAccount.setSalary_account(item.getSalary_account());
		transSttbUploadCustAccount.setRepl_cust_sig(item.getRepl_cust_sig());
		transSttbUploadCustAccount.setSpend_analysis_reqd(item.getSpend_analysis_reqd());
		transSttbUploadCustAccount.setExclude_from_distribution(item.getExclude_from_distribution());
		
		if(!JMRUtil.isNullOrEmpty(item.getSweep_type())){transSttbUploadCustAccount.setSweep_type(Double.valueOf(item.getSweep_type()));}
		if(!JMRUtil.isNullOrEmpty(item.getMin_reqd_bal())){transSttbUploadCustAccount.setMin_reqd_bal(Double.valueOf(item.getMin_reqd_bal()));}
		if(!JMRUtil.isNullOrEmpty(item.getValidation_digit())){transSttbUploadCustAccount.setValidation_digit(Double.valueOf(item.getValidation_digit()));}
		if(!JMRUtil.isNullOrEmpty(item.getAuto_deposits_bal())){transSttbUploadCustAccount.setAuto_deposits_bal(Double.valueOf(item.getAuto_deposits_bal()));}
		if(!JMRUtil.isNullOrEmpty(item.getMax_no_cheque_rejections())){transSttbUploadCustAccount.setMax_no_cheque_rejections(Double.valueOf(item.getMax_no_cheque_rejections()));}
		if(!JMRUtil.isNullOrEmpty(item.getNo_cheque_rejections())){transSttbUploadCustAccount.setNo_cheque_rejections(Double.valueOf(item.getNo_cheque_rejections()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_no())){transSttbUploadCustAccount.setPrevious_statement_no(Double.valueOf(item.getPrevious_statement_no()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_no2())){transSttbUploadCustAccount.setPrevious_statement_no2(Double.valueOf(item.getPrevious_statement_no2()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_no3())){transSttbUploadCustAccount.setPrevious_statement_no3(Double.valueOf(item.getPrevious_statement_no3()));}
		if(!JMRUtil.isNullOrEmpty(item.getStale_days())){transSttbUploadCustAccount.setStale_days(Double.valueOf(item.getStale_days()));}
		if(!JMRUtil.isNullOrEmpty(item.getInterim_stmt_ytd_count())){transSttbUploadCustAccount.setInterim_stmt_ytd_count(Double.valueOf(item.getInterim_stmt_ytd_count()));}
		if(!JMRUtil.isNullOrEmpty(item.getDormancy_days())){transSttbUploadCustAccount.setDormancy_days(Double.valueOf(item.getDormancy_days()));}
		if(!JMRUtil.isNullOrEmpty(item.getAtm_dly_count_limit())){transSttbUploadCustAccount.setAtm_dly_count_limit(Double.valueOf(item.getAtm_dly_count_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getAuto_reorder_check_level())){transSttbUploadCustAccount.setAuto_reorder_check_level(Double.valueOf(item.getAuto_reorder_check_level()));}
		if(!JMRUtil.isNullOrEmpty(item.getAuto_reorder_check_leaves())){transSttbUploadCustAccount.setAuto_reorder_check_leaves(Double.valueOf(item.getAuto_reorder_check_leaves()));}
		if(!JMRUtil.isNullOrEmpty(item.getSod_notification_percent())){transSttbUploadCustAccount.setSod_notification_percent(Double.valueOf(item.getSod_notification_percent()));}
		if(!JMRUtil.isNullOrEmpty(item.getSublimit())){transSttbUploadCustAccount.setSublimit(Double.valueOf(item.getSublimit()));}
		if(!JMRUtil.isNullOrEmpty(item.getUncoll_funds_limit())){transSttbUploadCustAccount.setUncoll_funds_limit(Double.valueOf(item.getUncoll_funds_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_balance())){transSttbUploadCustAccount.setPrevious_statement_balance(Double.valueOf(item.getPrevious_statement_balance()));}
		if(!JMRUtil.isNullOrEmpty(item.getTod_limit())){transSttbUploadCustAccount.setTod_limit(Double.valueOf(item.getTod_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getOffline_limit())){transSttbUploadCustAccount.setOffline_limit(Double.valueOf(item.getOffline_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_balance2())){transSttbUploadCustAccount.setPrevious_statement_balance2(Double.valueOf(item.getPrevious_statement_balance2()));}
		if(!JMRUtil.isNullOrEmpty(item.getPrevious_statement_balance3())){transSttbUploadCustAccount.setPrevious_statement_balance3(Double.valueOf(item.getPrevious_statement_balance3()));}
		if(!JMRUtil.isNullOrEmpty(item.getDr_auto_ex_rate_lmt())){transSttbUploadCustAccount.setDr_auto_ex_rate_lmt(Double.valueOf(item.getDr_auto_ex_rate_lmt()));}
		if(!JMRUtil.isNullOrEmpty(item.getCr_auto_ex_rate_lmt())){transSttbUploadCustAccount.setCr_auto_ex_rate_lmt(Double.valueOf(item.getCr_auto_ex_rate_lmt()));}
		if(!JMRUtil.isNullOrEmpty(item.getAtm_dly_amt_limit())){transSttbUploadCustAccount.setAtm_dly_amt_limit(Double.valueOf(item.getAtm_dly_amt_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getRisk_free_exp_amount())){transSttbUploadCustAccount.setRisk_free_exp_amount(Double.valueOf(item.getRisk_free_exp_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getInterim_debit_amt())){transSttbUploadCustAccount.setInterim_debit_amt(Double.valueOf(item.getInterim_debit_amt()));}
		if(!JMRUtil.isNullOrEmpty(item.getInterim_credit_amt())){transSttbUploadCustAccount.setInterim_credit_amt(Double.valueOf(item.getInterim_credit_amt()));}
		if(!JMRUtil.isNullOrEmpty(item.getEscrow_percentage())){transSttbUploadCustAccount.setEscrow_percentage(Double.valueOf(item.getEscrow_percentage()));}
		if(!JMRUtil.isNullOrEmpty(item.getInf_acc_opening_amt())){transSttbUploadCustAccount.setInf_acc_opening_amt(Double.valueOf(item.getInf_acc_opening_amt()));}
		if(!JMRUtil.isNullOrEmpty(item.getDaylight_limit_amount())){transSttbUploadCustAccount.setDaylight_limit_amount(Double.valueOf(item.getDaylight_limit_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getMod_no())){transSttbUploadCustAccount.setMod_no(Double.valueOf(item.getMod_no()));}
		if(!JMRUtil.isNullOrEmpty(item.getAc_stmt_day())){transSttbUploadCustAccount.setAc_stmt_day(Double.valueOf(item.getAc_stmt_day()));}
		if(!JMRUtil.isNullOrEmpty(item.getAcc_stmt_day2())){transSttbUploadCustAccount.setAcc_stmt_day2(Double.valueOf(item.getAcc_stmt_day2()));}
		if(!JMRUtil.isNullOrEmpty(item.getAcc_stmt_day3())){transSttbUploadCustAccount.setAcc_stmt_day3(Double.valueOf(item.getAcc_stmt_day3()));}
		if(!JMRUtil.isNullOrEmpty(item.getInterim_stmt_day_count())){transSttbUploadCustAccount.setInterim_stmt_day_count(Double.valueOf(item.getInterim_stmt_day_count()));}
		if(!JMRUtil.isNullOrEmpty(item.getSource_seq_no())){transSttbUploadCustAccount.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));}
		if (!JMRUtil.isNullOrEmpty(item.getAc_open_date())) {transSttbUploadCustAccount.setAc_open_date(JMRDateUtil.getDateFromString(item.getAc_open_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getPrevious_statement_date())) {transSttbUploadCustAccount.setPrevious_statement_date(JMRDateUtil.getDateFromString(item.getPrevious_statement_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getTod_limit_start_date())) {transSttbUploadCustAccount.setTod_limit_start_date(JMRDateUtil.getDateFromString(item.getTod_limit_start_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getTod_limit_end_date())) {transSttbUploadCustAccount.setTod_limit_end_date(JMRDateUtil.getDateFromString(item.getTod_limit_end_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getPrevious_statement_date2())) {transSttbUploadCustAccount.setPrevious_statement_date2(JMRDateUtil.getDateFromString(item.getPrevious_statement_date2(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getPrevious_statement_date3())) {transSttbUploadCustAccount.setPrevious_statement_date3(JMRDateUtil.getDateFromString(item.getPrevious_statement_date3(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getStatus_since())) {transSttbUploadCustAccount.setStatus_since(JMRDateUtil.getDateFromString(item.getStatus_since(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getOverdraft_since())) {transSttbUploadCustAccount.setOverdraft_since(JMRDateUtil.getDateFromString(item.getOverdraft_since(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getPrev_ovd_date())) {transSttbUploadCustAccount.setPrev_ovd_date(JMRDateUtil.getDateFromString(item.getPrev_ovd_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getOverline_od_since())) {transSttbUploadCustAccount.setOverline_od_since(JMRDateUtil.getDateFromString(item.getOverline_od_since(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getTod_since())) {transSttbUploadCustAccount.setTod_since(JMRDateUtil.getDateFromString(item.getTod_since(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getPrev_tod_since())) {transSttbUploadCustAccount.setPrev_tod_since(JMRDateUtil.getDateFromString(item.getPrev_tod_since(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getNo_of_chq_rej_reset_on())) {transSttbUploadCustAccount.setNo_of_chq_rej_reset_on(JMRDateUtil.getDateFromString(item.getNo_of_chq_rej_reset_on(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getChecker_dt_stamp())) {transSttbUploadCustAccount.setChecker_dt_stamp(JMRDateUtil.getDateFromString(item.getChecker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getMaker_dt_stamp())) {transSttbUploadCustAccount.setMaker_dt_stamp(JMRDateUtil.getDateFromString(item.getMaker_dt_stamp(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getDormancy_date())) {transSttbUploadCustAccount.setDormancy_date(JMRDateUtil.getDateFromString(item.getDormancy_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getRegd_start_date())) {transSttbUploadCustAccount.setRegd_start_date(JMRDateUtil.getDateFromString(item.getRegd_start_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getRegd_end_date())) {transSttbUploadCustAccount.setRegd_end_date(JMRDateUtil.getDateFromString(item.getRegd_end_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}


	return transSttbUploadCustAccount;
}
}
