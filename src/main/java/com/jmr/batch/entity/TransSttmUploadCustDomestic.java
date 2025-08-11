package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_UPLOAD_CUST_DOMESTIC")

public class TransSttmUploadCustDomestic {
	private String customer_no;
	private String educational_status;
	private String marital_status;
	private String spouse_name;
	private String spouse_emp_status;
	private Double dependent_children;
	private Double dependent_others;
	private String accomodation;
	private String conversion_status_flag;
	private String err_msg;
	private String maintenance_seq_no;
	private String mother_maiden_name;
	@Id
	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "educational_status")
	public String getEducational_status() {
		return educational_status;
	}

	public void setEducational_status(String educational_status) {
		this.educational_status = educational_status;
	}

	@Column(name = "marital_status")
	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	@Column(name = "spouse_name")
	public String getSpouse_name() {
		return spouse_name;
	}

	public void setSpouse_name(String spouse_name) {
		this.spouse_name = spouse_name;
	}

	@Column(name = "spouse_emp_status")
	public String getSpouse_emp_status() {
		return spouse_emp_status;
	}

	public void setSpouse_emp_status(String spouse_emp_status) {
		this.spouse_emp_status = spouse_emp_status;
	}

	@Column(name = "dependent_children")
	public Double getDependent_children() {
		return dependent_children;
	}

	public void setDependent_children(Double dependent_children) {
		this.dependent_children = dependent_children;
	}

	@Column(name = "dependent_others")
	public Double getDependent_others() {
		return dependent_others;
	}

	public void setDependent_others(Double dependent_others) {
		this.dependent_others = dependent_others;
	}

	@Column(name = "accomodation")
	public String getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}

	@Column(name = "conversion_status_flag")
	public String getConversion_status_flag() {
		return conversion_status_flag;
	}

	public void setConversion_status_flag(String conversion_status_flag) {
		this.conversion_status_flag = conversion_status_flag;
	}

	@Column(name = "err_msg")
	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "mother_maiden_name")
	public String getMother_maiden_name() {
		return mother_maiden_name;
	}

	public void setMother_maiden_name(String mother_maiden_name) {
		this.mother_maiden_name = mother_maiden_name;
	}

}
