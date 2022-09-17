package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		StudentService service = new StudentServiceImpl();
		
		Student s = new Student();
		
		//create Operation
		s.setRollno(123);
		s.setName("Rugved");
		service.addStudent(s);
		
		//create Operation
		/*s.setRollno(124);
		s.setName("Guru");
		service.addStudent(s);*/
		
		//Retreive data
		/*s = service.getStudentById(123);
		System.out.println("Student ROll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		//Update data
		/*s = service.getStudentById(123);
		s.setName("Akshay");
		service.updateStudent(s);*/
		
		//Delete data 
		s = service.getStudentById(123);
		service.deleteStudent(s);
		System.out.println("Data is deleted");

	}

}
