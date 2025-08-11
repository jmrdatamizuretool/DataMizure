package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the ISTM_UPLOAD_INSTRUMENT_DETAIL database table.
 * 
 */
@Entity
@Table(name="TRANS_ISTM_UPLOAD_INSTRUMENT_DETAIL")
public class TransIstmUploadInstrumentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransIstmUploadInstrumentDetailPK id;

	@Column(name="ACCOUNT")
	private String account;

	@Column(name="ACCOUNT_BRANCH")
	private String accountBranch;
	
	@Column(name="AMOUNT")
	private Double amount;
	
	@Column(name="BENEFICIARY")
	private String beneficiary;
	@Column(name="CCY")
	private String ccy;
	
	@Column(name="ERRMSG")
	private String errmsg;


	@Column(name="GENERATION_DATE")
	private Date generationDate;
	
	@Column(name="STATUS")
	private String status;

	@Column(name="UPLOAD_STATUS_FLAG")
	private String uploadStatusFlag;


	@Column(name="VALUE_DATE")
	private Date valueDate;



	public TransIstmUploadInstrumentDetail() {
	}

	public TransIstmUploadInstrumentDetailPK getId() {
		return this.id;
	}

	public void setId(TransIstmUploadInstrumentDetailPK id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountBranch() {
		return this.accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBeneficiary() {
		return this.beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getErrmsg() {
		return this.errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public Date getGenerationDate() {
		return this.generationDate;
	}

	public void setGenerationDate(Date generationDate) {
		this.generationDate = generationDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUploadStatusFlag() {
		return this.uploadStatusFlag;
	}

	public void setUploadStatusFlag(String uploadStatusFlag) {
		this.uploadStatusFlag = uploadStatusFlag;
	}

	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	


}