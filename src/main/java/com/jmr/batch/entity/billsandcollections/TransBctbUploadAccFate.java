package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



/**
 * The persistent class for the BCTB_UPLOAD_ACC_FATE database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_ACC_FATE")
public class TransBctbUploadAccFate implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
		@EmbeddedId
		private TransBctbUploadAccFatePK transBctbUploadAccFatePK;
	
	 	@Column(name = "ADVFATE_REQD_FLAG")
	    private String advfateReqdFlag;

	    @Column(name = "ADVFATE_MEDIUM")
	    private String advfateMedium;

	    @Column(name = "PREVIOUS_ADVFATE_DATE")
	    private Date previousAdvfateDate;

	    @Column(name = "NUM_ADVFATES_SENT")
	    private Long numAdvfatesSent;

	    @Column(name = "NEXT_ADVFATE_DATE")
	    private Date nextAdvfateDate;

	    @Column(name = "ADVFATE_RECEIVER_PARTYTYPE")
	    private String advfateReceiverPartyType;

	    @Column(name = "MANUALLY_GENERATE_FLAG")
	    private String manuallyGenerateFlag;

	    @Column(name = "CONV_STATUS")
	    private String convStatus;

	    @Column(name = "ERR_MSG")
	    private String errMsg;

		public TransBctbUploadAccFatePK getTransBctbUploadAccFatePK() {
			return transBctbUploadAccFatePK;
		}

		public void setTransBctbUploadAccFatePK(TransBctbUploadAccFatePK transBctbUploadAccFatePK) {
			this.transBctbUploadAccFatePK = transBctbUploadAccFatePK;
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

		public String getAdvfateReceiverPartyType() {
			return advfateReceiverPartyType;
		}

		public void setAdvfateReceiverPartyType(String advfateReceiverPartyType) {
			this.advfateReceiverPartyType = advfateReceiverPartyType;
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
