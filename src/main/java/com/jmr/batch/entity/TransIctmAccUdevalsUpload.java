package com.jmr.batch.entity;

import java.util.Date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_ICTM_ACC_UDEVALS_UPLOAD")
public class TransIctmAccUdevalsUpload {
	private String maintenance_seq_no;
	private String source_code;
	private String brn;
	@Id
	private String acc;
	private String prod;
	private Date ude_eff_dt;
	private String ude_id;
	private Double ude_value;
	private String rate_code;
	private String auth_stat;
	private String record_stat;
	private Double source_seq_no;
	private String branch_code;
	private Double base_rate;
	private Double base_spread;
	private String td_rate_code;
	private Double ude_variance;

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

	@Column(name = "ude_id")
	public String getUde_id() {
		return ude_id;
	}

	public void setUde_id(String ude_id) {
		this.ude_id = ude_id;
	}

	@Column(name = "ude_value")
	public Double getUde_value() {
		return ude_value;
	}

	public void setUde_value(Double ude_value) {
		this.ude_value = ude_value;
	}

	@Column(name = "rate_code")
	public String getRate_code() {
		return rate_code;
	}

	public void setRate_code(String rate_code) {
		this.rate_code = rate_code;
	}

	@Column(name = "auth_stat")
	public String getAuth_stat() {
		return auth_stat;
	}

	public void setAuth_stat(String auth_stat) {
		this.auth_stat = auth_stat;
	}

	@Column(name = "record_stat")
	public String getRecord_stat() {
		return record_stat;
	}

	public void setRecord_stat(String record_stat) {
		this.record_stat = record_stat;
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

	@Column(name = "base_rate")
	public Double getBase_rate() {
		return base_rate;
	}

	public void setBase_rate(Double base_rate) {
		this.base_rate = base_rate;
	}

	@Column(name = "base_spread")
	public Double getBase_spread() {
		return base_spread;
	}

	public void setBase_spread(Double base_spread) {
		this.base_spread = base_spread;
	}

	@Column(name = "td_rate_code")
	public String getTd_rate_code() {
		return td_rate_code;
	}

	public void setTd_rate_code(String td_rate_code) {
		this.td_rate_code = td_rate_code;
	}

	@Column(name = "ude_variance")
	public Double getUde_variance() {
		return ude_variance;
	}

	public void setUde_variance(Double ude_variance) {
		this.ude_variance = ude_variance;
	}

}
