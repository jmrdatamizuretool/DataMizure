package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRANS_CLTB_ACC_PARTIES_UPLOAD database table.
 * 
 */
@Entity
@Table(name="TRANS_CLTB_ACC_PARTIES_UPLOAD")
@NamedQuery(name="TransCltbAccPartiesUpload.findAll", query="SELECT c FROM TransCltbAccPartiesUpload c")
public class TransCltbAccPartiesUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCltbAccPartiesUploadPK id;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	private BigDecimal liability;

	@Column(name="LIABILITY_AMT")
	private BigDecimal liabilityAmt;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	public TransCltbAccPartiesUpload() {
	}

	public TransCltbAccPartiesUploadPK getId() {
		return this.id;
	}

	public void setId(TransCltbAccPartiesUploadPK id) {
		this.id = id;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getLiability() {
		return this.liability;
	}

	public void setLiability(BigDecimal liability) {
		this.liability = liability;
	}

	public BigDecimal getLiabilityAmt() {
		return this.liabilityAmt;
	}

	public void setLiabilityAmt(BigDecimal liabilityAmt) {
		this.liabilityAmt = liabilityAmt;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}