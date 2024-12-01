package com.stech.demo.model;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//In term on Spring UserPrinciple means the user is currently trying to login

public class UserPrincipal implements UserDetails {

	private Users user;
	
	public UserPrincipal(Users user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		return "{noop}"+user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}

}
