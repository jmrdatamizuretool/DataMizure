package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRANS_CLTB_ACC_COLLLNKDTL_UPD database table.
 * 
 */
@Entity
@Table(name="TRANS_CLTB_ACC_COLLLNKDTL_UPD")
@NamedQuery(name="TransCltbAccColllnkdtlUpd.findAll", query="SELECT c FROM TransCltbAccColllnkdtlUpd c")
public class TransCltbAccColllnkdtlUpd implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCltbAccColllnkdtlUpdPK id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="COLLATERAL_CATEGORY")
	private BigDecimal collateralCategory;

	@Column(name="COMMITMENT_PRODUCT")
	private String commitmentProduct;

	private String description;

	private BigDecimal haircut;

	@Column(name="LIMIT_AMOUNT")
	private BigDecimal limitAmount;

	@Column(name="LINKAGE_BRANCH")
	private String linkageBranch;

	@Column(name="LINKAGE_CURRENCY")
	private String linkageCurrency;

	@Column(name="LINKED_AMOUNT")
	private BigDecimal linkedAmount;

	@Column(name="LINKED_PERCENT_NUMBER")
	private BigDecimal linkedPercentNumber;

	@Column(name="OVERALL_AMOUNT")
	private BigDecimal overallAmount;

	@Column(name="REINSTATE_ORDER")
	private BigDecimal reinstateOrder;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="TAKEN_OVER")
	private String takenOver;

	@Column(name="UTIL_AMOUNT")
	private BigDecimal utilAmount;

	@Column(name="UTIL_ORDER")
	private BigDecimal utilOrder;

	public TransCltbAccColllnkdtlUpd() {
	}

	public TransCltbAccColllnkdtlUpdPK getId() {
		return this.id;
	}

	public void setId(TransCltbAccColllnkdtlUpdPK id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getCollateralCategory() {
		return this.collateralCategory;
	}

	public void setCollateralCategory(BigDecimal collateralCategory) {
		this.collateralCategory = collateralCategory;
	}

	public String getCommitmentProduct() {
		return this.commitmentProduct;
	}

	public void setCommitmentProduct(String commitmentProduct) {
		this.commitmentProduct = commitmentProduct;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getHaircut() {
		return this.haircut;
	}

	public void setHaircut(BigDecimal haircut) {
		this.haircut = haircut;
	}

	public BigDecimal getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getLinkageBranch() {
		return this.linkageBranch;
	}

	public void setLinkageBranch(String linkageBranch) {
		this.linkageBranch = linkageBranch;
	}

	public String getLinkageCurrency() {
		return this.linkageCurrency;
	}

	public void setLinkageCurrency(String linkageCurrency) {
		this.linkageCurrency = linkageCurrency;
	}

	public BigDecimal getLinkedAmount() {
		return this.linkedAmount;
	}

	public void setLinkedAmount(BigDecimal linkedAmount) {
		this.linkedAmount = linkedAmount;
	}

	public BigDecimal getLinkedPercentNumber() {
		return this.linkedPercentNumber;
	}

	public void setLinkedPercentNumber(BigDecimal linkedPercentNumber) {
		this.linkedPercentNumber = linkedPercentNumber;
	}

	public BigDecimal getOverallAmount() {
		return this.overallAmount;
	}

	public void setOverallAmount(BigDecimal overallAmount) {
		this.overallAmount = overallAmount;
	}

	public BigDecimal getReinstateOrder() {
		return this.reinstateOrder;
	}

	public void setReinstateOrder(BigDecimal reinstateOrder) {
		this.reinstateOrder = reinstateOrder;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getTakenOver() {
		return this.takenOver;
	}

	public void setTakenOver(String takenOver) {
		this.takenOver = takenOver;
	}

	public BigDecimal getUtilAmount() {
		return this.utilAmount;
	}

	public void setUtilAmount(BigDecimal utilAmount) {
		this.utilAmount = utilAmount;
	}

	public BigDecimal getUtilOrder() {
		return this.utilOrder;
	}

	public void setUtilOrder(BigDecimal utilOrder) {
		this.utilOrder = utilOrder;
	}

}