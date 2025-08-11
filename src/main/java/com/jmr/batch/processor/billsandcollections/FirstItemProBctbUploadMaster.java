package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadMasterPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadMasterModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadMaster
        implements ItemProcessor<TransBctbUploadMasterModel, TransBctbUploadMaster> {


    @Override
    public TransBctbUploadMaster process(TransBctbUploadMasterModel item) throws Exception {

        TransBctbUploadMaster entity = new TransBctbUploadMaster();

        // --- Build composite primary key ---
        TransBctbUploadMasterPK pk = new TransBctbUploadMasterPK();
        pk.setSourceCode(item.getSource_code());
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Double.parseDouble(item.getSource_seq_no()));
        }

        entity.setId(pk);

        // --- Map other fields ---
        entity.setOperation(item.getOperation());
        entity.setStage(item.getStage());
        entity.setProductType(item.getProduct_type());
        entity.setDocFlag(item.getDoc_flag());
        entity.setLcFlag(item.getLc_flag());

        if (!JMRUtil.isNullOrEmpty(item.getTxn_date())) {
            entity.setTxnDate(JMRDateUtil.getDateFromString(item.getTxn_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getLiquidation_date())) {
            entity.setLiquidationDate(JMRDateUtil.getDateFromString(item.getLiquidation_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getValue_date())) {
            entity.setValueDate(JMRDateUtil.getDateFromString(item.getValue_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getMaturity_date())) {
            entity.setMaturityDate(JMRDateUtil.getDateFromString(item.getMaturity_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getTenor_days())) {
            entity.setTenorDays(Integer.valueOf(item.getTenor_days()));
        }
        if (!JMRUtil.isNullOrEmpty(item.getBill_amt_lcy())) {
            entity.setBillAmtLcy(Double.valueOf(item.getBill_amt_lcy()));
        }

        entity.setCustomerId(item.getCustomer_id());
        entity.setCustomerPartyType(item.getCustomer_party_type());

        if (!JMRUtil.isNullOrEmpty(item.getBill_amt_liqd())) {
            entity.setBillAmtLiqd(Double.valueOf(item.getBill_amt_liqd()));
        }

        if (!JMRUtil.isNullOrEmpty(item.getFrom_calc_date())) {
            entity.setFromCalcDate(JMRDateUtil.getDateFromString(item.getFrom_calc_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getTo_calc_date())) {
            entity.setToCalcDate(JMRDateUtil.getDateFromString(item.getTo_calc_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getTransit_days())) {
            entity.setTransitDays(Integer.valueOf(item.getTransit_days()));
        }

        entity.setStatusChkReqd(item.getStatus_chk_reqd());
        entity.setAcpToAdvFlag(item.getAcp_to_adv_flag());
        entity.setAcpToDisFlag(item.getAcp_to_dis_flag());
        entity.setCollToPurFlag(item.getColl_to_pur_flag());
        entity.setAutoAcpToAdvFlag(item.getAuto_acp_to_adv_flag());
        entity.setOvdOverdraftFlag(item.getOvd_overdraft_flag());
        entity.setIsIccfChanged(item.getIs_iccf_changed());
        entity.setIsTaxChanged(item.getIs_tax_changed());
        entity.setIsSettlementChanged(item.getIs_settlement_changed());

        if (!JMRUtil.isNullOrEmpty(item.getBase_date())) {
            entity.setBaseDate(JMRDateUtil.getDateFromString(item.getBase_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setCollectionRef(item.getCollection_ref());
        entity.setTenorCode(item.getTenor_code());
        entity.setBillCcy(item.getBill_ccy());

        if (!JMRUtil.isNullOrEmpty(item.getBill_amt())) {
            entity.setBillAmt(Double.valueOf(item.getBill_amt()));
        }

        entity.setDocOrgRecvFlag(item.getDoc_org_recv_flag());
        entity.setDocDupRecvFlag(item.getDoc_dup_recv_flag());
        entity.setLimitsMonitoringFlag(item.getLimits_monitoring_flag());
        entity.setRediscountFlag(item.getRediscount_flag());
        entity.setStatusControlFlag(item.getStatus_control_flag());
        entity.setAutoLiqFlag(item.getAuto_liq_flag());

        if (!JMRUtil.isNullOrEmpty(item.getGrace_days())) {
            entity.setGraceDays(Integer.valueOf(item.getGrace_days()));
        }

        entity.setUserDefinedStatus(item.getUser_defined_status());

        if (!JMRUtil.isNullOrEmpty(item.getStatus_asof_date())) {
            entity.setStatusAsofDate(JMRDateUtil.getDateFromString(item.getStatus_asof_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getCr_value_date())) {
            entity.setCrValueDate(JMRDateUtil.getDateFromString(item.getCr_value_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getDr_value_date())) {
            entity.setDrValueDate(JMRDateUtil.getDateFromString(item.getDr_value_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setDisToCollFlag(item.getDis_to_coll_flag());
        entity.setPurToCollFlag(item.getPur_to_coll_flag());

        if (!JMRUtil.isNullOrEmpty(item.getAcp_from_date())) {
            entity.setAcpFromDate(JMRDateUtil.getDateFromString(item.getAcp_from_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }
        if (!JMRUtil.isNullOrEmpty(item.getAcp_to_date())) {
            entity.setAcpToDate(JMRDateUtil.getDateFromString(item.getAcp_to_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setAcpIntComp(item.getAcp_int_comp());
        entity.setAcpIccfColType(item.getAcp_iccf_col_type());
        entity.setAdvanceByLoan(item.getAdvance_by_loan());
        entity.setAllowRollover(item.getAllow_rollover());
        entity.setContractRefNo(item.getContract_ref_no());
        entity.setProductCode(item.getProduct_code());
        entity.setMsgProcFlag(item.getMsg_proc_flag());
        entity.setUserRef(item.getUser_ref());
        entity.setActionCode(item.getAction_code());
        entity.setFunctionId(item.getFunction_id());
        entity.setCollToCacFlag(item.getColl_to_cac_flag());

        return entity;
    }
}
