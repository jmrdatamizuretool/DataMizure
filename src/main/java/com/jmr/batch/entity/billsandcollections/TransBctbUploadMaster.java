package com.jmr.batch.entity.billsandcollections;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANS_BCTB_UPLOAD_MASTER")
public class TransBctbUploadMaster {

    @EmbeddedId
    private TransBctbUploadMasterPK id;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "STAGE")
    private String stage;

    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @Column(name = "DOC_FLAG")
    private String docFlag;

    @Column(name = "LC_FLAG")
    private String lcFlag;

    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.DATE)
    private Date txnDate;

    @Column(name = "LIQUIDATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date liquidationDate;

    @Column(name = "VALUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date valueDate;

    @Column(name = "MATURITY_DATE")
    @Temporal(TemporalType.DATE)
    private Date maturityDate;

    @Column(name = "TENOR_DAYS")
    private Integer tenorDays;

    @Column(name = "BILL_AMT_LCY")
    private Double billAmtLcy;

    @Column(name = "CUSTOMER_ID")
    private String customerId;

    @Column(name = "CUSTOMER_PARTY_TYPE")
    private String customerPartyType;

    @Column(name = "BILL_AMT_LIQD")
    private Double billAmtLiqd;

    @Column(name = "FROM_CALC_DATE")
    @Temporal(TemporalType.DATE)
    private Date fromCalcDate;

    @Column(name = "TO_CALC_DATE")
    @Temporal(TemporalType.DATE)
    private Date toCalcDate;

    @Column(name = "TRANSIT_DAYS")
    private Integer transitDays;

    @Column(name = "STATUS_CHK_REQD")
    private String statusChkReqd;

    @Column(name = "ACP_TO_ADV_FLAG")
    private String acpToAdvFlag;

    @Column(name = "ACP_TO_DIS_FLAG")
    private String acpToDisFlag;

    @Column(name = "COLL_TO_PUR_FLAG")
    private String collToPurFlag;

    @Column(name = "AUTO_ACP_TO_ADV_FLAG")
    private String autoAcpToAdvFlag;

    @Column(name = "OVD_OVERDRAFT_FLAG")
    private String ovdOverdraftFlag;

    @Column(name = "IS_ICCF_CHANGED")
    private String isIccfChanged;

    @Column(name = "IS_TAX_CHANGED")
    private String isTaxChanged;

    @Column(name = "IS_SETTLEMENT_CHANGED")
    private String isSettlementChanged;

    @Column(name = "BASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date baseDate;

    @Column(name = "COLLECTION_REF")
    private String collectionRef;

    @Column(name = "TENOR_CODE")
    private String tenorCode;

    @Column(name = "BILL_CCY")
    private String billCcy;

    @Column(name = "BILL_AMT")
    private Double billAmt;

    @Column(name = "DOC_ORG_RECV_FLAG")
    private String docOrgRecvFlag;

    @Column(name = "DOC_DUP_RECV_FLAG")
    private String docDupRecvFlag;

    @Column(name = "LIMITS_MONITORING_FLAG")
    private String limitsMonitoringFlag;

    @Column(name = "REDISCOUNT_FLAG")
    private String rediscountFlag;

    @Column(name = "STATUS_CONTROL_FLAG")
    private String statusControlFlag;

    @Column(name = "AUTO_LIQ_FLAG")
    private String autoLiqFlag;

    @Column(name = "GRACE_DAYS")
    private Integer graceDays;

    @Column(name = "USER_DEFINED_STATUS")
    private String userDefinedStatus;

    @Column(name = "STATUS_ASOF_DATE")
    @Temporal(TemporalType.DATE)
    private Date statusAsofDate;

    @Column(name = "CR_VALUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date crValueDate;

    @Column(name = "DR_VALUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date drValueDate;

    @Column(name = "DIS_TO_COLL_FLAG")
    private String disToCollFlag;

    @Column(name = "PUR_TO_COLL_FLAG")
    private String purToCollFlag;

    @Column(name = "ACP_FROM_DATE")
    @Temporal(TemporalType.DATE)
    private Date acpFromDate;

    @Column(name = "ACP_TO_DATE")
    @Temporal(TemporalType.DATE)
    private Date acpToDate;

    @Column(name = "ACP_INT_COMP")
    private String acpIntComp;

    @Column(name = "ACP_ICCF_COL_TYPE")
    private String acpIccfColType;

    @Column(name = "ADVANCE_BY_LOAN")
    private String advanceByLoan;

    @Column(name = "ALLOW_ROLLOVER")
    private String allowRollover;

    @Column(name = "CONTRACT_REF_NO")
    private String contractRefNo;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "MSG_PROC_FLAG")
    private String msgProcFlag;

    @Column(name = "USER_REF")
    private String userRef;

    @Column(name = "ACTION_CODE")
    private String actionCode;

    @Column(name = "FUNCTION_ID")
    private String functionId;

    @Column(name = "COLL_TO_CAC_FLAG")
    private String collToCacFlag;

    // Getters and Setters
    public TransBctbUploadMasterPK getId() {
        return id;
    }

    public void setId(TransBctbUploadMasterPK id) {
        this.id = id;
    }

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDocFlag() {
		return docFlag;
	}

	public void setDocFlag(String docFlag) {
		this.docFlag = docFlag;
	}

	public String getLcFlag() {
		return lcFlag;
	}

	public void setLcFlag(String lcFlag) {
		this.lcFlag = lcFlag;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public Date getLiquidationDate() {
		return liquidationDate;
	}

	public void setLiquidationDate(Date liquidationDate) {
		this.liquidationDate = liquidationDate;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Integer getTenorDays() {
		return tenorDays;
	}

	public void setTenorDays(Integer tenorDays) {
		this.tenorDays = tenorDays;
	}

	public Double getBillAmtLcy() {
		return billAmtLcy;
	}

	public void setBillAmtLcy(Double billAmtLcy) {
		this.billAmtLcy = billAmtLcy;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPartyType() {
		return customerPartyType;
	}

	public void setCustomerPartyType(String customerPartyType) {
		this.customerPartyType = customerPartyType;
	}

	public Double getBillAmtLiqd() {
		return billAmtLiqd;
	}

	public void setBillAmtLiqd(Double billAmtLiqd) {
		this.billAmtLiqd = billAmtLiqd;
	}

	public Date getFromCalcDate() {
		return fromCalcDate;
	}

	public void setFromCalcDate(Date fromCalcDate) {
		this.fromCalcDate = fromCalcDate;
	}

	public Date getToCalcDate() {
		return toCalcDate;
	}

	public void setToCalcDate(Date toCalcDate) {
		this.toCalcDate = toCalcDate;
	}

	public Integer getTransitDays() {
		return transitDays;
	}

	public void setTransitDays(Integer transitDays) {
		this.transitDays = transitDays;
	}

	public String getStatusChkReqd() {
		return statusChkReqd;
	}

	public void setStatusChkReqd(String statusChkReqd) {
		this.statusChkReqd = statusChkReqd;
	}

	public String getAcpToAdvFlag() {
		return acpToAdvFlag;
	}

	public void setAcpToAdvFlag(String acpToAdvFlag) {
		this.acpToAdvFlag = acpToAdvFlag;
	}

	public String getAcpToDisFlag() {
		return acpToDisFlag;
	}

	public void setAcpToDisFlag(String acpToDisFlag) {
		this.acpToDisFlag = acpToDisFlag;
	}

	public String getCollToPurFlag() {
		return collToPurFlag;
	}

	public void setCollToPurFlag(String collToPurFlag) {
		this.collToPurFlag = collToPurFlag;
	}

	public String getAutoAcpToAdvFlag() {
		return autoAcpToAdvFlag;
	}

	public void setAutoAcpToAdvFlag(String autoAcpToAdvFlag) {
		this.autoAcpToAdvFlag = autoAcpToAdvFlag;
	}

	public String getOvdOverdraftFlag() {
		return ovdOverdraftFlag;
	}

	public void setOvdOverdraftFlag(String ovdOverdraftFlag) {
		this.ovdOverdraftFlag = ovdOverdraftFlag;
	}

	public String getIsIccfChanged() {
		return isIccfChanged;
	}

	public void setIsIccfChanged(String isIccfChanged) {
		this.isIccfChanged = isIccfChanged;
	}

	public String getIsTaxChanged() {
		return isTaxChanged;
	}

	public void setIsTaxChanged(String isTaxChanged) {
		this.isTaxChanged = isTaxChanged;
	}

	public String getIsSettlementChanged() {
		return isSettlementChanged;
	}

	public void setIsSettlementChanged(String isSettlementChanged) {
		this.isSettlementChanged = isSettlementChanged;
	}

	public Date getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}

	public String getCollectionRef() {
		return collectionRef;
	}

	public void setCollectionRef(String collectionRef) {
		this.collectionRef = collectionRef;
	}

	public String getTenorCode() {
		return tenorCode;
	}

	public void setTenorCode(String tenorCode) {
		this.tenorCode = tenorCode;
	}

	public String getBillCcy() {
		return billCcy;
	}

	public void setBillCcy(String billCcy) {
		this.billCcy = billCcy;
	}

	public Double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Double billAmt) {
		this.billAmt = billAmt;
	}

	public String getDocOrgRecvFlag() {
		return docOrgRecvFlag;
	}

	public void setDocOrgRecvFlag(String docOrgRecvFlag) {
		this.docOrgRecvFlag = docOrgRecvFlag;
	}

	public String getDocDupRecvFlag() {
		return docDupRecvFlag;
	}

	public void setDocDupRecvFlag(String docDupRecvFlag) {
		this.docDupRecvFlag = docDupRecvFlag;
	}

	public String getLimitsMonitoringFlag() {
		return limitsMonitoringFlag;
	}

	public void setLimitsMonitoringFlag(String limitsMonitoringFlag) {
		this.limitsMonitoringFlag = limitsMonitoringFlag;
	}

	public String getRediscountFlag() {
		return rediscountFlag;
	}

	public void setRediscountFlag(String rediscountFlag) {
		this.rediscountFlag = rediscountFlag;
	}

	public String getStatusControlFlag() {
		return statusControlFlag;
	}

	public void setStatusControlFlag(String statusControlFlag) {
		this.statusControlFlag = statusControlFlag;
	}

	public String getAutoLiqFlag() {
		return autoLiqFlag;
	}

	public void setAutoLiqFlag(String autoLiqFlag) {
		this.autoLiqFlag = autoLiqFlag;
	}

	public Integer getGraceDays() {
		return graceDays;
	}

	public void setGraceDays(Integer graceDays) {
		this.graceDays = graceDays;
	}

	public String getUserDefinedStatus() {
		return userDefinedStatus;
	}

	public void setUserDefinedStatus(String userDefinedStatus) {
		this.userDefinedStatus = userDefinedStatus;
	}

	public Date getStatusAsofDate() {
		return statusAsofDate;
	}

	public void setStatusAsofDate(Date statusAsofDate) {
		this.statusAsofDate = statusAsofDate;
	}

	public Date getCrValueDate() {
		return crValueDate;
	}

	public void setCrValueDate(Date crValueDate) {
		this.crValueDate = crValueDate;
	}

	public Date getDrValueDate() {
		return drValueDate;
	}

	public void setDrValueDate(Date drValueDate) {
		this.drValueDate = drValueDate;
	}

	public String getDisToCollFlag() {
		return disToCollFlag;
	}

	public void setDisToCollFlag(String disToCollFlag) {
		this.disToCollFlag = disToCollFlag;
	}

	public String getPurToCollFlag() {
		return purToCollFlag;
	}

	public void setPurToCollFlag(String purToCollFlag) {
		this.purToCollFlag = purToCollFlag;
	}

	public Date getAcpFromDate() {
		return acpFromDate;
	}

	public void setAcpFromDate(Date acpFromDate) {
		this.acpFromDate = acpFromDate;
	}

	public Date getAcpToDate() {
		return acpToDate;
	}

	public void setAcpToDate(Date acpToDate) {
		this.acpToDate = acpToDate;
	}

	public String getAcpIntComp() {
		return acpIntComp;
	}

	public void setAcpIntComp(String acpIntComp) {
		this.acpIntComp = acpIntComp;
	}

	public String getAcpIccfColType() {
		return acpIccfColType;
	}

	public void setAcpIccfColType(String acpIccfColType) {
		this.acpIccfColType = acpIccfColType;
	}

	public String getAdvanceByLoan() {
		return advanceByLoan;
	}

	public void setAdvanceByLoan(String advanceByLoan) {
		this.advanceByLoan = advanceByLoan;
	}

	public String getAllowRollover() {
		return allowRollover;
	}

	public void setAllowRollover(String allowRollover) {
		this.allowRollover = allowRollover;
	}

	public String getContractRefNo() {
		return contractRefNo;
	}

	public void setContractRefNo(String contractRefNo) {
		this.contractRefNo = contractRefNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getMsgProcFlag() {
		return msgProcFlag;
	}

	public void setMsgProcFlag(String msgProcFlag) {
		this.msgProcFlag = msgProcFlag;
	}

	public String getUserRef() {
		return userRef;
	}

	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getCollToCacFlag() {
		return collToCacFlag;
	}

	public void setCollToCacFlag(String collToCacFlag) {
		this.collToCacFlag = collToCacFlag;
	}

    // Generate getters and setters for other fields as needed
}
