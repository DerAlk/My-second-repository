package com.hayaservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hayaservices.entities.Rooms;

import lombok.Data;

@Entity
@Data

public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int imageId;
	private String imageName;
	private String imageDesc;
	//private String imageUrl;
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "roomId", nullable = false)
    private Rooms room;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "aptId", nullable = false)
	private Apartments apartment;
}
