package com.jmr.batch.processor.tdRd;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayoutDet;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayoutDetPK;
import com.jmr.batch.model.tdRd.TransIctmUploadTdpayoutDetModel;
import com.jmr.framework.util.JMRUtil;


@Component
public class FirstItemProIctmUploadTdpayoutDet
        implements ItemProcessor<TransIctmUploadTdpayoutDetModel, TransIctmUploadTdpayoutDet> {
    
    // ✅ Remove these class-level fields
    // TransIctmUploadTdpayoutDet transIctmUploadTdpayoutDet = new TransIctmUploadTdpayoutDet();
    // TransIctmUploadTdpayoutDetPK transIctmUploadTdpayoutDetPK = new TransIctmUploadTdpayoutDetPK();
    
    @Override
    public TransIctmUploadTdpayoutDet process(TransIctmUploadTdpayoutDetModel item) {
        
        // ✅ Create NEW instances for each record
        TransIctmUploadTdpayoutDet transIctmUploadTdpayoutDet = new TransIctmUploadTdpayoutDet();
        TransIctmUploadTdpayoutDetPK transIctmUploadTdpayoutDetPK = new TransIctmUploadTdpayoutDetPK();
        
        // Set composite key fields FIRST
        transIctmUploadTdpayoutDetPK.setBrn(item.getBrn());
        transIctmUploadTdpayoutDetPK.setAcc(item.getAcc());
        if (!JMRUtil.isNullOrEmpty(item.getSeqno())) {
            transIctmUploadTdpayoutDetPK.setSeqno(Long.valueOf(item.getSeqno()));
        }
        transIctmUploadTdpayoutDetPK.setMaintenance_seq_no(item.getMaintenance_seq_no());
        transIctmUploadTdpayoutDetPK.setSource_code(item.getSource_code());
        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            transIctmUploadTdpayoutDetPK.setSource_seq_no(Long.valueOf(item.getSource_seq_no()));
        }
        
        // Set the composite key to entity
        transIctmUploadTdpayoutDet.setId(transIctmUploadTdpayoutDetPK);
        
        // Set other fields
        transIctmUploadTdpayoutDet.setCcy(item.getCcy());
        transIctmUploadTdpayoutDet.setPayouttype(item.getPayouttype());
        transIctmUploadTdpayoutDet.setBankcode(item.getBankcode());
        transIctmUploadTdpayoutDet.setOffset_brn(item.getOffset_brn());
        transIctmUploadTdpayoutDet.setOffset_acc(item.getOffset_acc());
        transIctmUploadTdpayoutDet.setOffset_ccy(item.getOffset_ccy());
        transIctmUploadTdpayoutDet.setPercentage(item.getPercentage());
        transIctmUploadTdpayoutDet.setRedmamt(item.getRedmamt());
        transIctmUploadTdpayoutDet.setBenfname(item.getBenfname());
        transIctmUploadTdpayoutDet.setBenfadd1(item.getBenfadd1());
        transIctmUploadTdpayoutDet.setBenfadd2(item.getBenfadd2());
        transIctmUploadTdpayoutDet.setOtherdets(item.getOtherdets());
        transIctmUploadTdpayoutDet.setNarrative(item.getNarrative());
        transIctmUploadTdpayoutDet.setXrate(item.getXrate());
        transIctmUploadTdpayoutDet.setRef_no(item.getRef_no());
        transIctmUploadTdpayoutDet.setPayout_component(item.getPayout_component());
        transIctmUploadTdpayoutDet.setInstno(item.getInstno());
        transIctmUploadTdpayoutDet.setWaive_issue_chg(item.getWaive_issue_chg());
        
        return transIctmUploadTdpayoutDet;
    }
}

//@Component
//public class FirstItemProIctmUploadTdpayoutDet
//		implements ItemProcessor<TransIctmUploadTdpayoutDetModel, TransIctmUploadTdpayoutDet> {
//
//	
//	TransIctmUploadTdpayoutDet transIctmUploadTdpayoutDet =new TransIctmUploadTdpayoutDet();
//	
//	TransIctmUploadTdpayoutDetPK transIctmUploadTdpayoutDetPK =new TransIctmUploadTdpayoutDetPK();
//
//	@Override
//	public TransIctmUploadTdpayoutDet process(TransIctmUploadTdpayoutDetModel item) {
//		transIctmUploadTdpayoutDet.setCcy(item.getCcy());
//		transIctmUploadTdpayoutDet.setPayouttype(item.getPayouttype());
//		transIctmUploadTdpayoutDet.setBankcode(item.getBankcode());
//		transIctmUploadTdpayoutDet.setOffset_brn(item.getOffset_brn());
//		transIctmUploadTdpayoutDet.setOffset_acc(item.getOffset_acc());
//		transIctmUploadTdpayoutDet.setOffset_ccy(item.getOffset_ccy());
//		transIctmUploadTdpayoutDet.setPercentage(item.getPercentage());
//		transIctmUploadTdpayoutDet.setRedmamt(item.getRedmamt());
//		transIctmUploadTdpayoutDet.setBenfname(item.getBenfname());
//		transIctmUploadTdpayoutDet.setBenfadd1(item.getBenfadd1());
//		transIctmUploadTdpayoutDet.setBenfadd2(item.getBenfadd2());
//		transIctmUploadTdpayoutDet.setOtherdets(item.getOtherdets());
//		transIctmUploadTdpayoutDet.setNarrative(item.getNarrative());
//		transIctmUploadTdpayoutDet.setXrate(item.getXrate());
//		transIctmUploadTdpayoutDet.setRef_no(item.getRef_no());
//		transIctmUploadTdpayoutDet.setPayout_component(item.getPayout_component());
//		transIctmUploadTdpayoutDet.setInstno(item.getInstno());
//		transIctmUploadTdpayoutDet.setWaive_issue_chg(item.getWaive_issue_chg());
//
//		transIctmUploadTdpayoutDet.setId(transIctmUploadTdpayoutDetPK);
//		transIctmUploadTdpayoutDetPK.setBrn(item.getBrn());
//		transIctmUploadTdpayoutDetPK.setAcc(item.getAcc());
//		if (!JMRUtil.isNullOrEmpty(item.getSeqno())) {
//			transIctmUploadTdpayoutDetPK.setSeqno(Long.valueOf(item.getSeqno()));
//		}
//		transIctmUploadTdpayoutDetPK.setMaintenance_seq_no(item.getMaintenance_seq_no());
//		transIctmUploadTdpayoutDetPK.setSource_code(item.getSource_code());
//		if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
//			transIctmUploadTdpayoutDetPK.setSource_seq_no(Long.valueOf(item.getSource_seq_no()));
//		}
//		
//		return transIctmUploadTdpayoutDet;
//
//	}
//
//}
