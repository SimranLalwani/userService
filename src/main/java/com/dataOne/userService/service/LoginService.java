package com.dataOne.userService.service;

import com.dataOne.userService.entity.User;

public interface LoginService {

	public User doLogin(String email, String password);
	
}
