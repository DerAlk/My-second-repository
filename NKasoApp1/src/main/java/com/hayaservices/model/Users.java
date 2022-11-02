package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import antlr.collections.List;
import lombok.Data;

@Data
@Entity

public class Users {    

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long userId;
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
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Set<Reservations> reservations;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
	private Set<Transfers> transfers;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "userRole", 
	joinColumns = @JoinColumn(name = "userId"), 
	inverseJoinColumns = @JoinColumn(name = "roleId"))
    List roles;

}
