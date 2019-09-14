package com.icon.common.service;

import java.util.Set;

import com.icon.common.model.Employee;

public interface EmployeeService {
  
	public Set<Employee> getEmployees();

	public void saveEmployee(Employee employee);
}
