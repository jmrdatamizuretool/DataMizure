package com.jmr.batch.entity.amount;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the CATM_UPLOAD_AMOUNT_BLOCKS database table.
 * 
 */
@Entity
@Table(name="TRANS_CATM_UPLOAD_AMOUNT_BLOCKS")
public class TransCatmUploadAmountBlocks implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCatmUploadAmountBlocksPK id;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACTION_CODE")
	private String actionCode;

	@Column(name="AMOUNT")
	private Double amount;

	@Column(name="AMOUNT_BLOCK_TYPE")
	private String amountBlockType;

	@Column(name="BRANCH_CODE")
	private String branchCode;


	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="ERRMSG")
	private String errmsg;

	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="FUND_AVL_CHECK")
	private String fundAvlCheck;

	@Column(name="HOLD_CODE")
	private String holdCode;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	@Column(name="REMARKS")
	private String remarks;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="UPLOAD_STATUS_FLAG")
	private String uploadStatusFlag;

	public TransCatmUploadAmountBlocks() {
	}

	public TransCatmUploadAmountBlocksPK getId() {
		return this.id;
	}

	public void setId(TransCatmUploadAmountBlocksPK id) {
		this.id = id;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAmountBlockType() {
		return this.amountBlockType;
	}

	public void setAmountBlockType(String amountBlockType) {
		this.amountBlockType = amountBlockType;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getErrmsg() {
		return this.errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFundAvlCheck() {
		return this.fundAvlCheck;
	}

	public void setFundAvlCheck(String fundAvlCheck) {
		this.fundAvlCheck = fundAvlCheck;
	}

	public String getHoldCode() {
		return this.holdCode;
	}

	public void setHoldCode(String holdCode) {
		this.holdCode = holdCode;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getUploadStatusFlag() {
		return this.uploadStatusFlag;
	}

	public void setUploadStatusFlag(String uploadStatusFlag) {
		this.uploadStatusFlag = uploadStatusFlag;
	}

}