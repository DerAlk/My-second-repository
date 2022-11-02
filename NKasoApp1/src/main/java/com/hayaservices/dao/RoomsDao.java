package com.hayaservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Rooms;

@Repository
public interface RoomsDao extends CrudRepository<Rooms, Integer>{

}
