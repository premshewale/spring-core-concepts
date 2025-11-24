package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Developer;
import com.demo.bean.Employee;
import com.demo.bean.Manager;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Context loaded...");
		
		Employee e1=(Employee)aplctx.getBean("emp1");
		System.out.println(e1);
		
		Manager m1= (Manager)aplctx.getBean("mgr1");
		System.out.println(m1);
		
		Manager m2= (Manager)aplctx.getBean("mgr2");
		System.out.println(m2);
		
		Developer d1=(Developer)aplctx.getBean("dev1");
		System.out.println(d1);
		
	}

}
