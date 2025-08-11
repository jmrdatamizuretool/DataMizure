package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the TRANS_BCTB_UPLOAD_BROK_MASTER database table.
 * 
 */
@Entity
@Table(name="TRANS_BCTB_UPLOAD_BROK_MASTER")
public class TransBctbUploadBrokMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadBrokMasterPK transBctbUploadBrokMasterPK;
	
	@Column(name = "CONTRACT_CCY")
    private String contractCcy;

    @Column(name = "CONTRACT_AMT")
    private Long contractAmt;

    @Column(name = "BROKERAGE_PERCENT")
    private Long brokeragePercent;

    @Column(name = "BROKERAGE_AMT")
    private Long brokerageAmt;

	public TransBctbUploadBrokMasterPK getTransBctbUploadBrokMasterPK() {
		return transBctbUploadBrokMasterPK;
	}

	public void setTransBctbUploadBrokMasterPK(TransBctbUploadBrokMasterPK transBctbUploadBrokMasterPK) {
		this.transBctbUploadBrokMasterPK = transBctbUploadBrokMasterPK;
	}

	public String getContractCcy() {
		return contractCcy;
	}

	public void setContractCcy(String contractCcy) {
		this.contractCcy = contractCcy;
	}

	public Long getContractAmt() {
		return contractAmt;
	}

	public void setContractAmt(Long contractAmt) {
		this.contractAmt = contractAmt;
	}

	public Long getBrokeragePercent() {
		return brokeragePercent;
	}

	public void setBrokeragePercent(Long brokeragePercent) {
		this.brokeragePercent = brokeragePercent;
	}

	public Long getBrokerageAmt() {
		return brokerageAmt;
	}

	public void setBrokerageAmt(Long brokerageAmt) {
		this.brokerageAmt = brokerageAmt;
	}
    
}
