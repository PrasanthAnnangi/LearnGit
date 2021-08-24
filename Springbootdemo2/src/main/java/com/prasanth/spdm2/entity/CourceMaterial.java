package com.prasanth.spdm2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
@Entity
@Table(name="Course_Material")
public class CourceMaterial {
	@Id
	@SequenceGenerator(
			name="Course_Material_sequence",
			sequenceName = "Course_Material_sequence",
			allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "Course_Material_sequence")
private Long courceMaterialID;
private String url;

@OneToOne(cascade = CascadeType.ALL,
		fetch=FetchType.LAZY
		)
@JoinColumn(
		name="course_id",
		referencedColumnName = "courseId")
private Course course;
}
