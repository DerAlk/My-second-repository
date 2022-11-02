package com.hayaservices.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hayaservices.entities.Images;
import com.hayaservices.entities.Rooms;

import lombok.Data;

@Data
@Entity

public class Apartments {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int aptId;
	private String aptName;
	private String aptAddress;
	private String aptDesc;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "apartments")
	private Set<Rooms> rooms;
	
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "apartments")
	private Set<Images> images;
}
