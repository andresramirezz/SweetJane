/**
 * 
 */
package com.uvm.sweetjane.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.uvm.sweetjane.model.User;

/**
 * @author Andres Ramirez
 *
 */
public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUsername(String username);
}
