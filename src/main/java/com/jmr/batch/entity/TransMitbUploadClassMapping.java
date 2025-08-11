package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_MITB_UPLOAD_CLASS_MAPPING")

public class TransMitbUploadClassMapping {
	private String source_code;
	@Id
	private String customer;
	private String mis_head;
	private String pool_code;
	private String fund_mis_1;
	private String fund_mis_2;
	private String fund_mis_3;
	private String fund_mis_4;
	private String fund_mis_5;
	private String fund_mis_6;
	private String fund_mis_7;
	private String fund_mis_8;
	private String fund_mis_9;
	private String fund_mis_10;
	private String comp_mis_1;
	private String comp_mis_2;
	private String comp_mis_3;
	private String comp_mis_4;
	private String comp_mis_5;
	private String comp_mis_6;
	private String comp_mis_7;
	private String comp_mis_8;
	private String comp_mis_9;
	private String comp_mis_10;
	private String txn_mis_1;
	private String txn_mis_2;
	private String txn_mis_3;
	private String txn_mis_4;
	private String txn_mis_5;
	private String txn_mis_6;
	private String txn_mis_7;
	private String txn_mis_8;
	private String txn_mis_9;
	private String txn_mis_10;
	private String cost_code1;
	private String cost_code2;
	private String cost_code3;
	private String cost_code4;
	private String cost_code5;
	private String serial_no;
	private String ccy;
	private String branch_code;
	private String related_account;
	private String related_ref;
	private String source_ref;
	private String external_ref_no;
	private String mis_group;
	private String mis_group_txn;
	private String mis_group_comp;
	private String ref_rate_code;
	private String unit_type;
	private String calc_method;
	private String ref_rate_type;
	private String rate_flag;
	private String processed_flag;
	private Double ref_rate;
	private Double ref_spread;
	private Double ext_seq_no;
	private Double source_seq_no;

