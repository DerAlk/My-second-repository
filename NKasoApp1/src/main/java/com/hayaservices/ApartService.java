package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.ReservationsDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.reservations;

@Service
public class ApartService {

	@Autowired
	private ApartmentsDao dao;
	public Iterable<Apartments> getApartments() {
		return dao.findAll();
	}

	public Apartments  getApartmentsById (int Id) {
		return dao. findById(Id).orElse(null);
	}
	String deleteApartments (int Id) {
		dao.deleteById(Id);
		return "Apartment deleted" +Id ;
	}

	     public Apartments updateApartments(Apartments apartments) {
		Apartments existingApartments = dao. findById(apartments.getAptId()).orElse( new Apartments());
		existingApartments.setAptName(apartments.getAptName());
		existingApartments.setAddress(apartments.getAddress());
		existingApartments.setDesc(apartments.getDesc());
		return dao.save(existingApartments);

	}
}


