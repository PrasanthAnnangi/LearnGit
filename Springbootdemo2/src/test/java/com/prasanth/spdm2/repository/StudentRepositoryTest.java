package com.prasanth.spdm2.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prasanth.spdm2.entity.Gaurdian;
import com.prasanth.spdm2.entity.Student;

@SpringBootTest
class StudentRepositoryTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	
	@Autowired
	private StudentRepository studentrepository;
	
	@Test
	public void saveStudent() {
		Student student=Student.builder()
				.emailId("prasanthnnangi@gmail.com")
				.firstName("prasanth")
				.lastName("Amnnangi")
				.gaurdian(new Gaurdian("prasadarao","pr.annangi@fmail.com","9885453110"))
				.build();
		studentrepository.save(student);
	}

	@Test
	public void listOfAllstudents() {
		List<Student> lts= studentrepository.findAll();
		System.out.println(lts);
	}
	@Test
	public void listOfAllstudentsbyFirstName() {
		List<Student> lts=studentrepository.findByFirstName("prasanth");
		System.out.println(lts);
	}
	
	@Test
	public void listOfAllstudentsbyEmailAddress() {
		List<Student> lts=studentrepository.getbyEmailAddress("prasanthnnangi@gmail.com");
		System.out.println(lts);
	}
	@Test
	public void listOfAllstudentsbyEmailAddressNative() {
		List<Student> lts=studentrepository.getbyEmailAddressnative("prasanthnnangi@gmail.com");
		System.out.println(lts);
	}
	@Test
	public void listOfAllstudentsbyEmailAddressNativenamedparam() {
		List<Student> lts=studentrepository.getbyEmailAddressnativenamedparam("prasanthnnangi@gmail.com");
		System.out.println(lts);
	}
	@Test
	public void updatesbyEmailAddressNativenamedparam() {
		int lts=studentrepository.updatebyEmailAddressnativenamedparam("prasanthnnangi@gmail.com","Annagi");
		System.out.println("update by emailid" +lts);
	}
}
