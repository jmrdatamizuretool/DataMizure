package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadCustProfessional;
import com.jmr.batch.model.TransSttmUploadCustProfessionalModel;

@Component
public class FirstItemProSttmUploadCustProfessional
		implements ItemProcessor<TransSttmUploadCustProfessionalModel, TransSttmUploadCustProfessional> {
	@Override
	public TransSttmUploadCustProfessional process(TransSttmUploadCustProfessionalModel item) {
		TransSttmUploadCustProfessional transSttmUploadCustProfessional = new TransSttmUploadCustProfessional();
		transSttmUploadCustProfessional.setCustomer_no(item.getCustomer_no());
		transSttmUploadCustProfessional.setEmployment_status(item.getEmployment_status());
		transSttmUploadCustProfessional.setEmployment_tenure(Double.valueOf(item.getEmployment_tenure()));
		transSttmUploadCustProfessional.setRetirement_age(Double.valueOf(item.getRetirement_age()));
		transSttmUploadCustProfessional.setPrev_designation(item.getPrev_designation());
		transSttmUploadCustProfessional.setPrev_employer(item.getPrev_employer());
		transSttmUploadCustProfessional.setDesignation(item.getDesignation());
		transSttmUploadCustProfessional.setEmployer(item.getEmployer());
		transSttmUploadCustProfessional.setE_address1(item.getE_address1());
		transSttmUploadCustProfessional.setE_address2(item.getE_address2());
		transSttmUploadCustProfessional.setE_address3(item.getE_address3());
		transSttmUploadCustProfessional.setE_telephone(item.getE_telephone());
		transSttmUploadCustProfessional.setE_telex(item.getE_telex());
		transSttmUploadCustProfessional.setE_fax(item.getE_fax());
		transSttmUploadCustProfessional.setE_email(item.getE_email());
		transSttmUploadCustProfessional.setSalary(Double.valueOf(item.getSalary()));
		transSttmUploadCustProfessional.setOther_expenses(Double.valueOf(item.getOther_expenses()));
		transSttmUploadCustProfessional.setOther_income(Double.valueOf(item.getOther_income()));
		transSttmUploadCustProfessional.setRent(Double.valueOf(item.getRent()));
		transSttmUploadCustProfessional.setInsurance(Double.valueOf(item.getInsurance()));
		transSttmUploadCustProfessional.setLoan_payment(Double.valueOf(item.getLoan_payment()));
		transSttmUploadCustProfessional.setHouse_value(Double.valueOf(item.getHouse_value()));
		transSttmUploadCustProfessional.setCredit_cards(Double.valueOf(item.getCredit_cards()));
		transSttmUploadCustProfessional.setE_country(item.getE_country());
		transSttmUploadCustProfessional.setCcy_pers_incexp(item.getCcy_pers_incexp());
		transSttmUploadCustProfessional.setConversion_status_flag(item.getConversion_status_flag());
		transSttmUploadCustProfessional.setErr_msg(item.getErr_msg());
		transSttmUploadCustProfessional.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadCustProfessional.setSource_seq_no(item.getSource_seq_no());
		transSttmUploadCustProfessional.setBranch_code(item.getBranch_code());
		transSttmUploadCustProfessional.setSource_code(item.getSource_code());
		transSttmUploadCustProfessional.setE_address4(item.getE_address4());
		transSttmUploadCustProfessional.setSalary_freq(item.getSalary_freq());
		transSttmUploadCustProfessional.setPincode(item.getPincode());

		return transSttmUploadCustProfessional;

	}
}
