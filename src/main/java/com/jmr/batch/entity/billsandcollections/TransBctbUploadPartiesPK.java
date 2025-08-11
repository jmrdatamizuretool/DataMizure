package com.jmr.batch.entity.billsandcollections;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Objects;

@Embeddable
public class TransBctbUploadPartiesPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "SOURCE_CODE")
    private String sourceCode;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "SOURCE_REF")
    private String sourceRef;

    @Column(name = "PARTY_TYPE")
    private String partyType;

    @Column(name = "SOURCE_SEQ_NO")
    private double sourceSeqNo;

    public TransBctbUploadPartiesPK() {
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

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public double getSourceSeqNo() {
        return sourceSeqNo;
    }

    public void setSourceSeqNo(double sourceSeqNo) {
        this.sourceSeqNo = sourceSeqNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransBctbUploadPartiesPK)) return false;
        TransBctbUploadPartiesPK that = (TransBctbUploadPartiesPK) o;
        return Double.compare(that.sourceSeqNo, sourceSeqNo) == 0 &&
               Objects.equals(sourceCode, that.sourceCode) &&
               Objects.equals(branchCode, that.branchCode) &&
               Objects.equals(sourceRef, that.sourceRef) &&
               Objects.equals(partyType, that.partyType);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + sourceCode.hashCode();
        hash = hash * prime + branchCode.hashCode();
        hash = hash * prime + sourceRef.hashCode();
        hash = hash * prime + partyType.hashCode();
        hash = hash * prime + Double.hashCode(sourceSeqNo);
        return hash;
    }
}
