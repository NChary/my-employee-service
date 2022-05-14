package com.employee.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
