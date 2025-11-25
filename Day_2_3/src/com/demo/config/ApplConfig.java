package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.bean.Address;
import com.demo.bean.Employee;

@Configuration
@ComponentScan("com.demo")
public class ApplConfig {
	
	public ApplConfig() {

		System.out.println("Application Configuration Called..");
	}
	@Bean(name="emp2")
	public Employee getEmployee(){
		return new Employee(111, "ABC", new Address("Pune","411001"));
	}
	
}
