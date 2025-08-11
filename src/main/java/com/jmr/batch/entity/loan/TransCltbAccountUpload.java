package com.jmr.batch.entity.loan;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRANS_CLTB_ACCOUNT_UPLOAD database table.
 * 
 */
@Entity
@Table(name="TRANS_CLTB_ACCOUNT_UPLOAD")

public class TransCltbAccountUpload implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;

	@Column(name="ALIQ_REVERSED_PMT")
	private String aliqReversedPmt;

	@Column(name="ALLOW_BACK_PERIOD_ENTRY")
	private String allowBackPeriodEntry;

	@Column(name="ALLOW_BULK_PAYMNET")
	private String allowBulkPaymnet;

	@Column(name="ALLOW_MULTI_PARTY")
	private String allowMultiParty;

	@Column(name="ALLOW_MULTIPLE_DP")
	private String allowMultipleDp;

	@Column(name="ALT_ACC_NO")
	private String altAccNo;

	@Column(name="AMEND_PAST_PAID_SCHEDULE")
	private String amendPastPaidSchedule;

	@Column(name="AMORT_RESCHEDULE_ON_DSBR")
	private String amortRescheduleOnDsbr;

	private String amortized;

	@Column(name="AMOUNT_BLOCK_FLAG")
	private String amountBlockFlag;

	@Column(name="AMOUNT_BLOCK_REMARKS")
	private String amountBlockRemarks;

	@Column(name="AMOUNT_BLOCKED")
	private BigDecimal amountBlocked;

	@Column(name="AMOUNT_DISBURSED")
	private BigDecimal amountDisbursed;

	@Column(name="AMOUNT_FINANCED")
	private BigDecimal amountFinanced;

	@Column(name="AMOUNT_UTILIZED")
	private BigDecimal amountUtilized;

	@Column(name="AMT_AVAILABLE")
	private BigDecimal amtAvailable;

	@Column(name="APPLICANT_INCOME")
	private BigDecimal applicantIncome;

	@Column(name="APPLICATION_NUM")
	private String applicationNum;

	@Column(name="ARRAHNU_EXTENSION")
	private BigDecimal arrahnuExtension;

	@Column(name="ARVN_APPLIED")
	private String arvnApplied;

	@Column(name="ASSET_COST")
	private BigDecimal assetCost;

	@Column(name="ASSET_TYPE")
	private String assetType;

	@Column(name="ATM_FACILITY")
	private String atmFacility;

	@Column(name="AUTH_STAT")
	private String authStat;

	@Column(name="AUTO_CLOSE_COLLATERAL")
	private String autoCloseCollateral;

	@Column(name="AUTO_MAN_ROLLOVER")
	private String autoManRollover;

	@Temporal(TemporalType.DATE)
	@Column(name="BACK_VAL_EFF_DT")
	private Date backValEffDt;

	@Column(name="BALLOON_AMOUNT")
	private BigDecimal balloonAmount;

	@Column(name="BALLOON_PERCENT")
	private BigDecimal balloonPercent;

	@Column(name="BALLOON_ROLLOVER_INSTALLMENT")
	private BigDecimal balloonRolloverInstallment;

	@Column(name="BALLOON_ROLLOVER_REQD")
	private String balloonRolloverReqd;

	@Column(name="BALLOON_ROLLOVER_UNIT")
	private String balloonRolloverUnit;

	@Column(name="BANK_SHARE_PERCENT")
	private BigDecimal bankSharePercent;

	@Column(name="BILL_REF_NO")
	private String billRefNo;

	@Temporal(TemporalType.DATE)
	@Column(name="BOOK_DATE")
	private Date bookDate;

	@Column(name="BOOK_UNEARNED_INTEREST")
	private String bookUnearnedInterest;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CALC_REQD")
	private String calcReqd;

	@Column(name="CARD_NO")
	private String cardNo;

	@Temporal(TemporalType.DATE)
	@Column(name="CHECKER_DT_STAMP")
	private Date checkerDtStamp;

	@Column(name="CHECKER_ID")
	private String checkerId;

	@Column(name="CHEQUE_BOOK_FACILITY")
	private String chequeBookFacility;

	@Column(name="CLG_BANK_CODE_CR")
	private String clgBankCodeCr;

	@Column(name="CLG_BANK_CODE_DR")
	private String clgBankCodeDr;

	@Column(name="CLG_BRN_CODE_CR")
	private String clgBrnCodeCr;

	@Column(name="CLG_BRN_CODE_DR")
	private String clgBrnCodeDr;

	@Column(name="CLG_PROD_CODE_CR")
	private String clgProdCodeCr;

	@Column(name="CLG_PROD_CODE_DR")
	private String clgProdCodeDr;

	@Column(name="COMMITMENT_TYPE")
	private String commitmentType;

	@Column(name="CR_ACC_BRN")
	private String crAccBrn;

	@Column(name="CR_PAYMENT_MODE")
	private String crPaymentMode;

	@Column(name="CR_PROD_AC")
	private String crProdAc;

	private BigDecimal creditdays;

	private String currency;

	@Column(name="CUST_FREQUENCY_UNIT")
	private String custFrequencyUnit;

	@Column(name="CUST_GRACE_PERIOD")
	private BigDecimal custGracePeriod;

	@Column(name="CUST_SHARE_PERCENT")
	private BigDecimal custSharePercent;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUTOFF_TRANSACTION")
	private String cutoffTransaction;

	@Column(name="DAYS_FOR_CIF_AC")
	private BigDecimal daysForCifAc;

	@Column(name="DAYS_FOR_GUA_AC")
	private BigDecimal daysForGuaAc;

	private String dealer;

	@Column(name="DELINQUENCY_STATUS")
	private String delinquencyStatus;

	@Column(name="DOWNPAYMENT_AMOUNT")
	private BigDecimal downpaymentAmount;

	@Column(name="DOWNPAYMENT_PERCEN")
	private BigDecimal downpaymentPercen;

	@Column(name="DR_ACC_BRN")
	private String drAccBrn;

	@Column(name="DR_PAYMENT_MODE")
	private String drPaymentMode;

	@Column(name="DR_PROD_AC")
	private String drProdAc;

	@Column(name="DUE_DATES_ON")
	private BigDecimal dueDatesOn;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="EMI_AMOUNT")
	private BigDecimal emiAmount;

	@Column(name="EMI_FREQ")
	private BigDecimal emiFreq;

	@Column(name="EMI_FREQ_UNIT")
	private String emiFreqUnit;

	@Temporal(TemporalType.DATE)
	@Column(name="END_CONSTRUCT_DT")
	private Date endConstructDt;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="END_POINT_CR")
	private String endPointCr;

	@Column(name="END_POINT_DR")
	private String endPointDr;

	@Column(name="ERROR_CODE")
	private String errorCode;

	@Column(name="EXCLUDE_INSTLMNT_FROM_BALLOON")
	private String excludeInstlmntFromBalloon;

	@Temporal(TemporalType.DATE)
	@Column(name="EXECUTION_DATE")
	private Date executionDate;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPECTED_CLOSURE_DATE")
	private Date expectedClosureDate;

	@Column(name="EXT_ACC_NAME_CR")
	private String extAccNameCr;

	@Column(name="EXT_ACC_NAME_DR")
	private String extAccNameDr;

	@Column(name="EXT_ACC_NO_CR")
	private String extAccNoCr;

	@Column(name="EXT_ACC_NO_DR")
	private String extAccNoDr;

	@Column(name="FA_ASSET_REF_NO")
	private String faAssetRefNo;

	@Column(name="FIELD_CHAR_1")
	private String fieldChar1;

	@Column(name="FIELD_CHAR_10")
	private String fieldChar10;

	@Column(name="FIELD_CHAR_11")
	private String fieldChar11;

	@Column(name="FIELD_CHAR_12")
	private String fieldChar12;

	@Column(name="FIELD_CHAR_13")
	private String fieldChar13;

	@Column(name="FIELD_CHAR_14")
	private String fieldChar14;

	@Column(name="FIELD_CHAR_15")
	private String fieldChar15;

	@Column(name="FIELD_CHAR_16")
	private String fieldChar16;

	@Column(name="FIELD_CHAR_17")
	private String fieldChar17;

	@Column(name="FIELD_CHAR_18")
	private String fieldChar18;

	@Column(name="FIELD_CHAR_19")
	private String fieldChar19;

	@Column(name="FIELD_CHAR_2")
	private String fieldChar2;

	@Column(name="FIELD_CHAR_20")
	private String fieldChar20;

	@Column(name="FIELD_CHAR_3")
	private String fieldChar3;

	@Column(name="FIELD_CHAR_4")
	private String fieldChar4;

	@Column(name="FIELD_CHAR_5")
	private String fieldChar5;

	@Column(name="FIELD_CHAR_6")
	private String fieldChar6;

	@Column(name="FIELD_CHAR_7")
	private String fieldChar7;

	@Column(name="FIELD_CHAR_8")
	private String fieldChar8;

	@Column(name="FIELD_CHAR_9")
	private String fieldChar9;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_1")
	private Date fieldDate1;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_10")
	private Date fieldDate10;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_2")
	private Date fieldDate2;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_3")
	private Date fieldDate3;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_4")
	private Date fieldDate4;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_5")
	private Date fieldDate5;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_6")
	private Date fieldDate6;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_7")
	private Date fieldDate7;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_8")
	private Date fieldDate8;

	@Temporal(TemporalType.DATE)
	@Column(name="FIELD_DATE_9")
	private Date fieldDate9;

	@Column(name="FIELD_NUMBER_1")
	private BigDecimal fieldNumber1;

	@Column(name="FIELD_NUMBER_10")
	private BigDecimal fieldNumber10;

	@Column(name="FIELD_NUMBER_11")
	private BigDecimal fieldNumber11;

	@Column(name="FIELD_NUMBER_12")
	private BigDecimal fieldNumber12;

	@Column(name="FIELD_NUMBER_13")
	private BigDecimal fieldNumber13;

	@Column(name="FIELD_NUMBER_14")
	private BigDecimal fieldNumber14;

	@Column(name="FIELD_NUMBER_15")
	private BigDecimal fieldNumber15;

	@Column(name="FIELD_NUMBER_16")
	private BigDecimal fieldNumber16;

	@Column(name="FIELD_NUMBER_17")
	private BigDecimal fieldNumber17;

	@Column(name="FIELD_NUMBER_18")
	private BigDecimal fieldNumber18;

	@Column(name="FIELD_NUMBER_19")
	private BigDecimal fieldNumber19;

	@Column(name="FIELD_NUMBER_2")
	private BigDecimal fieldNumber2;

	@Column(name="FIELD_NUMBER_20")
	private BigDecimal fieldNumber20;

	@Column(name="FIELD_NUMBER_3")
	private BigDecimal fieldNumber3;

	@Column(name="FIELD_NUMBER_4")
	private BigDecimal fieldNumber4;

	@Column(name="FIELD_NUMBER_5")
	private BigDecimal fieldNumber5;

	@Column(name="FIELD_NUMBER_6")
	private BigDecimal fieldNumber6;

	@Column(name="FIELD_NUMBER_7")
	private BigDecimal fieldNumber7;

	@Column(name="FIELD_NUMBER_8")
	private BigDecimal fieldNumber8;

	@Column(name="FIELD_NUMBER_9")
	private BigDecimal fieldNumber9;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_INS_DATE")
	private Date firstInsDate;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_PAY_BY_DATE")
	private Date firstPayByDate;

	private BigDecimal frequency;

	@Column(name="FREQUENCY_UNIT")
	private String frequencyUnit;

	@Column(name="FUND_ID")
	private String fundId;

	@Column(name="FUNDED_STATUS")
	private BigDecimal fundedStatus;

	@Column(name="FUTURE_DP_RECEIVABLE")
	private BigDecimal futureDpReceivable;

	@Column(name="GIRO_MODE_CR")
	private String giroModeCr;

	@Column(name="GIRO_MODE_DR")
	private String giroModeDr;

	@Column(name="GIRO_NUMBER_CR")
	private String giroNumberCr;

	@Column(name="GIRO_NUMBER_DR")
	private String giroNumberDr;

	@Column(name="GIRO_SERVICE_CR")
	private String giroServiceCr;

	@Column(name="GIRO_SERVICE_DR")
	private String giroServiceDr;

	@Column(name="HANDOVER_CONF")
	private String handoverConf;

	@Temporal(TemporalType.DATE)
	@Column(name="HANDOVER_DATE")
	private Date handoverDate;

	@Column(name="HAS_PROBLEMS")
	private String hasProblems;

	@Column(name="IBAN_AC_NO")
	private String ibanAcNo;

	@Column(name="IBAN_REQUIRED")
	private String ibanRequired;

	@Column(name="INDEX_XRATE")
	private BigDecimal indexXrate;

	@Column(name="INSTRUMENT_NO_CR")
	private String instrumentNoCr;

	@Column(name="INSTRUMENT_NO_DR")
	private String instrumentNoDr;

	@Column(name="INSURANCE_COMP_CODE")
	private String insuranceCompCode;

	@Column(name="INSURANCE_FINANCED")
	private String insuranceFinanced;

	@Column(name="INSURANCE_FLAG")
	private String insuranceFlag;

	@Column(name="INT_STMT")
	private String intStmt;

	@Column(name="INTEREST_CALC_METHOD")
	private String interestCalcMethod;

	@Column(name="INTEREST_SUBSIDY_ALLOWED")
	private String interestSubsidyAllowed;

	@Column(name="INTERMEDIARY_CODE")
	private String intermediaryCode;

	@Column(name="INTERMEDIARY_INITIATED")
	private String intermediaryInitiated;

	@Column(name="JOB_ID")
	private BigDecimal jobId;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_INTRADAY_ACCR_DT")
	private Date lastIntradayAccrDt;

	@Column(name="LATEST_ESN")
	private BigDecimal latestEsn;

	@Column(name="LC_REF_NO")
	private String lcRefNo;

	@Column(name="LEAD_ID")
	private String leadId;

	@Column(name="LEASE_EXTEND_BY")
	private BigDecimal leaseExtendBy;

	@Column(name="LEASE_PAYMENT_MODE")
	private String leasePaymentMode;

	@Column(name="LEASE_TYPE")
	private String leaseType;

	@Column(name="LINE_ID")
	private String lineId;

	@Column(name="LINKAGE_TYPE")
	private String linkageType;

	@Column(name="LINKED_REFERENCE")
	private String linkedReference;

	@Column(name="LIQ_BACK_VALUED_SCHEDULES")
	private String liqBackValuedSchedules;

	@Column(name="LIQ_COMP_DATES_FLAG")
	private String liqCompDatesFlag;

	@Column(name="LIQD_RESIDUAL_VALUE")
	private String liqdResidualValue;

	@Column(name="LIQUIDATION_MODE")
	private String liquidationMode;

	@Column(name="LOAN_AGAINST_SAL")
	private String loanAgainstSal;

	@Column(name="LOAN_DISBURSEMENT_CATEGORY")
	private String loanDisbursementCategory;

	@Column(name="LOAN_STLMNT_NOTICEFLG")
	private String loanStlmntNoticeflg;

	@Column(name="LOAN_STMT_REQD")
	private String loanStmtReqd;

	@Column(name="LOAN_TO_VALUE")
	private BigDecimal loanToValue;

	@Column(name="LOAN_TYPE")
	private String loanType;

	@Column(name="MAINTAIN_COST")
	private BigDecimal maintainCost;

	@Temporal(TemporalType.DATE)
	@Column(name="MAKER_DT_STAMP")
	private Date makerDtStamp;

	@Column(name="MAKER_ID")
	private String makerId;

	@Temporal(TemporalType.DATE)
	@Column(name="MATURITY_DATE")
	private Date maturityDate;

	@Column(name="MATURITY_TENOR")
	private BigDecimal maturityTenor;

	@Column(name="MATURITY_TYPE")
	private String maturityType;

	@Column(name="MATURITY_UNIT")
	private String maturityUnit;

	@Column(name="MAX_EMI")
	private BigDecimal maxEmi;

	@Column(name="MAX_RNOG")
	private BigDecimal maxRnog;

	@Column(name="MFI_LOAN_TYPE")
	private String mfiLoanType;

	@Temporal(TemporalType.DATE)
	@Column(name="MIGRATION_DATE")
	private Date migrationDate;

	@Column(name="MIN_AMT_DUE_RULE")
	private String minAmtDueRule;

	@Column(name="MIN_EMI")
	private BigDecimal minEmi;

	@Column(name="MODULE_CODE")
	private String moduleCode;

	@Column(name="MORTGAGE_GROUP")
	private String mortgageGroup;

	@Column(name="MUR_CONT_STATUS")
	private String murContStatus;

	@Column(name="NET_PRINCIPAL")
	private BigDecimal netPrincipal;

	@Temporal(TemporalType.DATE)
	@Column(name="NEXT_ACCR_DATE")
	private Date nextAccrDate;

	@Column(name="NO_OF_INSTALLMENTS")
	private BigDecimal noOfInstallments;

	@Column(name="NO_OF_TOPUP")
	private BigDecimal noOfTopup;

	@Column(name="NOTARY_AUTO_CONFIRMED")
	private String notaryAutoConfirmed;

	@Temporal(TemporalType.DATE)
	@Column(name="NOTICE_DATE")
	private Date noticeDate;

	@Column(name="OPEN_LINE_LOAN")
	private String openLineLoan;

	@Temporal(TemporalType.DATE)
	@Column(name="ORIGINAL_ST_DATE")
	private Date originalStDate;

	@Column(name="PACKING_CREDIT")
	private String packingCredit;

	@Column(name="PARTIAL_LIQUIDATION")
	private String partialLiquidation;

	@Column(name="PASSBOOK_FACILITY")
	private String passbookFacility;

	@Column(name="PAYER_ACC_NO_CR")
	private String payerAccNoCr;

	@Column(name="PAYER_ACC_NO_DR")
	private String payerAccNoDr;

	@Column(name="PAYER_ADDRESS1_CR")
	private String payerAddress1Cr;

	@Column(name="PAYER_ADDRESS1_DR")
	private String payerAddress1Dr;

	@Column(name="PAYER_ADDRESS2_CR")
	private String payerAddress2Cr;

	@Column(name="PAYER_ADDRESS2_DR")
	private String payerAddress2Dr;

	@Column(name="PAYER_ADDRESS3_CR")
	private String payerAddress3Cr;

	@Column(name="PAYER_ADDRESS3_DR")
	private String payerAddress3Dr;

	@Column(name="PAYER_ADDRESS4_CR")
	private String payerAddress4Cr;

	@Column(name="PAYER_ADDRESS4_DR")
	private String payerAddress4Dr;

	@Column(name="PAYER_BANK_CODE_CR")
	private String payerBankCodeCr;

	@Column(name="PAYER_BANK_CODE_DR")
	private String payerBankCodeDr;

	@Column(name="PAYER_BRANCH_CR")
	private String payerBranchCr;

	@Column(name="PAYER_BRANCH_DR")
	private String payerBranchDr;

	@Column(name="PAYMENT_DETAILS_1")
	private String paymentDetails1;

	@Column(name="PAYMENT_DETAILS_2")
	private String paymentDetails2;

	@Column(name="PAYMENT_DETAILS_3")
	private String paymentDetails3;

	@Column(name="PAYMENT_DETAILS_4")
	private String paymentDetails4;

	@Column(name="PC_CAT_CR")
	private String pcCatCr;

	@Column(name="PC_CAT_DR")
	private String pcCatDr;

	@Column(name="POST_CONST_UIDB")
	private BigDecimal postConstUidb;

	@Column(name="PRIMARY_APPLICANT_ID")
	private String primaryApplicantId;

	@Column(name="PRIMARY_APPLICANT_NAME")
	private String primaryApplicantName;

	@Column(name="PROCESS_CODE")
	private String processCode;

	@Column(name="PROCESS_NO")
	private BigDecimal processNo;

	@Column(name="PRODUCT_CATEGORY")
	private String productCategory;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PROJECT_ACCOUNT")
	private String projectAccount;

	@Column(name="PROP_HANDOVER")
	private String propHandover;

	@Column(name="PROVISIONING_MODE")
	private String provisioningMode;

	@Column(name="PURCHASE_ORD_REF_NO")
	private String purchaseOrdRefNo;

	@Column(name="RATE_CHG_ACTION")
	private String rateChgAction;

	@Column(name="RATE_CODE_PREF")
	private String rateCodePref;

	@Column(name="RECALC_ACTION_CODE")
	private String recalcActionCode;

	@Column(name="RECALC_ANNUITY")
	private String recalcAnnuity;

	@Column(name="RECMP_PRF_SCH")
	private String recmpPrfSch;

	@Column(name="RESCH_ALLOW")
	private String reschAllow;

	@Column(name="RESIDUAL_AMOUNT")
	private BigDecimal residualAmount;

	@Column(name="RESIDUAL_AUTO_LIQD")
	private String residualAutoLiqd;

	@Column(name="RESIDUAL_SUBSIDY_ALLOWED")
	private String residualSubsidyAllowed;

	@Column(name="RESIDUAL_SUBSIDY_VALUE")
	private BigDecimal residualSubsidyValue;

	@Column(name="RESIDUAL_VALUE")
	private BigDecimal residualValue;

	@Column(name="RESIDUAL_VALUE_BASIS")
	private String residualValueBasis;

	@Column(name="RETRIES_ADVICE_DAYS")
	private BigDecimal retriesAdviceDays;

	@Column(name="RETRIES_AUTO_LIQ")
	private BigDecimal retriesAutoLiq;

	@Column(name="REVOLVING_TYPE")
	private String revolvingType;

	@Column(name="RNOG_NO")
	private BigDecimal rnogNo;

	@Column(name="ROLL_BY")
	private String rollBy;

	@Column(name="ROLLOVER_ALLOWED")
	private String rolloverAllowed;

	@Column(name="ROLLOVER_TYPE")
	private String rolloverType;

	@Column(name="ROUTING_NO_CR")
	private String routingNoCr;

	@Column(name="ROUTING_NO_DR")
	private String routingNoDr;

	@Column(name="SANCTIONING_OFFICER")
	private String sanctioningOfficer;

	@Column(name="SCHEDULE_BASIS")
	private String scheduleBasis;

	@Column(name="SECR_STATUS")
	private String secrStatus;

	@Column(name="SECTOR_CODE_CR")
	private String sectorCodeCr;

	@Column(name="SECTOR_CODE_DR")
	private String sectorCodeDr;

	@Column(name="SEQUENCE_NO")
	private BigDecimal sequenceNo;

	@Column(name="SETTLEMENT_SEQ_NUM")
	private BigDecimal settlementSeqNum;

	@Column(name="SOURCE_CODE")
	private String sourceCode;

	@Column(name="SPECIAL_AMOUNT")
	private BigDecimal specialAmount;

	@Column(name="STAFF_FINANCE")
	private BigDecimal staffFinance;

	@Column(name="STATUS_CHANGE_MODE")
	private String statusChangeMode;

	@Column(name="STOP_ACCRUALS")
	private String stopAccruals;

	@Column(name="STOP_DSBR")
	private String stopDsbr;

	@Column(name="SUBSIDY_CUSTOMER_ID")
	private String subsidyCustomerId;

	@Column(name="SUPP_FREQUENCY_UNIT")
	private String suppFrequencyUnit;

	@Column(name="SUPP_GRACE_PERIOD")
	private BigDecimal suppGracePeriod;

	@Column(name="SUPPLIER_ID")
	private String supplierId;

	@Column(name="TAKAFUL_COST")
	private BigDecimal takafulCost;

	@Column(name="TAKEN_OVER")
	private String takenOver;

	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	@Column(name="TRACK_RECEIVABLE_ALIQ")
	private String trackReceivableAliq;

	@Column(name="TRACK_RECEIVABLE_MLIQ")
	private String trackReceivableMliq;

	@Column(name="UDE_ROLLOVER_BASIS")
	private String udeRolloverBasis;

	@Column(name="UI_CR_PROD_AC")
	private String uiCrProdAc;

	@Column(name="UI_DR_PROD_AC")
	private String uiDrProdAc;

	@Column(name="UIDB_CALC_REQD")
	private String uidbCalcReqd;

	@Column(name="UIDB_NOMINAL_AMT")
	private BigDecimal uidbNominalAmt;

	@Column(name="UPFRONT_PROFIT_BOOKED")
	private BigDecimal upfrontProfitBooked;

	@Column(name="UPLOAD_SOURCE_CR")
	private String uploadSourceCr;

	@Column(name="UPLOAD_SOURCE_DR")
	private String uploadSourceDr;

	@Column(name="UPLOAD_STATUS")
	private String uploadStatus;

	@Column(name="USE_GUARANTOR")
	private String useGuarantor;

	@Column(name="USER_DEFINED_STATUS")
	private String userDefinedStatus;

	@Column(name="USER_REF_NO")
	private String userRefNo;

	@Column(name="USGT_STATUS")
	private String usgtStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="VALUE_DATE")
	private Date valueDate;

	@Column(name="VERSION_NO")
	private BigDecimal versionNo;

	@Column(name="WAKALA_ACC_NO")
	private String wakalaAccNo;

	@Column(name="WINDOW_PERIOD_FREQ")
	private String windowPeriodFreq;

	@Column(name="WINDOW_PERIOD_UNIT")
	private BigDecimal windowPeriodUnit;

	public TransCltbAccountUpload() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAliqReversedPmt() {
		return this.aliqReversedPmt;
	}

	public void setAliqReversedPmt(String aliqReversedPmt) {
		this.aliqReversedPmt = aliqReversedPmt;
	}

	public String getAllowBackPeriodEntry() {
		return this.allowBackPeriodEntry;
	}

	public void setAllowBackPeriodEntry(String allowBackPeriodEntry) {
		this.allowBackPeriodEntry = allowBackPeriodEntry;
	}

	public String getAllowBulkPaymnet() {
		return this.allowBulkPaymnet;
	}

	public void setAllowBulkPaymnet(String allowBulkPaymnet) {
		this.allowBulkPaymnet = allowBulkPaymnet;
	}

	public String getAllowMultiParty() {
		return this.allowMultiParty;
	}

	public void setAllowMultiParty(String allowMultiParty) {
		this.allowMultiParty = allowMultiParty;
	}

	public String getAllowMultipleDp() {
		return this.allowMultipleDp;
	}

	public void setAllowMultipleDp(String allowMultipleDp) {
		this.allowMultipleDp = allowMultipleDp;
	}

	public String getAltAccNo() {
		return this.altAccNo;
	}

	public void setAltAccNo(String altAccNo) {
		this.altAccNo = altAccNo;
	}

	public String getAmendPastPaidSchedule() {
		return this.amendPastPaidSchedule;
	}

	public void setAmendPastPaidSchedule(String amendPastPaidSchedule) {
		this.amendPastPaidSchedule = amendPastPaidSchedule;
	}

	public String getAmortRescheduleOnDsbr() {
		return this.amortRescheduleOnDsbr;
	}

	public void setAmortRescheduleOnDsbr(String amortRescheduleOnDsbr) {
		this.amortRescheduleOnDsbr = amortRescheduleOnDsbr;
	}

	public String getAmortized() {
		return this.amortized;
	}

	public void setAmortized(String amortized) {
		this.amortized = amortized;
	}

	public String getAmountBlockFlag() {
		return this.amountBlockFlag;
	}

	public void setAmountBlockFlag(String amountBlockFlag) {
		this.amountBlockFlag = amountBlockFlag;
	}

	public String getAmountBlockRemarks() {
		return this.amountBlockRemarks;
	}

	public void setAmountBlockRemarks(String amountBlockRemarks) {
		this.amountBlockRemarks = amountBlockRemarks;
	}

	public BigDecimal getAmountBlocked() {
		return this.amountBlocked;
	}

	public void setAmountBlocked(BigDecimal amountBlocked) {
		this.amountBlocked = amountBlocked;
	}

	public BigDecimal getAmountDisbursed() {
		return this.amountDisbursed;
	}

	public void setAmountDisbursed(BigDecimal amountDisbursed) {
		this.amountDisbursed = amountDisbursed;
	}

	public BigDecimal getAmountFinanced() {
		return this.amountFinanced;
	}

	public void setAmountFinanced(BigDecimal amountFinanced) {
		this.amountFinanced = amountFinanced;
	}

	public BigDecimal getAmountUtilized() {
		return this.amountUtilized;
	}

	public void setAmountUtilized(BigDecimal amountUtilized) {
		this.amountUtilized = amountUtilized;
	}

	public BigDecimal getAmtAvailable() {
		return this.amtAvailable;
	}

	public void setAmtAvailable(BigDecimal amtAvailable) {
		this.amtAvailable = amtAvailable;
	}

	public BigDecimal getApplicantIncome() {
		return this.applicantIncome;
	}

	public void setApplicantIncome(BigDecimal applicantIncome) {
		this.applicantIncome = applicantIncome;
	}

	public String getApplicationNum() {
		return this.applicationNum;
	}

	public void setApplicationNum(String applicationNum) {
		this.applicationNum = applicationNum;
	}

	public BigDecimal getArrahnuExtension() {
		return this.arrahnuExtension;
	}

	public void setArrahnuExtension(BigDecimal arrahnuExtension) {
		this.arrahnuExtension = arrahnuExtension;
	}

	public String getArvnApplied() {
		return this.arvnApplied;
	}

	public void setArvnApplied(String arvnApplied) {
		this.arvnApplied = arvnApplied;
	}

	public BigDecimal getAssetCost() {
		return this.assetCost;
	}

	public void setAssetCost(BigDecimal assetCost) {
		this.assetCost = assetCost;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAtmFacility() {
		return this.atmFacility;
	}

	public void setAtmFacility(String atmFacility) {
		this.atmFacility = atmFacility;
	}

	public String getAuthStat() {
		return this.authStat;
	}

	public void setAuthStat(String authStat) {
		this.authStat = authStat;
	}

	public String getAutoCloseCollateral() {
		return this.autoCloseCollateral;
	}

	public void setAutoCloseCollateral(String autoCloseCollateral) {
		this.autoCloseCollateral = autoCloseCollateral;
	}

	public String getAutoManRollover() {
		return this.autoManRollover;
	}

	public void setAutoManRollover(String autoManRollover) {
		this.autoManRollover = autoManRollover;
	}

	public Date getBackValEffDt() {
		return this.backValEffDt;
	}

	public void setBackValEffDt(Date backValEffDt) {
		this.backValEffDt = backValEffDt;
	}

	public BigDecimal getBalloonAmount() {
		return this.balloonAmount;
	}

	public void setBalloonAmount(BigDecimal balloonAmount) {
		this.balloonAmount = balloonAmount;
	}

	public BigDecimal getBalloonPercent() {
		return this.balloonPercent;
	}

	public void setBalloonPercent(BigDecimal balloonPercent) {
		this.balloonPercent = balloonPercent;
	}

	public BigDecimal getBalloonRolloverInstallment() {
		return this.balloonRolloverInstallment;
	}

	public void setBalloonRolloverInstallment(BigDecimal balloonRolloverInstallment) {
		this.balloonRolloverInstallment = balloonRolloverInstallment;
	}

	public String getBalloonRolloverReqd() {
		return this.balloonRolloverReqd;
	}

	public void setBalloonRolloverReqd(String balloonRolloverReqd) {
		this.balloonRolloverReqd = balloonRolloverReqd;
	}

	public String getBalloonRolloverUnit() {
		return this.balloonRolloverUnit;
	}

	public void setBalloonRolloverUnit(String balloonRolloverUnit) {
		this.balloonRolloverUnit = balloonRolloverUnit;
	}

	public BigDecimal getBankSharePercent() {
		return this.bankSharePercent;
	}

	public void setBankSharePercent(BigDecimal bankSharePercent) {
		this.bankSharePercent = bankSharePercent;
	}

	public String getBillRefNo() {
		return this.billRefNo;
	}

	public void setBillRefNo(String billRefNo) {
		this.billRefNo = billRefNo;
	}

	public Date getBookDate() {
		return this.bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public String getBookUnearnedInterest() {
		return this.bookUnearnedInterest;
	}

	public void setBookUnearnedInterest(String bookUnearnedInterest) {
		this.bookUnearnedInterest = bookUnearnedInterest;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCalcReqd() {
		return this.calcReqd;
	}

	public void setCalcReqd(String calcReqd) {
		this.calcReqd = calcReqd;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
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

	public String getChequeBookFacility() {
		return this.chequeBookFacility;
	}

	public void setChequeBookFacility(String chequeBookFacility) {
		this.chequeBookFacility = chequeBookFacility;
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

	public String getCommitmentType() {
		return this.commitmentType;
	}

	public void setCommitmentType(String commitmentType) {
		this.commitmentType = commitmentType;
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

	public BigDecimal getCreditdays() {
		return this.creditdays;
	}

	public void setCreditdays(BigDecimal creditdays) {
		this.creditdays = creditdays;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustFrequencyUnit() {
		return this.custFrequencyUnit;
	}

	public void setCustFrequencyUnit(String custFrequencyUnit) {
		this.custFrequencyUnit = custFrequencyUnit;
	}

	public BigDecimal getCustGracePeriod() {
		return this.custGracePeriod;
	}

	public void setCustGracePeriod(BigDecimal custGracePeriod) {
		this.custGracePeriod = custGracePeriod;
	}

	public BigDecimal getCustSharePercent() {
		return this.custSharePercent;
	}

	public void setCustSharePercent(BigDecimal custSharePercent) {
		this.custSharePercent = custSharePercent;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCutoffTransaction() {
		return this.cutoffTransaction;
	}

	public void setCutoffTransaction(String cutoffTransaction) {
		this.cutoffTransaction = cutoffTransaction;
	}

	public BigDecimal getDaysForCifAc() {
		return this.daysForCifAc;
	}

	public void setDaysForCifAc(BigDecimal daysForCifAc) {
		this.daysForCifAc = daysForCifAc;
	}

	public BigDecimal getDaysForGuaAc() {
		return this.daysForGuaAc;
	}

	public void setDaysForGuaAc(BigDecimal daysForGuaAc) {
		this.daysForGuaAc = daysForGuaAc;
	}

	public String getDealer() {
		return this.dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getDelinquencyStatus() {
		return this.delinquencyStatus;
	}

	public void setDelinquencyStatus(String delinquencyStatus) {
		this.delinquencyStatus = delinquencyStatus;
	}

	public BigDecimal getDownpaymentAmount() {
		return this.downpaymentAmount;
	}

	public void setDownpaymentAmount(BigDecimal downpaymentAmount) {
		this.downpaymentAmount = downpaymentAmount;
	}

	public BigDecimal getDownpaymentPercen() {
		return this.downpaymentPercen;
	}

	public void setDownpaymentPercen(BigDecimal downpaymentPercen) {
		this.downpaymentPercen = downpaymentPercen;
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

	public BigDecimal getDueDatesOn() {
		return this.dueDatesOn;
	}

	public void setDueDatesOn(BigDecimal dueDatesOn) {
		this.dueDatesOn = dueDatesOn;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getEmiAmount() {
		return this.emiAmount;
	}

	public void setEmiAmount(BigDecimal emiAmount) {
		this.emiAmount = emiAmount;
	}

	public BigDecimal getEmiFreq() {
		return this.emiFreq;
	}

	public void setEmiFreq(BigDecimal emiFreq) {
		this.emiFreq = emiFreq;
	}

	public String getEmiFreqUnit() {
		return this.emiFreqUnit;
	}

	public void setEmiFreqUnit(String emiFreqUnit) {
		this.emiFreqUnit = emiFreqUnit;
	}

	public Date getEndConstructDt() {
		return this.endConstructDt;
	}

	public void setEndConstructDt(Date endConstructDt) {
		this.endConstructDt = endConstructDt;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getExcludeInstlmntFromBalloon() {
		return this.excludeInstlmntFromBalloon;
	}

	public void setExcludeInstlmntFromBalloon(String excludeInstlmntFromBalloon) {
		this.excludeInstlmntFromBalloon = excludeInstlmntFromBalloon;
	}

	public Date getExecutionDate() {
		return this.executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public Date getExpectedClosureDate() {
		return this.expectedClosureDate;
	}

	public void setExpectedClosureDate(Date expectedClosureDate) {
		this.expectedClosureDate = expectedClosureDate;
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

	public String getFaAssetRefNo() {
		return this.faAssetRefNo;
	}

	public void setFaAssetRefNo(String faAssetRefNo) {
		this.faAssetRefNo = faAssetRefNo;
	}

	public String getFieldChar1() {
		return this.fieldChar1;
	}

	public void setFieldChar1(String fieldChar1) {
		this.fieldChar1 = fieldChar1;
	}

	public String getFieldChar10() {
		return this.fieldChar10;
	}

	public void setFieldChar10(String fieldChar10) {
		this.fieldChar10 = fieldChar10;
	}

	public String getFieldChar11() {
		return this.fieldChar11;
	}

	public void setFieldChar11(String fieldChar11) {
		this.fieldChar11 = fieldChar11;
	}

	public String getFieldChar12() {
		return this.fieldChar12;
	}

	public void setFieldChar12(String fieldChar12) {
		this.fieldChar12 = fieldChar12;
	}

	public String getFieldChar13() {
		return this.fieldChar13;
	}

	public void setFieldChar13(String fieldChar13) {
		this.fieldChar13 = fieldChar13;
	}

	public String getFieldChar14() {
		return this.fieldChar14;
	}

	public void setFieldChar14(String fieldChar14) {
		this.fieldChar14 = fieldChar14;
	}

	public String getFieldChar15() {
		return this.fieldChar15;
	}

	public void setFieldChar15(String fieldChar15) {
		this.fieldChar15 = fieldChar15;
	}

	public String getFieldChar16() {
		return this.fieldChar16;
	}

	public void setFieldChar16(String fieldChar16) {
		this.fieldChar16 = fieldChar16;
	}

	public String getFieldChar17() {
		return this.fieldChar17;
	}

	public void setFieldChar17(String fieldChar17) {
		this.fieldChar17 = fieldChar17;
	}

	public String getFieldChar18() {
		return this.fieldChar18;
	}

	public void setFieldChar18(String fieldChar18) {
		this.fieldChar18 = fieldChar18;
	}

	public String getFieldChar19() {
		return this.fieldChar19;
	}

	public void setFieldChar19(String fieldChar19) {
		this.fieldChar19 = fieldChar19;
	}

	public String getFieldChar2() {
		return this.fieldChar2;
	}

	public void setFieldChar2(String fieldChar2) {
		this.fieldChar2 = fieldChar2;
	}

	public String getFieldChar20() {
		return this.fieldChar20;
	}

	public void setFieldChar20(String fieldChar20) {
		this.fieldChar20 = fieldChar20;
	}

	public String getFieldChar3() {
		return this.fieldChar3;
	}

	public void setFieldChar3(String fieldChar3) {
		this.fieldChar3 = fieldChar3;
	}

	public String getFieldChar4() {
		return this.fieldChar4;
	}

	public void setFieldChar4(String fieldChar4) {
		this.fieldChar4 = fieldChar4;
	}

	public String getFieldChar5() {
		return this.fieldChar5;
	}

	public void setFieldChar5(String fieldChar5) {
		this.fieldChar5 = fieldChar5;
	}

	public String getFieldChar6() {
		return this.fieldChar6;
	}

	public void setFieldChar6(String fieldChar6) {
		this.fieldChar6 = fieldChar6;
	}

	public String getFieldChar7() {
		return this.fieldChar7;
	}

	public void setFieldChar7(String fieldChar7) {
		this.fieldChar7 = fieldChar7;
	}

	public String getFieldChar8() {
		return this.fieldChar8;
	}

	public void setFieldChar8(String fieldChar8) {
		this.fieldChar8 = fieldChar8;
	}

	public String getFieldChar9() {
		return this.fieldChar9;
	}

	public void setFieldChar9(String fieldChar9) {
		this.fieldChar9 = fieldChar9;
	}

	public Date getFieldDate1() {
		return this.fieldDate1;
	}

	public void setFieldDate1(Date fieldDate1) {
		this.fieldDate1 = fieldDate1;
	}

	public Date getFieldDate10() {
		return this.fieldDate10;
	}

	public void setFieldDate10(Date fieldDate10) {
		this.fieldDate10 = fieldDate10;
	}

	public Date getFieldDate2() {
		return this.fieldDate2;
	}

	public void setFieldDate2(Date fieldDate2) {
		this.fieldDate2 = fieldDate2;
	}

	public Date getFieldDate3() {
		return this.fieldDate3;
	}

	public void setFieldDate3(Date fieldDate3) {
		this.fieldDate3 = fieldDate3;
	}

	public Date getFieldDate4() {
		return this.fieldDate4;
	}

	public void setFieldDate4(Date fieldDate4) {
		this.fieldDate4 = fieldDate4;
	}

	public Date getFieldDate5() {
		return this.fieldDate5;
	}

	public void setFieldDate5(Date fieldDate5) {
		this.fieldDate5 = fieldDate5;
	}

	public Date getFieldDate6() {
		return this.fieldDate6;
	}

	public void setFieldDate6(Date fieldDate6) {
		this.fieldDate6 = fieldDate6;
	}

	public Date getFieldDate7() {
		return this.fieldDate7;
	}

	public void setFieldDate7(Date fieldDate7) {
		this.fieldDate7 = fieldDate7;
	}

	public Date getFieldDate8() {
		return this.fieldDate8;
	}

	public void setFieldDate8(Date fieldDate8) {
		this.fieldDate8 = fieldDate8;
	}

	public Date getFieldDate9() {
		return this.fieldDate9;
	}

	public void setFieldDate9(Date fieldDate9) {
		this.fieldDate9 = fieldDate9;
	}

	public BigDecimal getFieldNumber1() {
		return this.fieldNumber1;
	}

	public void setFieldNumber1(BigDecimal fieldNumber1) {
		this.fieldNumber1 = fieldNumber1;
	}

	public BigDecimal getFieldNumber10() {
		return this.fieldNumber10;
	}

	public void setFieldNumber10(BigDecimal fieldNumber10) {
		this.fieldNumber10 = fieldNumber10;
	}

	public BigDecimal getFieldNumber11() {
		return this.fieldNumber11;
	}

	public void setFieldNumber11(BigDecimal fieldNumber11) {
		this.fieldNumber11 = fieldNumber11;
	}

	public BigDecimal getFieldNumber12() {
		return this.fieldNumber12;
	}

	public void setFieldNumber12(BigDecimal fieldNumber12) {
		this.fieldNumber12 = fieldNumber12;
	}

	public BigDecimal getFieldNumber13() {
		return this.fieldNumber13;
	}

	public void setFieldNumber13(BigDecimal fieldNumber13) {
		this.fieldNumber13 = fieldNumber13;
	}

	public BigDecimal getFieldNumber14() {
		return this.fieldNumber14;
	}

	public void setFieldNumber14(BigDecimal fieldNumber14) {
		this.fieldNumber14 = fieldNumber14;
	}

	public BigDecimal getFieldNumber15() {
		return this.fieldNumber15;
	}

	public void setFieldNumber15(BigDecimal fieldNumber15) {
		this.fieldNumber15 = fieldNumber15;
	}

	public BigDecimal getFieldNumber16() {
		return this.fieldNumber16;
	}

	public void setFieldNumber16(BigDecimal fieldNumber16) {
		this.fieldNumber16 = fieldNumber16;
	}

	public BigDecimal getFieldNumber17() {
		return this.fieldNumber17;
	}

	public void setFieldNumber17(BigDecimal fieldNumber17) {
		this.fieldNumber17 = fieldNumber17;
	}

	public BigDecimal getFieldNumber18() {
		return this.fieldNumber18;
	}

	public void setFieldNumber18(BigDecimal fieldNumber18) {
		this.fieldNumber18 = fieldNumber18;
	}

	public BigDecimal getFieldNumber19() {
		return this.fieldNumber19;
	}

	public void setFieldNumber19(BigDecimal fieldNumber19) {
		this.fieldNumber19 = fieldNumber19;
	}

	public BigDecimal getFieldNumber2() {
		return this.fieldNumber2;
	}

	public void setFieldNumber2(BigDecimal fieldNumber2) {
		this.fieldNumber2 = fieldNumber2;
	}

	public BigDecimal getFieldNumber20() {
		return this.fieldNumber20;
	}

	public void setFieldNumber20(BigDecimal fieldNumber20) {
		this.fieldNumber20 = fieldNumber20;
	}

	public BigDecimal getFieldNumber3() {
		return this.fieldNumber3;
	}

	public void setFieldNumber3(BigDecimal fieldNumber3) {
		this.fieldNumber3 = fieldNumber3;
	}

	public BigDecimal getFieldNumber4() {
		return this.fieldNumber4;
	}

	public void setFieldNumber4(BigDecimal fieldNumber4) {
		this.fieldNumber4 = fieldNumber4;
	}

	public BigDecimal getFieldNumber5() {
		return this.fieldNumber5;
	}

	public void setFieldNumber5(BigDecimal fieldNumber5) {
		this.fieldNumber5 = fieldNumber5;
	}

	public BigDecimal getFieldNumber6() {
		return this.fieldNumber6;
	}

	public void setFieldNumber6(BigDecimal fieldNumber6) {
		this.fieldNumber6 = fieldNumber6;
	}

	public BigDecimal getFieldNumber7() {
		return this.fieldNumber7;
	}

	public void setFieldNumber7(BigDecimal fieldNumber7) {
		this.fieldNumber7 = fieldNumber7;
	}

	public BigDecimal getFieldNumber8() {
		return this.fieldNumber8;
	}

	public void setFieldNumber8(BigDecimal fieldNumber8) {
		this.fieldNumber8 = fieldNumber8;
	}

	public BigDecimal getFieldNumber9() {
		return this.fieldNumber9;
	}

	public void setFieldNumber9(BigDecimal fieldNumber9) {
		this.fieldNumber9 = fieldNumber9;
	}

	public Date getFirstInsDate() {
		return this.firstInsDate;
	}

	public void setFirstInsDate(Date firstInsDate) {
		this.firstInsDate = firstInsDate;
	}

	public Date getFirstPayByDate() {
		return this.firstPayByDate;
	}

	public void setFirstPayByDate(Date firstPayByDate) {
		this.firstPayByDate = firstPayByDate;
	}

	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}

	public String getFrequencyUnit() {
		return this.frequencyUnit;
	}

	public void setFrequencyUnit(String frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}

	public String getFundId() {
		return this.fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public BigDecimal getFundedStatus() {
		return this.fundedStatus;
	}

	public void setFundedStatus(BigDecimal fundedStatus) {
		this.fundedStatus = fundedStatus;
	}

	public BigDecimal getFutureDpReceivable() {
		return this.futureDpReceivable;
	}

	public void setFutureDpReceivable(BigDecimal futureDpReceivable) {
		this.futureDpReceivable = futureDpReceivable;
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

	public String getHandoverConf() {
		return this.handoverConf;
	}

	public void setHandoverConf(String handoverConf) {
		this.handoverConf = handoverConf;
	}

	public Date getHandoverDate() {
		return this.handoverDate;
	}

	public void setHandoverDate(Date handoverDate) {
		this.handoverDate = handoverDate;
	}

	public String getHasProblems() {
		return this.hasProblems;
	}

	public void setHasProblems(String hasProblems) {
		this.hasProblems = hasProblems;
	}

	public String getIbanAcNo() {
		return this.ibanAcNo;
	}

	public void setIbanAcNo(String ibanAcNo) {
		this.ibanAcNo = ibanAcNo;
	}

	public String getIbanRequired() {
		return this.ibanRequired;
	}

	public void setIbanRequired(String ibanRequired) {
		this.ibanRequired = ibanRequired;
	}

	public BigDecimal getIndexXrate() {
		return this.indexXrate;
	}

	public void setIndexXrate(BigDecimal indexXrate) {
		this.indexXrate = indexXrate;
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

	public String getInsuranceCompCode() {
		return this.insuranceCompCode;
	}

	public void setInsuranceCompCode(String insuranceCompCode) {
		this.insuranceCompCode = insuranceCompCode;
	}

	public String getInsuranceFinanced() {
		return this.insuranceFinanced;
	}

	public void setInsuranceFinanced(String insuranceFinanced) {
		this.insuranceFinanced = insuranceFinanced;
	}

	public String getInsuranceFlag() {
		return this.insuranceFlag;
	}

	public void setInsuranceFlag(String insuranceFlag) {
		this.insuranceFlag = insuranceFlag;
	}

	public String getIntStmt() {
		return this.intStmt;
	}

	public void setIntStmt(String intStmt) {
		this.intStmt = intStmt;
	}

	public String getInterestCalcMethod() {
		return this.interestCalcMethod;
	}

	public void setInterestCalcMethod(String interestCalcMethod) {
		this.interestCalcMethod = interestCalcMethod;
	}

	public String getInterestSubsidyAllowed() {
		return this.interestSubsidyAllowed;
	}

	public void setInterestSubsidyAllowed(String interestSubsidyAllowed) {
		this.interestSubsidyAllowed = interestSubsidyAllowed;
	}

	public String getIntermediaryCode() {
		return this.intermediaryCode;
	}

	public void setIntermediaryCode(String intermediaryCode) {
		this.intermediaryCode = intermediaryCode;
	}

	public String getIntermediaryInitiated() {
		return this.intermediaryInitiated;
	}

	public void setIntermediaryInitiated(String intermediaryInitiated) {
		this.intermediaryInitiated = intermediaryInitiated;
	}

	public BigDecimal getJobId() {
		return this.jobId;
	}

	public void setJobId(BigDecimal jobId) {
		this.jobId = jobId;
	}

	public Date getLastIntradayAccrDt() {
		return this.lastIntradayAccrDt;
	}

	public void setLastIntradayAccrDt(Date lastIntradayAccrDt) {
		this.lastIntradayAccrDt = lastIntradayAccrDt;
	}

	public BigDecimal getLatestEsn() {
		return this.latestEsn;
	}

	public void setLatestEsn(BigDecimal latestEsn) {
		this.latestEsn = latestEsn;
	}

	public String getLcRefNo() {
		return this.lcRefNo;
	}

	public void setLcRefNo(String lcRefNo) {
		this.lcRefNo = lcRefNo;
	}

	public String getLeadId() {
		return this.leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public BigDecimal getLeaseExtendBy() {
		return this.leaseExtendBy;
	}

	public void setLeaseExtendBy(BigDecimal leaseExtendBy) {
		this.leaseExtendBy = leaseExtendBy;
	}

	public String getLeasePaymentMode() {
		return this.leasePaymentMode;
	}

	public void setLeasePaymentMode(String leasePaymentMode) {
		this.leasePaymentMode = leasePaymentMode;
	}

	public String getLeaseType() {
		return this.leaseType;
	}

	public void setLeaseType(String leaseType) {
		this.leaseType = leaseType;
	}

	public String getLineId() {
		return this.lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLinkageType() {
		return this.linkageType;
	}

	public void setLinkageType(String linkageType) {
		this.linkageType = linkageType;
	}

	public String getLinkedReference() {
		return this.linkedReference;
	}

	public void setLinkedReference(String linkedReference) {
		this.linkedReference = linkedReference;
	}

	public String getLiqBackValuedSchedules() {
		return this.liqBackValuedSchedules;
	}

	public void setLiqBackValuedSchedules(String liqBackValuedSchedules) {
		this.liqBackValuedSchedules = liqBackValuedSchedules;
	}

	public String getLiqCompDatesFlag() {
		return this.liqCompDatesFlag;
	}

	public void setLiqCompDatesFlag(String liqCompDatesFlag) {
		this.liqCompDatesFlag = liqCompDatesFlag;
	}

	public String getLiqdResidualValue() {
		return this.liqdResidualValue;
	}

	public void setLiqdResidualValue(String liqdResidualValue) {
		this.liqdResidualValue = liqdResidualValue;
	}

	public String getLiquidationMode() {
		return this.liquidationMode;
	}

	public void setLiquidationMode(String liquidationMode) {
		this.liquidationMode = liquidationMode;
	}

	public String getLoanAgainstSal() {
		return this.loanAgainstSal;
	}

	public void setLoanAgainstSal(String loanAgainstSal) {
		this.loanAgainstSal = loanAgainstSal;
	}

	public String getLoanDisbursementCategory() {
		return this.loanDisbursementCategory;
	}

	public void setLoanDisbursementCategory(String loanDisbursementCategory) {
		this.loanDisbursementCategory = loanDisbursementCategory;
	}

	public String getLoanStlmntNoticeflg() {
		return this.loanStlmntNoticeflg;
	}

	public void setLoanStlmntNoticeflg(String loanStlmntNoticeflg) {
		this.loanStlmntNoticeflg = loanStlmntNoticeflg;
	}

	public String getLoanStmtReqd() {
		return this.loanStmtReqd;
	}

	public void setLoanStmtReqd(String loanStmtReqd) {
		this.loanStmtReqd = loanStmtReqd;
	}

	public BigDecimal getLoanToValue() {
		return this.loanToValue;
	}

	public void setLoanToValue(BigDecimal loanToValue) {
		this.loanToValue = loanToValue;
	}

	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public BigDecimal getMaintainCost() {
		return this.maintainCost;
	}

	public void setMaintainCost(BigDecimal maintainCost) {
		this.maintainCost = maintainCost;
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

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getMaturityTenor() {
		return this.maturityTenor;
	}

	public void setMaturityTenor(BigDecimal maturityTenor) {
		this.maturityTenor = maturityTenor;
	}

	public String getMaturityType() {
		return this.maturityType;
	}

	public void setMaturityType(String maturityType) {
		this.maturityType = maturityType;
	}

	public String getMaturityUnit() {
		return this.maturityUnit;
	}

	public void setMaturityUnit(String maturityUnit) {
		this.maturityUnit = maturityUnit;
	}

	public BigDecimal getMaxEmi() {
		return this.maxEmi;
	}

	public void setMaxEmi(BigDecimal maxEmi) {
		this.maxEmi = maxEmi;
	}

	public BigDecimal getMaxRnog() {
		return this.maxRnog;
	}

	public void setMaxRnog(BigDecimal maxRnog) {
		this.maxRnog = maxRnog;
	}

	public String getMfiLoanType() {
		return this.mfiLoanType;
	}

	public void setMfiLoanType(String mfiLoanType) {
		this.mfiLoanType = mfiLoanType;
	}

	public Date getMigrationDate() {
		return this.migrationDate;
	}

	public void setMigrationDate(Date migrationDate) {
		this.migrationDate = migrationDate;
	}

	public String getMinAmtDueRule() {
		return this.minAmtDueRule;
	}

	public void setMinAmtDueRule(String minAmtDueRule) {
		this.minAmtDueRule = minAmtDueRule;
	}

	public BigDecimal getMinEmi() {
		return this.minEmi;
	}

	public void setMinEmi(BigDecimal minEmi) {
		this.minEmi = minEmi;
	}

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getMortgageGroup() {
		return this.mortgageGroup;
	}

	public void setMortgageGroup(String mortgageGroup) {
		this.mortgageGroup = mortgageGroup;
	}

	public String getMurContStatus() {
		return this.murContStatus;
	}

	public void setMurContStatus(String murContStatus) {
		this.murContStatus = murContStatus;
	}

	public BigDecimal getNetPrincipal() {
		return this.netPrincipal;
	}

	public void setNetPrincipal(BigDecimal netPrincipal) {
		this.netPrincipal = netPrincipal;
	}

	public Date getNextAccrDate() {
		return this.nextAccrDate;
	}

	public void setNextAccrDate(Date nextAccrDate) {
		this.nextAccrDate = nextAccrDate;
	}

	public BigDecimal getNoOfInstallments() {
		return this.noOfInstallments;
	}

	public void setNoOfInstallments(BigDecimal noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}

	public BigDecimal getNoOfTopup() {
		return this.noOfTopup;
	}

	public void setNoOfTopup(BigDecimal noOfTopup) {
		this.noOfTopup = noOfTopup;
	}

	public String getNotaryAutoConfirmed() {
		return this.notaryAutoConfirmed;
	}

	public void setNotaryAutoConfirmed(String notaryAutoConfirmed) {
		this.notaryAutoConfirmed = notaryAutoConfirmed;
	}

	public Date getNoticeDate() {
		return this.noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getOpenLineLoan() {
		return this.openLineLoan;
	}

	public void setOpenLineLoan(String openLineLoan) {
		this.openLineLoan = openLineLoan;
	}

	public Date getOriginalStDate() {
		return this.originalStDate;
	}

	public void setOriginalStDate(Date originalStDate) {
		this.originalStDate = originalStDate;
	}

	public String getPackingCredit() {
		return this.packingCredit;
	}

	public void setPackingCredit(String packingCredit) {
		this.packingCredit = packingCredit;
	}

	public String getPartialLiquidation() {
		return this.partialLiquidation;
	}

	public void setPartialLiquidation(String partialLiquidation) {
		this.partialLiquidation = partialLiquidation;
	}

	public String getPassbookFacility() {
		return this.passbookFacility;
	}

	public void setPassbookFacility(String passbookFacility) {
		this.passbookFacility = passbookFacility;
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

	public BigDecimal getPostConstUidb() {
		return this.postConstUidb;
	}

	public void setPostConstUidb(BigDecimal postConstUidb) {
		this.postConstUidb = postConstUidb;
	}

	public String getPrimaryApplicantId() {
		return this.primaryApplicantId;
	}

	public void setPrimaryApplicantId(String primaryApplicantId) {
		this.primaryApplicantId = primaryApplicantId;
	}

	public String getPrimaryApplicantName() {
		return this.primaryApplicantName;
	}

	public void setPrimaryApplicantName(String primaryApplicantName) {
		this.primaryApplicantName = primaryApplicantName;
	}

	public String getProcessCode() {
		return this.processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public BigDecimal getProcessNo() {
		return this.processNo;
	}

	public void setProcessNo(BigDecimal processNo) {
		this.processNo = processNo;
	}

	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProjectAccount() {
		return this.projectAccount;
	}

	public void setProjectAccount(String projectAccount) {
		this.projectAccount = projectAccount;
	}

	public String getPropHandover() {
		return this.propHandover;
	}

	public void setPropHandover(String propHandover) {
		this.propHandover = propHandover;
	}

	public String getProvisioningMode() {
		return this.provisioningMode;
	}

	public void setProvisioningMode(String provisioningMode) {
		this.provisioningMode = provisioningMode;
	}

	public String getPurchaseOrdRefNo() {
		return this.purchaseOrdRefNo;
	}

	public void setPurchaseOrdRefNo(String purchaseOrdRefNo) {
		this.purchaseOrdRefNo = purchaseOrdRefNo;
	}

	public String getRateChgAction() {
		return this.rateChgAction;
	}

	public void setRateChgAction(String rateChgAction) {
		this.rateChgAction = rateChgAction;
	}

	public String getRateCodePref() {
		return this.rateCodePref;
	}

	public void setRateCodePref(String rateCodePref) {
		this.rateCodePref = rateCodePref;
	}

	public String getRecalcActionCode() {
		return this.recalcActionCode;
	}

	public void setRecalcActionCode(String recalcActionCode) {
		this.recalcActionCode = recalcActionCode;
	}

	public String getRecalcAnnuity() {
		return this.recalcAnnuity;
	}

	public void setRecalcAnnuity(String recalcAnnuity) {
		this.recalcAnnuity = recalcAnnuity;
	}

	public String getRecmpPrfSch() {
		return this.recmpPrfSch;
	}

	public void setRecmpPrfSch(String recmpPrfSch) {
		this.recmpPrfSch = recmpPrfSch;
	}

	public String getReschAllow() {
		return this.reschAllow;
	}

	public void setReschAllow(String reschAllow) {
		this.reschAllow = reschAllow;
	}

	public BigDecimal getResidualAmount() {
		return this.residualAmount;
	}

	public void setResidualAmount(BigDecimal residualAmount) {
		this.residualAmount = residualAmount;
	}

	public String getResidualAutoLiqd() {
		return this.residualAutoLiqd;
	}

	public void setResidualAutoLiqd(String residualAutoLiqd) {
		this.residualAutoLiqd = residualAutoLiqd;
	}

	public String getResidualSubsidyAllowed() {
		return this.residualSubsidyAllowed;
	}

	public void setResidualSubsidyAllowed(String residualSubsidyAllowed) {
		this.residualSubsidyAllowed = residualSubsidyAllowed;
	}

	public BigDecimal getResidualSubsidyValue() {
		return this.residualSubsidyValue;
	}

	public void setResidualSubsidyValue(BigDecimal residualSubsidyValue) {
		this.residualSubsidyValue = residualSubsidyValue;
	}

	public BigDecimal getResidualValue() {
		return this.residualValue;
	}

	public void setResidualValue(BigDecimal residualValue) {
		this.residualValue = residualValue;
	}

	public String getResidualValueBasis() {
		return this.residualValueBasis;
	}

	public void setResidualValueBasis(String residualValueBasis) {
		this.residualValueBasis = residualValueBasis;
	}

	public BigDecimal getRetriesAdviceDays() {
		return this.retriesAdviceDays;
	}

	public void setRetriesAdviceDays(BigDecimal retriesAdviceDays) {
		this.retriesAdviceDays = retriesAdviceDays;
	}

	public BigDecimal getRetriesAutoLiq() {
		return this.retriesAutoLiq;
	}

	public void setRetriesAutoLiq(BigDecimal retriesAutoLiq) {
		this.retriesAutoLiq = retriesAutoLiq;
	}

	public String getRevolvingType() {
		return this.revolvingType;
	}

	public void setRevolvingType(String revolvingType) {
		this.revolvingType = revolvingType;
	}

	public BigDecimal getRnogNo() {
		return this.rnogNo;
	}

	public void setRnogNo(BigDecimal rnogNo) {
		this.rnogNo = rnogNo;
	}

	public String getRollBy() {
		return this.rollBy;
	}

	public void setRollBy(String rollBy) {
		this.rollBy = rollBy;
	}

	public String getRolloverAllowed() {
		return this.rolloverAllowed;
	}

	public void setRolloverAllowed(String rolloverAllowed) {
		this.rolloverAllowed = rolloverAllowed;
	}

	public String getRolloverType() {
		return this.rolloverType;
	}

	public void setRolloverType(String rolloverType) {
		this.rolloverType = rolloverType;
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

	public String getSanctioningOfficer() {
		return this.sanctioningOfficer;
	}

	public void setSanctioningOfficer(String sanctioningOfficer) {
		this.sanctioningOfficer = sanctioningOfficer;
	}

	public String getScheduleBasis() {
		return this.scheduleBasis;
	}

	public void setScheduleBasis(String scheduleBasis) {
		this.scheduleBasis = scheduleBasis;
	}

	public String getSecrStatus() {
		return this.secrStatus;
	}

	public void setSecrStatus(String secrStatus) {
		this.secrStatus = secrStatus;
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

	public BigDecimal getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(BigDecimal sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public BigDecimal getSettlementSeqNum() {
		return this.settlementSeqNum;
	}

	public void setSettlementSeqNum(BigDecimal settlementSeqNum) {
		this.settlementSeqNum = settlementSeqNum;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public BigDecimal getSpecialAmount() {
		return this.specialAmount;
	}

	public void setSpecialAmount(BigDecimal specialAmount) {
		this.specialAmount = specialAmount;
	}

	public BigDecimal getStaffFinance() {
		return this.staffFinance;
	}

	public void setStaffFinance(BigDecimal staffFinance) {
		this.staffFinance = staffFinance;
	}

	public String getStatusChangeMode() {
		return this.statusChangeMode;
	}

	public void setStatusChangeMode(String statusChangeMode) {
		this.statusChangeMode = statusChangeMode;
	}

	public String getStopAccruals() {
		return this.stopAccruals;
	}

	public void setStopAccruals(String stopAccruals) {
		this.stopAccruals = stopAccruals;
	}

	public String getStopDsbr() {
		return this.stopDsbr;
	}

	public void setStopDsbr(String stopDsbr) {
		this.stopDsbr = stopDsbr;
	}

	public String getSubsidyCustomerId() {
		return this.subsidyCustomerId;
	}

	public void setSubsidyCustomerId(String subsidyCustomerId) {
		this.subsidyCustomerId = subsidyCustomerId;
	}

	public String getSuppFrequencyUnit() {
		return this.suppFrequencyUnit;
	}

	public void setSuppFrequencyUnit(String suppFrequencyUnit) {
		this.suppFrequencyUnit = suppFrequencyUnit;
	}

	public BigDecimal getSuppGracePeriod() {
		return this.suppGracePeriod;
	}

	public void setSuppGracePeriod(BigDecimal suppGracePeriod) {
		this.suppGracePeriod = suppGracePeriod;
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public BigDecimal getTakafulCost() {
		return this.takafulCost;
	}

	public void setTakafulCost(BigDecimal takafulCost) {
		this.takafulCost = takafulCost;
	}

	public String getTakenOver() {
		return this.takenOver;
	}

	public void setTakenOver(String takenOver) {
		this.takenOver = takenOver;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTrackReceivableAliq() {
		return this.trackReceivableAliq;
	}

	public void setTrackReceivableAliq(String trackReceivableAliq) {
		this.trackReceivableAliq = trackReceivableAliq;
	}

	public String getTrackReceivableMliq() {
		return this.trackReceivableMliq;
	}

	public void setTrackReceivableMliq(String trackReceivableMliq) {
		this.trackReceivableMliq = trackReceivableMliq;
	}

	public String getUdeRolloverBasis() {
		return this.udeRolloverBasis;
	}

	public void setUdeRolloverBasis(String udeRolloverBasis) {
		this.udeRolloverBasis = udeRolloverBasis;
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

	public String getUidbCalcReqd() {
		return this.uidbCalcReqd;
	}

	public void setUidbCalcReqd(String uidbCalcReqd) {
		this.uidbCalcReqd = uidbCalcReqd;
	}

	public BigDecimal getUidbNominalAmt() {
		return this.uidbNominalAmt;
	}

	public void setUidbNominalAmt(BigDecimal uidbNominalAmt) {
		this.uidbNominalAmt = uidbNominalAmt;
	}

	public BigDecimal getUpfrontProfitBooked() {
		return this.upfrontProfitBooked;
	}

	public void setUpfrontProfitBooked(BigDecimal upfrontProfitBooked) {
		this.upfrontProfitBooked = upfrontProfitBooked;
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

	public String getUploadStatus() {
		return this.uploadStatus;
	}

	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}

	public String getUseGuarantor() {
		return this.useGuarantor;
	}

	public void setUseGuarantor(String useGuarantor) {
		this.useGuarantor = useGuarantor;
	}

	public String getUserDefinedStatus() {
		return this.userDefinedStatus;
	}

	public void setUserDefinedStatus(String userDefinedStatus) {
		this.userDefinedStatus = userDefinedStatus;
	}

	public String getUserRefNo() {
		return this.userRefNo;
	}

	public void setUserRefNo(String userRefNo) {
		this.userRefNo = userRefNo;
	}

	public String getUsgtStatus() {
		return this.usgtStatus;
	}

	public void setUsgtStatus(String usgtStatus) {
		this.usgtStatus = usgtStatus;
	}

	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;
	}

	public String getWakalaAccNo() {
		return this.wakalaAccNo;
	}

	public void setWakalaAccNo(String wakalaAccNo) {
		this.wakalaAccNo = wakalaAccNo;
	}

	public String getWindowPeriodFreq() {
		return this.windowPeriodFreq;
	}

	public void setWindowPeriodFreq(String windowPeriodFreq) {
		this.windowPeriodFreq = windowPeriodFreq;
	}

	public BigDecimal getWindowPeriodUnit() {
		return this.windowPeriodUnit;
	}

	public void setWindowPeriodUnit(BigDecimal windowPeriodUnit) {
		this.windowPeriodUnit = windowPeriodUnit;
	}

}