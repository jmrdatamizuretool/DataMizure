package com.jmr.batch.entity.signatures;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANS_SVTM_CIF_SIG_MASTER_UPLOAD")
public class TransSvtmCifSigMasterUpload implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="CIF_ID")
	private String cif_id;
	
	@Column(name="CIF_SIG_ID")
	private String cif_sig_id;
	
	@Column(name="BRANCH")
	private String branch;
	
	@Column(name="CIF_SIG_NAME")
	private String cif_sig_name;
	
	@Column(name="CIF_SIG_TITLE")
	private String cif_sig_title;
	
	@Column(name="SPECIMEN_NO")
	private String specimen_no;
	@Id
	@Column(name="SPECIMEN_SEQ_NO")
	private String specimen_seq_no;

	@Column(name="SIGNATURE")
	private String signature;
	
	@Column(name="EXT_FNAME")
	private String ext_fname;
	
	@Column(name="SIGN_IMG")
	private Blob sign_img;
	
	@Column(name="SIG_TEXT")
	private Byte sig_text;

	public String getCif_id() {
		return cif_id;
	}

	public void setCif_id(String cif_id) {
		this.cif_id = cif_id;
	}

	public String getCif_sig_id() {
		return cif_sig_id;
	}

	public void setCif_sig_id(String cif_sig_id) {
		this.cif_sig_id = cif_sig_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCif_sig_name() {
		return cif_sig_name;
	}

	public void setCif_sig_name(String cif_sig_name) {
		this.cif_sig_name = cif_sig_name;
	}

	public String getCif_sig_title() {
		return cif_sig_title;
	}

	public void setCif_sig_title(String cif_sig_title) {
		this.cif_sig_title = cif_sig_title;
	}

	public String getSpecimen_no() {
		return specimen_no;
	}

	public void setSpecimen_no(String specimen_no) {
		this.specimen_no = specimen_no;
	}

	public String getSpecimen_seq_no() {
		return specimen_seq_no;
	}

	public void setSpecimen_seq_no(String specimen_seq_no) {
		this.specimen_seq_no = specimen_seq_no;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getExt_fname() {
		return ext_fname;
	}

	public void setExt_fname(String ext_fname) {
		this.ext_fname = ext_fname;
	}

	

	public Blob getSign_img() {
		return sign_img;
	}

	public void setSign_img(Blob sign_img) {
		this.sign_img = sign_img;
	}

	public Byte getSig_text() {
		return sig_text;
	}

	public void setSig_text(Byte sig_text) {
		this.sig_text = sig_text;
	}

}
