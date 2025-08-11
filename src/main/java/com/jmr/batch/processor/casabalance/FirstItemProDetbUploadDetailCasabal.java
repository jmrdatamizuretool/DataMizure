
package com.jmr.batch.processor.casabalance;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.casabalance.TransDetbUploadDetailCasabal;
import com.jmr.batch.entity.casabalance.TransDetbUploadDetailCasabalPK;
import com.jmr.batch.model.casabalance.TransDetbUploadDetailCasabalModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProDetbUploadDetailCasabal
	implements ItemProcessor<TransDetbUploadDetailCasabalModel, TransDetbUploadDetailCasabal> {
	
	@Override
	public TransDetbUploadDetailCasabal process(TransDetbUploadDetailCasabalModel item) throws Exception {
	TransDetbUploadDetailCasabal transDetbUploadDetailCasabal = new TransDetbUploadDetailCasabal();
	transDetbUploadDetailCasabal.setInstrumentNo(item.getInstrument_no());
	transDetbUploadDetailCasabal.setFinCycle(item.getFin_cycle());
	transDetbUploadDetailCasabal.setPeriodCode(item.getPeriod_code());
	transDetbUploadDetailCasabal.setMisCode(item.getMis_code());
	transDetbUploadDetailCasabal.setRelCust(item.getRel_cust());
	transDetbUploadDetailCasabal.setAddlText(item.getAddl_text());
	transDetbUploadDetailCasabal.setMisGroup(item.getMis_group());
	transDetbUploadDetailCasabal.setDwAcNo(item.getDw_ac_no());
	transDetbUploadDetailCasabal.setAccountNew(item.getAccount_new());
	transDetbUploadDetailCasabal.setTxnMis1(item.getTxn_mis_1());
	transDetbUploadDetailCasabal.setTxnMis2(item.getTxn_mis_2());
	transDetbUploadDetailCasabal.setTxnMis3(item.getTxn_mis_3());
	transDetbUploadDetailCasabal.setTxnMis4(item.getTxn_mis_4());
	transDetbUploadDetailCasabal.setTxnMis5(item.getTxn_mis_5());
	transDetbUploadDetailCasabal.setTxnMis6(item.getTxn_mis_6());
	transDetbUploadDetailCasabal.setTxnMis7(item.getTxn_mis_7());
	transDetbUploadDetailCasabal.setTxnMis8(item.getTxn_mis_8());
	transDetbUploadDetailCasabal.setTxnMis9(item.getTxn_mis_9());
	transDetbUploadDetailCasabal.setTxnMis10(item.getTxn_mis_10());
	transDetbUploadDetailCasabal.setCompMis1(item.getComp_mis_1());
	transDetbUploadDetailCasabal.setCompMis2(item.getComp_mis_2());
	transDetbUploadDetailCasabal.setCompMis3(item.getComp_mis_3());
	transDetbUploadDetailCasabal.setCompMis4(item.getComp_mis_4());
	transDetbUploadDetailCasabal.setCompMis5(item.getComp_mis_5());
	transDetbUploadDetailCasabal.setCompMis6(item.getComp_mis_6());
	transDetbUploadDetailCasabal.setCompMis7(item.getComp_mis_7());
	transDetbUploadDetailCasabal.setCompMis8(item.getComp_mis_8());
	transDetbUploadDetailCasabal.setCompMis9(item.getComp_mis_9());
	transDetbUploadDetailCasabal.setCompMis10(item.getComp_mis_10());
	transDetbUploadDetailCasabal.setCostCode1(item.getCost_code1());
	transDetbUploadDetailCasabal.setCostCode2(item.getCost_code2());
	transDetbUploadDetailCasabal.setCostCode3(item.getCost_code3());
	transDetbUploadDetailCasabal.setCostCode4(item.getCost_code4());
	transDetbUploadDetailCasabal.setCostCode5(item.getCost_code5());
	transDetbUploadDetailCasabal.setMisHead(item.getMis_head());
	transDetbUploadDetailCasabal.setRelatedAccount(item.getRelated_account());
	transDetbUploadDetailCasabal.setRelatedRef(item.getRelated_ref());
	transDetbUploadDetailCasabal.setPoolCode(item.getPool_code());
	transDetbUploadDetailCasabal.setMisFlag(item.getMis_flag());
	transDetbUploadDetailCasabal.setCcyCd(item.getCcy_cd());
	transDetbUploadDetailCasabal.setAccount(item.getAccount());
	transDetbUploadDetailCasabal.setAccountBranch(item.getAccount_branch());
	transDetbUploadDetailCasabal.setTxnCode(item.getTxn_code());
	transDetbUploadDetailCasabal.setExternalRefNo(item.getExternal_ref_no());
	transDetbUploadDetailCasabal.setReservedFundsRef(item.getReserved_funds_ref());
	transDetbUploadDetailCasabal.setDeleteStat(item.getDelete_stat());
	transDetbUploadDetailCasabal.setTxtFileName(item.getTxt_file_name());
	
	transDetbUploadDetailCasabal.setCalcMethod(item.getCalc_method());
	transDetbUploadDetailCasabal.setMisGroupTxn(item.getMis_group_txn());
	transDetbUploadDetailCasabal.setUploadStat(item.getUpload_stat());
	transDetbUploadDetailCasabal.setDrCr(item.getDr_cr());
	transDetbUploadDetailCasabal.setFundMis1(item.getFund_mis_1());
	transDetbUploadDetailCasabal.setFundMis2(item.getFund_mis_2());
	transDetbUploadDetailCasabal.setFundMis3(item.getFund_mis_3());
	transDetbUploadDetailCasabal.setFundMis4(item.getFund_mis_4());
	transDetbUploadDetailCasabal.setFundMis5(item.getFund_mis_5());
	transDetbUploadDetailCasabal.setFundMis6(item.getFund_mis_6());
	transDetbUploadDetailCasabal.setFundMis7(item.getFund_mis_7());
	transDetbUploadDetailCasabal.setFundMis8(item.getFund_mis_8());
	transDetbUploadDetailCasabal.setFundMis9(item.getFund_mis_9());
	transDetbUploadDetailCasabal.setFundMis10(item.getFund_mis_10());
	TransDetbUploadDetailCasabalPK transDetbUploadDetailCasabalPK = new TransDetbUploadDetailCasabalPK();
	

transDetbUploadDetailCasabalPK.setBranchCode(item.getBranch_code());
transDetbUploadDetailCasabalPK.setSourceCode(item.getSource_code());
transDetbUploadDetailCasabalPK.setBatchNo(item.getBatch_no());
if (!JMRUtil.isNullOrEmpty(item.getCurr_no())) {
	transDetbUploadDetailCasabalPK.setCurrNo(Double.valueOf(item.getCurr_no()));
}
transDetbUploadDetailCasabal.setId(transDetbUploadDetailCasabalPK);


return transDetbUploadDetailCasabal ;
}
}