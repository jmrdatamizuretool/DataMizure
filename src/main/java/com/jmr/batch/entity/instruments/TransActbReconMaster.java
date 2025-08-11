package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the ACTB_RECON_MASTER database table.
 * 
 */
@Entity
@Table(name="TRANS_ACTBS_RECON_MASTER")
public class TransActbReconMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransActbReconMasterPK id;

	@Column(name="AMOUNT")
	private Double amount;

	@Column(name="AMOUNT_TO_RECON")
	private Double amountToRecon;

	@Column(name="CCY")
	private String ccy;


	@Column(name="ENTRYDATE")
	private Date entrydate;

	@Column(name="EVENT_SEQ_NO")
	private Double eventSeqNo;

	@Column(name="REF_NO")
	private String refNo;
	
	@Column(name="STATUS")
	private String status;

	public TransActbReconMaster() {
	}

	public TransActbReconMasterPK getId() {
		return this.id;
	}

	public void setId(TransActbReconMasterPK id) {
		this.id = id;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAmountToRecon() {
		return this.amountToRecon;
	}

	public void setAmountToRecon(Double amountToRecon) {
		this.amountToRecon = amountToRecon;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Date getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public Double getEventSeqNo() {
		return this.eventSeqNo;
	}

	public void setEventSeqNo(Double eventSeqNo) {
		this.eventSeqNo = eventSeqNo;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}