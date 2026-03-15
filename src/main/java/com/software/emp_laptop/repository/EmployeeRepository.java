package com.software.emp_laptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.software.emp_laptop.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
}
