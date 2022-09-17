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
	public static void main(String[] args) {
		
		
		Student student=new Student();
		StudentService service=new StudentServiceImpl();
		
		User user=new User();
		UserService uservice=new UserServiceImpl();
		
		Admin admin=new Admin();
		AdminService aservice=new AdminServiceImpl();
		
		Placement placement=new Placement();
		PlacementService pservice=new PlacementServiceImpl();
		
		College college=new College();
		CollegeService cservice=new CollegeServiceImpl();
		
		Certificate certificate=new Certificate();
		CertificateService cert_service=new CertificateServiceImpl();
		
		student.setId(12);
		student.setRoll(101);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2021);
		student.setHallTicketNo(10101);
		
		
		certificate.setCert_id(1235);
		certificate.setYear(2022);
		
		user.setUser_id(11);
		user.setUser_name("Rugved");
		user.setUser_password("Rnaik5656");
		user.setType("Student");
		
		admin.setAdmin_id(011);
		admin.setAdmin_name("Rugved");
		admin.setAdmin_password("rnaik5657");
		
		placement.setPlace_id(125);
		placement.setPlace_name("Rugved");
		LocalDate date=LocalDate.now();
		placement.setDate(date);
		placement.setQualification("Undergraduate");
		placement.setPlace_year(2022);
		
		college.setCollege_id(1252022L);
		college.setCollege_admin("XYZ");
		college.setCollege_name("NCER");
		college.setLocation("Pune ");
		
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
		
		//
		
		//adding a data
		service.addStudent(student);
		aservice.addAdmin(admin);
		pservice.addPlacement(placement);
		uservice.addUser(user);
		cservice.addCollege(college);
		cert_service.addCertificate(certificate);
		
		//Retrieving a data
		/*service.searchStudentById(12);
		System.out.println("Id is: "+student.getId());
		System.out.println("Id is: "+student.getCourse());*/

		
		
		
		

		
		



	}

}