package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jmr.batch.entity.loan.TransCltbAcCompUploadPK;

/**
 * The persistent class for the BCTB_UPLOAD_DOCS_CLAUSES database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_DOCS_CLAUSES")
public class TransBctbUploadDocsClauses implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransBctbUploadDocsClausesPK transBctbUploadDocsClausesPK;
	
	@Column(name = "CLAUSE_SL_NO")
    private Long clauseSlNo;

    @Column(name = "CLAUSE_DESCR")
    private String clauseDescr;

	public TransBctbUploadDocsClausesPK getTransBctbUploadDocsClausesPK() {
		return transBctbUploadDocsClausesPK;
	}

	public void setTransBctbUploadDocsClausesPK(TransBctbUploadDocsClausesPK transBctbUploadDocsClausesPK) {
		this.transBctbUploadDocsClausesPK = transBctbUploadDocsClausesPK;
	}

	public Long getClauseSlNo() {
		return clauseSlNo;
	}

	public void setClauseSlNo(Long clauseSlNo) {
		this.clauseSlNo = clauseSlNo;
	}

	public String getClauseDescr() {
		return clauseDescr;
	}

	public void setClauseDescr(String clauseDescr) {
		this.clauseDescr = clauseDescr;
	}
    
    

}
