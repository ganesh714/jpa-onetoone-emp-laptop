package com.software.emp_laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.emp_laptop.models.Employee;
import com.software.emp_laptop.models.Laptop;
import com.software.emp_laptop.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepository laptopRepository;
	@Autowired
	EmployeeService employeeService;

	public boolean addLaptop(Laptop laptop) {
		if (isLaptopPresent(laptop.getLap_id())) {
			return false;
		}
		laptopRepository.save(laptop);
		return true;
	}
	
	public List<Laptop> getAllLaptops(){
		return laptopRepository.findAll();
	}
	
	public Laptop getLaptopById(String id) {
		return laptopRepository.findById(id).orElse(null);
	}
	
	public Laptop updateLaptop(String id, Laptop laptop) {
		if (isLaptopPresent(id)) {
			Laptop existing = getLaptopById(id);
			existing.setLap_model(laptop.getLap_model());
			existing.setLap_name(laptop.getLap_name());
			existing.setLap_warranty(laptop.getLap_warranty());
			return laptopRepository.save(existing);
		}
		
		return null;
	}
	
	public String deleteLaptop(String id) {
	    if (isLaptopPresent(id)) {
	        laptopRepository.deleteById(id);
	        return "Laptop deleted successfully!";
	    }
	    return "Laptop not found!";
	}
	
	public Laptop assignLaptopToEmployee(String lap_id, String emp_id) { //assignLaptopToEmployee
		Laptop laptop= getLaptopById(lap_id);
		laptop.setEmployee(employeeService.getEmployeeById(emp_id));
		return laptopRepository.save(laptop);
	}
	
	public Laptop getLaptopByEmpId(String id) {
		return laptopRepository.getLaptopByEmpId(id);
	}
	
	public boolean isLaptopPresent(String id) {
		return laptopRepository.findById(id).isPresent();
	}
	
	
}
