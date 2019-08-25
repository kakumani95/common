package com.icon.common.model;

public class Employee {

	private int id;
	private String name;
	private int sal;
	private String location;

	public Employee(int id, String name, int sal, String location) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
