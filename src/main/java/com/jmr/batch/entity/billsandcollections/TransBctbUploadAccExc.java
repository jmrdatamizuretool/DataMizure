package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the BCTB_UPLOAD_ACC_EXC database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_ACC_EXC")
public class TransBctbUploadAccExc implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadAccExcPK transBctbUploadAccExcPK;
	
	@Column(name = "TRACER_REQD_FLAG")
    private String tracerReqdFlag; // CHAR(1) → String

    @Column(name = "NUM_TRACERS_TOBE_SENT")
    private Long numTracersTobeSent; // NUMBER → Long

    @Column(name = "TRACER_MEDIUM")
    private String tracerMedium;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "TRACER_START_DATE")
    private Date tracerStartDate;

    @Column(name = "TRACER_FREQUENCY")
    private Long tracerFrequency;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "PREVIOUS_TRACER_DATE")
    private Date previousTracerDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "NEXT_TRACER_DATE")
    private Date nextTracerDate;

    @Column(name = "NUM_TRACERS_SENT")
    private Long numTracersSent;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "NON_ACCEPTANCE_MSG_DATE")
    private Date nonAcceptanceMsgDate;

    @Column(name = "PROTEST_FLAG")
    private String protestFlag; // CHAR(1) → String

    @Column(name = "ACCEPTANCE_EXCEPTION_FLAG")
    private String acceptanceExceptionFlag; // CHAR(1) → String

    @Column(name = "TRACER_RECEIVER_PARTYTYPE")
    private String tracerReceiverPartyType;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_PROTEST")
    private Date dateOfProtest;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "ACCEPTANCE_MSG_DATE")
    private Date acceptanceMsgDate;

    @Column(name = "CONV_STATUS")
    private String convStatus; // CHAR(1) → String

    @Column(name = "ERR_MSG")
    private String errMsg;

    @Column(name = "MANUALLY_GENERATE_FLAG")
    private String manuallyGenerateFlag; // VARCHAR2(1) → String

	public TransBctbUploadAccExcPK getTransBctbUploadAccExcPK() {
		return transBctbUploadAccExcPK;
	}

	public void setTransBctbUploadAccExcPK(TransBctbUploadAccExcPK transBctbUploadAccExcPK) {
		this.transBctbUploadAccExcPK = transBctbUploadAccExcPK;
	}

	public String getTracerReqdFlag() {
		return tracerReqdFlag;
	}

	public void setTracerReqdFlag(String tracerReqdFlag) {
		this.tracerReqdFlag = tracerReqdFlag;
	}

	public Long getNumTracersTobeSent() {
		return numTracersTobeSent;
	}

	public void setNumTracersTobeSent(Long numTracersTobeSent) {
		this.numTracersTobeSent = numTracersTobeSent;
	}

	public String getTracerMedium() {
		return tracerMedium;
	}

	public void setTracerMedium(String tracerMedium) {
		this.tracerMedium = tracerMedium;
	}

	public Date getTracerStartDate() {
		return tracerStartDate;
	}

	public void setTracerStartDate(Date tracerStartDate) {
		this.tracerStartDate = tracerStartDate;
	}

	public Long getTracerFrequency() {
		return tracerFrequency;
	}

	public void setTracerFrequency(Long tracerFrequency) {
		this.tracerFrequency = tracerFrequency;
	}

	public Date getPreviousTracerDate() {
		return previousTracerDate;
	}

	public void setPreviousTracerDate(Date previousTracerDate) {
		this.previousTracerDate = previousTracerDate;
	}

	public Date getNextTracerDate() {
		return nextTracerDate;
	}

	public void setNextTracerDate(Date nextTracerDate) {
		this.nextTracerDate = nextTracerDate;
	}

	public Long getNumTracersSent() {
		return numTracersSent;
	}

	public void setNumTracersSent(Long numTracersSent) {
		this.numTracersSent = numTracersSent;
	}

	public Date getNonAcceptanceMsgDate() {
		return nonAcceptanceMsgDate;
	}

	public void setNonAcceptanceMsgDate(Date nonAcceptanceMsgDate) {
		this.nonAcceptanceMsgDate = nonAcceptanceMsgDate;
	}

	public String getProtestFlag() {
		return protestFlag;
	}

	public void setProtestFlag(String protestFlag) {
		this.protestFlag = protestFlag;
	}

	public String getAcceptanceExceptionFlag() {
		return acceptanceExceptionFlag;
	}

	public void setAcceptanceExceptionFlag(String acceptanceExceptionFlag) {
		this.acceptanceExceptionFlag = acceptanceExceptionFlag;
	}

	public String getTracerReceiverPartyType() {
		return tracerReceiverPartyType;
	}

	public void setTracerReceiverPartyType(String tracerReceiverPartyType) {
		this.tracerReceiverPartyType = tracerReceiverPartyType;
	}

	public Date getDateOfProtest() {
		return dateOfProtest;
	}

	public void setDateOfProtest(Date dateOfProtest) {
		this.dateOfProtest = dateOfProtest;
	}

	public Date getAcceptanceMsgDate() {
		return acceptanceMsgDate;
	}

	public void setAcceptanceMsgDate(Date acceptanceMsgDate) {
		this.acceptanceMsgDate = acceptanceMsgDate;
	}

	public String getConvStatus() {
		return convStatus;
	}

	public void setConvStatus(String convStatus) {
		this.convStatus = convStatus;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getManuallyGenerateFlag() {
		return manuallyGenerateFlag;
	}

	public void setManuallyGenerateFlag(String manuallyGenerateFlag) {
		this.manuallyGenerateFlag = manuallyGenerateFlag;
	}
    
  //getters and setters

	
     

}
