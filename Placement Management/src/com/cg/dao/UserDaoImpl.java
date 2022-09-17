package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;
import com.cg.entities.User;

public class UserDaoImpl implements UserDao 
{
	private EntityManager em;
	
	

	public UserDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public User addUser(User user) {
		em.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		em.merge(user);
		return user;
	}

	@Override
	public User searchUser(int user_id) {
		User user=em.find(User.class,user_id);
		return user;
	}

	@Override
	public User deleteUser(int user_id) {
		em.remove(user_id);
		return null;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();		
	}
	

}
