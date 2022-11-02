package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayaservices.dao.TransfersDao;
import com.hayaservices.dao.UsersDao;
import com.hayaservices.entities.Transfers;
import com.hayaservices.entities.Users;
@Service
public class UserDetailsServiceImpl {
	@Autowired
	private UsersDao dao;
	
	public Iterable<Users> getUsers() {
	return dao.findAll();
	}
}
//	Users  getUsersById (int Id) {
//	return dao. findById(Id).orElse(other: null);
//	}
//	String deleteUsers (int Id) {
//	dao.deleteById(Id);
//	return "User deleted" +Id ;
//	}
//	
//	    Users updateUsers(Users  users) {
//		Users existingUsers = dao. findById(users.getId()).orElse(other: null);
//		existingUsers.setPrice(Users.getPrice());
//		existingUsers.setStartDate(Users.getStartDate());
//		existingUsers.setEndDate(Users.getEndDate());
//		return dao.save(Users);
//		
//}
//}
