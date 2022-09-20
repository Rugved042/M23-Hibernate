package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.AdminService;
import com.cg.service.AdminServiceImpl;
import com.cg.service.CertificateService;
import com.cg.service.CertificateServiceImpl;
import com.cg.service.CollegeService;
import com.cg.service.CollegeServiceImpl;
import com.cg.service.PlacementService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;
import com.cg.service.UserService;
import com.cg.service.UserServiceImpl;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//creating object for Student entity class
		College college=new College();
		CollegeService cservice=new CollegeServiceImpl();				
		college.setCollege_id(1252022L);
		college.setCollege_admin("XYZ");
		college.setCollege_name("NCER");
		college.setLocation("Pune ");
		
		//creating object for Student entity class
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		student.setId(12);
		student.setRoll(101);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(10101);
		
		Student student1=new Student();
		StudentService service1=new StudentServiceImpl();
		student1.setId(13);
		student1.setRoll(102);
		student1.setQualification("BE");
		student1.setCourse("IT");
		student1.setYear(2021);
		student1.setHallTicketNo(10102);
		
		//creating object for Student entity class
		Certificate certificate=new Certificate();
		CertificateService cert_service=new CertificateServiceImpl();
		certificate.setCert_id(1235);
		certificate.setYear(2022);
		
		Certificate certificate1=new Certificate();
		CertificateService cert_service1 = new CertificateServiceImpl();
		certificate1.setCert_id(1235);
		certificate1.setYear(2022);
		
		//creating object for Student entity class
		User user=new User();
		UserService uservice=new UserServiceImpl();
		user.setUser_id(11);
		user.setUser_name("Rugved");
		user.setUser_password("Rnaik5656");
		user.setType("Student");
		
		//creating object for Student entity class
		Admin admin=new Admin();
		AdminService aservice=new AdminServiceImpl();
		admin.setAdmin_id(011);
		admin.setAdmin_name("Rugved");
		admin.setAdmin_password("rnaik5657");
		
		//creating object for Student entity class
		Placement placement=new Placement();
		PlacementService pservice=new PlacementServiceImpl();
		placement.setPlace_id(125);
		placement.setPlace_name("Rugved");
		LocalDate date=LocalDate.now();
		placement.setDate(date);
		placement.setQualification("Undergraduate");
		placement.setPlace_year(2022);
		
		Placement placement1 = new Placement();
		PlacementService pservice1 = new PlacementServiceImpl();
		placement1.setPlace_id(125);
		placement1.setPlace_name("Rugved");
		LocalDate date1=LocalDate.now();
		placement1.setDate(date1);
		placement1.setQualification("Undergraduate");
		placement1.setPlace_year(2022);
		
		System.out.println("Data is Added");
		
		//oneToOne bidirectional
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		//oneToOne bidirectional
		user.setAdmin(admin);
		admin.setUser(user);
		
		//oneToOne bidirectional
		college.setUser(user);
		user.setCollege(college);
		
		//OneToMany BiDirectional
		//college.setStudent(student);
		student.setCollege(college);
		//college.setStudent(student1);
		student1.setCollege(college);
		
		//OneToMany BiDirectional
		//college.setPlacement(placement);
		placement.setCollege(college);
		//college.setPlacement(placement1);
		placement1.setCollege(college);
		
		//OneToMany BiDirectional
		//college.setCertificate(certificate);
		certificate.setCollege(college);
		//college.setCertificate(certificate1);
		certificate1.setCollege(college);
		
		//adding a data
		service.addStudent(student);
		service1.addStudent(student1);
		aservice.addAdmin(admin);
		pservice.addPlacement(placement);
		pservice1.addPlacement(placement1);
		uservice.addUser(user);
		cservice.addCollege(college);
		cert_service.addCertificate(certificate);
		cert_service1.addCertificate(certificate1);
		
		//Retrieving a data
		/*service.searchStudentById(12);
		System.out.println("Id is: "+student.getId());
		System.out.println("Id is: "+student.getCourse());*/

		
		
		
		

		
		



	}

}