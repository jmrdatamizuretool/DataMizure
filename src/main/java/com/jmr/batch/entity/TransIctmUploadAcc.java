package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TRANS_ICTM_UPLOAD_ACC")
public class TransIctmUploadAcc {
	@Column(name = "source_code")
	private String source_code;
	@Column(name = "branch")
	private String branch;
	@Column(name = "module")
	private String module;
	@Column(name = "brn")
	private String brn;
	@Id
	@Column(name = "acc")
	private String acc;
	@Column(name = "calc_acc")
	private String calc_acc;
	@Column(name = "book_acc")
	private String book_acc;
	@Column(name = "has_is")
	private String has_is;
	@Column(name = "int_start_date")
	private Date int_start_date;
	@Column(name = "last_is_date")
	private Date last_is_date;
	@Column(name = "acc_type")
	private String acc_type;
	@Column(name = "book_brn")
	private String book_brn;
	@Column(name = "conv_status")
	private String conv_status;
	@Column(name = "err_msg")
	private String err_msg;
	@Column(name = "charge_book_brn")
	private String charge_book_brn;
	@Column(name = "charge_book_acc")
	private String charge_book_acc;
	@Column(name = "auto_rollover")
	private String auto_rollover;
	@Column(name = "close_on_maturity")
	private String close_on_maturity;
	@Column(name = "move_int_to_unclaimed")
	private String move_int_to_unclaimed;
	@Column(name = "move_pric_to_unclaimed")
	private String move_pric_to_unclaimed;
	@Column(name = "maturity_date")
	private Date maturity_date;
	@Column(name = "princ_liq_ac")
	private String princ_liq_ac;
	@Column(name = "rollover_type")
	private String rollover_type;
	@Column(name = "rollover_amt")
	private Double rollover_amt;
	@Column(name = "princ_liq_branch")
	private String princ_liq_branch;
	@Column(name = "next_maturity_date")
	private Date next_maturity_date;
	@Column(name = "book_ccy")
	private String book_ccy;
	@Column(name = "has_drcr_adv")
	private String has_drcr_adv;
	@Column(name = "rd_flag")
	private String rd_flag;
	@Column(name = "rd_auto_pmnt_takedown")
	private String rd_auto_pmnt_takedown;
	@Column(name = "rd_move_mat_to_unclaimed")
	private String rd_move_mat_to_unclaimed;
	@Column(name = "rd_move_funds_on_ovd")
	private String rd_move_funds_on_ovd;
	@Column(name = "rd_takedown_days")
	private Double rd_takedown_days;
	@Column(name = "rd_takedown_months")
	private Double rd_takedown_months;
	@Column(name = "rd_takedown_years")
	private Double rd_takedown_years;
	@Column(name = "rd_payment_acc")
	private String rd_payment_acc;
	@Column(name = "rd_payment_brn")
	private String rd_payment_brn;
	@Column(name = "rd_payment_ccy")
	private String rd_payment_ccy;
	@Column(name = "rd_installment_amt")
	private Double rd_installment_amt;
	@Column(name = "rd_pay_schdt")
	private Date rd_pay_schdt;
	@Column(name = "chg_start_date")
	private Date chg_start_date;
	@Column(name = "source_seq_no")
	private Double source_seq_no;
	@Column(name = "maintenance_seq_no")
	private String maintenance_seq_no;
	@Column(name = "tenor_code")
	private String tenor_code;
	@Column(name = "auto_extension")
	private String auto_extension;
	@Column(name = "liquidation_amt")
	private Double liquidation_amt;
	@Column(name = "last_rollover_date")
	private Date last_rollover_date;
	@Column(name = "allow_prepayment")
	private String allow_prepayment;
	@Column(name = "interest_rate")
	private Double interest_rate;
	@Column(name = "maturity_amount")
	private Double maturity_amount;
	@Column(name = "intrate_cumamt_reqd")
	private String intrate_cumamt_reqd;
	@Column(name = "intrate_cumamt_roll_reqd")
	private String intrate_cumamt_roll_reqd;
	@Column(name = "roll_tenor_pref")
	private String roll_tenor_pref;
	@Column(name = "orig_tenor_days")
	private Double orig_tenor_days;
	@Column(name = "orig_tenor_months")
	private Double orig_tenor_months;
	@Column(name = "orig_tenor_years")
	private Double orig_tenor_years;
	@Column(name = "roll_tenor_days")
	private Double roll_tenor_days;
	@Column(name = "roll_tenor_months")
	private Double roll_tenor_months;
	@Column(name = "roll_tenor_years")
	private Double roll_tenor_years;
	@Column(name = "dep_tenor_pref")
	private String dep_tenor_pref;
	@Column(name = "cascade_month")
	private String cascade_month;
	@Column(name = "add_funds")
	private String add_funds;
	@Column(name = "additional_amt")
	private Double additional_amt;
	public String getSource_code() {
		return source_code;
	}
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getBrn() {
		return brn;
	}
	public void setBrn(String brn) {
		this.brn = brn;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public String getCalc_acc() {
		return calc_acc;
	}
	public void setCalc_acc(String calc_acc) {
		this.calc_acc = calc_acc;
	}
	public String getBook_acc() {
		return book_acc;
	}
	public void setBook_acc(String book_acc) {
		this.book_acc = book_acc;
	}
	public String getHas_is() {
		return has_is;
	}
	public void setHas_is(String has_is) {
		this.has_is = has_is;
	}
	public Date getInt_start_date() {
		return int_start_date;
	}
	public void setInt_start_date(Date int_start_date) {
		this.int_start_date = int_start_date;
	}
	public Date getLast_is_date() {
		return last_is_date;
	}
	public void setLast_is_date(Date last_is_date) {
		this.last_is_date = last_is_date;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public String getBook_brn() {
		return book_brn;
	}
	public void setBook_brn(String book_brn) {
		this.book_brn = book_brn;
	}
	public String getConv_status() {
		return conv_status;
	}
	public void setConv_status(String conv_status) {
		this.conv_status = conv_status;
	}
	public String getErr_msg() {
		return err_msg;
	}
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}
	public String getCharge_book_brn() {
		return charge_book_brn;
	}
	public void setCharge_book_brn(String charge_book_brn) {
		this.charge_book_brn = charge_book_brn;
	}
	public String getCharge_book_acc() {
		return charge_book_acc;
	}
	public void setCharge_book_acc(String charge_book_acc) {
		this.charge_book_acc = charge_book_acc;
	}
	public String getAuto_rollover() {
		return auto_rollover;
	}
	public void setAuto_rollover(String auto_rollover) {
		this.auto_rollover = auto_rollover;
	}
	public String getClose_on_maturity() {
		return close_on_maturity;
	}
	public void setClose_on_maturity(String close_on_maturity) {
		this.close_on_maturity = close_on_maturity;
	}
	public String getMove_int_to_unclaimed() {
		return move_int_to_unclaimed;
	}
	public void setMove_int_to_unclaimed(String move_int_to_unclaimed) {
		this.move_int_to_unclaimed = move_int_to_unclaimed;
	}
	public String getMove_pric_to_unclaimed() {
		return move_pric_to_unclaimed;
	}
	public void setMove_pric_to_unclaimed(String move_pric_to_unclaimed) {
		this.move_pric_to_unclaimed = move_pric_to_unclaimed;
	}
	public Date getMaturity_date() {
		return maturity_date;
	}
	public void setMaturity_date(Date maturity_date) {
		this.maturity_date = maturity_date;
	}
	public String getPrinc_liq_ac() {
		return princ_liq_ac;
	}
	public void setPrinc_liq_ac(String princ_liq_ac) {
		this.princ_liq_ac = princ_liq_ac;
	}
	public String getRollover_type() {
		return rollover_type;
	}
	public void setRollover_type(String rollover_type) {
		this.rollover_type = rollover_type;
	}
	public Double getRollover_amt() {
		return rollover_amt;
	}
	public void setRollover_amt(Double rollover_amt) {
		this.rollover_amt = rollover_amt;
	}
	public String getPrinc_liq_branch() {
		return princ_liq_branch;
	}
	public void setPrinc_liq_branch(String princ_liq_branch) {
		this.princ_liq_branch = princ_liq_branch;
	}
	public Date getNext_maturity_date() {
		return next_maturity_date;
	}
	public void setNext_maturity_date(Date next_maturity_date) {
		this.next_maturity_date = next_maturity_date;
	}
	public String getBook_ccy() {
		return book_ccy;
	}
	public void setBook_ccy(String book_ccy) {
		this.book_ccy = book_ccy;
	}
	public String getHas_drcr_adv() {
		return has_drcr_adv;
	}
	public void setHas_drcr_adv(String has_drcr_adv) {
		this.has_drcr_adv = has_drcr_adv;
	}
	public String getRd_flag() {
		return rd_flag;
	}
	public void setRd_flag(String rd_flag) {
		this.rd_flag = rd_flag;
	}
	public String getRd_auto_pmnt_takedown() {
		return rd_auto_pmnt_takedown;
	}
	public void setRd_auto_pmnt_takedown(String rd_auto_pmnt_takedown) {
		this.rd_auto_pmnt_takedown = rd_auto_pmnt_takedown;
	}
	public String getRd_move_mat_to_unclaimed() {
		return rd_move_mat_to_unclaimed;
	}
	public void setRd_move_mat_to_unclaimed(String rd_move_mat_to_unclaimed) {
		this.rd_move_mat_to_unclaimed = rd_move_mat_to_unclaimed;
	}
	public String getRd_move_funds_on_ovd() {
		return rd_move_funds_on_ovd;
	}
	public void setRd_move_funds_on_ovd(String rd_move_funds_on_ovd) {
		this.rd_move_funds_on_ovd = rd_move_funds_on_ovd;
	}
	public Double getRd_takedown_days() {
		return rd_takedown_days;
	}
	public void setRd_takedown_days(Double rd_takedown_days) {
		this.rd_takedown_days = rd_takedown_days;
	}
	public Double getRd_takedown_months() {
		return rd_takedown_months;
	}
	public void setRd_takedown_months(Double rd_takedown_months) {
		this.rd_takedown_months = rd_takedown_months;
	}
	public Double getRd_takedown_years() {
		return rd_takedown_years;
	}
	public void setRd_takedown_years(Double rd_takedown_years) {
		this.rd_takedown_years = rd_takedown_years;
	}
	public String getRd_payment_acc() {
		return rd_payment_acc;
	}
	public void setRd_payment_acc(String rd_payment_acc) {
		this.rd_payment_acc = rd_payment_acc;
	}
	public String getRd_payment_brn() {
		return rd_payment_brn;
	}
	public void setRd_payment_brn(String rd_payment_brn) {
		this.rd_payment_brn = rd_payment_brn;
	}
	public String getRd_payment_ccy() {
		return rd_payment_ccy;
	}
	public void setRd_payment_ccy(String rd_payment_ccy) {
		this.rd_payment_ccy = rd_payment_ccy;
	}
	public Double getRd_installment_amt() {
		return rd_installment_amt;
	}
	public void setRd_installment_amt(Double rd_installment_amt) {
		this.rd_installment_amt = rd_installment_amt;
	}
	public Date getRd_pay_schdt() {
		return rd_pay_schdt;
	}
	public void setRd_pay_schdt(Date rd_pay_schdt) {
		this.rd_pay_schdt = rd_pay_schdt;
	}
	public Date getChg_start_date() {
		return chg_start_date;
	}
	public void setChg_start_date(Date chg_start_date) {
		this.chg_start_date = chg_start_date;
	}
	public Double getSource_seq_no() {
		return source_seq_no;
	}
	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}
	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}
	public String getTenor_code() {
		return tenor_code;
	}
	public void setTenor_code(String tenor_code) {
		this.tenor_code = tenor_code;
	}
	public String getAuto_extension() {
		return auto_extension;
	}
	public void setAuto_extension(String auto_extension) {
		this.auto_extension = auto_extension;
	}
	public Double getLiquidation_amt() {
		return liquidation_amt;
	}
	public void setLiquidation_amt(Double liquidation_amt) {
		this.liquidation_amt = liquidation_amt;
	}
	public Date getLast_rollover_date() {
		return last_rollover_date;
	}
	public void setLast_rollover_date(Date last_rollover_date) {
		this.last_rollover_date = last_rollover_date;
	}
	public String getAllow_prepayment() {
		return allow_prepayment;
	}
	public void setAllow_prepayment(String allow_prepayment) {
		this.allow_prepayment = allow_prepayment;
	}
	public Double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(Double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public Double getMaturity_amount() {
		return maturity_amount;
	}
	public void setMaturity_amount(Double maturity_amount) {
		this.maturity_amount = maturity_amount;
	}
	public String getIntrate_cumamt_reqd() {
		return intrate_cumamt_reqd;
	}
	public void setIntrate_cumamt_reqd(String intrate_cumamt_reqd) {
		this.intrate_cumamt_reqd = intrate_cumamt_reqd;
	}
	public String getIntrate_cumamt_roll_reqd() {
		return intrate_cumamt_roll_reqd;
	}
	public void setIntrate_cumamt_roll_reqd(String intrate_cumamt_roll_reqd) {
		this.intrate_cumamt_roll_reqd = intrate_cumamt_roll_reqd;
	}
	public String getRoll_tenor_pref() {
		return roll_tenor_pref;
	}
	public void setRoll_tenor_pref(String roll_tenor_pref) {
		this.roll_tenor_pref = roll_tenor_pref;
	}
	public Double getOrig_tenor_days() {
		return orig_tenor_days;
	}
	public void setOrig_tenor_days(Double orig_tenor_days) {
		this.orig_tenor_days = orig_tenor_days;
	}
	public Double getOrig_tenor_months() {
		return orig_tenor_months;
	}
	public void setOrig_tenor_months(Double orig_tenor_months) {
		this.orig_tenor_months = orig_tenor_months;
	}
	public Double getOrig_tenor_years() {
		return orig_tenor_years;
	}
	public void setOrig_tenor_years(Double orig_tenor_years) {
		this.orig_tenor_years = orig_tenor_years;
	}
	public Double getRoll_tenor_days() {
		return roll_tenor_days;
	}
	public void setRoll_tenor_days(Double roll_tenor_days) {
		this.roll_tenor_days = roll_tenor_days;
	}
	public Double getRoll_tenor_months() {
		return roll_tenor_months;
	}
	public void setRoll_tenor_months(Double roll_tenor_months) {
		this.roll_tenor_months = roll_tenor_months;
	}
	public Double getRoll_tenor_years() {
		return roll_tenor_years;
	}
	public void setRoll_tenor_years(Double roll_tenor_years) {
		this.roll_tenor_years = roll_tenor_years;
	}
	public String getDep_tenor_pref() {
		return dep_tenor_pref;
	}
	public void setDep_tenor_pref(String dep_tenor_pref) {
		this.dep_tenor_pref = dep_tenor_pref;
	}
	public String getCascade_month() {
		return cascade_month;
	}
	public void setCascade_month(String cascade_month) {
		this.cascade_month = cascade_month;
	}
	public String getAdd_funds() {
		return add_funds;
	}
	public void setAdd_funds(String add_funds) {
		this.add_funds = add_funds;
	}
	public Double getAdditional_amt() {
		return additional_amt;
	}
	public void setAdditional_amt(Double additional_amt) {
		this.additional_amt = additional_amt;
	}
	
}
