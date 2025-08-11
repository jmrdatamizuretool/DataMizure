package com.jmr.batch.listener;

public class RecordCount {
	private Integer totalRecords;
	private Integer successRecords;
	private Integer failedRecords;
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getSuccessRecords() {
		return successRecords;
	}
	public void setSuccessRecords(Integer successRecords) {
		this.successRecords = successRecords;
	}
	public Integer getFailedRecords() {
		return failedRecords;
	}
	public void setFailedRecords(Integer failedRecords) {
		this.failedRecords = failedRecords;
	}

}
