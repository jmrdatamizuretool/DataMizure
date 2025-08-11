package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the LCTB_UPLOAD_COLLATERAL database table.
 * 
 */
@Entity
@Table(name = "TRANS_LCTB_UPLOAD_COLLATERAL")
public class TransLctbUploadCollateral implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransLctbUploadCollateralPK transLctbUploadCollateralPK;
	
	@Column(name = "collateral_ccy")
    private String collateralCcy;

    @Column(name = "collateral_pct")
    private Long collateralPct;

    @Column(name = "collateral_amt")
    private Long collateralAmt;

    @Column(name = "collateral_descr")
    private String collateralDescr;

    @Column(name = "exch_rate")
    private Long exchRate;

    @Column(name = "adjustment_amt")
    private Long adjustmentAmt;

    @Column(name = "adjustment_sign")
    private Long adjustmentSign;

	public TransLctbUploadCollateralPK getTransLctbUploadCollateralPK() {
		return transLctbUploadCollateralPK;
	}

	public void setTransLctbUploadCollateralPK(TransLctbUploadCollateralPK transLctbUploadCollateralPK) {
		this.transLctbUploadCollateralPK = transLctbUploadCollateralPK;
	}

	public String getCollateralCcy() {
		return collateralCcy;
	}

	public void setCollateralCcy(String collateralCcy) {
		this.collateralCcy = collateralCcy;
	}

	public Long getCollateralPct() {
		return collateralPct;
	}

	public void setCollateralPct(Long collateralPct) {
		this.collateralPct = collateralPct;
	}

	public Long getCollateralAmt() {
		return collateralAmt;
	}

	public void setCollateralAmt(Long collateralAmt) {
		this.collateralAmt = collateralAmt;
	}

	public String getCollateralDescr() {
		return collateralDescr;
	}

	public void setCollateralDescr(String collateralDescr) {
		this.collateralDescr = collateralDescr;
	}

	public Long getExchRate() {
		return exchRate;
	}

	public void setExchRate(Long exchRate) {
		this.exchRate = exchRate;
	}

	public Long getAdjustmentAmt() {
		return adjustmentAmt;
	}

	public void setAdjustmentAmt(Long adjustmentAmt) {
		this.adjustmentAmt = adjustmentAmt;
	}

	public Long getAdjustmentSign() {
		return adjustmentSign;
	}

	public void setAdjustmentSign(Long adjustmentSign) {
		this.adjustmentSign = adjustmentSign;
	}
    
    

}
