package com.jmr.batch.entity.tdRd;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_ICTM_UPLOAD_TD_DETAILS database table.
 * 
 */
@Embeddable
public class TransIctmUploadTdDetailsPK implements Serializable {
	// default serial version id, required for serializable classes.

	private static final long serialVersionUID = 1L;

	@Column(name = "MAINTENANCE_SEQ_NO")
	private String maintenance_seq_no;

	@Column(name = "BRANCH_CODE")
	private String branch_code;

	@Column(name = "SOURCE_CODE")
	private String source_code;

	@Column(name = "SOURCE_SEQ_NO")
	private long source_seq_no;

	@Column(name = "CCY")
	private String ccy;

	@Column(name = "BRN")
	private String brn;

	@Column(name = "ACC")
	private String acc;

	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public long getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(long source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getBrn() {
		return brn;
	}

	public void setBrn(String brn) {
		this.brn = brn;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TransIctmUploadTdDetailsPK() {

	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransIctmUploadTdDetailsPK)) {
			return false;
		}
		TransIctmUploadTdDetailsPK castOther = (TransIctmUploadTdDetailsPK) other;

		return this.maintenance_seq_no.equals(castOther.maintenance_seq_no)
				&& this.branch_code.equals(castOther.branch_code) 
				&& this.source_code.equals(castOther.source_code)
				&& (this.source_seq_no == castOther.source_seq_no) 
				&& this.ccy.equals(castOther.ccy)
				&& this.brn.equals(castOther.brn) 
				&& this.acc.equals(castOther.acc);

	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.maintenance_seq_no.hashCode();
		hash = hash * prime + this.branch_code.hashCode();
		hash = hash * prime + this.source_code.hashCode();
		hash = hash * prime + ((int) (this.source_seq_no ^ (this.source_seq_no >>> 32)));
		hash = hash * prime + this.ccy.hashCode();
		hash = hash * prime + this.brn.hashCode();
		hash = hash * prime + this.acc.hashCode();
		return hash;
	}

}
