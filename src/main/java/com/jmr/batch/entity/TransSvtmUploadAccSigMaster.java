package com.jmr.batch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_SVTM_UPLOAD_ACC_SIG_MASTER")
public class TransSvtmUploadAccSigMaster {
	private String maintenance_seq_no;
	private String source_code;
	private String branch;
	@Id
	private String acc_no;
	private String acc_msg;
	private Double min_no_of_sig;
	private Double source_seq_no;

	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}

	public String getAcc_msg() {
		return acc_msg;
	}

	public void setAcc_msg(String acc_msg) {
		this.acc_msg = acc_msg;
	}

	public Double getMin_no_of_sig() {
		return min_no_of_sig;
	}

	public void setMin_no_of_sig(Double min_no_of_sig) {
		this.min_no_of_sig = min_no_of_sig;
	}

	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
