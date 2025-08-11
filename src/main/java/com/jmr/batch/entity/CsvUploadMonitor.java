package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CSV_UPLOAD_MONITOR")
public class CsvUploadMonitor {
	@Id
	@Column(name = "table_name")
	private String table_name;
	@Column(name = "module")
	private String module;
	@Column(name = "start_date")
	private Date start_date;
	@Column(name = "end_date")
	private Date end_date;
	@Column(name = "status")
	private String status;
	@Column(name = "step_name")
	private String step_name;
	@Column(name = "total_records")
	private Long total_records;
	@Column(name = "success_records")
	private Long success_records;
	@Column(name = "failed_records")
	private Long failed_records;
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStep_name() {
		return step_name;
	}
	public void setStep_name(String step_name) {
		this.step_name = step_name;
	}
	public Long getTotal_records() {
		return total_records;
	}
	public void setTotal_records(Long total_records) {
		this.total_records = total_records;
	}
	public Long getSuccess_records() {
		return success_records;
	}
	public void setSuccess_records(Long success_records) {
		this.success_records = success_records;
	}
	public Long getFailed_records() {
		return failed_records;
	}
	public void setFailed_records(Long failed_records) {
		this.failed_records = failed_records;
	}
	
}
