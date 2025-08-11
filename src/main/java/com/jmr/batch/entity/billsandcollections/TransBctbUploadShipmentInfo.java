package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_SHIPMENT_INFO database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_SHIPMENT_INFO")
public class TransBctbUploadShipmentInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadShipmentInfoPK transBctbUploadShipmentInfoPK;
	
	@Column(name = "shipment_marks")
    private String shipmentMarks;

    @Column(name = "despatched_from")
    private String despatchedFrom;

    @Column(name = "despatched_to")
    private String despatchedTo;

    @Column(name = "carrier_name")
    private String carrierName;

    @Column(name = "partial_shipment_flag")
    private String partialShipmentFlag;

    @Lob
    @Column(name = "shipment_details")
    private String shipmentDetails;

    @Column(name = "latest_shipment_date")
    private Date latestShipmentDate;

    @Column(name = "trans_shipment_flag")
    private String transShipmentFlag;

    @Column(name = "shipment_date")
    private Date shipmentDate;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "other_shipment_info")
    private String otherShipmentInfo;

    @Column(name = "conv_status")
    private String convStatus ;

    @Column(name = "err_msg")
    private String errMsg;

	public TransBctbUploadShipmentInfoPK getTransBctbUploadShipmentInfoPK() {
		return transBctbUploadShipmentInfoPK;
	}

	public void setTransBctbUploadShipmentInfoPK(TransBctbUploadShipmentInfoPK transBctbUploadShipmentInfoPK) {
		this.transBctbUploadShipmentInfoPK = transBctbUploadShipmentInfoPK;
	}

	public String getShipmentMarks() {
		return shipmentMarks;
	}

	public void setShipmentMarks(String shipmentMarks) {
		this.shipmentMarks = shipmentMarks;
	}

	public String getDespatchedFrom() {
		return despatchedFrom;
	}

	public void setDespatchedFrom(String despatchedFrom) {
		this.despatchedFrom = despatchedFrom;
	}

	public String getDespatchedTo() {
		return despatchedTo;
	}

	public void setDespatchedTo(String despatchedTo) {
		this.despatchedTo = despatchedTo;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getPartialShipmentFlag() {
		return partialShipmentFlag;
	}

	public void setPartialShipmentFlag(String partialShipmentFlag) {
		this.partialShipmentFlag = partialShipmentFlag;
	}

	public String getShipmentDetails() {
		return shipmentDetails;
	}

	public void setShipmentDetails(String shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
	}

	public Date getLatestShipmentDate() {
		return latestShipmentDate;
	}

	public void setLatestShipmentDate(Date latestShipmentDate) {
		this.latestShipmentDate = latestShipmentDate;
	}

	public String getTransShipmentFlag() {
		return transShipmentFlag;
	}

	public void setTransShipmentFlag(String transShipmentFlag) {
		this.transShipmentFlag = transShipmentFlag;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getOtherShipmentInfo() {
		return otherShipmentInfo;
	}

	public void setOtherShipmentInfo(String otherShipmentInfo) {
		this.otherShipmentInfo = otherShipmentInfo;
	}

	public String getConvStatus() {
		return convStatus;
	}

	public void setConvStatus(String convStatus) {
		this.convStatus = convStatus;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
    
    

}
