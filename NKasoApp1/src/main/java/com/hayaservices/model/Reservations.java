package com.hayaservices.model;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayaservices.entities.Clients;
import com.hayaservices.entities.Rooms;
import com.hayaservices.entities.Users;

import lombok.Data;

@Data
@Entity
public class Reservations {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long reservationId;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Rooms room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users user;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Clients client;
	
	private Double  price;
	private String reason;
	private Date  reservationDate;
	private Date  startDate;
	private Date endDate;
	private int stayLength;
	private int numOfPeople;
	private String comingFrom;
	private String company;
	private String reference;
	private String profile;
	private String clientStatus;
	private String reservationStatus;
	private String adminComment;
	
}
