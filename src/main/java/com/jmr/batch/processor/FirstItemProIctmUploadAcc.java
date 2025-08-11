package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransIctmUploadAcc;
import com.jmr.batch.model.TransIctmUploadAccModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIctmUploadAcc implements ItemProcessor<TransIctmUploadAccModel, TransIctmUploadAcc> {
	@Override
	public TransIctmUploadAcc process(TransIctmUploadAccModel item) throws Exception {
		TransIctmUploadAcc transIctmUploadAcc = new TransIctmUploadAcc();
		transIctmUploadAcc.setSource_code(item.getSource_code());
		transIctmUploadAcc.setBranch(item.getBranch());
		transIctmUploadAcc.setModule(item.getModule());
		transIctmUploadAcc.setBrn(item.getBrn());
		transIctmUploadAcc.setAcc(item.getAcc());
		transIctmUploadAcc.setCalc_acc(item.getCalc_acc());
		transIctmUploadAcc.setBook_acc(item.getBook_acc());
		transIctmUploadAcc.setHas_is(item.getHas_is());
		if (!JMRUtil.isNullOrEmpty(item.getInt_start_date())) { transIctmUploadAcc.setInt_start_date( JMRDateUtil.getDateFromString(item.getInt_start_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getLast_is_date())) { transIctmUploadAcc.setLast_is_date( JMRDateUtil.getDateFromString(item.getLast_is_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transIctmUploadAcc.setAcc_type(item.getAcc_type());
		transIctmUploadAcc.setBook_brn(item.getBook_brn());
		transIctmUploadAcc.setConv_status(item.getConv_status());
		transIctmUploadAcc.setErr_msg(item.getErr_msg());
		transIctmUploadAcc.setCharge_book_brn(item.getCharge_book_brn());
		transIctmUploadAcc.setCharge_book_acc(item.getCharge_book_acc());
		transIctmUploadAcc.setAuto_rollover(item.getAuto_rollover());
		transIctmUploadAcc.setClose_on_maturity(item.getClose_on_maturity());
		transIctmUploadAcc.setMove_int_to_unclaimed(item.getMove_int_to_unclaimed());
		transIctmUploadAcc.setMove_pric_to_unclaimed(item.getMove_pric_to_unclaimed());
		if (!JMRUtil.isNullOrEmpty(item.getMaturity_date())) { transIctmUploadAcc.setMaturity_date( JMRDateUtil.getDateFromString(item.getMaturity_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transIctmUploadAcc.setPrinc_liq_ac(item.getPrinc_liq_ac());
		transIctmUploadAcc.setRollover_type(item.getRollover_type());
		if (!JMRUtil.isNullOrEmpty(item.getRollover_amt())) { transIctmUploadAcc.setRollover_amt(Double.valueOf(item.getRollover_amt())); }
		transIctmUploadAcc.setPrinc_liq_branch(item.getPrinc_liq_branch());
		if (!JMRUtil.isNullOrEmpty(item.getNext_maturity_date())) { transIctmUploadAcc.setNext_maturity_date( JMRDateUtil.getDateFromString(item.getNext_maturity_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transIctmUploadAcc.setBook_ccy(item.getBook_ccy());
		transIctmUploadAcc.setHas_drcr_adv(item.getHas_drcr_adv());
		transIctmUploadAcc.setRd_flag(item.getRd_flag());
		transIctmUploadAcc.setRd_auto_pmnt_takedown(item.getRd_auto_pmnt_takedown());
		transIctmUploadAcc.setRd_move_mat_to_unclaimed(item.getRd_move_mat_to_unclaimed());
		transIctmUploadAcc.setRd_move_funds_on_ovd(item.getRd_move_funds_on_ovd());
		if (!JMRUtil.isNullOrEmpty(item.getRd_takedown_days())) { transIctmUploadAcc.setRd_takedown_days(Double.valueOf(item.getRd_takedown_days())); }
		if (!JMRUtil.isNullOrEmpty(item.getRd_takedown_months())) { transIctmUploadAcc.setRd_takedown_months(Double.valueOf(item.getRd_takedown_months())); }
		if (!JMRUtil.isNullOrEmpty(item.getRd_takedown_years())) { transIctmUploadAcc.setRd_takedown_years(Double.valueOf(item.getRd_takedown_years())); }
		transIctmUploadAcc.setRd_payment_acc(item.getRd_payment_acc());
		transIctmUploadAcc.setRd_payment_brn(item.getRd_payment_brn());
		transIctmUploadAcc.setRd_payment_ccy(item.getRd_payment_ccy());
		if (!JMRUtil.isNullOrEmpty(item.getRd_installment_amt())) { transIctmUploadAcc.setRd_installment_amt(Double.valueOf(item.getRd_installment_amt())); }
		if (!JMRUtil.isNullOrEmpty(item.getRd_pay_schdt())) { transIctmUploadAcc.setRd_pay_schdt( JMRDateUtil.getDateFromDateString(item.getRd_pay_schdt(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getChg_start_date())) { transIctmUploadAcc.setChg_start_date( JMRDateUtil.getDateFromString(item.getChg_start_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) { transIctmUploadAcc.setSource_seq_no(Double.valueOf(item.getSource_seq_no())); }
		transIctmUploadAcc.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmUploadAcc.setTenor_code(item.getTenor_code());	
		transIctmUploadAcc.setAuto_extension(item.getAuto_extension());
		if (!JMRUtil.isNullOrEmpty(item.getLiquidation_amt())) { transIctmUploadAcc.setLiquidation_amt(Double.valueOf(item.getLiquidation_amt())); }
		if (!JMRUtil.isNullOrEmpty(item.getLast_rollover_date())) { transIctmUploadAcc.setLast_rollover_date( JMRDateUtil.getDateFromString(item.getLast_rollover_date(), JMRDateUtil.DATE_FORMATMMddyyyy)); }
		transIctmUploadAcc.setAllow_prepayment(item.getAllow_prepayment());
		if (!JMRUtil.isNullOrEmpty(item.getInterest_rate())) { transIctmUploadAcc.setInterest_rate(Double.valueOf(item.getInterest_rate())); }
		if (!JMRUtil.isNullOrEmpty(item.getMaturity_amount())) { transIctmUploadAcc.setMaturity_amount(Double.valueOf(item.getMaturity_amount())); }
		transIctmUploadAcc.setIntrate_cumamt_reqd(item.getIntrate_cumamt_reqd());
		transIctmUploadAcc.setIntrate_cumamt_roll_reqd(item.getIntrate_cumamt_roll_reqd());
		transIctmUploadAcc.setRoll_tenor_pref(item.getRoll_tenor_pref());
		if (!JMRUtil.isNullOrEmpty(item.getOrig_tenor_days())) { transIctmUploadAcc.setOrig_tenor_days(Double.valueOf(item.getOrig_tenor_days())); }
		if (!JMRUtil.isNullOrEmpty(item.getOrig_tenor_months())) { transIctmUploadAcc.setOrig_tenor_days(Double.valueOf(item.getOrig_tenor_months())); }
		if (!JMRUtil.isNullOrEmpty(item.getOrig_tenor_years())) { transIctmUploadAcc.setOrig_tenor_days(Double.valueOf(item.getOrig_tenor_years())); }
		if (!JMRUtil.isNullOrEmpty(item.getRoll_tenor_days())) { transIctmUploadAcc.setRoll_tenor_days(Double.valueOf(item.getRoll_tenor_days())); }
		if (!JMRUtil.isNullOrEmpty(item.getRoll_tenor_months())) { transIctmUploadAcc.setRoll_tenor_months(Double.valueOf(item.getRoll_tenor_months())); }
		if (!JMRUtil.isNullOrEmpty(item.getRoll_tenor_years())) { transIctmUploadAcc.setRoll_tenor_years(Double.valueOf(item.getRoll_tenor_years())); }
		transIctmUploadAcc.setDep_tenor_pref(item.getDep_tenor_pref());
		transIctmUploadAcc.setCascade_month(item.getCascade_month());
		transIctmUploadAcc.setAdd_funds(item.getAdd_funds());
		if (!JMRUtil.isNullOrEmpty(item.getAdditional_amt())) { transIctmUploadAcc.setRoll_tenor_years(Double.valueOf(item.getAdditional_amt())); }
		return transIctmUploadAcc;
	}
}
