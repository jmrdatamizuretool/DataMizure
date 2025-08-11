package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_FFT database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_FFT")
public class TransBctbUploadFft implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadFftPK transBctbUploadFftPK;
	
	@Column(name = "CONV_STATUS")
    private String convStatus ;

    @Column(name = "ERR_MSG")
    private String errMsg;

    @Lob
    @Column(name = "FREE_FORMAT_TEXT")
    private String freeFormatText;

	public TransBctbUploadFftPK getTransBctbUploadFftPK() {
		return transBctbUploadFftPK;
	}

	public void setTransBctbUploadFftPK(TransBctbUploadFftPK transBctbUploadFftPK) {
		this.transBctbUploadFftPK = transBctbUploadFftPK;
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

	public String getFreeFormatText() {
		return freeFormatText;
	}

	public void setFreeFormatText(String freeFormatText) {
		this.freeFormatText = freeFormatText;
	}
    
    

}
