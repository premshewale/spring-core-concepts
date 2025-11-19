package com.demo.bean;

public class Employee {
	private int empno;
	private String name;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
		System.out.println("Emp Setter call..");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	@Override
	public String toString() {
		if(salary!=0){
		return  "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
		}
		return "Employee [empno=" + empno + ", name=" + name + "]";
		}
	
	
	
}
