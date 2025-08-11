package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_CLTB_ACCOMP_SCH_UPLOAD database table.
 * 
 */
@Embeddable
public class TransCltbAccompSchUploadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EXT_REF_NO")
	private String extRefNo;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="COMPONENT_NAME")
	private String componentName;

	@Column(name="SCHEDULE_TYPE")
	private String scheduleType;

	@Temporal(TemporalType.DATE)
	@Column(name="SCH_START_DATE")
	private java.util.Date schStartDate;

	@Column(name="PROCESS_CODE")
	private String processCode;

	@Column(name="SEQUENCE_NO")
	private long sequenceNo;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_DUE_DATE")
	private java.util.Date firstDueDate;

	public TransCltbAccompSchUploadPK() {
	}
	public String getExtRefNo() {
		return this.extRefNo;
	}
	public void setExtRefNo(String extRefNo) {
		this.extRefNo = extRefNo;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getComponentName() {
		return this.componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public java.util.Date getSchStartDate() {
		return this.schStartDate;
	}
	public void setSchStartDate(java.util.Date schStartDate) {
		this.schStartDate = schStartDate;
	}
	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}
	public long getSequenceNo() {
		return this.sequenceNo;
	}
	public void setSequenceNo(long sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public java.util.Date getFirstDueDate() {
		return this.firstDueDate;
	}
	public void setFirstDueDate(java.util.Date firstDueDate) {
		this.firstDueDate = firstDueDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransCltbAccompSchUploadPK)) {
			return false;
		}
		TransCltbAccompSchUploadPK castOther = (TransCltbAccompSchUploadPK)other;
		return 
			this.extRefNo.equals(castOther.extRefNo)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.componentName.equals(castOther.componentName)
			&& this.scheduleType.equals(castOther.scheduleType)
			&& this.schStartDate.equals(castOther.schStartDate)
			&& this.processCode.equals(castOther.processCode)
			&& (this.sequenceNo == castOther.sequenceNo)
			&& this.firstDueDate.equals(castOther.firstDueDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.extRefNo.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.componentName.hashCode();
		hash = hash * prime + this.scheduleType.hashCode();
		hash = hash * prime + this.schStartDate.hashCode();
		hash = hash * prime + this.processCode.hashCode();
		hash = hash * prime + ((int) (this.sequenceNo ^ (this.sequenceNo >>> 32)));
		hash = hash * prime + this.firstDueDate.hashCode();
		
		return hash;
	}
}