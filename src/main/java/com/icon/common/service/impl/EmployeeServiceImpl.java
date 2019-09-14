package com.icon.common.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icon.common.model.Employee;
import com.icon.common.service.EmployeeService;
import com.icon.common.utils.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeUtils employeeUtils;
	
	@Override
	public Set<Employee> getEmployees() {
		return employeeUtils.getEmployees();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeUtils.addEmployee(employee);
	}

}
