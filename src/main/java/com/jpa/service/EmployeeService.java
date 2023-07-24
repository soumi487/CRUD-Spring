package com.jpa.service;

import java.util.List;

import com.jpa.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List <Employee> getAllEmployee();
	Employee getAnEmployee(int id);
	Employee updateEmployee(int id,Employee employee);
	String deleteEmployee(int id);

}
