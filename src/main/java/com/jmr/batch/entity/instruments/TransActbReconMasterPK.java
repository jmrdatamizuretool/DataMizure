package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ACTB_RECON_MASTER database table.
 * 
 */
@Embeddable
public class TransActbReconMasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String branch;

	private String account;

	private String reconno;

	public TransActbReconMasterPK() {
	}
	public String getBranch() {
		return this.branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getReconno() {
		return this.reconno;
	}
	public void setReconno(String reconno) {
		this.reconno = reconno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransActbReconMasterPK)) {
			return false;
		}
		TransActbReconMasterPK castOther = (TransActbReconMasterPK)other;
		return 
			this.branch.equals(castOther.branch)
			&& this.account.equals(castOther.account)
			&& this.reconno.equals(castOther.reconno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.branch.hashCode();
		hash = hash * prime + this.account.hashCode();
		hash = hash * prime + this.reconno.hashCode();
		
		return hash;
	}
}