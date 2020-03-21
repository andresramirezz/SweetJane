/**
 * 
 */
package com.uvm.sweetjane.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.uvm.sweetjane.dao.UserRepository;
import com.uvm.sweetjane.model.Authority;

/**
 * @author Andres Ramirez
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    UserRepository userRepository;
	
    @Override
     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
     // Search for the user with the repository and if it does not exist, launch an exception
    	com.uvm.sweetjane.model.User appUser = 
                 userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("There is no user"));
		
    // Map our Authority list with the spring security list
    List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
    for (Authority authority: appUser.getAuthority()) {
        
    	// ROLE_USER, ROLE_ADMIN
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
    }
		
    // Create The UserDetails object that will be in session and return it.
    UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantList);
         return user;
    }

}
