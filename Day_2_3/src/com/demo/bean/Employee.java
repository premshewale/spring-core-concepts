package com.demo.bean;


import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {
	private int empno;
	private String name;
	//@Autowired
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
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	public Employee() {
		super();
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
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
