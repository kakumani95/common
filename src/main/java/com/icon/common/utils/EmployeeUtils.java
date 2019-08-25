package com.icon.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.icon.common.model.Employee;

@Component
public class EmployeeUtils {

	 List<Employee> list = new ArrayList<>();

	public  List<Employee> getEmployees() {
		list.add(new Employee(1, "naveen", 15000, "hyd"));
		list.add(new Employee(2, "venkata naveen", 25000, "Blr"));
		list.add(new Employee(3, "naveen kakumani", 55000, "blr"));
		list.add(new Employee(4, "venkata", 16000, "hyd"));
		return list;
	}

	public  void addEmployee(Employee employee) {
		list.add(employee);
	}
}
