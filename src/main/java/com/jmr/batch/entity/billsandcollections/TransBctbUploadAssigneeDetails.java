package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the BCTB_UPLOAD_ASSIGNEE_DETAILS database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_ASSIGNEE_DETAILS")
public class TransBctbUploadAssigneeDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadAssigneeDetailsPK transBctbUploadAssigneeDetailsPK;
	
	@Column(name = "ASSIGNEE_ID")
    private String assigneeId;

    @Column(name = "ASSIGNEE_NAME")
    private String assigneeName;

    @Column(name = "AMT_BILL_CCY")
    private Long amtBillCcy;

    @Column(name = "AC_CCY")
    private String acCcy;

    @Column(name = "ACCOUNT")
    private String account;

	public TransBctbUploadAssigneeDetailsPK getTransBctbUploadAssigneeDetailsPK() {
		return transBctbUploadAssigneeDetailsPK;
	}

	public void setTransBctbUploadAssigneeDetails(TransBctbUploadAssigneeDetailsPK transBctbUploadAssigneeDetailsPK) {
		this.transBctbUploadAssigneeDetailsPK = transBctbUploadAssigneeDetailsPK;
	}

	public String getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(String assigneeId) {
		this.assigneeId = assigneeId;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public Long getAmtBillCcy() {
		return amtBillCcy;
	}

	public void setAmtBillCcy(Long amtBillCcy) {
		this.amtBillCcy = amtBillCcy;
	}

	public String getAcCcy() {
		return acCcy;
	}

	public void setAcCcy(String acCcy) {
		this.acCcy = acCcy;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
    

}
