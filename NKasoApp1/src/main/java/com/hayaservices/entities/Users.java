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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity @Table (name = "users")
@Setter @Getter
public class Users {
	@Id  @Column (name = "USER_ID")
	private int userId;
    @Column (name = "FIRST_NAME")
	private String firstName;
	@Column (name = "LAST_NAME")
	private String lastName;
	@Column (name = "EMAIL")
	private String email;
	 @Column (name = "PHONE_NUM")
	private String phoneNum;
	@Column (name = "SALARY")
	private Double salary;
	@Column (name = "ACCT_DISABLED")
	private boolean acctDisabled;
	@Column (name = "ACCT_EXPIRED")
	private boolean  acctExpired;
	@Column (name = "CREDS_EXPIRED")
	private boolean credsExpired;
	@Column (name = "SUPERADMIN")
	private String superAdmin;
	@Column (name = "PASSWORD")
	private String Password;

	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private Roles role;
	
	
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
	public boolean getAcctDisabled() {
		return acctDisabled;
	}
	public void setAcctDisabled(boolean acctDisabled) {
		this.acctDisabled = acctDisabled;
	}
	public boolean getAcctExpired() {
		return acctExpired;
	}
	public void setAcctExpired(boolean acctExpired) {
		this.acctExpired = acctExpired;
	}
	public boolean getCredsExpired() {
		return credsExpired;
	}
	public void setCredsExpired(boolean credsExpired) {
		this.credsExpired = credsExpired;
	}
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

}
