package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
 class Clients {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long clientId;
	private String fristName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	private String whereFrom;
	private int confirmationNum;
	private String company;
	private String Password;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "reservations")
	private Set<Reservations> reservations;
	
}
