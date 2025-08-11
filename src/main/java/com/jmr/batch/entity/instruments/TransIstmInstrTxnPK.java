package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ISTM_INSTR_TXN database table.
 * 
 */
@Embeddable
public class TransIstmInstrTxnPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CONTRACT_REF_NO")
	private String contractRefNo;

	@Column(name="VERSION_NO")
	private Double versionNo;

	public TransIstmInstrTxnPK() {
	}
	public String getContractRefNo() {
		return this.contractRefNo;
	}
	public void setContractRefNo(String contractRefNo) {
		this.contractRefNo = contractRefNo;
	}
	public Double getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(Double versionNo) {
		this.versionNo = versionNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransIstmInstrTxnPK)) {
			return false;
		}
		TransIstmInstrTxnPK castOther = (TransIstmInstrTxnPK)other;
		return 
			this.contractRefNo.equals(castOther.contractRefNo)
			
			&& this.versionNo.equals(castOther.versionNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.contractRefNo.hashCode();
		hash = hash * prime + this.versionNo.hashCode();
		
		return hash;
	}
}