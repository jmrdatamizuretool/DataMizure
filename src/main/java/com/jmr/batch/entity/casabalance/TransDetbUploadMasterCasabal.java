package com.jmr.batch.entity.casabalance;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the TRANS_DETB_UPLOAD_MASTER_CASABAL database table.
 * 
 */
@Entity
@Table(name="TRANS_DETB_UPLOAD_MASTER_CASABAL")
public class TransDetbUploadMasterCasabal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransDetbUploadMasterCasabalPK id;

	@Column(name="AUTH_STAT")
	private String authStat;

	@Column(name="AUTO_AUTH")
	private String autoAuth;
	@Column(name="BALANCING")
	private String balancing;

	@Column(name="BATCH_DESC")
	private String batchDesc;


	@Column(name="CHECKER_DT_STAMP")
	private Date checkerDtStamp;

	@Column(name="CHECKER_ID")
	private String checkerId;

	@Column(name="CR_ENT_TOTAL")
	private Double crEntTotal;

	@Column(name="DR_ENT_TOTAL")
	private Double drEntTotal;

	@Column(name="GL_OFFSET_ENTRY_REQD")
	private String glOffsetEntryReqd;

	@Column(name="IGNORE_OVERRIDES")
	private String ignoreOverrides;

	@Column(name="JOBNO")
	private Double jobno;


	@Column(name="MAKER_DT_STAMP")
	private Date makerDtStamp;

	@Column(name="MAKER_ID")
	private String makerId;

	@Column(name="MIS_REQUIRED")
	private String misRequired;

	@Column(name="MOD_NO")
	private Double modNo;

	@Column(name="OFFSET_GL")
	private String offsetGl;

	@Column(name="ONCE_AUTH")
	private String onceAuth;

	@Column(name="POSITION_REQD")
	private String positionReqd;

	@Column(name="RECORD_STAT")
	private String recordStat;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="SYSTEM_BATCH")
	private String systemBatch;

	@Column(name="TOTAL_ENTRIES")
	private Double totalEntries;

	@Column(name="TXN_CODE")
	private String txnCode;

	@Column(name="UDF_UPLOAD_REQD")
	private String udfUploadReqd;

	
	@Column(name="UPLOAD_DATE")
	private Date uploadDate;

	@Column(name="UPLOAD_FILE_NAME")
	private String uploadFileName;

	@Column(name="UPLOAD_STAT")
	private String uploadStat;

	@Column(name="UPLOADED_ENTRIES")
	private Double uploadedEntries;

	@Column(name="USER_ID")
	private String userId;

	public TransDetbUploadMasterCasabal() {
	}

	public TransDetbUploadMasterCasabalPK getId() {
		return this.id;
	}

	public void setId(TransDetbUploadMasterCasabalPK id) {
		this.id = id;
	}

	public String getAuthStat() {
		return this.authStat;
	}

	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}

	public String getAutoAuth() {
		return this.autoAuth;
	}

	public void setAutoAuth(String autoAuth) {
		this.autoAuth = autoAuth;
	}

	public String getBalancing() {
		return this.balancing;
	}

	public void setBalancing(String balancing) {
		this.balancing = balancing;
	}

	public String getBatchDesc() {
		return this.batchDesc;
	}

	public void setBatchDesc(String batchDesc) {
		this.batchDesc = batchDesc;
	}

	public Date getCheckerDtStamp() {
		return this.checkerDtStamp;
	}

	public void setCheckerDtStamp(Date checkerDtStamp) {
		this.checkerDtStamp = checkerDtStamp;
	}

	public String getCheckerId() {
		return this.checkerId;
	}

	public void setCheckerId(String checkerId) {
		this.checkerId = checkerId;
	}

	public Double getCrEntTotal() {
		return this.crEntTotal;
	}

	public void setCrEntTotal(Double crEntTotal) {
		this.crEntTotal = crEntTotal;
	}

	public Double getDrEntTotal() {
		return this.drEntTotal;
	}

	public void setDrEntTotal(Double drEntTotal) {
		this.drEntTotal = drEntTotal;
	}

	public String getGlOffsetEntryReqd() {
		return this.glOffsetEntryReqd;
	}

	public void setGlOffsetEntryReqd(String glOffsetEntryReqd) {
		this.glOffsetEntryReqd = glOffsetEntryReqd;
	}

	public String getIgnoreOverrides() {
		return this.ignoreOverrides;
	}

	public void setIgnoreOverrides(String ignoreOverrides) {
		this.ignoreOverrides = ignoreOverrides;
	}

	public Double getJobno() {
		return this.jobno;
	}

	public void setJobno(Double jobno) {
		this.jobno = jobno;
	}

	public Date getMakerDtStamp() {
		return this.makerDtStamp;
	}

	public void setMakerDtStamp(Date makerDtStamp) {
		this.makerDtStamp = makerDtStamp;
	}

	public String getMakerId() {
		return this.makerId;
	}

	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}

	public String getMisRequired() {
		return this.misRequired;
	}

	public void setMisRequired(String misRequired) {
		this.misRequired = misRequired;
	}

	public Double getModNo() {
		return this.modNo;
	}

	public void setModNo(Double modNo) {
		this.modNo = modNo;
	}

	public String getOffsetGl() {
		return this.offsetGl;
	}

	public void setOffsetGl(String offsetGl) {
		this.offsetGl = offsetGl;
	}

	public String getOnceAuth() {
		return this.onceAuth;
	}

	public void setOnceAuth(String onceAuth) {
		this.onceAuth = onceAuth;
	}

	public String getPositionReqd() {
		return this.positionReqd;
	}

	public void setPositionReqd(String positionReqd) {
		this.positionReqd = positionReqd;
	}

	public String getRecordStat() {
		return this.recordStat;
	}

	public void setRecordStat(String recordStat) {
		this.recordStat = recordStat;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSystemBatch() {
		return this.systemBatch;
	}

	public void setSystemBatch(String systemBatch) {
		this.systemBatch = systemBatch;
	}

	public Double getTotalEntries() {
		return this.totalEntries;
	}

	public void setTotalEntries(Double totalEntries) {
		this.totalEntries = totalEntries;
	}

	public String getTxnCode() {
		return this.txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public String getUdfUploadReqd() {
		return this.udfUploadReqd;
	}

	public void setUdfUploadReqd(String udfUploadReqd) {
		this.udfUploadReqd = udfUploadReqd;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getUploadFileName() {
		return this.uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadStat() {
		return this.uploadStat;
	}

	public void setUploadStat(String uploadStat) {
		this.uploadStat = uploadStat;
	}

	public Double getUploadedEntries() {
		return this.uploadedEntries;
	}

	public void setUploadedEntries(Double uploadedEntries) {
		this.uploadedEntries = uploadedEntries;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}