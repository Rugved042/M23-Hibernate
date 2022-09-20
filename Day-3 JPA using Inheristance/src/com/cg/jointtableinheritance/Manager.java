package com.cg.jointtableinheritance;

//import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Manager2") /*it is for giving table name in
in this case entity class is manager but table name in SQL is Manager2*/
//@DiscriminatorValue("MNG")
public class Manager extends Employee
{
	private static final long serialVersionUID = 1L;
	private String deptname;
	
	//getters and setters method
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

}
