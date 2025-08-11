package com.jmr.batch.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LEGACY_DATA")
public class LegacyDataVb {
	
	@Column(name = "table_name")
	private String table_name;
	@Column(name = "module")
	private String module;
	@Column(name = "csv_file_path")
	private String csv_file_path;
	@Column(name = "recstatus")
	private String recstatus = "";
	@Column(name = "bankid")
	private Long bankid;
	@Column(name = "checkerid")
	private String checkerid = "";
	@Column(name = "checkdate")
	private Date checkdate;
	@Column(name = "makerid")
	private String makerid = "";
	@Column(name = "makedate")
	private Date makedate;
	@Column(name = "updatorid")
	private String updatorid = "";
	@Column(name = "updatedate")
	private Date updatedate;
	@Column(name = "brn_cd")
	private String brn_cd;
	@Column(name = "entity_id")
	private String entity_id;
	@Id
	@Column(name = "trans_table_name")
	private String trans_table_name;
	@Column(name = "display_order")
	private Long display_order;
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
	public String getCsv_file_path() {
		return csv_file_path;
	}
	public void setCsv_file_path(String csv_file_path) {
		this.csv_file_path = csv_file_path;
	}
	public String getRecstatus() {
		return recstatus;
	}
	public void setRecstatus(String recstatus) {
		this.recstatus = recstatus;
	}
	public Long getBankid() {
		return bankid;
	}
	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}
	public String getCheckerid() {
		return checkerid;
	}
	public void setCheckerid(String checkerid) {
		this.checkerid = checkerid;
	}
	public Date getCheckdate() {
		return checkdate;
	}
	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}
	public String getMakerid() {
		return makerid;
	}
	public void setMakerid(String makerid) {
		this.makerid = makerid;
	}
	public Date getMakedate() {
		return makedate;
	}
	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}
	public String getUpdatorid() {
		return updatorid;
	}
	public void setUpdatorid(String updatorid) {
		this.updatorid = updatorid;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public String getBrn_cd() {
		return brn_cd;
	}
	public void setBrn_cd(String brn_cd) {
		this.brn_cd = brn_cd;
	}
	public String getEntity_id() {
		return entity_id;
	}
	public void setEntity_id(String entity_id) {
		this.entity_id = entity_id;
	}
	public String getTrans_table_name() {
		return trans_table_name;
	}
	public void setTrans_table_name(String trans_table_name) {
		this.trans_table_name = trans_table_name;
	}
	public Long getDisplay_order() {
		return display_order;
	}
	public void setDisplay_order(Long display_order) {
		this.display_order = display_order;
	}
	
	

}
