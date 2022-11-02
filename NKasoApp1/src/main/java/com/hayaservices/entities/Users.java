package com.hayaservices.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity @Table (name = "users")
@Setter @Getter
public class Users {
	@Id  @Column (name = "userId")
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private Double salary;
	private boolean acctDisabled;
	private boolean  acctExpired;
	private boolean credsExpired;
	private String superAdmin;
	private String Password;
	@Column(name = "roleId")
	private int roleId;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
//	public boolean getAcctDisabled() {
//		return acctDisabled;
//	}
//	public void setAcctDisabled(boolean acctDisabled) {
//		this.acctDisabled = acctDisabled;
//	}
//	public boolean getAcctExpired() {
//		return acctExpired;
//	}
//	public void setAcctExpired(boolean acctExpired) {
//		this.acctExpired = acctExpired;
//	}
//	public boolean getCredsExpired() {
//		return credsExpired;
//	}
//	public void setCredsExpired(boolean credsExpired) {
//		this.credsExpired = credsExpired;
//	}
	public String getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(String superAdmin) {
		this.superAdmin = superAdmin;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	 protected Users(){
	        roles = new HashSet<Roles>();
	    }
	 
	public Users(int userId, String firstName, String lastName, String email, String phoneNum, Double salary,
			boolean acctDisabled, boolean acctExpired, boolean credsExpired, String superAdmin, String password,
			int roleId, Set<Reservations> reservations, Set<Transfers> transfers, Set<Roles> roles) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.salary = salary;
		this.acctDisabled = acctDisabled;
		this.acctExpired = acctExpired;
		this.credsExpired = credsExpired;
		this.superAdmin = superAdmin;
		Password = password;
		this.roleId = roleId;
		this.reservations = reservations;
		this.transfers = transfers;
		this.roles = roles;
	}

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Reservations> reservations;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Transfers> transfers;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "userrole", 
	joinColumns = @JoinColumn(name = "userId"), 
	inverseJoinColumns = @JoinColumn(name = "roleId"))
    Set<Roles> roles;
	

}
