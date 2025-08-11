package com.jmr.batch.entity.tdRd;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANS_ICTM_UPLOAD_TDPAYOUT_DET database table.
 * 
 */
@Embeddable
public class TransIctmUploadTdpayoutDetPK implements Serializable{
			// default serial version id, required for serializable classes.

			private static final long serialVersionUID = 1L;
			
			@Column(name = "MAINTENANCE_SEQ_NO")
			private String maintenance_seq_no;

			@Column(name = "SOURCE_CODE")
			private String source_code;

			@Column(name = "SOURCE_SEQ_NO")
			private long source_seq_no;

			@Column(name = "BRN")
			private String brn;

			@Column(name = "ACC")
			private String acc;

			@Column(name = "SEQNO")
			private long seqno;

			public TransIctmUploadTdpayoutDetPK() {
				
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


			public long getSource_seq_no() {
				return source_seq_no;
			}


			public void setSource_seq_no(long source_seq_no) {
				this.source_seq_no = source_seq_no;
			}


			public String getBrn() {
				return brn;
			}


			public void setBrn(String brn) {
				this.brn = brn;
			}


			public String getAcc() {
				return acc;
			}


			public void setAcc(String acc) {
				this.acc = acc;
			}


			public long getSeqno() {
				return seqno;
			}


			public void setSeqno(long seqno) {
				this.seqno = seqno;
			}


			public static long getSerialversionuid() {
				return serialVersionUID;
			}


			public boolean equals(Object other) {
				if (this == other) {
					return true;
				}
				if (!(other instanceof TransIctmUploadTdpayoutDetPK)) {
					return false;
				}
				TransIctmUploadTdpayoutDetPK castOther = (TransIctmUploadTdpayoutDetPK) other;

				return this.maintenance_seq_no.equals(castOther.maintenance_seq_no)					 
						&& this.source_code.equals(castOther.source_code)
						&& (this.source_seq_no == castOther.source_seq_no) 		
						&& this.brn.equals(castOther.brn) 
						&& this.acc.equals(castOther.acc)
						&& (this.seqno == castOther.seqno);

			}

			public int hashCode() {
				final int prime = 31;
				int hash = 17;
				hash = hash * prime + this.maintenance_seq_no.hashCode();			
				hash = hash * prime + this.source_code.hashCode();
				hash = hash * prime + ((int) (this.source_seq_no ^ (this.source_seq_no >>> 32)));
				hash = hash * prime + ((int) (this.seqno ^ (this.seqno >>> 32)));
				hash = hash * prime + this.brn.hashCode();
				hash = hash * prime + this.acc.hashCode();
				return hash;
			}



}
