package com.jmr.batch.entity.loan;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TransCltbAcUdeUploadPK implements Serializable{
//	EXT_REF_NO, BRANCH_CODE, SOURCE_CODE, EFFECTIVE_DATE, UDE_ID, PROCESS_CODE, SEQUENCE_NO
	
	private static final long serialVersionUID = 1L;
	@Column(name = "ude_id")
	private String ude_id;
	@Column(name = "ude_value")
	private Double ude_value;
	@Column(name = "sequence_no")
	private Double sequence_no;
	public String getUde_id() {
		return ude_id;
	}
	public void setUde_id(String ude_id) {
		this.ude_id = ude_id;
	}
	public Double getUde_value() {
		return ude_value;
	}
	public void setUde_value(Double ude_value) {
		this.ude_value = ude_value;
	}
	public Double getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(Double sequence_no) {
		this.sequence_no = sequence_no;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sequence_no, ude_id, ude_value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransCltbAcUdeUploadPK other = (TransCltbAcUdeUploadPK) obj;
		return Objects.equals(sequence_no, other.sequence_no) && Objects.equals(ude_id, other.ude_id)
				&& Objects.equals(ude_value, other.ude_value);
	}
	
}