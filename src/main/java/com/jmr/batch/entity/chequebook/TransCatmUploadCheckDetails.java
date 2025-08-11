package com.jmr.batch.entity.chequebook;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_CATM_UPLOAD_CHECK_DETAILS")
public class TransCatmUploadCheckDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private TransCatmUploadCheckDetailsPK id;
	private String source_code;
	private String remarks;
	private String errmsg;
	private String check_book_no;
	private String beneficiary;
	private String status;
	private String upload_status_flag;
	private Double amount;
	private Date presentation_date;
	private Date value_date;

	public TransCatmUploadCheckDetails() {
	}

	public TransCatmUploadCheckDetailsPK getId() {
		return this.id;
	}

	public void setId(TransCatmUploadCheckDetailsPK id) {
		this.id = id;
	}

	@Column(name = "SOURCE_CODE")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;

	}

	@Column(name = "REMARKS")
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "ERRMSG")
	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;

	}

	@Column(name = "CHECK_BOOK_NO")

	public String getCheck_book_no() {
		return check_book_no;
	}

	public void setCheck_book_no(String check_book_no) {
		this.check_book_no = check_book_no;
	}

	@Column(name = "BENEFICIARY")
	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	@Column(name = "STATUS")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "UPLOAD_STATUS_FLAG")
	public String getUpload_status_flag() {
		return upload_status_flag;
	}

	public void setUpload_status_flag(String upload_status_flag) {
		this.upload_status_flag = upload_status_flag;
	}

	@Column(name = "AMOUNT")
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "Presentation_date")
	public Date getPresentation_date() {
		return presentation_date;
	}

	public void setPresentation_date(Date presentation_date) {
		this.presentation_date = presentation_date;
	}

	@Column(name = "Value")
	public Date getValue_date() {
		return value_date;
	}

	public void setValue_date(Date value_date) {
		this.value_date = value_date;
	}

}
