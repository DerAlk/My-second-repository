package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.TransfersDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.reservations;

   @Service
    public class Transfers {
	@Autowired
	private TransfersDao dao;
	
	public Iterable<com.hayaservices.entities.Transfers> getTransferSales() {
	return dao.findAll();
	}
	com.hayaservices.entities.Transfers  getTransferSalesById (int Id) {
	return dao. findById(Id).orElse( null);
	}
	String deleteTransferSales (int Id) {
	dao.deleteById(Id);
	return "Transfer deleted" +Id ;
	}
//	  public Transfers updateTransferSales(Transfers  transfers) {
//	 Transfers existingTransfers = dao. findById(transfers.getTransferId()).orElse(new Transfers());
//	  existingTransfers.setType(transfers.getTransferType());
//	  existingTransfers.setAmount(transfers.getTransferAmount());
//	   return dao.save(existingTransfers);
//		
//     }
	  
   }

