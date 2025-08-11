package com.jmr.batch.entity.loan;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the CLTB_AC_COMP_UPLOAD database table.
 * 
 */
@Entity
@Table(name = "TRANS_CLTB_AC_COMP_UPLOAD")

public class TransCltbAcCompUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCltbAcCompUploadPK transCltbAcCompUploadPK;

	@Column(name = "CAPITALIZED")
	private String capitalized;

	@Column(name = "CARD_NO")
	private String cardNo;

	@Column(name = "CLG_BANK_CODE_CR")
	private String clgBankCodeCr;

	@Column(name = "CLG_BANK_CODE_DR")
	private String clgBankCodeDr;

	@Column(name = "CLG_BRN_CODE_CR")
	private String clgBrnCodeCr;

	@Column(name = "CLG_BRN_CODE_DR")
	private String clgBrnCodeDr;

	@Column(name = "CLG_PROD_CODE_CR")
	private String clgProdCodeCr;

	@Column(name = "CLG_PROD_CODE_DR")
	private String clgProdCodeDr;

	@Column(name = "COMPONENT_CCY")
	private String componentCcy;

	@Column(name = "COMPONENT_TYPE")
	private String componentType;

	@Column(name = "CR_ACC_BRN")
	private String crAccBrn;

	@Column(name = "CR_PAYMENT_MODE")
	private String crPaymentMode;

	@Column(name = "CR_PROD_AC")
	private String crProdAc;

	@Column(name = "DAYS_MTH")
	private Double daysMth;

	@Column(name = "DAYS_YEAR")
	private Double daysYear;

	@Column(name = "DEFERRED_CHARGE")
	private String deferredCharge;

	@Column(name = "DR_ACC_BRN")
	private String drAccBrn;

	@Column(name = "DR_PAYMENT_MODE")
	private String drPaymentMode;

	@Column(name = "DR_PROD_AC")
	private String drProdAc;

	@Column(name = "END_POINT_CR")
	private String endPointCr;

	@Column(name = "END_POINT_DR")
	private String endPointDr;

	@Column(name = "EXCHANGE_RATE")
	private Double exchangeRate;

	@Column(name = "EXCHANGE_RATE_DR")
	private Double exchangeRateDr;

	@Column(name = "EXPONENTIAL_FLAG")
	private String exponentialFlag;

	@Column(name = "EXT_ACC_NAME_CR")
	private String extAccNameCr;

	@Column(name = "EXT_ACC_NAME_DR")
	private String extAccNameDr;

	@Column(name = "EXT_ACC_NO_CR")
	private String extAccNoCr;

	@Column(name = "EXT_ACC_NO_DR")
	private String extAccNoDr;

	@Column(name = "FUND_DURING_INIT")
	private String fundDuringInit;

	@Column(name = "FUND_DURING_ROLL")
	private String fundDuringRoll;

	@Column(name = "GIRO_MODE_CR")
	private String giroModeCr;

	@Column(name = "GIRO_MODE_DR")
	private String giroModeDr;

	@Column(name = "GIRO_NUMBER_CR")
	private String giroNumberCr;

	@Column(name = "GIRO_NUMBER_DR")
	private String giroNumberDr;

	@Column(name = "GIRO_SERVICE_CR")
	private String giroServiceCr;

	@Column(name = "GIRO_SERVICE_DR")
	private String giroServiceDr;

	@Column(name = "INSTRUMENT_NO_CR")
	private String instrumentNoCr;

	@Column(name = "INSTRUMENT_NO_DR")
	private String instrumentNoDr;

	@Column(name = "IRR_APPLICABLE")
	private String irrApplicable;

	@Column(name = "LIQUIDATION_MODE")
	private String liquidationMode;

	@Column(name = "MAIN_COMPONENT")
	private String mainComponent;

	@Column(name = "NEGOTIATED_RATE")
	private Double negotiatedRate;

	@Column(name = "NEGOTIATED_RATE_DR")
	private Double negotiatedRateDr;

	@Column(name = "NEGOTIATION_REF_NO")
	private String negotiationRefNo;

	@Column(name = "NEGOTIATION_REF_NO_DR")
	private String negotiationRefNoDr;

	@Column(name = "ORG_EXCH_RATE")
	private Double orgExchRate;

	@Column(name = "ORG_EXCH_RATE_DR")
	private Double orgExchRateDr;

	@Column(name = "PAYER_ACC_NO_CR")
	private String payerAccNoCr;

	@Column(name = "PAYER_ACC_NO_DR")
	private String payerAccNoDr;

	@Column(name = "PAYER_ADDRESS1_CR")
	private String payerAddress1Cr;

	@Column(name = "PAYER_ADDRESS1_DR")
	private String payerAddress1Dr;

	@Column(name = "PAYER_ADDRESS2_CR")
	private String payerAddress2Cr;

	@Column(name = "PAYER_ADDRESS2_DR")
	private String payerAddress2Dr;

	@Column(name = "PAYER_ADDRESS3_CR")
	private String payerAddress3Cr;

	@Column(name = "PAYER_ADDRESS3_DR")
	private String payerAddress3Dr;

	@Column(name = "PAYER_ADDRESS4_CR")
	private String payerAddress4Cr;

	@Column(name = "PAYER_ADDRESS4_DR")
	private String payerAddress4Dr;

	@Column(name = "PAYER_BANK_CODE_CR")
	private String payerBankCodeCr;

	@Column(name = "PAYER_BANK_CODE_DR")
	private String payerBankCodeDr;

	@Column(name = "PAYER_BRANCH_CR")
	private String payerBranchCr;

	@Column(name = "PAYER_BRANCH_DR")
	private String payerBranchDr;

	@Column(name = "PAYMENT_DETAILS_1")
	private String paymentDetails1;

	@Column(name = "PAYMENT_DETAILS_2")
	private String paymentDetails2;

	@Column(name = "PAYMENT_DETAILS_3")
	private String paymentDetails3;

	@Column(name = "PAYMENT_DETAILS_4")
	private String paymentDetails4;

	@Column(name = "PC_CAT_CR")
	private String pcCatCr;

	@Column(name = "PC_CAT_DR")
	private String pcCatDr;

	@Column(name = "PENAL_BASIS_COMP")
	private String penalBasisComp;

	@Column(name = "ROUTING_NO_CR")
	private String routingNoCr;

	@Column(name = "ROUTING_NO_DR")
	private String routingNoDr;

	@Column(name = "SECTOR_CODE_CR")
	private String sectorCodeCr;

	@Column(name = "SECTOR_CODE_DR")
	private String sectorCodeDr;

	@Column(name = "SETTLEMENT_CCY")
	private String settlementCcy;

	@Column(name = "SETTLEMENT_SEQ_NUM")
	private Double settlementSeqNum;

	@Column(name = "SOURCE_CODE")
	private String sourceCode;

	@Column(name = "SPL_INTEREST")
	private String splInterest;

	@Column(name = "SPL_INTEREST_AMT")
	private Double splInterestAmt;

	@Column(name = "SVC_ACC_AC")
	private String svcAccAc;

	@Column(name = "SVC_ACC_BRN")
	private String svcAccBrn;

	@Column(name = "UI_CR_PROD_AC")
	private String uiCrProdAc;

	@Column(name = "UI_DR_PROD_AC")
	private String uiDrProdAc;

	@Column(name = "UPLOAD_SOURCE_CR")
	private String uploadSourceCr;

	@Column(name = "UPLOAD_SOURCE_DR")
	private String uploadSourceDr;

	@Column(name = "VERIFY_FUNDS")
	private String verifyFunds;
	
	@Column(name = "WAIVE")
	private String waive;

	public TransCltbAcCompUpload() {
	}

	public TransCltbAcCompUploadPK getTransCltbAcCompUploadPK() {
		return this.transCltbAcCompUploadPK;
	}

	public void setTransCltbAcCompUploadPK(TransCltbAcCompUploadPK transCltbAcCompUploadPK) {
		this.transCltbAcCompUploadPK = transCltbAcCompUploadPK;
	}

	public String getCapitalized() {
		return this.capitalized;
	}

	public void setCapitalized(String capitalized) {
		this.capitalized = capitalized;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getClgBankCodeCr() {
		return this.clgBankCodeCr;
	}

	public void setClgBankCodeCr(String clgBankCodeCr) {
		this.clgBankCodeCr = clgBankCodeCr;
	}

	public String getClgBankCodeDr() {
		return this.clgBankCodeDr;
	}

	public void setClgBankCodeDr(String clgBankCodeDr) {
		this.clgBankCodeDr = clgBankCodeDr;
	}

	public String getClgBrnCodeCr() {
		return this.clgBrnCodeCr;
	}

	public void setClgBrnCodeCr(String clgBrnCodeCr) {
		this.clgBrnCodeCr = clgBrnCodeCr;
	}

	public String getClgBrnCodeDr() {
		return this.clgBrnCodeDr;
	}

	public void setClgBrnCodeDr(String clgBrnCodeDr) {
		this.clgBrnCodeDr = clgBrnCodeDr;
	}

	public String getClgProdCodeCr() {
		return this.clgProdCodeCr;
	}

	public void setClgProdCodeCr(String clgProdCodeCr) {
		this.clgProdCodeCr = clgProdCodeCr;
	}

	public String getClgProdCodeDr() {
		return this.clgProdCodeDr;
	}

	public void setClgProdCodeDr(String clgProdCodeDr) {
		this.clgProdCodeDr = clgProdCodeDr;
	}

	public String getComponentCcy() {
		return this.componentCcy;
	}

	public void setComponentCcy(String componentCcy) {
		this.componentCcy = componentCcy;
	}

	public String getComponentType() {
		return this.componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getCrAccBrn() {
		return this.crAccBrn;
	}

	public void setCrAccBrn(String crAccBrn) {
		this.crAccBrn = crAccBrn;
	}

	public String getCrPaymentMode() {
		return this.crPaymentMode;
	}

	public void setCrPaymentMode(String crPaymentMode) {
		this.crPaymentMode = crPaymentMode;
	}

	public String getCrProdAc() {
		return this.crProdAc;
	}

	public void setCrProdAc(String crProdAc) {
		this.crProdAc = crProdAc;
	}

	public Double getDaysMth() {
		return this.daysMth;
	}

	public void setDaysMth(Double daysMth) {
		this.daysMth = daysMth;
	}

	public Double getDaysYear() {
		return this.daysYear;
	}

	public void setDaysYear(Double daysYear) {
		this.daysYear = daysYear;
	}

	public String getDeferredCharge() {
		return this.deferredCharge;
	}

	public void setDeferredCharge(String deferredCharge) {
		this.deferredCharge = deferredCharge;
	}

	public String getDrAccBrn() {
		return this.drAccBrn;
	}

	public void setDrAccBrn(String drAccBrn) {
		this.drAccBrn = drAccBrn;
	}

	public String getDrPaymentMode() {
		return this.drPaymentMode;
	}

	public void setDrPaymentMode(String drPaymentMode) {
		this.drPaymentMode = drPaymentMode;
	}

	public String getDrProdAc() {
		return this.drProdAc;
	}

	public void setDrProdAc(String drProdAc) {
		this.drProdAc = drProdAc;
	}

	public String getEndPointCr() {
		return this.endPointCr;
	}

	public void setEndPointCr(String endPointCr) {
		this.endPointCr = endPointCr;
	}

	public String getEndPointDr() {
		return this.endPointDr;
	}

	public void setEndPointDr(String endPointDr) {
		this.endPointDr = endPointDr;
	}

	public Double getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getExchangeRateDr() {
		return this.exchangeRateDr;
	}

	public void setExchangeRateDr(Double exchangeRateDr) {
		this.exchangeRateDr = exchangeRateDr;
	}

	public String getExponentialFlag() {
		return this.exponentialFlag;
	}

	public void setExponentialFlag(String exponentialFlag) {
		this.exponentialFlag = exponentialFlag;
	}

	public String getExtAccNameCr() {
		return this.extAccNameCr;
	}

	public void setExtAccNameCr(String extAccNameCr) {
		this.extAccNameCr = extAccNameCr;
	}

	public String getExtAccNameDr() {
		return this.extAccNameDr;
	}

	public void setExtAccNameDr(String extAccNameDr) {
		this.extAccNameDr = extAccNameDr;
	}

	public String getExtAccNoCr() {
		return this.extAccNoCr;
	}

	public void setExtAccNoCr(String extAccNoCr) {
		this.extAccNoCr = extAccNoCr;
	}

	public String getExtAccNoDr() {
		return this.extAccNoDr;
	}

	public void setExtAccNoDr(String extAccNoDr) {
		this.extAccNoDr = extAccNoDr;
	}

	public String getFundDuringInit() {
		return this.fundDuringInit;
	}

	public void setFundDuringInit(String fundDuringInit) {
		this.fundDuringInit = fundDuringInit;
	}

	public String getFundDuringRoll() {
		return this.fundDuringRoll;
	}

	public void setFundDuringRoll(String fundDuringRoll) {
		this.fundDuringRoll = fundDuringRoll;
	}

	public String getGiroModeCr() {
		return this.giroModeCr;
	}

	public void setGiroModeCr(String giroModeCr) {
		this.giroModeCr = giroModeCr;
	}

	public String getGiroModeDr() {
		return this.giroModeDr;
	}

	public void setGiroModeDr(String giroModeDr) {
		this.giroModeDr = giroModeDr;
	}

	public String getGiroNumberCr() {
		return this.giroNumberCr;
	}

	public void setGiroNumberCr(String giroNumberCr) {
		this.giroNumberCr = giroNumberCr;
	}

	public String getGiroNumberDr() {
		return this.giroNumberDr;
	}

	public void setGiroNumberDr(String giroNumberDr) {
		this.giroNumberDr = giroNumberDr;
	}

	public String getGiroServiceCr() {
		return this.giroServiceCr;
	}

	public void setGiroServiceCr(String giroServiceCr) {
		this.giroServiceCr = giroServiceCr;
	}

	public String getGiroServiceDr() {
		return this.giroServiceDr;
	}

	public void setGiroServiceDr(String giroServiceDr) {
		this.giroServiceDr = giroServiceDr;
	}

	public String getInstrumentNoCr() {
		return this.instrumentNoCr;
	}

	public void setInstrumentNoCr(String instrumentNoCr) {
		this.instrumentNoCr = instrumentNoCr;
	}

	public String getInstrumentNoDr() {
		return this.instrumentNoDr;
	}

	public void setInstrumentNoDr(String instrumentNoDr) {
		this.instrumentNoDr = instrumentNoDr;
	}

	public String getIrrApplicable() {
		return this.irrApplicable;
	}

	public void setIrrApplicable(String irrApplicable) {
		this.irrApplicable = irrApplicable;
	}

	public String getLiquidationMode() {
		return this.liquidationMode;
	}

	public void setLiquidationMode(String liquidationMode) {
		this.liquidationMode = liquidationMode;
	}

	public String getMainComponent() {
		return this.mainComponent;
	}

	public void setMainComponent(String mainComponent) {
		this.mainComponent = mainComponent;
	}

	public Double getNegotiatedRate() {
		return this.negotiatedRate;
	}

	public void setNegotiatedRate(Double negotiatedRate) {
		this.negotiatedRate = negotiatedRate;
	}

	public Double getNegotiatedRateDr() {
		return this.negotiatedRateDr;
	}

	public void setNegotiatedRateDr(Double negotiatedRateDr) {
		this.negotiatedRateDr = negotiatedRateDr;
	}

	public String getNegotiationRefNo() {
		return this.negotiationRefNo;
	}

	public void setNegotiationRefNo(String negotiationRefNo) {
		this.negotiationRefNo = negotiationRefNo;
	}

	public String getNegotiationRefNoDr() {
		return this.negotiationRefNoDr;
	}

	public void setNegotiationRefNoDr(String negotiationRefNoDr) {
		this.negotiationRefNoDr = negotiationRefNoDr;
	}

	public Double getOrgExchRate() {
		return this.orgExchRate;
	}

	public void setOrgExchRate(Double orgExchRate) {
		this.orgExchRate = orgExchRate;
	}

	public Double getOrgExchRateDr() {
		return this.orgExchRateDr;
	}

	public void setOrgExchRateDr(Double orgExchRateDr) {
		this.orgExchRateDr = orgExchRateDr;
	}

	public String getPayerAccNoCr() {
		return this.payerAccNoCr;
	}

	public void setPayerAccNoCr(String payerAccNoCr) {
		this.payerAccNoCr = payerAccNoCr;
	}

	public String getPayerAccNoDr() {
		return this.payerAccNoDr;
	}

	public void setPayerAccNoDr(String payerAccNoDr) {
		this.payerAccNoDr = payerAccNoDr;
	}

	public String getPayerAddress1Cr() {
		return this.payerAddress1Cr;
	}

	public void setPayerAddress1Cr(String payerAddress1Cr) {
		this.payerAddress1Cr = payerAddress1Cr;
	}

	public String getPayerAddress1Dr() {
		return this.payerAddress1Dr;
	}

	public void setPayerAddress1Dr(String payerAddress1Dr) {
		this.payerAddress1Dr = payerAddress1Dr;
	}

	public String getPayerAddress2Cr() {
		return this.payerAddress2Cr;
	}

	public void setPayerAddress2Cr(String payerAddress2Cr) {
		this.payerAddress2Cr = payerAddress2Cr;
	}

	public String getPayerAddress2Dr() {
		return this.payerAddress2Dr;
	}

	public void setPayerAddress2Dr(String payerAddress2Dr) {
		this.payerAddress2Dr = payerAddress2Dr;
	}

	public String getPayerAddress3Cr() {
		return this.payerAddress3Cr;
	}

	public void setPayerAddress3Cr(String payerAddress3Cr) {
		this.payerAddress3Cr = payerAddress3Cr;
	}

	public String getPayerAddress3Dr() {
		return this.payerAddress3Dr;
	}

	public void setPayerAddress3Dr(String payerAddress3Dr) {
		this.payerAddress3Dr = payerAddress3Dr;
	}

	public String getPayerAddress4Cr() {
		return this.payerAddress4Cr;
	}

	public void setPayerAddress4Cr(String payerAddress4Cr) {
		this.payerAddress4Cr = payerAddress4Cr;
	}

	public String getPayerAddress4Dr() {
		return this.payerAddress4Dr;
	}

	public void setPayerAddress4Dr(String payerAddress4Dr) {
		this.payerAddress4Dr = payerAddress4Dr;
	}

	public String getPayerBankCodeCr() {
		return this.payerBankCodeCr;
	}

	public void setPayerBankCodeCr(String payerBankCodeCr) {
		this.payerBankCodeCr = payerBankCodeCr;
	}

	public String getPayerBankCodeDr() {
		return this.payerBankCodeDr;
	}

	public void setPayerBankCodeDr(String payerBankCodeDr) {
		this.payerBankCodeDr = payerBankCodeDr;
	}

	public String getPayerBranchCr() {
		return this.payerBranchCr;
	}

	public void setPayerBranchCr(String payerBranchCr) {
		this.payerBranchCr = payerBranchCr;
	}

	public String getPayerBranchDr() {
		return this.payerBranchDr;
	}

	public void setPayerBranchDr(String payerBranchDr) {
		this.payerBranchDr = payerBranchDr;
	}

	public String getPaymentDetails1() {
		return this.paymentDetails1;
	}

	public void setPaymentDetails1(String paymentDetails1) {
		this.paymentDetails1 = paymentDetails1;
	}

	public String getPaymentDetails2() {
		return this.paymentDetails2;
	}

	public void setPaymentDetails2(String paymentDetails2) {
		this.paymentDetails2 = paymentDetails2;
	}

	public String getPaymentDetails3() {
		return this.paymentDetails3;
	}

	public void setPaymentDetails3(String paymentDetails3) {
		this.paymentDetails3 = paymentDetails3;
	}

	public String getPaymentDetails4() {
		return this.paymentDetails4;
	}

	public void setPaymentDetails4(String paymentDetails4) {
		this.paymentDetails4 = paymentDetails4;
	}

	public String getPcCatCr() {
		return this.pcCatCr;
	}

	public void setPcCatCr(String pcCatCr) {
		this.pcCatCr = pcCatCr;
	}

	public String getPcCatDr() {
		return this.pcCatDr;
	}

	public void setPcCatDr(String pcCatDr) {
		this.pcCatDr = pcCatDr;
	}

	public String getPenalBasisComp() {
		return this.penalBasisComp;
	}

	public void setPenalBasisComp(String penalBasisComp) {
		this.penalBasisComp = penalBasisComp;
	}

	public String getRoutingNoCr() {
		return this.routingNoCr;
	}

	public void setRoutingNoCr(String routingNoCr) {
		this.routingNoCr = routingNoCr;
	}

	public String getRoutingNoDr() {
		return this.routingNoDr;
	}

	public void setRoutingNoDr(String routingNoDr) {
		this.routingNoDr = routingNoDr;
	}

	public String getSectorCodeCr() {
		return this.sectorCodeCr;
	}

	public void setSectorCodeCr(String sectorCodeCr) {
		this.sectorCodeCr = sectorCodeCr;
	}

	public String getSectorCodeDr() {
		return this.sectorCodeDr;
	}

	public void setSectorCodeDr(String sectorCodeDr) {
		this.sectorCodeDr = sectorCodeDr;
	}

	public String getSettlementCcy() {
		return this.settlementCcy;
	}

	public void setSettlementCcy(String settlementCcy) {
		this.settlementCcy = settlementCcy;
	}

	public Double getSettlementSeqNum() {
		return this.settlementSeqNum;
	}

	public void setSettlementSeqNum(Double settlementSeqNum) {
		this.settlementSeqNum = settlementSeqNum;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSplInterest() {
		return this.splInterest;
	}

	public void setSplInterest(String splInterest) {
		this.splInterest = splInterest;
	}

	public Double getSplInterestAmt() {
		return this.splInterestAmt;
	}

	public void setSplInterestAmt(Double splInterestAmt) {
		this.splInterestAmt = splInterestAmt;
	}

	public String getSvcAccAc() {
		return this.svcAccAc;
	}

	public void setSvcAccAc(String svcAccAc) {
		this.svcAccAc = svcAccAc;
	}

	public String getSvcAccBrn() {
		return this.svcAccBrn;
	}

	public void setSvcAccBrn(String svcAccBrn) {
		this.svcAccBrn = svcAccBrn;
	}

	public String getUiCrProdAc() {
		return this.uiCrProdAc;
	}

	public void setUiCrProdAc(String uiCrProdAc) {
		this.uiCrProdAc = uiCrProdAc;
	}

	public String getUiDrProdAc() {
		return this.uiDrProdAc;
	}

	public void setUiDrProdAc(String uiDrProdAc) {
		this.uiDrProdAc = uiDrProdAc;
	}

	public String getUploadSourceCr() {
		return this.uploadSourceCr;
	}

	public void setUploadSourceCr(String uploadSourceCr) {
		this.uploadSourceCr = uploadSourceCr;
	}

	public String getUploadSourceDr() {
		return this.uploadSourceDr;
	}

	public void setUploadSourceDr(String uploadSourceDr) {
		this.uploadSourceDr = uploadSourceDr;
	}

	public String getVerifyFunds() {
		return this.verifyFunds;
	}

	public void setVerifyFunds(String verifyFunds) {
		this.verifyFunds = verifyFunds;
	}

	public String getWaive() {
		return this.waive;
	}

	public void setWaive(String waive) {
		this.waive = waive;
	}

}