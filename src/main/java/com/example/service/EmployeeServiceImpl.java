package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository; 

	@Override
	public Student getEmployeeById(long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public List<Student> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
