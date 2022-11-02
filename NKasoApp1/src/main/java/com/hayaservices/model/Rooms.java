package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity

public class Rooms {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roomId;
	private String roomName;
	private Double Price;
	private int Capacity;
	private String Desc;
	private String Code;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "reservations")
	private Set<Reservations> reservations;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "images")
	private Set<Images> images;
	
	@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "aptId", nullable = false)
	private Apartments apartments;
	
}
