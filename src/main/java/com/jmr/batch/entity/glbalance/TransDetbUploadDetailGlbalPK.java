package com.jmr.batch.entity.glbalance;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_DETB_UPLOAD_DETAIL_GLBAL database table.
 * 
 */
@Embeddable
public class TransDetbUploadDetailGlbalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BATCH_NO")
	private String batchNo;

	@Column(name="CURR_NO")
	private Double currNo;

	public TransDetbUploadDetailGlbalPK() {
	}
	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
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
	public Double getCurrNo() {
		return this.currNo;
	}
	public void setCurrNo(Double currNo) {
		this.currNo = currNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransDetbUploadDetailGlbalPK)) {
			return false;
		}
		TransDetbUploadDetailGlbalPK castOther = (TransDetbUploadDetailGlbalPK)other;
		return 
			this.sourceCode.equals(castOther.sourceCode)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.batchNo.equals(castOther.batchNo)
			&& this.currNo.equals(castOther.currNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.batchNo.hashCode();
		hash = hash * prime + this.currNo.hashCode();
		
		return hash;
	}
}