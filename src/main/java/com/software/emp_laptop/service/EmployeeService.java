package com.software.emp_laptop.service;

import java.util.List;

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
		if (isEmployeePresent(employee.getEmp_id())) {
			return false;
		}
		employeeRepository.save(employee);
		return true;
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public Employee updateEmployee(String id, Employee employee) {
		if (isEmployeePresent(id)) {
	        Employee existing = getEmployeeById(id);
	        
	        if (employee.getEmp_name() != null) {
	            existing.setEmp_name(employee.getEmp_name());
	        }
	        if (employee.getEmp_salary() != 0) { 
	            existing.setEmp_salary(employee.getEmp_salary());
	        }
	        if (employee.getEmp_joing_date() != null) {
	            existing.setEmp_joing_date(employee.getEmp_joing_date());
	        }
	        
	        return employeeRepository.save(existing);
	    }
		return null;
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
	
	public boolean isEmployeePresent(String id) {
		return employeeRepository.findById(id).isPresent();
	}
}
