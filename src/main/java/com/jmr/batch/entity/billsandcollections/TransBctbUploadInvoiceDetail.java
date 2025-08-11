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
 * The persistent class for the BCTB_UPLOAD_INVOICE_DETAIL database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_INVOICE_DETAIL")
public class TransBctbUploadInvoiceDetail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadInvoiceDetailPK transBctbUploadInvoiceDetailPK;
	
	@Column(name = "INVOICE_NO", length = 30)
    private String invoiceNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "INVOICE_DATE")
    private Date invoiceDate;

    @Column(name = "AMOUNT")
    private Long amount;

	public TransBctbUploadInvoiceDetailPK getTransBctbUploadInvoiceDetailPK() {
		return transBctbUploadInvoiceDetailPK;
	}

	public void setTransBctbUploadInvoiceDetailPK(TransBctbUploadInvoiceDetailPK transBctbUploadInvoiceDetailPK) {
		this.transBctbUploadInvoiceDetailPK = transBctbUploadInvoiceDetailPK;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
    
    

}
