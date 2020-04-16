/**
 * @author Andres Ramirez
 * File: PastelCatalogoService.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.service;

import java.util.List;

import com.uvm.sweetjane.model.PastelCatalogo;

public interface PastelCatalogoService {

	PastelCatalogo save ( PastelCatalogo bc);
	
	List<PastelCatalogo> findAll();
	
}