	@Column(name = "source_code ")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "customer ")
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Column(name = "mis_head ")
	public String getMis_head() {
		return mis_head;
	}

	public void setMis_head(String mis_head) {
		this.mis_head = mis_head;
	}

	@Column(name = "pool_code ")
	public String getPool_code() {
		return pool_code;
	}

	public void setPool_code(String pool_code) {
		this.pool_code = pool_code;
	}

	@Column(name = "fund_mis_1 ")
	public String getFund_mis_1() {
		return fund_mis_1;
	}

	public void setFund_mis_1(String fund_mis_1) {
		this.fund_mis_1 = fund_mis_1;
	}

	@Column(name = "fund_mis_2 ")
	public String getFund_mis_2() {
		return fund_mis_2;
	}

	public void setFund_mis_2(String fund_mis_2) {
		this.fund_mis_2 = fund_mis_2;
	}

	@Column(name = "fund_mis_3 ")
	public String getFund_mis_3() {
		return fund_mis_3;
	}

	public void setFund_mis_3(String fund_mis_3) {
		this.fund_mis_3 = fund_mis_3;
	}

	@Column(name = "fund_mis_4 ")
	public String getFund_mis_4() {
		return fund_mis_4;
	}

	public void setFund_mis_4(String fund_mis_4) {
		this.fund_mis_4 = fund_mis_4;
	}

	@Column(name = "fund_mis_5 ")
	public String getFund_mis_5() {
		return fund_mis_5;
	}

	public void setFund_mis_5(String fund_mis_5) {
		this.fund_mis_5 = fund_mis_5;
	}

	@Column(name = "fund_mis_6 ")
	public String getFund_mis_6() {
		return fund_mis_6;
	}

	public void setFund_mis_6(String fund_mis_6) {
		this.fund_mis_6 = fund_mis_6;
	}

	@Column(name = "fund_mis_7 ")
	public String getFund_mis_7() {
		return fund_mis_7;
	}

	public void setFund_mis_7(String fund_mis_7) {
		this.fund_mis_7 = fund_mis_7;
	}

	@Column(name = "fund_mis_8 ")
	public String getFund_mis_8() {
		return fund_mis_8;
	}

	public void setFund_mis_8(String fund_mis_8) {
		this.fund_mis_8 = fund_mis_8;
	}

	@Column(name = "fund_mis_9 ")
	public String getFund_mis_9() {
		return fund_mis_9;
	}

	public void setFund_mis_9(String fund_mis_9) {
		this.fund_mis_9 = fund_mis_9;
	}

	@Column(name = "fund_mis_10 ")
	public String getFund_mis_10() {
		return fund_mis_10;
	}

	public void setFund_mis_10(String fund_mis_10) {
		this.fund_mis_10 = fund_mis_10;
	}

	@Column(name = "comp_mis_1 ")
	public String getComp_mis_1() {
		return comp_mis_1;
	}

	public void setComp_mis_1(String comp_mis_1) {
		this.comp_mis_1 = comp_mis_1;
	}

	@Column(name = "comp_mis_2 ")
	public String getComp_mis_2() {
		return comp_mis_2;
	}

	public void setComp_mis_2(String comp_mis_2) {
		this.comp_mis_2 = comp_mis_2;
	}

	@Column(name = "comp_mis_3 ")
	public String getComp_mis_3() {
		return comp_mis_3;
	}

	public void setComp_mis_3(String comp_mis_3) {
		this.comp_mis_3 = comp_mis_3;
	}

	@Column(name = "comp_mis_4 ")
	public String getComp_mis_4() {
		return comp_mis_4;
	}

	public void setComp_mis_4(String comp_mis_4) {
		this.comp_mis_4 = comp_mis_4;
	}

	@Column(name = "comp_mis_5 ")
	public String getComp_mis_5() {
		return comp_mis_5;
	}

	public void setComp_mis_5(String comp_mis_5) {
		this.comp_mis_5 = comp_mis_5;
	}

	@Column(name = "comp_mis_6 ")
	public String getComp_mis_6() {
		return comp_mis_6;
	}

	public void setComp_mis_6(String comp_mis_6) {
		this.comp_mis_6 = comp_mis_6;
	}

	@Column(name = "comp_mis_7 ")
	public String getComp_mis_7() {
		return comp_mis_7;
	}

	public void setComp_mis_7(String comp_mis_7) {
		this.comp_mis_7 = comp_mis_7;
	}

	@Column(name = "comp_mis_8 ")
	public String getComp_mis_8() {
		return comp_mis_8;
	}

	public void setComp_mis_8(String comp_mis_8) {
		this.comp_mis_8 = comp_mis_8;
	}

	@Column(name = "comp_mis_9 ")
	public String getComp_mis_9() {
		return comp_mis_9;
	}

	public void setComp_mis_9(String comp_mis_9) {
		this.comp_mis_9 = comp_mis_9;
	}

	@Column(name = "comp_mis_10 ")
	public String getComp_mis_10() {
		return comp_mis_10;
	}

	public void setComp_mis_10(String comp_mis_10) {
		this.comp_mis_10 = comp_mis_10;
	}

	@Column(name = "txn_mis_1 ")
	public String getTxn_mis_1() {
		return txn_mis_1;
	}

	public void setTxn_mis_1(String txn_mis_1) {
		this.txn_mis_1 = txn_mis_1;
	}

	@Column(name = "txn_mis_2 ")
	public String getTxn_mis_2() {
		return txn_mis_2;
	}

	public void setTxn_mis_2(String txn_mis_2) {
		this.txn_mis_2 = txn_mis_2;
	}

	@Column(name = "txn_mis_3 ")
	public String getTxn_mis_3() {
		return txn_mis_3;
	}

	public void setTxn_mis_3(String txn_mis_3) {
		this.txn_mis_3 = txn_mis_3;
	}

	@Column(name = "txn_mis_4 ")
	public String getTxn_mis_4() {
		return txn_mis_4;
	}

	public void setTxn_mis_4(String txn_mis_4) {
		this.txn_mis_4 = txn_mis_4;
	}

	@Column(name = "txn_mis_5 ")
	public String getTxn_mis_5() {
		return txn_mis_5;
	}

	public void setTxn_mis_5(String txn_mis_5) {
		this.txn_mis_5 = txn_mis_5;
	}

	@Column(name = "txn_mis_6 ")
	public String getTxn_mis_6() {
		return txn_mis_6;
	}

	public void setTxn_mis_6(String txn_mis_6) {
		this.txn_mis_6 = txn_mis_6;
	}

	@Column(name = "txn_mis_7 ")
	public String getTxn_mis_7() {
		return txn_mis_7;
	}

	public void setTxn_mis_7(String txn_mis_7) {
		this.txn_mis_7 = txn_mis_7;
	}

	@Column(name = "txn_mis_8 ")
	public String getTxn_mis_8() {
		return txn_mis_8;
	}

	public void setTxn_mis_8(String txn_mis_8) {
		this.txn_mis_8 = txn_mis_8;
	}

	@Column(name = "txn_mis_9 ")
	public String getTxn_mis_9() {
		return txn_mis_9;
	}

	public void setTxn_mis_9(String txn_mis_9) {
		this.txn_mis_9 = txn_mis_9;
	}

	@Column(name = "txn_mis_10 ")
	public String getTxn_mis_10() {
		return txn_mis_10;
	}

	public void setTxn_mis_10(String txn_mis_10) {
		this.txn_mis_10 = txn_mis_10;
	}

	@Column(name = "cost_code1 ")
	public String getCost_code1() {
		return cost_code1;
	}

	public void setCost_code1(String cost_code1) {
		this.cost_code1 = cost_code1;
	}

	@Column(name = "cost_code2 ")
	public String getCost_code2() {
		return cost_code2;
	}

	public void setCost_code2(String cost_code2) {
		this.cost_code2 = cost_code2;
	}

	@Column(name = "cost_code3 ")
	public String getCost_code3() {
		return cost_code3;
	}

	public void setCost_code3(String cost_code3) {
		this.cost_code3 = cost_code3;
	}

	@Column(name = "cost_code4 ")
	public String getCost_code4() {
		return cost_code4;
	}

	public void setCost_code4(String cost_code4) {
		this.cost_code4 = cost_code4;
	}

	@Column(name = "cost_code5 ")
	public String getCost_code5() {
		return cost_code5;
	}

	public void setCost_code5(String cost_code5) {
		this.cost_code5 = cost_code5;
	}

	@Column(name = "serial_no ")
	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	@Column(name = "ccy ")
	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	@Column(name = "branch_code ")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "related_account ")
	public String getRelated_account() {
		return related_account;
	}

	public void setRelated_account(String related_account) {
		this.related_account = related_account;
	}

	@Column(name = "related_ref ")
	public String getRelated_ref() {
		return related_ref;
	}

	public void setRelated_ref(String related_ref) {
		this.related_ref = related_ref;
	}

	@Column(name = "source_ref ")
	public String getSource_ref() {
		return source_ref;
	}

	public void setSource_ref(String source_ref) {
		this.source_ref = source_ref;
	}

	@Column(name = "external_ref_no ")
	public String getExternal_ref_no() {
		return external_ref_no;
	}

	public void setExternal_ref_no(String external_ref_no) {
		this.external_ref_no = external_ref_no;
	}

	@Column(name = "mis_group ")
	public String getMis_group() {
		return mis_group;
	}

	public void setMis_group(String mis_group) {
		this.mis_group = mis_group;
	}

	@Column(name = "mis_group_txn ")
	public String getMis_group_txn() {
		return mis_group_txn;
	}

	public void setMis_group_txn(String mis_group_txn) {
		this.mis_group_txn = mis_group_txn;
	}

	@Column(name = "mis_group_comp ")
	public String getMis_group_comp() {
		return mis_group_comp;
	}

	public void setMis_group_comp(String mis_group_comp) {
		this.mis_group_comp = mis_group_comp;
	}

	@Column(name = "ref_rate_code ")
	public String getRef_rate_code() {
		return ref_rate_code;
	}

	public void setRef_rate_code(String ref_rate_code) {
		this.ref_rate_code = ref_rate_code;
	}

	@Column(name = "unit_type ")
	public String getUnit_type() {
		return unit_type;
	}

	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}

	@Column(name = "calc_method ")
	public String getCalc_method() {
		return calc_method;
	}

	public void setCalc_method(String calc_method) {
		this.calc_method = calc_method;
	}

	@Column(name = "ref_rate_type ")
	public String getRef_rate_type() {
		return ref_rate_type;
	}

	public void setRef_rate_type(String ref_rate_type) {
		this.ref_rate_type = ref_rate_type;
	}

	@Column(name = "rate_flag ")
	public String getRate_flag() {
		return rate_flag;
	}

	public void setRate_flag(String rate_flag) {
		this.rate_flag = rate_flag;
	}

	@Column(name = "processed_flag ")
	public String getProcessed_flag() {
		return processed_flag;
	}

	public void setProcessed_flag(String processed_flag) {
		this.processed_flag = processed_flag;
	}

	@Column(name = "ref_rate ")
	public Double getRef_rate() {
		return ref_rate;
	}

	public void setRef_rate(Double ref_rate) {
		this.ref_rate = ref_rate;
	}

	@Column(name = "ref_spread ")
	public Double getRef_spread() {
		return ref_spread;
	}

	public void setRef_spread(Double ref_spread) {
		this.ref_spread = ref_spread;
	}

	@Column(name = "ext_seq_no ")
	public Double getExt_seq_no() {
		return ext_seq_no;
	}

	public void setExt_seq_no(Double ext_seq_no) {
		this.ext_seq_no = ext_seq_no;
	}

	@Column(name = "source_seq_no ")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
