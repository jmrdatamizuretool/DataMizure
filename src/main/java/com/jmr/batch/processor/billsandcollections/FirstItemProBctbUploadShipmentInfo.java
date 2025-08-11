package com.jmr.batch.processor.billsandcollections;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadShipmentInfo;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadShipmentInfoPK;
import com.jmr.batch.model.billsandcollections.TransBctbUploadShipmentInfoModel;
import com.jmr.framework.util.JMRDateUtil;
import com.jmr.framework.util.JMRUtil;

@Component
public class FirstItemProBctbUploadShipmentInfo
        implements ItemProcessor<TransBctbUploadShipmentInfoModel, TransBctbUploadShipmentInfo> {


    @Override
    public TransBctbUploadShipmentInfo process(TransBctbUploadShipmentInfoModel item) throws Exception {

        TransBctbUploadShipmentInfo entity = new TransBctbUploadShipmentInfo();

        // Build primary key
        TransBctbUploadShipmentInfoPK pk = new TransBctbUploadShipmentInfoPK();
        pk.setBranchCode(item.getBranch_code());
        pk.setSourceCode(item.getSource_code());
        pk.setSourceRef(item.getSource_ref());

        if (!JMRUtil.isNullOrEmpty(item.getSource_seq_no())) {
            pk.setSourceSeqNo(Long.valueOf(item.getSource_seq_no()));
        }

        entity.setTransBctbUploadShipmentInfoPK(pk);

        // Map other fields
        entity.setShipmentMarks(item.getShipment_marks());
        entity.setDespatchedFrom(item.getDespatched_from());
        entity.setDespatchedTo(item.getDespatched_to());
        entity.setCarrierName(item.getCarrier_name());
        entity.setPartialShipmentFlag(item.getPartial_shipment_flag());
        entity.setShipmentDetails(item.getShipment_details());

        if (!JMRUtil.isNullOrEmpty(item.getLatest_shipment_date())) {
            entity.setLatestShipmentDate(JMRDateUtil.getDateFromString(item.getLatest_shipment_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setTransShipmentFlag(item.getTrans_shipment_flag());

        if (!JMRUtil.isNullOrEmpty(item.getShipment_date())) {
            entity.setShipmentDate(JMRDateUtil.getDateFromString(item.getShipment_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        if (!JMRUtil.isNullOrEmpty(item.getArrival_date())) {
            entity.setArrivalDate(JMRDateUtil.getDateFromString(item.getArrival_date(),JMRDateUtil.DATE_FORMATMMddyyyy));
        }

        entity.setOtherShipmentInfo(item.getOther_shipment_info());
        
        entity.setConvStatus(item.getConv_status());

      

        entity.setErrMsg(item.getErr_msg());

        return entity;
    }
}
