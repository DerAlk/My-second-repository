package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.RoomsDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.Reservations;
import com.hayaservices.entities.Rooms;

@Service
public class RoomService {

	@Autowired
	private RoomsDao dao;
	
	public Iterable<Rooms> getRooms() {
	return dao.findAll();
	}
	public Rooms  getRoomsById (int Id) {
	return dao. findById(Id).orElse( null);
	}
	public String deleteRooms(int Id) {
	dao.deleteById(Id);
	return "Room removed" +Id ;
	}
	
	 public Rooms updateRooms(Rooms rooms) {
    Rooms existingRooms = dao. findById(rooms.getRoomId()).orElse( new Rooms());
	existingRooms.setRoomName(rooms.getRoomName());
	existingRooms.setCapacity(rooms.getCapacity());
	existingRooms.setCode(rooms.getCode());
	return dao.save(existingRooms);
	
		}
	 
}
