package com.jmr.batch.processor.checkbook;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.chequebook.TransCatmUploadCheckBook;
import com.jmr.batch.entity.chequebook.TransCatmUploadCheckBookPK;
import com.jmr.batch.model.checkbook.TransCatmUploadCheckBookModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProCatmUploadCheck
		implements ItemProcessor<TransCatmUploadCheckBookModel, TransCatmUploadCheckBook> {

	@Override

	public TransCatmUploadCheckBook process(TransCatmUploadCheckBookModel item) throws Exception {
		TransCatmUploadCheckBook transCatmUploadCheckBook = new TransCatmUploadCheckBook();
		transCatmUploadCheckBook.setSource_code(item.getSource_code());
		transCatmUploadCheckBook.setRequest_mode(item.getRequest_mode());
		transCatmUploadCheckBook.setRequest_status(item.getRequest_status());
		transCatmUploadCheckBook.setBook_type(item.getBook_type());
		transCatmUploadCheckBook.setErrmsg(item.getErrmsg());
		transCatmUploadCheckBook.setTrn_ref_no(item.getTrn_ref_no());
		transCatmUploadCheckBook.setExternal_ref_no(item.getExternal_ref_no());
		transCatmUploadCheckBook.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transCatmUploadCheckBook.setAction_code(item.getAction_code());
		transCatmUploadCheckBook.setOrder_details(item.getOrder_details());
		transCatmUploadCheckBook.setDelivery_add1(item.getDelivery_add1());
		transCatmUploadCheckBook.setDelivery_add2(item.getDelivery_add2());
		transCatmUploadCheckBook.setDelivery_add3(item.getDelivery_add3());
		transCatmUploadCheckBook.setDelivery_add4(item.getDelivery_add4());
		transCatmUploadCheckBook.setLanguage_code(item.getLanguage_code());
		transCatmUploadCheckBook.setDelivery_ref_no(item.getDelivery_ref_no());
		transCatmUploadCheckBook.setDelivery_mode(item.getDelivery_mode());
		transCatmUploadCheckBook.setCheque_book_type(item.getCheque_book_type());
		transCatmUploadCheckBook.setBook_type(item.getBook_type());
		transCatmUploadCheckBook.setPrint_status(item.getPrint_status());
		transCatmUploadCheckBook.setUpload_status_flag(item.getUpload_status_flag());
		transCatmUploadCheckBook.setChqbook_deliverd(item.getChqbook_deliverd());
		transCatmUploadCheckBook.setIncl_for_chkbook_printing(item.getIncl_for_chkbook_printing());
		transCatmUploadCheckBook.setApply_charge(item.getApply_charge());
		
	
		if(!JMRUtil.isNullOrEmpty(item.getCheck_leaves())){transCatmUploadCheckBook.setCheck_leaves(Double.valueOf(item.getCheck_leaves()));}
		if(!JMRUtil.isNullOrEmpty(item.getSeq_no())){transCatmUploadCheckBook.setSeq_no(Double.valueOf(item.getSeq_no()));}
		if (!JMRUtil.isNullOrEmpty(item.getOrder_date())) {transCatmUploadCheckBook.setOrder_date(JMRDateUtil.getDateFromString(item.getOrder_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getIssue_date())) {transCatmUploadCheckBook.setIssue_date(JMRDateUtil.getDateFromString(item.getIssue_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}
		if (!JMRUtil.isNullOrEmpty(item.getDelivery_date())) {transCatmUploadCheckBook.setDelivery_date(JMRDateUtil.getDateFromString(item.getDelivery_date(), JMRDateUtil.DATE_FORMATMMddyyyy));}

		TransCatmUploadCheckBookPK transUploadCheckBookPK = new TransCatmUploadCheckBookPK();
	
		
		transCatmUploadCheckBook.setId(transUploadCheckBookPK);
		transUploadCheckBookPK.setAccount(item.getAccount());
		transUploadCheckBookPK.setBranch(item.getBranch());
		transUploadCheckBookPK.setFirst_check_no(item.getFirst_check_no());

		
		return transCatmUploadCheckBook;

	}

}