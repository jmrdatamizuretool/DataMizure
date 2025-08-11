package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the TRANS_BCTB_UPLOAD_SHIPMENT_INFO database table.
 * 
 */
@Embeddable
public class TransLdtbUploadLinkagesPK implements Serializable{
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "EXT_CONTRACT_REF_NO")
    private String extContractRefNo;

    @Column(name = "SOURCE_SEQ_NO")
    private Long sourceSeqNo;
    
    public TransLdtbUploadLinkagesPK() {
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

	public String getExtContractRefNo() {
		return extContractRefNo;
	}

	public void setExtContractRefNo(String extContractRefNo) {
		this.extContractRefNo = extContractRefNo;
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
		if (!(other instanceof TransLdtbUploadLinkagesPK)) {
			return false;
		}
		TransLdtbUploadLinkagesPK castOther = (TransLdtbUploadLinkagesPK)other;
		return 
			this.sourceCode.equals(castOther.sourceCode)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.extContractRefNo.equals(castOther.extContractRefNo)
			&& (this.sourceSeqNo == castOther.sourceSeqNo);
	} 
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.extContractRefNo.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));			
		return hash;
	}

}
