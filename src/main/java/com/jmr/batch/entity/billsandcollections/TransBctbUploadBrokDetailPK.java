package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpdPK;

/**
 * The primary key class for the TRANS_BCTB_UPLOAD_BROK_DETAIL database table.
 * 
 */
@Embeddable
public class TransBctbUploadBrokDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "SOURCE_REF")
    private String sourceRef;

    @Column(name = "SOURCE_SEQ_NO")
    private Long sourceSeqNo;

    @Column(name = "BROK_SEQ_NO")
    private Long brokSeqNo;

    @Column(name = "BROKER")
    private String broker;
    
    public TransBctbUploadBrokDetailPK() {
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceRef() {
		return sourceRef;
	}

	public void setSourceRef(String sourceRef) {
		this.sourceRef = sourceRef;
	}

	public Long getSourceSeqNo() {
		return sourceSeqNo;
	}

	public void setSourceSeqNo(Long sourceSeqNo) {
		this.sourceSeqNo = sourceSeqNo;
	}

	public Long getBrokSeqNo() {
		return brokSeqNo;
	}

	public void setBrokSeqNo(Long brokSeqNo) {
		this.brokSeqNo = brokSeqNo;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}
    
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransBctbUploadBrokDetailPK)) {
			return false;
		}
		TransBctbUploadBrokDetailPK castOther = (TransBctbUploadBrokDetailPK)other;
		return 
			this.branchCode.equals(castOther.branchCode)
			&& this.sourceCode.equals(castOther.sourceCode)
			&& this.sourceRef.equals(castOther.sourceRef)
			&& (this.sourceSeqNo == castOther.sourceSeqNo)
			&& (this.brokSeqNo == castOther.brokSeqNo)
			&& this.broker.equals(castOther.broker);
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.sourceRef.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
		hash = hash * prime + ((int) (this.brokSeqNo ^ (this.brokSeqNo >>> 32)));
		hash = hash * prime + this.broker.hashCode();
		
		return hash;
	}

}
