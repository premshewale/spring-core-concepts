package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;

public class TestMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new ClassPathXmlApplicationContext("Spring4.xml");
		
		System.out.println("Context loaded...");
		
		Employee e1=(Employee)aplctx.getBean("emp4");
		System.out.println(e1);
		
		
		
	}

}
