package com.cg.service;

import com.cg.entities.Admin;

public interface AdminService {
	
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin searchAdmin(int admin_id);
	Admin deleteAdmin(int admin_id);
	
}