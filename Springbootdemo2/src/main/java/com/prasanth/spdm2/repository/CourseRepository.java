package com.prasanth.spdm2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasanth.spdm2.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	Page<Course> findByTitleContaining(String title, Pageable pageable);
}
