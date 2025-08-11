package com.jmr.batch.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTB_UPLOAD_CUST_ACCOUNT")
public class TransSttbUploadCustAccount {
	@Id
	private String maintenance_seq_no;
	private String dr_gl;
	private String cust_no;
	private String cr_gl;
	private String account_class;
	private String goal_ref_no;
	private String acc_status;
	private String iban_ac_no;
	private String alt_ac_no;
	private String clearing_ac_no;
	private String linked_dep_branch;
	private String limit_ccy;
	private String interim_report_since;
	private String inf_offset_branch;
	private String funding_branch;
	private String escrow_branch_code;
	private String country_code;
	private String ccy;
	private String balance_report_since;
	private String branch_code;
	private String xref;
	private String statement_account;
	private String otherdet;
	private String multi_ccy_ac_no;
	private String master_account_no;
	private String inf_offset_account;
	private String iban_bank_code;
	private String iban_acc;
	private String funding_account;
	private String exposure_category;
	private String escrow_ac_no;
	private String cust_ac_no;
	private String clearing_bank_code;
	private String atm_cust_ac_no;
	private String linked_dep_acc;
	private String fund_id;
	private String dr_ho_line;
	private String dr_cb_line;
	private String cr_ho_line;
	private String cr_cb_line;
	private String pincode;
	private String media;
	private String location;
	private String action_code;
	private String source_code;
	private String maker_id;
	private String checker_id;
	private String nominee2;
	private String nominee1;
	private String checkbook_name_2;
	private String checkbook_name_1;
	private String address4;
	private String address3;
	private String address2;
	private String address1;
	private String ac_desc;
	private String zakat_exemption;
	private String type_of_chq;
	private String txn_code_list;
	private String track_receivable;
	private String sweep_required;
	private String sweep_out;
	private String status_change_automatic;
	private String special_condition_txncode;
	private String special_condition_product;
	private String regd_periodicity;
	private String reg_cc_availability;
	private String product_list;
	private String mudarabah_accounts;
	private String mt210_reqd;
	private String mod9_validation_reqd;
	private String lodgement_book_facility;
	private String intermediary_required;
	private String interim_report_type;
	private String inherit_reporting;
	private String inf_waive_acc_open_charge;
	private String inf_pay_in_option;
	private String iban_required;
	private String iban_reqd;
	private String gen_interim_stmt_on_mvmt;
	private String gen_interim_stmt;
	private String gen_balance_report;
	private String funding;
	private String excl_sameday_rvrtrns_fm_stmt;
	private String display_iban_in_advices;
	private String direct_banking;
	private String defer_recon;
	private String contribute_to_pdm;
	private String consolidation_reqd;
	private String balance_report_type;
	private String auto_prov_reqd;
	private String auto_deposit;
	private String auto_create_pool;
	private String account_type;
	private String spend_analysis_reqd;
	private String salary_account;
	private String repl_cust_sig;
	private String prov_ccy_type;
	private String exclude_from_distribution;
	private String account_auto_closed;
	private String line_id;
	private String reg_d_applicable;
	private String referral_required;
	private String record_stat;
	private String positive_pay_ac;
	private String passbook_facility;
	private String once_auth;
	private String netting_required;
	private String mode_of_operation;
	private String joint_ac_indicator;
	private String gen_stmt_only_on_mvmt3;
	private String gen_stmt_only_on_mvmt2;
	private String gen_stmt_only_on_mvmt;
	private String dormant_param;
	private String cheque_book_facility;
	private String cas_account;
	private String auto_reorder_check_required;
	private String auth_stat;
	private String atm_facility;
	private String acc_stmt_type3;
	private String acc_stmt_type2;
	private String ac_stmt_type;
	private String ac_stmt_cycle3;
	private String ac_stmt_cycle2;
	private String ac_stmt_cycle;
	private String ac_stat_stop_pay;
	private String ac_stat_no_dr;
	private String ac_stat_no_cr;
	private String ac_stat_frozen;
	private String ac_stat_dormant;
	private String ac_stat_de_post;
	private String ac_stat_block;
	private String spl_ac_gen;
	private String escrow_transfer;
	private String auto_dc_request;
	private String auto_chqbk_request;
	private String allow_back_period_entry;
	private String ac_stat_dr_ovd;
	private String ac_stat_cr_ovd;
	private Double validation_digit;
	private Double sweep_type;
	private Double no_cheque_rejections;
	private Double min_reqd_bal;
	private Double max_no_cheque_rejections;
	private Double auto_deposits_bal;
	private Double previous_statement_no3;
	private Double previous_statement_no2;
	private Double previous_statement_no;
	private Double stale_days;
	private Double interim_stmt_ytd_count;
	private Double dormancy_days;
	private Double sod_notification_percent;
	private Double auto_reorder_check_level;
	private Double auto_reorder_check_leaves;
	private Double atm_dly_count_limit;
	private Double uncoll_funds_limit;
	private Double tod_limit;
	private Double sublimit;
	private Double risk_free_exp_amount;
	private Double previous_statement_balance3;
	private Double previous_statement_balance2;
	private Double previous_statement_balance;
	private Double offline_limit;
	private Double interim_debit_amt;
	private Double interim_credit_amt;
	private Double inf_acc_opening_amt;
	private Double escrow_percentage;
	private Double dr_auto_ex_rate_lmt;
	private Double cr_auto_ex_rate_lmt;
	private Double atm_dly_amt_limit;
	private Double daylight_limit_amount;
	private Double mod_no;
	private Double interim_stmt_day_count;
	private Double acc_stmt_day3;
	private Double acc_stmt_day2;
	private Double ac_stmt_day;
	private Double source_seq_no;
	private Date tod_since;
	private Date tod_limit_start_date;
	private Date tod_limit_end_date;
	private Date status_since;
	private Date regd_start_date;
	private Date regd_end_date;
	private Date previous_statement_date3;
	private Date previous_statement_date2;
	private Date previous_statement_date;
	private Date prev_tod_since;
	private Date prev_ovd_date;
	private Date overline_od_since;
	private Date overdraft_since;
	private Date no_of_chq_rej_reset_on;
	private Date maker_dt_stamp;
	private Date dormancy_date;
	private Date checker_dt_stamp;
	private Date ac_open_date;

