package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the LDTB_UPLOAD_LINKAGES database table.
 * 
 */
@Entity
@Table(name = "TRANS_LDTB_UPLOAD_LINKAGES")
public class TransLdtbUploadLinkages implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransLdtbUploadLinkagesPK transLdtbUploadLinkagesPK;
	
	@Column(name = "LINKED_TO_REF")
    private String linkedToRef;

    @Column(name = "LINKED_TO_BRANCH")
    private String linkedToBranch;

    @Column(name = "LINKAGE_TYPE")
    private String linkageType;

    @Column(name = "LINKED_TO_CURRENCY")
    private String linkedToCurrency;

    @Column(name = "LINKAGE_VALID")
    private String linkageValid = "Y";

    @Column(name = "LINKED_AMOUNT")
    private Long linkedAmount;

    @Column(name = "CONVERTED_LINKED_AMOUNT")
    private Long convertedLinkedAmount;

    @Column(name = "EXCHANGE_RATE")
    private Long exchangeRate;

    @Column(name = "LOAN_CURRENCY")
    private String loanCurrency;

    @Column(name = "SOURCE_REF")
    private String sourceRef;

    @Column(name = "FUNCTION_ID")
    private String functionId;

    @Column(name = "ACTION_CODE")
    private String actionCode;

    @Column(name = "UPLOAD_ID")
    private String uploadId;

	public TransLdtbUploadLinkagesPK getTransLdtbUploadLinkagesPK() {
		return transLdtbUploadLinkagesPK;
	}

	public void setTransLdtbUploadLinkagesPK(TransLdtbUploadLinkagesPK transLdtbUploadLinkagesPK) {
		this.transLdtbUploadLinkagesPK = transLdtbUploadLinkagesPK;
	}

	public String getLinkedToRef() {
		return linkedToRef;
	}

	public void setLinkedToRef(String linkedToRef) {
		this.linkedToRef = linkedToRef;
	}

	public String getLinkedToBranch() {
		return linkedToBranch;
	}

	public void setLinkedToBranch(String linkedToBranch) {
		this.linkedToBranch = linkedToBranch;
	}

	public String getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(String linkageType) {
		this.linkageType = linkageType;
	}

	public String getLinkedToCurrency() {
		return linkedToCurrency;
	}

	public void setLinkedToCurrency(String linkedToCurrency) {
		this.linkedToCurrency = linkedToCurrency;
	}

	public String getLinkageValid() {
		return linkageValid;
	}

	public void setLinkageValid(String linkageValid) {
		this.linkageValid = linkageValid;
	}

	public Long getLinkedAmount() {
		return linkedAmount;
	}

	public void setLinkedAmount(Long linkedAmount) {
		this.linkedAmount = linkedAmount;
	}

	public Long getConvertedLinkedAmount() {
		return convertedLinkedAmount;
	}

	public void setConvertedLinkedAmount(Long convertedLinkedAmount) {
		this.convertedLinkedAmount = convertedLinkedAmount;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getLoanCurrency() {
		return loanCurrency;
	}

	public void setLoanCurrency(String loanCurrency) {
		this.loanCurrency = loanCurrency;
	}

	public String getSourceRef() {
		return sourceRef;
	}

	public void setSourceRef(String sourceRef) {
		this.sourceRef = sourceRef;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getUploadId() {
		return uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
    
    

}
