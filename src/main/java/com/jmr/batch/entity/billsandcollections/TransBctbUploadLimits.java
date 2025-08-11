package com.jmr.batch.entity.billsandcollections;

import javax.persistence.*;

@Entity
@Table(name = "TRANS_BCTB_UPLOAD_LIMITS")
public class TransBctbUploadLimits {
	
	@EmbeddedId
    private TransBctbUploadLimitsPK id;

	@Column(name = "LINE")
	private String line;

	@Column(name = "CONV_STATUS")
	private String convStatus;

	@Column(name = "ERR_MSG")
	private String errMsg;

	@Column(name = "LIMIT_AMOUNT")
	private Double limitAmount;

	@Column(name = "EVENT_CODE")
	private String eventCode;

	@Column(name = "LINKAGE_PERCENTAGE")
	private Double linkagePercentage;

	@Column(name = "LINKAGE_SEQ_NO")
	private Double linkageSeqNo;

	@Column(name = "LINKED_CCY")
	private String linkedCcy;

	@Column(name = "JV_PARENT")
	private String jvParent;

	@Column(name = "LIABLITY_NO")
	private String liablityNo;

	@Column(name = "AMOUNT_TAG")
	private String amountTag;

	public TransBctbUploadLimitsPK getId() {
		return id;
	}

	public void setId(TransBctbUploadLimitsPK id) {
		this.id = id;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
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

	public Double getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(Double limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Double getLinkagePercentage() {
		return linkagePercentage;
	}

	public void setLinkagePercentage(Double linkagePercentage) {
		this.linkagePercentage = linkagePercentage;
	}

	public Double getLinkageSeqNo() {
		return linkageSeqNo;
	}

	public void setLinkageSeqNo(Double linkageSeqNo) {
		this.linkageSeqNo = linkageSeqNo;
	}

	public String getLinkedCcy() {
		return linkedCcy;
	}

	public void setLinkedCcy(String linkedCcy) {
		this.linkedCcy = linkedCcy;
	}

	public String getJvParent() {
		return jvParent;
	}

	public void setJvParent(String jvParent) {
		this.jvParent = jvParent;
	}

	public String getLiablityNo() {
		return liablityNo;
	}

	public void setLiablityNo(String liablityNo) {
		this.liablityNo = liablityNo;
	}

	public String getAmountTag() {
		return amountTag;
	}

	public void setAmountTag(String amountTag) {
		this.amountTag = amountTag;
	}
    

}
