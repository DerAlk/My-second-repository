package com.hayaservices.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayaservices.entities.Reservations;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@ Data
@Entity @Table (name = "clients")
@Setter @Getter

    public class Clients {
	@Id  @Column (name = "CLIENT_ID")
	private int clientId;
	@Id  @Column (name = "FIRST_NAME")
	private String fristName;
	@Id  @Column (name = "LAST_NAME")
	private String lastName;
	@Id  @Column (name = "PHONE_NUM")
	private String phoneNumber;
	@Id  @Column (name = "EMAIL")
	private String emailAddress;
	@Id  @Column (name = "WHERE_FROM")
	private String whereFrom;
	@Id  @Column (name = "CONFIRMATION_NUM")
	private int confirmationNum;
	@Id  @Column (name = "COMPANY")
	private String company;
	@Id  @Column (name = "PASSWORD")
	private String Password;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getWhereFrom() {
		return whereFrom;
	}
	public void setWhereFrom(String whereFrom) {
		this.whereFrom = whereFrom;
	}
	public int getConfirmationNum() {
		return confirmationNum;
	}
	public void setConfirmationNum(int confirmationNum) {
		this.confirmationNum = confirmationNum;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
//	private Set<Reservations> reservations;

	
}
