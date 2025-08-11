package com.jmr.batch.entity.billsandcollections;

import javax.persistence.Embeddable;
import java.io.Serializable;
import javax.persistence.Column;
import java.util.Objects;

@Embeddable
public class TransBctbUploadLimitsPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "BRANCH_CODE")
    private String branchCode;
    
    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "SOURCE_REF")
    private String sourceRef;

    @Column(name = "PARTY_TYPE")
    private String partyType;

    @Column(name = "OPERATION")
    private String operation;
    
    @Column(name = "SOURCE_SEQ_NO")
    private double sourceSeqNo;
    
    @Column(name = "CUSTOMER_NO")
    private String customerNo;
    
    @Column(name = "LINKED_REF_NO")
    private String linkedRefNo;

    @Column(name = "LINKAGE_TYPE")
    private String linkageType;

    public TransBctbUploadLimitsPK() {
    }

    // Getters and Setters
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

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


    public double getSourceSeqNo() {
        return sourceSeqNo;
    }

    public void setSourceSeqNo(double sourceSeqNo) {
        this.sourceSeqNo = sourceSeqNo;
    }
    

    public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getLinkedRefNo() {
		return linkedRefNo;
	}

	public void setLinkedRefNo(String linkedRefNo) {
		this.linkedRefNo = linkedRefNo;
	}

	public String getLinkageType() {
		return linkageType;
	}

	public void setLinkageType(String linkageType) {
		this.linkageType = linkageType;
	}

	@Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof TransBctbUploadLimitsPK))
            return false;
        TransBctbUploadLimitsPK that = (TransBctbUploadLimitsPK) other;
        return Double.compare(that.sourceSeqNo, sourceSeqNo) == 0 &&
               Objects.equals(branchCode, that.branchCode) &&
               Objects.equals(sourceCode, that.sourceCode) &&
               Objects.equals(sourceRef, that.sourceRef) &&
               Objects.equals(partyType, that.partyType) &&
               Objects.equals(operation, that.operation)&&
               Objects.equals(customerNo, that.customerNo)&&
               Objects.equals(linkedRefNo, that.linkedRefNo)&&
               Objects.equals(linkageType, that.linkageType);
               
               
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + branchCode.hashCode();
        hash = hash * prime + sourceRef.hashCode();
        hash = hash * prime + partyType.hashCode();
        hash = hash * prime + operation.hashCode();
        hash = hash * prime + Double.hashCode(sourceSeqNo);
        hash = hash * prime + customerNo.hashCode();
        hash = hash * prime + linkedRefNo.hashCode();
        hash = hash * prime + linkageType.hashCode();
        return hash;
    }
}
