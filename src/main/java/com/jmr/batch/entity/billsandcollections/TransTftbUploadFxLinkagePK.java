package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the TRANS_BCTM_UPLOAD_LOAN_ICCF database table.
 * 
 */
@Embeddable
public class TransTftbUploadFxLinkagePK implements Serializable {
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

    @Column(name = "EXTERNAL_REF_NO")
    private String externalRefNo;

    @Column(name = "TF_REF_NO")
    private String tfRefNo;

    @Column(name = "EVENT_SEQ_NO")
    private Long eventSeqNo;

    @Column(name = "FX_REF_NO")
    private String fxRefNo;
    
    public TransTftbUploadFxLinkagePK() {
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

	public String getExternalRefNo() {
		return externalRefNo;
	}

	public void setExternalRefNo(String externalRefNo) {
		this.externalRefNo = externalRefNo;
	}

	public String getTfRefNo() {
		return tfRefNo;
	}

	public void setTfRefNo(String tfRefNo) {
		this.tfRefNo = tfRefNo;
	}

	public Long getEventSeqNo() {
		return eventSeqNo;
	}

	public void setEventSeqNo(Long eventSeqNo) {
		this.eventSeqNo = eventSeqNo;
	}

	public String getFxRefNo() {
		return fxRefNo;
	}

	public void setFxRefNo(String fxRefNo) {
		this.fxRefNo = fxRefNo;
	}
    
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransTftbUploadFxLinkagePK)) {
			return false;
		}
		TransTftbUploadFxLinkagePK castOther = (TransTftbUploadFxLinkagePK)other;
		return 
			this.branchCode.equals(castOther.branchCode)
			&& this.sourceCode.equals(castOther.sourceCode)
			&& this.sourceRef.equals(castOther.sourceRef)
			&& (this.sourceSeqNo == castOther.sourceSeqNo)
			&& (this.eventSeqNo == castOther.eventSeqNo)
			&& this.tfRefNo.equals(castOther.tfRefNo)
			&& this.externalRefNo.equals(castOther.externalRefNo)
			&& this.fxRefNo.equals(castOther.fxRefNo);
			
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.sourceRef.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
		hash = hash * prime + ((int) (this.eventSeqNo ^ (this.eventSeqNo >>> 32)));
		hash = hash * prime + this.tfRefNo.hashCode();
		hash = hash * prime + this.externalRefNo.hashCode();
		hash = hash * prime + this.fxRefNo.hashCode();
		
		return hash;
	}

}
