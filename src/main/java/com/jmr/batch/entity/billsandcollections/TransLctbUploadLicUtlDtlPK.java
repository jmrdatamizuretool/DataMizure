package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the TRANS_BCTB_UPLOAD_ACC_EXC database table.
 * 
 */
@Embeddable
public class TransLctbUploadLicUtlDtlPK implements Serializable{
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name = "branch_code")
    private String branchCode;

    @Column(name = "source_code")
    private String sourceCode;

    @Column(name = "source_ref")
    private String sourceRef;

    @Column(name = "source_seq_no")
    private Long sourceSeqNo;

    @Column(name = "import_license_no")
    private String importLicenseNo;

    @Column(name = "goods_code")
    private String goodsCode;
    
    public TransLctbUploadLicUtlDtlPK() {
    }

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

	public Long getSourceSeqNo() {
		return sourceSeqNo;
	}

	public void setSourceSeqNo(Long sourceSeqNo) {
		this.sourceSeqNo = sourceSeqNo;
	}

	public String getImportLicenseNo() {
		return importLicenseNo;
	}

	public void setImportLicenseNo(String importLicenseNo) {
		this.importLicenseNo = importLicenseNo;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
    
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransLctbUploadLicUtlDtlPK)) {
			return false;
		}
		TransLctbUploadLicUtlDtlPK castOther = (TransLctbUploadLicUtlDtlPK)other;
		return 
			this.sourceCode.equals(castOther.sourceCode)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.sourceRef.equals(castOther.sourceRef)
			&& this.importLicenseNo.equals(castOther.importLicenseNo)
			&& this.goodsCode.equals(castOther.goodsCode)
			&& (this.sourceSeqNo == castOther.sourceSeqNo);
	} 
	
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceCode.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.sourceRef.hashCode();
		hash = hash * prime + this.importLicenseNo.hashCode();
		hash = hash * prime + this.goodsCode.hashCode();
		hash = hash * prime + ((int) (this.sourceSeqNo ^ (this.sourceSeqNo >>> 32)));			
		return hash;
	}

}
