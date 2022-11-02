package com.hayaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hayaservices.dao.ApartmentsDao;
import com.hayaservices.dao.ImagesDao;
import com.hayaservices.entities.Apartments;
import com.hayaservices.entities.reservations;
import com.hayaservices.entities.Images;

@Service
public class ImageService {
	@Autowired
	private ImagesDao dao;
	
	public Iterable<Images> getApartments() {
	return dao.findAll();
	}
	Images  getImagesById (int Id) {
	return dao. findById(Id).orElse(null);
	}
	String deleteImages (int Id) {
	dao.deleteById(Id);
	return "Image deleted" +Id ;
	}
	
	    public Images updateImages(Images images) {
	    Images existingImages = dao. findById(images.getImageId()).orElse(new Images());
		existingImages.setImageDesc(images.getImageDesc());
		return dao.save(existingImages);
		
}
}
