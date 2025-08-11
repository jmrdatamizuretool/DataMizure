package com.jmr.batch.entity.chequebook;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_CATM_UPLOAD_CHECK_BOOK")
public class TransCatmUploadCheckBook implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransCatmUploadCheckBookPK id;
	private String source_code;
	private String request_mode;
	private String request_status;
	//private String branch;
	private String errmsg;
	private String trn_ref_no;
	private String external_ref_no;
	private String maintenance_seq_no;
	private String action_code;
	private String order_details;
	private String delivery_add1;
	private String delivery_add2;
	private String delivery_add3;
	private String delivery_add4;
	private String language_code;
	private String delivery_ref_no;
	private String delivery_mode;
	private String cheque_book_type;
	private String book_type;
	private String print_status;
	private String upload_status_flag;
	private String chqbook_deliverd;
	private String incl_for_chkbook_printing;
	private String apply_charge;
	private Double check_leaves;
	private Double seq_no;
	private Date order_date;
	private Date issue_date;
	private Date delivery_date;
	private String issuing_branch;
	public TransCatmUploadCheckBook() {
	}

	public TransCatmUploadCheckBookPK getId() {
		return this.id;
	}

	public void setId(TransCatmUploadCheckBookPK id) {
		this.id = id;
	}

	@Column(name = "SOURCE_CODE")
	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	@Column(name = "REQUEST_MODE")
	public String getRequest_mode() {
		return request_mode;
	}

	public void setRequest_mode(String request_mode) {
		this.request_mode = request_mode;
	}

	@Column(name = "REQUEST_STATUS")
	public String getRequest_status() {
		return request_status;
	}

	public void setRequest_status(String request_status) {
		this.request_status = request_status;
	}

	

	@Column(name = "ERRMSG")
	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;

	}

	@Column(name = "TRN_REF_NO")
	public String getTrn_ref_no() {
		return trn_ref_no;
	}

	public void setTrn_ref_no(String trn_ref_no) {
		this.trn_ref_no = trn_ref_no;
	}

	
	@Column(name = "EXTERNAL_REF_NO")
	public String getExternal_ref_no() {
		return external_ref_no;
	}

	public void setExternal_ref_no(String external_ref_no) {
		this.external_ref_no = external_ref_no;
	}

	@Column(name = "MAINTENANCE_SEQ_NO")
	public String getMaintenance_seq_no() {
		return maintenance_seq_no;
	}

	public void setMaintenance_seq_no(String maintenance_seq_no) {
		this.maintenance_seq_no = maintenance_seq_no;
	}

	@Column(name = "ACTION_CODE")
	public String getAction_code() {
		return action_code;
	}

	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}

	@Column(name = "ORDER_DETAILS")
	public String getOrder_details() {
		return order_details;
	}

	public void setOrder_details(String order_details) {
		this.order_details = order_details;
	}

	@Column(name = "DELIVERY_ADD1")
	public String getDelivery_add1() {
		return delivery_add1;
	}

	public void setDelivery_add1(String delivery_add1) {
		this.delivery_add1 = delivery_add1;
	}

	@Column(name = "DELIVERY_ADD2")
	public String getDelivery_add2() {
		return delivery_add2;
	}

	public void setDelivery_add2(String delivery_add2) {
		this.delivery_add2 = delivery_add2;
	}

	@Column(name = "DELIVERY_ADD3")
	public String getDelivery_add3() {
		return delivery_add3;
	}

	public void setDelivery_add3(String delivery_add3) {
		this.delivery_add3 = delivery_add3;
	}

	@Column(name = "DELIVERY_ADD4")
	public String getDelivery_add4() {
		return delivery_add4;
	}

	public void setDelivery_add4(String delivery_add4) {
		this.delivery_add4 = delivery_add4;
	}

	@Column(name = "LANGUAGE_CODE")
	public String getLanguage_code() {
		return language_code;
	}

	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}

	@Column(name = "DELIVERY_REF_NO")
	public String getDelivery_ref_no() {
		return delivery_ref_no;
	}

	public void setDelivery_ref_no(String delivery_ref_no) {
		this.delivery_ref_no = delivery_ref_no;
	}

	@Column(name = "DELIVERY_MODE")
	public String getDelivery_mode() {
		return delivery_mode;
	}

	public void setDelivery_mode(String delivery_mode) {
		this.delivery_mode = delivery_mode;
	}

	@Column(name = "CHEQUE_BOOK_TYPE")
	public String getCheque_book_type() {
		return cheque_book_type;
	}

	public void setCheque_book_type(String cheque_book_type) {
		this.cheque_book_type = cheque_book_type;
	}

	@Column(name = "BOOK_TYPE")
	public String getBook_type() {
		return book_type;
	}

	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}

	@Column(name = "PRINT_STATUS")
	public String getPrint_status() {
		return print_status;
	}

	public void setPrint_status(String print_status) {
		this.print_status = print_status;
	}

	@Column(name = "UPLOAD_STATUS_FLAG")
	public String getUpload_status_flag() {
		return upload_status_flag;
	}

	public void setUpload_status_flag(String upload_status_flag) {
		this.upload_status_flag = upload_status_flag;
	}

	@Column(name = "CHQBOOK_DELIVERD")
	public String getChqbook_deliverd() {
		return chqbook_deliverd;
	}

	public void setChqbook_deliverd(String chqbook_deliverd) {
		this.chqbook_deliverd = chqbook_deliverd;
	}

	@Column(name = "INCL_FOR_CHKBOOK_PRINTING")
	public String getIncl_for_chkbook_printing() {
		return incl_for_chkbook_printing;
	}

	public void setIncl_for_chkbook_printing(String incl_for_chkbook_printing) {
		this.incl_for_chkbook_printing = incl_for_chkbook_printing;
	}

	@Column(name = "APPLY_CHARGE")
	public String getApply_charge() {
		return apply_charge;
	}

	public void setApply_charge(String apply_charge) {
		this.apply_charge = apply_charge;
	}

	@Column(name = "CHECK_LEAVES")
	public Double getCheck_leaves() {
		return check_leaves;
	}

	public void setCheck_leaves(Double check_leaves) {
		this.check_leaves = check_leaves;
	}

	@Column(name = "ORDER_DATE")
	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	@Column(name = "ISSUE_DATE")
	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	@Column(name = "DELIVERY_DATE")
	public Date getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(Date delivery_date) {
		this.delivery_date = delivery_date;
	}

	@Column(name = "SEQ_NO")
	public Double getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(Double seq_no) {
		this.seq_no = seq_no;
	}

	

	public String getIssuing_branch() {
		return issuing_branch;
	}

	public void setIssuing_branch(String issuing_branch) {
		this.issuing_branch = issuing_branch;
	}

}
