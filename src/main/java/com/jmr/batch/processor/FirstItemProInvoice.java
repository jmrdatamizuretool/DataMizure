package com.jmr.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.Invoice;
import com.jmr.batch.model.InvoiceModel;

@Component
public class FirstItemProInvoice implements ItemProcessor<InvoiceModel, Invoice> {

	

	@Override
	public Invoice process(InvoiceModel item) throws Exception {
		Invoice invoice = new Invoice();
		invoice.setName(item.getName());
		invoice.setNum(item.getName());
		invoice.setLocation(item.getLocation());
		
		return invoice;
	}
}
