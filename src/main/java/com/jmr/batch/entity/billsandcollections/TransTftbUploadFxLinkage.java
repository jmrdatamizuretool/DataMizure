package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the TFTB_UPLOAD_FX_LINKAGE database table.
 * 
 */
@Entity
@Table(name = "TRANS_TFTB_UPLOAD_FX_LINKAGE")
public class TransTftbUploadFxLinkage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransTftbUploadFxLinkagePK transTftbUploadFxLinkagePK;
	
	@Column(name = "TF_AMOUNT")
    private Long tfAmount;

    @Column(name = "TF_RATE")
    private Long tfRate;

    @Column(name = "CURRENCY")
    private String currency;

	public TransTftbUploadFxLinkagePK getTransTftbUploadFxLinkagePK() {
		return transTftbUploadFxLinkagePK;
	}

	public void setTransTftbUploadFxLinkagePK(TransTftbUploadFxLinkagePK transTftbUploadFxLinkagePK) {
		this.transTftbUploadFxLinkagePK = transTftbUploadFxLinkagePK;
	}

	public Long getTfAmount() {
		return tfAmount;
	}

	public void setTfAmount(Long tfAmount) {
		this.tfAmount = tfAmount;
	}

	public Long getTfRate() {
		return tfRate;
	}

	public void setTfRate(Long tfRate) {
		this.tfRate = tfRate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
    

}
