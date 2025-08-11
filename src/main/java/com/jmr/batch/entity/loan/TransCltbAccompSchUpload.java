package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRANS_CLTB_ACCOMP_SCH_UPLOAD database table.
 * 
 */
@Entity
@Table(name="TRANS_CLTB_ACCOMP_SCH_UPLOAD")
@NamedQuery(name="TransCltbAccompSchUpload.findAll", query="SELECT c FROM TransCltbAccompSchUpload c")
public class TransCltbAccompSchUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCltbAccompSchUploadPK id;

	private BigDecimal amount;

	@Column(name="BEN_ACCOUNT")
	private String benAccount;

	@Column(name="BEN_BANK")
	private String benBank;

	@Column(name="BEN_NAME")
	private String benName;

	private String capitalized;

	@Column(name="COMPOUND_DAYS")
	private BigDecimal compoundDays;

	@Column(name="COMPOUND_MONTHS")
	private BigDecimal compoundMonths;

	@Column(name="COMPOUND_YEARS")
	private BigDecimal compoundYears;

	@Column(name="DAYS_MTH")
	private String daysMth;

	@Column(name="DAYS_YEAR")
	private String daysYear;

	@Column(name="DUE_DATES_ON")
	private BigDecimal dueDatesOn;

	@Column(name="EMI_AMOUNT")
	private BigDecimal emiAmount;

	@Column(name="FORMULA_NAME")
	private String formulaName;

	private BigDecimal frequency;

	@Column(name="NO_OF_SCHEDULES")
	private BigDecimal noOfSchedules;

	@Column(name="PAYMENT_DETAILS")
	private String paymentDetails;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="PMNT_PROD_AC")
	private String pmntProdAc;

	@Temporal(TemporalType.DATE)
	@Column(name="SCH_END_DATE")
	private Date schEndDate;

	@Column(name="SCHEDULE_FLAG")
	private String scheduleFlag;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	private String unit;

	@Column(name="WAIVER_FLAG")
	private String waiverFlag;

	public TransCltbAccompSchUpload() {
	}

	public TransCltbAccompSchUploadPK getId() {
		return this.id;
	}

	public void setId(TransCltbAccompSchUploadPK id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getBenAccount() {
		return this.benAccount;
	}

	public void setBenAccount(String benAccount) {
		this.benAccount = benAccount;
	}

	public String getBenBank() {
		return this.benBank;
	}

	public void setBenBank(String benBank) {
		this.benBank = benBank;
	}

	public String getBenName() {
		return this.benName;
	}

	public void setBenName(String benName) {
		this.benName = benName;
	}

	public String getCapitalized() {
		return this.capitalized;
	}

	public void setCapitalized(String capitalized) {
		this.capitalized = capitalized;
	}

	public BigDecimal getCompoundDays() {
		return this.compoundDays;
	}

	public void setCompoundDays(BigDecimal compoundDays) {
		this.compoundDays = compoundDays;
	}

	public BigDecimal getCompoundMonths() {
		return this.compoundMonths;
	}

	public void setCompoundMonths(BigDecimal compoundMonths) {
		this.compoundMonths = compoundMonths;
	}

	public BigDecimal getCompoundYears() {
		return this.compoundYears;
	}

	public void setCompoundYears(BigDecimal compoundYears) {
		this.compoundYears = compoundYears;
	}

	public String getDaysMth() {
		return this.daysMth;
	}

	public void setDaysMth(String daysMth) {
		this.daysMth = daysMth;
	}

	public String getDaysYear() {
		return this.daysYear;
	}

	public void setDaysYear(String daysYear) {
		this.daysYear = daysYear;
	}

	public BigDecimal getDueDatesOn() {
		return this.dueDatesOn;
	}

	public void setDueDatesOn(BigDecimal dueDatesOn) {
		this.dueDatesOn = dueDatesOn;
	}

	public BigDecimal getEmiAmount() {
		return this.emiAmount;
	}

	public void setEmiAmount(BigDecimal emiAmount) {
		this.emiAmount = emiAmount;
	}

	public String getFormulaName() {
		return this.formulaName;
	}

	public void setFormulaName(String formulaName) {
		this.formulaName = formulaName;
	}

	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}

	public BigDecimal getNoOfSchedules() {
		return this.noOfSchedules;
	}

	public void setNoOfSchedules(BigDecimal noOfSchedules) {
		this.noOfSchedules = noOfSchedules;
	}

	public String getPaymentDetails() {
		return this.paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPmntProdAc() {
		return this.pmntProdAc;
	}

	public void setPmntProdAc(String pmntProdAc) {
		this.pmntProdAc = pmntProdAc;
	}

	public Date getSchEndDate() {
		return this.schEndDate;
	}

	public void setSchEndDate(Date schEndDate) {
		this.schEndDate = schEndDate;
	}

	public String getScheduleFlag() {
		return this.scheduleFlag;
	}

	public void setScheduleFlag(String scheduleFlag) {
		this.scheduleFlag = scheduleFlag;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWaiverFlag() {
		return this.waiverFlag;
	}

	public void setWaiverFlag(String waiverFlag) {
		this.waiverFlag = waiverFlag;
	}

}