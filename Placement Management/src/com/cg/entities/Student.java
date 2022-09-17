package com.cg.entities;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	
	
	@Id
	
	private int id;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private int hallTicketNo;
	
	@OneToOne(cascade=CascadeType.ALL)//making connection with certificate
	@JoinColumn(name="Cert_Id")
	private  Certificate certificate;
	
	@ManyToOne(cascade=CascadeType.ALL)//making connection with college
	@JoinColumn(name="college_id")
	private College college;
	
	//setters and getters method for all the variable which are private

	public int getId() {
		return id;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	
	
	
	
	

}