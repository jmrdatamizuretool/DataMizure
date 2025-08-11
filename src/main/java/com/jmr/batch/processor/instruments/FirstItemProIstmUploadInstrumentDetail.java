package com.jmr.batch.processor.instruments;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentDetail;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentDetailPK;
import com.jmr.batch.model.instruments.TransIstmUploadInstrumentDetailModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIstmUploadInstrumentDetail implements ItemProcessor<TransIstmUploadInstrumentDetailModel, TransIstmUploadInstrumentDetail> {

	@Override

	public TransIstmUploadInstrumentDetail process(TransIstmUploadInstrumentDetailModel item) throws Exception {
	TransIstmUploadInstrumentDetail transIstmUploadInstrumentDetail = new TransIstmUploadInstrumentDetail();
	
	transIstmUploadInstrumentDetail.setAccountBranch(item.getAccount_branch());
	transIstmUploadInstrumentDetail.setCcy(item.getCcy());
	transIstmUploadInstrumentDetail.setErrmsg(item.getErrmsg());
	transIstmUploadInstrumentDetail.setAccount(item.getAccount());
	transIstmUploadInstrumentDetail.setBeneficiary(item.getBeneficiary());
	transIstmUploadInstrumentDetail.setStatus(item.getStatus());
	transIstmUploadInstrumentDetail.setUploadStatusFlag(item.getUpload_status_flag());
	
	if(!JMRUtil.isNullOrEmpty(item.getAmount())){transIstmUploadInstrumentDetail.setAmount(Double.valueOf(item.getAmount()));}

	TransIstmUploadInstrumentDetailPK transIstmUploadInstrumentDetailPK = new TransIstmUploadInstrumentDetailPK();
	if(!JMRUtil.isNullOrEmpty(item.getGeneration_date())){transIstmUploadInstrumentDetail.setGenerationDate(JMRDateUtil.getDateFromString(item.getGeneration_date(),JMRDateUtil.DATE_FORMATMMddyyyy));}
	if(!JMRUtil.isNullOrEmpty(item.getValue_date())){transIstmUploadInstrumentDetail.setValueDate(JMRDateUtil.getDateFromString(item.getValue_date(),JMRDateUtil.DATE_FORMATMMddyyyy));}
	transIstmUploadInstrumentDetailPK.setSourceCode(item.getSource_code());
	transIstmUploadInstrumentDetailPK.setInstrumentType(item.getInstrument_type());
	transIstmUploadInstrumentDetailPK.setBranch(item.getBranch());
	transIstmUploadInstrumentDetailPK.setChequeBookNo(item.getCheque_book_no());
	transIstmUploadInstrumentDetailPK.setCheque_no(item.getCheque_no());
	transIstmUploadInstrumentDetailPK.setIssuercode(item.getIssuercode());
	transIstmUploadInstrumentDetail.setId(transIstmUploadInstrumentDetailPK);
	return transIstmUploadInstrumentDetail;
	}
	}