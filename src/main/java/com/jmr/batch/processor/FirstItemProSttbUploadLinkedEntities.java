package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import com.jmr.batch.entity.TransSttbUploadLinkedEntities;
import com.jmr.batch.model.TransSttbUploadLinkedEntitiesModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProSttbUploadLinkedEntities
		implements ItemProcessor<TransSttbUploadLinkedEntitiesModel, TransSttbUploadLinkedEntities> {
	@Override
	public TransSttbUploadLinkedEntities process(TransSttbUploadLinkedEntitiesModel item) throws Exception {

		TransSttbUploadLinkedEntities transSttbUploadLinkedEntities = new TransSttbUploadLinkedEntities();
		transSttbUploadLinkedEntities.setJoint_holder_code(item.getJoint_holder_code());
		transSttbUploadLinkedEntities.setJoint_holder(item.getJoint_holder());
		transSttbUploadLinkedEntities.setBranch_code(item.getBranch_code());
		transSttbUploadLinkedEntities.setCust_ac_no(item.getCust_ac_no());
		transSttbUploadLinkedEntities.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttbUploadLinkedEntities.setSource_code(item.getSource_code());
		transSttbUploadLinkedEntities.setJoint_holder_description(item.getJoint_holder_description());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSttbUploadLinkedEntities.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		if (!JMRUtil.isNullOrEmpty(item.getEnd_date())) {
			transSttbUploadLinkedEntities
					.setEnd_date(JMRDateUtil.getDateFromString(item.getEnd_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}
		if (!JMRUtil.isNullOrEmpty(item.getStart_date())) {
			transSttbUploadLinkedEntities.setStart_date(
					JMRDateUtil.getDateFromString(item.getStart_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		}

		return transSttbUploadLinkedEntities;
	}
}