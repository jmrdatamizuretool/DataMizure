package com.jmr.batch.entity.billsandcollections;

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
public class TransBctbupldpackcreditdtls {
	
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId
	private TransBctbupldpackcreditdtlsPK transBctbupldpackcreditdtlsPK;
	
	@Column(name = "LINKED_CCY")
    private String linkedCcy;

    @Column(name = "OUTSTANDING_AMT")
    private long outstandingAmt;

    @Column(name = "EVENT_CODE")
    private String eventCode;

    @Column(name = "SETTLED_AMT")
    private long settledAmt;
    
  //getters and setters

	public TransBctbupldpackcreditdtlsPK getTransBctbupldpackcreditdtlsPK() {
		return transBctbupldpackcreditdtlsPK;
	}

	public void setTransBctbupldpackcreditdtlsPK(TransBctbupldpackcreditdtlsPK transBctbupldpackcreditdtlsPK) {
		this.transBctbupldpackcreditdtlsPK = transBctbupldpackcreditdtlsPK;
	}

	public String getLinkedCcy() {
		return linkedCcy;
	}

	public void setLinkedCcy(String linkedCcy) {
		this.linkedCcy = linkedCcy;
	}

	public long getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setOutstandingAmt(long outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public long getSettledAmt() {
		return settledAmt;
	}

	public void setSettledAmt(long settledAmt) {
		this.settledAmt = settledAmt;
	}
    

}
