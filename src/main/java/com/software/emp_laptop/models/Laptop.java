package com.software.emp_laptop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private String lap_id;
	private String lap_name;
	private String lap_model;
	private String lap_warranty;
	@OneToOne
	private Employee emp_id;
	
	public Laptop() {}
	
	public Laptop(String lap_id, String lap_name, String lap_model, String lap_warranty, Employee emp_id) {
		super();
		this.lap_id = lap_id;
		this.lap_name = lap_name;
		this.lap_model = lap_model;
		this.lap_warranty = lap_warranty;
		this.emp_id = emp_id;
	}

	public String getLap_id() {
		return lap_id;
	}

	public void setLap_id(String lap_id) {
		this.lap_id = lap_id;
	}

	public String getLap_name() {
		return lap_name;
	}

	public void setLap_name(String lap_name) {
		this.lap_name = lap_name;
	}

	public String getLap_model() {
		return lap_model;
	}

	public void setLap_model(String lap_model) {
		this.lap_model = lap_model;
	}

	public String getLap_warranty() {
		return lap_warranty;
	}

	public void setLap_warranty(String lap_warranty) {
		this.lap_warranty = lap_warranty;
	}

	public Employee getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Employee emp_id) {
		this.emp_id = emp_id;
	}
	
	
	
}
