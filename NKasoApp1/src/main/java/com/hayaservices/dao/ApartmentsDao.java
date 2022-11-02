package com.hayaservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hayaservices.entities.Apartments;

@Repository
public interface ApartmentsDao  extends CrudRepository<Apartments, Integer>{

}
