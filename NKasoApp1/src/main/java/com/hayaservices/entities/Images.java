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

	@Id  @Column (name = "imageId")
	private int imageId;
	private String imageDesc;
	
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
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Rooms room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "aptId", nullable = false)
	private Apartments apartment;
	
}
