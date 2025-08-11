package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_PAY_FATE database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_PAY_FATE")
public class TransBctbUploadPayFate  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadPayFatePK transBctbUploadPayFatePK;
	
	 	@Column(name = "advfate_reqd_flag")
	    private String advfateReqdFlag;

	    @Column(name = "advfate_medium")
	    private String advfateMedium;

	    @Column(name = "previous_advfate_date")
	    private Date previousAdvfateDate;

	    @Column(name = "num_advfates_sent")
	    private Long numAdvfatesSent;

	    @Column(name = "next_advfate_date")
	    private Date nextAdvfateDate;

	    @Column(name = "advfate_receiver_partytype")
	    private String advfateReceiverPartytype;

	    @Column(name = "manually_generate_flag")
	    private String manuallyGenerateFlag;

	    @Column(name = "conv_status")
	    private String convStatus;

	    @Column(name = "err_msg")
	    private String errMsg;

		public TransBctbUploadPayFatePK getTransBctbUploadPayFatePK() {
			return transBctbUploadPayFatePK;
		}

		public void setTransBctbUploadPayFatePK(TransBctbUploadPayFatePK transBctbUploadPayFatePK) {
			this.transBctbUploadPayFatePK = transBctbUploadPayFatePK;
		}

		public String getAdvfateReqdFlag() {
			return advfateReqdFlag;
		}

		public void setAdvfateReqdFlag(String advfateReqdFlag) {
			this.advfateReqdFlag = advfateReqdFlag;
		}

		public String getAdvfateMedium() {
			return advfateMedium;
		}

		public void setAdvfateMedium(String advfateMedium) {
			this.advfateMedium = advfateMedium;
		}

		public Date getPreviousAdvfateDate() {
			return previousAdvfateDate;
		}

		public void setPreviousAdvfateDate(Date previousAdvfateDate) {
			this.previousAdvfateDate = previousAdvfateDate;
		}

		public Long getNumAdvfatesSent() {
			return numAdvfatesSent;
		}

		public void setNumAdvfatesSent(Long numAdvfatesSent) {
			this.numAdvfatesSent = numAdvfatesSent;
		}

		public Date getNextAdvfateDate() {
			return nextAdvfateDate;
		}

		public void setNextAdvfateDate(Date nextAdvfateDate) {
			this.nextAdvfateDate = nextAdvfateDate;
		}

		public String getAdvfateReceiverPartytype() {
			return advfateReceiverPartytype;
		}

		public void setAdvfateReceiverPartytype(String advfateReceiverPartytype) {
			this.advfateReceiverPartytype = advfateReceiverPartytype;
		}

		public String getManuallyGenerateFlag() {
			return manuallyGenerateFlag;
		}

		public void setManuallyGenerateFlag(String manuallyGenerateFlag) {
			this.manuallyGenerateFlag = manuallyGenerateFlag;
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

	    
}
