package com.cg.service;

import com.cg.dao.AdminDao;

import com.cg.dao.AdminDaoImpl;
import com.cg.entities.Admin;

public class AdminServiceImpl implements AdminService
{
	
	private AdminDao dao;
	
	

	public AdminServiceImpl() {
		super();
		dao = new AdminDaoImpl();
	}	

	@Override
	public Admin addAdmin(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();
		return admin;
	}

	@Override
	public Admin searchAdmin(int admin_id) {
		Admin admin=dao.searchAdmin(admin_id);
		return admin;
	}

	@Override
	public Admin deleteAdmin(int admin_id) {
		Admin admin=dao.deleteAdmin(admin_id);
		return admin;
	}
	

}
