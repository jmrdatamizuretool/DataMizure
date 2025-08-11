package com.jmr.batch.model.checkbook;

public class TransCatmUploadCheckDetailsModel {
	private String source_code;
	private String branch;
	private String account;
	private String check_book_no;
	private String check_no;
	private String mod_no;
	private String status;
	private String amount;
	private String beneficiary;
	private String presentation_date;
	private String value_date;
	private String remarks;
	private String upload_status_flag;
	private String errmsg;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCheck_book_no() {
		return check_book_no;
	}

	public void setCheck_book_no(String check_book_no) {
		this.check_book_no = check_book_no;
	}

	public String getCheck_no() {
		return check_no;
	}

	public void setCheck_no(String check_no) {
		this.check_no = check_no;
	}

	public String getMod_no() {
		return mod_no;
	}

	public void setMod_no(String mod_no) {
		this.mod_no = mod_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getPresentation_date() {
		return presentation_date;
	}

	public void setPresentation_date(String presentation_date) {
		this.presentation_date = presentation_date;
	}

	public String getValue_date() {
		return value_date;
	}

	public void setValue_date(String value_date) {
		this.value_date = value_date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpload_status_flag() {
		return upload_status_flag;
	}

	public void setUpload_status_flag(String upload_status_flag) {
		this.upload_status_flag = upload_status_flag;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
