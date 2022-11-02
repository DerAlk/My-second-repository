package com.hayaservices.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayaservices.entities.Users;

import lombok.Data;

@Data
@Entity

public class Transfers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int transferId;
	private String transferType;
	private String senderName;
	private String receiverName;
	private Double transferAmount;
	private Double remainingBalance;
	private Date transferDate;
	private String countryFrom;
	private String countryTo;
	private Double commission;
	@Column(name = "clientId")
	private int clientId;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;
	
}
