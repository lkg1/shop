package com.lkg.service.impl;

import com.lkg.bean.User;
import com.lkg.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User returnUser(User user) {
		user.getMessage().add("done!");
		return user;
	}

}
