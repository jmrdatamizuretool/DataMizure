package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the TRANS_BCTB_UPLD_PACK_CREDIT_DTLS database table.
 * 
 */
@Embeddable
public class TransBctbUploadPackCreditDtlsPK implements Serializable {
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

    @Column(name = "BCREFNO")
    private String bcrefno;

    @Column(name = "CL_ACCOUNT")
    private String clAccount;

    @Column(name = "SEQ_NO")
    private Long seqNo;
    
    public TransBctbUploadPackCreditDtlsPK() {
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

	public String getBcrefno() {
		return bcrefno;
	}

	public void setBcrefno(String bcrefno) {
		this.bcrefno = bcrefno;
	}

	public String getClAccount() {
		return clAccount;
	}

	public void setClAccount(String clAccount) {
		this.clAccount = clAccount;
	}

	public Long getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
    
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransBctbUploadPackCreditDtlsPK)) {
			return false;
		}
		TransBctbUploadPackCreditDtlsPK castOther = (TransBctbUploadPackCreditDtlsPK)other;
		return 
			this.branchCode.equals(castOther.branchCode)
			&& this.sourceCode.equals(castOther.sourceCode)
			&& this.sourceRef.equals(castOther.sourceRef)
			&& (this.sourceSeqNo == castOther.sourceSeqNo)
			&& this.sourceRef.equals(castOther.bcrefno)
			&& this.sourceRef.equals(castOther.clAccount);
	}
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.sourceRef.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
		hash = hash * prime + this.bcrefno.hashCode();
		hash = hash * prime + this.clAccount.hashCode();
		
		return hash;
	}

}
