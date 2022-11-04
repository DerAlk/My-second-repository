package com.hayaservices.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
   @Data
   @Entity @Table (name = "roles")
   @Setter @Getter
    public class Roles {
	@Id  @Column (name = "ROLE_ID")
	private int roleId;
	@Id  @Column (name = "ROLE_NAME")
	private String roleName;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
