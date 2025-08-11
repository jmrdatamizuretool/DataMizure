package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_STTM_UPLOAD_CORP_DIRECTORS")
public class TransSttmUploadCorpDirectors {
	@Id
	private String customer_no;
	private String director_name;

	private String conversion_status_flag;

	private String err_msg;

	private String maintenance_seq_no;

	private Double source_seq_no;

	private String branch_code;

	private String source_code;

	private Double slno;

	private String address_line1;

	private String address_line2;

	private String address_line3;

	private String address_line4;

	private String p_address1;

	private String p_address2;

	private String p_address3;
	private String p_country;
	private String telephone;
	private String tax_id;
	private String mobile_number;
	private String e_mail;
	private Double tel_isd_no;
	private Double mob_isd_no;
	private String addr_country;
	private String nationality;
	private String us_res_status;
	private Double pct_holding;
	private String home_tel_no;
	private Double home_tel_isd;
	private String p_pincode;
	private String pincode;
	private String p_address4;

	@Column(name = "customer_no")
	public String getCustomer_no() {
		return customer_no;
	}

	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}

	@Column(name = "director_name")
	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
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

	@Column(name = "slno")
	public Double getSlno() {
		return slno;
	}

	public void setSlno(Double slno) {
		this.slno = slno;
	}

	@Column(name = "address_line1")
	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	@Column(name = "address_line2")

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	@Column(name = "address_line3")

	public String getAddress_line3() {
		return address_line3;
	}

	public void setAddress_line3(String address_line3) {
		this.address_line3 = address_line3;
	}

	@Column(name = "address_line4")
	public String getAddress_line4() {
		return address_line4;
	}

	public void setAddress_line4(String address_line4) {
		this.address_line4 = address_line4;
	}

	@Column(name = "p_address1")

	public String getP_address1() {
		return p_address1;
	}

	public void setP_address1(String p_address1) {
		this.p_address1 = p_address1;
	}

	@Column(name = "p_address2")
	public String getP_address2() {
		return p_address2;
	}

	public void setP_address2(String p_address2) {
		this.p_address2 = p_address2;
	}

	@Column(name = "p_address3")
	public String getP_address3() {
		return p_address3;
	}

	public void setP_address3(String p_address3) {
		this.p_address3 = p_address3;
	}

	@Column(name = "p_country")
	public String getP_country() {
		return p_country;
	}

	public void setP_country(String p_country) {
		this.p_country = p_country;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "tax_id")
	public String getTax_id() {
		return tax_id;
	}

	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}

	@Column(name = "mobile_number")
	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	@Column(name = "e_mail")
	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	@Column(name = "tel_isd_no")
	public Double getTel_isd_no() {
		return tel_isd_no;
	}

	public void setTel_isd_no(Double tel_isd_no) {
		this.tel_isd_no = tel_isd_no;
	}

	@Column(name = "mob_isd_no")
	public Double getMob_isd_no() {
		return mob_isd_no;
	}

	public void setMob_isd_no(Double mob_isd_no) {
		this.mob_isd_no = mob_isd_no;
	}

	@Column(name = "addr_country")
	public String getAddr_country() {
		return addr_country;
	}

	public void setAddr_country(String addr_country) {
		this.addr_country = addr_country;
	}

	@Column(name = "nationality")
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;

	}

	@Column(name = "us_res_status")
	public String getUs_res_status() {
		return us_res_status;
	}

	public void setUs_res_status(String us_res_status) {
		this.us_res_status = us_res_status;
	}

	@Column(name = "pct_holding")
	public Double getPct_holding() {
		return pct_holding;
	}

	public void setPct_holding(Double pct_holding) {
		this.pct_holding = pct_holding;
	}

	@Column(name = "home_tel_no")
	public String getHome_tel_no() {
		return home_tel_no;
	}

	public void setHome_tel_no(String home_tel_no) {
		this.home_tel_no = home_tel_no;
	}

	@Column(name = "home_tel_isd")
	public Double getHome_tel_isd() {
		return home_tel_isd;
	}

	public void setHome_tel_isd(Double home_tel_isd) {
		this.home_tel_isd = home_tel_isd;
	}

	@Column(name = "p_pincode")
	public String getP_pincode() {
		return p_pincode;
	}

	public void setP_pincode(String p_pincode) {
		this.p_pincode = p_pincode;
	}

	@Column(name = "pincode")
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "p_address4")
	public String getP_address4() {
		return p_address4;
	}

	public void setP_address4(String p_address4) {
		this.p_address4 = p_address4;
	}

	public TransSttmUploadCorpDirectors() {
		super();
	}

	
}
