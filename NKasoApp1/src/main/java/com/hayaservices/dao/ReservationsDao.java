package com.hayaservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.reservations;

@Repository
public interface ReservationsDao  extends CrudRepository<reservations, Integer>{

}
