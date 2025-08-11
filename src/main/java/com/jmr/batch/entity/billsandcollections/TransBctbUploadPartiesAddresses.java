package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_INVOICE_DETAIL database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_INVOICE_DETAIL")
public class TransBctbUploadPartiesAddresses implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadPartiesAddressesPK transBctbUploadPartiesAddressesPK;
	
	@Column(name = "ADDRESS", length = 105)
    private String address;

	public TransBctbUploadPartiesAddressesPK getTransBctbUploadPartiesAddressesPK() {
		return transBctbUploadPartiesAddressesPK;
	}

	public void setTransBctbUploadPartiesAddressesPK(TransBctbUploadPartiesAddressesPK transBctbUploadPartiesAddressesPK) {
		this.transBctbUploadPartiesAddressesPK = transBctbUploadPartiesAddressesPK;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
