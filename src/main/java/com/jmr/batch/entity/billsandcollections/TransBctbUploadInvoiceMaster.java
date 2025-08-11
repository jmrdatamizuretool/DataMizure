package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_INVOICE_MASTER database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_INVOICE_MASTER")
public class TransBctbUploadInvoiceMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadInvoiceMasterPK transBctbUploadInvoiceMasterPK;
	
	@Column(name = "MARGIN_IND")
    private String marginInd;

    @Column(name = "MARGIN")
    private Long margin;

    @Column(name = "ELIGIBLE_AMOUNT")
    private Long eligibleAmount;

    @Column(name = "INVOICE_CCY")
    private String invoiceCcy;

	public TransBctbUploadInvoiceMasterPK gettransBctbUploadInvoiceMasterPK() {
		return transBctbUploadInvoiceMasterPK;
	}

	public void settransBctbUploadInvoiceMasterPK(TransBctbUploadInvoiceMasterPK transBctbUploadInvoiceMasterPK) {
		this.transBctbUploadInvoiceMasterPK = transBctbUploadInvoiceMasterPK;
	}

	public String getMarginInd() {
		return marginInd;
	}

	public void setMarginInd(String marginInd) {
		this.marginInd = marginInd;
	}

	public Long getMargin() {
		return margin;
	}

	public void setMargin(Long margin) {
		this.margin = margin;
	}

	public Long getEligibleAmount() {
		return eligibleAmount;
	}

	public void setEligibleAmount(Long eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}

	public String getInvoiceCcy() {
		return invoiceCcy;
	}

	public void setInvoiceCcy(String invoiceCcy) {
		this.invoiceCcy = invoiceCcy;
	}
    
    

}
