package com.jmr.batch.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_MITM_UPLOAD_CUSTOMER_DEFAULT")
public class TransMitmUploadCustomerDefault {
	@Id
	private String customer;
	private String mis_group;
	private String cust_mis_1;
	private String cust_mis_2;
	private String cust_mis_3;
	private String cust_mis_4;
	private String cust_mis_5;
	private String cust_mis_6;
	private String cust_mis_7;
	private String cust_mis_8;
	private String cust_mis_9;
	private String cust_mis_10;
	private String comp_mis_1;
	private String comp_mis_2;
	private String comp_mis_3;
	private String comp_mis_4;
	private String comp_mis_5;
	private String comp_mis_6;
	private String comp_mis_7;
	private String comp_mis_8;
	private String comp_mis_9;
	private String comp_mis_10;
	private String maintenance_seq_no;
	private Double source_seq_no;
	private String branch_code;
	private String source_code;
	@Column(name = "customer")
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Column(name = "mis_group")
	public String getMis_group() {
		return mis_group;
	}
	public void setMis_group(String mis_group) {
		this.mis_group = mis_group;
	}
	@Column(name = "cust_mis_1")
	public String getCust_mis_1() {
		return cust_mis_1;
	}
	public void setCust_mis_1(String cust_mis_1) {
		this.cust_mis_1 = cust_mis_1;
	}
	@Column(name = "cust_mis_2")
	public String getCust_mis_2() {
		return cust_mis_2;
	}
	public void setCust_mis_2(String cust_mis_2) {
		this.cust_mis_2 = cust_mis_2;
	}
	@Column(name = "cust_mis_3")
	public String getCust_mis_3() {
		return cust_mis_3;
	}
	public void setCust_mis_3(String cust_mis_3) {
		this.cust_mis_3 = cust_mis_3;
	}
	@Column(name = "cust_mis_4")
	public String getCust_mis_4() {
		return cust_mis_4;
	}
	public void setCust_mis_4(String cust_mis_4) {
		this.cust_mis_4 = cust_mis_4;
	}
	@Column(name = "cust_mis_5")
	public String getCust_mis_5() {
		return cust_mis_5;
	}
	public void setCust_mis_5(String cust_mis_5) {
		this.cust_mis_5 = cust_mis_5;
	}
	@Column(name = "cust_mis_6")
	public String getCust_mis_6() {
		return cust_mis_6;
	}
	public void setCust_mis_6(String cust_mis_6) {
		this.cust_mis_6 = cust_mis_6;
	}
	@Column(name = "cust_mis_7")
	public String getCust_mis_7() {
		return cust_mis_7;
	}
	public void setCust_mis_7(String cust_mis_7) {
		this.cust_mis_7 = cust_mis_7;
	}
	@Column(name = "cust_mis_8")
	public String getCust_mis_8() {
		return cust_mis_8;
	}
	public void setCust_mis_8(String cust_mis_8) {
		this.cust_mis_8 = cust_mis_8;
	}
	@Column(name = "Cust_mis_9")
	public String getCust_mis_9() {
		return cust_mis_9;
	}
	public void setCust_mis_9(String cust_mis_9) {
		this.cust_mis_9 = cust_mis_9;
	}
	@Column(name = "cust_mis_10")
	public String getCust_mis_10() {
		return cust_mis_10;
	}
	public void setCust_mis_10(String cust_mis_10) {
		this.cust_mis_10 = cust_mis_10;
	}
	@Column(name = "comp_mis_1")
	public String getComp_mis_1() {
		return comp_mis_1;
	}
	
	public void setComp_mis_1(String comp_mis_1) {
		this.comp_mis_1 = comp_mis_1;
	}
	@Column(name = "comp_mis_2")
	public String getComp_mis_2() {
		return comp_mis_2;
	}
	public void setComp_mis_2(String comp_mis_2) {
		this.comp_mis_2 = comp_mis_2;
	}
	@Column(name = "comp_mis_3")
	public String getComp_mis_3() {
		return comp_mis_3;
	}
	public void setComp_mis_3(String comp_mis_3) {
		this.comp_mis_3 = comp_mis_3;
	}
	@Column(name = "comp_mis_4")
	public String getComp_mis_4() {
		return comp_mis_4;
	}
	public void setComp_mis_4(String comp_mis_4) {
		this.comp_mis_4 = comp_mis_4;
	}
	@Column(name = "comp_mis_5")
	public String getComp_mis_5() {
		return comp_mis_5;
	}
	public void setComp_mis_5(String comp_mis_5) {
		this.comp_mis_5 = comp_mis_5;
	}
	@Column(name = "comp_mis_6")
	public String getComp_mis_6() {
		return comp_mis_6;
	}
	public void setComp_mis_6(String comp_mis_6) {
		this.comp_mis_6 = comp_mis_6;
	}
	@Column(name = "comp_mis_7")
	public String getComp_mis_7() {
		return comp_mis_7;
	}
	public void setComp_mis_7(String comp_mis_7) {
		this.comp_mis_7 = comp_mis_7;
	}
	@Column(name = "comp_mis_8")
	public String getComp_mis_8() {
		return comp_mis_8;
	}
	public void setComp_mis_8(String comp_mis_8) {
		this.comp_mis_8 = comp_mis_8;
	}
	@Column(name = "comp_mis_9")
	public String getComp_mis_9() {
		return comp_mis_9;
	}
	public void setComp_mis_9(String comp_mis_9) {
		this.comp_mis_9 = comp_mis_9;
	}
	@Column(name = "comp_mis_10")
	public String getComp_mis_10() {
		return comp_mis_10;
	}
	public void setComp_mis_10(String comp_mis_10) {
		this.comp_mis_10 = comp_mis_10;
	}
	@Column(name = "maintenance_seq_no")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}
	
	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
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

	

}
