package com.hayaservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Transfers;
@CrossOrigin ("http://localhost:4200")
@Repository
public interface TransfersDao  extends CrudRepository <Transfers, Integer>{

}
