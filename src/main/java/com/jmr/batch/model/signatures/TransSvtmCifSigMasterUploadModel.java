package com.jmr.batch.model.signatures;

public class TransSvtmCifSigMasterUploadModel {
	private String cif_id;
	private String cif_sig_id;
	private String branch;
	private String cif_sig_name;
	private String cif_sig_title;
	private String specimen_no;
	private String specimen_seq_no;
	private String sig_text;
	private String signature;
	private String ext_fname;
	private String sign_img;

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

	public String getSig_text() {
		return sig_text;
	}

	public void setSig_text(String sig_text) {
		this.sig_text = sig_text;
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

	public String getSign_img() {
		return sign_img;
	}

	public void setSign_img(String sign_img) {
		this.sign_img = sign_img;
	}

}
