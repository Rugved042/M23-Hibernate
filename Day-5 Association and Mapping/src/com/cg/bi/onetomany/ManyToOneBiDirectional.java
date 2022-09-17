package com.cg.bi.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToOneBiDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Department d=new Department();
		d.setId(12121);
		d.setDeptName("Finance");
		
		
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEname("Rugved");
		e.setSalary(35000f);
		
		
		Employee e1=new Employee();
		e1.setEmpId(102);
		e1.setEname("Akshay");
		e1.setSalary(65000.5f);
		
		
		
		
		e.setDept(d);
		e1.setDept(d);
		
		em.persist(e);
		em.persist(e1);
		
		System.out.println("Rows is inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();


	}

}