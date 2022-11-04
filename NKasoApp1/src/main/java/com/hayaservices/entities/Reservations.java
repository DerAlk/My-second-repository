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
	@Id  @Column (name = "RESERVATION_ID")
	private int reservationId;
	@Column(name = "PRICE")
	private Double  price;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "RESERVATION_DATE")
	private Date  reservationDate;
	@Column(name = "START_DATE")
	private Date  startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "STAY_LENGTH")
	private int stayLength;
	@Column(name = "NUM_OF_PEOPLE")
	private int numOfPeople;
	@Column(name = "COMING_FROM")
	private String comingFrom;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "REFERENCE")
	private String reference;
	@Column(name = "PROFILE")
	private String profile;
	@Column(name = "CLIENT_STATUS")
	private String clientStatus;
	@Column(name = "ROOM_ID")
	private Double  roomId;
	@Column(name = "CLIENT_ID")
	private Double  clientId;
	@Column(name = "USER_ID")
	private Double  userId;
	@Column(name = "ADMINCOMMENT")
	private String adminComment;
	@Column(name = "RESERVATION_STATUS")
	private String reservationStatus;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ROOM_ID", nullable = false)
    private Rooms room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Clients client;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private Users user;

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

	public Double getRoomId() {
		return roomId;
	}

	public void setRoomId(Double roomId) {
		this.roomId = roomId;
	}

	public Double getClientId() {
		return clientId;
	}

	public void setClientId(Double clientId) {
		this.clientId = clientId;
	}

	public Double getUserId() {
		return userId;
	}

	public void setUserId(Double userId) {
		this.userId = userId;
	}

	public String getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	public Rooms getRoom() {
		return room;
	}

	public void setRoom(Rooms room) {
		this.room = room;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}	
