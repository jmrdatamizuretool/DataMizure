package com.jmr.batch.processor.instruments;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.instruments.TransIstmInstrTxn;
import com.jmr.batch.entity.instruments.TransIstmInstrTxnPK;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentMaster;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentMasterPK;
import com.jmr.batch.model.instruments.TransIstmInstrTxnModel;
import com.jmr.batch.model.instruments.TransIstmUploadInstrumentMasterModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIstmUploadInstrumentMaster implements ItemProcessor<TransIstmUploadInstrumentMasterModel, TransIstmUploadInstrumentMaster> {

	@Override

	public TransIstmUploadInstrumentMaster process(TransIstmUploadInstrumentMasterModel item) throws Exception {
	TransIstmUploadInstrumentMaster transIstmUploadInstrumentMaster = new TransIstmUploadInstrumentMaster();

	transIstmUploadInstrumentMaster.setAccountBranch(item.getAccount_branch());
	transIstmUploadInstrumentMaster.setCcy(item.getCcy());
	transIstmUploadInstrumentMaster.setErrmsg(item.getErrmsg());
	transIstmUploadInstrumentMaster.setAccount(item.getAccount());
transIstmUploadInstrumentMaster.setLpadReqd(item.getLpad_reqd());

	transIstmUploadInstrumentMaster.setUploadStatusFlag(item.getUpload_status_flag());
if(!JMRUtil.isNullOrEmpty(item.getNo_of_leaves())){transIstmUploadInstrumentMaster.setNoOfLeaves(Double.valueOf(item.getNo_of_leaves()));}
TransIstmUploadInstrumentMasterPK transIstmUploadInstrumentMasterPK = new TransIstmUploadInstrumentMasterPK();
transIstmUploadInstrumentMasterPK.setBranch(item.getBranch());
transIstmUploadInstrumentMasterPK.setChequeBookNo(item.getCheque_book_no());
transIstmUploadInstrumentMasterPK.setInstrumentType(item.getInstrument_type());
transIstmUploadInstrumentMasterPK.setSourceCode(item.getSource_code());
transIstmUploadInstrumentMasterPK.setXref(item.getXref());
transIstmUploadInstrumentMasterPK.setIssuer_code(item.getIssuer_code());

transIstmUploadInstrumentMaster.setId(transIstmUploadInstrumentMasterPK);
	return transIstmUploadInstrumentMaster;
	}
	}