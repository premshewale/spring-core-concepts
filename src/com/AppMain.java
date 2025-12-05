package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		
		Employee e = (Employee) ctx.getBean("emp");
		
		Employee e1 = (Employee) ctx.getBean("emp1");

		 System.out.println(e);
		 System.out.println(e1);


	}

}
