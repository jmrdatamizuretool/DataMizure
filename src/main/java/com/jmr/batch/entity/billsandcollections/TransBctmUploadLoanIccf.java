package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTM_UPLOAD_LOAN_ICCF database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTM_UPLOAD_LOAN_ICCF")
public class TransBctmUploadLoanIccf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctmUploadLoanIccfPK transBctmUploadLoanIccfPK;
	
	@Column(name = "rate_code")
    private String rateCode;

    @Column(name = "int_basis")
    private Long intBasis;

    @Column(name = "int_rate")
    private Long intRate;

    @Column(name = "int_spread")
    private Long intSpread;

    @Column(name = "special_amount")
    private Long specialAmount;

    @Column(name = "usage", length = 1)
    private String usage;

	public TransBctmUploadLoanIccfPK getTransBctmUploadLoanIccfPK() {
		return transBctmUploadLoanIccfPK;
	}

	public void setTransBctmUploadLoanIccf(TransBctmUploadLoanIccfPK transBctmUploadLoanIccfPK) {
		this.transBctmUploadLoanIccfPK = transBctmUploadLoanIccfPK;
	}

	public String getRateCode() {
		return rateCode;
	}

	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}

	public Long getIntBasis() {
		return intBasis;
	}

	public void setIntBasis(Long intBasis) {
		this.intBasis = intBasis;
	}

	public Long getIntRate() {
		return intRate;
	}

	public void setIntRate(Long intRate) {
		this.intRate = intRate;
	}

	public Long getIntSpread() {
		return intSpread;
	}

	public void setIntSpread(Long intSpread) {
		this.intSpread = intSpread;
	}

	public Long getSpecialAmount() {
		return specialAmount;
	}

	public void setSpecialAmount(Long specialAmount) {
		this.specialAmount = specialAmount;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
    
    

}
