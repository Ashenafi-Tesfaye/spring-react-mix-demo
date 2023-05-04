package com.AGrespapi.AGrespapidemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.AGrespapi.AGrespapidemo.model.User;
import com.AGrespapi.AGrespapidemo.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository repository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		System.out.println("testing hello world. This is for test.");
		User currentUser = repository.findByUsername(username);
		 UserDetails user = new org.springframework.security.core.userdetails.User(username, currentUser.getPassword(),
				 true,true,true,true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
		 return user;
	}
	
}
