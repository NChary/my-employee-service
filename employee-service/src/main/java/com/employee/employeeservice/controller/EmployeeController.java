package com.employee.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservice.model.Employee;
import com.employee.employeeservice.service.IEmployee;


//REST - Representational state transfer
@RestController // RESTful service
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	IEmployee iemployee;

	@GetMapping("/greet")
	public String abc() {
		return "Good Night";
	}

	@GetMapping("/greet1")
	public String greet() {
		return "Good Morning !!!";
	}


	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		return iemployee.saveEmp(employee);
	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return iemployee.fetchAllEmployees();
	}

	@PutMapping("/employee")
	public String updateEmployeeDetails(@RequestBody Employee employee) {
		return iemployee.updateEmployee(employee);
	}
	
	@DeleteMapping("/employee")
	public String deleteEmployeeDetails(@RequestBody Employee employee) {
		return iemployee.deleteEmployee(employee);
	}
}
