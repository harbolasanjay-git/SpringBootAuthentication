package com.stech.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.stech.demo.model.UserPrincipal;
import com.stech.demo.model.Users;
import com.stech.demo.repo.UserRepo;

@Service
public class MyUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByUserName(username);
		if(user==null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("User Not Found");
		}
		return new UserPrincipal(user);
	}

}
