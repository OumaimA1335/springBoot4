package com.produits.oumaima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.produits.oumaima.entities.MyUserDetails;
import com.produits.oumaima.entities.User;
import com.produits.oumaima.repos.UserRepository;

@Service

public class MyUserDetailsService  implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userRepository.findByUsername(username);
	return new MyUserDetails(user);
	 }

}
