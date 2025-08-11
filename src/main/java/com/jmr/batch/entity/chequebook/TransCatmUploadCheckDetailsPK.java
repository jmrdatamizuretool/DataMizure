package com.jmr.batch.entity.chequebook;

import java.io.Serializable;
import javax.persistence.*;
@Embeddable
public class TransCatmUploadCheckDetailsPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	@Column(name="BRANCH")
	private String branch;

	@Column(name="ACCOUNT")
	private String account ;
	
	@Column(name="CHECK_NO")
	private String check_no  ;
	@Column(name="MOD_NO")
	private Double mod_no  ;
	
	public TransCatmUploadCheckDetailsPK() {
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

	public String getCheck_no() {
		return check_no;
	}

	public void setCheck_no(String Check_no) {
		this.check_no = Check_no;
	}

	public Double getMod_no() {
		return mod_no;
	}	
	public void setMod_no(Double mod_no) {
		this.mod_no = mod_no;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCatmUploadCheckDetailsPK)) {
			return false;
		}
		TransCatmUploadCheckDetailsPK castOther = (TransCatmUploadCheckDetailsPK)other;
		return 
				this.account.equals(castOther.account)
				&& this.check_no.equals(castOther.check_no)
				&& this.mod_no.equals(castOther.mod_no)
		        && this.branch.equals(castOther.branch);
			
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.account.hashCode();
			hash = hash * prime + this.check_no.hashCode();
			hash = hash * prime + this.branch.hashCode();
			hash = hash * prime + this.mod_no.hashCode()
			
		;
			
			return hash;
		}
	}
	
	
	

