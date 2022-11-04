package com.hayaservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayaservices.entities.Apartments;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity @Table (name = "images")
@Setter @Getter

public class Images {

	@Id  @Column (name = "IMAGE_ID")
	private int imageId;
	@Id  @Column (name = "IMAGE_DESC")
	private String imageDesc;
	@Id  @Column (name = "APT_ID")
	private int aptId;
	@Id  @Column (name = "ROOM_ID")
	private int roomId;
	
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "APT_ID", nullable = false)
	private Apartments apartment;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ROOM_ID", nullable = false)
    private Rooms room;
	
	
	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImageDesc() {
		return imageDesc;
	}

	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}

	public int getAptId() {
		return aptId;
	}

	public void setAptId(int aptId) {
		this.aptId = aptId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

}
