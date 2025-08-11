package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_GOODS database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_GOODS")
public class TransBctbUploadGoods implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadGoodsPK transBctbUploadGoodsPK;
	
	@Column(name = "GOODS_CODE")
    private String goodsCode;

    @Lob
    @Column(name = "GOODS_DESC")
    private String goodsDesc;

    @Column(name = "CONV_STATUS")
    private String convStatus;

    @Column(name = "ERR_MSG")
    private String errMsg;

    @Column(name = "INCO_TERM")
    private String incoTerm;

	public TransBctbUploadGoodsPK getTransBctbUploadGoodsPK() {
		return transBctbUploadGoodsPK;
	}

	public void setTransBctbUploadGoodsPK(TransBctbUploadGoodsPK transBctbUploadGoodsPK) {
		this.transBctbUploadGoodsPK = transBctbUploadGoodsPK;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
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

	public String getIncoTerm() {
		return incoTerm;
	}

	public void setIncoTerm(String incoTerm) {
		this.incoTerm = incoTerm;
	}
    
    

}
