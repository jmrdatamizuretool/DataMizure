package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_UPLOAD_CUSTOMER")
public class TransSttmUploadCustomer {
	private String source_code;
	@Id
	
	private String maintenance_seq_no;
	
	private String customer_no;
	
	private String customer_type;
	
	private String customer_name1;
	
	private String address_line1;
	
	private String address_line3;
	
	private String address_line2;
	
	private String address_line4;
	
	private String country;
	
	private String short_name;
	
	private String nationality;
	
	private String language;
	
	private String exposure_country;
	
	private String local_branch;
	
	private String liability_no;
	
	private String unique_id_name;
	
	private String unique_id_value;
	
	private String frozen;
	
	private String deceased;
	
	private String whereabouts_unknown;
	
	private String customer_category;
	
	private String ho_ac_no;
	
	private Double fx_cust_clean_risk_limit;
	
	private Double overall_limit;
	
	private Double fx_clean_risk_limit;
	
	private String credit_rating;
	
	private Date revision_date;
	
	private String limit_ccy;
	
	private String cas_cust;
	
	private String conversion_status_flag;
	
	private String err_msg;
	
	private Double sec_cust_clean_risk_limit;
	
	private Double sec_clean_risk_limit;
	
	private Double sec_cust_pstl_risk_limit;
	
	private Double sec_pstl_risk_limit;
	
	private String swift_code;
	
	private String liab_br;
	
	private String liab_node;
	
	private String past_due_flag;
	
	private String default_media;
	
	private String loc_code;
	
	private String short_name2;
	
	private String ssn;
	
	private String action_code;
	
	private String utility_provider;

	private String utility_provider_id;
	
	private String risk_profile;
	
	private String debtor_category;
	
	private String udf_1;
	
	private String udf_2;
	
	private String udf_3;
	
	private String udf_4;
	
	private String udf_5;
	
	private String mailers_required;
	
	private String aml_customer_grp;
	
	private String aml_required;
	
	private String group_code;
	
	private String exposure_category;
	
	private String cust_classification;
	
	private String cif_status;
	

	private Date cif_status_since;
	
	private String introducer;
	
	private String ft_accting_as_of;
	
	private String cust_unadvised;
	
	private String liab_unadvised;
	
	private String tax_group;
	
	private String consol_tax_cert_reqd;
	
	private String individual_tax_cert_reqd;
	
	private String fx_netting_customer;
	
	private String cls_participant;
	
	private String cls_ccy_allowed;
	
	private String risk_category;
	
	private String fax_number;
	
	private String ext_ref_no;
	
	private String crm_customer;
	
	private String issuer_customer;
	
	private String treasury_customer;
	
	private String charge_group;
	
	private String full_name;
	
	private String maker_id;
	
	private Date maker_dt_stamp;
	
	private String checker_id;
	
	private Date checker_dt_stamp;
	
	private String cust_clg_group;
	
	private String chk_digit_valid_reqd;
	
	private String alg_id;
	
	private Double wht_pct;
	
	private String rp_customer;
	
	private String source_seq_no;
	
	private String branch_code;
	
	private String generate_mt920;
	
	private String private_customer;
	
	private String kyc_details;
	
	private String staff;
	
	private String kyc_ref_no;
	
	private Double lc_collateral_pct;
	
	private String auto_create_account;
	
	private String auto_cust_ac_no;
	
	private String track_limits;
	
	private String ar_ap_tracking;
	
	private String rm_id;
	
	private String pincode;
	
	private String autogen_stmtplan;
	
	private String frequency;
	
	private String stmt_day;
	
	private String invest_cust;
	
	private String allow_vrtl_accnts;
	
	private String vrtl_customer_id;
	
	private String elcm_customer;
	
	private String withholding_tax;
	
	private String taxid_no;
	
	private String special_cust;
	
	private Date cif_creation_date;
	
	private String mfi_customer;
	
