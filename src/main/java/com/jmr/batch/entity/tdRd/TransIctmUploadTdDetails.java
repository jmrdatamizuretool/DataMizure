package com.jmr.batch.entity.tdRd;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_ICTM_UPLOAD_TD_DETAILS")
public class TransIctmUploadTdDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransIctmUploadTdDetailsPK id;

	// private String maintenance_seq_no;
	// private String source_code;
	// private String brn;
	// private String acc;
	// private String ccy;
	@Column(name = "PAYIN_OPTION")
	private String payin_option;

	@Column(name = "TD_AMOUNT")
	private String td_amount;

	@Column(name = "OFFSET_BRN")
	private String offset_brn;

	@Column(name = "TD_OFFSET_ACC")
	private String td_offset_acc;

	@Column(name = "REFERENCE_NO")
	private String reference_no;

	// @Column(name = "SOURCE_SEQ_NO")
	// private String source_seq_no;

	// @Column(name = "BRANCH_CODE")
	// private String branch_code;

	@Column(name = "REDEM_AMT")
	private String redem_amt;

	@Column(name = "LIQ_AMT")
	private String liq_amt;

	@Column(name = "STOCK_CATLOG_CD")
	private String stock_catlog_cd;

	@Column(name = "CERTIFICATE_NO")
	private String certificate_no;

	@Column(name = "DUPLICATE_ISSUE")
	private String duplicate_issue;

	@Column(name = "TARGET_AMOUNT")
	private String target_amount;

	public TransIctmUploadTdDetails() {

	}

	public TransIctmUploadTdDetailsPK getId() {
		return id;
	}

	public void setId(TransIctmUploadTdDetailsPK id) {
		this.id = id;
	}

	public String getPayin_option() {
		return payin_option;
	}

	public void setPayin_option(String payin_option) {
		this.payin_option = payin_option;
	}

	public String getTd_amount() {
		return td_amount;
	}

	public void setTd_amount(String td_amount) {
		this.td_amount = td_amount;
	}

	public String getOffset_brn() {
		return offset_brn;
	}

	public void setOffset_brn(String offset_brn) {
		this.offset_brn = offset_brn;
	}

	public String getTd_offset_acc() {
		return td_offset_acc;
	}

	public void setTd_offset_acc(String td_offset_acc) {
		this.td_offset_acc = td_offset_acc;
	}

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public String getRedem_amt() {
		return redem_amt;
	}

	public void setRedem_amt(String redem_amt) {
		this.redem_amt = redem_amt;
	}

	public String getLiq_amt() {
		return liq_amt;
	}

	public void setLiq_amt(String liq_amt) {
		this.liq_amt = liq_amt;
	}

	public String getStock_catlog_cd() {
		return stock_catlog_cd;
	}

	public void setStock_catlog_cd(String stock_catlog_cd) {
		this.stock_catlog_cd = stock_catlog_cd;
	}

	public String getCertificate_no() {
		return certificate_no;
	}

	public void setCertificate_no(String certificate_no) {
		this.certificate_no = certificate_no;
	}

	public String getDuplicate_issue() {
		return duplicate_issue;
	}

	public void setDuplicate_issue(String duplicate_issue) {
		this.duplicate_issue = duplicate_issue;
	}

	public String getTarget_amount() {
		return target_amount;
	}

	public void setTarget_amount(String target_amount) {
		this.target_amount = target_amount;
	}

}
