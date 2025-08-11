package com.jmr.batch.entity.casabalance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_DETB_UPLOAD_MASTER_CASABAL database table.
 * 
 */
@Embeddable
public class TransDetbUploadMasterCasabalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BATCH_NO")
	private String batchNo;

	public TransDetbUploadMasterCasabalPK() {
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
		if (!(other instanceof TransDetbUploadMasterCasabalPK)) {
			return false;
		}
		TransDetbUploadMasterCasabalPK castOther = (TransDetbUploadMasterCasabalPK)other;
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