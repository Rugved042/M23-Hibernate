package com.cg.jointtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee
		Employee e = new Employee();
		e.setName("Rugved");
		e.setSalary(35000);
		em.persist(e);
		
		//create an employee 1
		Employee e1  = new Employee();
		e1.setName("Akshay");
		e1.setSalary(40000);
		em.persist(e1);
		
		//create a manager
		Manager m = new Manager();
		m.setName("Guru");
		m.setSalary(60000);
		m.setDeptname("Information Technology");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("data in inserted");
		em.close();
		factory.close();
	}

}
