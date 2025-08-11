package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the ISTM_UPLOAD_INSTRUMENT_MASTER database table.
 * 
 */
@Entity
@Table(name="TRANS_ISTM_UPLOAD_INSTRUMENT_MASTER")
public class TransIstmUploadInstrumentMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransIstmUploadInstrumentMasterPK id;

	@Column(name="ACCOUNT")
	private String account;

	@Column(name="ACCOUNT_BRANCH")
	private String accountBranch;

	@Column(name="CCY")
	private String ccy;
	@Column(name="ERRMSG")
	private String errmsg;

	@Column(name="LPAD_REQD")
	private String lpadReqd;

	@Column(name="NO_OF_LEAVES")
	private Double noOfLeaves;

	@Column(name="UPLOAD_STATUS_FLAG")
	private String uploadStatusFlag;
	
	
	
	public TransIstmUploadInstrumentMaster() {
	}

	public TransIstmUploadInstrumentMasterPK getId() {
		return this.id;
	}

	public void setId(TransIstmUploadInstrumentMasterPK id) {
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

	public String getLpadReqd() {
		return this.lpadReqd;
	}

	public void setLpadReqd(String lpadReqd) {
		this.lpadReqd = lpadReqd;
	}

	public Double getNoOfLeaves() {
		return this.noOfLeaves;
	}

	public void setNoOfLeaves(Double noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public String getUploadStatusFlag() {
		return this.uploadStatusFlag;
	}

	public void setUploadStatusFlag(String uploadStatusFlag) {
		this.uploadStatusFlag = uploadStatusFlag;
	}

	

}