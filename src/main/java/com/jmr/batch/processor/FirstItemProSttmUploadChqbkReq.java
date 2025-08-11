package com.jmr.batch.processor;



import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadChqbkReq;
import com.jmr.batch.model.TransSttmUploadChqbkReqModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;


@Component
public class FirstItemProSttmUploadChqbkReq implements ItemProcessor<TransSttmUploadChqbkReqModel, TransSttmUploadChqbkReq>
{	
	
	
	@Override
	
	public  TransSttmUploadChqbkReq process(TransSttmUploadChqbkReqModel item) throws Exception {

		TransSttmUploadChqbkReq transSttmUploadChqbkReq = new TransSttmUploadChqbkReq();
		transSttmUploadChqbkReq.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadChqbkReq.setSource_code(item.getSource_code());
		transSttmUploadChqbkReq.setChq_type(item.getChq_type());
		transSttmUploadChqbkReq.setRequest_status(item.getRequest_status());
		transSttmUploadChqbkReq.setBranch(item.getBranch());
		transSttmUploadChqbkReq.setAccount(item.getAccount());
		transSttmUploadChqbkReq.setFirst_check_no(item.getFirst_check_no());
		transSttmUploadChqbkReq.setOrder_details(item.getOrder_details());
		transSttmUploadChqbkReq.setCheque_book_type(item.getCheque_book_type());
		transSttmUploadChqbkReq.setLanguage_code(item.getLanguage_code());
		if(!JMRUtil.isNullOrEmpty(item.getCheck_leaves())){transSttmUploadChqbkReq.setCheck_leaves(Double.valueOf(item.getCheck_leaves()));}
		if(!JMRUtil.isNullOrEmpty(item.getSource_seq_no())){transSttmUploadChqbkReq.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));}
		
		if (!JMRUtil.isNullOrEmpty(item.getOrder_date())) {
			transSttmUploadChqbkReq.setOrder_date(
					JMRDateUtil.getDateFromString(item.getOrder_date(), JMRDateUtil.DATE_FORMATMMddyyyy));
			}
		 return  transSttmUploadChqbkReq;
			
	}
	}