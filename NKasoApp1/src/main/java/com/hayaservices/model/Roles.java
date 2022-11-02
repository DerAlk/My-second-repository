package com.hayaservices.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.hayaservices.entities.Users;

import lombok.Data;

@Data
@Entity

public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roleId;
	private String roleName;
	
	@ManyToMany(mappedBy = "roles")
	Set<Users> users;
	
}
