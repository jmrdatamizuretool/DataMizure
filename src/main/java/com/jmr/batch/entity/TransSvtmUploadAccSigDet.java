package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_SVTM_UPLOAD_ACC_SIG_DET")
public class TransSvtmUploadAccSigDet {
	@Column(name = "maintenance_seq_no")
	private String maintenance_seq_no;
	@Column(name = "cif_sig_id")
	private String cif_sig_id;
	@Column(name = "cifid")
	private String cifid;
	@Column(name = "sig_msg")
	private String sig_msg;
	@Column(name = "sig_type")
	private String sig_type;
	@Column(name = "branch")
	private String branch;
	@Id
	@Column(name = "acc_no")
	private String acc_no;
	@Column(name = "source_code")
	private String source_code;
	@Column(name = "cif_sig_name")
	private String cif_sig_name;
	@Column(name = "record_stat")
	private String record_stat;
	@Column(name = "solo_sufficient")
	private Double solo_sufficient;
	@Column(name = "approval_limit")
	private Double approval_limit;
	@Column(name = "source_seq_no")
	private Double source_seq_no;

	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	public String getCif_sig_id() {
		return cif_sig_id;
	}

	public void setCif_sig_id(String cif_sig_id) {
		this.cif_sig_id = cif_sig_id;
	}

	public String getCifid() {
		return cifid;
	}

	public void setCifid(String cifid) {
		this.cifid = cifid;
	}

	public String getSig_msg() {
		return sig_msg;
	}

	public void setSig_msg(String sig_msg) {
		this.sig_msg = sig_msg;
	}

	public String getSig_type() {
		return sig_type;
	}

	public void setSig_type(String sig_type) {
		this.sig_type = sig_type;
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

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public String getCif_sig_name() {
		return cif_sig_name;
	}

	public void setCif_sig_name(String cif_sig_name) {
		this.cif_sig_name = cif_sig_name;
	}

	public String getRecord_stat() {
		return record_stat;
	}

	public void setRecord_stat(String record_stat) {
		this.record_stat = record_stat;
	}

	public Double getSolo_sufficient() {
		return solo_sufficient;
	}

	public void setSolo_sufficient(Double solo_sufficient) {
		this.solo_sufficient = solo_sufficient;
	}

	public Double getApproval_limit() {
		return approval_limit;
	}

	public void setApproval_limit(Double approval_limit) {
		this.approval_limit = approval_limit;
	}

	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
