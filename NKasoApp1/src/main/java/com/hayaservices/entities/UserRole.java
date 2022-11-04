package com.hayaservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

   @Data 
   @Entity @Table (name = "userrole")
   @Setter @Getter
    public class UserRole {
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Id  @Column (name = "USER_ROLE_ID")
	private int userroleId;
	@Id  @Column (name = "USER_ID")
	private long userId;
	@Id  @Column (name = "ROLE_ID")
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
