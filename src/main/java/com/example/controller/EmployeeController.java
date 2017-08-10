package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Student> getEmployees() {
		return employeeService.getAllEmployees();
	}

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Student getEmployee(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}
}


