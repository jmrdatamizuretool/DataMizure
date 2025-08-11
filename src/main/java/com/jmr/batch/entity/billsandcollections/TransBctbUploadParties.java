package com.jmr.batch.entity.billsandcollections;

import javax.persistence.*;

@Entity
@Table(name = "TRANS_BCTB_UPLOAD_PARTIES")
public class TransBctbUploadParties {

    @EmbeddedId
    private TransBctbUploadPartiesPK id;

    @Column(name = "PARTY_LANGUAGE")
    private String partyLanguage;

    @Column(name = "PARTY_COUNTRY_CODE")
    private String partyCountryCode;

    @Column(name = "PARTY_REFNO")
    private String partyRefno;

    @Column(name = "PARTY_NAME")
    private String partyName;

    @Column(name = "PARTY_ADDR1")
    private String partyAddr1;

    @Column(name = "PARTY_ADDR2")
    private String partyAddr2;

    @Column(name = "PARTY_ADDR3")
    private String partyAddr3;

    @Column(name = "PARTY_ADDR4")
    private String partyAddr4;

    @Column(name = "WALKIN_CUSTOMER_FLAG")
    private String walkinCustomerFlag;

    @Column(name = "PARTY_ID")
    private String partyId;

    @Column(name = "CONV_STATUS")
    private String convStatus;

    @Column(name = "ERR_MSG")
    private String errMsg;
    
    // Getters and Setters

	public TransBctbUploadPartiesPK getId() {
		return id;
	}

	public void setId(TransBctbUploadPartiesPK id) {
		this.id = id;
	}

	public String getPartyLanguage() {
		return partyLanguage;
	}

	public void setPartyLanguage(String partyLanguage) {
		this.partyLanguage = partyLanguage;
	}

	public String getPartyCountryCode() {
		return partyCountryCode;
	}

	public void setPartyCountryCode(String partyCountryCode) {
		this.partyCountryCode = partyCountryCode;
	}

	public String getPartyRefno() {
		return partyRefno;
	}

	public void setPartyRefno(String partyRefno) {
		this.partyRefno = partyRefno;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyAddr1() {
		return partyAddr1;
	}

	public void setPartyAddr1(String partyAddr1) {
		this.partyAddr1 = partyAddr1;
	}

	public String getPartyAddr2() {
		return partyAddr2;
	}

	public void setPartyAddr2(String partyAddr2) {
		this.partyAddr2 = partyAddr2;
	}

	public String getPartyAddr3() {
		return partyAddr3;
	}

	public void setPartyAddr3(String partyAddr3) {
		this.partyAddr3 = partyAddr3;
	}

	public String getPartyAddr4() {
		return partyAddr4;
	}

	public void setPartyAddr4(String partyAddr4) {
		this.partyAddr4 = partyAddr4;
	}

	public String getWalkinCustomerFlag() {
		return walkinCustomerFlag;
	}

	public void setWalkinCustomerFlag(String walkinCustomerFlag) {
		this.walkinCustomerFlag = walkinCustomerFlag;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
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
