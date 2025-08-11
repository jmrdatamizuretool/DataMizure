package com.jmr.batch.processor.loan;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpd;
import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpdPK;
import com.jmr.batch.model.loan.TransCltbAccColllnkdtlUpdModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCltbAccColllnkdtlUpd
		implements ItemProcessor<TransCltbAccColllnkdtlUpdModel, TransCltbAccColllnkdtlUpd> {

	@Override
	public TransCltbAccColllnkdtlUpd process(TransCltbAccColllnkdtlUpdModel item) throws Exception {
		TransCltbAccColllnkdtlUpd transCltbAccColllnkdtlUpd = new TransCltbAccColllnkdtlUpd();
		transCltbAccColllnkdtlUpd.setAccountNumber(item.getAccount_number());
		transCltbAccColllnkdtlUpd.setCommitmentProduct(item.getCommitment_product());

		transCltbAccColllnkdtlUpd.setDescription(item.getDescription());
		transCltbAccColllnkdtlUpd.setSourceCode(item.getSource_code());

		transCltbAccColllnkdtlUpd.setLinkageBranch(item.getLinkage_branch());
		transCltbAccColllnkdtlUpd.setLinkageCurrency(item.getLinkage_currency());
		transCltbAccColllnkdtlUpd.setTakenOver(item.getTaken_over());
		if (!JMRUtil.isNullOrEmpty(item.getLinked_percent_number())) {
			transCltbAccColllnkdtlUpd.setLinkedPercentNumber(new BigDecimal(item.getLinked_percent_number()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUtil_order())) {
			transCltbAccColllnkdtlUpd.setUtilOrder(new BigDecimal(item.getUtil_order()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getReinstate_order())) {
			transCltbAccColllnkdtlUpd.setReinstateOrder(new BigDecimal(item.getReinstate_order()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getHaircut())) {
			transCltbAccColllnkdtlUpd.setHaircut(new BigDecimal(item.getHaircut()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getOverall_amount())) {
			transCltbAccColllnkdtlUpd.setOverallAmount(new BigDecimal(item.getOverall_amount()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getLimit_amount())) {
			transCltbAccColllnkdtlUpd.setLimitAmount(new BigDecimal(item.getLimit_amount()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getLinked_amount())) {
			transCltbAccColllnkdtlUpd.setLinkedAmount(new BigDecimal(item.getLinked_amount()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getUtil_amount())) {
			transCltbAccColllnkdtlUpd.setUtilAmount(new BigDecimal(item.getUtil_amount()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getCollateral_category())) {
			transCltbAccColllnkdtlUpd.setCollateralCategory(new BigDecimal(item.getCollateral_category()));
		}

		TransCltbAccColllnkdtlUpdPK transCltbAccColllnkdtlUpdPK = new TransCltbAccColllnkdtlUpdPK();
		transCltbAccColllnkdtlUpdPK.setBranchCode(item.getBranch_code());
		transCltbAccColllnkdtlUpdPK.setExtRefNo(item.getExt_ref_no());

		transCltbAccColllnkdtlUpdPK.setLinkageType(item.getLinkage_type());

		transCltbAccColllnkdtlUpdPK.setLinkedReferenceNo(item.getLinked_reference_no());
		transCltbAccColllnkdtlUpdPK.setProcessCode(item.getProcess_code());

		if (!JMRUtil.isNullOrEmpty(item.getSequence_no())) {
			transCltbAccColllnkdtlUpdPK.setSequenceNo(new Long(item.getSequence_no()));
		}
		transCltbAccColllnkdtlUpd.setId(transCltbAccColllnkdtlUpdPK);

		return transCltbAccColllnkdtlUpd;
	}
}