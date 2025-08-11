package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_INSURANCE database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_INSURANCE")
public class TransBctbUploadInsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadInsurancePK transBctbUploadInsurancePK;
	
	 	@Column(name = "BCREFNO")
	    private String bcrefno;

	    @Column(name = "INSURANCE_COMP_CODE")
	    private String insuranceCompCode;

	    @Column(name = "INSURANCE_COMP_NAME")
	    private String insuranceCompName;

	    @Column(name = "INSURANCE_POL_NO")
	    private String insurancePolNo;

	    @Column(name = "CONV_STATUS")
	    private String convStatus;

	    @Column(name = "ERR_MSG")
	    private String errMsg;

		public TransBctbUploadInsurancePK getTransBctbUploadInsurancePK() {
			return transBctbUploadInsurancePK;
		}

		public void setTransBctbUploadInsurancePK(TransBctbUploadInsurancePK transBctbUploadInsurancePK) {
			this.transBctbUploadInsurancePK = transBctbUploadInsurancePK;
		}

		public String getBcrefno() {
			return bcrefno;
		}

		public void setBcrefno(String bcrefno) {
			this.bcrefno = bcrefno;
		}

		public String getInsuranceCompCode() {
			return insuranceCompCode;
		}

		public void setInsuranceCompCode(String insuranceCompCode) {
			this.insuranceCompCode = insuranceCompCode;
		}

		public String getInsuranceCompName() {
			return insuranceCompName;
		}

		public void setInsuranceCompName(String insuranceCompName) {
			this.insuranceCompName = insuranceCompName;
		}

		public String getInsurancePolNo() {
			return insurancePolNo;
		}

		public void setInsurancePolNo(String insurancePolNo) {
			this.insurancePolNo = insurancePolNo;
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
