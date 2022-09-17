package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao 
{
	//abstract method by default
	public abstract Student addStudent(Student student);
	public abstract Student updateStudent(Student student);
	public abstract boolean deleteStudent(int id);
	public abstract Student searchStudentById(int id);
	public abstract Student searchStudentByHallTicketNo(int hallTicketNo);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}