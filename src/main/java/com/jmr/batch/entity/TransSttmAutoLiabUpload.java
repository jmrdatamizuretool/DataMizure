package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_AUTO_LIAB_UPLOAD")
public class TransSttmAutoLiabUpload {

	@Column(name = "source_code")
	private String source_code;
	@Column(name = "maintenance_seq_no")
	private String maintenance_seq_no;
	@Id
	@Column(name = "cust_no")
	private String cust_no;
	@Column(name = "liab_no")
	private String liab_no;
	@Column(name = "liab_name")
	private String liab_name;
	@Column(name = "liab_branch")
	private String liab_branch;
	@Column(name = "liab_ccy")
	private String liab_ccy;
	@Column(name = "overall_limit")
	private Double overall_limit;
	@Column(name = "revision_date")
	private Date revision_date;
	@Column(name = "category")
	private String category;
	@Column(name = "user_define_status")
	private String user_define_status;
	@Column(name = "unadvised")
	private String unadvised;
	@Column(name = "netting_required")
	private String netting_required;
	@Column(name = "overall_score")
	private Double overall_score;
	@Column(name = "fx_clean_risk_limit")
	private Double fx_clean_risk_limit;
	@Column(name = "sec_clean_risk_limit")
	private Double sec_clean_risk_limit;
	@Column(name = "sec_pstl_risk_limit")
	private Double sec_pstl_risk_limit;
	@Column(name = "user_ref_no")
	private String user_ref_no;
	public String getSource_code() {
		return source_code;
	}
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}
	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}
	public String getCust_no() {
		return cust_no;
	}
	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}
	public String getLiab_no() {
		return liab_no;
	}
	public void setLiab_no(String liab_no) {
		this.liab_no = liab_no;
	}
	public String getLiab_name() {
		return liab_name;
	}
	public void setLiab_name(String liab_name) {
		this.liab_name = liab_name;
	}
	public String getLiab_branch() {
		return liab_branch;
	}
	public void setLiab_branch(String liab_branch) {
		this.liab_branch = liab_branch;
	}
	public String getLiab_ccy() {
		return liab_ccy;
	}
	public void setLiab_ccy(String liab_ccy) {
		this.liab_ccy = liab_ccy;
	}
	public Double getOverall_limit() {
		return overall_limit;
	}
	public void setOverall_limit(Double overall_limit) {
		this.overall_limit = overall_limit;
	}
	public Date getRevision_date() {
		return revision_date;
	}
	public void setRevision_date(Date revision_date) {
		this.revision_date = revision_date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUser_define_status() {
		return user_define_status;
	}
	public void setUser_define_status(String user_define_status) {
		this.user_define_status = user_define_status;
	}
	public String getUnadvised() {
		return unadvised;
	}
	public void setUnadvised(String unadvised) {
		this.unadvised = unadvised;
	}
	public String getNetting_required() {
		return netting_required;
	}
	public void setNetting_required(String netting_required) {
		this.netting_required = netting_required;
	}
	public Double getOverall_score() {
		return overall_score;
	}
	public void setOverall_score(Double overall_score) {
		this.overall_score = overall_score;
	}
	public Double getFx_clean_risk_limit() {
		return fx_clean_risk_limit;
	}
	public void setFx_clean_risk_limit(Double fx_clean_risk_limit) {
		this.fx_clean_risk_limit = fx_clean_risk_limit;
	}
	public Double getSec_clean_risk_limit() {
		return sec_clean_risk_limit;
	}
	public void setSec_clean_risk_limit(Double sec_clean_risk_limit) {
		this.sec_clean_risk_limit = sec_clean_risk_limit;
	}
	public Double getSec_pstl_risk_limit() {
		return sec_pstl_risk_limit;
	}
	public void setSec_pstl_risk_limit(Double sec_pstl_risk_limit) {
		this.sec_pstl_risk_limit = sec_pstl_risk_limit;
	}
	public String getUser_ref_no() {
		return user_ref_no;
	}
	public void setUser_ref_no(String user_ref_no) {
		this.user_ref_no = user_ref_no;
	}

}