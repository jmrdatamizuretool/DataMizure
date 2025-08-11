package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TRANS_STTM_UPLOAD_ACCOUNT_CHANNEL")
public class TransSttmUploadAccountChannel {
	private String source_code;
	private String branch_code;
	private String channel_remarks;
	@Id
	private String account_no;
	private String maintenance_seq_no;
	private String channel_name;
	private String channel_id;
	private Double source_seq_no;

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "channel_remarks")
	public String getChannel_remarks() {
		return channel_remarks;
	}

	public void setChannel_remarks(String channel_remarks) {
		this.channel_remarks = channel_remarks;
	}

	@Column(name = "account_no")
	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "channel_name")
	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	@Column(name = "channel_id")
	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	@Column(name = "source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
