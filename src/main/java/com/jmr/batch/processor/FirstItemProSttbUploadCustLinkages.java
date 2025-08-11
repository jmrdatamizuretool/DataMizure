package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttbUploadCustLinkages;
import com.jmr.batch.model.TransSttbUploadCustLinkagesModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;
@Component
public class FirstItemProSttbUploadCustLinkages
		implements ItemProcessor<TransSttbUploadCustLinkagesModel, TransSttbUploadCustLinkages> {

	@Override
	public TransSttbUploadCustLinkages process(TransSttbUploadCustLinkagesModel item) throws Exception {
		TransSttbUploadCustLinkages transSttbUploadCustLinkages = new TransSttbUploadCustLinkages();
		transSttbUploadCustLinkages.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttbUploadCustLinkages.setSource_code(item.getSource_code());
		transSttbUploadCustLinkages.setBranch_code(item.getBranch_code());
		transSttbUploadCustLinkages.setCust_ac_no(item.getCust_ac_no());
		transSttbUploadCustLinkages.setCustomer_no(item.getCustomer_no());
		transSttbUploadCustLinkages.setLinkage_type(item.getLinkage_type());
		transSttbUploadCustLinkages.setLinked_ref_no(item.getLinked_ref_no());
		if (!JMRUtil.isNullOrEmpty(item.getLinkage_percentage())) {
			transSttbUploadCustLinkages.setLinkage_percentage(Double.valueOf(item.getLinkage_percentage()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getLinkage_seq_no())) {
			transSttbUploadCustLinkages.setLinkage_seq_no(Double.valueOf(item.getLinkage_seq_no()));
		}
		transSttbUploadCustLinkages.setLinkage_branch(item.getLinkage_branch());
		transSttbUploadCustLinkages.setLinked_ccy(item.getLinked_ccy());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSttbUploadCustLinkages.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getEffective_date())) {
			transSttbUploadCustLinkages.setEffective_date(
					JMRDateUtil.getDateFromDateString(item.getEffective_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		return transSttbUploadCustLinkages;
	}

}
