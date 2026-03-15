package com.software.emp_laptop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private String emp_id;
	private String emp_name;
	private int emp_salary;
	@OneToOne
	private Laptop lid;
	
	public Employee() {}

	public Employee(String emp_id, String emp_name, int emp_salary, Laptop lid) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.lid= lid;
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

	public Laptop getLid() {
		return lid;
	}

	public void setLid(Laptop lid) {
		this.lid= lid;
	}
	
	

}
