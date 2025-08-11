package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTB_UPLOAD_CUST_LINKAGES")
public class TransSttbUploadCustLinkages {
	@Column(name = "maintenance_seq_no")
	private String maintenance_seq_no;
	@Column(name = "source_code")
	private String source_code;
	@Column(name = "branch_code")
	private String branch_code;
	@Id
	@Column(name = "cust_ac_no")
	private String cust_ac_no;
	@Column(name = "customer_no")
	private String customer_no;
	@Column(name = "linkage_type")
	private String linkage_type;
	@Column(name = "linked_ref_no")
	private String linked_ref_no;
	@Column(name = "linkage_percentage")
	private Double linkage_percentage;
	@Column(name = "linkage_seq_no")
	private Double linkage_seq_no;
	@Column(name = "linkage_branch")
	private String linkage_branch;
	@Column(name = "linked_ccy")
	private String linked_ccy;
	@Column(name = "source_seq_no")
	private Double source_seq_no;
	@Column(name = "effective_date")
	private Date effective_date;
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}
	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}
	public String getSource_code() {
		return source_code;
	}
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getCust_ac_no() {
		return cust_ac_no;
	}
	public void setCust_ac_no(String cust_ac_no) {
		this.cust_ac_no = cust_ac_no;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getLinkage_type() {
		return linkage_type;
	}
	public void setLinkage_type(String linkage_type) {
		this.linkage_type = linkage_type;
	}
	public String getLinked_ref_no() {
		return linked_ref_no;
	}
	public void setLinked_ref_no(String linked_ref_no) {
		this.linked_ref_no = linked_ref_no;
	}
	public Double getLinkage_percentage() {
		return linkage_percentage;
	}
	public void setLinkage_percentage(Double linkage_percentage) {
		this.linkage_percentage = linkage_percentage;
	}
	public Double getLinkage_seq_no() {
		return linkage_seq_no;
	}
	public void setLinkage_seq_no(Double linkage_seq_no) {
		this.linkage_seq_no = linkage_seq_no;
	}
	public String getLinkage_branch() {
		return linkage_branch;
	}
	public void setLinkage_branch(String linkage_branch) {
		this.linkage_branch = linkage_branch;
	}
	public String getLinked_ccy() {
		return linked_ccy;
	}
	public void setLinked_ccy(String linked_ccy) {
		this.linked_ccy = linked_ccy;
	}
	public Double getSource_seq_no() {
		return source_seq_no;
	}
	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}
	public Date getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}
	
	
}
