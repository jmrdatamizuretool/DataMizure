package com.jmr.batch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STTM_UPLOAD_SWEEP_DTLS1")
public class TransSttmUploadSweepDtls {
	private String amount_block_no;
	private String deposit_branch;
	private String branch_code;
	private String deposit_account;
	@Id
	private String cust_ac_no;
	private String sweep_type;
	private String maintenance_seq_no;
	private String source_code;
	private String limit_frequency;
	private String retain_min_bal;
	private Double order_of_linkage;
	private Double utilized_amount;
	private Double sweep_limit;
	private Double original_deposit_amount;
	private Double linked_percentage;
	private Double linked_amount;
	private Double freq_utilized_amount;
	private Double blocked_amount;
	private Double available_amount;
	private Double source_seq_no;

	public String getAmount_block_no() {
		return amount_block_no;
	}

	public void setAmount_block_no(String amount_block_no) {
		this.amount_block_no = amount_block_no;
	}

	public String getDeposit_branch() {
		return deposit_branch;
	}

	public void setDeposit_branch(String deposit_branch) {
		this.deposit_branch = deposit_branch;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getDeposit_account() {
		return deposit_account;
	}

	public void setDeposit_account(String deposit_account) {
		this.deposit_account = deposit_account;
	}

	public String getCust_ac_no() {
		return cust_ac_no;
	}

	public void setCust_ac_no(String cust_ac_no) {
		this.cust_ac_no = cust_ac_no;
	}

	public String getSweep_type() {
		return sweep_type;
	}

	public void setSweep_type(String sweep_type) {
		this.sweep_type = sweep_type;
	}

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

	public String getLimit_frequency() {
		return limit_frequency;
	}

	public void setLimit_frequency(String limit_frequency) {
		this.limit_frequency = limit_frequency;
	}

	public String getRetain_min_bal() {
		return retain_min_bal;
	}

	public void setRetain_min_bal(String retain_min_bal) {
		this.retain_min_bal = retain_min_bal;
	}

	public Double getOrder_of_linkage() {
		return order_of_linkage;
	}

	public void setOrder_of_linkage(Double order_of_linkage) {
		this.order_of_linkage = order_of_linkage;
	}

	public Double getUtilized_amount() {
		return utilized_amount;
	}

	public void setUtilized_amount(Double utilized_amount) {
		this.utilized_amount = utilized_amount;
	}

	public Double getSweep_limit() {
		return sweep_limit;
	}

	public void setSweep_limit(Double sweep_limit) {
		this.sweep_limit = sweep_limit;
	}

	public Double getOriginal_deposit_amount() {
		return original_deposit_amount;
	}

	public void setOriginal_deposit_amount(Double original_deposit_amount) {
		this.original_deposit_amount = original_deposit_amount;
	}

	public Double getLinked_percentage() {
		return linked_percentage;
	}

	public void setLinked_percentage(Double linked_percentage) {
		this.linked_percentage = linked_percentage;
	}

	public Double getLinked_amount() {
		return linked_amount;
	}

	public void setLinked_amount(Double linked_amount) {
		this.linked_amount = linked_amount;
	}

	public Double getFreq_utilized_amount() {
		return freq_utilized_amount;
	}

	public void setFreq_utilized_amount(Double freq_utilized_amount) {
		this.freq_utilized_amount = freq_utilized_amount;
	}

	public Double getBlocked_amount() {
		return blocked_amount;
	}

	public void setBlocked_amount(Double blocked_amount) {
		this.blocked_amount = blocked_amount;
	}

	public Double getAvailable_amount() {
		return available_amount;
	}

	public void setAvailable_amount(Double available_amount) {
		this.available_amount = available_amount;
	}

	public Double getSource_seq_no() {
		return source_seq_no;
	}

	public void setSource_seq_no(Double source_seq_no) {
		this.source_seq_no = source_seq_no;
	}

}
