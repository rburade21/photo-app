package com.photo.app.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photo.app.service.UserService;
import com.photo.app.shared.dto.UserDto;
import com.photo.app.ui.request.model.UserDetailsRequestModel;
import com.photo.app.ui.response.model.UserRest;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping()
	public String getUser() {
		return "getUser called";
	}

	@PostMapping()
	public UserRest createtUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createUser, returnValue);
		return returnValue;
	}

	@PutMapping()
	public String updateUser() {
		return "updateUser called";
	}

	@DeleteMapping()
	public String deleteUser() {
		return "deleteUser called";
	}

}
