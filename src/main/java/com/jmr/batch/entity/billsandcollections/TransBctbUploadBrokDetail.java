package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the BCTB_UPLOAD_BROK_DETAIL database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_BROK_DETAIL")
public class TransBctbUploadBrokDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadBrokDetailPK transBctbUploadBrokDetailPK;
	
	@Column(name = "BROKER_ACC")
    private String brokerAcc;

    @Column(name = "BROKER_ACC_CCY")
    private String brokerAccCcy;

    @Column(name = "BROKER_PERCENT")
    private Long brokerPercent;

    @Column(name = "BROKAMT_CON_CCY")
    private Long brokamtConCcy;

    @Column(name = "EXCHANGE_RATE")
    private Long exchangeRate;

    @Column(name = "ORIGINAL_EX_RATE")
    private Long originalExRate;

    @Column(name = "BROKAMT_ACC_CCY")
    private Long brokamtAccCcy;

    @Column(name = "NEGOTIATED_RATE")
    private Long negotiatedRate;

    @Column(name = "NEGOTIATION_REF_NO")
    private String negotiationRefNo;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "LIQ_STATUS")
    private Long liqStatus;

	public TransBctbUploadBrokDetailPK getTransBctbUploadBrokDetailPK() {
		return transBctbUploadBrokDetailPK;
	}

	public void setTransBctbUploadBrokDetailPK(TransBctbUploadBrokDetailPK transBctbUploadBrokDetailPK) {
		this.transBctbUploadBrokDetailPK = transBctbUploadBrokDetailPK;
	}

	public String getBrokerAcc() {
		return brokerAcc;
	}

	public void setBrokerAcc(String brokerAcc) {
		this.brokerAcc = brokerAcc;
	}

	public String getBrokerAccCcy() {
		return brokerAccCcy;
	}

	public void setBrokerAccCcy(String brokerAccCcy) {
		this.brokerAccCcy = brokerAccCcy;
	}

	public Long getBrokerPercent() {
		return brokerPercent;
	}

	public void setBrokerPercent(Long brokerPercent) {
		this.brokerPercent = brokerPercent;
	}

	public Long getBrokamtConCcy() {
		return brokamtConCcy;
	}

	public void setBrokamtConCcy(Long brokamtConCcy) {
		this.brokamtConCcy = brokamtConCcy;
	}

	public Long getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Long exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Long getOriginalExRate() {
		return originalExRate;
	}

	public void setOriginalExRate(Long originalExRate) {
		this.originalExRate = originalExRate;
	}

	public Long getBrokamtAccCcy() {
		return brokamtAccCcy;
	}

	public void setBrokamtAccCcy(Long brokamtAccCcy) {
		this.brokamtAccCcy = brokamtAccCcy;
	}

	public Long getNegotiatedRate() {
		return negotiatedRate;
	}

	public void setNegotiatedRate(Long negotiatedRate) {
		this.negotiatedRate = negotiatedRate;
	}

	public String getNegotiationRefNo() {
		return negotiationRefNo;
	}

	public void setNegotiationRefNo(String negotiationRefNo) {
		this.negotiationRefNo = negotiationRefNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getLiqStatus() {
		return liqStatus;
	}

	public void setLiqStatus(Long liqStatus) {
		this.liqStatus = liqStatus;
	}
    
    

}
