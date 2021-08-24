package com.prasanth.spdm2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Teacher {

	@Id
	@SequenceGenerator(name = "teacher_Sequence",
						sequenceName = "teacher_Sequence",
						allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "teacher_Sequence")
	private Long teacherId;
	private String firstName;
	private String lastName;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "teacher_Id", referencedColumnName = "teacherId") private
	 * List<Course> courses;
	 */
}
