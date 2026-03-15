package com.software.emp_laptop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.emp_laptop.models.Employee;
import com.software.emp_laptop.models.Laptop;
import com.software.emp_laptop.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public boolean addEmployee(Employee employee) {
		if (isEmployeePresent(employee)) {
			return false;
		}
		employeeRepository.save(employee);
		return true;
	}
	
	public Employee updateEmployee_LapId(String emp_id, Laptop lap_id) {
		Employee employee= employeeRepository.getReferenceById(emp_id);
		employee.setLid(lap_id);
		employeeRepository.save(employee);
		return employee;
	}
	
	public boolean isEmployeePresent(Employee employee) {
		return employeeRepository.findById(employee.getEmp_id()).isPresent();
	}
}
