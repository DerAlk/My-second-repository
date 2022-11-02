package com.hayaservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hayaservices.dao.ReservationsDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.reservations;
import com.hayaservices.model.Reservations;

@Service
public class ReservationService {

	@Autowired
	private ReservationsDao dao;
	
	public Iterable<reservations> getReservations() {
	return dao.findAll();
	}
	reservations getReservationsById (int Id) {
	return dao. findById(Id).orElse( null);
	}
	String deleteReservations (int Id) {
	dao.deleteById(Id);
	return "Reservation deleted" +Id ;
	}
	
//	    public Reservations updateReservations(Reservations reservations) {
//	   Reservations existingReservations = dao. findById(reservations.getReservationId()).orElse(new Reservations());
//		existingReservations.setPrice(reservations.getPrice());
//		existingReservations.setStartDate(reservations.getStartDate());
//		existingReservations.setEndDate(reservations.getEndDate());
//		return dao.save(existingReservations);
//		
//      }
	
}

