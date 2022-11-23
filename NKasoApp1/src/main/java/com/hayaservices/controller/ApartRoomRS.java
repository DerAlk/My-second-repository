 package com.hayaservices.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
      @PostMapping({"/Addapartments"})
      public Apartments createApartment(@Valid@RequestBody Apartments apt) {
     return dao.save(apt);
      }
      
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
	    
//	    @PutMapping ("/UpdateApts/{id}")
//	    public ResponseEntity<Apartments> update Apartments(@Pathvariable (value ="id") Long aptId, @Valid @RequestBody Apartments  aptDetails) {
//	    	Apartments apt = ApartmentsDao.findOne(empId);
//	    	if (apt == null) {
//	    		return RespoinseEntity.notFound().build();
//	    	}
//	    	apt.setAptId(aptDetails.getAptId());
//	    	apt.setDesigination(aptDetails.getDesigination());
//	    	apt.setExpertise(aptDetails.getExperties());
//	    	
//	    	Apartments updateApartments=apartmentsDAO.save(apt);
//	    	return ResponseEntity.ok().body(updateApartments)
//	    	
//	    }
	    
//	   @DeleteMapping ("apartment/{id}") 
//	  public ResponseEntity <Apartment> deleteApartment(@pathVariable (value = "id") Long aptId) {
//		   Apartments apt = ApartmentsDao.findOne(aptId);
//		   if (apt == null) {
//			   return  ResponseEntity .notFound().build();
//		   }
//		   aprtmentsDao.delete(apt);
//		   
//		   return ResponseEntity.ok.build();
//	   }
	   
	    
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


	
	


