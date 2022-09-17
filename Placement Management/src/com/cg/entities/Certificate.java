package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Certificate")
public class Certificate {
	
	@Id
	@Column(name="Cert_Id")
	private int cert_id;
	
	//@Column(name="Year")
	private int cert_year;
	
	@OneToOne(mappedBy="certificate")//making connection with student
	private Student student;
	
	@ManyToOne(cascade=CascadeType.ALL)//making connection with college
	@JoinColumn(name="college_id")
	private College college;
	
	
	//getters and setters
	
	public int getYear() {
		return cert_year;
	}
	public int getCert_year() {
		return cert_year;
	}
	public void setCert_year(int cert_year) {
		this.cert_year = cert_year;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getCert_id() {
		return cert_id;
	}
	public void setCert_id(int cert_id) {
		this.cert_id = cert_id;
	}
	public void setYear(int cert_year) {
		this.cert_year = cert_year;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}