package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_UPLOAD_CUST_CORPORATE")
public class TransSttmUploadCustCorporate {
	@Id
	private String customer_no;
	
	private String corporate_name;

	private String c_national_id;

	private String r_address1;

	private String r_address2;

	private String r_address3;

	private Date incorp_date;

	private Double capital;

	private Double networth;

	private String business_description;

	private String incorp_country;

	private String r_country;

	private String amounts_ccy;

	private String conversion_status_flag;

	private String err_msg;

	private String maintenance_seq_no;

	private Double source_seq_no;

	private String branch_code;

	private String source_code;

	private String r_address4;

	private String r_pincode;

	private Date pref_contact_dt;

	private Double pref_contact_time;

	private String ownership_type;

	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "corporate_name")
	public String getCorporate_name() {
		return corporate_name;
	}

	public void setCorporate_name(String corporate_name) {
		this.corporate_name = corporate_name;
	}

	@Column(name = "c_national_id")
	public String getC_national_id() {
		return c_national_id;
	}

	public void setC_national_id(String c_national_id) {
		this.c_national_id = c_national_id;
	}

	@Column(name = "r_address1")
	public String getR_address1() {
		return r_address1;
	}

	public void setR_address1(String r_address1) {
		this.r_address1 = r_address1;
	}

	@Column(name = "r_address2")
	public String getR_address2() {
		return r_address2;
	}

	public void setR_address2(String r_address2) {
		this.r_address2 = r_address2;
	}

	@Column(name = "r_address3")
	public String getR_address3() {
		return r_address3;
	}
	
	public void setR_address3(String r_address3) {
		this.r_address3 = r_address3;
	}

	@Column(name = "incorp_date")
	public Date getIncorp_date() {
		return incorp_date;
	}

	public void setIncorp_date(Date incorp_date) {
		this.incorp_date = incorp_date;
	}

	@Column(name = "capital")
	public Double getCapital() {
		return capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	@Column(name = "networth")
	public Double getNetworth() {
		return networth;
	}

	public void setNetworth(Double networth) {
		this.networth = networth;
	}

	@Column(name = "business_description")
	public String getBusiness_description() {
		return business_description;
	}

	public void setBusiness_description(String business_description) {
		this.business_description = business_description;
	}

	@Column(name = "incorp_country")
	public String getIncorp_country() {
		return incorp_country;
	}

	public void setIncorp_country(String incorp_country) {
		this.incorp_country = incorp_country;
	}

	@Column(name = "r_country")
	public String getR_country() {
		return r_country;
	}

	public void setR_country(String r_country) {
		this.r_country = r_country;
	}

	@Column(name = "amounts_ccy")
	public String getAmounts_ccy() {
		return amounts_ccy;
	}

	public void setAmounts_ccy(String amounts_ccy) {
		this.amounts_ccy = amounts_ccy;
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

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "r_address4")
	public String getR_address4() {
		return r_address4;
	}

	public void setR_address4(String r_address4) {
		this.r_address4 = r_address4;
	}

	@Column(name = "r_pincode")
	public String getR_pincode() {
		return r_pincode;
	}

	public void setR_pincode(String r_pincode) {
		this.r_pincode = r_pincode;
	}

	@Column(name = "pref_contact_dt")
	public Date getPref_contact_dt() {
		return pref_contact_dt;
	}

	public void setPref_contact_dt(Date pref_contact_dt) {
		this.pref_contact_dt = pref_contact_dt;
	}

	@Column(name = "pref_contact_time")
	public Double getPref_contact_time() {
		return pref_contact_time;
	}

	public void setPref_contact_time(Double pref_contact_time) {
		this.pref_contact_time = pref_contact_time;
	}

	@Column(name = "ownership_type")
	public String getOwnership_type() {
		return ownership_type;
	}

	public void setOwnership_type(String ownership_type) {
		this.ownership_type = ownership_type;
	}

	public TransSttmUploadCustCorporate() {
		super();
	}

	public TransSttmUploadCustCorporate(String customer_no, String corporate_name, String c_national_id,
			String r_address1, String r_address2, String r_address3, Date incorp_date, Double capital, Double networth,
			String business_description, String incorp_country, String r_country, String amounts_ccy,
			String conversion_status_flag, String err_msg, String maintenance_seq_no, Double source_seq_no,
			String branch_code, String source_code, String r_address4, String r_pincode, Date pref_contact_dt,
			Double pref_contact_time, String ownership_type) {
		super();
		this.customer_no = customer_no;
		this.corporate_name = corporate_name;
		this.c_national_id = c_national_id;
		this.r_address1 = r_address1;
		this.r_address2 = r_address2;
		this.r_address3 = r_address3;
		this.incorp_date = incorp_date;
		this.capital = capital;
		this.networth = networth;
		this.business_description = business_description;
		this.incorp_country = incorp_country;
		this.r_country = r_country;
		this.amounts_ccy = amounts_ccy;
		this.conversion_status_flag = conversion_status_flag;
		this.err_msg = err_msg;
		this.maintenance_seq_no = maintenance_seq_no;
		this.source_seq_no = source_seq_no;
		this.branch_code = branch_code;
		this.source_code = source_code;
		this.r_address4 = r_address4;
		this.r_pincode = r_pincode;
		this.pref_contact_dt = pref_contact_dt;
		this.pref_contact_time = pref_contact_time;
		this.ownership_type = ownership_type;
	}
}
