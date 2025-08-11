package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLD_PACK_CREDIT_DTLS database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLD_PACK_CREDIT_DTLS")
public class TransBctbUploadPackCreditDtls implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadPackCreditDtlsPK transBctbUploadPackCreditDtlsPK;
	
	@Column(name = "LINKED_CCY")
    private String linkedCcy;

    @Column(name = "OUTSTANDING_AMT")
    private Long outstandingAmt;

    @Column(name = "EVENT_CODE")
    private String eventCode;

    @Column(name = "SETTLED_AMT")
    private Long settledAmt;

	public TransBctbUploadPackCreditDtlsPK getTransBctbUploadPackCreditDtlsPK() {
		return transBctbUploadPackCreditDtlsPK;
	}

	public void setTransBctbUploadPackCreditDtlsPK(TransBctbUploadPackCreditDtlsPK transBctbUploadPackCreditDtlsPK) {
		this.transBctbUploadPackCreditDtlsPK = transBctbUploadPackCreditDtlsPK;
	}

	public String getLinkedCcy() {
		return linkedCcy;
	}

	public void setLinkedCcy(String linkedCcy) {
		this.linkedCcy = linkedCcy;
	}

	public Long getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setOutstandingAmt(Long outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Long getSettledAmt() {
		return settledAmt;
	}

	public void setSettledAmt(Long settledAmt) {
		this.settledAmt = settledAmt;
	}
    
 

}
