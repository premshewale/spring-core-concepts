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
		System.out.println(e1);
		
		Employee e2=(Employee)aplctx.getBean("emp2");
		System.out.println(e2);
		
		Employee e3=(Employee)aplctx.getBean("emp3");
		System.out.println(e3);
		
		Employee e4=(Employee)aplctx.getBean("emp4");
		System.out.println(e4);
		
		Employee e5=(Employee)aplctx.getBean("emp5");
		System.out.println(e5);
		
	}

}
