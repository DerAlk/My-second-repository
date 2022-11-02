package com.hayaservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity @Table (name = "images")
@Setter @Getter

public class Images {

	@Id  @Column (name = "imageId")
	private int imageId;
	private String imageDesc;
	@Column(name = "aptId")
	private int aptId;
	@Column(name = "roomId")
	private int roomId;
	
	
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
	
	
}
