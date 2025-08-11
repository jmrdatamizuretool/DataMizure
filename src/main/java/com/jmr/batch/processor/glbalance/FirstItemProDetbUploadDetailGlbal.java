
package com.jmr.batch.processor.glbalance;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.casabalance.TransDetbUploadMasterCasabalPK;
import com.jmr.batch.entity.glbalance.TransDetbUploadDetailGlbal;
import com.jmr.batch.entity.glbalance.TransDetbUploadDetailGlbalPK;
import com.jmr.batch.model.glbalance.TransDetbUploadDetailGlbalModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProDetbUploadDetailGlbal
	implements ItemProcessor<TransDetbUploadDetailGlbalModel, TransDetbUploadDetailGlbal> {
	
	@Override
	public TransDetbUploadDetailGlbal process(TransDetbUploadDetailGlbalModel item) throws Exception {
	TransDetbUploadDetailGlbal transDetbUploadDetailGlbal = new TransDetbUploadDetailGlbal();
	transDetbUploadDetailGlbal.setInstrumentNo(item.getInstrument_no());
	transDetbUploadDetailGlbal.setFinCycle(item.getFin_cycle());
	transDetbUploadDetailGlbal.setPeriodCode(item.getPeriod_code());
	transDetbUploadDetailGlbal.setMisCode(item.getMis_code());
	transDetbUploadDetailGlbal.setRelCust(item.getRel_cust());
	transDetbUploadDetailGlbal.setAddlText(item.getAddl_text());
	transDetbUploadDetailGlbal.setMisGroup(item.getMis_group());
	transDetbUploadDetailGlbal.setDwAcNo(item.getDw_ac_no());
	transDetbUploadDetailGlbal.setAccountNew(item.getAccount_new());
	transDetbUploadDetailGlbal.setTxnMis1(item.getTxn_mis_1());
	transDetbUploadDetailGlbal.setTxnMis2(item.getTxn_mis_2());
	transDetbUploadDetailGlbal.setTxnMis3(item.getTxn_mis_3());
	transDetbUploadDetailGlbal.setTxnMis4(item.getTxn_mis_4());
	transDetbUploadDetailGlbal.setTxnMis5(item.getTxn_mis_5());
	transDetbUploadDetailGlbal.setTxnMis6(item.getTxn_mis_6());
	transDetbUploadDetailGlbal.setTxnMis7(item.getTxn_mis_7());
	transDetbUploadDetailGlbal.setTxnMis8(item.getTxn_mis_8());
	transDetbUploadDetailGlbal.setTxnMis9(item.getTxn_mis_9());
	transDetbUploadDetailGlbal.setTxnMis10(item.getTxn_mis_10());
	transDetbUploadDetailGlbal.setCompMis1(item.getComp_mis_1());
	transDetbUploadDetailGlbal.setCompMis2(item.getComp_mis_2());
	transDetbUploadDetailGlbal.setCompMis3(item.getComp_mis_3());
	transDetbUploadDetailGlbal.setCompMis4(item.getComp_mis_4());
	transDetbUploadDetailGlbal.setCompMis5(item.getComp_mis_5());
	transDetbUploadDetailGlbal.setCompMis6(item.getComp_mis_6());
	transDetbUploadDetailGlbal.setCompMis7(item.getComp_mis_7());
	transDetbUploadDetailGlbal.setCompMis8(item.getComp_mis_8());
	transDetbUploadDetailGlbal.setCompMis9(item.getComp_mis_9());
	transDetbUploadDetailGlbal.setCompMis10(item.getComp_mis_10());
	transDetbUploadDetailGlbal.setCostCode1(item.getCost_code1());
	transDetbUploadDetailGlbal.setCostCode2(item.getCost_code2());
	transDetbUploadDetailGlbal.setCostCode3(item.getCost_code3());
	transDetbUploadDetailGlbal.setCostCode4(item.getCost_code4());
	transDetbUploadDetailGlbal.setCostCode5(item.getCost_code5());
	transDetbUploadDetailGlbal.setMisHead(item.getMis_head());
	transDetbUploadDetailGlbal.setRelatedAccount(item.getRelated_account());
	transDetbUploadDetailGlbal.setRelatedRef(item.getRelated_ref());
	transDetbUploadDetailGlbal.setPoolCode(item.getPool_code());
	transDetbUploadDetailGlbal.setMisFlag(item.getMis_flag());
	transDetbUploadDetailGlbal.setCcyCd(item.getCcy_cd());
	transDetbUploadDetailGlbal.setAccount(item.getAccount());
	transDetbUploadDetailGlbal.setAccountBranch(item.getAccount_branch());
	transDetbUploadDetailGlbal.setTxnCode(item.getTxn_code());
	transDetbUploadDetailGlbal.setExternalRefNo(item.getExternal_ref_no());
	transDetbUploadDetailGlbal.setReservedFundsRef(item.getReserved_funds_ref());
	transDetbUploadDetailGlbal.setDeleteStat(item.getDelete_stat());
	transDetbUploadDetailGlbal.setTxtFileName(item.getTxt_file_name());
	
	transDetbUploadDetailGlbal.setCalcMethod(item.getCalc_method());
	transDetbUploadDetailGlbal.setMisGroupTxn(item.getMis_group_txn());
	transDetbUploadDetailGlbal.setUploadStat(item.getUpload_stat());
	transDetbUploadDetailGlbal.setDrCr(item.getDr_cr());
	transDetbUploadDetailGlbal.setFundMis1(item.getFund_mis_1());
	transDetbUploadDetailGlbal.setFundMis2(item.getFund_mis_2());
	transDetbUploadDetailGlbal.setFundMis3(item.getFund_mis_3());
	transDetbUploadDetailGlbal.setFundMis4(item.getFund_mis_4());
	transDetbUploadDetailGlbal.setFundMis5(item.getFund_mis_5());
	transDetbUploadDetailGlbal.setFundMis6(item.getFund_mis_6());
	transDetbUploadDetailGlbal.setFundMis7(item.getFund_mis_7());
	transDetbUploadDetailGlbal.setFundMis8(item.getFund_mis_8());
	transDetbUploadDetailGlbal.setFundMis9(item.getFund_mis_9());
	transDetbUploadDetailGlbal.setFundMis10(item.getFund_mis_10());
	TransDetbUploadDetailGlbalPK transDetbUploadDetailGlbalPK = new TransDetbUploadDetailGlbalPK();
	

transDetbUploadDetailGlbalPK.setBranchCode(item.getBranch_code());
transDetbUploadDetailGlbalPK.setSourceCode(item.getSource_code());
transDetbUploadDetailGlbalPK.setBatchNo(item.getBatch_no());
if (!JMRUtil.isNullOrEmpty(item.getCurr_no())) {
	transDetbUploadDetailGlbalPK.setCurrNo(Double.valueOf(item.getCurr_no()));
}
transDetbUploadDetailGlbal.setId(transDetbUploadDetailGlbalPK);


return transDetbUploadDetailGlbal ;
}
}