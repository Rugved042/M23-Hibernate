package com.cg.service;


import com.cg.dao.UserDao;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.User;

public class UserServiceImpl implements UserService
{
	private UserDao dao;
	
	

	public UserServiceImpl() {
		super();
		dao = new UserDaoImpl();
	}	
	
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User searchUser(int user_id) {
		User user=dao.searchUser(user_id);
		return user;
	}

	@Override
	public User deleteUser(int user_id) {
		User user=dao.deleteUser(user_id);
		return user;
	}

}
