package com.jmr.batch.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_UPLOAD_DOC_CHKLST")
public class TransSttmUploadDocChklst{
	
	private String customer_no;
	
	private String maintenance_seq_no;
	
	private String document_type;
	
	private String checked;
	@Id
	private String document_ref_no;
	
	private Date request_date;
	
	private Date exp_sub_date;
	
	private Date actual_sub_date;
	
	private Date valid_till;
	
	private String doc_category;
	
	private String remarks;
	
	private String document_name;
	
	private String branch_code;
	
	private String source_code;

	private Double source_seq_no;

	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "document_type")
	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	@Column(name = "checked")
	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	@Column(name = "document_ref_no")
	public String getDocument_ref_no() {
		return document_ref_no;
	}

	public void setDocument_ref_no(String document_ref_no) {
		this.document_ref_no = document_ref_no;
	}

	@Column(name = "request_date")
	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}

	@Column(name = "exp_sub_date")
	public Date getExp_sub_date() {
		return exp_sub_date;
	}

	public void setExp_sub_date(Date exp_sub_date) {
		this.exp_sub_date = exp_sub_date;
	}

	@Column(name = "actual_sub_date")
	public Date getActual_sub_date() {
		return actual_sub_date;
	}

	public void setActual_sub_date(Date actual_sub_date) {
		this.actual_sub_date = actual_sub_date;
	}

	@Column(name = "valid_till")
	public Date getValid_till() {
		return valid_till;
	}

	public void setValid_till(Date valid_till) {
		this.valid_till = valid_till;
	}

	@Column(name = "doc_category")
	public String getDoc_category() {
		return doc_category;
	}

	public void setDoc_category(String doc_category) {
		this.doc_category = doc_category;
	}

	@Column(name = "remarks")
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "document_name")
	public String getDocument_name() {
		return document_name;
	}

	public void setDocument_name(String document_name) {
		this.document_name = document_name;
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

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}
	public TransSttmUploadDocChklst() {
		super();
	}

	public TransSttmUploadDocChklst(String customer_no, String maintenance_seq_no, String document_type,
			String checked, String document_ref_no, Date request_date, Date exp_sub_date, Date actual_sub_date,
			Date valid_till, String doc_category, String remarks, String document_name, String branch_code,
			String source_code, Double source_seq_no) {
		super();
		this.customer_no = customer_no;
		this.maintenance_seq_no = maintenance_seq_no;
		this.document_type = document_type;
		this.checked = checked;
		this.document_ref_no = document_ref_no;
		this.request_date = request_date;
		this.exp_sub_date = exp_sub_date;
		this.actual_sub_date = actual_sub_date;
		this.valid_till = valid_till;
		this.doc_category = doc_category;
		this.remarks = remarks;
		this.document_name = document_name;
		this.branch_code = branch_code;
		this.source_code = source_code;
		this.source_seq_no = source_seq_no;
	}
	
}
