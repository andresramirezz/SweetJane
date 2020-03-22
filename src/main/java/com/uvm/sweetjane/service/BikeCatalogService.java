/**
 * @author Andres Ramirez
 * File: BikeCatalogService.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.service;

import java.util.List;

import com.uvm.sweetjane.model.BikeCatalog;

public interface BikeCatalogService {

	BikeCatalog save ( BikeCatalog bc);
	
	List<BikeCatalog> findAll();
	
}
