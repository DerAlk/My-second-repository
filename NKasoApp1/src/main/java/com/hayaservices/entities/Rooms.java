package com.hayaservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity @Table (name = "rooms")
public class Rooms {

	@Id  @Column (name = "roomId")
	private int roomId;
	private String roomName;
	private Double Price;
	private int Capacity;
	private String Desc;
	private String Code;
	
	@Column(name = "aptId")
	private int aptId;
	
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
	
	}
	

