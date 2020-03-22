/**
 * @author Andres Ramirez
 * File: BikeRepository.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.dao;

import org.springframework.data.repository.CrudRepository;

import com.uvm.sweetjane.model.BikeCatalog;

public interface BikeRepository extends CrudRepository<BikeCatalog, Long>{

}
