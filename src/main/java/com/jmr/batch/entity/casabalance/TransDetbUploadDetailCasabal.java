package com.jmr.batch.entity.casabalance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the TRANS_DETB_UPLOAD_DETAIL_CASABAL database table.
 * 
 */
@Entity
@Table(name="TRANS_DETB_UPLOAD_DETAIL_CASABAL")
public class TransDetbUploadDetailCasabal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransDetbUploadDetailCasabalPK id;

	@Column(name="ACCOUNT")
	private String account;

	@Column(name="ACCOUNT_BRANCH")
	private String accountBranch;

	@Column(name="ACCOUNT_NEW")
	private String accountNew;

	@Column(name="ADDL_TEXT")
	private String addlText;

	@Column(name="AMOUNT")
	private Double amount;

	@Column(name="CALC_METHOD")
	private String calcMethod;

	@Column(name="CCY_CD")
	private String ccyCd;

	@Column(name="COMP_MIS_1")
	private String compMis1;

	@Column(name="COMP_MIS_10")
	private String compMis10;

	@Column(name="COMP_MIS_2")
	private String compMis2;

	@Column(name="COMP_MIS_3")
	private String compMis3;

	@Column(name="COMP_MIS_4")
	private String compMis4;

	@Column(name="COMP_MIS_5")
	private String compMis5;

	@Column(name="COMP_MIS_6")
	private String compMis6;

	@Column(name="COMP_MIS_7")
	private String compMis7;

	@Column(name="COMP_MIS_8")
	private String compMis8;

	@Column(name="COMP_MIS_9")
	private String compMis9;

	@Column(name="COST_CODE1")
	private String costCode1;

	@Column(name="COST_CODE2")
	private String costCode2;

	@Column(name="COST_CODE3")
	private String costCode3;

	@Column(name="COST_CODE4")
	private String costCode4;

	@Column(name="COST_CODE5")
	private String costCode5;

	@Column(name="DELETE_STAT")
	private String deleteStat;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="DW_AC_NO")
	private String dwAcNo;

	@Column(name="EXCH_RATE")
	private Double exchRate;

	@Column(name="EXTERNAL_REF_NO")
	private String externalRefNo;

	@Column(name="FIN_CYCLE")
	private String finCycle;

	
	@Column(name="INITIATION_DATE")
	private Date initiationDate;

	@Column(name="INSTRUMENT_NO")
	private String instrumentNo;

	@Column(name="LCY_EQUIVALENT")
	private Double lcyEquivalent;

	@Column(name="MIS_CODE")
	private String misCode;

	@Column(name="MIS_FLAG")
	private String misFlag;

	@Column(name="MIS_GROUP")
	private String misGroup;

	@Column(name="MIS_GROUP_TXN")
	private String misGroupTxn;

	@Column(name="MIS_HEAD")
	private String misHead;

	@Column(name="PERIOD_CODE")
	private String periodCode;

	@Column(name="POOL_CODE")
	private String poolCode;

	@Column(name="REF_RATE")
	private Double refRate;

	@Column(name="REL_CUST")
	private String relCust;

	@Column(name="RELATED_ACCOUNT")
	private String relatedAccount;

	@Column(name="RELATED_REF")
	private String relatedRef;

	@Column(name="RESERVED_FUNDS_REF")
	private String reservedFundsRef;

	@Column(name="TXN_CODE")
	private String txnCode;

	@Column(name="TXN_MIS_1")
	private String txnMis1;

	@Column(name="TXN_MIS_10")
	private String txnMis10;

	@Column(name="TXN_MIS_2")
	private String txnMis2;

	@Column(name="TXN_MIS_3")
	private String txnMis3;

	@Column(name="TXN_MIS_4")
	private String txnMis4;

	@Column(name="TXN_MIS_5")
	private String txnMis5;

	@Column(name="TXN_MIS_6")
	private String txnMis6;

	@Column(name="TXN_MIS_7")
	private String txnMis7;

	@Column(name="TXN_MIS_8")
	private String txnMis8;

	@Column(name="TXN_MIS_9")
	private String txnMis9;

	@Column(name="TXT_FILE_NAME")
	private String txtFileName;


	@Column(name="UPLOAD_DATE")
	private Date uploadDate;

	@Column(name="UPLOAD_STAT")
	private String uploadStat;


	@Column(name="VALUE_DATE")
	private Date valueDate;
	@Column(name="FUND_MIS_1")
	private String fundMis1;
	@Column(name="FUND_MIS_2")
	private String fundMis2;
	
	@Column(name="FUND_MIS_3")
	private String fundMis3;
	
	@Column(name="FUND_MIS_4")
	private String fundMis4;


	
	@Column(name="FUND_MIS_5")
	private String fundMis5;
	@Column(name="FUND_MIS_6")
	private String fundMis6;
	@Column(name="FUND_MIS_7")
	private String fundMis7;
	@Column(name="FUND_MIS_8")
	private String fundMis8;
	@Column(name="FUND_MIS_9")
	private String fundMis9;
	@Column(name="FUND_MIS_10")
	private String fundMis10;
	
	

	public TransDetbUploadDetailCasabal() {
	}

	public TransDetbUploadDetailCasabalPK getId() {
		return this.id;
	}

	public void setId(TransDetbUploadDetailCasabalPK id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountBranch() {
		return this.accountBranch;
	}

	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	public String getAccountNew() {
		return this.accountNew;
	}

	public void setAccountNew(String accountNew) {
		this.accountNew = accountNew;
	}

	public String getAddlText() {
		return this.addlText;
	}

	public void setAddlText(String addlText) {
		this.addlText = addlText;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCalcMethod() {
		return this.calcMethod;
	}

	public void setCalcMethod(String calcMethod) {
		this.calcMethod = calcMethod;
	}

	public String getCcyCd() {
		return this.ccyCd;
	}

	public void setCcyCd(String ccyCd) {
		this.ccyCd = ccyCd;
	}

	public String getCompMis1() {
		return this.compMis1;
	}

	public void setCompMis1(String compMis1) {
		this.compMis1 = compMis1;
	}

	public String getCompMis10() {
		return this.compMis10;
	}

	public void setCompMis10(String compMis10) {
		this.compMis10 = compMis10;
	}

	public String getCompMis2() {
		return this.compMis2;
	}

	public void setCompMis2(String compMis2) {
		this.compMis2 = compMis2;
	}

	public String getCompMis3() {
		return this.compMis3;
	}

	public void setCompMis3(String compMis3) {
		this.compMis3 = compMis3;
	}

	public String getCompMis4() {
		return this.compMis4;
	}

	public void setCompMis4(String compMis4) {
		this.compMis4 = compMis4;
	}

	public String getCompMis5() {
		return this.compMis5;
	}

	public void setCompMis5(String compMis5) {
		this.compMis5 = compMis5;
	}

	public String getCompMis6() {
		return this.compMis6;
	}

	public void setCompMis6(String compMis6) {
		this.compMis6 = compMis6;
	}

	public String getCompMis7() {
		return this.compMis7;
	}

	public void setCompMis7(String compMis7) {
		this.compMis7 = compMis7;
	}

	public String getCompMis8() {
		return this.compMis8;
	}

	public void setCompMis8(String compMis8) {
		this.compMis8 = compMis8;
	}

	public String getCompMis9() {
		return this.compMis9;
	}

	public void setCompMis9(String compMis9) {
		this.compMis9 = compMis9;
	}

	public String getCostCode1() {
		return this.costCode1;
	}

	public void setCostCode1(String costCode1) {
		this.costCode1 = costCode1;
	}

	public String getCostCode2() {
		return this.costCode2;
	}

	public void setCostCode2(String costCode2) {
		this.costCode2 = costCode2;
	}

	public String getCostCode3() {
		return this.costCode3;
	}

	public void setCostCode3(String costCode3) {
		this.costCode3 = costCode3;
	}

	public String getCostCode4() {
		return this.costCode4;
	}

	public void setCostCode4(String costCode4) {
		this.costCode4 = costCode4;
	}

	public String getCostCode5() {
		return this.costCode5;
	}

	public void setCostCode5(String costCode5) {
		this.costCode5 = costCode5;
	}

	public String getDeleteStat() {
		return this.deleteStat;
	}

	public void setDeleteStat(String deleteStat) {
		this.deleteStat = deleteStat;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public String getDwAcNo() {
		return this.dwAcNo;
	}

	public void setDwAcNo(String dwAcNo) {
		this.dwAcNo = dwAcNo;
	}

	public Double getExchRate() {
		return this.exchRate;
	}

	public void setExchRate(Double exchRate) {
		this.exchRate = exchRate;
	}

	public String getExternalRefNo() {
		return this.externalRefNo;
	}

	public void setExternalRefNo(String externalRefNo) {
		this.externalRefNo = externalRefNo;
	}

	public String getFinCycle() {
		return this.finCycle;
	}

	public void setFinCycle(String finCycle) {
		this.finCycle = finCycle;
	}

	public Date getInitiationDate() {
		return this.initiationDate;
	}

	public void setInitiationDate(Date initiationDate) {
		this.initiationDate = initiationDate;
	}

	public String getInstrumentNo() {
		return this.instrumentNo;
	}

	public void setInstrumentNo(String instrumentNo) {
		this.instrumentNo = instrumentNo;
	}

	public Double getLcyEquivalent() {
		return this.lcyEquivalent;
	}

	public void setLcyEquivalent(Double lcyEquivalent) {
		this.lcyEquivalent = lcyEquivalent;
	}

	public String getMisCode() {
		return this.misCode;
	}

	public void setMisCode(String misCode) {
		this.misCode = misCode;
	}

	public String getMisFlag() {
		return this.misFlag;
	}

	public void setMisFlag(String misFlag) {
		this.misFlag = misFlag;
	}

	public String getMisGroup() {
		return this.misGroup;
	}

	public void setMisGroup(String misGroup) {
		this.misGroup = misGroup;
	}

	public String getMisGroupTxn() {
		return this.misGroupTxn;
	}

	public void setMisGroupTxn(String misGroupTxn) {
		this.misGroupTxn = misGroupTxn;
	}

	public String getMisHead() {
		return this.misHead;
	}

	public void setMisHead(String misHead) {
		this.misHead = misHead;
	}

	public String getPeriodCode() {
		return this.periodCode;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getPoolCode() {
		return this.poolCode;
	}

	public void setPoolCode(String poolCode) {
		this.poolCode = poolCode;
	}

	public Double getRefRate() {
		return this.refRate;
	}

	public void setRefRate(Double refRate) {
		this.refRate = refRate;
	}

	public String getRelCust() {
		return this.relCust;
	}

	public void setRelCust(String relCust) {
		this.relCust = relCust;
	}

	public String getRelatedAccount() {
		return this.relatedAccount;
	}

	public void setRelatedAccount(String relatedAccount) {
		this.relatedAccount = relatedAccount;
	}

	public String getRelatedRef() {
		return this.relatedRef;
	}

	public void setRelatedRef(String relatedRef) {
		this.relatedRef = relatedRef;
	}

	public String getReservedFundsRef() {
		return this.reservedFundsRef;
	}

	public void setReservedFundsRef(String reservedFundsRef) {
		this.reservedFundsRef = reservedFundsRef;
	}

	public String getTxnCode() {
		return this.txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public String getTxnMis1() {
		return this.txnMis1;
	}

	public void setTxnMis1(String txnMis1) {
		this.txnMis1 = txnMis1;
	}

	public String getTxnMis10() {
		return this.txnMis10;
	}

	public void setTxnMis10(String txnMis10) {
		this.txnMis10 = txnMis10;
	}

	public String getTxnMis2() {
		return this.txnMis2;
	}

	public void setTxnMis2(String txnMis2) {
		this.txnMis2 = txnMis2;
	}

	public String getTxnMis3() {
		return this.txnMis3;
	}

	public void setTxnMis3(String txnMis3) {
		this.txnMis3 = txnMis3;
	}

	public String getTxnMis4() {
		return this.txnMis4;
	}

	public void setTxnMis4(String txnMis4) {
		this.txnMis4 = txnMis4;
	}

	public String getTxnMis5() {
		return this.txnMis5;
	}

	public void setTxnMis5(String txnMis5) {
		this.txnMis5 = txnMis5;
	}

	public String getTxnMis6() {
		return this.txnMis6;
	}

	public void setTxnMis6(String txnMis6) {
		this.txnMis6 = txnMis6;
	}

	public String getTxnMis7() {
		return this.txnMis7;
	}

	public void setTxnMis7(String txnMis7) {
		this.txnMis7 = txnMis7;
	}

	public String getTxnMis8() {
		return this.txnMis8;
	}

	public void setTxnMis8(String txnMis8) {
		this.txnMis8 = txnMis8;
	}

	public String getTxnMis9() {
		return this.txnMis9;
	}

	public void setTxnMis9(String txnMis9) {
		this.txnMis9 = txnMis9;
	}

	public String getTxtFileName() {
		return this.txtFileName;
	}

	public void setTxtFileName(String txtFileName) {
		this.txtFileName = txtFileName;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getUploadStat() {
		return this.uploadStat;
	}

	public void setUploadStat(String uploadStat) {
		this.uploadStat = uploadStat;
	}

	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getFundMis1() {
		return fundMis1;
	}

	public void setFundMis1(String fundMis1) {
		this.fundMis1 = fundMis1;
	}

	public String getFundMis2() {
		return fundMis2;
	}

	public void setFundMis2(String fundMis2) {
		this.fundMis2 = fundMis2;
	}

	public String getFundMis3() {
		return fundMis3;
	}

	public void setFundMis3(String fundMis3) {
		this.fundMis3 = fundMis3;
	}

	public String getFundMis4() {
		return fundMis4;
	}

	public void setFundMis4(String fundMis4) {
		this.fundMis4 = fundMis4;
	}

	public String getFundMis5() {
		return fundMis5;
	}

	public void setFundMis5(String fundMis5) {
		this.fundMis5 = fundMis5;
	}

	public String getFundMis6() {
		return fundMis6;
	}

	public void setFundMis6(String fundMis6) {
		this.fundMis6 = fundMis6;
	}

	public String getFundMis7() {
		return fundMis7;
	}

	public void setFundMis7(String fundMis7) {
		this.fundMis7 = fundMis7;
	}

	public String getFundMis8() {
		return fundMis8;
	}

	public void setFundMis8(String fundMis8) {
		this.fundMis8 = fundMis8;
	}

	public String getFundMis9() {
		return fundMis9;
	}

	public void setFundMis9(String fundMis9) {
		this.fundMis9 = fundMis9;
	}

	public String getFundMis10() {
		return fundMis10;
	}

	public void setFundMis10(String fundMis10) {
		this.fundMis10 = fundMis10;
	}

}