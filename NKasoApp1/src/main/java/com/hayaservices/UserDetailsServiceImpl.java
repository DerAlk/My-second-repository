package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayaservices.dao.TransfersDao;
import com.hayaservices.dao.UsersDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Transfers;
import com.hayaservices.entities.Users;
   @Service
    public class UserDetailsServiceImpl {
	@Autowired
	private UsersDao dao;
	
	public Iterable<Users> getUsers() {
	return dao.findAll();
	}

	Users  getUsersById (int Id) {
	return dao. findById(Id).orElse (null);
	}
	String deleteUsers (int Id) {
	dao.deleteById(Id);
	return "User deleted" +Id ;
	}
	
	    public Users updateUsers(Users  users) {
		Users existingUsers = dao. findById(users.getUserId()).orElse(null);
		existingUsers.setFirstName(users.getFirstName());
		existingUsers.setLastName(users.getLastName());
		existingUsers.setPhoneNum(users.getPhoneNum());
		existingUsers.setEmail(users.getEmail());
		existingUsers.setSalary(users.getSalary());
		return dao.save(users);
		
}
}
