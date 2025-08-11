package com.jmr.batch.entity.tdRd;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TRANS_ICTM_UPLOAD_TDPAYIN_DET")
public class TransIctmUploadTdpayinDet implements Serializable{
	
		private static final long serialVersionUID = 1L;

		@EmbeddedId
		private TransIctmUploadTdpayinDetPK id;

		//private String brn;
		//private String acc;
		//private String seqno;
		//private String maintenance_seq_no;
		//private String source_code;
		//private String source_seq_no;
		
		@Column(name = "CCY")
		private String ccy;

		@Column(name = "MULTIMODE_PAYOPT")
		private String multimode_payopt;

		@Column(name = "MULTIMODE_TDAMOUNT")
		private String multimode_tdamount;

		@Column(name = "MULTIMODE_OFFSET_BRN")
		private String multimode_offset_brn;

		@Column(name = "MULTIMODE_TDOFFSET_ACC")
		private String multimode_tdoffset_acc;

		@Column(name = "MULTIMODE_TDOFFSET_CCY")
		private String multimode_tdoffset_ccy;

		@Column(name = "REFERENCE_NO")
		private String reference_no;

		@Column(name = "MULTIMODE_PERCENTAGE")
		private String multimode_percentage;

		@Column(name = "MULITMODE_XRATE")
		private String mulitmode_xrate;

		@Column(name = "CHQ_INSTUMENTNO")
		private String chq_instumentno;

		@Column(name = "CLG_BANK_CODE")
		private String clg_bank_code;

		@Column(name = "CLG_BRANCH_CODE")
		private String clg_branch_code;

		@Column(name = "CLG_PRODUCT_CODE")
		private String clg_product_code;

		@Column(name = "CHQ_INSTRUMENT_DATE")
		private String chq_instrument_date;

		@Column(name = "DRAWEE_AC_NO")
		private String drawee_ac_no;

		@Column(name = "ROUTING_NO")
		private String routing_no;

		public TransIctmUploadTdpayinDet() {
			
		}

		public TransIctmUploadTdpayinDetPK getId() {
			return id;
		}

		public void setId(TransIctmUploadTdpayinDetPK id) {
			this.id = id;
		}

		public String getCcy() {
			return ccy;
		}

		public void setCcy(String ccy) {
			this.ccy = ccy;
		}

		public String getMultimode_payopt() {
			return multimode_payopt;
		}

		public void setMultimode_payopt(String multimode_payopt) {
			this.multimode_payopt = multimode_payopt;
		}

		public String getMultimode_tdamount() {
			return multimode_tdamount;
		}

		public void setMultimode_tdamount(String multimode_tdamount) {
			this.multimode_tdamount = multimode_tdamount;
		}

		public String getMultimode_offset_brn() {
			return multimode_offset_brn;
		}

		public void setMultimode_offset_brn(String multimode_offset_brn) {
			this.multimode_offset_brn = multimode_offset_brn;
		}

		public String getMultimode_tdoffset_acc() {
			return multimode_tdoffset_acc;
		}

		public void setMultimode_tdoffset_acc(String multimode_tdoffset_acc) {
			this.multimode_tdoffset_acc = multimode_tdoffset_acc;
		}

		public String getMultimode_tdoffset_ccy() {
			return multimode_tdoffset_ccy;
		}

		public void setMultimode_tdoffset_ccy(String multimode_tdoffset_ccy) {
			this.multimode_tdoffset_ccy = multimode_tdoffset_ccy;
		}

		public String getReference_no() {
			return reference_no;
		}

		public void setReference_no(String reference_no) {
			this.reference_no = reference_no;
		}

		public String getMultimode_percentage() {
			return multimode_percentage;
		}

		public void setMultimode_percentage(String multimode_percentage) {
			this.multimode_percentage = multimode_percentage;
		}

		public String getMulitmode_xrate() {
			return mulitmode_xrate;
		}

		public void setMulitmode_xrate(String mulitmode_xrate) {
			this.mulitmode_xrate = mulitmode_xrate;
		}

		public String getChq_instumentno() {
			return chq_instumentno;
		}

		public void setChq_instumentno(String chq_instumentno) {
			this.chq_instumentno = chq_instumentno;
		}

		public String getClg_bank_code() {
			return clg_bank_code;
		}

		public void setClg_bank_code(String clg_bank_code) {
			this.clg_bank_code = clg_bank_code;
		}

		public String getClg_branch_code() {
			return clg_branch_code;
		}

		public void setClg_branch_code(String clg_branch_code) {
			this.clg_branch_code = clg_branch_code;
		}

		public String getClg_product_code() {
			return clg_product_code;
		}

		public void setClg_product_code(String clg_product_code) {
			this.clg_product_code = clg_product_code;
		}

		public String getChq_instrument_date() {
			return chq_instrument_date;
		}

		public void setChq_instrument_date(String chq_instrument_date) {
			this.chq_instrument_date = chq_instrument_date;
		}

		public String getDrawee_ac_no() {
			return drawee_ac_no;
		}

		public void setDrawee_ac_no(String drawee_ac_no) {
			this.drawee_ac_no = drawee_ac_no;
		}

		public String getRouting_no() {
			return routing_no;
		}

		public void setRouting_no(String routing_no) {
			this.routing_no = routing_no;
		}

				

}
