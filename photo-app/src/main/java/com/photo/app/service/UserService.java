package com.photo.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.photo.app.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	public UserDto createUser(UserDto userDto);

}
