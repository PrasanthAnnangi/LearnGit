package com.prasanth.spdm2.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prasanth.spdm2.entity.CourceMaterial;
import com.prasanth.spdm2.entity.Course;

@SpringBootTest
class CourseMaterialRepositoryTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	@Autowired
	private CourseMaterialRepository courceMaterialrepository;
	
	@Test
	public void SaveCourseMaterial() {
		CourceMaterial cm= CourceMaterial.builder()
				.url("www.google.com/firstCourse")
				.course(Course.builder().title("DSA").credit(6).build())
				.build();
		courceMaterialrepository.save(cm);
	}
	
	@Test
	public void getAllCourseMaterial() {
		List<CourceMaterial> lcm=courceMaterialrepository.findAll();
		System.out.println("Course Material "+lcm);
	}
}
