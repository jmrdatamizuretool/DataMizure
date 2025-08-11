package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_ICTM_ACC_PR_UPLOAD")
public class TransIctmAccPrUpload {
	private String prod;
	private String brn;
	private String branch_code;
	private String source_code;
	private String acc;
	@Id
	private String maintenance_seq_no;
	private String process_status;
	private String waive;
	private String gen_uca;
	private String record_stat;
	private String once_auth;
	private String ude_ccy;
	private String cont_var_roll;
	private Double free_txn;
	private Double min_amt;
	private Double max_amt;
	private Double source_seq_no;

	@Column(name = "prod")
	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	@Column(name = "brn")
	public String getBrn() {
		return brn;
	}

	public void setBrn(String brn) {
		this.brn = brn;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "acc")
	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "process_status")
	public String getProcess_status() {
		return process_status;
	}

	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}

	@Column(name = "waive")
	public String getWaive() {
		return waive;
	}

	public void setWaive(String waive) {
		this.waive = waive;
	}

	@Column(name = "gen_uca")
	public String getGen_uca() {
		return gen_uca;
	}

	public void setGen_uca(String gen_uca) {
		this.gen_uca = gen_uca;
	}

	@Column(name = "record_stat")
	public String getRecord_stat() {
		return record_stat;
	}

	public void setRecord_stat(String record_stat) {
		this.record_stat = record_stat;
	}

	@Column(name = "once_auth")
	public String getOnce_auth() {
		return once_auth;
	}

	public void setOnce_auth(String once_auth) {
		this.once_auth = once_auth;
	}

	@Column(name = "ude_ccy")
	public String getUde_ccy() {
		return ude_ccy;
	}

	public void setUde_ccy(String ude_ccy) {
		this.ude_ccy = ude_ccy;
	}

	@Column(name = "cont_var_roll")
	public String getCont_var_roll() {
		return cont_var_roll;
	}

	public void setCont_var_roll(String cont_var_roll) {
		this.cont_var_roll = cont_var_roll;
	}

	@Column(name = "free_txn")
	public Double getFree_txn() {
		return free_txn;
	}

	public void setFree_txn(Double free_txn) {
		this.free_txn = free_txn;
	}

	@Column(name = "min_amt")
	public Double getMin_amt() {
		return min_amt;
	}

	public void setMin_amt(Double min_amt) {
		this.min_amt = min_amt;
	}

	@Column(name = "max_amt")
	public Double getMax_amt() {
		return max_amt;
	}

	public void setMax_amt(Double max_amt) {
		this.max_amt = max_amt;
	}

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
