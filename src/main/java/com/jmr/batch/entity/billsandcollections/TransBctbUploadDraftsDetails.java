package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_DRAFTS_DETAILS database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_DRAFTS_DETAILS")
public class TransBctbUploadDraftsDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadDraftsDetailsPK transBctbUploadDraftsDetailsPK;
	
	@Column(name = "AMOUNT")
    private Double amount;

	public TransBctbUploadDraftsDetailsPK getTransBctbUploadDraftsDetailsPK() {
		return transBctbUploadDraftsDetailsPK;
	}

	public void setTransBctbUploadDraftsDetailsPK(TransBctbUploadDraftsDetailsPK transBctbUploadDraftsDetailsPK) {
		this.transBctbUploadDraftsDetailsPK = transBctbUploadDraftsDetailsPK;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
