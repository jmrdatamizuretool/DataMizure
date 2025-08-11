package com.jmr.batch.entity.chequebook;

import java.io.Serializable;
import javax.persistence.*;
@Embeddable
public class TransCatmUploadCheckBookPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	@Column(name="BRANCH")
	private String branch;

	@Column(name="ACCOUNT")
	private String account ;
	
	@Column(name="FIRST_CHECK_NO")
	private String first_check_no  ;
	
	public TransCatmUploadCheckBookPK() {
	}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getFirst_check_no() {
		return first_check_no;
	}

	public void setFirst_check_no(String first_check_no) {
		this.first_check_no = first_check_no;
	}


	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCatmUploadCheckBookPK)) {
			return false;
		}
		TransCatmUploadCheckBookPK castOther = (TransCatmUploadCheckBookPK)other;
		return 
				this.account.equals(castOther.account)
				&& this.first_check_no.equals(castOther.first_check_no)
				&& this.branch.equals(castOther.branch);
			
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.account.hashCode();
			hash = hash * prime + this.first_check_no.hashCode();
			hash = hash * prime + this.branch.hashCode()
		;
			
			return hash;
		}
	}
	
	
	

