 package com.hayaservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.ReservationsDao;
import com.hayaservices.dao.RoomsDao;
import com.hayaservices.dao.TransfersDao;
import com.hayaservices.dao.UsersDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Reservations;
import com.hayaservices.entities.Rooms;
import com.hayaservices.entities.Transfers;
import com.hayaservices.entities.Users;

      @RestController 
      @Component
       public class ApartRoomRS {
	
	   @Autowired
	    private ApartmentsDao dao;
	    @GetMapping("/apartments/{aptId}")
	    public Apartments findApartment(@PathVariable  int aptId) {
		java.util.Optional<Apartments> opt = dao.findById(aptId);
		Apartments a = new Apartments();
		if (opt.isPresent())  {
		a =opt.get();
	     }
	
	   return a;
		
	    }
	    @GetMapping ({"/apartments"})
	    public Iterable<Apartments> getApartments() {
	    return dao.findAll();
	    	
	    }
	    
	    @Autowired
	    private RoomsDao rmdao;
	    @GetMapping("/rooms/{roomId}")
	    public Rooms findRoom(@PathVariable  int roomId) {
		java.util.Optional<Rooms> opt = rmdao.findById(roomId);
		Rooms o = new Rooms();
		if (opt.isPresent())  {
			o =opt.get();
	     }
	
	   return o;
		
	    }
	    
	    @GetMapping ({"/rooms"})
	      public Iterable<Rooms> getRooms() {
	       return rmdao.findAll();
	    }
	    
      }


	
	


