package com.employee.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeservice.model.Employee;
import com.employee.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployee{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmp(Employee employee) {
		employeeRepository.save(employee);
		return "Employe saved successfully";
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee updated successfully";
	}

	@Override
	public String deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
		return "Employee deleted successfully";
	}
}
