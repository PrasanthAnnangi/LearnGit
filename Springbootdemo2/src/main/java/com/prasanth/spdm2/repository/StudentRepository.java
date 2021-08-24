package com.prasanth.spdm2.repository;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prasanth.spdm2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstName(String fname);
	//jpql
	@Query("select s from Student s where s.emailId = ?1")
	public List<Student> getbyEmailAddress(String emailAddress);
	
	//native
	@Query(value="select * from tbl_student s where s.email_address = ?1",
			nativeQuery=true)
	public List<Student> getbyEmailAddressnative(String emailAddress);
	
	//native with named param
		@Query(value="select * from tbl_student s where s.email_address = :emailId",
				nativeQuery=true)
		public List<Student> getbyEmailAddressnativenamedparam(@Param("emailId") String emailAddress);
		
		@Modifying
		@Transactional
		@Query(value="update tbl_student s  set s.Last_Name=:LastName where s.email_address = :emailId",
				nativeQuery=true)
		public int updatebyEmailAddressnativenamedparam(@Param("emailId") String emailAddress,@Param("LastName") String Lastname);

}
