package com.cg.dao;

import com.cg.entities.Admin;

public interface AdminDao 
{
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin searchAdmin(int admin_id);
	Admin deleteAdmin(int admin_id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
