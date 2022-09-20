package com.cg.entities;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin 
{
	@Id
	@Column(name = "Admin_id")
	private int admin_id;
	
	@Column(name = "Admin_name")
	private String admin_name;
	
	@Column(name = "Admin_password")
	private String Admin_password;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="User_id")
	private User user; // making connection between user and admin

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="college_id")
	private College college; // making connection between user and college
	
	//getters and setters method
	public int getAdmin_id() {
		return admin_id;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return Admin_password;
	}

	public void setAdmin_password(String admin_password) {
		Admin_password = admin_password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	

}