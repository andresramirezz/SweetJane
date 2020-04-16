/**
 * @author Andres Ramirez
 * File: PastelCatalogoServiceImpl.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uvm.sweetjane.dao.PastelRepository;
import com.uvm.sweetjane.model.PastelCatalogo;

@Service
public class PastelCatalogoServiceImpl implements PastelCatalogoService{
	
	@Autowired
	private PastelRepository bikeRepository;
	
	public PastelCatalogo save ( PastelCatalogo bc ) {
		return bikeRepository.save(bc);
	}

	
	public List<PastelCatalogo> findAll() {
		return (List<PastelCatalogo>) bikeRepository.findAll();
	}

}
