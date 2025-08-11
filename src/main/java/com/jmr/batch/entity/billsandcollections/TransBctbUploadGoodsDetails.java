package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the BCTB_UPLOAD_GOODS_DETAILS database table.
 * 
 */
@Entity
@Table(name = "TRANS_BCTB_UPLOAD_GOODS_DETAILS")
public class TransBctbUploadGoodsDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TransBctbUploadGoodsDetailsPK transBctbUploadGoodsDetailsPK;
	
	@Lob
    @Column(name = "GOODS_DESC")
    private String goodsDesc;

    @Column(name = "NO_OF_UNITS")
    private Long noOfUnits;

    @Column(name = "PRICE_PER_UNIT")
    private Double pricePerUnit;

    @Column(name = "CCY")
    private String ccy;

	public TransBctbUploadGoodsDetailsPK getTransBctbUploadGoodsDetailsPK() {
		return transBctbUploadGoodsDetailsPK;
	}

	public void setTransBctbUploadGoodsDetailsPK(TransBctbUploadGoodsDetailsPK transBctbUploadGoodsDetailsPK) {
		this.transBctbUploadGoodsDetailsPK = transBctbUploadGoodsDetailsPK;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Long getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(Long noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
    

}
