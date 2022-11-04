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
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Reservations;
import com.hayaservices.entities.Rooms;
import com.hayaservices.entities.Transfers;

      @RestController 
      @Component
       public class HayaServicesRS {
	
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
	    
	    @Autowired
	    private ReservationsDao rdao;
	    @GetMapping("/Reservations/{reservationId}")
	    public Reservations findReservation(@PathVariable  int reservationId) {
		java.util.Optional<Reservations> opt = rdao.findById(reservationId);
		Reservations r = new Reservations();
		if (opt.isPresent())  {
		r =opt.get();
	     }
	
	   return r;
		
	    }
	    
	    @Autowired
	    private RoomsDao rmdao;
	    @GetMapping("/rooms/{aptId}")
	    public Rooms findRoom(@PathVariable  int roomId) {
		java.util.Optional<Rooms> opt = rmdao.findById(roomId);
		Rooms o = new Rooms();
		if (opt.isPresent())  {
			o =opt.get();
	     }
	
	   return o;
		
	    }
	    
	    @Autowired
	    private TransfersDao tdao;
	    @GetMapping("/transfers/{transferId}")
	    public Transfers findTransafers(@PathVariable  int transferId) {
		java.util.Optional<Transfers> opt = tdao.findById(transferId);
		Transfers t = new Transfers();
		if (opt.isPresent())  {
		t =opt.get();
	     }
	
	   return t;
		
	    }
	
	}


	
	


