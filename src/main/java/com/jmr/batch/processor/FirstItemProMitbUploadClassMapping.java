package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransMitbUploadClassMapping;
import com.jmr.batch.model.TransMitbUploadClassMappingModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProMitbUploadClassMapping
		implements ItemProcessor<TransMitbUploadClassMappingModel, TransMitbUploadClassMapping> {

	@Override

	public TransMitbUploadClassMapping process(TransMitbUploadClassMappingModel item) throws Exception {

		TransMitbUploadClassMapping transMitbUploadClassMapping = new TransMitbUploadClassMapping();
		transMitbUploadClassMapping.setSource_code(item.getSource_code());
		transMitbUploadClassMapping.setCustomer(item.getCustomer());
		transMitbUploadClassMapping.setMis_head(item.getMis_head());
		transMitbUploadClassMapping.setPool_code(item.getPool_code());
		transMitbUploadClassMapping.setFund_mis_1(item.getFund_mis_1());
		transMitbUploadClassMapping.setFund_mis_2(item.getFund_mis_2());
		transMitbUploadClassMapping.setFund_mis_3(item.getFund_mis_3());
		transMitbUploadClassMapping.setFund_mis_4(item.getFund_mis_4());
		transMitbUploadClassMapping.setFund_mis_5(item.getFund_mis_5());
		transMitbUploadClassMapping.setFund_mis_6(item.getFund_mis_6());
		transMitbUploadClassMapping.setFund_mis_7(item.getFund_mis_7());
		transMitbUploadClassMapping.setFund_mis_8(item.getFund_mis_8());
		transMitbUploadClassMapping.setFund_mis_9(item.getFund_mis_9());
		transMitbUploadClassMapping.setFund_mis_10(item.getFund_mis_10());
		transMitbUploadClassMapping.setComp_mis_1(item.getComp_mis_1());
		transMitbUploadClassMapping.setComp_mis_2(item.getComp_mis_2());
		transMitbUploadClassMapping.setComp_mis_3(item.getComp_mis_3());
		transMitbUploadClassMapping.setComp_mis_4(item.getComp_mis_4());
		transMitbUploadClassMapping.setComp_mis_5(item.getComp_mis_5());
		transMitbUploadClassMapping.setComp_mis_6(item.getComp_mis_6());
		transMitbUploadClassMapping.setComp_mis_7(item.getComp_mis_7());
		transMitbUploadClassMapping.setComp_mis_8(item.getComp_mis_8());
		transMitbUploadClassMapping.setComp_mis_9(item.getComp_mis_9());
		transMitbUploadClassMapping.setComp_mis_10(item.getComp_mis_10());
		transMitbUploadClassMapping.setTxn_mis_1(item.getTxn_mis_1());
		transMitbUploadClassMapping.setTxn_mis_2(item.getTxn_mis_2());
		transMitbUploadClassMapping.setTxn_mis_3(item.getTxn_mis_3());
		transMitbUploadClassMapping.setTxn_mis_4(item.getTxn_mis_4());
		transMitbUploadClassMapping.setTxn_mis_5(item.getTxn_mis_5());
		transMitbUploadClassMapping.setTxn_mis_6(item.getTxn_mis_6());
		transMitbUploadClassMapping.setTxn_mis_7(item.getTxn_mis_7());
		transMitbUploadClassMapping.setTxn_mis_8(item.getTxn_mis_8());
		transMitbUploadClassMapping.setTxn_mis_9(item.getTxn_mis_9());
		transMitbUploadClassMapping.setTxn_mis_10(item.getTxn_mis_10());
		transMitbUploadClassMapping.setCost_code1(item.getCost_code1());
		transMitbUploadClassMapping.setCost_code2(item.getCost_code2());
		transMitbUploadClassMapping.setCost_code3(item.getCost_code3());
		transMitbUploadClassMapping.setCost_code4(item.getCost_code4());
		transMitbUploadClassMapping.setCost_code5(item.getCost_code5());
		transMitbUploadClassMapping.setSerial_no(item.getSerial_no());
		transMitbUploadClassMapping.setCcy(item.getCcy());
		transMitbUploadClassMapping.setBranch_code(item.getBranch_code());
		transMitbUploadClassMapping.setRelated_account(item.getRelated_account());
		transMitbUploadClassMapping.setRelated_ref(item.getRelated_ref());
		transMitbUploadClassMapping.setSource_ref(item.getSource_ref());
		transMitbUploadClassMapping.setExternal_ref_no(item.getExternal_ref_no());
		transMitbUploadClassMapping.setMis_group(item.getMis_group());
		transMitbUploadClassMapping.setMis_group_txn(item.getMis_group_txn());
		transMitbUploadClassMapping.setMis_group_comp(item.getMis_group_comp());
		transMitbUploadClassMapping.setRef_rate_code(item.getRef_rate_code());
		transMitbUploadClassMapping.setUnit_type(item.getUnit_type());
		transMitbUploadClassMapping.setCalc_method(item.getCalc_method());
		transMitbUploadClassMapping.setRef_rate_type(item.getRef_rate_type());
		transMitbUploadClassMapping.setRate_flag(item.getRate_flag());
		transMitbUploadClassMapping.setProcessed_flag(item.getProcessed_flag());
		if (!JMRUtil.isNullOrEmpty(item.getRef_rate())) {
			transMitbUploadClassMapping.setRef_rate(Double.valueOf(item.getRef_rate()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getRef_spread())) {
			transMitbUploadClassMapping.setRef_spread(Double.valueOf(item.getRef_spread()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getExt_seq_no())) {
			transMitbUploadClassMapping.setExt_seq_no(Double.valueOf(item.getExt_seq_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transMitbUploadClassMapping.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}

		return transMitbUploadClassMapping;
	}
}