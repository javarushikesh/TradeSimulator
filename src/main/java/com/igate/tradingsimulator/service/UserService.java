package com.igate.tradingsimulator.service;

import java.util.List;

import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.vo.Result;

public interface UserService {
	
	List<User> findAllUsers();
	Result addUser(User user);
	User updateUser(User user);
	Boolean deleteUser(User user);
}
