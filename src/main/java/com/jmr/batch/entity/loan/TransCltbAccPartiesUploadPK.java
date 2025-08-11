package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_CLTB_ACC_PARTIES_UPLOAD database table.
 * 
 */
@Embeddable
public class TransCltbAccPartiesUploadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EXT_REF_NO")
	private String extRefNo;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	private String responsibility;

	@Column(name="PROCESS_CODE")
	private String processCode;

	@Column(name="SEQUENCE_NO")
	private long sequenceNo;

	public TransCltbAccPartiesUploadPK() {
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
	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getResponsibility() {
		return this.responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	public long getSequenceNo() {
		return this.sequenceNo;
	}
	public void setSequenceNo(long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCltbAccPartiesUploadPK)) {
			return false;
		}
		TransCltbAccPartiesUploadPK castOther = (TransCltbAccPartiesUploadPK)other;
		return 
			this.extRefNo.equals(castOther.extRefNo)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.customerId.equals(castOther.customerId)
			&& this.responsibility.equals(castOther.responsibility)
			&& this.processCode.equals(castOther.processCode)
			&& (this.sequenceNo == castOther.sequenceNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.extRefNo.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.customerId.hashCode();
		hash = hash * prime + this.responsibility.hashCode();
		hash = hash * prime + this.processCode.hashCode();
		hash = hash * prime + ((int) (this.sequenceNo ^ (this.sequenceNo >>> 32)));
		
		return hash;
	}
}