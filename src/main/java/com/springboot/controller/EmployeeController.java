package com.springboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value= "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() 
    {
		return employeeService.getEmployees();
    }
	
	@RequestMapping(value="/employee/", method = RequestMethod.POST)
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return ResponseEntity.ok("Employee created.");
	}
	
	@RequestMapping(value="/employee/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return ResponseEntity.ok("employee updated.");
	}

}
