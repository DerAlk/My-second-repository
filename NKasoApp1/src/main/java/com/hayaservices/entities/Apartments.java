package com.hayaservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Table (name = "apartments")
@Getter @Setter
public class Apartments {
	@Id  @Column (name = "aptId")
	private int aptId;
	private String aptName;
	private String aptAddress;
	private String aptDesc;
	
	public int getAptId() {
		return aptId;
	}
	public void setAptId(int aptId) {
		this.aptId = aptId;
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getAddress() {
		return aptAddress;
	}
	public void setAddress(String address) {
		this.aptAddress = address;
	}
	public String getDesc() {
		return aptDesc;
	}
	public void setDesc(String desc) {
		this.aptDesc = desc;
	}
	
}
