package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_CSTB_RELATIONSHIP_UPLOAD_1")
public class TransCstbRelationshipUpload {

	private String maintenance_seq_no;
	private String ref_no;
	private String category;
	@Id
	private String customer_no;
	private String relation;
	private String inherit;
	private String branch;
	private Double source_seq_no;
	private String branch_code;
	private String source_code;
	private String source_ref;

	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "ref_no")
	public String getRef_no() {
		return ref_no;
	}

	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}

	@Column(name = "category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "relation")
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Column(name = "inherit")
	public String getInherit() {
		return inherit;
	}

	public void setInherit(String inherit) {
		this.inherit = inherit;
	}

	@Column(name = "branch")
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	@Column(name = "source_code")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "source_ref")
	public String getSource_ref() {
		return source_ref;
	}

	public void setSource_ref(String source_ref) {
		this.source_ref = source_ref;
	}

	public TransCstbRelationshipUpload() {
		super();
	}

	public TransCstbRelationshipUpload(String maintenance_seq_no, String ref_no, String category, String customer_no,
			String relation, String inherit, String branch, Double source_seq_no, String branch_code,
			String source_code, String source_ref) {
		super();
		this.maintenance_seq_no = maintenance_seq_no;
		this.ref_no = ref_no;
		this.category = category;
		this.customer_no = customer_no;
		this.relation = relation;
		this.inherit = inherit;
		this.branch = branch;
		this.source_seq_no = source_seq_no;
		this.branch_code = branch_code;
		this.source_code = source_code;
		this.source_ref = source_ref;
	}

}