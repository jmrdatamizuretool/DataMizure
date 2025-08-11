package com.jmr.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INVOICE_TEST")
public class Invoice {
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;*/
	@Id

	private String name;
	private String num;
	private String location;
	/*@Column(name = "ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "NUM")
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	@Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
