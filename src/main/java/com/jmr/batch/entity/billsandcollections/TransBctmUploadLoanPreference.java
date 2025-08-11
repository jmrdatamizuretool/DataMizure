package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTM_UPLOAD_LOAN_PREFERENCE database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTM_UPLOAD_LOAN_PREFERENCE")
public class TransBctmUploadLoanPreference implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctmUploadLoanPreferencePK transBctmUploadLoanPreferencePK;
	
	@Column(name = "tenor")
    private Integer tenor;

    @Column(name = "units")
    private String units;

    @Column(name = "credit_line")
    private String creditLine;

    @Column(name = "rate_code")
    private String rateCode;

    @Column(name = "exchange_rate")
    private Long exchangeRate;

    @Column(name = "rate_type")
    private String rateType;

    @Column(name = "maturity_account")
    private String maturityAccount;

    @Column(name = "crystallization_type")
    private String crystallizationType;

    @Column(name = "coll_liqd_amount")
    private Long collLiquidatedAmount;

    @Column(name = "liqd_lc_chrg_comm")
    private String liqdLcChrgComm;

    @Column(name = "maturity_date")
    private Date maturityDate;

    @Column(name = "loan_amount")
    private Long loanAmount;

    @Column(name = "bill_outstanding")
    private Long billOutstanding;

    @Column(name = "bill_ccy")
    private String billCcy;

    @Column(name = "rate_code_pref")
    private String rateCodePref;

    @Column(name = "maximum_rate_variance")
    private Long maximumRateVariance;

    @Column(name = "normal_rate_variance")
    private Long normalRateVariance;

    @Column(name = "payment_mode")
    private String paymentMode;

    @Column(name = "dr_acc_brn")
    private String drAccBrn;

    @Column(name = "dr_prod_ac")
    private String drProdAc;

    @Column(name = "cr_acc_brn")
    private String crAccBrn;

    @Column(name = "cr_prod_ac")
    private String crProdAc;

    @Column(name = "bridge_gl")
    private String bridgeGl;

    @Column(name = "product")
    private String product;

    @Column(name = "currency")
    private String currency;

	public TransBctmUploadLoanPreferencePK getTransBctmUploadLoanPreferencePK() {
		return transBctmUploadLoanPreferencePK;
	}

	public void setTransBctmUploadLoanPreferencePK(TransBctmUploadLoanPreferencePK transBctmUploadLoanPreferencePK) {
		this.transBctmUploadLoanPreferencePK = transBctmUploadLoanPreferencePK;
	}

	public Integer getTenor() {
		return tenor;
	}

	public void setTenor(Integer tenor) {
		this.tenor = tenor;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getMaturityAccount() {
		return maturityAccount;
	}

	public void setMaturityAccount(String maturityAccount) {
		this.maturityAccount = maturityAccount;
	}

	public String getCrystallizationType() {
		return crystallizationType;
	}

	public void setCrystallizationType(String crystallizationType) {
		this.crystallizationType = crystallizationType;
	}

	public Long getCollLiquidatedAmount() {
		return collLiquidatedAmount;
	}

	public void setCollLiquidatedAmount(Long collLiquidatedAmount) {
		this.collLiquidatedAmount = collLiquidatedAmount;
	}

	public String getLiqdLcChrgComm() {
		return liqdLcChrgComm;
	}

	public void setLiqdLcChrgComm(String liqdLcChrgComm) {
		this.liqdLcChrgComm = liqdLcChrgComm;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Long getBillOutstanding() {
		return billOutstanding;
	}

	public void setBillOutstanding(Long billOutstanding) {
		this.billOutstanding = billOutstanding;
	}

	public String getBillCcy() {
		return billCcy;
	}

	public void setBillCcy(String billCcy) {
		this.billCcy = billCcy;
	}

	public String getRateCodePref() {
		return rateCodePref;
	}

	public void setRateCodePref(String rateCodePref) {
		this.rateCodePref = rateCodePref;
	}

	public Long getMaximumRateVariance() {
		return maximumRateVariance;
	}

	public void setMaximumRateVariance(Long maximumRateVariance) {
		this.maximumRateVariance = maximumRateVariance;
	}

	public Long getNormalRateVariance() {
		return normalRateVariance;
	}

	public void setNormalRateVariance(Long normalRateVariance) {
		this.normalRateVariance = normalRateVariance;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getDrAccBrn() {
		return drAccBrn;
	}

	public void setDrAccBrn(String drAccBrn) {
		this.drAccBrn = drAccBrn;
	}

	public String getDrProdAc() {
		return drProdAc;
	}

	public void setDrProdAc(String drProdAc) {
		this.drProdAc = drProdAc;
	}

	public String getCrAccBrn() {
		return crAccBrn;
	}

	public void setCrAccBrn(String crAccBrn) {
		this.crAccBrn = crAccBrn;
	}

	public String getCrProdAc() {
		return crProdAc;
	}

	public void setCrProdAc(String crProdAc) {
		this.crProdAc = crProdAc;
	}

	public String getBridgeGl() {
		return bridgeGl;
	}

	public void setBridgeGl(String bridgeGl) {
		this.bridgeGl = bridgeGl;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
    

}
