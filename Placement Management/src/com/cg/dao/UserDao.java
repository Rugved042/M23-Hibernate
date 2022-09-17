package com.cg.dao;

import com.cg.entities.User;

public interface UserDao 
{
	User addUser(User user);
	User updateUser(User user);
	User searchUser(int user_id);
	User deleteUser(int user_id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
