package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	public Employee getEmployee(Long id);
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
}
 