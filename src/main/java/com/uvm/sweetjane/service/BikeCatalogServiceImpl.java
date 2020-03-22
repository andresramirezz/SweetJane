/**
 * @author Andres Ramirez
 * File: BikeCatalogServiceImpl.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uvm.sweetjane.dao.BikeRepository;
import com.uvm.sweetjane.model.BikeCatalog;

@Service
public class BikeCatalogServiceImpl implements BikeCatalogService{
	
	@Autowired
	private BikeRepository bikeRepository;
	
	public BikeCatalog save ( BikeCatalog bc ) {
		return bikeRepository.save(bc);
	}

	
	public List<BikeCatalog> findAll() {
		return (List<BikeCatalog>) bikeRepository.findAll();
	}

}
