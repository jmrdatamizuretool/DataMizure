package com.jmr.batch.processor;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.TransSttmUploadAccountChannel;
import com.jmr.batch.model.TransSttmUploadAccountChannelModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;
@Component
public class FirstItemProSttmUploadAccountChannel implements ItemProcessor <TransSttmUploadAccountChannelModel, TransSttmUploadAccountChannel>
{	
	
	
	@Override
	
	public TransSttmUploadAccountChannel process(TransSttmUploadAccountChannelModel item) throws Exception {

		TransSttmUploadAccountChannel transSttmUploadAccountChannel = new TransSttmUploadAccountChannel();
		transSttmUploadAccountChannel.setSource_code(item.getSource_code());
		transSttmUploadAccountChannel.setBranch_code(item.getBranch_code());
		transSttmUploadAccountChannel.setChannel_remarks(item.getChannel_remarks());
		transSttmUploadAccountChannel.setAccount_no(item.getAccount_no());
		transSttmUploadAccountChannel.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transSttmUploadAccountChannel.setChannel_name(item.getChannel_name());
		transSttmUploadAccountChannel.setChannel_id(item.getChannel_id());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transSttmUploadAccountChannel.setSource_seq_no(Double.valueOf(item.getSource_seq_no()));
		}

		return transSttmUploadAccountChannel;

	}
}