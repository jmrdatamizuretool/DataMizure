package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ISTM_UPLOAD_INSTRUMENT_MASTER database table.
 * 
 */
@Embeddable
public class TransIstmUploadInstrumentMasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="INSTRUMENT_TYPE")
	private String instrumentType;
	@Column(name="BRANCH")
	private String branch;


	@Column(name="CHEQUE_BOOK_NO")
	private String chequeBookNo;
	@Column(name="XREF")
	private String xref;
	@Column(name="ISSUER_CODE")
	private String issuer_code;


	public TransIstmUploadInstrumentMasterPK() {
	}
	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getInstrumentType() {
		return this.instrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}
	public String getBranch() {
		return this.branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getChequeBookNo() {
		return this.chequeBookNo;
	}
	public void setChequeBookNo(String chequeBookNo) {
		this.chequeBookNo = chequeBookNo;
	}
	public String getXref() {
		return this.xref;
	}
	public void setXref(String xref) {
		this.xref = xref;
	}

	public String getIssuer_code() {
		return issuer_code;
	}

	public void setIssuer_code(String issuer_code) {
		this.issuer_code = issuer_code;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransIstmUploadInstrumentMasterPK)) {
			return false;
		}
		TransIstmUploadInstrumentMasterPK castOther = (TransIstmUploadInstrumentMasterPK)other;
		return 
			this.sourceCode.equals(castOther.sourceCode)
		
			&& this.instrumentType.equals(castOther.instrumentType)
			&& this.branch.equals(castOther.branch)
			&& this.chequeBookNo.equals(castOther.chequeBookNo)
			&& this.xref.equals(castOther.xref)
		&& this.issuer_code.equals(castOther.issuer_code);
		   
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.instrumentType.hashCode();
		hash = hash * prime + this.branch.hashCode();
		hash = hash * prime + this.chequeBookNo.hashCode();
		hash = hash * prime + this.xref.hashCode();
		hash = hash * prime + this.issuer_code.hashCode();
		
		return hash;
	}
}