	@Column(name = "dr_gl")
	public String getDr_gl() {
		return dr_gl;
	}

	public void setDr_gl(String dr_gl) {
		this.dr_gl = dr_gl;
	}

	@Column(name = "cust_no")
	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	@Column(name = "cr_gl")
	public String getCr_gl() {
		return cr_gl;
	}

	public void setCr_gl(String cr_gl) {
		this.cr_gl = cr_gl;
	}

	@Column(name = "account_class")
	public String getAccount_class() {
		return account_class;
	}

	public void setAccount_class(String account_class) {
		this.account_class = account_class;
	}

	@Column(name = "goal_ref_no")
	public String getGoal_ref_no() {
		return goal_ref_no;
	}

	public void setGoal_ref_no(String goal_ref_no) {
		this.goal_ref_no = goal_ref_no;
	}

	@Column(name = "acc_status")
	public String getAcc_status() {
		return acc_status;
	}

	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}

	@Column(name = "iban_ac_no")
	public String getIban_ac_no() {
		return iban_ac_no;
	}

	public void setIban_ac_no(String iban_ac_no) {
		this.iban_ac_no = iban_ac_no;
	}

	@Column(name = "alt_ac_no")
	public String getAlt_ac_no() {
		return alt_ac_no;
	}

	public void setAlt_ac_no(String alt_ac_no) {
		this.alt_ac_no = alt_ac_no;
	}

	@Column(name = "clearing_ac_no")
	public String getClearing_ac_no() {
		return clearing_ac_no;
	}

	public void setClearing_ac_no(String clearing_ac_no) {
		this.clearing_ac_no = clearing_ac_no;
	}

	@Column(name = "linked_dep_branch")
	public String getLinked_dep_branch() {
		return linked_dep_branch;
	}

	public void setLinked_dep_branch(String linked_dep_branch) {
		this.linked_dep_branch = linked_dep_branch;
	}

	@Column(name = "limit_ccy")
	public String getLimit_ccy() {
		return limit_ccy;
	}

	public void setLimit_ccy(String limit_ccy) {
		this.limit_ccy = limit_ccy;
	}

	@Column(name = "interim_report_since")
	public String getInterim_report_since() {
		return interim_report_since;
	}

	public void setInterim_report_since(String interim_report_since) {
		this.interim_report_since = interim_report_since;
	}

	@Column(name = "inf_offset_branch")
	public String getInf_offset_branch() {
		return inf_offset_branch;
	}

	public void setInf_offset_branch(String inf_offset_branch) {
		this.inf_offset_branch = inf_offset_branch;
	}

	@Column(name = "funding_branch")
	public String getFunding_branch() {
		return funding_branch;
	}

	public void setFunding_branch(String funding_branch) {
		this.funding_branch = funding_branch;
	}

	@Column(name = "escrow_branch_code")
	public String getEscrow_branch_code() {
		return escrow_branch_code;
	}

	public void setEscrow_branch_code(String escrow_branch_code) {
		this.escrow_branch_code = escrow_branch_code;
	}

	@Column(name = "country_code")
	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	@Column(name = "ccy")
	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	@Column(name = "balance_report_since")
	public String getBalance_report_since() {
		return balance_report_since;
	}

	public void setBalance_report_since(String balance_report_since) {
		this.balance_report_since = balance_report_since;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "xref")
	public String getXref() {
		return xref;
	}

	public void setXref(String xref) {
		this.xref = xref;
	}

	@Column(name = "statement_account")
	public String getStatement_account() {
		return statement_account;
	}

	public void setStatement_account(String statement_account) {
		this.statement_account = statement_account;
	}

	@Column(name = "otherdet")
	public String getOtherdet() {
		return otherdet;
	}

	public void setOtherdet(String otherdet) {
		this.otherdet = otherdet;
	}

	@Column(name = "multi_ccy_ac_no")
	public String getMulti_ccy_ac_no() {
		return multi_ccy_ac_no;
	}

	public void setMulti_ccy_ac_no(String multi_ccy_ac_no) {
		this.multi_ccy_ac_no = multi_ccy_ac_no;
	}

	@Column(name = "master_account_no")
	public String getMaster_account_no() {
		return master_account_no;
	}

	public void setMaster_account_no(String master_account_no) {
		this.master_account_no = master_account_no;
	}

	@Column(name = "inf_offset_account")
	public String getInf_offset_account() {
		return inf_offset_account;
	}

	public void setInf_offset_account(String inf_offset_account) {
		this.inf_offset_account = inf_offset_account;
	}

	@Column(name = "iban_bank_code")
	public String getIban_bank_code() {
		return iban_bank_code;
	}

	public void setIban_bank_code(String iban_bank_code) {
		this.iban_bank_code = iban_bank_code;
	}

	@Column(name = "iban_acc")
	public String getIban_acc() {
		return iban_acc;
	}

	public void setIban_acc(String iban_acc) {
		this.iban_acc = iban_acc;
	}

	@Column(name = "funding_account")
	public String getFunding_account() {
		return funding_account;
	}

	public void setFunding_account(String funding_account) {
		this.funding_account = funding_account;
	}

	@Column(name = "exposure_category")
	public String getExposure_category() {
		return exposure_category;
	}

	public void setExposure_category(String exposure_category) {
		this.exposure_category = exposure_category;
	}

	@Column(name = "escrow_ac_no")
	public String getEscrow_ac_no() {
		return escrow_ac_no;
	}

	public void setEscrow_ac_no(String escrow_ac_no) {
		this.escrow_ac_no = escrow_ac_no;
	}

	@Column(name = "cust_ac_no")
	public String getCust_ac_no() {
		return cust_ac_no;
	}

	public void setCust_ac_no(String cust_ac_no) {
		this.cust_ac_no = cust_ac_no;
	}

	@Column(name = "clearing_bank_code")
	public String getClearing_bank_code() {
		return clearing_bank_code;
	}

	public void setClearing_bank_code(String clearing_bank_code) {
		this.clearing_bank_code = clearing_bank_code;
	}

	@Column(name = "atm_cust_ac_no")
	public String getAtm_cust_ac_no() {
		return atm_cust_ac_no;
	}

	public void setAtm_cust_ac_no(String atm_cust_ac_no) {
		this.atm_cust_ac_no = atm_cust_ac_no;
	}

	@Column(name = "linked_dep_acc")
	public String getLinked_dep_acc() {
		return linked_dep_acc;
	}

	public void setLinked_dep_acc(String linked_dep_acc) {
		this.linked_dep_acc = linked_dep_acc;
	}

	@Column(name = "fund_id")
	public String getFund_id() {
		return fund_id;
	}

	public void setFund_id(String fund_id) {
		this.fund_id = fund_id;
	}

	@Column(name = "dr_ho_line")
	public String getDr_ho_line() {
		return dr_ho_line;
	}

	public void setDr_ho_line(String dr_ho_line) {
		this.dr_ho_line = dr_ho_line;
	}

	@Column(name = "dr_cb_line")
	public String getDr_cb_line() {
		return dr_cb_line;
	}

	public void setDr_cb_line(String dr_cb_line) {
		this.dr_cb_line = dr_cb_line;
	}

	@Column(name = "cr_ho_line")
	public String getCr_ho_line() {
		return cr_ho_line;
	}

	public void setCr_ho_line(String cr_ho_line) {
		this.cr_ho_line = cr_ho_line;
	}

	@Column(name = "cr_cb_line")
	public String getCr_cb_line() {
		return cr_cb_line;
	}

	public void setCr_cb_line(String cr_cb_line) {
		this.cr_cb_line = cr_cb_line;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "pincode")
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "media")
	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	@Column(name = "location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "action_code")
	public String getAction_code() {
		return action_code;
	}

	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "maker_id")
	public String getMaker_id() {
		return maker_id;
	}

	public void setMaker_id(String maker_id) {
		this.maker_id = maker_id;
	}

	@Column(name = "checker_id")
	public String getChecker_id() {
		return checker_id;
	}

	public void setChecker_id(String checker_id) {
		this.checker_id = checker_id;
	}

	@Column(name = "nominee2")
	public String getNominee2() {
		return nominee2;
	}

	public void setNominee2(String nominee2) {
		this.nominee2 = nominee2;
	}

	@Column(name = "nominee1")
	public String getNominee1() {
		return nominee1;
	}

	public void setNominee1(String nominee1) {
		this.nominee1 = nominee1;
	}

	@Column(name = "checkbook_name_2")
	public String getCheckbook_name_2() {
		return checkbook_name_2;
	}

	public void setCheckbook_name_2(String checkbook_name_2) {
		this.checkbook_name_2 = checkbook_name_2;
	}

	@Column(name = "checkbook_name_1")
	public String getCheckbook_name_1() {
		return checkbook_name_1;
	}

	public void setCheckbook_name_1(String checkbook_name_1) {
		this.checkbook_name_1 = checkbook_name_1;
	}

	@Column(name = "address4")
	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	@Column(name = "address3")
	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "address2")
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "address1")
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "ac_desc")
	public String getAc_desc() {
		return ac_desc;
	}

	public void setAc_desc(String ac_desc) {
		this.ac_desc = ac_desc;
	}

	@Column(name = "zakat_exemption")
	public String getZakat_exemption() {
		return zakat_exemption;
	}

	public void setZakat_exemption(String zakat_exemption) {
		this.zakat_exemption = zakat_exemption;
	}

	@Column(name = "type_of_chq")
	public String getType_of_chq() {
		return type_of_chq;
	}

	public void setType_of_chq(String type_of_chq) {
		this.type_of_chq = type_of_chq;
	}

	@Column(name = "txn_code_list")
	public String getTxn_code_list() {
		return txn_code_list;
	}

	public void setTxn_code_list(String txn_code_list) {
		this.txn_code_list = txn_code_list;
	}

	@Column(name = "track_receivable")
	public String getTrack_receivable() {
		return track_receivable;
	}

	public void setTrack_receivable(String track_receivable) {
		this.track_receivable = track_receivable;
	}

	@Column(name = "sweep_required")
	public String getSweep_required() {
		return sweep_required;
	}

	public void setSweep_required(String sweep_required) {
		this.sweep_required = sweep_required;
	}

	@Column(name = "sweep_out")
	public String getSweep_out() {
		return sweep_out;
	}

	public void setSweep_out(String sweep_out) {
		this.sweep_out = sweep_out;
	}

	@Column(name = "status_change_automatic")
	public String getStatus_change_automatic() {
		return status_change_automatic;
	}

	public void setStatus_change_automatic(String status_change_automatic) {
		this.status_change_automatic = status_change_automatic;
	}

	@Column(name = "special_condition_txncode")
	public String getSpecial_condition_txncode() {
		return special_condition_txncode;
	}

	public void setSpecial_condition_txncode(String special_condition_txncode) {
		this.special_condition_txncode = special_condition_txncode;
	}

	@Column(name = "special_condition_product")
	public String getSpecial_condition_product() {
		return special_condition_product;
	}

	public void setSpecial_condition_product(String special_condition_product) {
		this.special_condition_product = special_condition_product;
	}

	@Column(name = "regd_periodicity")
	public String getRegd_periodicity() {
		return regd_periodicity;
	}

	public void setRegd_periodicity(String regd_periodicity) {
		this.regd_periodicity = regd_periodicity;
	}

	@Column(name = "reg_cc_availability")
	public String getReg_cc_availability() {
		return reg_cc_availability;
	}

	public void setReg_cc_availability(String reg_cc_availability) {
		this.reg_cc_availability = reg_cc_availability;
	}

	@Column(name = "product_list")
	public String getProduct_list() {
		return product_list;
	}

	public void setProduct_list(String product_list) {
		this.product_list = product_list;
	}

	@Column(name = "mudarabah_accounts")
	public String getMudarabah_accounts() {
		return mudarabah_accounts;
	}

	public void setMudarabah_accounts(String mudarabah_accounts) {
		this.mudarabah_accounts = mudarabah_accounts;
	}

	@Column(name = "mt210_reqd")
	public String getMt210_reqd() {
		return mt210_reqd;
	}

	public void setMt210_reqd(String mt210_reqd) {
		this.mt210_reqd = mt210_reqd;
	}

	@Column(name = "mod9_validation_reqd")
	public String getMod9_validation_reqd() {
		return mod9_validation_reqd;
	}

	public void setMod9_validation_reqd(String mod9_validation_reqd) {
		this.mod9_validation_reqd = mod9_validation_reqd;
	}

	@Column(name = "lodgement_book_facility")
	public String getLodgement_book_facility() {
		return lodgement_book_facility;
	}

	public void setLodgement_book_facility(String lodgement_book_facility) {
		this.lodgement_book_facility = lodgement_book_facility;
	}

	@Column(name = "intermediary_required")
	public String getIntermediary_required() {
		return intermediary_required;
	}

	public void setIntermediary_required(String intermediary_required) {
		this.intermediary_required = intermediary_required;
	}

	@Column(name = "interim_report_type")
	public String getInterim_report_type() {
		return interim_report_type;
	}

	public void setInterim_report_type(String interim_report_type) {
		this.interim_report_type = interim_report_type;
	}

	@Column(name = "inherit_reporting")
	public String getInherit_reporting() {
		return inherit_reporting;
	}

	public void setInherit_reporting(String inherit_reporting) {
		this.inherit_reporting = inherit_reporting;
	}

	@Column(name = "inf_waive_acc_open_charge")
	public String getInf_waive_acc_open_charge() {
		return inf_waive_acc_open_charge;
	}

	public void setInf_waive_acc_open_charge(String inf_waive_acc_open_charge) {
		this.inf_waive_acc_open_charge = inf_waive_acc_open_charge;
	}

	@Column(name = "inf_pay_in_option")
	public String getInf_pay_in_option() {
		return inf_pay_in_option;
	}

	public void setInf_pay_in_option(String inf_pay_in_option) {
		this.inf_pay_in_option = inf_pay_in_option;
	}

	@Column(name = "iban_required")
	public String getIban_required() {
		return iban_required;
	}

	public void setIban_required(String iban_required) {
		this.iban_required = iban_required;
	}

	@Column(name = "iban_reqd")
	public String getIban_reqd() {
		return iban_reqd;
	}

	public void setIban_reqd(String iban_reqd) {
		this.iban_reqd = iban_reqd;
	}

	@Column(name = "gen_interim_stmt_on_mvmt")
	public String getGen_interim_stmt_on_mvmt() {
		return gen_interim_stmt_on_mvmt;
	}

	public void setGen_interim_stmt_on_mvmt(String gen_interim_stmt_on_mvmt) {
		this.gen_interim_stmt_on_mvmt = gen_interim_stmt_on_mvmt;
	}

	@Column(name = "gen_interim_stmt")
	public String getGen_interim_stmt() {
		return gen_interim_stmt;
	}

	public void setGen_interim_stmt(String gen_interim_stmt) {
		this.gen_interim_stmt = gen_interim_stmt;
	}

	@Column(name = "gen_balance_report")
	public String getGen_balance_report() {
		return gen_balance_report;
	}

	public void setGen_balance_report(String gen_balance_report) {
		this.gen_balance_report = gen_balance_report;
	}

	@Column(name = "funding")
	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	@Column(name = "excl_sameday_rvrtrns_fm_stmt")
	public String getExcl_sameday_rvrtrns_fm_stmt() {
		return excl_sameday_rvrtrns_fm_stmt;
	}

	public void setExcl_sameday_rvrtrns_fm_stmt(String excl_sameday_rvrtrns_fm_stmt) {
		this.excl_sameday_rvrtrns_fm_stmt = excl_sameday_rvrtrns_fm_stmt;
	}

	@Column(name = "display_iban_in_advices")
	public String getDisplay_iban_in_advices() {
		return display_iban_in_advices;
	}

	public void setDisplay_iban_in_advices(String display_iban_in_advices) {
		this.display_iban_in_advices = display_iban_in_advices;
	}

	@Column(name = "direct_banking")
	public String getDirect_banking() {
		return direct_banking;
	}

	public void setDirect_banking(String direct_banking) {
		this.direct_banking = direct_banking;
	}

	@Column(name = "defer_recon")
	public String getDefer_recon() {
		return defer_recon;
	}

	public void setDefer_recon(String defer_recon) {
		this.defer_recon = defer_recon;
	}

	@Column(name = "contribute_to_pdm")
	public String getContribute_to_pdm() {
		return contribute_to_pdm;
	}

	public void setContribute_to_pdm(String contribute_to_pdm) {
		this.contribute_to_pdm = contribute_to_pdm;
	}

	@Column(name = "consolidation_reqd")
	public String getConsolidation_reqd() {
		return consolidation_reqd;
	}

	public void setConsolidation_reqd(String consolidation_reqd) {
		this.consolidation_reqd = consolidation_reqd;
	}

	@Column(name = "balance_report_type")
	public String getBalance_report_type() {
		return balance_report_type;
	}

	public void setBalance_report_type(String balance_report_type) {
		this.balance_report_type = balance_report_type;
	}

	@Column(name = "auto_prov_reqd")
	public String getAuto_prov_reqd() {
		return auto_prov_reqd;
	}

	public void setAuto_prov_reqd(String auto_prov_reqd) {
		this.auto_prov_reqd = auto_prov_reqd;
	}

	@Column(name = "auto_deposit")
	public String getAuto_deposit() {
		return auto_deposit;
	}

	public void setAuto_deposit(String auto_deposit) {
		this.auto_deposit = auto_deposit;
	}

	@Column(name = "auto_create_pool")
	public String getAuto_create_pool() {
		return auto_create_pool;
	}

	public void setAuto_create_pool(String auto_create_pool) {
		this.auto_create_pool = auto_create_pool;
	}

	@Column(name = "account_type")
	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	@Column(name = "spend_analysis_reqd")
	public String getSpend_analysis_reqd() {
		return spend_analysis_reqd;
	}

	public void setSpend_analysis_reqd(String spend_analysis_reqd) {
		this.spend_analysis_reqd = spend_analysis_reqd;
	}

	@Column(name = "salary_account")
	public String getSalary_account() {
		return salary_account;
	}

	public void setSalary_account(String salary_account) {
		this.salary_account = salary_account;
	}

	@Column(name = "repl_cust_sig")
	public String getRepl_cust_sig() {
		return repl_cust_sig;
	}

	public void setRepl_cust_sig(String repl_cust_sig) {
		this.repl_cust_sig = repl_cust_sig;
	}

	@Column(name = "prov_ccy_type")
	public String getProv_ccy_type() {
		return prov_ccy_type;
	}

	public void setProv_ccy_type(String prov_ccy_type) {
		this.prov_ccy_type = prov_ccy_type;
	}

	@Column(name = "exclude_from_distribution")
	public String getExclude_from_distribution() {
		return exclude_from_distribution;
	}

	public void setExclude_from_distribution(String exclude_from_distribution) {
		this.exclude_from_distribution = exclude_from_distribution;
	}

	@Column(name = "account_auto_closed")
	public String getAccount_auto_closed() {
		return account_auto_closed;
	}

	public void setAccount_auto_closed(String account_auto_closed) {
		this.account_auto_closed = account_auto_closed;
	}

	@Column(name = "line_id")
	public String getLine_id() {
		return line_id;
	}

	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}

	@Column(name = "reg_d_applicable")
	public String getReg_d_applicable() {
		return reg_d_applicable;
	}

	public void setReg_d_applicable(String reg_d_applicable) {
		this.reg_d_applicable = reg_d_applicable;
	}

	@Column(name = "referral_required")
	public String getReferral_required() {
		return referral_required;
	}

	public void setReferral_required(String referral_required) {
		this.referral_required = referral_required;
	}

	@Column(name = "record_stat")
	public String getRecord_stat() {
		return record_stat;
	}

	public void setRecord_stat(String record_stat) {
		this.record_stat = record_stat;
	}

	@Column(name = "positive_pay_ac")
	public String getPositive_pay_ac() {
		return positive_pay_ac;
	}

	public void setPositive_pay_ac(String positive_pay_ac) {
		this.positive_pay_ac = positive_pay_ac;
	}

	@Column(name = "passbook_facility")
	public String getPassbook_facility() {
		return passbook_facility;
	}

	public void setPassbook_facility(String passbook_facility) {
		this.passbook_facility = passbook_facility;
	}

	@Column(name = "once_auth")
	public String getOnce_auth() {
		return once_auth;
	}

	public void setOnce_auth(String once_auth) {
		this.once_auth = once_auth;
	}

	@Column(name = "netting_required")
	public String getNetting_required() {
		return netting_required;
	}

	public void setNetting_required(String netting_required) {
		this.netting_required = netting_required;
	}

	@Column(name = "mode_of_operation")
	public String getMode_of_operation() {
		return mode_of_operation;
	}

	public void setMode_of_operation(String mode_of_operation) {
		this.mode_of_operation = mode_of_operation;
	}

	@Column(name = "joint_ac_indicator")
	public String getJoint_ac_indicator() {
		return joint_ac_indicator;
	}

	public void setJoint_ac_indicator(String joint_ac_indicator) {
		this.joint_ac_indicator = joint_ac_indicator;
	}

	@Column(name = "gen_stmt_only_on_mvmt3")
	public String getGen_stmt_only_on_mvmt3() {
		return gen_stmt_only_on_mvmt3;
	}

	public void setGen_stmt_only_on_mvmt3(String gen_stmt_only_on_mvmt3) {
		this.gen_stmt_only_on_mvmt3 = gen_stmt_only_on_mvmt3;
	}

	@Column(name = "gen_stmt_only_on_mvmt2")
	public String getGen_stmt_only_on_mvmt2() {
		return gen_stmt_only_on_mvmt2;
	}

	public void setGen_stmt_only_on_mvmt2(String gen_stmt_only_on_mvmt2) {
		this.gen_stmt_only_on_mvmt2 = gen_stmt_only_on_mvmt2;
	}

	@Column(name = "gen_stmt_only_on_mvmt")
	public String getGen_stmt_only_on_mvmt() {
		return gen_stmt_only_on_mvmt;
	}

	public void setGen_stmt_only_on_mvmt(String gen_stmt_only_on_mvmt) {
		this.gen_stmt_only_on_mvmt = gen_stmt_only_on_mvmt;
	}

	@Column(name = "dormant_param")
	public String getDormant_param() {
		return dormant_param;
	}

	public void setDormant_param(String dormant_param) {
		this.dormant_param = dormant_param;
	}

	@Column(name = "cheque_book_facility")
	public String getCheque_book_facility() {
		return cheque_book_facility;
	}

	public void setCheque_book_facility(String cheque_book_facility) {
		this.cheque_book_facility = cheque_book_facility;
	}

	@Column(name = "cas_account")
	public String getCas_account() {
		return cas_account;
	}

	public void setCas_account(String cas_account) {
		this.cas_account = cas_account;
	}

	@Column(name = "auto_reorder_check_required")
	public String getAuto_reorder_check_required() {
		return auto_reorder_check_required;
	}

	public void setAuto_reorder_check_required(String auto_reorder_check_required) {
		this.auto_reorder_check_required = auto_reorder_check_required;
	}

	@Column(name = "auth_stat")
	public String getAuth_stat() {
		return auth_stat;
	}

	public void setAuth_stat(String auth_stat) {
		this.auth_stat = auth_stat;
	}

	@Column(name = "atm_facility")
	public String getAtm_facility() {
		return atm_facility;
	}

	public void setAtm_facility(String atm_facility) {
		this.atm_facility = atm_facility;
	}

	@Column(name = "acc_stmt_type3")
	public String getAcc_stmt_type3() {
		return acc_stmt_type3;
	}

	public void setAcc_stmt_type3(String acc_stmt_type3) {
		this.acc_stmt_type3 = acc_stmt_type3;
	}

	@Column(name = "acc_stmt_type2")
	public String getAcc_stmt_type2() {
		return acc_stmt_type2;
	}

	public void setAcc_stmt_type2(String acc_stmt_type2) {
		this.acc_stmt_type2 = acc_stmt_type2;
	}

	@Column(name = "ac_stmt_type")
	public String getAc_stmt_type() {
		return ac_stmt_type;
	}

	public void setAc_stmt_type(String ac_stmt_type) {
		this.ac_stmt_type = ac_stmt_type;
	}

	@Column(name = "ac_stmt_cycle3")
	public String getAc_stmt_cycle3() {
		return ac_stmt_cycle3;
	}

	public void setAc_stmt_cycle3(String ac_stmt_cycle3) {
		this.ac_stmt_cycle3 = ac_stmt_cycle3;
	}

	@Column(name = "ac_stmt_cycle2")
	public String getAc_stmt_cycle2() {
		return ac_stmt_cycle2;
	}

	public void setAc_stmt_cycle2(String ac_stmt_cycle2) {
		this.ac_stmt_cycle2 = ac_stmt_cycle2;
	}

	@Column(name = "ac_stmt_cycle")
	public String getAc_stmt_cycle() {
		return ac_stmt_cycle;
	}

	public void setAc_stmt_cycle(String ac_stmt_cycle) {
		this.ac_stmt_cycle = ac_stmt_cycle;
	}

	@Column(name = "ac_stat_stop_pay")
	public String getAc_stat_stop_pay() {
		return ac_stat_stop_pay;
	}

	public void setAc_stat_stop_pay(String ac_stat_stop_pay) {
		this.ac_stat_stop_pay = ac_stat_stop_pay;
	}

	@Column(name = "ac_stat_no_dr")
	public String getAc_stat_no_dr() {
		return ac_stat_no_dr;
	}

	public void setAc_stat_no_dr(String ac_stat_no_dr) {
		this.ac_stat_no_dr = ac_stat_no_dr;
	}

	@Column(name = "ac_stat_no_cr")
	public String getAc_stat_no_cr() {
		return ac_stat_no_cr;
	}

	public void setAc_stat_no_cr(String ac_stat_no_cr) {
		this.ac_stat_no_cr = ac_stat_no_cr;
	}

	@Column(name = "ac_stat_frozen")
	public String getAc_stat_frozen() {
		return ac_stat_frozen;
	}

	public void setAc_stat_frozen(String ac_stat_frozen) {
		this.ac_stat_frozen = ac_stat_frozen;
	}

	@Column(name = "ac_stat_dormant")
	public String getAc_stat_dormant() {
		return ac_stat_dormant;
	}

	public void setAc_stat_dormant(String ac_stat_dormant) {
		this.ac_stat_dormant = ac_stat_dormant;
	}

	@Column(name = "ac_stat_de_post")
	public String getAc_stat_de_post() {
		return ac_stat_de_post;
	}

	public void setAc_stat_de_post(String ac_stat_de_post) {
		this.ac_stat_de_post = ac_stat_de_post;
	}

	@Column(name = "ac_stat_block")
	public String getAc_stat_block() {
		return ac_stat_block;
	}

	public void setAc_stat_block(String ac_stat_block) {
		this.ac_stat_block = ac_stat_block;
	}

	@Column(name = "spl_ac_gen")
	public String getSpl_ac_gen() {
		return spl_ac_gen;
	}

	public void setSpl_ac_gen(String spl_ac_gen) {
		this.spl_ac_gen = spl_ac_gen;
	}

	@Column(name = "escrow_transfer")
	public String getEscrow_transfer() {
		return escrow_transfer;
	}

	public void setEscrow_transfer(String escrow_transfer) {
		this.escrow_transfer = escrow_transfer;
	}

	@Column(name = "auto_dc_request")
	public String getAuto_dc_request() {
		return auto_dc_request;
	}

	public void setAuto_dc_request(String auto_dc_request) {
		this.auto_dc_request = auto_dc_request;
	}

	@Column(name = "auto_chqbk_request")
	public String getAuto_chqbk_request() {
		return auto_chqbk_request;
	}

	public void setAuto_chqbk_request(String auto_chqbk_request) {
		this.auto_chqbk_request = auto_chqbk_request;
	}

	@Column(name = "allow_back_period_entry")
	public String getAllow_back_period_entry() {
		return allow_back_period_entry;
	}

	public void setAllow_back_period_entry(String allow_back_period_entry) {
		this.allow_back_period_entry = allow_back_period_entry;
	}

	@Column(name = "ac_stat_dr_ovd")
	public String getAc_stat_dr_ovd() {
		return ac_stat_dr_ovd;
	}

	public void setAc_stat_dr_ovd(String ac_stat_dr_ovd) {
		this.ac_stat_dr_ovd = ac_stat_dr_ovd;
	}

	@Column(name = "ac_stat_cr_ovd")
	public String getAc_stat_cr_ovd() {
		return ac_stat_cr_ovd;
	}

	public void setAc_stat_cr_ovd(String ac_stat_cr_ovd) {
		this.ac_stat_cr_ovd = ac_stat_cr_ovd;
	}

	@Column(name = "validation_digit")
	public Double getValidation_digit() {
		return validation_digit;
	}

	public void setValidation_digit(Double validation_digit) {
		this.validation_digit = validation_digit;
	}

	@Column(name = "sweep_type")
	public Double getSweep_type() {
		return sweep_type;
	}

	public void setSweep_type(Double sweep_type) {
		this.sweep_type = sweep_type;
	}

	@Column(name = "no_cheque_rejections")
	public Double getNo_cheque_rejections() {
		return no_cheque_rejections;
	}

	public void setNo_cheque_rejections(Double no_cheque_rejections) {
		this.no_cheque_rejections = no_cheque_rejections;
	}

	@Column(name = "min_reqd_bal")
	public Double getMin_reqd_bal() {
		return min_reqd_bal;
	}

	public void setMin_reqd_bal(Double min_reqd_bal) {
		this.min_reqd_bal = min_reqd_bal;
	}

	@Column(name = "max_no_cheque_rejections")
	public Double getMax_no_cheque_rejections() {
		return max_no_cheque_rejections;
	}

	public void setMax_no_cheque_rejections(Double max_no_cheque_rejections) {
		this.max_no_cheque_rejections = max_no_cheque_rejections;
	}

	@Column(name = "auto_deposits_bal")
	public Double getAuto_deposits_bal() {
		return auto_deposits_bal;
	}

	public void setAuto_deposits_bal(Double auto_deposits_bal) {
		this.auto_deposits_bal = auto_deposits_bal;
	}

	@Column(name = "previous_statement_no3")
	public Double getPrevious_statement_no3() {
		return previous_statement_no3;
	}

	public void setPrevious_statement_no3(Double previous_statement_no3) {
		this.previous_statement_no3 = previous_statement_no3;
	}

	@Column(name = "previous_statement_no2")
	public Double getPrevious_statement_no2() {
		return previous_statement_no2;
	}

	public void setPrevious_statement_no2(Double previous_statement_no2) {
		this.previous_statement_no2 = previous_statement_no2;
	}

	@Column(name = "previous_statement_no")
	public Double getPrevious_statement_no() {
		return previous_statement_no;
	}

	public void setPrevious_statement_no(Double previous_statement_no) {
		this.previous_statement_no = previous_statement_no;
	}

	@Column(name = "stale_days")
	public Double getStale_days() {
		return stale_days;
	}

	public void setStale_days(Double stale_days) {
		this.stale_days = stale_days;
	}

	@Column(name = "interim_stmt_ytd_count")
	public Double getInterim_stmt_ytd_count() {
		return interim_stmt_ytd_count;
	}

	public void setInterim_stmt_ytd_count(Double interim_stmt_ytd_count) {
		this.interim_stmt_ytd_count = interim_stmt_ytd_count;
	}

	@Column(name = "dormancy_days")
	public Double getDormancy_days() {
		return dormancy_days;
	}

	public void setDormancy_days(Double dormancy_days) {
		this.dormancy_days = dormancy_days;
	}

	@Column(name = "sod_notification_percent")
	public Double getSod_notification_percent() {
		return sod_notification_percent;
	}

	public void setSod_notification_percent(Double sod_notification_percent) {
		this.sod_notification_percent = sod_notification_percent;
	}

	@Column(name = "auto_reorder_check_level")
	public Double getAuto_reorder_check_level() {
		return auto_reorder_check_level;
	}

	public void setAuto_reorder_check_level(Double auto_reorder_check_level) {
		this.auto_reorder_check_level = auto_reorder_check_level;
	}

	@Column(name = "auto_reorder_check_leaves")
	public Double getAuto_reorder_check_leaves() {
		return auto_reorder_check_leaves;
	}

	public void setAuto_reorder_check_leaves(Double auto_reorder_check_leaves) {
		this.auto_reorder_check_leaves = auto_reorder_check_leaves;
	}

	@Column(name = "atm_dly_count_limit")
	public Double getAtm_dly_count_limit() {
		return atm_dly_count_limit;
	}

	public void setAtm_dly_count_limit(Double atm_dly_count_limit) {
		this.atm_dly_count_limit = atm_dly_count_limit;
	}

	@Column(name = "uncoll_funds_limit")
	public Double getUncoll_funds_limit() {
		return uncoll_funds_limit;
	}

	public void setUncoll_funds_limit(Double uncoll_funds_limit) {
		this.uncoll_funds_limit = uncoll_funds_limit;
	}

	@Column(name = "tod_limit")
	public Double getTod_limit() {
		return tod_limit;
	}

	public void setTod_limit(Double tod_limit) {
		this.tod_limit = tod_limit;
	}

	@Column(name = "sublimit")
	public Double getSublimit() {
		return sublimit;
	}

	public void setSublimit(Double sublimit) {
		this.sublimit = sublimit;
	}

	@Column(name = "risk_free_exp_amount")
	public Double getRisk_free_exp_amount() {
		return risk_free_exp_amount;
	}

	public void setRisk_free_exp_amount(Double risk_free_exp_amount) {
		this.risk_free_exp_amount = risk_free_exp_amount;
	}

	@Column(name = "previous_statement_balance3")
	public Double getPrevious_statement_balance3() {
		return previous_statement_balance3;
	}

	public void setPrevious_statement_balance3(Double previous_statement_balance3) {
		this.previous_statement_balance3 = previous_statement_balance3;
	}

	@Column(name = "previous_statement_balance2")
	public Double getPrevious_statement_balance2() {
		return previous_statement_balance2;
	}

	public void setPrevious_statement_balance2(Double previous_statement_balance2) {
		this.previous_statement_balance2 = previous_statement_balance2;
	}

	@Column(name = "previous_statement_balance")
	public Double getPrevious_statement_balance() {
		return previous_statement_balance;
	}

	public void setPrevious_statement_balance(Double previous_statement_balance) {
		this.previous_statement_balance = previous_statement_balance;
	}

	@Column(name = "offline_limit")
	public Double getOffline_limit() {
		return offline_limit;
	}

	public void setOffline_limit(Double offline_limit) {
		this.offline_limit = offline_limit;
	}

	@Column(name = "interim_debit_amt")
	public Double getInterim_debit_amt() {
		return interim_debit_amt;
	}

	public void setInterim_debit_amt(Double interim_debit_amt) {
		this.interim_debit_amt = interim_debit_amt;
	}

	@Column(name = "interim_credit_amt")
	public Double getInterim_credit_amt() {
		return interim_credit_amt;
	}

	public void setInterim_credit_amt(Double interim_credit_amt) {
		this.interim_credit_amt = interim_credit_amt;
	}

	@Column(name = "inf_acc_opening_amt")
	public Double getInf_acc_opening_amt() {
		return inf_acc_opening_amt;
	}

	public void setInf_acc_opening_amt(Double inf_acc_opening_amt) {
		this.inf_acc_opening_amt = inf_acc_opening_amt;
	}

	@Column(name = "escrow_percentage")
	public Double getEscrow_percentage() {
		return escrow_percentage;
	}

	public void setEscrow_percentage(Double escrow_percentage) {
		this.escrow_percentage = escrow_percentage;
	}

	@Column(name = "dr_auto_ex_rate_lmt")
	public Double getDr_auto_ex_rate_lmt() {
		return dr_auto_ex_rate_lmt;
	}

	public void setDr_auto_ex_rate_lmt(Double dr_auto_ex_rate_lmt) {
		this.dr_auto_ex_rate_lmt = dr_auto_ex_rate_lmt;
	}

	@Column(name = "cr_auto_ex_rate_lmt")
	public Double getCr_auto_ex_rate_lmt() {
		return cr_auto_ex_rate_lmt;
	}

	public void setCr_auto_ex_rate_lmt(Double cr_auto_ex_rate_lmt) {
		this.cr_auto_ex_rate_lmt = cr_auto_ex_rate_lmt;
	}

	@Column(name = "atm_dly_amt_limit")
	public Double getAtm_dly_amt_limit() {
		return atm_dly_amt_limit;
	}

	public void setAtm_dly_amt_limit(Double atm_dly_amt_limit) {
		this.atm_dly_amt_limit = atm_dly_amt_limit;
	}

	@Column(name = "daylight_limit_amount")
	public Double getDaylight_limit_amount() {
		return daylight_limit_amount;
	}

	public void setDaylight_limit_amount(Double daylight_limit_amount) {
		this.daylight_limit_amount = daylight_limit_amount;
	}

	@Column(name = "mod_no")
	public Double getMod_no() {
		return mod_no;
	}

	public void setMod_no(Double mod_no) {
		this.mod_no = mod_no;
	}

	@Column(name = "interim_stmt_day_count")
	public Double getInterim_stmt_day_count() {
		return interim_stmt_day_count;
	}

	public void setInterim_stmt_day_count(Double interim_stmt_day_count) {
		this.interim_stmt_day_count = interim_stmt_day_count;
	}

	@Column(name = "acc_stmt_day3")
	public Double getAcc_stmt_day3() {
		return acc_stmt_day3;
	}

	public void setAcc_stmt_day3(Double acc_stmt_day3) {
		this.acc_stmt_day3 = acc_stmt_day3;
	}

	@Column(name = "acc_stmt_day2")
	public Double getAcc_stmt_day2() {
		return acc_stmt_day2;
	}

	public void setAcc_stmt_day2(Double acc_stmt_day2) {
		this.acc_stmt_day2 = acc_stmt_day2;
	}

	@Column(name = "ac_stmt_day")
	public Double getAc_stmt_day() {
		return ac_stmt_day;
	}

	public void setAc_stmt_day(Double ac_stmt_day) {
		this.ac_stmt_day = ac_stmt_day;
	}

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	@Column(name = "tod_since")
	public Date getTod_since() {
		return tod_since;
	}

	public void setTod_since(Date tod_since) {
		this.tod_since = tod_since;
	}

	@Column(name = "tod_limit_start_date")
	public Date getTod_limit_start_date() {
		return tod_limit_start_date;
	}

	public void setTod_limit_start_date(Date tod_limit_start_date) {
		this.tod_limit_start_date = tod_limit_start_date;
	}

	@Column(name = "tod_limit_end_date")
	public Date getTod_limit_end_date() {
		return tod_limit_end_date;
	}

	public void setTod_limit_end_date(Date tod_limit_end_date) {
		this.tod_limit_end_date = tod_limit_end_date;
	}

	@Column(name = "status_since")
	public Date getStatus_since() {
		return status_since;
	}

	public void setStatus_since(Date status_since) {
		this.status_since = status_since;
	}

	@Column(name = "regd_start_date")
	public Date getRegd_start_date() {
		return regd_start_date;
	}

	public void setRegd_start_date(Date regd_start_date) {
		this.regd_start_date = regd_start_date;
	}

	@Column(name = "regd_end_date")
	public Date getRegd_end_date() {
		return regd_end_date;
	}

	public void setRegd_end_date(Date regd_end_date) {
		this.regd_end_date = regd_end_date;
	}

	@Column(name = "previous_statement_date3")
	public Date getPrevious_statement_date3() {
		return previous_statement_date3;
	}

	public void setPrevious_statement_date3(Date previous_statement_date3) {
		this.previous_statement_date3 = previous_statement_date3;
	}

	@Column(name = "previous_statement_date2")
	public Date getPrevious_statement_date2() {
		return previous_statement_date2;
	}

	public void setPrevious_statement_date2(Date previous_statement_date2) {
		this.previous_statement_date2 = previous_statement_date2;
	}

	@Column(name = "previous_statement_date")
	public Date getPrevious_statement_date() {
		return previous_statement_date;
	}

	public void setPrevious_statement_date(Date previous_statement_date) {
		this.previous_statement_date = previous_statement_date;
	}

	@Column(name = "prev_tod_since")
	public Date getPrev_tod_since() {
		return prev_tod_since;
	}

	public void setPrev_tod_since(Date prev_tod_since) {
		this.prev_tod_since = prev_tod_since;
	}

	@Column(name = "prev_ovd_date")
	public Date getPrev_ovd_date() {
		return prev_ovd_date;
	}

	public void setPrev_ovd_date(Date prev_ovd_date) {
		this.prev_ovd_date = prev_ovd_date;
	}

	@Column(name = "overline_od_since")
	public Date getOverline_od_since() {
		return overline_od_since;
	}

	public void setOverline_od_since(Date overline_od_since) {
		this.overline_od_since = overline_od_since;
	}

	@Column(name = "overdraft_since")
	public Date getOverdraft_since() {
		return overdraft_since;
	}

	public void setOverdraft_since(Date overdraft_since) {
		this.overdraft_since = overdraft_since;
	}

	@Column(name = "no_of_chq_rej_reset_on")
	public Date getNo_of_chq_rej_reset_on() {
		return no_of_chq_rej_reset_on;
	}

	public void setNo_of_chq_rej_reset_on(Date no_of_chq_rej_reset_on) {
		this.no_of_chq_rej_reset_on = no_of_chq_rej_reset_on;
	}

	@Column(name = "maker_dt_stamp")
	public Date getMaker_dt_stamp() {
		return maker_dt_stamp;
	}

	public void setMaker_dt_stamp(Date maker_dt_stamp) {
		this.maker_dt_stamp = maker_dt_stamp;
	}

	@Column(name = "dormancy_date")
	public Date getDormancy_date() {
		return dormancy_date;
	}

	public void setDormancy_date(Date dormancy_date) {
		this.dormancy_date = dormancy_date;
	}

	@Column(name = "checker_dt_stamp")
	public Date getChecker_dt_stamp() {
		return checker_dt_stamp;
	}

	public void setChecker_dt_stamp(Date checker_dt_stamp) {
		this.checker_dt_stamp = checker_dt_stamp;
	}

	@Column(name = "ac_open_date")
	public Date getAc_open_date() {
		return ac_open_date;
	}

	public void setAc_open_date(Date ac_open_date) {
		this.ac_open_date = ac_open_date;
	}

}
