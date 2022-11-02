package com.hayaservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Transfers;

@Repository
public interface TransfersDao  extends CrudRepository <Transfers, Integer>{

}
