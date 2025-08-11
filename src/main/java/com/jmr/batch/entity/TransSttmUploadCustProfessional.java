package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TRANS_STTM_UPLOAD_CUST_PROFESSIONAL")
public class TransSttmUploadCustProfessional {
	@Id
	private String customer_no;
	private String employment_status;
	private Double employment_tenure;
	private Double retirement_age;
	private String prev_designation;
	private String prev_employer;
	private String designation;
	private String employer;
	private String e_address1;
	private String e_address2;
	private String e_address3;
	private String e_telephone;
	private String e_telex;
	private String e_fax;
	private String e_email;
	private Double salary;
	private Double other_expenses;
	private Double other_income;
	private Double rent;
	private Double insurance;
	private Double loan_payment;
	private Double house_value;
	private Double credit_cards;
	private String e_country;
	private String ccy_pers_incexp;
	private String conversion_status_flag;
	private String err_msg;
	private String maintenance_seq_no;
	private String source_seq_no;
	private String branch_code;
	private String source_code;
	private String e_address4;
	private String salary_freq;
	private String pincode;
	
	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	@Column(name = "employment_status")
	public String getEmployment_status() {
		return employment_status;
	}
	public void setEmployment_status(String employment_status) {
		this.employment_status = employment_status;
	}
	@Column(name = "employment_tenure")
	public Double getEmployment_tenure() {
		return employment_tenure;
	}
	
	public void setEmployment_tenure(Double employment_tenure) {
		this.employment_tenure = employment_tenure;
	}
	@Column(name = "retirement_age")
	public Double getRetirement_age() {
		return retirement_age;
	}
	public void setRetirement_age(Double retirement_age) {
		this.retirement_age = retirement_age;
	}
	@Column(name = "prev_designation")
	public String getPrev_designation() {
		return prev_designation;
	}
	public void setPrev_designation(String prev_designation) {
		this.prev_designation = prev_designation;
	}
	@Column(name = "prev_employer")
	public String getPrev_employer() {
		return prev_employer;
	}
	public void setPrev_employer(String prev_employer) {
		this.prev_employer = prev_employer;
	}
	@Column(name = "designation")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Column(name = "employer")
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	@Column(name = "e_address1")
	public String getE_address1() {
		return e_address1;
	}
	public void setE_address1(String e_address1) {
		this.e_address1 = e_address1;
	}
	@Column(name = "e_address2")
	public String getE_address2() {
		return e_address2;
	}
	public void setE_address2(String e_address2) {
		this.e_address2 = e_address2;
	}
	@Column(name = "e_address3")
	public String getE_address3() {
		return e_address3;
	}
	public void setE_address3(String e_address3) {
		this.e_address3 = e_address3;
	}
	@Column(name = "e_telephone")
	public String getE_telephone() {
		return e_telephone;
	}
	public void setE_telephone(String e_telephone) {
		this.e_telephone = e_telephone;
	}
	@Column(name = "e_telex")
	public String getE_telex() {
		return e_telex;
	}
	public void setE_telex(String e_telex) {
		this.e_telex = e_telex;
	}
	@Column(name = "e_fax")
	public String getE_fax() {
		return e_fax;
	}
	public void setE_fax(String e_fax) {
		this.e_fax = e_fax;
	}
	@Column(name = "e_email")
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	@Column(name = "salary")
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Column(name = "other_expenses")
	public Double getOther_expenses() {
		return other_expenses;
	}
	public void setOther_expenses(Double other_expenses) {
		this.other_expenses = other_expenses;
	}
	@Column(name = "other_income")
	public Double getOther_income() {
		return other_income;
	}
	public void setOther_income(Double other_income) {
		this.other_income = other_income;
	}
	@Column(name = "rent")
	public Double getRent() {
		return rent;
	}
	public void setRent(Double rent) {
		this.rent = rent;
	}
	@Column(name = "insurance")
	public Double getInsurance() {
		return insurance;
	}
	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}
	@Column(name = "loan_payment")
	public Double getLoan_payment() {
		return loan_payment;
	}
	public void setLoan_payment(Double loan_payment) {
		this.loan_payment = loan_payment;
	}
	@Column(name = "house_value")
	public Double getHouse_value() {
		return house_value;
	}
	public void setHouse_value(Double house_value) {
		this.house_value = house_value;
	}
	@Column(name = "credit_cards")
	public Double getCredit_cards() {
		return credit_cards;
	}
	public void setCredit_cards(Double credit_cards) {
		this.credit_cards = credit_cards;
	}
	@Column(name = "e_country")
	public String getE_country() {
		return e_country;
	}
	public void setE_country(String e_country) {
		this.e_country = e_country;
	}
	@Column(name = "ccy_pers_incexp")
	public String getCcy_pers_incexp() {
		return ccy_pers_incexp;
	}
	public void setCcy_pers_incexp(String ccy_pers_incexp) {
		this.ccy_pers_incexp = ccy_pers_incexp;
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
	@Column(name = "source_seq_no")
	public String getSource_seq_no() {
		return source_seq_no;
	}
	public void setSource_seq_no(String source_seq_no) {
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
	@Column(name = "e_address4")
	public String getE_address4() {
		return e_address4;
	}
	public void setE_address4(String e_address4) {
		this.e_address4 = e_address4;
	}
	@Column(name = "salary_freq")
	public String getSalary_freq() {
		return salary_freq;
	}
	public void setSalary_freq(String salary_freq) {
		this.salary_freq = salary_freq;
	}
	@Column(name = "pincode")
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
