package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the TRANS_BCTB_UPLOAD_BROK_DETAIL database table.
 * 
 */
@Embeddable
public class TransBctbUploadFftPK implements Serializable {
	//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;
		
		@Column(name = "SOURCE_CODE")
	    private String sourceCode;

	    @Column(name = "BRANCH_CODE")
	    private String branchCode;

	    @Column(name = "SOURCE_REF")
	    private String sourceRef;

	    @Column(name = "SOURCE_SEQ_NO")
	    private Long sourceSeqNo;

	    @Column(name = "RECORD_SEQ_NO")
	    private Long recordSeqNo;

	    @Column(name = "FFT_CODE")
	    private String fftCode;

	    @Column(name = "ADV_CODE")
	    private String advCode;
	    
	    public TransBctbUploadFftPK() {
		}

		public String getSourceCode() {
			return sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getBranchCode() {
			return branchCode;
		}

		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}

		public String getSourceRef() {
			return sourceRef;
		}

		public void setSourceRef(String sourceRef) {
			this.sourceRef = sourceRef;
		}

		public Long getSourceSeqNo() {
			return sourceSeqNo;
		}

		public void setSourceSeqNo(Long sourceSeqNo) {
			this.sourceSeqNo = sourceSeqNo;
		}

		public Long getRecordSeqNo() {
			return recordSeqNo;
		}

		public void setRecordSeqNo(Long recordSeqNo) {
			this.recordSeqNo = recordSeqNo;
		}

		public String getFftCode() {
			return fftCode;
		}

		public void setFftCode(String fftCode) {
			this.fftCode = fftCode;
		}

		public String getAdvCode() {
			return advCode;
		}

		public void setAdvCode(String advCode) {
			this.advCode = advCode;
		}
	    
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof TransBctbUploadFftPK)) {
				return false;
			}
			TransBctbUploadFftPK castOther = (TransBctbUploadFftPK)other;
			return 
				this.branchCode.equals(castOther.branchCode)
				&& this.sourceCode.equals(castOther.sourceCode)
				&& this.sourceRef.equals(castOther.sourceRef)
				&& (this.sourceSeqNo == castOther.sourceSeqNo)
				&& (this.recordSeqNo == castOther.recordSeqNo)
				&& this.fftCode.equals(castOther.fftCode)
				&& this.advCode.equals(castOther.advCode);
		}
		
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.branchCode.hashCode();
			hash = hash * prime + this.sourceCode.hashCode();
			hash = hash * prime + this.sourceRef.hashCode();
			hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
			hash = hash * prime + ((int) (this.recordSeqNo ^ (this.recordSeqNo >>> 32)));
			hash = hash * prime + this.fftCode.hashCode();
			hash = hash * prime + this.advCode.hashCode();
			
			return hash;
		}

}
