package com.hayaservices.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

    @Data
    @Entity @Table (name = "rooms")
    @Setter @Getter
    public class Rooms {
   @Id  @Column (name = "ROOM_ID")
	private int roomId;
	@Id  @Column (name = "ROOM_NAME")
	private String roomName;
	@Id  @Column (name = "PRICE")
	private Double Price;
	@Id  @Column (name = "CAPACITY")
	private int Capacity;
	@Id  @Column (name = "DESC")
	private String Desc;
	@Id  @Column (name = "CODE")
	private String Code;
	@Id  @Column (name = "APT_ID")
	private int aptId;
	
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "APT_ID", nullable = false)
	private Apartments apartment;
	
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double Price) {
		this.Price = Price;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int Capacity) {
		this.Capacity = Capacity;
	}
	public String getDes() {
		return Desc;
	}
	public void setDescription(String Desc) {
		this.Desc = Desc;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String Code) {
		this.Code = Code;
	}
	public int getAptId() {
		return aptId;
	}
	public void setAptId(int aptId) {
		this.aptId = aptId;
	}
	
	
	
	
	
//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room")
//	private Set<Reservations> reservations;
//	
//	@JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room")
//	private Set<Images> images;
	
	
	}
	

