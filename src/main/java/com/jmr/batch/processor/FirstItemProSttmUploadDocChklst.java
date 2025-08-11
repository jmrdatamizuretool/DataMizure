package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadDocChklst;
import com.jmr.batch.model.TransSttmUploadDocChklstModel;
import com.jmr.framework.util.JMRDateUtil;



@Component
public class FirstItemProSttmUploadDocChklst implements ItemProcessor<TransSttmUploadDocChklstModel, TransSttmUploadDocChklst> {

	@Override
	public TransSttmUploadDocChklst process(TransSttmUploadDocChklstModel item) throws Exception {
		
		TransSttmUploadDocChklst transSttmUploadDocChklst = new TransSttmUploadDocChklst();
		transSttmUploadDocChklst.setActual_sub_date(JMRDateUtil.getDateFromString(item.getActual_sub_date(), JMRDateUtil.DATE_FORMATMMddyyyy));	
		transSttmUploadDocChklst.setBranch_code(item.getBranch_code());
		transSttmUploadDocChklst.setChecked(item.getChecked());
		transSttmUploadDocChklst.setCustomer_no(item.getCustomer_no());
		transSttmUploadDocChklst.setDoc_category(item.getDoc_category());
		transSttmUploadDocChklst.setDocument_name(item.getDocument_name());
		transSttmUploadDocChklst.setDocument_ref_no(item.getDocument_ref_no());
		transSttmUploadDocChklst.setDocument_type(item.getDocument_type());
		transSttmUploadDocChklst.setExp_sub_date(JMRDateUtil.getDateFromString(item.getExp_sub_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadDocChklst.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadDocChklst.setRemarks(item.getRemarks());
		transSttmUploadDocChklst.setRequest_date(JMRDateUtil.getDateFromString(item.getRequest_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
		transSttmUploadDocChklst.setSource_code(item.getSource_code());
		transSttmUploadDocChklst.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		transSttmUploadDocChklst.setValid_till(JMRDateUtil.getDateFromString(item.getValid_till(), JMRDateUtil.DATE_FORMATMMddyyyy));
		return transSttmUploadDocChklst;
	}

}
