package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_PAY_EXC database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_RESERVE")
public class TransBctbUploadReserve implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadReservePK transBctbUploadReservePK;
	
	 @Column(name = "under_reserve_flag")
	    private String underReserveFlag;

	    @Column(name = "tracer_reqd_flag")
	    private String tracerReqdFlag;

	    @Column(name = "num_tracers_tobe_sent")
	    private Long numTracersToBeSent;

	    @Column(name = "tracer_medium")
	    private String tracerMedium;

	    @Column(name = "tracer_frequency")
	    private Long tracerFrequency;

	    @Column(name = "tracer_start_date")
	    private Date tracerStartDate;

	    @Column(name = "previous_tracer_date")
	    private Date previousTracerDate;

	    @Column(name = "num_tracers_sent")
	    private Long numTracersSent;

	    @Column(name = "next_tracer_date")
	    private Date nextTracerDate;

	    @Column(name = "reserve_release_date")
	    private Date reserveReleaseDate;

	    @Column(name = "cable_issuing_bank_flag")
	    private String cableIssuingBankFlag;

	    @Column(name = "disc_approved_date")
	    private Date discApprovedDate;

	    @Column(name = "reserve_exception_flag")
	    private String reserveExceptionFlag;

	    @Column(name = "tracer_receiver_partytype")
	    private String tracerReceiverPartyType;

		public TransBctbUploadReservePK getTransBctbUploadReservePK() {
			return transBctbUploadReservePK;
		}

		public void setTransBctbUploadPayExcPK(TransBctbUploadReservePK transBctbUploadReservePK) {
			this.transBctbUploadReservePK = transBctbUploadReservePK;
		}

		public String getUnderReserveFlag() {
			return underReserveFlag;
		}

		public void setUnderReserveFlag(String underReserveFlag) {
			this.underReserveFlag = underReserveFlag;
		}

		public String getTracerReqdFlag() {
			return tracerReqdFlag;
		}

		public void setTracerReqdFlag(String tracerReqdFlag) {
			this.tracerReqdFlag = tracerReqdFlag;
		}

		public Long getNumTracersToBeSent() {
			return numTracersToBeSent;
		}

		public void setNumTracersToBeSent(Long numTracersToBeSent) {
			this.numTracersToBeSent = numTracersToBeSent;
		}

		public String getTracerMedium() {
			return tracerMedium;
		}

		public void setTracerMedium(String tracerMedium) {
			this.tracerMedium = tracerMedium;
		}

		public Long getTracerFrequency() {
			return tracerFrequency;
		}

		public void setTracerFrequency(Long tracerFrequency) {
			this.tracerFrequency = tracerFrequency;
		}

		public Date getTracerStartDate() {
			return tracerStartDate;
		}

		public void setTracerStartDate(Date tracerStartDate) {
			this.tracerStartDate = tracerStartDate;
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

		public Date getReserveReleaseDate() {
			return reserveReleaseDate;
		}

		public void setReserveReleaseDate(Date reserveReleaseDate) {
			this.reserveReleaseDate = reserveReleaseDate;
		}

		public String getCableIssuingBankFlag() {
			return cableIssuingBankFlag;
		}

		public void setCableIssuingBankFlag(String cableIssuingBankFlag) {
			this.cableIssuingBankFlag = cableIssuingBankFlag;
		}

		public Date getDiscApprovedDate() {
			return discApprovedDate;
		}

		public void setDiscApprovedDate(Date discApprovedDate) {
			this.discApprovedDate = discApprovedDate;
		}

		public String getReserveExceptionFlag() {
			return reserveExceptionFlag;
		}

		public void setReserveExceptionFlag(String reserveExceptionFlag) {
			this.reserveExceptionFlag = reserveExceptionFlag;
		}

		public String getTracerReceiverPartyType() {
			return tracerReceiverPartyType;
		}

		public void setTracerReceiverPartyType(String tracerReceiverPartyType) {
			this.tracerReceiverPartyType = tracerReceiverPartyType;
		}
	    
}
