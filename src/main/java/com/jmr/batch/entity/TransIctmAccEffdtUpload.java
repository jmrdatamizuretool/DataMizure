package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_ICTM_ACC_EFFDT_UPLOAD")
public class TransIctmAccEffdtUpload {
	private String maintenance_seq_no;
	private String source_code;
	private String brn;
	@Id
	private String acc;
	private String prod;
	private Date ude_eff_dt;
	private String record_stat;
	private String once_auth;
	private Double source_seq_no;
	private String branch_code;
	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "brn")
	public String getBrn() {
		return brn;
	}

	public void setBrn(String brn) {
		this.brn = brn;
	}

	@Column(name = "acc")
	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	@Column(name = "prod")
	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	@Column(name = "ude_eff_dt")
	public Date getUde_eff_dt() {
		return ude_eff_dt;
	}

	public void setUde_eff_dt(Date ude_eff_dt) {
		this.ude_eff_dt = ude_eff_dt;
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

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

}
