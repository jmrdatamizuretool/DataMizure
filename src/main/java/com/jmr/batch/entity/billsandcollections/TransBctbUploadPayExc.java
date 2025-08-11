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
 * The persistent class for the BCTB_UPLOAD_PAY_EXC database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_PAY_EXC")
public class TransBctbUploadPayExc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadPayExcPK transBctbUploadPayExcPK;
	
	@Column(name = "TRACER_REQD_FLAG")
    private String tracerReqdFlag;

    @Column(name = "NUM_TRACERS_TOBE_SENT")
    private Long numTracersTobeSent;

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

    @Column(name = "NUM_TRACERS_SENT")
    private Long numTracersSent;

    @Temporal(TemporalType.DATE)
    @Column(name = "NEXT_TRACER_DATE")
    private Date nextTracerDate;

    @Column(name = "PAYMENT_EXCEPTION_FLAG")
    private String paymentExceptionFlag;

    @Column(name = "TRACER_RECEIVER_PARTYTYPE")
    private String tracerReceiverPartyType;

    @Temporal(TemporalType.DATE)
    @Column(name = "PAYMENT_MSG_DATE")
    private Date paymentMsgDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "NON_PAYMENT_MSG_DATE")
    private Date nonPaymentMsgDate;

    @Column(name = "PROTEST_FLAG")
    private String protestFlag;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_PROTEST")
    private Date dateOfProtest;

    @Column(name = "CONV_STATUS", length = 1)
    private String convStatus = "U";

    @Column(name = "ERR_MSG", length = 255)
    private String errMsg;

    @Column(name = "MANUALLY_GENERATE_FLAG", length = 1)
    private String manuallyGenerateFlag;

	public TransBctbUploadPayExcPK getTransBctbUploadPayExcPK() {
		return transBctbUploadPayExcPK;
	}

	public void setTransBctbUploadPayExcPK(TransBctbUploadPayExcPK transBctbUploadPayExcPK) {
		this.transBctbUploadPayExcPK = transBctbUploadPayExcPK;
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

	public Long getNumTracersSent() {
		return numTracersSent;
	}

	public void setNumTracersSent(Long numTracersSent) {
		this.numTracersSent = numTracersSent;
	}

	public Date getNextTracerDate() {
		return nextTracerDate;
	}

	public void setNextTracerDate(Date nextTracerDate) {
		this.nextTracerDate = nextTracerDate;
	}

	public String getPaymentExceptionFlag() {
		return paymentExceptionFlag;
	}

	public void setPaymentExceptionFlag(String paymentExceptionFlag) {
		this.paymentExceptionFlag = paymentExceptionFlag;
	}

	public String getTracerReceiverPartyType() {
		return tracerReceiverPartyType;
	}

	public void setTracerReceiverPartyType(String tracerReceiverPartyType) {
		this.tracerReceiverPartyType = tracerReceiverPartyType;
	}

	public Date getPaymentMsgDate() {
		return paymentMsgDate;
	}

	public void setPaymentMsgDate(Date paymentMsgDate) {
		this.paymentMsgDate = paymentMsgDate;
	}

	public Date getNonPaymentMsgDate() {
		return nonPaymentMsgDate;
	}

	public void setNonPaymentMsgDate(Date nonPaymentMsgDate) {
		this.nonPaymentMsgDate = nonPaymentMsgDate;
	}

	public String getProtestFlag() {
		return protestFlag;
	}

	public void setProtestFlag(String protestFlag) {
		this.protestFlag = protestFlag;
	}

	public Date getDateOfProtest() {
		return dateOfProtest;
	}

	public void setDateOfProtest(Date dateOfProtest) {
		this.dateOfProtest = dateOfProtest;
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
	
    
	

}
