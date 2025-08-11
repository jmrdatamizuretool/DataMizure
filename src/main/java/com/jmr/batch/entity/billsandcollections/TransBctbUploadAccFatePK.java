package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.jmr.batch.entity.loan.TransCltbAcCompUploadPK;

/**
 * The primary key class for the TRANS_BCTB_UPLOAD_ACC_FATE database table.
 * 
 */
@Embeddable
public class TransBctbUploadAccFatePK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "SOURCE_REF")
    private String sourceRef;

    @Column(name = "SOURCE_SEQ_NO")
    private Long sourceSeqNo;
    
    public TransBctbUploadAccFatePK() {
	}
    
    //getters and setters
    
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
    
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransBctbUploadAccFatePK)) {
			return false;
		}
		TransBctbUploadAccFatePK castOther = (TransBctbUploadAccFatePK)other;
		return 
			this.branchCode.equals(castOther.branchCode)
			&& this.sourceCode.equals(castOther.sourceCode)
			&& this.sourceRef.equals(castOther.sourceRef)
			&& (this.sourceSeqNo == castOther.sourceSeqNo);
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.sourceRef.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
		
		return hash;
	}

}
