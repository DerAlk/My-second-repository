package com.hayaservices.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity @Table (name = "apartments")
@Getter @Setter

  public class Apartments {
  @Id  @Column (name = "APT_ID")
   private int aptId;
  @Column (name = "APT_NAME")
   private String aptName;
	@Column (name = "APT_ADDRESS")
	private String aptAddress;
	@Column (name = "APT_DESC")
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
