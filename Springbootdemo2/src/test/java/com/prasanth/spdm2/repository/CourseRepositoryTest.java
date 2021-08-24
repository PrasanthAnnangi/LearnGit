package com.prasanth.spdm2.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.prasanth.spdm2.entity.Course;
import com.prasanth.spdm2.entity.Student;
import com.prasanth.spdm2.entity.Teacher;

@SpringBootTest
class CourseRepositoryTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */

	@Autowired
	private CourseRepository courserepository;
	
	@Test
	public void getAllCourses() {
		List<Course> ls=courserepository.findAll();
		System.out.println("Courses "+ls);
	}
	
	@Test
	public void saveCourseWithTeacher() {
		Course cs=Course.builder()
				.title("python")
				.credit(6)
				.teacher( Teacher.builder().firstName("tobirama")
						.lastName("senju").build()).build();
		courserepository.save(cs);
	}
	 
	@Test
	public void findByCoursetitle() {
		Pageable page= PageRequest.of(0, 10);
		List<Course> courses= courserepository.findByTitleContaining("D", page).getContent();
		System.out.println(courses);
	}
	
	@Test
	public void savecoursewithStudentAndTeacher() {
		Teacher teacher = Teacher.builder()
				.firstName("Minato1")
				.lastName("Namikaze1")
				.build();
		Student stu1 = Student.builder()
				.firstName("Naruto1")
				.lastName("Uzumaki1")
				.emailId("uzumaki.Naruto1@gmail.com")
				.build();
		Course cs=Course.builder()
				.title("Flash1")
				.credit(10)
				.teacher(teacher)
				.students(List.of(stu1))
				.build();
		courserepository.save(cs);
	}
}
