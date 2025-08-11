package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransCstbRelationshipUpload;
import com.jmr.batch.model.TransCstbRelationshipUploadModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCstbRelationshipUpload
		implements ItemProcessor<TransCstbRelationshipUploadModel, TransCstbRelationshipUpload> {

	@Override
	public TransCstbRelationshipUpload process(TransCstbRelationshipUploadModel item) throws Exception {

		TransCstbRelationshipUpload transCstbRelationshipUpload = new TransCstbRelationshipUpload();
		transCstbRelationshipUpload.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transCstbRelationshipUpload.setRef_no(item.getRef_no());
		transCstbRelationshipUpload.setCategory(item.getCategory());
		transCstbRelationshipUpload.setCustomer_no(item.getCustomer_no());
		transCstbRelationshipUpload.setRelation(item.getRelation());
		transCstbRelationshipUpload.setInherit(item.getInherit());
		transCstbRelationshipUpload.setBranch(item.getBranch());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transCstbRelationshipUpload.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}
		transCstbRelationshipUpload.setBranch_code(item.getBranch_code());
		transCstbRelationshipUpload.setSource_code(item.getSource_code());
		transCstbRelationshipUpload.setSource_ref(item.getSource_ref());
		return transCstbRelationshipUpload;
	}

}
