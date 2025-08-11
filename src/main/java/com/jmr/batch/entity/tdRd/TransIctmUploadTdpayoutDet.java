package com.jmr.batch.entity.tdRd;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TRANS_ICTM_UPLOAD_TDPAYOUT_DET")
public class TransIctmUploadTdpayoutDet implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransIctmUploadTdpayoutDetPK id;
	
	//@Column(name = "BRN")
	//private String brn;

	//@Column(name = "ACC")
	//private String acc;

	@Column(name = "CCY")
	private String ccy;

	@Column(name = "PAYOUTTYPE")
	private String payouttype;

	@Column(name = "BANKCODE")
	private String bankcode;

	@Column(name = "OFFSET_BRN")
	private String offset_brn;

	@Column(name = "OFFSET_ACC")
	private String offset_acc;

	@Column(name = "OFFSET_CCY")
	private String offset_ccy;

	@Column(name = "PERCENTAGE")
	private String percentage;

	@Column(name = "REDMAMT")
	private String redmamt;

	@Column(name = "BENFNAME")
	private String benfname;

	@Column(name = "BENFADD1")
	private String benfadd1;

	@Column(name = "BENFADD2")
	private String benfadd2;

	@Column(name = "OTHERDETS")
	private String otherdets;

	@Column(name = "NARRATIVE")
	private String narrative;

	@Column(name = "XRATE")
	private String xrate;

	@Column(name = "REF_NO")
	private String ref_no;

	//@Column(name = "SEQNO")
	//private String seqno;

	//@Column(name = "MAINTENANCE_SEQ_NO")
	//private String maintenance_seq_no;

	//@Column(name = "SOURCE_CODE")
	//private String source_code;

	//@Column(name = "SOURCE_SEQ_NO")
	//private String source_seq_no;

	@Column(name = "PAYOUT_COMPONENT")
	private String payout_component;

	@Column(name = "INSTNO")
	private String instno;

	@Column(name = "WAIVE_ISSUE_CHG")
	private String waive_issue_chg;

	public TransIctmUploadTdpayoutDet() {
		
	}

	public TransIctmUploadTdpayoutDetPK getId() {
		return id;
	}

	public void setId(TransIctmUploadTdpayoutDetPK id) {
		this.id = id;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getPayouttype() {
		return payouttype;
	}

	public void setPayouttype(String payouttype) {
		this.payouttype = payouttype;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getOffset_brn() {
		return offset_brn;
	}

	public void setOffset_brn(String offset_brn) {
		this.offset_brn = offset_brn;
	}

	public String getOffset_acc() {
		return offset_acc;
	}

	public void setOffset_acc(String offset_acc) {
		this.offset_acc = offset_acc;
	}

	public String getOffset_ccy() {
		return offset_ccy;
	}

	public void setOffset_ccy(String offset_ccy) {
		this.offset_ccy = offset_ccy;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getRedmamt() {
		return redmamt;
	}

	public void setRedmamt(String redmamt) {
		this.redmamt = redmamt;
	}

	public String getBenfname() {
		return benfname;
	}

	public void setBenfname(String benfname) {
		this.benfname = benfname;
	}

	public String getBenfadd1() {
		return benfadd1;
	}

	public void setBenfadd1(String benfadd1) {
		this.benfadd1 = benfadd1;
	}

	public String getBenfadd2() {
		return benfadd2;
	}

	public void setBenfadd2(String benfadd2) {
		this.benfadd2 = benfadd2;
	}

	public String getOtherdets() {
		return otherdets;
	}

	public void setOtherdets(String otherdets) {
		this.otherdets = otherdets;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public String getXrate() {
		return xrate;
	}

	public void setXrate(String xrate) {
		this.xrate = xrate;
	}

	public String getRef_no() {
		return ref_no;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

	public String getPayout_component() {
		return payout_component;
	}

	public void setPayout_component(String payout_component) {
		this.payout_component = payout_component;
	}

	public String getInstno() {
		return instno;
	}

	public void setInstno(String instno) {
		this.instno = instno;
	}

	public String getWaive_issue_chg() {
		return waive_issue_chg;
	}

	public void setWaive_issue_chg(String waive_issue_chg) {
		this.waive_issue_chg = waive_issue_chg;
	}
	

}
