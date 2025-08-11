package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;


public class TransBctbupldpackcreditdtlsPK implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	    @Column(name = "BRANCH_CODE")
	    private String branchCode;

	    @Column(name = "SOURCE_CODE")
	    private String sourceCode;

	    @Column(name = "SOURCE_REF")
	    private String sourceRef;

	    @Column(name = "SOURCE_SEQ_NO")
	    private long sourceSeqNo;

	    @Column(name = "BCREFNO")
	    private String bcRefNo;

	    @Column(name = "CL_ACCOUNT")
	    private String clAccount;

	    @Column(name = "SEQ_NO")
	    private long seqNo;
	    
	    public TransBctbupldpackcreditdtlsPK() {
	    }
	    
	  //getters and setters

		public String getBranchCode() {
			return branchCode;
		}

		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}

		public String getSourceCode() {
			return sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getSourceRef() {
			return sourceRef;
		}

		public void setSourceRef(String sourceRef) {
			this.sourceRef = sourceRef;
		}

		public long getSourceSeqNo() {
			return sourceSeqNo;
		}

		public void setSourceSeqNo(long sourceSeqNo) {
			this.sourceSeqNo = sourceSeqNo;
		}

		public String getBcRefNo() {
			return bcRefNo;
		}

		public void setBcRefNo(String bcRefNo) {
			this.bcRefNo = bcRefNo;
		}

		public String getClAccount() {
			return clAccount;
		}

		public void setClAccount(String clAccount) {
			this.clAccount = clAccount;
		}

		public long getSeqNo() {
			return seqNo;
		}

		public void setSeqNo(long seqNo) {
			this.seqNo = seqNo;
		}
	    
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof TransBctbupldpackcreditdtlsPK)) {
				return false;
			}
			TransBctbupldpackcreditdtlsPK castOther = (TransBctbupldpackcreditdtlsPK)other;
			return 
				this.branchCode.equals(castOther.branchCode)
				&& this.sourceCode.equals(castOther.sourceCode)
				&& this.sourceRef.equals(castOther.sourceRef)
				&& (this.sourceSeqNo == castOther.sourceSeqNo)
				&& (this.bcRefNo == castOther.bcRefNo)
				&& this.clAccount.equals(castOther.clAccount)
				&& (this.seqNo == castOther.seqNo);
		}
		
		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + this.branchCode.hashCode();
			hash = hash * prime + this.sourceCode.hashCode();
			hash = hash * prime + this.sourceRef.hashCode();
			hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));
			hash = hash * prime + this.bcRefNo.hashCode();
			hash = hash * prime + this.clAccount.hashCode();
			hash = hash * prime + ((int) (this.seqNo ^ (this.seqNo >>> 32)));
			
			return hash;
		}

}
