package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;

public class AdminDaoImpl implements AdminDao
{

	private EntityManager em;
	
	
	
	public AdminDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		em.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		em.merge(admin);
		return admin;
	}

	@Override
	public Admin searchAdmin(int admin_id) {
		Admin admin=em.find(Admin.class,admin_id);
		return admin;
	}

	@Override
	public Admin deleteAdmin(int admin_id) {
		em.remove(admin_id);
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
