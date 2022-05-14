package com.employee.employeeservice.service;

import java.util.List;

import com.employee.employeeservice.model.Employee;

public interface IEmployee {

	String saveEmp(Employee employee);
	
	List<Employee> fetchAllEmployees();
	
	String updateEmployee(Employee employee);

	String deleteEmployee(Employee employee);
}
