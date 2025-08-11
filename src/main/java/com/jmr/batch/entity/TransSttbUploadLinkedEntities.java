package com.jmr.batch.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTB_UPLOAD_LINKED_ENTITIES")
public class TransSttbUploadLinkedEntities {
	private String branch_code;
	@Id
	private String cust_ac_no;
	private String joint_holder_code;
	private String joint_holder_description;
	private String joint_holder;
	private String maintenance_seq_no;
	private String source_code;
	private Double source_seq_no;
	private Date start_date;
	private Date end_date;

	@Column(name = "Branch_code")
	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	@Column(name = "Cust_ac_no")
	public String getCust_ac_no() {
		return cust_ac_no;
	}

	public void setCust_ac_no(String cust_ac_no) {
		this.cust_ac_no = cust_ac_no;
	}

	@Column(name = "Joint_holder_code")
	public String getJoint_holder_code() {
		return joint_holder_code;
	}

	public void setJoint_holder_code(String joint_holder_code) {
		this.joint_holder_code = joint_holder_code;
	}

	@Column(name = "Joint_holder_description")
	public String getJoint_holder_description() {
		return joint_holder_description;
	}

	public void setJoint_holder_description(String joint_holder_description) {
		this.joint_holder_description = joint_holder_description;
	}

	@Column(name = "Joint_holder")
	public String getJoint_holder() {
		return joint_holder;
	}

	public void setJoint_holder(String joint_holder) {
		this.joint_holder = joint_holder;
	}

	@Column(name = "Maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "Source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "Source_seq_no")
	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

	@Column(name = "Start_date")
	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	@Column(name = "End_date")
	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

}
