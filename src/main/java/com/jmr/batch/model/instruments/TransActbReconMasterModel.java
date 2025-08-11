package com.jmr.batch.model.instruments;

public class TransActbReconMasterModel {
	private String branch;
	private String account;
	private String ccy;
	private String reconno;
	private String ref_no;
	private String event_seq_no;
	private String amount;
	private String amount_to_recon;
	private String entrydate;
	private String status;

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

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getReconno() {
		return reconno;
	}

	public void setReconno(String reconno) {
		this.reconno = reconno;
	}

	public String getRef_no() {
		return ref_no;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

	public String getEvent_seq_no() {
		return event_seq_no;
	}

	public void setEvent_seq_no(String event_seq_no) {
		this.event_seq_no = event_seq_no;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmount_to_recon() {
		return amount_to_recon;
	}

	public void setAmount_to_recon(String amount_to_recon) {
		this.amount_to_recon = amount_to_recon;
	}

	public String getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
