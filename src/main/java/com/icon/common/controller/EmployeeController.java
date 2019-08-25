package com.icon.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icon.common.model.Employee;
import com.icon.common.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping("/employee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		try {
			employeeService.saveEmployee(employee);
		} catch (Exception e) {
			return new ResponseEntity<String>("Internal server error ... !", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Eployee is Added", HttpStatus.OK);
	}
}
