package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Context loaded...");
		
		Employee e1=(Employee)aplctx.getBean("emp1");
		System.out.println(e1+" "+e1.hashCode());
		e1.setEmpno(123);
		Employee e2=(Employee)aplctx.getBean("emp1");
		System.out.println(e2+" "+e2.hashCode());
		
		
	}

}
