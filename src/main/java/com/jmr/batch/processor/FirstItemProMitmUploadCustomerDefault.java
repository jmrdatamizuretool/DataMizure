package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransMitmUploadCustomerDefault;
import com.jmr.batch.model.TransMitmUploadCustomerDefaultModel;

@Component
public class FirstItemProMitmUploadCustomerDefault
		implements ItemProcessor<TransMitmUploadCustomerDefaultModel, TransMitmUploadCustomerDefault> {

	@Override
	public TransMitmUploadCustomerDefault process(TransMitmUploadCustomerDefaultModel item) throws Exception {
		TransMitmUploadCustomerDefault transMitmUploadCustomerDefault = new TransMitmUploadCustomerDefault();

		transMitmUploadCustomerDefault.setCustomer(item.getCustomer());
		transMitmUploadCustomerDefault.setMis_group(item.getMis_group());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_1());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_2());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_3());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_4());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_5());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_6());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_7());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_8());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_9());
		transMitmUploadCustomerDefault.setCust_mis_1(item.getCust_mis_10());
		transMitmUploadCustomerDefault.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transMitmUploadCustomerDefault.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		transMitmUploadCustomerDefault.setBranch_code(item.getBranch_code());
		transMitmUploadCustomerDefault.setSource_code(item.getSource_code());
		return transMitmUploadCustomerDefault;
	}

}