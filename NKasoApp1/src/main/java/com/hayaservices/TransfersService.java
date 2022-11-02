package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.hayaservices.TransfersService;
import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.TransfersDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Reservations;

   @Service
    public class TransfersService {
	@Autowired
	private TransfersDao dao;
	
	public Iterable<com.hayaservices.entities.Transfers> getTransferSales() {
	return dao.findAll();
	}
	com.hayaservices.entities.Transfers  getTransferById (int Id) {
	return dao. findById(Id).orElse( null);
	}
	String deleteTransferSales (int Id) {
	dao.deleteById(Id);
	return "Transfer deleted" +Id ;
	}
	  
   }

