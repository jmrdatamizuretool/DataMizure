package com.jmr.batch.entity.glbalance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_DETB_UPLOAD_MASTER_GLBAL database table.
 * 
 */
@Embeddable
public class TransDetbUploadMasterGlbalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BATCH_NO")
	private String batchNo;

	public TransDetbUploadMasterGlbalPK() {
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransDetbUploadMasterGlbalPK)) {
			return false;
		}
		TransDetbUploadMasterGlbalPK castOther = (TransDetbUploadMasterGlbalPK)other;
		return 
			this.branchCode.equals(castOther.branchCode)
			&& this.batchNo.equals(castOther.batchNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.batchNo.hashCode();
		
		return hash;
	}
}