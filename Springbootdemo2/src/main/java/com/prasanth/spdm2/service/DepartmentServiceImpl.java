package com.prasanth.spdm2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasanth.spdm2.entity.Department;
import com.prasanth.spdm2.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentrepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentrepository.save(department);
	}

}
