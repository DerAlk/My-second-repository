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
	@Id  @Column (name = "FIRST_NAME")
	private String firstName;
	@Id  @Column (name = "LAST_NAME")
	private String lastName;
	@Id  @Column (name = "EMAIL")
	private String email;
	@Id  @Column (name = "PHONE_NUM")
	private String phoneNum;
	@Id  @Column (name = "SALARY")
	private Double salary;
	@Id  @Column (name = "ACCT_DISABLED")
	private boolean acctDisabled;
	@Id  @Column (name = "ACCT_EXPIRED")
	private boolean  acctExpired;
	@Id  @Column (name = "CREDS_EXPIRED")
	private boolean credsExpired;
	@Id  @Column (name = "SUPERADMIN")
	private String superAdmin;
	@Id  @Column (name = "PASSWORD")
	private String Password;
	@Column(name = "Role_ID")
	private int roleId;
	
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
//	 protected Users(){
//	        roles = new HashSet<Roles>();
//	    }
//	 
//	public Users(int userId, String firstName, String lastName, String email, String phoneNum, Double salary,
//			boolean acctDisabled, boolean acctExpired, boolean credsExpired, String superAdmin, String password,
//			int roleId, Set<Reservations> reservations, Set<Transfers> transfers, Set<Roles> roles) {
//		super();
//		this.userId = userId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.phoneNum = phoneNum;
//		this.salary = salary;
//		this.acctDisabled = acctDisabled;
//		this.acctExpired = acctExpired;
//		this.credsExpired = credsExpired;
//		this.superAdmin = superAdmin;
//		Password = password;
//		this.roleId = roleId;
//		this.reservations = reservations;
//		this.transfers = transfers;
//		this.roles = roles;
//	}

//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//	private Set<Reservations> reservations;
//	
//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
//	private Set<Transfers> transfers;
//	
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "userrole", 
//	joinColumns = @JoinColumn(name = "USER_ID"), 
//	inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
//    Set<Roles> roles;
	

}
