package com.igate.tradingsimulator.dao;

import java.util.List;

import com.igate.tradingsimulator.domain.User;

public interface UserDAO {
	public List<User> getAllUsers();
	public User getUserByUserName(String userName);
	public User createUser(User user);
	public User updateUser(User user);
	public boolean deleteUser(User user);
}
