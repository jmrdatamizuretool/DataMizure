package com.jmr.batch.processor.tdRd;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayinDet;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayinDetPK;
import com.jmr.batch.model.tdRd.TransIctmUploadTdpayinDetModel;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProIctmUploadTdpayinDet
		implements ItemProcessor<TransIctmUploadTdpayinDetModel, TransIctmUploadTdpayinDet> {

	
//	TransIctmUploadTdpayinDet transIctmUploadTdpayinDet= new TransIctmUploadTdpayinDet();
//
//	
//	TransIctmUploadTdpayinDetPK transIctmUploadTdpayinDetPK = new TransIctmUploadTdpayinDetPK();

	@Override
	public TransIctmUploadTdpayinDet process(TransIctmUploadTdpayinDetModel item) throws Exception {
		
		TransIctmUploadTdpayinDet transIctmUploadTdpayinDet= new TransIctmUploadTdpayinDet();
		TransIctmUploadTdpayinDetPK transIctmUploadTdpayinDetPK = new TransIctmUploadTdpayinDetPK();
		
		transIctmUploadTdpayinDet.setCcy(item.getCcy());
		transIctmUploadTdpayinDet.setMultimode_payopt(item.getMultimode_payopt());
		transIctmUploadTdpayinDet.setMultimode_tdamount(item.getMultimode_tdamount());
		transIctmUploadTdpayinDet.setMultimode_offset_brn(item.getMultimode_offset_brn());
		transIctmUploadTdpayinDet.setMultimode_tdoffset_acc(item.getMultimode_tdoffset_acc());
		transIctmUploadTdpayinDet.setMultimode_tdoffset_ccy(item.getMultimode_tdoffset_ccy());
		transIctmUploadTdpayinDet.setReference_no(item.getReference_no());
		transIctmUploadTdpayinDet.setMultimode_percentage(item.getMultimode_percentage());
		transIctmUploadTdpayinDet.setMulitmode_xrate(item.getMulitmode_xrate());
		transIctmUploadTdpayinDet.setChq_instumentno(item.getChq_instumentno());
		transIctmUploadTdpayinDet.setClg_bank_code(item.getClg_bank_code());
		transIctmUploadTdpayinDet.setClg_branch_code(item.getClg_branch_code());
		transIctmUploadTdpayinDet.setClg_product_code(item.getClg_product_code());
		transIctmUploadTdpayinDet.setChq_instrument_date(item.getChq_instrument_date());
		transIctmUploadTdpayinDet.setDrawee_ac_no(item.getDrawee_ac_no());
		transIctmUploadTdpayinDet.setRouting_no(item.getRouting_no());
		
		transIctmUploadTdpayinDet.setId(transIctmUploadTdpayinDetPK);
		transIctmUploadTdpayinDetPK.setBrn(item.getBrn());
		transIctmUploadTdpayinDetPK.setAcc(item.getAcc());

		if (!JMRUtil.isNullOrEmpty(item.getSeqno())) {
			transIctmUploadTdpayinDetPK.setSeqno(Long.valueOf(item.getSeqno()));
		}
		// transIctmUploadTdpayinDetPK.setSeqno(item.getSeqno());
		transIctmUploadTdpayinDetPK.setMaintenance_seq_no(item.getMaintenance_seq_no());
		transIctmUploadTdpayinDetPK.setSource_code(item.getSource_code());
		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
			transIctmUploadTdpayinDetPK.setSource_seq_no(Long.valueOf(item.getSource_seq_no()));
		}
		// transIctmUploadTdpayinDetPK.setSource_seq_no(item.getSource_seq_no());

		return transIctmUploadTdpayinDet;

	}

}