	private String joint_venture;

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "customer_type")
	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}

	@Column(name = "customer_name1")
	public String getCustomer_name1() {
		return customer_name1;
	}

	public void setCustomer_name1(String customer_name1) {
		this.customer_name1 = customer_name1;
	}

	@Column(name = "address_line1")
	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	@Column(name = "address_line3")
	public String getAddress_line3() {
		return address_line3;
	}

	public void setAddress_line3(String address_line3) {
		this.address_line3 = address_line3;
	}

	@Column(name = "address_line2")
	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	@Column(name = "address_line4")
	public String getAddress_line4() {
		return address_line4;
	}

	public void setAddress_line4(String address_line4) {
		this.address_line4 = address_line4;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "short_name")
	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	@Column(name = "nationality")
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "language")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "exposure_country")
	public String getExposure_country() {
		return exposure_country;
	}

	public void setExposure_country(String exposure_country) {
		this.exposure_country = exposure_country;
	}

	@Column(name = "local_branch")
	public String getLocal_branch() {
		return local_branch;
	}

	public void setLocal_branch(String local_branch) {
		this.local_branch = local_branch;
	}

	@Column(name = "liability_no")
	public String getLiability_no() {
		return liability_no;
	}

	public void setLiability_no(String liability_no) {
		this.liability_no = liability_no;
	}

	@Column(name = "unique_id_name")
	public String getUnique_id_name() {
		return unique_id_name;
	}

	public void setUnique_id_name(String unique_id_name) {
		this.unique_id_name = unique_id_name;
	}

	@Column(name = "unique_id_value")
	public String getUnique_id_value() {
		return unique_id_value;
	}

	public void setUnique_id_value(String unique_id_value) {
		this.unique_id_value = unique_id_value;
	}

	@Column(name = "frozen")
	public String getFrozen() {
		return frozen;
	}

	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}

	@Column(name = "deceased")
	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	@Column(name = "whereabouts_unknown")
	public String getWhereabouts_unknown() {
		return whereabouts_unknown;
	}

	public void setWhereabouts_unknown(String whereabouts_unknown) {
		this.whereabouts_unknown = whereabouts_unknown;
	}

	@Column(name = "customer_category")
	public String getCustomer_category() {
		return customer_category;
	}

	public void setCustomer_category(String customer_category) {
		this.customer_category = customer_category;
	}

	@Column(name = "ho_ac_no")
	public String getHo_ac_no() {
		return ho_ac_no;
	}

	public void setHo_ac_no(String ho_ac_no) {
		this.ho_ac_no = ho_ac_no;
	}

	@Column(name = "fx_cust_clean_risk_limit")
	public Double getFx_cust_clean_risk_limit() {
		return fx_cust_clean_risk_limit;
	}

	public void setFx_cust_clean_risk_limit(Double fx_cust_clean_risk_limit) {
		this.fx_cust_clean_risk_limit = fx_cust_clean_risk_limit;
	}

	@Column(name = "overall_limit")
	public Double getOverall_limit() {
		return overall_limit;
	}

	public void setOverall_limit(Double overall_limit) {
		this.overall_limit = overall_limit;
	}

	@Column(name = "fx_clean_risk_limit")
	public Double getFx_clean_risk_limit() {
		return fx_clean_risk_limit;
	}

	public void setFx_clean_risk_limit(Double fx_clean_risk_limit) {
		this.fx_clean_risk_limit = fx_clean_risk_limit;
	}

	@Column(name = "credit_rating")
	public String getCredit_rating() {
		return credit_rating;
	}

	public void setCredit_rating(String credit_rating) {
		this.credit_rating = credit_rating;
	}

	@Column(name = "revision_date")
	public Date getRevision_date() {
		return revision_date;
	}

	public void setRevision_date(Date revision_date) {
		this.revision_date = revision_date;
	}

	@Column(name = "limit_ccy")
	public String getLimit_ccy() {
		return limit_ccy;
	}

	public void setLimit_ccy(String limit_ccy) {
		this.limit_ccy = limit_ccy;
	}

	@Column(name = "cas_cust")
	public String getCas_cust() {
		return cas_cust;
	}

	public void setCas_cust(String cas_cust) {
		this.cas_cust = cas_cust;
	}

	@Column(name = "conversion_status_flag")
	public String getConversion_status_flag() {
		return conversion_status_flag;
	}

	public void setConversion_status_flag(String conversion_status_flag) {
		this.conversion_status_flag = conversion_status_flag;
	}

	@Column(name = "err_msg")
	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	@Column(name = "sec_cust_clean_risk_limit")
	public Double getSec_cust_clean_risk_limit() {
		return sec_cust_clean_risk_limit;
	}

	public void setSec_cust_clean_risk_limit(Double sec_cust_clean_risk_limit) {
		this.sec_cust_clean_risk_limit = sec_cust_clean_risk_limit;
	}

	@Column(name = "sec_clean_risk_limit")
	public Double getSec_clean_risk_limit() {
		return sec_clean_risk_limit;
	}

	public void setSec_clean_risk_limit(Double sec_clean_risk_limit) {
		this.sec_clean_risk_limit = sec_clean_risk_limit;
	}

	@Column(name = "sec_cust_pstl_risk_limit")
	public Double getSec_cust_pstl_risk_limit() {
		return sec_cust_pstl_risk_limit;
	}

	public void setSec_cust_pstl_risk_limit(Double sec_cust_pstl_risk_limit) {
		this.sec_cust_pstl_risk_limit = sec_cust_pstl_risk_limit;
	}

	@Column(name = "sec_pstl_risk_limit")
	public Double getSec_pstl_risk_limit() {
		return sec_pstl_risk_limit;
	}

	public void setSec_pstl_risk_limit(Double sec_pstl_risk_limit) {
		this.sec_pstl_risk_limit = sec_pstl_risk_limit;
	}

	@Column(name = "swift_code")
	public String getSwift_code() {
		return swift_code;
	}

	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}

	@Column(name = "liab_br")
	public String getLiab_br() {
		return liab_br;
	}

	public void setLiab_br(String liab_br) {
		this.liab_br = liab_br;
	}

	@Column(name = "liab_node")
	public String getLiab_node() {
		return liab_node;
	}

	public void setLiab_node(String liab_node) {
		this.liab_node = liab_node;
	}

	@Column(name = "past_due_flag")
	public String getPast_due_flag() {
		return past_due_flag;
	}

	public void setPast_due_flag(String past_due_flag) {
		this.past_due_flag = past_due_flag;
	}

	@Column(name = "default_media")
	public String getDefault_media() {
		return default_media;
	}

	public void setDefault_media(String default_media) {
		this.default_media = default_media;
	}

	@Column(name = "loc_code")
	public String getLoc_code() {
		return loc_code;
	}

	public void setLoc_code(String loc_code) {
		this.loc_code = loc_code;
	}

	@Column(name = "short_name2")
	public String getShort_name2() {
		return short_name2;
	}

	public void setShort_name2(String short_name2) {
		this.short_name2 = short_name2;
	}

	@Column(name = "ssn")
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Column(name = "action_code")
	public String getAction_code() {
		return action_code;
	}

	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}

	@Column(name = "utility_provider")
	public String getUtility_provider() {
		return utility_provider;
	}

	public void setUtility_provider(String utility_provider) {
		this.utility_provider = utility_provider;
	}

	@Column(name = "utility_provider_id")
	public String getUtility_provider_id() {
		return utility_provider_id;
	}

	public void setUtility_provider_id(String utility_provider_id) {
		this.utility_provider_id = utility_provider_id;
	}

	@Column(name = "risk_profile")
	public String getRisk_profile() {
		return risk_profile;
	}

	public void setRisk_profile(String risk_profile) {
		this.risk_profile = risk_profile;
	}

	@Column(name = "debtor_category")
	public String getDebtor_category() {
		return debtor_category;
	}

	public void setDebtor_category(String debtor_category) {
		this.debtor_category = debtor_category;
	}

	@Column(name = "udf_1")
	public String getUdf_1() {
		return udf_1;
	}

	public void setUdf_1(String udf_1) {
		this.udf_1 = udf_1;
	}

	@Column(name = "udf_2")
	public String getUdf_2() {
		return udf_2;
	}

	public void setUdf_2(String udf_2) {
		this.udf_2 = udf_2;
	}

	@Column(name = "udf_3")
	public String getUdf_3() {
		return udf_3;
	}

	public void setUdf_3(String udf_3) {
		this.udf_3 = udf_3;
	}

	@Column(name = "udf_4")
	public String getUdf_4() {
		return udf_4;
	}

	public void setUdf_4(String udf_4) {
		this.udf_4 = udf_4;
	}

	@Column(name = "udf_5")
	public String getUdf_5() {
		return udf_5;
	}

	public void setUdf_5(String udf_5) {
		this.udf_5 = udf_5;
	}

	@Column(name = "mailers_required")
	public String getMailers_required() {
		return mailers_required;
	}

	public void setMailers_required(String mailers_required) {
		this.mailers_required = mailers_required;
	}

	@Column(name = "aml_customer_grp")
	public String getAml_customer_grp() {
		return aml_customer_grp;
	}

	public void setAml_customer_grp(String aml_customer_grp) {
		this.aml_customer_grp = aml_customer_grp;
	}

	@Column(name = "aml_required")
	public String getAml_required() {
		return aml_required;
	}

	public void setAml_required(String aml_required) {
		this.aml_required = aml_required;
	}

	@Column(name = "group_code")
	public String getGroup_code() {
		return group_code;
	}

	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}

	@Column(name = "exposure_category")
	public String getExposure_category() {
		return exposure_category;
	}

	public void setExposure_category(String exposure_category) {
		this.exposure_category = exposure_category;
	}

	@Column(name = "cust_classification")
	public String getCust_classification() {
		return cust_classification;
	}

	public void setCust_classification(String cust_classification) {
		this.cust_classification = cust_classification;
	}

	@Column(name = "cif_status")
	public String getCif_status() {
		return cif_status;
	}

	public void setCif_status(String cif_status) {
		this.cif_status = cif_status;
	}

	@Column(name = "cif_status_since")
	public Date getCif_status_since() {
		return cif_status_since;
	}

	public void setCif_status_since(Date cif_status_since) {
		this.cif_status_since = cif_status_since;
	}

	@Column(name = "introducer")
	public String getIntroducer() {
		return introducer;
	}

	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}

	@Column(name = "ft_accting_as_of")
	public String getFt_accting_as_of() {
		return ft_accting_as_of;
	}

	public void setFt_accting_as_of(String ft_accting_as_of) {
		this.ft_accting_as_of = ft_accting_as_of;
	}

	@Column(name = "cust_unadvised")
	public String getCust_unadvised() {
		return cust_unadvised;
	}

	public void setCust_unadvised(String cust_unadvised) {
		this.cust_unadvised = cust_unadvised;
	}

	@Column(name = "liab_unadvised")
	public String getLiab_unadvised() {
		return liab_unadvised;
	}

	public void setLiab_unadvised(String liab_unadvised) {
		this.liab_unadvised = liab_unadvised;
	}

	@Column(name = "tax_group")
	public String getTax_group() {
		return tax_group;
	}

	public void setTax_group(String tax_group) {
		this.tax_group = tax_group;
	}

	@Column(name = "consol_tax_cert_reqd")
	public String getConsol_tax_cert_reqd() {
		return consol_tax_cert_reqd;
	}

	public void setConsol_tax_cert_reqd(String consol_tax_cert_reqd) {
		this.consol_tax_cert_reqd = consol_tax_cert_reqd;
	}

	@Column(name = "individual_tax_cert_reqd")
	public String getIndividual_tax_cert_reqd() {
		return individual_tax_cert_reqd;
	}

	public void setIndividual_tax_cert_reqd(String individual_tax_cert_reqd) {
		this.individual_tax_cert_reqd = individual_tax_cert_reqd;
	}

	@Column(name = "fx_netting_customer")
	public String getFx_netting_customer() {
		return fx_netting_customer;
	}

	public void setFx_netting_customer(String fx_netting_customer) {
		this.fx_netting_customer = fx_netting_customer;
	}

	@Column(name = "cls_participant")
	public String getCls_participant() {
		return cls_participant;
	}

	public void setCls_participant(String cls_participant) {
		this.cls_participant = cls_participant;
	}

	@Column(name = "cls_ccy_allowed")
	public String getCls_ccy_allowed() {
		return cls_ccy_allowed;
	}

	public void setCls_ccy_allowed(String cls_ccy_allowed) {
		this.cls_ccy_allowed = cls_ccy_allowed;
	}

	@Column(name = "risk_category")
	public String getRisk_category() {
		return risk_category;
	}

	public void setRisk_category(String risk_category) {
		this.risk_category = risk_category;
	}

	@Column(name = "fax_number")
	public String getFax_number() {
		return fax_number;
	}

	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}

	@Column(name = "ext_ref_no")
	public String getExt_ref_no() {
		return ext_ref_no;
	}

	public void setExt_ref_no(String ext_ref_no) {
		this.ext_ref_no = ext_ref_no;
	}

	@Column(name = "crm_customer")
	public String getCrm_customer() {
		return crm_customer;
	}

	public void setCrm_customer(String crm_customer) {
		this.crm_customer = crm_customer;
	}

	@Column(name = "issuer_customer")
	public String getIssuer_customer() {
		return issuer_customer;
	}

	public void setIssuer_customer(String issuer_customer) {
		this.issuer_customer = issuer_customer;
	}

	@Column(name = "treasury_customer")
	public String getTreasury_customer() {
		return treasury_customer;
	}

	public void setTreasury_customer(String treasury_customer) {
		this.treasury_customer = treasury_customer;
	}

	@Column(name = "charge_group")
	public String getCharge_group() {
		return charge_group;
	}

	public void setCharge_group(String charge_group) {
		this.charge_group = charge_group;
	}

	@Column(name = "full_name")
	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	@Column(name = "maker_id")
	public String getMaker_id() {
		return maker_id;
	}

	public void setMaker_id(String maker_id) {
		this.maker_id = maker_id;
	}

	@Column(name = "maker_dt_stamp")
	public Date getMaker_dt_stamp() {
		return maker_dt_stamp;
	}

	public void setMaker_dt_stamp(Date maker_dt_stamp) {
		this.maker_dt_stamp = maker_dt_stamp;
	}

	@Column(name = "checker_id")
	public String getChecker_id() {
		return checker_id;
	}

	public void setChecker_id(String checker_id) {
		this.checker_id = checker_id;
	}

	@Column(name = "checker_dt_stamp")
	public Date getChecker_dt_stamp() {
		return checker_dt_stamp;
	}

	public void setChecker_dt_stamp(Date checker_dt_stamp) {
		this.checker_dt_stamp = checker_dt_stamp;
	}

	@Column(name = "cust_clg_group")
	public String getCust_clg_group() {
		return cust_clg_group;
	}

	public void setCust_clg_group(String cust_clg_group) {
		this.cust_clg_group = cust_clg_group;
	}

	@Column(name = "chk_digit_valid_reqd")
	public String getChk_digit_valid_reqd() {
		return chk_digit_valid_reqd;
	}

	public void setChk_digit_valid_reqd(String chk_digit_valid_reqd) {
		this.chk_digit_valid_reqd = chk_digit_valid_reqd;
	}

	@Column(name = "alg_id")
	public String getAlg_id() {
		return alg_id;
	}

	public void setAlg_id(String alg_id) {
		this.alg_id = alg_id;
	}

	@Column(name = "wht_pct")
	public Double getWht_pct() {
		return wht_pct;
	}

	public void setWht_pct(Double wht_pct) {
		this.wht_pct = wht_pct;
	}

	@Column(name = "rp_customer")
	public String getRp_customer() {
		return rp_customer;
	}

	public void setRp_customer(String rp_customer) {
		this.rp_customer = rp_customer;
	}

	@Column(name = "source_seq_no")
	public String getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(String source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "generate_mt920")
	public String getGenerate_mt920() {
		return generate_mt920;
	}

	public void setGenerate_mt920(String generate_mt920) {
		this.generate_mt920 = generate_mt920;
	}

	@Column(name = "private_customer")
	public String getPrivate_customer() {
		return private_customer;
	}

	public void setPrivate_customer(String private_customer) {
		this.private_customer = private_customer;
	}

	@Column(name = "kyc_details")
	public String getKyc_details() {
		return kyc_details;
	}

	public void setKyc_details(String kyc_details) {
		this.kyc_details = kyc_details;
	}

	@Column(name = "staff")
	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	@Column(name = "kyc_ref_no")
	public String getKyc_ref_no() {
		return kyc_ref_no;
	}

	public void setKyc_ref_no(String kyc_ref_no) {
		this.kyc_ref_no = kyc_ref_no;
	}

	@Column(name = "lc_collateral_pct")
	public Double getLc_collateral_pct() {
		return lc_collateral_pct;
	}

	public void setLc_collateral_pct(Double lc_collateral_pct) {
		this.lc_collateral_pct = lc_collateral_pct;
	}

	@Column(name = "auto_create_account")
	public String getAuto_create_account() {
		return auto_create_account;
	}

	public void setAuto_create_account(String auto_create_account) {
		this.auto_create_account = auto_create_account;
	}

	@Column(name = "auto_cust_ac_no")
	public String getAuto_cust_ac_no() {
		return auto_cust_ac_no;
	}

	public void setAuto_cust_ac_no(String auto_cust_ac_no) {
		this.auto_cust_ac_no = auto_cust_ac_no;
	}

	@Column(name = "track_limits")
	public String getTrack_limits() {
		return track_limits;
	}

	public void setTrack_limits(String track_limits) {
		this.track_limits = track_limits;
	}

	@Column(name = "ar_ap_tracking")
	public String getAr_ap_tracking() {
		return ar_ap_tracking;
	}

	public void setAr_ap_tracking(String ar_ap_tracking) {
		this.ar_ap_tracking = ar_ap_tracking;
	}

	@Column(name = "rm_id")
	public String getRm_id() {
		return rm_id;
	}

	public void setRm_id(String rm_id) {
		this.rm_id = rm_id;
	}

	@Column(name = "pincode")
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "autogen_stmtplan")
	public String getAutogen_stmtplan() {
		return autogen_stmtplan;
	}

	public void setAutogen_stmtplan(String autogen_stmtplan) {
		this.autogen_stmtplan = autogen_stmtplan;
	}

	@Column(name = "frequency")
	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Column(name = "stmt_day")
	public String getStmt_day() {
		return stmt_day;
	}

	public void setStmt_day(String stmt_day) {
		this.stmt_day = stmt_day;
	}

	@Column(name = "invest_cust")
	public String getInvest_cust() {
		return invest_cust;
	}

	public void setInvest_cust(String invest_cust) {
		this.invest_cust = invest_cust;
	}

	@Column(name = "allow_vrtl_accnts")
	public String getAllow_vrtl_accnts() {
		return allow_vrtl_accnts;
	}

	public void setAllow_vrtl_accnts(String allow_vrtl_accnts) {
		this.allow_vrtl_accnts = allow_vrtl_accnts;
	}

	@Column(name = "vrtl_customer_id")
	public String getVrtl_customer_id() {
		return vrtl_customer_id;
	}

	public void setVrtl_customer_id(String vrtl_customer_id) {
		this.vrtl_customer_id = vrtl_customer_id;
	}

	@Column(name = "elcm_customer")
	public String getElcm_customer() {
		return elcm_customer;
	}

	public void setElcm_customer(String elcm_customer) {
		this.elcm_customer = elcm_customer;
	}

	@Column(name = "withholding_tax")
	public String getWithholding_tax() {
		return withholding_tax;
	}

	public void setWithholding_tax(String withholding_tax) {
		this.withholding_tax = withholding_tax;
	}

	@Column(name = "taxid_no")
	public String getTaxid_no() {
		return taxid_no;
	}

	public void setTaxid_no(String taxid_no) {
		this.taxid_no = taxid_no;
	}

	@Column(name = "special_cust")
	public String getSpecial_cust() {
		return special_cust;
	}

	public void setSpecial_cust(String special_cust) {
		this.special_cust = special_cust;
	}

	@Column(name = "cif_creation_date")
	public Date getCif_creation_date() {
		return cif_creation_date;
	}

	public void setCif_creation_date(Date cif_creation_date) {
		this.cif_creation_date = cif_creation_date;
	}

	@Column(name = "mfi_customer")
	public String getMfi_customer() {
		return mfi_customer;
	}

	public void setMfi_customer(String mfi_customer) {
		this.mfi_customer = mfi_customer;
	}

	@Column(name = "joint_venture")
	public String getJoint_venture() {
		return joint_venture;
	}

	public void setJoint_venture(String joint_venture) {
		this.joint_venture = joint_venture;
	}
	

}
