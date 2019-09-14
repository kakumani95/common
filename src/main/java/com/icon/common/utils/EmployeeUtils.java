package com.icon.common.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.icon.common.model.Employee;

@Component
public class EmployeeUtils {

	static Set<Employee> set = new HashSet<>();

	public  Set<Employee> getEmployees() {
		set.add(new Employee(1, "naveen", 15000, "hyd"));
		set.add(new Employee(2, "venkata naveen", 25000, "Blr"));
		set.add(new Employee(3, "naveen kakumani", 55000, "blr"));
		set.add(new Employee(4, "venkata", 16000, "hyd"));
		return set;
	}

	public  void addEmployee(Employee employee) {
		set.add(employee);
	}
}
