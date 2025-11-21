package com.demo.bean;

public class Employee {
	private int empno;
	private String name;
	Address location;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public Employee(int empno, String name, Address location) {
		super();
		this.empno = empno;
		this.name = name;
		this.location = location;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
