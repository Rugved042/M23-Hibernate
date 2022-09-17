package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Student")
public class Student implements Serializable 
{
	@SuppressWarnings("unused")
	private static final long serialVerionUID = 1L;
	
	@Id
	private int rollno;
	private String name;
	
	//Getters and setters methods are generated 
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
