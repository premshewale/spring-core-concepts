package com.demo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Employee;
import com.demo.config.SpringJdbcConfig;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeService {

	EmployeeDao empDAO;
	public EmployeeService(){
		ApplicationContext aplctx = new AnnotationConfigApplicationContext(SpringJdbcConfig.class) ;
		System.out.println("Context loaded...");
		empDAO= aplctx.getBean(EmployeeDaoImpl.class);
		
	}
	public int addEmp(Employee e1){
		System.out.println(e1);
		int i = empDAO.addEmployee(e1);
		return i;
	}
}
