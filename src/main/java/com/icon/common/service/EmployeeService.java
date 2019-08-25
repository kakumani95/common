package com.icon.common.service;

import java.util.List;

import com.icon.common.model.Employee;

public interface EmployeeService {
  
	public List<Employee> getEmployees();

	public void saveEmployee(Employee employee);
}
