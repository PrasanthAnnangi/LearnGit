package com.prasanth.spdm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prasanth.spdm2.entity.Department;
import com.prasanth.spdm2.service.DepartmentService;

public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	@RequestMapping("/departments")
	public Department saveDepartment(@RequestBody Department dep) {
		
		return departmentservice.saveDepartment(dep);
		
	}

}
