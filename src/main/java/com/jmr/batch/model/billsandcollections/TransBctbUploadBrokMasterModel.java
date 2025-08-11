package com.jmr.batch.model.billsandcollections;

public class TransBctbUploadBrokMasterModel {
	
	private String branch_code;
    private String source_code;
    private String source_ref;
    private String source_seq_no;
    private String contract_ccy;
    private String contract_amt;
    private String brokerage_percent;
    private String brokerage_amt;
    
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public String getSource_code() {
		return source_code;
	}
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	public String getSource_ref() {
		return source_ref;
	}
	public void setSource_ref(String source_ref) {
		this.source_ref = source_ref;
	}
	public String getSource_seq_no() {
		return source_seq_no;
	}
	public void setSource_seq_no(String source_seq_no) {
		this.source_seq_no = source_seq_no;
	}
	public String getContract_ccy() {
		return contract_ccy;
	}
	public void setContract_ccy(String contract_ccy) {
		this.contract_ccy = contract_ccy;
	}
	public String getContract_amt() {
		return contract_amt;
	}
	public void setContract_amt(String contract_amt) {
		this.contract_amt = contract_amt;
	}
	public String getBrokerage_percent() {
		return brokerage_percent;
	}
	public void setBrokerage_percent(String brokerage_percent) {
		this.brokerage_percent = brokerage_percent;
	}
	public String getBrokerage_amt() {
		return brokerage_amt;
	}
	public void setBrokerage_amt(String brokerage_amt) {
		this.brokerage_amt = brokerage_amt;
	}
    
}
