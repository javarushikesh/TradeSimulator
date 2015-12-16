package com.igate.tradingsimulator.service.impl;

import static com.igate.tradingsimulator.util.AppConstants.failure;
import static com.igate.tradingsimulator.util.AppConstants.success;

import java.util.List;

import com.igate.tradingsimulator.dao.UserDAO;
import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.service.BaseService;
import com.igate.tradingsimulator.service.UserService;
import com.igate.tradingsimulator.vo.Result;

public class UserServiceImpl extends BaseService implements UserService {
	
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> findAllUsers() {
		return getUserDAO().getAllUsers();
	}

	@Override
	public Result addUser(User user) {
		Result result = new Result();
		User existingUser = getUserDAO().getUserByUserName(user.getUsername());
		if(user.getUsername().equals(existingUser.getUsername())){
			result.setStatus(failure);
			result.setMessage(getMessageSource().getMessage("userName.exists", new Object[]{user.getUsername()}, null));
		}else { 
			User dbUser = getUserDAO().createUser(user);
			if(dbUser != null && dbUser.getId() > 0){
				result.setStatus(success);
				result.setMessage(getMessageSource().getMessage("registration.success", new Object[]{user.getUsername()}, null));
			}
		}
		return result;
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public Boolean deleteUser(User user) {
		return true;
	}
}
