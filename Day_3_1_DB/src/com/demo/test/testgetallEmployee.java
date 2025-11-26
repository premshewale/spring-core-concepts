package com.demo.test;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.demo.bean.Employee;
import com.demo.config.SpringJdbcConfig;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class testgetallEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new AnnotationConfigApplicationContext(SpringJdbcConfig.class) ;
		
		System.out.println("Context loaded...");
		EmployeeDao emplDao= aplctx.getBean(EmployeeDaoImpl.class);
		
		List<Employee> list =emplDao.getAllEmployee();
		for(Employee e:list)
			System.out.println(e);
	

}}
