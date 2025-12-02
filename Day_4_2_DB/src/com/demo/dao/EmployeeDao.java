package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;


public interface EmployeeDao {
	
	int addEmployee(Employee e);
	
	int deleteEmployee(Employee e);
	int updateEmployee(Employee e);
	
	String getEmployee(int id);
	
	List<Employee> getAllEmployee();
}
