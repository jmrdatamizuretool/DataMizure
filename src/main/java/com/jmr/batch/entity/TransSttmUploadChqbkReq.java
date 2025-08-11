package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TRANS_STTM_UPLOAD_CHQBK_REQ")
public class TransSttmUploadChqbkReq {
	@Id
	private String maintenance_seq_no;
	private String source_code;
	private String chq_type;
	private String request_status;
	private String branch;
	private String account;
	private String first_check_no;
	private String order_details;
	private String cheque_book_type;
	private String language_code;
	private Double check_leaves;
	private Double source_seq_no;
	private Date order_date;

	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	@Column(name = "maintenance_seq_no")
	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	public String getSource_code() {
		return source_code;
	}

	@Column(name = "source_code")
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public String getChq_type() {
		return chq_type;
	}

	@Column(name = "chq_type")
	public void setChq_type(String chq_type) {
		this.chq_type = chq_type;
	}

	public String getRequest_status() {
		return request_status;
	}

	@Column(name = "request_status")
	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}

	public String getBranch() {
		return branch;
	}

	@Column(name = "branch")
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccount() {
		return account;
	}

	@Column(name = "account")
	public void setAccount(String account) {
		this.account = account;
	}

	public String getFirst_check_no() {
		return first_check_no;
	}

	@Column(name = "first_check_no")
	public void setFirst_check_no(String first_check_no) {
		this.first_check_no = first_check_no;
	}

	public String getOrder_details() {
		return order_details;
	}

	@Column(name = "order_details")
	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

	public String getCheque_book_type() {
		return cheque_book_type;
	}

	@Column(name = "cheque_book_type")
	public void setCheque_book_type(String cheque_book_type) {
		this.cheque_book_type = cheque_book_type;
	}

	public String getLanguage_code() {
		return language_code;
	}

	@Column(name = "language_code")
	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	public Double getCheck_leaves() {
		return check_leaves;
	}

	@Column(name = "check_leaves")
	public void setCheck_leaves(Double check_leaves) {
		this.check_leaves = check_leaves;
	}

	public Double getSource_seq_no() {
		return source_seq_no;
	}

	@Column(name = "source_seq_no")
	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	@Column(name = "order_date")
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
}
