package com.hayaservices.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity @Table (name = "reservations")
@Setter @Getter

public class Reservations {
	@Id  @Column (name = "reservationId")
	private int reservationId;
	@Column(name = "roleId")
	private int roleId;
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
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getStayLength() {
		return stayLength;
	}
	public void setStayLength(int stayLength) {
		this.stayLength = stayLength;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public String getComingFrom() {
		return comingFrom;
	}
	public void setComingFrom(String comingFrom) {
		this.comingFrom = comingFrom;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getClientStatus() {
		return clientStatus;
	}
	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public String getAdminComment() {
		return adminComment;
	}
	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}
	
}
