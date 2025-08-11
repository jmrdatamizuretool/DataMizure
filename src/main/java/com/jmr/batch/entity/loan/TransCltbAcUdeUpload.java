package com.jmr.batch.entity.loan;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "TRANS_CLTB_AC_UDE_UPLOAD")
public class TransCltbAcUdeUpload {
	@EmbeddedId
    private TransCltbAcUdeUploadPK transCltbAcUdeUploadPK;
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pk_id")
	private Long pk_id;*/
	@Column(name = "branch_code")
	private String branch_code;
	@Column(name = "process_code")
	private String process_code;
	@Column(name = "ext_ref_no")
	private String ext_ref_no;
	/*
	 * @Column(name = "ude_id") private String ude_id;
	 */
	@Column(name = "rate_code")
	private String rate_code;
	@Column(name = "source_code")
	private String source_code;
	@Column(name = "code_usage")
	private String code_usage;
	@Column(name = "maint_rslv_flag")
	private String maint_rslv_flag;
	/*
	 * @Column(name = "ude_value") private Double ude_value;
	 */
	@Column(name = "resolved_value")
	private Double resolved_value;
	/*
	 * @Column(name = "sequence_no") private Double sequence_no;
	 */
	@Column(name = "effective_date")
	private Date effective_date;
	@Column(name = "rate_basis")
	private String rate_basis;

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getProcess_code() {
		return process_code;
	}

	public void setProcess_code(String process_code) {
		this.process_code = process_code;
	}

	public String getExt_ref_no() {
		return ext_ref_no;
	}

	public void setExt_ref_no(String ext_ref_no) {
		this.ext_ref_no = ext_ref_no;
	}

	/*
	 * public String getUde_id() { return ude_id; }
	 * 
	 * public void setUde_id(String ude_id) { this.ude_id = ude_id; }
	 */

	public String getRate_code() {
		return rate_code;
	}

	public void setRate_code(String rate_code) {
		this.rate_code = rate_code;
	}

	public String getSource_code() {
		return source_code;
	}

	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}

	public String getCode_usage() {
		return code_usage;
	}

	public void setCode_usage(String code_usage) {
		this.code_usage = code_usage;
	}

	public String getMaint_rslv_flag() {
		return maint_rslv_flag;
	}

	public void setMaint_rslv_flag(String maint_rslv_flag) {
		this.maint_rslv_flag = maint_rslv_flag;
	}

	/*
	 * public Double getUde_value() { return ude_value; }
	 * 
	 * public void setUde_value(Double ude_value) { this.ude_value = ude_value; }
	 */

	public Double getResolved_value() {
		return resolved_value;
	}

	public void setResolved_value(Double resolved_value) {
		this.resolved_value = resolved_value;
	}

	/*
	 * public Double getSequence_no() { return sequence_no; }
	 * 
	 * public void setSequence_no(Double sequence_no) { this.sequence_no =
	 * sequence_no; }
	 */

	public Date getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}

	
	/*
	 * public Long getPk_id() { return pk_id; }
	 * 
	 * public void setPk_id(Long pk_id) { this.pk_id = pk_id; }
	 */

	public String getRate_basis() {
		return rate_basis;
	}

	public void setRate_basis(String rate_basis) {
		this.rate_basis = rate_basis;
	}

	public TransCltbAcUdeUploadPK getTransCltbAcUdeUploadPK() {
		return transCltbAcUdeUploadPK;
	}

	public void setTransCltbAcUdeUploadPK(TransCltbAcUdeUploadPK transCltbAcUdeUploadPK) {
		this.transCltbAcUdeUploadPK = transCltbAcUdeUploadPK;
	}
	
}

