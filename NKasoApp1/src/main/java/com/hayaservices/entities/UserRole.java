package com.hayaservices.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

   @Data 
   @Entity 
    public class UserRole {
	@Id 	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userroleId;
	private long userId;
	private int roleId;
	
	public int getUserroleId() {
		return userroleId;
	}
	public void setUserroleId(int userroleId) {
		this.userroleId = userroleId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	}
