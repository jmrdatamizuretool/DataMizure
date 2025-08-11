package com.jmr.batch.processor;


import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemProcessor;
import com.jmr.batch.entity.TransSttmUploadCustDomestic;
import com.jmr.batch.model.TransSttmUploadCustDomesticModel;



@Component
public class FirstItemProSttmUploadCustDomestic implements ItemProcessor<TransSttmUploadCustDomesticModel, TransSttmUploadCustDomestic> {
	
	@Override
	public TransSttmUploadCustDomestic process(TransSttmUploadCustDomesticModel item) {
		TransSttmUploadCustDomestic transSttmUploadCustDomestic = new TransSttmUploadCustDomestic();
		transSttmUploadCustDomestic.setCustomer_no(null);
		transSttmUploadCustDomestic.setCustomer_no(item.getCustomer_no());		
        transSttmUploadCustDomestic.setEducational_status(item.getEducational_status());
        transSttmUploadCustDomestic.setMarital_status(item.getMarital_status());
        transSttmUploadCustDomestic.setSpouse_name(item.getSpouse_name());
        transSttmUploadCustDomestic.setSpouse_emp_status(item.getSpouse_name());
        transSttmUploadCustDomestic.setDependent_children(Double.valueOf(item.getDependent_children()));
        transSttmUploadCustDomestic.setAccomodation(item.getAccomodation());
        transSttmUploadCustDomestic.setConversion_status_flag(item.getConversion_status_flag());
        transSttmUploadCustDomestic.setErr_msg(item.getErr_msg());
        transSttmUploadCustDomestic.setMaintenance_seq_no(item.getMaintenance_seq_no());
        transSttmUploadCustDomestic.setMother_maiden_name(item.getMother_maiden_name());
        return transSttmUploadCustDomestic;
		
	}

}
