
package com.jmr.batch.processor.amount;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.amount.TransCatmUploadAmountBlocks;
import com.jmr.batch.entity.amount.TransCatmUploadAmountBlocksPK;
import com.jmr.batch.model.amount.TransCatmUploadAmountBlocksModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCatmUploadAmountBlocks
		implements ItemProcessor<TransCatmUploadAmountBlocksModel, TransCatmUploadAmountBlocks> {

	@Override
	public TransCatmUploadAmountBlocks process(TransCatmUploadAmountBlocksModel item) throws Exception {
		TransCatmUploadAmountBlocks transCatmUploadAmountBlocks = new TransCatmUploadAmountBlocks();

		transCatmUploadAmountBlocks.setSourceCode(item.getSource_code());
		transCatmUploadAmountBlocks.setReferenceNo(item.getReference_no());

		transCatmUploadAmountBlocks.setBranchCode(item.getBranch_code());
		transCatmUploadAmountBlocks.setRemarks(item.getRemarks());
		transCatmUploadAmountBlocks.setErrmsg(item.getErrmsg());
		transCatmUploadAmountBlocks.setAccountNo(item.getAccount_no());

		transCatmUploadAmountBlocks.setHoldCode(item.getHold_code());
		transCatmUploadAmountBlocks.setActionCode(item.getAction_code());
		transCatmUploadAmountBlocks.setAmountBlockType(item.getAmount_block_type());
		transCatmUploadAmountBlocks.setFundAvlCheck(item.getFund_avl_check());
		if (!JMRUtil.isNullOrEmpty(item.getAmount())) {
			transCatmUploadAmountBlocks.setAmount(Double.valueOf(item.getAmount()));
		}
		transCatmUploadAmountBlocks.setUploadStatusFlag(item.getUpload_status_flag());
		if (!JMRUtil.isNullOrEmpty(item.getEffective_date())) {
			transCatmUploadAmountBlocks.setEffectiveDate(
					JMRDateUtil.getDateFromString(item.getEffective_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getExpiry_date())) {
			transCatmUploadAmountBlocks.setExpiryDate(
					JMRDateUtil.getDateFromString(item.getExpiry_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}

		TransCatmUploadAmountBlocksPK transCatmUploadAmountBlocksPK = new TransCatmUploadAmountBlocksPK();
		transCatmUploadAmountBlocksPK.setAmountBlockNo(item.getAmount_block_no());
		transCatmUploadAmountBlocksPK.setMaintenanceSeqNo(item.getMaintenance_seq_no());

		transCatmUploadAmountBlocks.setId(transCatmUploadAmountBlocksPK);

		return transCatmUploadAmountBlocks;
	}
}