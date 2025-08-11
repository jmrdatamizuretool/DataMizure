package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ISTM_UPLOAD_INSTRUMENT_DETAIL database table.
 * 
 */
@Embeddable
public class TransIstmUploadInstrumentDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	//SOURCE_CODE, INSTRUMENT_TYPE, BRANCH, CHEQUE_BOOK_NO, CHEQUE_NO, ISSUER_CODE
	@Column(name="SOURCE_CODE")
	private String sourceCode;
	@Column(name="INSTRUMENT_TYPE")
	private String instrumentType;
	@Column(name="BRANCH")
	private String branch;
	@Column(name="CHEQUE_BOOK_NO")
	private String chequeBookNo;
	@Column(name="CHEQUE_NO")
	private String cheque_no;
	@Column(name="ISSUER_CODE")
	private String issuercode;
	public TransIstmUploadInstrumentDetailPK(String sourceCode, String instrumentType, String branch,
			String chequeBookNo, String cheque_no, String issuercode) {
		super();
		this.sourceCode = sourceCode;
		this.instrumentType = instrumentType;
		this.branch = branch;
		this.chequeBookNo = chequeBookNo;
		this.cheque_no = cheque_no;
		this.issuercode = issuercode;
	}
	public TransIstmUploadInstrumentDetailPK() {
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
	public String getIssuercode() {
		return issuercode;
	}

	public void setIssuercode(String issuercode) {
		this.issuercode = issuercode;
	}

	

	public String getCheque_no() {
		return cheque_no;
	}
	public void setCheque_no(String cheque_no) {
		this.cheque_no = cheque_no;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransIstmUploadInstrumentDetailPK)) {
			return false;
		}
		TransIstmUploadInstrumentDetailPK castOther = (TransIstmUploadInstrumentDetailPK)other;
		return 
			this.sourceCode.equals(castOther.sourceCode)
			&& this.instrumentType.equals(castOther.instrumentType)
			&& this.branch.equals(castOther.branch)
			&& this.chequeBookNo.equals(castOther.chequeBookNo)
		&& this.cheque_no.equals(castOther.cheque_no)
		&& this.issuercode.equals(castOther.issuercode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.instrumentType.hashCode();
		hash = hash * prime + this.branch.hashCode();
		hash = hash * prime + this.chequeBookNo.hashCode();
		hash = hash * prime + this.cheque_no.hashCode();
		hash = hash * prime + this.issuercode.hashCode();
		return hash;
	}
}