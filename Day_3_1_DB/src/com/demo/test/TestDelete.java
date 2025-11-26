package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.demo.bean.Employee;
import com.demo.config.SpringJdbcConfig;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class TestDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new AnnotationConfigApplicationContext(SpringJdbcConfig.class) ;
		
		System.out.println("Context loaded...");
		EmployeeDao emplDao= aplctx.getBean(EmployeeDaoImpl.class);
		Employee e1=aplctx.getBean(Employee.class);
		e1.setEmpno(115);
		int i=emplDao.deleteEmployee(e1);
		System.out.println(i+" record delete...");

}}
