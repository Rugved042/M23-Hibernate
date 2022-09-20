package com.cg.entities;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College 
{
	@Id
	@Column(name="COLLEGE_ID")
	private Long college_id;
	
	@Column(name="COLLEGE_NAME")
	@JoinTable(name="User")
	private String college_name;
	
	@Column(name="College_Admin")
	private String college_admin;
	
	@Column(name="LOCATION")
	private String location;	
	
	@OneToOne(fetch = FetchType.LAZY)//making connection with user
	@JoinColumn(name="User_id")
	private  User user;
	
	/*@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)//making connection with user
	@JoinColumn(name="placement_id")
	private Placement placement;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)//making connection with user
	@JoinColumn(name="certificate_id")
	private  Certificate certificate;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)//making connection with user
	@JoinColumn(name="student_id")
	private Student student;*/

	//getters and setters method
	public User getUser() {
		return user;
	}

	
	/*public Placement getPlacement() {
		return placement;
	}


	public void setPlacement(Placement placement) {
		this.placement = placement;
	}


	public Certificate getCertificate() {
		return certificate;
	}


	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}*/


	public void setUser(User user) {
		this.user = user;
	}

	public Long getCollege_id() {
		return college_id;
	}

	public void setCollege_id(Long college_id) {
		this.college_id = college_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	

	public String getCollege_admin() {
		return college_admin;
	}

	public void setCollege_admin(String college_admin) {
		this.college_admin = college_admin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + ", college_admin="
				+ college_admin + ", location=" + location + ", user=" + user + "]";
	}


	/*@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + ", college_admin="
				+ college_admin + ", location=" + location + ", user=" + user + ",placement=" + placement
				+ ", certificate=" + certificate + ", student=" + student + "]";*/
}