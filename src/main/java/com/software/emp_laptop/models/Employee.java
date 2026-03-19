package com.software.emp_laptop.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String emp_id;
	private String emp_name;
	private int emp_salary;
	private LocalDate emp_joing_date;
	
	
	public Employee() {}


	public Employee(String emp_id, String emp_name, int emp_salary, LocalDate emp_joing_date) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_joing_date = emp_joing_date;
	}


	public String getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}


	public LocalDate getEmp_joing_date() {
		return emp_joing_date;
	}


	public void setEmp_joing_date(LocalDate emp_joing_date) {
		this.emp_joing_date = emp_joing_date;
	}

	
}
