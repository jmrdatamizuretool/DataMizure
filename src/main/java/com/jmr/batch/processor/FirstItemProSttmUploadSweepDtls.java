package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadSweepDtls;
import com.jmr.batch.model.TransSttmUploadSweepDtlsModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttmUploadSweepDtls implements ItemProcessor<TransSttmUploadSweepDtlsModel, TransSttmUploadSweepDtls> {

	@Override
	public TransSttmUploadSweepDtls process(TransSttmUploadSweepDtlsModel item) throws Exception {
		
		TransSttmUploadSweepDtls transSttmUploadSweepDtls = new TransSttmUploadSweepDtls();
		transSttmUploadSweepDtls.setAmount_block_no(item.getAmount_block_no());
		transSttmUploadSweepDtls.setDeposit_branch(item.getDeposit_branch());
		transSttmUploadSweepDtls.setBranch_code(item.getBranch_code());
		transSttmUploadSweepDtls.setDeposit_account(item.getDeposit_account());
		transSttmUploadSweepDtls.setCust_ac_no(item.getCust_ac_no());
		transSttmUploadSweepDtls.setSweep_type(item.getSweep_type());
		transSttmUploadSweepDtls.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadSweepDtls.setSource_code(item.getSource_code());
		transSttmUploadSweepDtls.setLimit_frequency(item.getLimit_frequency());
		transSttmUploadSweepDtls.setRetain_min_bal(item.getRetain_min_bal());
		if(!JMRUtil.isNullOrEmpty(item.getOrder_of_linkage())){transSttmUploadSweepDtls.setOrder_of_linkage(Double.valueOf(item.getOrder_of_linkage()));}
		if(!JMRUtil.isNullOrEmpty(item.getUtilized_amount())){transSttmUploadSweepDtls.setUtilized_amount(Double.valueOf(item.getUtilized_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getSweep_limit())){transSttmUploadSweepDtls.setSweep_limit(Double.valueOf(item.getSweep_limit()));}
		if(!JMRUtil.isNullOrEmpty(item.getOriginal_deposit_amount())){transSttmUploadSweepDtls.setOriginal_deposit_amount(Double.valueOf(item.getOriginal_deposit_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getLinked_percentage())){transSttmUploadSweepDtls.setLinked_percentage(Double.valueOf(item.getLinked_percentage()));}
		if(!JMRUtil.isNullOrEmpty(item.getLinked_amount())){transSttmUploadSweepDtls.setLinked_amount(Double.valueOf(item.getLinked_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getFreq_utilized_amount())){transSttmUploadSweepDtls.setFreq_utilized_amount(Double.valueOf(item.getFreq_utilized_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getBlocked_amount())){transSttmUploadSweepDtls.setBlocked_amount(Double.valueOf(item.getBlocked_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getAvailable_amount())){transSttmUploadSweepDtls.setAvailable_amount(Double.valueOf(item.getAvailable_amount()));}
		if(!JMRUtil.isNullOrEmpty(item.getSource_seq_no())){transSttmUploadSweepDtls.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));}

		return transSttmUploadSweepDtls;
	}

}
