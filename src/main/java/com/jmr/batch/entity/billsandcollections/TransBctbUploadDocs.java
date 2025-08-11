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
 * The persistent class for the BCTB_UPLOAD_DOCS_CLAUSES database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_DOCS_CLAUSES")
public class TransBctbUploadDocs implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadDocsPK transBctbUploadDocsPK;
	
	@Column(name = "DOC_DESCRIPTION")
    private String docDescription;

    @Column(name = "DOC_SL_NO")
    private Long docSlNo;

    @Column(name = "FIRSTMAIL_COPIES")
    private Long firstmailCopies;

    @Column(name = "SECONDMAIL_COPIES")
    private Long secondmailCopies;

    @Column(name = "REIM_BANK_COPIES")
    private Long reimBankCopies;

    @Column(name = "DOC_REF")
    private String docRef;

    @Column(name = "DOC_DATE")
    @Temporal(TemporalType.DATE)
    private Date docDate;

    @Column(name = "COVERING_LETTER_REF")
    private String coveringLetterRef;

    @Column(name = "COVERING_LETTER_DATE")
    @Temporal(TemporalType.DATE)
    private Date coveringLetterDate;

    @Column(name = "CONV_STATUS")
    private String convStatus;

    @Column(name = "ERR_MSG")
    private String errMsg;

    @Column(name = "FIRSTMAIL_ORIGINALS")
    private String firstmailOriginals;

    @Column(name = "SECONDMAIL_ORIGINALS")
    private String secondmailOriginals;

	public TransBctbUploadDocsPK getTransBctbUploadDocsPK() {
		return transBctbUploadDocsPK;
	}

	public void setTransBctbUploadDocsPK(TransBctbUploadDocsPK transBctbUploadDocsPK) {
		this.transBctbUploadDocsPK = transBctbUploadDocsPK;
	}

	public String getDocDescription() {
		return docDescription;
	}

	public void setDocDescription(String docDescription) {
		this.docDescription = docDescription;
	}

	public Long getDocSlNo() {
		return docSlNo;
	}

	public void setDocSlNo(Long docSlNo) {
		this.docSlNo = docSlNo;
	}

	public Long getFirstmailCopies() {
		return firstmailCopies;
	}

	public void setFirstmailCopies(Long firstmailCopies) {
		this.firstmailCopies = firstmailCopies;
	}

	public Long getSecondmailCopies() {
		return secondmailCopies;
	}

	public void setSecondmailCopies(Long secondmailCopies) {
		this.secondmailCopies = secondmailCopies;
	}

	public Long getReimBankCopies() {
		return reimBankCopies;
	}

	public void setReimBankCopies(Long reimBankCopies) {
		this.reimBankCopies = reimBankCopies;
	}

	public String getDocRef() {
		return docRef;
	}

	public void setDocRef(String docRef) {
		this.docRef = docRef;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public String getCoveringLetterRef() {
		return coveringLetterRef;
	}

	public void setCoveringLetterRef(String coveringLetterRef) {
		this.coveringLetterRef = coveringLetterRef;
	}

	public Date getCoveringLetterDate() {
		return coveringLetterDate;
	}

	public void setCoveringLetterDate(Date coveringLetterDate) {
		this.coveringLetterDate = coveringLetterDate;
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

	public String getFirstmailOriginals() {
		return firstmailOriginals;
	}

	public void setFirstmailOriginals(String firstmailOriginals) {
		this.firstmailOriginals = firstmailOriginals;
	}

	public String getSecondmailOriginals() {
		return secondmailOriginals;
	}

	public void setSecondmailOriginals(String secondmailOriginals) {
		this.secondmailOriginals = secondmailOriginals;
	}
    
    

}
