package com.software.emp_laptop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.emp_laptop.models.Employee;
import com.software.emp_laptop.models.Laptop;
import com.software.emp_laptop.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepository laptopRepository;

	public boolean addLaptop(Laptop laptop) {
		if (isLaptopPresent(laptop)) {
			return false;
		}
		laptopRepository.save(laptop);
		return true;
	}
	
	public Laptop updateLaptop_EmpId(String lap_id, Employee emp_id) {
		Laptop laptop= laptopRepository.getReferenceById(lap_id);
		laptop.setEmp_id(emp_id);
		laptopRepository.save(laptop);
		return laptop;
	}
	
	public boolean isLaptopPresent(Laptop laptop) {
		return laptopRepository.findById(laptop.getLap_id()).isPresent();
	}
}
