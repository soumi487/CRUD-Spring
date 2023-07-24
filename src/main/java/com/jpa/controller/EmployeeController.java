package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/emp")
	public Employee createNewEmployee(@RequestBody Employee e)
	{
		return employeeService.saveEmployee(e);
	}
	
	@GetMapping("/emp")
	public List<Employee> returnAll()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/emp/{id}")
	public Employee returnAnEmployee(@PathVariable int id)
	{
		return employeeService.getAnEmployee(id);
	}
	
	@PutMapping("/emp/{id}")
	public Employee retunUpdatedEmployee(@PathVariable int id,@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/emp/{id}")
	public String returnDeletedEmployee(@PathVariable int id)
	{
		return employeeService.deleteEmployee(id);
	}
}
