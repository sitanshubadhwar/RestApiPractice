package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface EmployeeService {
	Student getEmployeeById(long id);
	List<Student> getAllEmployees();
}
