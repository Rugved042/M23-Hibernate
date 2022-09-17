package com.cg.service;

import com.cg.entities.User;

public interface UserService 
{
	User addUser(User user);
	User updateUser(User user);
	User searchUser(int user_id);
	User deleteUser(int user_id);
}
