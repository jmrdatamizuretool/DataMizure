package com.jmr.batch.entity.amount;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CATM_UPLOAD_AMOUNT_BLOCKS database table.
 * 
 */
@Embeddable
public class TransCatmUploadAmountBlocksPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AMOUNT_BLOCK_NO")
	private String amountBlockNo;

	@Column(name="MAINTENANCE_SEQ_NO")
	private String maintenanceSeqNo;

	public TransCatmUploadAmountBlocksPK() {
	}
	public String getAmountBlockNo() {
		return this.amountBlockNo;
	}
	public void setAmountBlockNo(String amountBlockNo) {
		this.amountBlockNo = amountBlockNo;
	}
	public String getMaintenanceSeqNo() {
		return this.maintenanceSeqNo;
	}
	public void setMaintenanceSeqNo(String maintenanceSeqNo) {
		this.maintenanceSeqNo = maintenanceSeqNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCatmUploadAmountBlocksPK)) {
			return false;
		}
		TransCatmUploadAmountBlocksPK castOther = (TransCatmUploadAmountBlocksPK)other;
		return 
			this.amountBlockNo.equals(castOther.amountBlockNo)
			&& this.maintenanceSeqNo.equals(castOther.maintenanceSeqNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.amountBlockNo.hashCode();
		hash = hash * prime + this.maintenanceSeqNo.hashCode();
		
		return hash;
	}
}