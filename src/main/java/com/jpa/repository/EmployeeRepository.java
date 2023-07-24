package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
