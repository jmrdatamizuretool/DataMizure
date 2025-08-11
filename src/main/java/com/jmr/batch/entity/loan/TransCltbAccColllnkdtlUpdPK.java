package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_CLTB_ACC_COLLLNKDTL_UPD database table.
 * 
 */
@Embeddable
public class TransCltbAccColllnkdtlUpdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EXT_REF_NO")
	private String extRefNo;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="LINKAGE_TYPE")
	private String linkageType;

	@Column(name="LINKED_REFERENCE_NO")
	private String linkedReferenceNo;

	@Column(name="SEQUENCE_NO")
	private long sequenceNo;

	@Column(name="PROCESS_CODE")
	private String processCode;

	public TransCltbAccColllnkdtlUpdPK() {
	}
	public String getExtRefNo() {
		return this.extRefNo;
	}
	public void setExtRefNo(String extRefNo) {
		this.extRefNo = extRefNo;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getLinkageType() {
		return this.linkageType;
	}
	public void setLinkageType(String linkageType) {
		this.linkageType = linkageType;
	}
	public String getLinkedReferenceNo() {
		return this.linkedReferenceNo;
	}
	public void setLinkedReferenceNo(String linkedReferenceNo) {
		this.linkedReferenceNo = linkedReferenceNo;
	}
	public long getSequenceNo() {
		return this.sequenceNo;
	}
	public void setSequenceNo(long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCltbAccColllnkdtlUpdPK)) {
			return false;
		}
		TransCltbAccColllnkdtlUpdPK castOther = (TransCltbAccColllnkdtlUpdPK)other;
		return 
			this.extRefNo.equals(castOther.extRefNo)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.linkageType.equals(castOther.linkageType)
			&& this.linkedReferenceNo.equals(castOther.linkedReferenceNo)
			&& (this.sequenceNo == castOther.sequenceNo)
			&& this.processCode.equals(castOther.processCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.extRefNo.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.linkageType.hashCode();
		hash = hash * prime + this.linkedReferenceNo.hashCode();
		hash = hash * prime + ((int) (this.sequenceNo ^ (this.sequenceNo >>> 32)));
		hash = hash * prime + this.processCode.hashCode();
		
		return hash;
	}
}