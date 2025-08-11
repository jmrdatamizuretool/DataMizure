package com.jmr.batch.entity.instruments;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the ISTM_INSTR_TXN database table.
 * 
 */
@Entity
@Table(name="TRANS_ISTM_INSTR_TXN")
public class TransIstmInstrTxn implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransIstmInstrTxnPK id;

	@Column(name="AC_BRANCH")
	private String acBranch;

	@Column(name="AC_CCY")
	private String acCcy;

	@Column(name="AC_NO")
	private String acNo;

	@Column(name="ACY_AMOUNT")
	private Double acyAmount;

	@Column(name="ACY_LCY_RATE")
	private Double acyLcyRate;

	@Column(name="ACY_LCY_RATE_1")
	private Double acyLcyRate1;

	@Column(name="ACY_LCY_RATE_2")
	private Double acyLcyRate2;

	@Column(name="ACY_LCY_RATE_3")
	private Double acyLcyRate3;

	@Column(name="ACY_LCY_RATE_4")
	private Double acyLcyRate4;

	@Column(name="AUTH_STAT")
	private String authStat;

	@Column(name="BATCH_NO")
	private String batchNo;

	@Column(name="BEN_ACCOUNT")
	private String benAccount;

	@Column(name="BEN_CCY")
	private String benCcy;

	@Column(name="BEN_CUST")
	private String benCust;

	@Column(name="BENEF_ADDR_1")
	private String benefAddr1;

	@Column(name="BENEF_ADDR_2")
	private String benefAddr2;

	@Column(name="BENEF_ADDR_3")
	private String benefAddr3;

	@Column(name="BENEF_ADDR_4")
	private String benefAddr4;

	@Column(name="BENEF_ADDR_5")
	private String benefAddr5;

	@Column(name="BENEF_ID_NO")
	private String benefIdNo;

	@Column(name="BENEF_NAME")
	private String benefName;

	@Column(name="BENEF_PH_NO")
	private String benefPhNo;

	@Column(name="CHARGE_ACC_BRN")
	private String chargeAccBrn;

	@Column(name="CHARGE_ACCOUNT")
	private String chargeAccount;

	@Column(name="CHARGE_CCY")
	private String chargeCcy;

	@Temporal(TemporalType.DATE)
	@Column(name="CHECKER_DT_STAMP")
	private Date checkerDtStamp;

	@Column(name="CHECKER_ID")
	private String checkerId;

	@Temporal(TemporalType.DATE)
	@Column(name="CHEQUE_ISSUE_DATE")
	private Date chequeIssueDate;

	@Column(name="CHEQUE_NO")
	private String chequeNo;

	@Column(name="CHG_AMT")
	private Double chgAmt;

	@Column(name="CHG_AMT_1")
	private Double chgAmt1;

	@Column(name="CHG_AMT_2")
	private Double chgAmt2;

	@Column(name="CHG_AMT_3")
	private Double chgAmt3;

	@Column(name="CHG_AMT_4")
	private Double chgAmt4;

	@Column(name="CHG_BY_CASH")
	private String chgByCash;

	@Column(name="CHG_CCY")
	private String chgCcy;

	@Column(name="CHG_CCY_1")
	private String chgCcy1;

	@Column(name="CHG_CCY_2")
	private String chgCcy2;

	@Column(name="CHG_CCY_3")
	private String chgCcy3;

	@Column(name="CHG_CCY_4")
	private String chgCcy4;

	@Column(name="CHG_CCY_ACY_RATE")
	private Double chgCcyAcyRate;

	@Column(name="CHG_CCY_ACY_RATE_1")
	private Double chgCcyAcyRate1;

	@Column(name="CHG_CCY_ACY_RATE_2")
	private Double chgCcyAcyRate2;

	@Column(name="CHG_CCY_ACY_RATE_3")
	private Double chgCcyAcyRate3;

	@Column(name="CHG_CCY_ACY_RATE_4")
	private Double chgCcyAcyRate4;

	@Column(name="CHG_DESC")
	private String chgDesc;

	@Column(name="CHG_DESC1")
	private String chgDesc1;

	@Column(name="CHG_DESC2")
	private String chgDesc2;

	@Column(name="CHG_DESC3")
	private String chgDesc3;

	@Column(name="CHG_DESC4")
	private String chgDesc4;

	@Column(name="CHG_GL")
	private String chgGl;

	@Column(name="CHG_GL_1")
	private String chgGl1;

	@Column(name="CHG_GL_2")
	private String chgGl2;

	@Column(name="CHG_GL_3")
	private String chgGl3;

	@Column(name="CHG_GL_4")
	private String chgGl4;

	@Column(name="CHG_IN_ACY")
	private Double chgInAcy;

	@Column(name="CHG_IN_ACY_1")
	private Double chgInAcy1;

	@Column(name="CHG_IN_ACY_2")
	private Double chgInAcy2;

	@Column(name="CHG_IN_ACY_3")
	private Double chgInAcy3;

	@Column(name="CHG_IN_ACY_4")
	private Double chgInAcy4;

	@Column(name="CHG_IN_LCY")
	private Double chgInLcy;

	@Column(name="CHG_IN_LCY_1")
	private Double chgInLcy1;

	@Column(name="CHG_IN_LCY_2")
	private Double chgInLcy2;

	@Column(name="CHG_IN_LCY_3")
	private Double chgInLcy3;

	@Column(name="CHG_IN_LCY_4")
	private Double chgInLcy4;

	@Column(name="CHG_MODE")
	private String chgMode;

	@Column(name="CHG_TYPE")
	private String chgType;

	@Column(name="CHG_TYPE1")
	private String chgType1;

	@Column(name="CHG_TYPE2")
	private String chgType2;

	@Column(name="CHG_TYPE3")
	private String chgType3;

	@Column(name="CHG_TYPE4")
	private String chgType4;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	@Column(name="DD_MICR_NO")
	private String ddMicrNo;

	@Column(name="DELIVERY_ADD1")
	private String deliveryAdd1;

	@Column(name="DELIVERY_ADD2")
	private String deliveryAdd2;

	@Column(name="DELIVERY_ADD3")
	private String deliveryAdd3;

	@Column(name="DELIVERY_ADD4")
	private String deliveryAdd4;

	@Column(name="DELIVERY_MODE")
	private String deliveryMode;

	@Column(name="DISCOUNT_DAYS")
	private Double discountDays;

	private String duplicate;

	@Column(name="EVENT_SEQ_NO")
	private Double eventSeqNo;

	@Column(name="EXCH_RATE")
	private Double exchRate;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="IDENTIFIER_NAME_1")
	private String identifierName1;

	@Column(name="IDENTIFIER_NAME_2")
	private String identifierName2;

	@Column(name="IDENTIFIER_NAME_3")
	private String identifierName3;

	@Column(name="IDENTIFIER_NAME_4")
	private String identifierName4;

	@Column(name="IDENTIFIER_NAME_5")
	private String identifierName5;

	@Column(name="IDENTIFIER_NAME_6")
	private String identifierName6;

	@Column(name="IDENTIFIER_VALUE_1")
	private String identifierValue1;

	@Column(name="IDENTIFIER_VALUE_2")
	private String identifierValue2;

	@Column(name="IDENTIFIER_VALUE_3")
	private String identifierValue3;

	@Column(name="IDENTIFIER_VALUE_4")
	private String identifierValue4;

	@Column(name="IDENTIFIER_VALUE_5")
	private String identifierValue5;

	@Column(name="IDENTIFIER_VALUE_6")
	private String identifierValue6;

	@Column(name="INSTR_AMOUNT")
	private Double instrAmount;

	@Column(name="INSTR_CCY")
	private String instrCcy;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NO")
	private String instrNo;

	@Column(name="INSTR_STAT")
	private String instrStat;

	@Column(name="INSTR_TYPE")
	private String instrType;

	@Column(name="INWARD_TT_REF")
	private String inwardTtRef;

	@Column(name="IS_PRINTED")
	private String isPrinted;

	@Column(name="ISSUE_BANK")
	private String issueBank;

	@Column(name="ISSUER_CODE")
	private String issuerCode;

	@Column(name="ISSUING_BRANCH")
	private String issuingBranch;

	@Column(name="LCY_AMOUNT")
	private Double lcyAmount;

	@Column(name="LCY_CHG_EXCH_RATE")
	private Double lcyChgExchRate;

	@Column(name="LCY_CHG_EXCH_RATE1")
	private Double lcyChgExchRate1;

	@Column(name="LCY_CHG_EXCH_RATE2")
	private Double lcyChgExchRate2;

	@Column(name="LCY_CHG_EXCH_RATE3")
	private Double lcyChgExchRate3;

	@Column(name="LCY_CHG_EXCH_RATE4")
	private Double lcyChgExchRate4;

	@Temporal(TemporalType.DATE)
	@Column(name="MAKER_DT_STAMP")
	private Date makerDtStamp;

	@Column(name="MAKER_ID")
	private String makerId;

	@Column(name="MANUAL_INPUT")
	private String manualInput;

	@Column(name="MIS_HEAD_1")
	private String misHead1;

	@Column(name="MIS_HEAD_2")
	private String misHead2;

	@Column(name="MIS_HEAD_3")
	private String misHead3;

	@Column(name="MIS_HEAD_4")
	private String misHead4;

	@Column(name="MIS_HEAD_5")
	private String misHead5;

	@Column(name="MOD_NO")
	private Double modNo;

	@Column(name="MULTI_REF_NO")
	private String multiRefNo;

	private String narrative;

	@Column(name="NETTING_IND")
	private String nettingInd;

	@Column(name="NETTING_IND_1")
	private String nettingInd1;

	@Column(name="NETTING_IND_2")
	private String nettingInd2;

	@Column(name="NETTING_IND_3")
	private String nettingInd3;

	@Column(name="NETTING_IND_4")
	private String nettingInd4;

	@Column(name="OFS_ACC")
	private String ofsAcc;

	@Column(name="OFS_AMOUNT")
	private Double ofsAmount;

	@Column(name="OFS_BRANCH")
	private String ofsBranch;

	@Column(name="OFS_CCY")
	private String ofsCcy;

	@Column(name="OLD_DD_MICR_NO")
	private String oldDdMicrNo;

	@Column(name="OLD_INSTR_NO")
	private String oldInstrNo;

	@Column(name="ONCE_AUTH")
	private String onceAuth;

	@Column(name="ORG_DRAFT_NO")
	private String orgDraftNo;

	@Column(name="PAYABLE_BANK")
	private String payableBank;

	@Column(name="PAYABLE_BRANCH")
	private String payableBranch;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="PAYOUT_CHG")
	private Double payoutChg;

	@Column(name="PRINT_COPY")
	private String printCopy;

	@Column(name="PRINT_STAT")
	private String printStat;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="RECORD_STAT")
	private String recordStat;

	@Column(name="REISSUE_REMARKS")
	private String reissueRemarks;

	private String reissued;

	@Column(name="REISSUED_DRAFT_NO")
	private String reissuedDraftNo;

	@Column(name="REL_CUSTOMER")
	private String relCustomer;

	@Column(name="REM_ADDR_1")
	private String remAddr1;

	@Column(name="REM_ADDR_2")
	private String remAddr2;

	@Column(name="REM_ADDR_3")
	private String remAddr3;

	@Column(name="REM_ADDR_4")
	private String remAddr4;

	@Column(name="REM_ID_NO")
	private String remIdNo;

	@Column(name="REM_NAME")
	private String remName;

	@Column(name="REM_PH_NO")
	private String remPhNo;

	private String remarks;

	@Column(name="REVAL_FREQ_DAYS")
	private Double revalFreqDays;

	@Column(name="REVAL_FREQ_MONTHS")
	private Double revalFreqMonths;

	@Column(name="REVAL_FREQ_YEARS")
	private Double revalFreqYears;

	private String revalidated;

	private String scode;

	private String ssn;

	private String testkey;

	@Column(name="THEIR_ACC")
	private String theirAcc;

	@Column(name="THEIR_ACC1")
	private String theirAcc1;

	@Column(name="THEIR_ACC2")
	private String theirAcc2;

	@Column(name="THEIR_ACC3")
	private String theirAcc3;

	@Column(name="THEIR_ACC4")
	private String theirAcc4;

	@Temporal(TemporalType.DATE)
	@Column(name="TRN_DT")
	private Date trnDt;

	@Column(name="TT_PAYMENT_TYPE")
	private String ttPaymentType;

	@Column(name="TXN_CODE")
	private String txnCode;

	@Column(name="TXN_CODE_1")
	private String txnCode1;

	@Column(name="TXN_CODE_2")
	private String txnCode2;

	@Column(name="TXN_CODE_3")
	private String txnCode3;

	@Column(name="TXN_CODE_4")
	private String txnCode4;

	@Column(name="TXN_TANKED")
	private String txnTanked;

	@Column(name="UI_AC_NO")
	private String uiAcNo;

	@Column(name="UI_CHARGE_ACCOUNT")
	private String uiChargeAccount;

	private String waiver;

	private String waiver1;

	private String waiver2;

	private String waiver3;

	private String waiver4;

	private String xref;

	public TransIstmInstrTxn() {
	}

	public TransIstmInstrTxnPK getId() {
		return this.id;
	}

	public void setId(TransIstmInstrTxnPK id) {
		this.id = id;
	}

	public String getAcBranch() {
		return this.acBranch;
	}

	public void setAcBranch(String acBranch) {
		this.acBranch = acBranch;
	}

	public String getAcCcy() {
		return this.acCcy;
	}

	public void setAcCcy(String acCcy) {
		this.acCcy = acCcy;
	}

	public String getAcNo() {
		return this.acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public Double getAcyAmount() {
		return this.acyAmount;
	}

	public void setAcyAmount(Double acyAmount) {
		this.acyAmount = acyAmount;
	}

	public Double getAcyLcyRate() {
		return this.acyLcyRate;
	}

	public void setAcyLcyRate(Double acyLcyRate) {
		this.acyLcyRate = acyLcyRate;
	}

	public Double getAcyLcyRate1() {
		return this.acyLcyRate1;
	}

	public void setAcyLcyRate1(Double acyLcyRate1) {
		this.acyLcyRate1 = acyLcyRate1;
	}

	public Double getAcyLcyRate2() {
		return this.acyLcyRate2;
	}

	public void setAcyLcyRate2(Double acyLcyRate2) {
		this.acyLcyRate2 = acyLcyRate2;
	}

	public Double getAcyLcyRate3() {
		return this.acyLcyRate3;
	}

	public void setAcyLcyRate3(Double acyLcyRate3) {
		this.acyLcyRate3 = acyLcyRate3;
	}

	public Double getAcyLcyRate4() {
		return this.acyLcyRate4;
	}

	public void setAcyLcyRate4(Double acyLcyRate4) {
		this.acyLcyRate4 = acyLcyRate4;
	}

	public String getAuthStat() {
		return this.authStat;
	}

	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}

	public String getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBenAccount() {
		return this.benAccount;
	}

	public void setBenAccount(String benAccount) {
		this.benAccount = benAccount;
	}

	public String getBenCcy() {
		return this.benCcy;
	}

	public void setBenCcy(String benCcy) {
		this.benCcy = benCcy;
	}

	public String getBenCust() {
		return this.benCust;
	}

	public void setBenCust(String benCust) {
		this.benCust = benCust;
	}

	public String getBenefAddr1() {
		return this.benefAddr1;
	}

	public void setBenefAddr1(String benefAddr1) {
		this.benefAddr1 = benefAddr1;
	}

	public String getBenefAddr2() {
		return this.benefAddr2;
	}

	public void setBenefAddr2(String benefAddr2) {
		this.benefAddr2 = benefAddr2;
	}

	public String getBenefAddr3() {
		return this.benefAddr3;
	}

	public void setBenefAddr3(String benefAddr3) {
		this.benefAddr3 = benefAddr3;
	}

	public String getBenefAddr4() {
		return this.benefAddr4;
	}

	public void setBenefAddr4(String benefAddr4) {
		this.benefAddr4 = benefAddr4;
	}

	public String getBenefAddr5() {
		return this.benefAddr5;
	}

	public void setBenefAddr5(String benefAddr5) {
		this.benefAddr5 = benefAddr5;
	}

	public String getBenefIdNo() {
		return this.benefIdNo;
	}

	public void setBenefIdNo(String benefIdNo) {
		this.benefIdNo = benefIdNo;
	}

	public String getBenefName() {
		return this.benefName;
	}

	public void setBenefName(String benefName) {
		this.benefName = benefName;
	}

	public String getBenefPhNo() {
		return this.benefPhNo;
	}

	public void setBenefPhNo(String benefPhNo) {
		this.benefPhNo = benefPhNo;
	}

	public String getChargeAccBrn() {
		return this.chargeAccBrn;
	}

	public void setChargeAccBrn(String chargeAccBrn) {
		this.chargeAccBrn = chargeAccBrn;
	}

	public String getChargeAccount() {
		return this.chargeAccount;
	}

	public void setChargeAccount(String chargeAccount) {
		this.chargeAccount = chargeAccount;
	}

	public String getChargeCcy() {
		return this.chargeCcy;
	}

	public void setChargeCcy(String chargeCcy) {
		this.chargeCcy = chargeCcy;
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

	public Date getChequeIssueDate() {
		return this.chequeIssueDate;
	}

	public void setChequeIssueDate(Date chequeIssueDate) {
		this.chequeIssueDate = chequeIssueDate;
	}

	public String getChequeNo() {
		return this.chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public Double getChgAmt() {
		return this.chgAmt;
	}

	public void setChgAmt(Double chgAmt) {
		this.chgAmt = chgAmt;
	}

	public Double getChgAmt1() {
		return this.chgAmt1;
	}

	public void setChgAmt1(Double chgAmt1) {
		this.chgAmt1 = chgAmt1;
	}

	public Double getChgAmt2() {
		return this.chgAmt2;
	}

	public void setChgAmt2(Double chgAmt2) {
		this.chgAmt2 = chgAmt2;
	}

	public Double getChgAmt3() {
		return this.chgAmt3;
	}

	public void setChgAmt3(Double chgAmt3) {
		this.chgAmt3 = chgAmt3;
	}

	public Double getChgAmt4() {
		return this.chgAmt4;
	}

	public void setChgAmt4(Double chgAmt4) {
		this.chgAmt4 = chgAmt4;
	}

	public String getChgByCash() {
		return this.chgByCash;
	}

	public void setChgByCash(String chgByCash) {
		this.chgByCash = chgByCash;
	}

	public String getChgCcy() {
		return this.chgCcy;
	}

	public void setChgCcy(String chgCcy) {
		this.chgCcy = chgCcy;
	}

	public String getChgCcy1() {
		return this.chgCcy1;
	}

	public void setChgCcy1(String chgCcy1) {
		this.chgCcy1 = chgCcy1;
	}

	public String getChgCcy2() {
		return this.chgCcy2;
	}

	public void setChgCcy2(String chgCcy2) {
		this.chgCcy2 = chgCcy2;
	}

	public String getChgCcy3() {
		return this.chgCcy3;
	}

	public void setChgCcy3(String chgCcy3) {
		this.chgCcy3 = chgCcy3;
	}

	public String getChgCcy4() {
		return this.chgCcy4;
	}

	public void setChgCcy4(String chgCcy4) {
		this.chgCcy4 = chgCcy4;
	}

	public Double getChgCcyAcyRate() {
		return this.chgCcyAcyRate;
	}

	public void setChgCcyAcyRate(Double chgCcyAcyRate) {
		this.chgCcyAcyRate = chgCcyAcyRate;
	}

	public Double getChgCcyAcyRate1() {
		return this.chgCcyAcyRate1;
	}

	public void setChgCcyAcyRate1(Double chgCcyAcyRate1) {
		this.chgCcyAcyRate1 = chgCcyAcyRate1;
	}

	public Double getChgCcyAcyRate2() {
		return this.chgCcyAcyRate2;
	}

	public void setChgCcyAcyRate2(Double chgCcyAcyRate2) {
		this.chgCcyAcyRate2 = chgCcyAcyRate2;
	}

	public Double getChgCcyAcyRate3() {
		return this.chgCcyAcyRate3;
	}

	public void setChgCcyAcyRate3(Double chgCcyAcyRate3) {
		this.chgCcyAcyRate3 = chgCcyAcyRate3;
	}

	public Double getChgCcyAcyRate4() {
		return this.chgCcyAcyRate4;
	}

	public void setChgCcyAcyRate4(Double chgCcyAcyRate4) {
		this.chgCcyAcyRate4 = chgCcyAcyRate4;
	}

	public String getChgDesc() {
		return this.chgDesc;
	}

	public void setChgDesc(String chgDesc) {
		this.chgDesc = chgDesc;
	}

	public String getChgDesc1() {
		return this.chgDesc1;
	}

	public void setChgDesc1(String chgDesc1) {
		this.chgDesc1 = chgDesc1;
	}

	public String getChgDesc2() {
		return this.chgDesc2;
	}

	public void setChgDesc2(String chgDesc2) {
		this.chgDesc2 = chgDesc2;
	}

	public String getChgDesc3() {
		return this.chgDesc3;
	}

	public void setChgDesc3(String chgDesc3) {
		this.chgDesc3 = chgDesc3;
	}

	public String getChgDesc4() {
		return this.chgDesc4;
	}

	public void setChgDesc4(String chgDesc4) {
		this.chgDesc4 = chgDesc4;
	}

	public String getChgGl() {
		return this.chgGl;
	}

	public void setChgGl(String chgGl) {
		this.chgGl = chgGl;
	}

	public String getChgGl1() {
		return this.chgGl1;
	}

	public void setChgGl1(String chgGl1) {
		this.chgGl1 = chgGl1;
	}

	public String getChgGl2() {
		return this.chgGl2;
	}

	public void setChgGl2(String chgGl2) {
		this.chgGl2 = chgGl2;
	}

	public String getChgGl3() {
		return this.chgGl3;
	}

	public void setChgGl3(String chgGl3) {
		this.chgGl3 = chgGl3;
	}

	public String getChgGl4() {
		return this.chgGl4;
	}

	public void setChgGl4(String chgGl4) {
		this.chgGl4 = chgGl4;
	}

	public Double getChgInAcy() {
		return this.chgInAcy;
	}

	public void setChgInAcy(Double chgInAcy) {
		this.chgInAcy = chgInAcy;
	}

	public Double getChgInAcy1() {
		return this.chgInAcy1;
	}

	public void setChgInAcy1(Double chgInAcy1) {
		this.chgInAcy1 = chgInAcy1;
	}

	public Double getChgInAcy2() {
		return this.chgInAcy2;
	}

	public void setChgInAcy2(Double chgInAcy2) {
		this.chgInAcy2 = chgInAcy2;
	}

	public Double getChgInAcy3() {
		return this.chgInAcy3;
	}

	public void setChgInAcy3(Double chgInAcy3) {
		this.chgInAcy3 = chgInAcy3;
	}

	public Double getChgInAcy4() {
		return this.chgInAcy4;
	}

	public void setChgInAcy4(Double chgInAcy4) {
		this.chgInAcy4 = chgInAcy4;
	}

	public Double getChgInLcy() {
		return this.chgInLcy;
	}

	public void setChgInLcy(Double chgInLcy) {
		this.chgInLcy = chgInLcy;
	}

	public Double getChgInLcy1() {
		return this.chgInLcy1;
	}

	public void setChgInLcy1(Double chgInLcy1) {
		this.chgInLcy1 = chgInLcy1;
	}

	public Double getChgInLcy2() {
		return this.chgInLcy2;
	}

	public void setChgInLcy2(Double chgInLcy2) {
		this.chgInLcy2 = chgInLcy2;
	}

	public Double getChgInLcy3() {
		return this.chgInLcy3;
	}

	public void setChgInLcy3(Double chgInLcy3) {
		this.chgInLcy3 = chgInLcy3;
	}

	public Double getChgInLcy4() {
		return this.chgInLcy4;
	}

	public void setChgInLcy4(Double chgInLcy4) {
		this.chgInLcy4 = chgInLcy4;
	}

	public String getChgMode() {
		return this.chgMode;
	}

	public void setChgMode(String chgMode) {
		this.chgMode = chgMode;
	}

	public String getChgType() {
		return this.chgType;
	}

	public void setChgType(String chgType) {
		this.chgType = chgType;
	}

	public String getChgType1() {
		return this.chgType1;
	}

	public void setChgType1(String chgType1) {
		this.chgType1 = chgType1;
	}

	public String getChgType2() {
		return this.chgType2;
	}

	public void setChgType2(String chgType2) {
		this.chgType2 = chgType2;
	}

	public String getChgType3() {
		return this.chgType3;
	}

	public void setChgType3(String chgType3) {
		this.chgType3 = chgType3;
	}

	public String getChgType4() {
		return this.chgType4;
	}

	public void setChgType4(String chgType4) {
		this.chgType4 = chgType4;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDdMicrNo() {
		return this.ddMicrNo;
	}

	public void setDdMicrNo(String ddMicrNo) {
		this.ddMicrNo = ddMicrNo;
	}

	public String getDeliveryAdd1() {
		return this.deliveryAdd1;
	}

	public void setDeliveryAdd1(String deliveryAdd1) {
		this.deliveryAdd1 = deliveryAdd1;
	}

	public String getDeliveryAdd2() {
		return this.deliveryAdd2;
	}

	public void setDeliveryAdd2(String deliveryAdd2) {
		this.deliveryAdd2 = deliveryAdd2;
	}

	public String getDeliveryAdd3() {
		return this.deliveryAdd3;
	}

	public void setDeliveryAdd3(String deliveryAdd3) {
		this.deliveryAdd3 = deliveryAdd3;
	}

	public String getDeliveryAdd4() {
		return this.deliveryAdd4;
	}

	public void setDeliveryAdd4(String deliveryAdd4) {
		this.deliveryAdd4 = deliveryAdd4;
	}

	public String getDeliveryMode() {
		return this.deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public Double getDiscountDays() {
		return this.discountDays;
	}

	public void setDiscountDays(Double discountDays) {
		this.discountDays = discountDays;
	}

	public String getDuplicate() {
		return this.duplicate;
	}

	public void setDuplicate(String duplicate) {
		this.duplicate = duplicate;
	}

	public Double getEventSeqNo() {
		return this.eventSeqNo;
	}

	public void setEventSeqNo(Double eventSeqNo) {
		this.eventSeqNo = eventSeqNo;
	}

	public Double getExchRate() {
		return this.exchRate;
	}

	public void setExchRate(Double exchRate) {
		this.exchRate = exchRate;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getIdentifierName1() {
		return this.identifierName1;
	}

	public void setIdentifierName1(String identifierName1) {
		this.identifierName1 = identifierName1;
	}

	public String getIdentifierName2() {
		return this.identifierName2;
	}

	public void setIdentifierName2(String identifierName2) {
		this.identifierName2 = identifierName2;
	}

	public String getIdentifierName3() {
		return this.identifierName3;
	}

	public void setIdentifierName3(String identifierName3) {
		this.identifierName3 = identifierName3;
	}

	public String getIdentifierName4() {
		return this.identifierName4;
	}

	public void setIdentifierName4(String identifierName4) {
		this.identifierName4 = identifierName4;
	}

	public String getIdentifierName5() {
		return this.identifierName5;
	}

	public void setIdentifierName5(String identifierName5) {
		this.identifierName5 = identifierName5;
	}

	public String getIdentifierName6() {
		return this.identifierName6;
	}

	public void setIdentifierName6(String identifierName6) {
		this.identifierName6 = identifierName6;
	}

	public String getIdentifierValue1() {
		return this.identifierValue1;
	}

	public void setIdentifierValue1(String identifierValue1) {
		this.identifierValue1 = identifierValue1;
	}

	public String getIdentifierValue2() {
		return this.identifierValue2;
	}

	public void setIdentifierValue2(String identifierValue2) {
		this.identifierValue2 = identifierValue2;
	}

	public String getIdentifierValue3() {
		return this.identifierValue3;
	}

	public void setIdentifierValue3(String identifierValue3) {
		this.identifierValue3 = identifierValue3;
	}

	public String getIdentifierValue4() {
		return this.identifierValue4;
	}

	public void setIdentifierValue4(String identifierValue4) {
		this.identifierValue4 = identifierValue4;
	}

	public String getIdentifierValue5() {
		return this.identifierValue5;
	}

	public void setIdentifierValue5(String identifierValue5) {
		this.identifierValue5 = identifierValue5;
	}

	public String getIdentifierValue6() {
		return this.identifierValue6;
	}

	public void setIdentifierValue6(String identifierValue6) {
		this.identifierValue6 = identifierValue6;
	}

	public Double getInstrAmount() {
		return this.instrAmount;
	}

	public void setInstrAmount(Double instrAmount) {
		this.instrAmount = instrAmount;
	}

	public String getInstrCcy() {
		return this.instrCcy;
	}

	public void setInstrCcy(String instrCcy) {
		this.instrCcy = instrCcy;
	}

	public Date getInstrDate() {
		return this.instrDate;
	}

	public void setInstrDate(Date instrDate) {
		this.instrDate = instrDate;
	}

	public String getInstrNo() {
		return this.instrNo;
	}

	public void setInstrNo(String instrNo) {
		this.instrNo = instrNo;
	}

	public String getInstrStat() {
		return this.instrStat;
	}

	public void setInstrStat(String instrStat) {
		this.instrStat = instrStat;
	}

	public String getInstrType() {
		return this.instrType;
	}

	public void setInstrType(String instrType) {
		this.instrType = instrType;
	}

	public String getInwardTtRef() {
		return this.inwardTtRef;
	}

	public void setInwardTtRef(String inwardTtRef) {
		this.inwardTtRef = inwardTtRef;
	}

	public String getIsPrinted() {
		return this.isPrinted;
	}

	public void setIsPrinted(String isPrinted) {
		this.isPrinted = isPrinted;
	}

	public String getIssueBank() {
		return this.issueBank;
	}

	public void setIssueBank(String issueBank) {
		this.issueBank = issueBank;
	}

	public String getIssuerCode() {
		return this.issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}

	public String getIssuingBranch() {
		return this.issuingBranch;
	}

	public void setIssuingBranch(String issuingBranch) {
		this.issuingBranch = issuingBranch;
	}

	public Double getLcyAmount() {
		return this.lcyAmount;
	}

	public void setLcyAmount(Double lcyAmount) {
		this.lcyAmount = lcyAmount;
	}

	public Double getLcyChgExchRate() {
		return this.lcyChgExchRate;
	}

	public void setLcyChgExchRate(Double lcyChgExchRate) {
		this.lcyChgExchRate = lcyChgExchRate;
	}

	public Double getLcyChgExchRate1() {
		return this.lcyChgExchRate1;
	}

	public void setLcyChgExchRate1(Double lcyChgExchRate1) {
		this.lcyChgExchRate1 = lcyChgExchRate1;
	}

	public Double getLcyChgExchRate2() {
		return this.lcyChgExchRate2;
	}

	public void setLcyChgExchRate2(Double lcyChgExchRate2) {
		this.lcyChgExchRate2 = lcyChgExchRate2;
	}

	public Double getLcyChgExchRate3() {
		return this.lcyChgExchRate3;
	}

	public void setLcyChgExchRate3(Double lcyChgExchRate3) {
		this.lcyChgExchRate3 = lcyChgExchRate3;
	}

	public Double getLcyChgExchRate4() {
		return this.lcyChgExchRate4;
	}

	public void setLcyChgExchRate4(Double lcyChgExchRate4) {
		this.lcyChgExchRate4 = lcyChgExchRate4;
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

	public String getManualInput() {
		return this.manualInput;
	}

	public void setManualInput(String manualInput) {
		this.manualInput = manualInput;
	}

	public String getMisHead1() {
		return this.misHead1;
	}

	public void setMisHead1(String misHead1) {
		this.misHead1 = misHead1;
	}

	public String getMisHead2() {
		return this.misHead2;
	}

	public void setMisHead2(String misHead2) {
		this.misHead2 = misHead2;
	}

	public String getMisHead3() {
		return this.misHead3;
	}

	public void setMisHead3(String misHead3) {
		this.misHead3 = misHead3;
	}

	public String getMisHead4() {
		return this.misHead4;
	}

	public void setMisHead4(String misHead4) {
		this.misHead4 = misHead4;
	}

	public String getMisHead5() {
		return this.misHead5;
	}

	public void setMisHead5(String misHead5) {
		this.misHead5 = misHead5;
	}

	public Double getModNo() {
		return this.modNo;
	}

	public void setModNo(Double modNo) {
		this.modNo = modNo;
	}

	public String getMultiRefNo() {
		return this.multiRefNo;
	}

	public void setMultiRefNo(String multiRefNo) {
		this.multiRefNo = multiRefNo;
	}

	public String getNarrative() {
		return this.narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public String getNettingInd() {
		return this.nettingInd;
	}

	public void setNettingInd(String nettingInd) {
		this.nettingInd = nettingInd;
	}

	public String getNettingInd1() {
		return this.nettingInd1;
	}

	public void setNettingInd1(String nettingInd1) {
		this.nettingInd1 = nettingInd1;
	}

	public String getNettingInd2() {
		return this.nettingInd2;
	}

	public void setNettingInd2(String nettingInd2) {
		this.nettingInd2 = nettingInd2;
	}

	public String getNettingInd3() {
		return this.nettingInd3;
	}

	public void setNettingInd3(String nettingInd3) {
		this.nettingInd3 = nettingInd3;
	}

	public String getNettingInd4() {
		return this.nettingInd4;
	}

	public void setNettingInd4(String nettingInd4) {
		this.nettingInd4 = nettingInd4;
	}

	public String getOfsAcc() {
		return this.ofsAcc;
	}

	public void setOfsAcc(String ofsAcc) {
		this.ofsAcc = ofsAcc;
	}

	public Double getOfsAmount() {
		return this.ofsAmount;
	}

	public void setOfsAmount(Double ofsAmount) {
		this.ofsAmount = ofsAmount;
	}

	public String getOfsBranch() {
		return this.ofsBranch;
	}

	public void setOfsBranch(String ofsBranch) {
		this.ofsBranch = ofsBranch;
	}

	public String getOfsCcy() {
		return this.ofsCcy;
	}

	public void setOfsCcy(String ofsCcy) {
		this.ofsCcy = ofsCcy;
	}

	public String getOldDdMicrNo() {
		return this.oldDdMicrNo;
	}

	public void setOldDdMicrNo(String oldDdMicrNo) {
		this.oldDdMicrNo = oldDdMicrNo;
	}

	public String getOldInstrNo() {
		return this.oldInstrNo;
	}

	public void setOldInstrNo(String oldInstrNo) {
		this.oldInstrNo = oldInstrNo;
	}

	public String getOnceAuth() {
		return this.onceAuth;
	}

	public void setOnceAuth(String onceAuth) {
		this.onceAuth = onceAuth;
	}

	public String getOrgDraftNo() {
		return this.orgDraftNo;
	}

	public void setOrgDraftNo(String orgDraftNo) {
		this.orgDraftNo = orgDraftNo;
	}

	public String getPayableBank() {
		return this.payableBank;
	}

	public void setPayableBank(String payableBank) {
		this.payableBank = payableBank;
	}

	public String getPayableBranch() {
		return this.payableBranch;
	}

	public void setPayableBranch(String payableBranch) {
		this.payableBranch = payableBranch;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Double getPayoutChg() {
		return this.payoutChg;
	}

	public void setPayoutChg(Double payoutChg) {
		this.payoutChg = payoutChg;
	}

	public String getPrintCopy() {
		return this.printCopy;
	}

	public void setPrintCopy(String printCopy) {
		this.printCopy = printCopy;
	}

	public String getPrintStat() {
		return this.printStat;
	}

	public void setPrintStat(String printStat) {
		this.printStat = printStat;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRecordStat() {
		return this.recordStat;
	}

	public void setRecordStat(String recordStat) {
		this.recordStat = recordStat;
	}

	public String getReissueRemarks() {
		return this.reissueRemarks;
	}

	public void setReissueRemarks(String reissueRemarks) {
		this.reissueRemarks = reissueRemarks;
	}

	public String getReissued() {
		return this.reissued;
	}

	public void setReissued(String reissued) {
		this.reissued = reissued;
	}

	public String getReissuedDraftNo() {
		return this.reissuedDraftNo;
	}

	public void setReissuedDraftNo(String reissuedDraftNo) {
		this.reissuedDraftNo = reissuedDraftNo;
	}

	public String getRelCustomer() {
		return this.relCustomer;
	}

	public void setRelCustomer(String relCustomer) {
		this.relCustomer = relCustomer;
	}

	public String getRemAddr1() {
		return this.remAddr1;
	}

	public void setRemAddr1(String remAddr1) {
		this.remAddr1 = remAddr1;
	}

	public String getRemAddr2() {
		return this.remAddr2;
	}

	public void setRemAddr2(String remAddr2) {
		this.remAddr2 = remAddr2;
	}

	public String getRemAddr3() {
		return this.remAddr3;
	}

	public void setRemAddr3(String remAddr3) {
		this.remAddr3 = remAddr3;
	}

	public String getRemAddr4() {
		return this.remAddr4;
	}

	public void setRemAddr4(String remAddr4) {
		this.remAddr4 = remAddr4;
	}

	public String getRemIdNo() {
		return this.remIdNo;
	}

	public void setRemIdNo(String remIdNo) {
		this.remIdNo = remIdNo;
	}

	public String getRemName() {
		return this.remName;
	}

	public void setRemName(String remName) {
		this.remName = remName;
	}

	public String getRemPhNo() {
		return this.remPhNo;
	}

	public void setRemPhNo(String remPhNo) {
		this.remPhNo = remPhNo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Double getRevalFreqDays() {
		return this.revalFreqDays;
	}

	public void setRevalFreqDays(Double revalFreqDays) {
		this.revalFreqDays = revalFreqDays;
	}

	public Double getRevalFreqMonths() {
		return this.revalFreqMonths;
	}

	public void setRevalFreqMonths(Double revalFreqMonths) {
		this.revalFreqMonths = revalFreqMonths;
	}

	public Double getRevalFreqYears() {
		return this.revalFreqYears;
	}

	public void setRevalFreqYears(Double revalFreqYears) {
		this.revalFreqYears = revalFreqYears;
	}

	public String getRevalidated() {
		return this.revalidated;
	}

	public void setRevalidated(String revalidated) {
		this.revalidated = revalidated;
	}

	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getTestkey() {
		return this.testkey;
	}

	public void setTestkey(String testkey) {
		this.testkey = testkey;
	}

	public String getTheirAcc() {
		return this.theirAcc;
	}

	public void setTheirAcc(String theirAcc) {
		this.theirAcc = theirAcc;
	}

	public String getTheirAcc1() {
		return this.theirAcc1;
	}

	public void setTheirAcc1(String theirAcc1) {
		this.theirAcc1 = theirAcc1;
	}

	public String getTheirAcc2() {
		return this.theirAcc2;
	}

	public void setTheirAcc2(String theirAcc2) {
		this.theirAcc2 = theirAcc2;
	}

	public String getTheirAcc3() {
		return this.theirAcc3;
	}

	public void setTheirAcc3(String theirAcc3) {
		this.theirAcc3 = theirAcc3;
	}

	public String getTheirAcc4() {
		return this.theirAcc4;
	}

	public void setTheirAcc4(String theirAcc4) {
		this.theirAcc4 = theirAcc4;
	}

	public Date getTrnDt() {
		return this.trnDt;
	}

	public void setTrnDt(Date trnDt) {
		this.trnDt = trnDt;
	}

	public String getTtPaymentType() {
		return this.ttPaymentType;
	}

	public void setTtPaymentType(String ttPaymentType) {
		this.ttPaymentType = ttPaymentType;
	}

	public String getTxnCode() {
		return this.txnCode;
	}

	public void setTxnCode(String txnCode) {
		this.txnCode = txnCode;
	}

	public String getTxnCode1() {
		return this.txnCode1;
	}

	public void setTxnCode1(String txnCode1) {
		this.txnCode1 = txnCode1;
	}

	public String getTxnCode2() {
		return this.txnCode2;
	}

	public void setTxnCode2(String txnCode2) {
		this.txnCode2 = txnCode2;
	}

	public String getTxnCode3() {
		return this.txnCode3;
	}

	public void setTxnCode3(String txnCode3) {
		this.txnCode3 = txnCode3;
	}

	public String getTxnCode4() {
		return this.txnCode4;
	}

	public void setTxnCode4(String txnCode4) {
		this.txnCode4 = txnCode4;
	}

	public String getTxnTanked() {
		return this.txnTanked;
	}

	public void setTxnTanked(String txnTanked) {
		this.txnTanked = txnTanked;
	}

	public String getUiAcNo() {
		return this.uiAcNo;
	}

	public void setUiAcNo(String uiAcNo) {
		this.uiAcNo = uiAcNo;
	}

	public String getUiChargeAccount() {
		return this.uiChargeAccount;
	}

	public void setUiChargeAccount(String uiChargeAccount) {
		this.uiChargeAccount = uiChargeAccount;
	}

	public String getWaiver() {
		return this.waiver;
	}

	public void setWaiver(String waiver) {
		this.waiver = waiver;
	}

	public String getWaiver1() {
		return this.waiver1;
	}

	public void setWaiver1(String waiver1) {
		this.waiver1 = waiver1;
	}

	public String getWaiver2() {
		return this.waiver2;
	}

	public void setWaiver2(String waiver2) {
		this.waiver2 = waiver2;
	}

	public String getWaiver3() {
		return this.waiver3;
	}

	public void setWaiver3(String waiver3) {
		this.waiver3 = waiver3;
	}

	public String getWaiver4() {
		return this.waiver4;
	}

	public void setWaiver4(String waiver4) {
		this.waiver4 = waiver4;
	}

	public String getXref() {
		return this.xref;
	}

	public void setXref(String xref) {
		this.xref = xref;
	}

}