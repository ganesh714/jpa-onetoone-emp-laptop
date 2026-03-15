package com.software.emp_laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.software.emp_laptop.models.Employee;
import com.software.emp_laptop.models.Laptop;
import com.software.emp_laptop.service.LaptopService;

@CrossOrigin("*")
@RestController
public class LaptopController {
	
	@Autowired
	LaptopService laptopService;
	
	@PostMapping("laptop")
	public boolean addLaptop(@RequestBody Laptop laptop) {
		return laptopService.addLaptop(laptop);
	}
	
	@PutMapping("/laptop/{lap_id}/employee")
	public Laptop updateLaptop_EmpId(@PathVariable String lap_id,@RequestBody Employee emp_id) {
		return laptopService.updateLaptop_EmpId(lap_id, emp_id);
	}
}
