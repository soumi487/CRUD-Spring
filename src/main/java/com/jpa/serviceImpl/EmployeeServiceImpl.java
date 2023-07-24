package com.jpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeRepository;
import com.jpa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee) ;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getAnEmployee(int id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee e=employeeRepository.findById(id).get();
		e.setName(employee.getName());
		e.setEmail(employee.getEmail());
		return employeeRepository.save(e);
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "The employee with "+id+" has been deleted";
	}

}
