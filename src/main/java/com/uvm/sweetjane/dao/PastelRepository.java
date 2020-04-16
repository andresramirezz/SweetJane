/**
 * @author Andres Ramirez
 * File: PastelRepository.java
 * Date 02/29/2020
 * 
 */


package com.uvm.sweetjane.dao;

import org.springframework.data.repository.CrudRepository;

import com.uvm.sweetjane.model.PastelCatalogo;

public interface PastelRepository extends CrudRepository<PastelCatalogo, Long>{

}
