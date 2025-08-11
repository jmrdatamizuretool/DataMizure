package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the LCTB_UPLOAD_LIC_UTL_DTL database table.
 * 
 */
@Entity
@Table(name = "TRANS_LCTB_UPLOAD_LIC_UTL_DTL")
public class TransLctbUploadLicUtlDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransLctbUploadLicUtlDtlPK transLctbUploadLicUtlDtlPK;
	
	@Column(name = "amount_reinstated")
    private Double amountReinstated;

    @Column(name = "quantity_reinstated")
    private Double quantityReinstated;

    @Column(name = "amount_utilized")
    private Double amountUtilized;

    @Column(name = "quantity_utilized")
    private Double quantityUtilized;

    @Column(name = "remarks")
    private String remarks;

	public TransLctbUploadLicUtlDtlPK getTransLctbUploadLicUtlDtlPK() {
		return transLctbUploadLicUtlDtlPK;
	}

	public void setTransLctbUploadLicUtlDtlPK(TransLctbUploadLicUtlDtlPK transLctbUploadLicUtlDtlPK) {
		this.transLctbUploadLicUtlDtlPK = transLctbUploadLicUtlDtlPK;
	}

	public Double getAmountReinstated() {
		return amountReinstated;
	}

	public void setAmountReinstated(Double amountReinstated) {
		this.amountReinstated = amountReinstated;
	}

	public Double getQuantityReinstated() {
		return quantityReinstated;
	}

	public void setQuantityReinstated(Double quantityReinstated) {
		this.quantityReinstated = quantityReinstated;
	}

	public Double getAmountUtilized() {
		return amountUtilized;
	}

	public void setAmountUtilized(Double amountUtilized) {
		this.amountUtilized = amountUtilized;
	}

	public Double getQuantityUtilized() {
		return quantityUtilized;
	}

	public void setQuantityUtilized(Double quantityUtilized) {
		this.quantityUtilized = quantityUtilized;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    
	
	

}
