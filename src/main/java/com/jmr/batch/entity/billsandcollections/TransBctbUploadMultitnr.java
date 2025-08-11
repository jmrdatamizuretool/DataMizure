package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the BCTB_UPLOAD_MULTITNR database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_MULTITNR")
public class TransBctbUploadMultitnr implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadMultitnrPK transBctbUploadMultitnrPK;
	
	@Column(name = "BCREFNO")
    private String bcrefno;

    @Column(name = "EVENT_SEQ_NO")
    private Long eventSeqNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "BASE_DATE")
    private Date baseDate;

    @Column(name = "BASE_DATE_CODE")
    private String baseDateCode;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALUE_DATE")
    private Date valueDate;

    @Column(name = "TENOR")
    private Long tenor;

    @Column(name = "TRANSIT_DAYS")
    private Long transitDays;

    @Temporal(TemporalType.DATE)
    @Column(name = "MATURITY_DATE")
    private Date maturityDate;

    @Column(name = "SPLIT_PERCENT")
    private Long splitPercent;

    @Column(name = "BILL_AMOUNT")
    private Long billAmount;

    @Column(name = "DISCOUNT_AMOUNT")
    private Long discountAmount;

    @Column(name = "REBATE_AMOUNT")
    private Long rebateAmount;

    @Column(name = "EXCHANGE_RATE")
    private Long exchangeRate;

    @Column(name = "DISCOUNTED_AMOUNT")
    private Long discountedAmount;

    @Column(name = "LIQUIDATION_AMOUNT")
    private Long liquidationAmount;

    @Column(name = "LIQUIDATED_AMOUNT")
    private Long liquidatedAmount;

    @Column(name = "INTEREST_AMOUNT")
    private Long interestAmount;

    @Temporal(TemporalType.DATE)
    @Column(name = "FROM_CALCULATION_DATE")
    private Date fromCalculationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TO_CALCULATION_DATE")
    private Date toCalculationDate;

    @Column(name = "USER_DEFINED_STATUS")
    private String userDefinedStatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "STATUS_AS_OF_DATE")
    private Date statusAsOfDate;

    @Column(name = "UNDER_PROTEST")
    private String underProtest;

    @Temporal(TemporalType.DATE)
    @Column(name = "PROTEST_DATE")
    private Date protestDate;

	public TransBctbUploadMultitnrPK getTransBctbUploadMultitnrPK() {
		return transBctbUploadMultitnrPK;
	}

	public void setTransBctbUploadMultitnrPK(TransBctbUploadMultitnrPK transBctbUploadMultitnrPK) {
		this.transBctbUploadMultitnrPK = transBctbUploadMultitnrPK;
	}

	public String getBcrefno() {
		return bcrefno;
	}

	public void setBcrefno(String bcrefno) {
		this.bcrefno = bcrefno;
	}

	public Long getEventSeqNo() {
		return eventSeqNo;
	}

	public void setEventSeqNo(Long eventSeqNo) {
		this.eventSeqNo = eventSeqNo;
	}

	public Date getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}

	public String getBaseDateCode() {
		return baseDateCode;
	}

	public void setBaseDateCode(String baseDateCode) {
		this.baseDateCode = baseDateCode;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Long getTenor() {
		return tenor;
	}

	public void setTenor(Long tenor) {
		this.tenor = tenor;
	}

	public Long getTransitDays() {
		return transitDays;
	}

	public void setTransitDays(Long transitDays) {
		this.transitDays = transitDays;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Long getSplitPercent() {
		return splitPercent;
	}

	public void setSplitPercent(Long splitPercent) {
		this.splitPercent = splitPercent;
	}

	public Long getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Long getRebateAmount() {
		return rebateAmount;
	}

	public void setRebateAmount(Long rebateAmount) {
		this.rebateAmount = rebateAmount;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Long getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(Long discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public Long getLiquidationAmount() {
		return liquidationAmount;
	}

	public void setLiquidationAmount(Long liquidationAmount) {
		this.liquidationAmount = liquidationAmount;
	}

	public Long getLiquidatedAmount() {
		return liquidatedAmount;
	}

	public void setLiquidatedAmount(Long liquidatedAmount) {
		this.liquidatedAmount = liquidatedAmount;
	}

	public Long getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Long interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Date getFromCalculationDate() {
		return fromCalculationDate;
	}

	public void setFromCalculationDate(Date fromCalculationDate) {
		this.fromCalculationDate = fromCalculationDate;
	}

	public Date getToCalculationDate() {
		return toCalculationDate;
	}

	public void setToCalculationDate(Date toCalculationDate) {
		this.toCalculationDate = toCalculationDate;
	}

	public String getUserDefinedStatus() {
		return userDefinedStatus;
	}

	public void setUserDefinedStatus(String userDefinedStatus) {
		this.userDefinedStatus = userDefinedStatus;
	}

	public Date getStatusAsOfDate() {
		return statusAsOfDate;
	}

	public void setStatusAsOfDate(Date statusAsOfDate) {
		this.statusAsOfDate = statusAsOfDate;
	}

	public String getUnderProtest() {
		return underProtest;
	}

	public void setUnderProtest(String underProtest) {
		this.underProtest = underProtest;
	}

	public Date getProtestDate() {
		return protestDate;
	}

	public void setProtestDate(Date protestDate) {
		this.protestDate = protestDate;
	}
    
    

}
