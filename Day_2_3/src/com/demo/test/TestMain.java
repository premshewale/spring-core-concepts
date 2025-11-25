package com.demo.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Developer;
import com.demo.bean.Employee;
import com.demo.bean.Manager;
import com.demo.config.ApplConfig;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext aplctx = new AnnotationConfigApplicationContext(ApplConfig.class) ;
		
		System.out.println("Context loaded...");
		
//		Employee e1=aplctx.getBean(Employee.class);
//		e1.setEmpno(111);
//		e1.setName("AAA");
//		System.out.println(e1);
		
		Employee e2=(Employee) aplctx.getBean("emp1");
		System.out.println(e2);

		Employee e3=(Employee) aplctx.getBean("emp2");
		System.out.println(e3);
		
//		Manager m1= aplctx.getBean(Manager.class);
//		m1.setEmpno(222);
//		m1.setName("BBB");
//		m1.setIncentive(5000);
//		System.out.println(m1);
//		
//		Manager m2= aplctx.getBean(Manager.class);
//		m2.setEmpno(333);
//		m2.setName("CCC");
//		m2.setIncentive(6000);
//		System.out.println(m2);
		
//		Developer d1=aplctx.getBean(Developer.class);
//		d1.setEmpno(444);
//		d1.setName("DDD");
//		d1.setNumberOfProjects(10);
//		System.out.println(d1);
		
	}

}
