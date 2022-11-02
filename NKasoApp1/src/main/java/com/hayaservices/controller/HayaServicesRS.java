package com.hayaservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.entities.Apartments;

      @RestController 
      @Component
       public class HayaServicesRS {
	
	   @Autowired
	    private ApartmentsDao dao;
	    @GetMapping("apartments/ {aptId} ")
	    public Apartments find(@PathVariable  int aptId) {
		java.util.Optional<Apartments> opt = dao.findById(aptId);
		Apartments a = new Apartments();
		if (opt.isPresent())  {
		a =opt.get();
	     }
	
	   return a;
		
	    }
	
	}


	
	


